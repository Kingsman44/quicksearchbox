package p3186j$.time.format;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import p3186j$.time.C40966e;
import p3186j$.time.DateTimeException;
import p3186j$.time.ZoneId;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.temporal.C41017h;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.util.Objects;

/* renamed from: j$.time.format.DateTimeFormatter */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;

    /* renamed from: h */
    public static final DateTimeFormatter f107303h;

    /* renamed from: i */
    public static final DateTimeFormatter f107304i;

    /* renamed from: j */
    public static final DateTimeFormatter f107305j;

    /* renamed from: a */
    private final C40981f f107306a;

    /* renamed from: b */
    private final Locale f107307b;

    /* renamed from: c */
    private final C40970C f107308c;

    /* renamed from: d */
    private final C40972E f107309d;

    /* renamed from: e */
    private final Set f107310e;

    /* renamed from: f */
    private final C40961d f107311f;

    /* renamed from: g */
    private final ZoneId f107312g;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        C40973F f = C40973F.EXCEEDS_PAD;
        dateTimeFormatterBuilder.mo43280j(chronoField, 4, 10, f);
        dateTimeFormatterBuilder.mo43275e('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.mo43281l(chronoField2, 2);
        dateTimeFormatterBuilder.mo43275e('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        dateTimeFormatterBuilder.mo43281l(chronoField3, 2);
        C40972E e = C40972E.STRICT;
        C40963f fVar = C40963f.f107281a;
        DateTimeFormatter r = dateTimeFormatterBuilder.mo43289r(e, fVar);
        ISO_LOCAL_DATE = r;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder2.mo43283n();
        dateTimeFormatterBuilder2.mo43269a(r);
        dateTimeFormatterBuilder2.mo43278h();
        dateTimeFormatterBuilder2.mo43289r(e, fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.mo43283n();
        dateTimeFormatterBuilder3.mo43269a(r);
        DateTimeFormatterBuilder optionalStart = dateTimeFormatterBuilder3.optionalStart();
        optionalStart.mo43278h();
        optionalStart.mo43289r(e, fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.mo43281l(chronoField4, 2);
        dateTimeFormatterBuilder4.mo43275e(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.mo43281l(chronoField5, 2);
        DateTimeFormatterBuilder optionalStart2 = dateTimeFormatterBuilder4.optionalStart();
        optionalStart2.mo43275e(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        optionalStart2.mo43281l(chronoField6, 2);
        DateTimeFormatterBuilder optionalStart3 = optionalStart2.optionalStart();
        optionalStart3.mo43273b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter r2 = optionalStart3.mo43289r(e, (C40963f) null);
        f107303h = r2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.mo43283n();
        dateTimeFormatterBuilder5.mo43269a(r2);
        dateTimeFormatterBuilder5.mo43278h();
        dateTimeFormatterBuilder5.mo43289r(e, (C40963f) null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.mo43283n();
        dateTimeFormatterBuilder6.mo43269a(r2);
        DateTimeFormatterBuilder optionalStart4 = dateTimeFormatterBuilder6.optionalStart();
        optionalStart4.mo43278h();
        optionalStart4.mo43289r(e, (C40963f) null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.mo43283n();
        dateTimeFormatterBuilder7.mo43269a(r);
        dateTimeFormatterBuilder7.mo43275e('T');
        dateTimeFormatterBuilder7.mo43269a(r2);
        DateTimeFormatter r3 = dateTimeFormatterBuilder7.mo43289r(e, fVar);
        ISO_LOCAL_DATE_TIME = r3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.mo43283n();
        dateTimeFormatterBuilder8.mo43269a(r3);
        dateTimeFormatterBuilder8.mo43287p();
        dateTimeFormatterBuilder8.mo43278h();
        dateTimeFormatterBuilder8.mo43288q();
        DateTimeFormatter r4 = dateTimeFormatterBuilder8.mo43289r(e, fVar);
        f107304i = r4;
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.mo43269a(r4);
        DateTimeFormatterBuilder optionalStart5 = dateTimeFormatterBuilder9.optionalStart();
        optionalStart5.mo43275e('[');
        optionalStart5.mo43284o();
        optionalStart5.mo43282m();
        optionalStart5.mo43275e(']');
        optionalStart5.mo43289r(e, fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.mo43269a(r3);
        DateTimeFormatterBuilder optionalStart6 = dateTimeFormatterBuilder10.optionalStart();
        optionalStart6.mo43278h();
        DateTimeFormatterBuilder optionalStart7 = optionalStart6.optionalStart();
        optionalStart7.mo43275e('[');
        optionalStart7.mo43284o();
        optionalStart7.mo43282m();
        optionalStart7.mo43275e(']');
        optionalStart7.mo43289r(e, fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.mo43283n();
        dateTimeFormatterBuilder11.mo43280j(chronoField, 4, 10, f);
        dateTimeFormatterBuilder11.mo43275e('-');
        dateTimeFormatterBuilder11.mo43281l(ChronoField.DAY_OF_YEAR, 3);
        DateTimeFormatterBuilder optionalStart8 = dateTimeFormatterBuilder11.optionalStart();
        optionalStart8.mo43278h();
        optionalStart8.mo43289r(e, fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.mo43283n();
        dateTimeFormatterBuilder12.mo43280j(C41017h.f107441c, 4, 10, f);
        dateTimeFormatterBuilder12.mo43276f("-W");
        dateTimeFormatterBuilder12.mo43281l(C41017h.f107440b, 2);
        dateTimeFormatterBuilder12.mo43275e('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        dateTimeFormatterBuilder12.mo43281l(chronoField7, 1);
        DateTimeFormatterBuilder optionalStart9 = dateTimeFormatterBuilder12.optionalStart();
        optionalStart9.mo43278h();
        optionalStart9.mo43289r(e, fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.mo43283n();
        dateTimeFormatterBuilder13.mo43274c();
        f107305j = dateTimeFormatterBuilder13.mo43289r(e, (C40963f) null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.mo43283n();
        dateTimeFormatterBuilder14.mo43281l(chronoField, 4);
        dateTimeFormatterBuilder14.mo43281l(chronoField2, 2);
        dateTimeFormatterBuilder14.mo43281l(chronoField3, 2);
        DateTimeFormatterBuilder optionalStart10 = dateTimeFormatterBuilder14.optionalStart();
        optionalStart10.mo43287p();
        DateTimeFormatterBuilder appendOffset = optionalStart10.appendOffset("+HHMMss", "Z");
        appendOffset.mo43288q();
        appendOffset.mo43289r(e, fVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        C40963f fVar2 = fVar;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.mo43283n();
        dateTimeFormatterBuilder15.mo43287p();
        DateTimeFormatterBuilder optionalStart11 = dateTimeFormatterBuilder15.optionalStart();
        optionalStart11.mo43279i(chronoField7, hashMap);
        optionalStart11.mo43276f(", ");
        DateTimeFormatterBuilder optionalEnd = optionalStart11.optionalEnd();
        optionalEnd.mo43280j(chronoField3, 1, 2, C40973F.NOT_NEGATIVE);
        optionalEnd.mo43275e(' ');
        optionalEnd.mo43279i(chronoField2, hashMap2);
        optionalEnd.mo43275e(' ');
        optionalEnd.mo43281l(chronoField, 4);
        optionalEnd.mo43275e(' ');
        optionalEnd.mo43281l(chronoField4, 2);
        optionalEnd.mo43275e(':');
        optionalEnd.mo43281l(chronoField5, 2);
        DateTimeFormatterBuilder optionalStart12 = optionalEnd.optionalStart();
        optionalStart12.mo43275e(':');
        optionalStart12.mo43281l(chronoField6, 2);
        DateTimeFormatterBuilder optionalEnd2 = optionalStart12.optionalEnd();
        optionalEnd2.mo43275e(' ');
        RFC_1123_DATE_TIME = optionalEnd2.appendOffset("+HHMM", "GMT").mo43289r(C40972E.SMART, fVar2);
    }

    DateTimeFormatter(C40981f fVar, Locale locale, C40970C c, C40972E e, Set set, C40961d dVar, ZoneId zoneId) {
        this.f107306a = (C40981f) Objects.requireNonNull(fVar, "printerParser");
        this.f107310e = set;
        this.f107307b = (Locale) Objects.requireNonNull(locale, "locale");
        this.f107308c = (C40970C) Objects.requireNonNull(c, "decimalStyle");
        this.f107309d = (C40972E) Objects.requireNonNull(e, "resolverStyle");
        this.f107311f = dVar;
        this.f107312g = zoneId;
    }

    /* renamed from: a */
    private static DateTimeParseException m71352a(CharSequence charSequence, RuntimeException runtimeException) {
        String str;
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        return new DateTimeParseException("Text '" + str + "' could not be parsed: " + runtimeException.getMessage(), charSequence, runtimeException);
    }

    /* renamed from: g */
    private TemporalAccessor m71353g(CharSequence charSequence) {
        String str;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(parsePosition, "position");
        C40999x xVar = new C40999x(this);
        int d = this.f107306a.mo43295d(xVar, charSequence, parsePosition.getIndex());
        if (d < 0) {
            parsePosition.setErrorIndex(d ^ -1);
            xVar = null;
        } else {
            parsePosition.setIndex(d);
        }
        if (xVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            return xVar.mo43336t(this.f107309d, this.f107310e);
        }
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str2 = "Text '" + str + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        String str3 = "Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str3, charSequence);
    }

    public static DateTimeFormatter ofLocalizedTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "timeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.mo43277g(formatStyle);
        return dateTimeFormatterBuilder.mo43289r(C40972E.SMART, C40963f.f107281a);
    }

    public static DateTimeFormatter ofPattern(String str) {
        return new DateTimeFormatterBuilder().appendPattern(str).toFormatter();
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        return new DateTimeFormatterBuilder().appendPattern(str).toFormatter(locale);
    }

    /* renamed from: b */
    public final C40961d mo43258b() {
        return this.f107311f;
    }

    /* renamed from: c */
    public final C40970C mo43259c() {
        return this.f107308c;
    }

    /* renamed from: d */
    public final Locale mo43260d() {
        return this.f107307b;
    }

    /* renamed from: e */
    public final ZoneId mo43261e() {
        return this.f107312g;
    }

    /* renamed from: f */
    public final Object mo43262f(CharSequence charSequence, C40966e eVar) {
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(eVar, "query");
        try {
            return ((C40971D) m71353g(charSequence)).mo43002l(eVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw m71352a(charSequence, e2);
        }
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        Objects.requireNonNull(sb, "appendable");
        try {
            this.f107306a.mo43294b(new C41001z(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C40981f mo43264h(boolean z) {
        return this.f107306a.mo43297a(z);
    }

    public TemporalAccessor parse(CharSequence charSequence) {
        Objects.requireNonNull(charSequence, "text");
        try {
            return m71353g(charSequence);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw m71352a(charSequence, e2);
        }
    }

    public final String toString() {
        String fVar = this.f107306a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (this.f107307b.equals(locale)) {
            return this;
        }
        return new DateTimeFormatter(this.f107306a, locale, this.f107308c, this.f107309d, this.f107310e, this.f107311f, this.f107312g);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        return Objects.equals(this.f107312g, zoneId) ? this : new DateTimeFormatter(this.f107306a, this.f107307b, this.f107308c, this.f107309d, this.f107310e, this.f107311f, zoneId);
    }
}
