package p3186j$.time.temporal;

/* renamed from: j$.time.temporal.ChronoField */
public enum ChronoField implements TemporalField {
    NANO_OF_SECOND("NanoOfSecond", r12, r21, ValueRange.m71512h(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r12, r3, ValueRange.m71512h(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r26, r18, ValueRange.m71512h(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r26, r27, ValueRange.m71512h(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r26, r18, ValueRange.m71512h(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r26, r27, ValueRange.m71512h(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r17, r12, ValueRange.m71512h(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", r17, r3, ValueRange.m71512h(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r26, r30, ValueRange.m71512h(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", r26, r27, ValueRange.m71512h(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r17, r18, ValueRange.m71512h(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r17, r18, ValueRange.m71512h(1, 12)),
    HOUR_OF_DAY("HourOfDay", r26, r27, ValueRange.m71512h(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r26, r27, ValueRange.m71512h(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r31, r27, ValueRange.m71512h(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", r26, r27, ValueRange.m71512h(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r26, r27, ValueRange.m71512h(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r26, r27, ValueRange.m71512h(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r26, r14, ValueRange.m71514j(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", r26, r2, ValueRange.m71514j(365, 366)),
    EPOCH_DAY("EpochDay", r26, r6, ValueRange.m71512h(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r40, r14, ValueRange.m71514j(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r40, r2, ValueRange.m71512h(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r14, r2, ValueRange.m71512h(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", r14, r41, ValueRange.m71512h(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r2, r41, ValueRange.m71514j(999999999, 1000000000)),
    YEAR("Year", r2, r50, ValueRange.m71512h(-999999999, 999999999), 0),
    ERA("Era", ChronoUnit.ERAS, r50, ValueRange.m71512h(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", r17, r18, ValueRange.m71512h(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r17, r18, ValueRange.m71512h(-64800, 64800));
    

    /* renamed from: a */
    private final String f107414a;

    /* renamed from: b */
    private final TemporalUnit f107415b;

    /* renamed from: c */
    private final TemporalUnit f107416c;

    /* renamed from: d */
    private final ValueRange f107417d;

    private ChronoField(String str, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, ValueRange valueRange) {
        this.f107414a = str;
        this.f107415b = chronoUnit;
        this.f107416c = chronoUnit2;
        this.f107417d = valueRange;
    }

    private ChronoField(String str, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, ValueRange valueRange, int i) {
        this.f107414a = str;
        this.f107415b = chronoUnit;
        this.f107416c = chronoUnit2;
        this.f107417d = valueRange;
    }

    /* renamed from: b */
    public final boolean mo43347b(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo42996a(this);
    }

    /* renamed from: d */
    public final ValueRange mo43348d(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo42997e(this);
    }

    /* renamed from: g */
    public final long mo43350g(TemporalAccessor temporalAccessor) {
        return temporalAccessor.getLong(this);
    }

    /* renamed from: h */
    public final Temporal mo43351h(Temporal temporal, long j) {
        return temporal.mo43043b(this, j);
    }

    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    /* renamed from: k */
    public final int mo43354k(long j) {
        return range().mo43365a(this, j);
    }

    /* renamed from: l */
    public final void mo43355l(long j) {
        range().mo43366b(this, j);
    }

    public ValueRange range() {
        return this.f107417d;
    }

    public final String toString() {
        return this.f107414a;
    }
}
