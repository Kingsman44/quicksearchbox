package p3186j$.time.temporal;

import java.util.HashMap;
import p3186j$.desugar.sun.nio.p3187fs.C40947a;
import p3186j$.time.DateTimeException;
import p3186j$.time.LocalDate;
import p3186j$.time.chrono.C40959b;
import p3186j$.time.chrono.C40961d;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.chrono.ChronoLocalDate;
import p3186j$.time.format.C40972E;

/* renamed from: j$.time.temporal.p */
final class C41025p implements TemporalField {

    /* renamed from: f */
    private static final ValueRange f107460f = ValueRange.m71512h(1, 7);

    /* renamed from: g */
    private static final ValueRange f107461g = ValueRange.m71513i(0, 4, 6);

    /* renamed from: h */
    private static final ValueRange f107462h = ValueRange.m71513i(0, 52, 54);

    /* renamed from: i */
    private static final ValueRange f107463i = ValueRange.m71514j(52, 53);

    /* renamed from: a */
    private final String f107464a;

    /* renamed from: b */
    private final WeekFields f107465b;

    /* renamed from: c */
    private final TemporalUnit f107466c;

    /* renamed from: d */
    private final TemporalUnit f107467d;

    /* renamed from: e */
    private final ValueRange f107468e;

    private C41025p(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, ValueRange valueRange) {
        this.f107464a = str;
        this.f107465b = weekFields;
        this.f107466c = temporalUnit;
        this.f107467d = temporalUnit2;
        this.f107468e = valueRange;
    }

    /* renamed from: a */
    private static int m71575a(int i, int i2) {
        return ((i2 - 1) + (i + 7)) / 7;
    }

    /* renamed from: c */
    private int m71576c(TemporalAccessor temporalAccessor) {
        return C40947a.m71100d(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.f107465b.mo43375d().getValue(), 7) + 1;
    }

    /* renamed from: f */
    private int m71577f(TemporalAccessor temporalAccessor) {
        int c = m71576c(temporalAccessor);
        int i = temporalAccessor.get(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i2 = temporalAccessor.get(chronoField);
        int s = m71588s(i2, c);
        int a = m71575a(s, i2);
        if (a == 0) {
            return i - 1;
        }
        return a >= m71575a(s, this.f107465b.mo43377e() + ((int) temporalAccessor.mo42997e(chronoField).mo43367d())) ? i + 1 : i;
    }

    /* renamed from: i */
    private long m71578i(TemporalAccessor temporalAccessor) {
        int c = m71576c(temporalAccessor);
        int i = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
        return (long) m71575a(m71588s(i, c), i);
    }

    /* renamed from: j */
    private int m71579j(TemporalAccessor temporalAccessor) {
        int c = m71576c(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i = temporalAccessor.get(chronoField);
        int s = m71588s(i, c);
        int a = m71575a(s, i);
        if (a == 0) {
            ((C40963f) C40959b.m71322b(temporalAccessor)).getClass();
            return m71579j(LocalDate.m71156o(temporalAccessor).mo43054k((long) i, ChronoUnit.DAYS));
        } else if (a <= 50) {
            return a;
        } else {
            int a2 = m71575a(s, this.f107465b.mo43377e() + ((int) temporalAccessor.mo42997e(chronoField).mo43367d()));
            if (a >= a2) {
                return (a - a2) + 1;
            }
            return a;
        }
    }

    /* renamed from: k */
    private long m71580k(TemporalAccessor temporalAccessor) {
        int c = m71576c(temporalAccessor);
        int i = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
        return (long) m71575a(m71588s(i, c), i);
    }

    /* renamed from: l */
    static C41025p m71581l(WeekFields weekFields) {
        return new C41025p("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, f107460f);
    }

    /* renamed from: m */
    private ChronoLocalDate m71582m(C40961d dVar, int i, int i2, int i3) {
        int i4;
        ((C40963f) dVar).getClass();
        LocalDate of = LocalDate.m71157of(i, 1, 1);
        int s = m71588s(1, m71576c(of));
        if (of.isLeapYear()) {
            i4 = 366;
        } else {
            i4 = 365;
        }
        int i5 = i3 - 1;
        return of.mo43048g((long) (((Math.min(i2, m71575a(s, this.f107465b.mo43377e() + i4) - 1) - 1) * 7) + i5 + (-s)), ChronoUnit.DAYS);
    }

    /* renamed from: n */
    static C41025p m71583n(WeekFields weekFields) {
        return new C41025p("WeekBasedYear", weekFields, C41017h.f107442d, ChronoUnit.FOREVER, ChronoField.YEAR.range());
    }

    /* renamed from: o */
    static C41025p m71584o(WeekFields weekFields) {
        return new C41025p("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f107461g);
    }

    /* renamed from: p */
    static C41025p m71585p(WeekFields weekFields) {
        return new C41025p("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, C41017h.f107442d, f107463i);
    }

    /* renamed from: q */
    private ValueRange m71586q(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int s = m71588s(temporalAccessor.get(chronoField), m71576c(temporalAccessor));
        ValueRange e = temporalAccessor.mo42997e(chronoField);
        return ValueRange.m71512h((long) m71575a(s, (int) e.getMinimum()), (long) m71575a(s, (int) e.mo43367d()));
    }

    /* renamed from: r */
    private ValueRange m71587r(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.mo42996a(chronoField)) {
            return f107462h;
        }
        int c = m71576c(temporalAccessor);
        int i = temporalAccessor.get(chronoField);
        int s = m71588s(i, c);
        int a = m71575a(s, i);
        if (a == 0) {
            ((C40963f) C40959b.m71322b(temporalAccessor)).getClass();
            return m71587r(LocalDate.m71156o(temporalAccessor).mo43054k((long) (i + 7), ChronoUnit.DAYS));
        }
        int d = (int) temporalAccessor.mo42997e(chronoField).mo43367d();
        int a2 = m71575a(s, this.f107465b.mo43377e() + d);
        if (a < a2) {
            return ValueRange.m71512h(1, (long) (a2 - 1));
        }
        ((C40963f) C40959b.m71322b(temporalAccessor)).getClass();
        return m71587r(LocalDate.m71156o(temporalAccessor).mo43048g((long) ((d - i) + 1 + 7), ChronoUnit.DAYS));
    }

    /* renamed from: s */
    private int m71588s(int i, int i2) {
        int d = C40947a.m71100d(i - i2, 7);
        return d + 1 > this.f107465b.mo43377e() ? 7 - d : -d;
    }

    /* renamed from: b */
    public final boolean mo43347b(TemporalAccessor temporalAccessor) {
        ChronoField chronoField;
        if (!temporalAccessor.mo42996a(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f107467d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            chronoField = ChronoField.DAY_OF_MONTH;
        } else if (temporalUnit == ChronoUnit.YEARS || temporalUnit == WeekFields.f107426h) {
            chronoField = ChronoField.DAY_OF_YEAR;
        } else if (temporalUnit != ChronoUnit.FOREVER) {
            return false;
        } else {
            chronoField = ChronoField.YEAR;
        }
        return temporalAccessor.mo42996a(chronoField);
    }

    /* renamed from: d */
    public final ValueRange mo43348d(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f107467d;
        if (temporalUnit == chronoUnit) {
            return this.f107468e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return m71586q(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return m71586q(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f107426h) {
            return m71587r(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.range();
        }
        String valueOf = String.valueOf(temporalUnit);
        String valueOf2 = String.valueOf(this);
        throw new IllegalStateException("unreachable, rangeUnit: " + valueOf + ", this: " + valueOf2);
    }

    /* renamed from: e */
    public final TemporalAccessor mo43349e(HashMap hashMap, TemporalAccessor temporalAccessor, C40972E e) {
        ChronoLocalDate chronoLocalDate;
        LocalDate localDate;
        ChronoField chronoField;
        LocalDate localDate2;
        HashMap hashMap2 = hashMap;
        C40972E e2 = e;
        long longValue = ((Long) hashMap2.get(this)).longValue();
        long j = (long) ((int) longValue);
        if (longValue == j) {
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            ValueRange valueRange = this.f107468e;
            WeekFields weekFields = this.f107465b;
            TemporalUnit temporalUnit = this.f107467d;
            if (temporalUnit == chronoUnit) {
                hashMap2.remove(this);
                hashMap2.put(ChronoField.DAY_OF_WEEK, Long.valueOf((long) (C40947a.m71100d((valueRange.mo43365a(this, longValue) - 1) + (weekFields.mo43375d().getValue() - 1), 7) + 1)));
            } else {
                ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
                if (hashMap2.containsKey(chronoField2)) {
                    int d = C40947a.m71100d(chronoField2.mo43354k(((Long) hashMap2.get(chronoField2)).longValue()) - weekFields.mo43375d().getValue(), 7) + 1;
                    C40961d b = C40959b.m71322b(temporalAccessor);
                    ChronoField chronoField3 = ChronoField.YEAR;
                    if (hashMap2.containsKey(chronoField3)) {
                        int k = chronoField3.mo43354k(((Long) hashMap2.get(chronoField3)).longValue());
                        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
                        if (temporalUnit == chronoUnit2) {
                            ChronoField chronoField4 = ChronoField.MONTH_OF_YEAR;
                            if (hashMap2.containsKey(chronoField4)) {
                                long longValue2 = ((Long) hashMap2.get(chronoField4)).longValue();
                                if (e2 == C40972E.LENIENT) {
                                    ((C40963f) b).getClass();
                                    chronoField = chronoField3;
                                    LocalDate v = LocalDate.m71157of(k, 1, 1).mo43048g(C40947a.m71107k(longValue2, 1), chronoUnit2);
                                    localDate2 = v.mo43048g(C40947a.m71106j(C40947a.m71104h(C40947a.m71107k(j, m71578i(v)), (long) 7), (long) (d - m71576c(v))), ChronoUnit.DAYS);
                                } else {
                                    chronoField = chronoField3;
                                    int k2 = chronoField4.mo43354k(longValue2);
                                    ((C40963f) b).getClass();
                                    LocalDate of = LocalDate.m71157of(k, k2, 1);
                                    LocalDate v2 = of.mo43048g((long) ((((int) (((long) valueRange.mo43365a(this, j)) - m71578i(of))) * 7) + (d - m71576c(of))), ChronoUnit.DAYS);
                                    if (e2 != C40972E.STRICT || v2.getLong(chronoField4) == longValue2) {
                                        localDate2 = v2;
                                    } else {
                                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                                    }
                                }
                                hashMap2.remove(this);
                                hashMap2.remove(chronoField);
                                hashMap2.remove(chronoField4);
                                hashMap2.remove(chronoField2);
                                return localDate2;
                            }
                        }
                        ChronoField chronoField5 = chronoField3;
                        if (temporalUnit == ChronoUnit.YEARS) {
                            ((C40963f) b).getClass();
                            LocalDate of2 = LocalDate.m71157of(k, 1, 1);
                            if (e2 == C40972E.LENIENT) {
                                localDate = of2.mo43048g(C40947a.m71106j(C40947a.m71104h(C40947a.m71107k(j, m71580k(of2)), (long) 7), (long) (d - m71576c(of2))), ChronoUnit.DAYS);
                            } else {
                                LocalDate v3 = of2.mo43048g((long) ((((int) (((long) valueRange.mo43365a(this, j)) - m71580k(of2))) * 7) + (d - m71576c(of2))), ChronoUnit.DAYS);
                                if (e2 != C40972E.STRICT || v3.getLong(chronoField5) == ((long) k)) {
                                    localDate = v3;
                                } else {
                                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                                }
                            }
                            hashMap2.remove(this);
                            hashMap2.remove(chronoField5);
                            hashMap2.remove(chronoField2);
                            return localDate;
                        }
                    } else if ((temporalUnit == WeekFields.f107426h || temporalUnit == ChronoUnit.FOREVER) && hashMap2.containsKey(weekFields.f107432f) && hashMap2.containsKey(weekFields.f107431e)) {
                        int a = ((C41025p) weekFields.f107432f).f107468e.mo43365a(weekFields.f107432f, ((Long) hashMap2.get(weekFields.f107432f)).longValue());
                        if (e2 == C40972E.LENIENT) {
                            chronoLocalDate = ((LocalDate) m71582m(b, a, 1, d)).mo43048g(C40947a.m71107k(((Long) hashMap2.get(weekFields.f107431e)).longValue(), 1), chronoUnit);
                        } else {
                            ChronoLocalDate m = m71582m(b, a, ((C41025p) weekFields.f107431e).f107468e.mo43365a(weekFields.f107431e, ((Long) hashMap2.get(weekFields.f107431e)).longValue()), d);
                            if (e2 != C40972E.STRICT || m71577f(m) == a) {
                                chronoLocalDate = m;
                            } else {
                                throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                            }
                        }
                        hashMap2.remove(this);
                        hashMap2.remove(weekFields.f107432f);
                        hashMap2.remove(weekFields.f107431e);
                        hashMap2.remove(chronoField2);
                        return chronoLocalDate;
                    }
                }
            }
            return null;
        }
        throw new ArithmeticException();
    }

    /* renamed from: g */
    public final long mo43350g(TemporalAccessor temporalAccessor) {
        int f;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f107467d;
        if (temporalUnit == chronoUnit) {
            f = m71576c(temporalAccessor);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            return m71578i(temporalAccessor);
        } else {
            if (temporalUnit == ChronoUnit.YEARS) {
                return m71580k(temporalAccessor);
            }
            if (temporalUnit == WeekFields.f107426h) {
                f = m71579j(temporalAccessor);
            } else if (temporalUnit == ChronoUnit.FOREVER) {
                f = m71577f(temporalAccessor);
            } else {
                String valueOf = String.valueOf(temporalUnit);
                String valueOf2 = String.valueOf(this);
                throw new IllegalStateException("unreachable, rangeUnit: " + valueOf + ", this: " + valueOf2);
            }
        }
        return (long) f;
    }

    /* renamed from: h */
    public final Temporal mo43351h(Temporal temporal, long j) {
        int a = this.f107468e.mo43365a(this, j);
        int i = temporal.get(this);
        if (a == i) {
            return temporal;
        }
        if (this.f107467d != ChronoUnit.FOREVER) {
            return temporal.mo43048g((long) (a - i), this.f107466c);
        }
        WeekFields weekFields = this.f107465b;
        int i2 = temporal.get(weekFields.f107429c);
        return m71582m(C40959b.m71322b(temporal), (int) j, temporal.get(weekFields.f107431e), i2);
    }

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }

    public final ValueRange range() {
        return this.f107468e;
    }

    public final String toString() {
        String weekFields = this.f107465b.toString();
        return this.f107464a + "[" + weekFields + "]";
    }
}
