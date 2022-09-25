package p3186j$.time.temporal;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import p3186j$.time.DayOfWeek;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.temporal.WeekFields */
public final class WeekFields implements Serializable {

    /* renamed from: g */
    private static final ConcurrentHashMap f107425g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h */
    public static final TemporalUnit f107426h = C41017h.f107442d;

    /* renamed from: a */
    private final DayOfWeek f107427a;

    /* renamed from: b */
    private final int f107428b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final transient TemporalField f107429c = C41025p.m71581l(this);

    /* renamed from: d */
    private final transient TemporalField f107430d = C41025p.m71584o(this);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final transient TemporalField f107431e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient TemporalField f107432f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        m71524f(DayOfWeek.SUNDAY, 1);
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.f107431e = C41025p.m71585p(this);
        this.f107432f = C41025p.m71583n(this);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f107427a = dayOfWeek;
        this.f107428b = i;
    }

    /* renamed from: f */
    public static WeekFields m71524f(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentHashMap concurrentHashMap = f107425g;
        WeekFields weekFields = (WeekFields) concurrentHashMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentHashMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentHashMap.get(str);
    }

    /* renamed from: of */
    public static WeekFields m71525of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Calendar instance = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        return m71524f(DayOfWeek.SUNDAY.mo43003m((long) (instance.getFirstDayOfWeek() - 1)), instance.getMinimalDaysInFirstWeek());
    }

    /* renamed from: d */
    public final DayOfWeek mo43375d() {
        return this.f107427a;
    }

    public TemporalField dayOfWeek() {
        return this.f107429c;
    }

    /* renamed from: e */
    public final int mo43377e() {
        return this.f107428b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    /* renamed from: g */
    public final TemporalField mo43379g() {
        return this.f107432f;
    }

    /* renamed from: h */
    public final TemporalField mo43380h() {
        return this.f107430d;
    }

    public final int hashCode() {
        return (this.f107427a.ordinal() * 7) + this.f107428b;
    }

    /* renamed from: i */
    public final TemporalField mo43382i() {
        return this.f107431e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f107427a);
        return "WeekFields[" + valueOf + "," + this.f107428b + "]";
    }
}
