package com.heimdallauth.server.authguard.utils.tz;

import java.time.*;

public class TimezoneUtils {

    /**
     * Converts an Instant to a LocalDateTime in the specified timezone.
     *
     * @param instant the Instant to convert
     * @param zoneId the target timezone
     * @return the LocalDateTime in the specified timezone
     */
    public static LocalDateTime convertInstantToUserTimezone(Instant instant, ZoneId zoneId) {
        if (instant == null || zoneId == null) {
            throw new IllegalArgumentException("Instant and ZoneId must not be null");
        }
        return LocalDateTime.ofInstant(instant, zoneId);
    }

    /**
     * Converts a LocalDateTime from one timezone to another.
     *
     * @param localDateTime the LocalDateTime to convert
     * @param fromZoneId the original timezone
     * @param toZoneId the target timezone
     * @return the LocalDateTime in the target timezone
     */
    public static LocalDateTime convertBetweenTimezones(LocalDateTime localDateTime, ZoneId fromZoneId, ZoneId toZoneId) {
        if (localDateTime == null || fromZoneId == null || toZoneId == null) {
            throw new IllegalArgumentException("LocalDateTime and ZoneIds must not be null");
        }
        ZonedDateTime zonedDateTime = localDateTime.atZone(fromZoneId);
        ZonedDateTime convertedZonedDateTime = zonedDateTime.withZoneSameInstant(toZoneId);
        return convertedZonedDateTime.toLocalDateTime();
    }

    /**
     * Gets the current time in the specified timezone.
     *
     * @param zoneId the target timezone
     * @return the current LocalDateTime in the specified timezone
     */
    public static LocalDateTime getCurrentTimeInTimezone(ZoneId zoneId) {
        if (zoneId == null) {
            throw new IllegalArgumentException("ZoneId must not be null");
        }
        return LocalDateTime.now(zoneId);
    }
    public static ZoneId getZoneIdFromOffset(String offset) {
        if (offset == null || offset.isEmpty()) {
            throw new IllegalArgumentException("Offset must not be null or empty");
        }
        ZoneOffset zoneOffset = ZoneOffset.of(offset);
        return ZoneId.ofOffset("UTC", zoneOffset);
    }
}