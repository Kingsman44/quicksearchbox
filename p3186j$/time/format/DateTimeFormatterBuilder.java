package p3186j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import p3186j$.time.ZoneId;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.temporal.C41017h;
import p3186j$.time.temporal.C41019j;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalField;
import p3186j$.util.Objects;

/* renamed from: j$.time.format.DateTimeFormatterBuilder */
public final class DateTimeFormatterBuilder {

    /* renamed from: h */
    private static final C40976a f107313h = new C40976a();

    /* renamed from: i */
    private static final HashMap f107314i;

    /* renamed from: j */
    public static final /* synthetic */ int f107315j = 0;

    /* renamed from: a */
    private DateTimeFormatterBuilder f107316a;

    /* renamed from: b */
    private final DateTimeFormatterBuilder f107317b;

    /* renamed from: c */
    private final ArrayList f107318c;

    /* renamed from: d */
    private final boolean f107319d;

    /* renamed from: e */
    private int f107320e;

    /* renamed from: f */
    private char f107321f;

    /* renamed from: g */
    private int f107322g;

    static {
        HashMap hashMap = new HashMap();
        f107314i = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        TemporalField temporalField = C41017h.f107439a;
        hashMap.put('Q', temporalField);
        hashMap.put('q', temporalField);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
        hashMap.put('g', C41019j.f107449a);
    }

    public DateTimeFormatterBuilder() {
        this.f107316a = this;
        this.f107318c = new ArrayList();
        this.f107322g = -1;
        this.f107317b = null;
        this.f107319d = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f107316a = this;
        this.f107318c = new ArrayList();
        this.f107322g = -1;
        this.f107317b = dateTimeFormatterBuilder;
        this.f107319d = true;
    }

    /* renamed from: d */
    private int m71360d(C40982g gVar) {
        Objects.requireNonNull(gVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f107316a;
        int i = dateTimeFormatterBuilder.f107320e;
        if (i > 0) {
            if (gVar != null) {
                gVar = new C40989n(gVar, i, dateTimeFormatterBuilder.f107321f);
            }
            dateTimeFormatterBuilder.f107320e = 0;
            dateTimeFormatterBuilder.f107321f = 0;
        }
        dateTimeFormatterBuilder.f107318c.add(gVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f107316a;
        dateTimeFormatterBuilder2.f107322g = -1;
        return dateTimeFormatterBuilder2.f107318c.size() - 1;
    }

    /* renamed from: k */
    private void m71361k(C40987l lVar) {
        C40987l lVar2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f107316a;
        int i = dateTimeFormatterBuilder.f107322g;
        if (i >= 0) {
            C40987l lVar3 = (C40987l) dateTimeFormatterBuilder.f107318c.get(i);
            int i2 = lVar.f107348b;
            int i3 = lVar.f107349c;
            if (i2 == i3 && lVar.f107350d == C40973F.NOT_NEGATIVE) {
                lVar2 = lVar3.mo43301h(i3);
                m71360d(lVar.mo43300g());
                this.f107316a.f107322g = i;
            } else {
                lVar2 = lVar3.mo43300g();
                this.f107316a.f107322g = m71360d(lVar);
            }
            this.f107316a.f107318c.set(i, lVar2);
            return;
        }
        dateTimeFormatterBuilder.f107322g = m71360d(lVar);
    }

    /* renamed from: s */
    private DateTimeFormatter m71362s(Locale locale, C40972E e, C40963f fVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f107316a.f107317b != null) {
            optionalEnd();
        }
        return new DateTimeFormatter(new C40981f(this.f107318c, false), locale, C40970C.f107295a, e, (Set) null, fVar, (ZoneId) null);
    }

    /* renamed from: a */
    public final void mo43269a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        m71360d(dateTimeFormatter.mo43264h(false));
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        m71360d(new C40988m(str, str2));
        return this;
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        m71360d(dateTimeFormatter.mo43264h(true));
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e9, code lost:
        if (r3 == 1) goto L_0x020f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x02e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0417 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p3186j$.time.format.DateTimeFormatterBuilder appendPattern(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "pattern"
            p3186j$.util.Objects.requireNonNull(r1, r2)
            r2 = 0
            r3 = 0
        L_0x000b:
            int r4 = r17.length()
            if (r3 >= r4) goto L_0x046c
            char r4 = r1.charAt(r3)
            r5 = 90
            r6 = 1
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 97
            r9 = 65
            if (r4 < r9) goto L_0x0022
            if (r4 <= r5) goto L_0x0026
        L_0x0022:
            if (r4 < r8) goto L_0x03d2
            if (r4 > r7) goto L_0x03d2
        L_0x0026:
            int r10 = r3 + 1
        L_0x0028:
            int r11 = r17.length()
            if (r10 >= r11) goto L_0x0037
            char r11 = r1.charAt(r10)
            if (r11 != r4) goto L_0x0037
            int r10 = r10 + 1
            goto L_0x0028
        L_0x0037:
            int r3 = r10 - r3
            r11 = 112(0x70, float:1.57E-43)
            r12 = -1
            if (r4 != r11) goto L_0x009a
            int r11 = r17.length()
            if (r10 >= r11) goto L_0x0064
            char r4 = r1.charAt(r10)
            if (r4 < r9) goto L_0x004c
            if (r4 <= r5) goto L_0x0050
        L_0x004c:
            if (r4 < r8) goto L_0x0064
            if (r4 > r7) goto L_0x0064
        L_0x0050:
            int r11 = r10 + 1
        L_0x0052:
            int r13 = r17.length()
            if (r11 >= r13) goto L_0x0061
            char r13 = r1.charAt(r11)
            if (r13 != r4) goto L_0x0061
            int r11 = r11 + 1
            goto L_0x0052
        L_0x0061:
            int r10 = r11 - r10
            goto L_0x0067
        L_0x0064:
            r11 = r10
            r10 = r3
            r3 = 0
        L_0x0067:
            if (r3 == 0) goto L_0x008c
            if (r3 < r6) goto L_0x0078
            j$.time.format.DateTimeFormatterBuilder r13 = r0.f107316a
            r13.f107320e = r3
            r3 = 32
            r13.f107321f = r3
            r13.f107322g = r12
            r3 = r10
            r10 = r11
            goto L_0x009a
        L_0x0078:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "The pad width must be at least one but was "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x008c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r3 = "Pad letter 'p' must be followed by valid pad pattern: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x009a:
            java.util.HashMap r11 = f107314i
            java.lang.Character r13 = java.lang.Character.valueOf(r4)
            java.lang.Object r11 = r11.get(r13)
            j$.time.temporal.TemporalField r11 = (p3186j$.time.temporal.TemporalField) r11
            r14 = 2
            r15 = 5
            java.lang.String r12 = "Too many pattern letters: "
            r5 = 4
            if (r11 == 0) goto L_0x022d
            if (r4 == r9) goto L_0x0223
            java.lang.String r7 = "field"
            r9 = 81
            r13 = 3
            if (r4 == r9) goto L_0x01b3
            r9 = 83
            if (r4 == r9) goto L_0x01ac
            if (r4 == r8) goto L_0x0197
            r8 = 107(0x6b, float:1.5E-43)
            if (r4 == r8) goto L_0x017a
            r8 = 113(0x71, float:1.58E-43)
            if (r4 == r8) goto L_0x0178
            r8 = 115(0x73, float:1.61E-43)
            if (r4 == r8) goto L_0x017a
            r8 = 117(0x75, float:1.64E-43)
            if (r4 == r8) goto L_0x0157
            r8 = 121(0x79, float:1.7E-43)
            if (r4 == r8) goto L_0x0157
            r8 = 103(0x67, float:1.44E-43)
            if (r4 == r8) goto L_0x016f
            r8 = 104(0x68, float:1.46E-43)
            if (r4 == r8) goto L_0x017a
            r8 = 109(0x6d, float:1.53E-43)
            if (r4 == r8) goto L_0x017a
            r8 = 110(0x6e, float:1.54E-43)
            if (r4 == r8) goto L_0x0223
            switch(r4) {
                case 68: goto L_0x0121;
                case 69: goto L_0x01b3;
                case 70: goto L_0x010b;
                case 71: goto L_0x00ed;
                case 72: goto L_0x017a;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            switch(r4) {
                case 75: goto L_0x017a;
                case 76: goto L_0x0178;
                case 77: goto L_0x01b3;
                case 78: goto L_0x0223;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            switch(r4) {
                case 99: goto L_0x0143;
                case 100: goto L_0x017a;
                case 101: goto L_0x01b3;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            if (r3 != r6) goto L_0x0180
            goto L_0x020f
        L_0x00ed:
            if (r3 == r6) goto L_0x01f6
            if (r3 == r14) goto L_0x01f6
            if (r3 == r13) goto L_0x01f6
            if (r3 == r5) goto L_0x01dd
            if (r3 != r15) goto L_0x00f9
            goto L_0x01c3
        L_0x00f9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x010b:
            if (r3 != r6) goto L_0x010f
            goto L_0x020f
        L_0x010f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0121:
            if (r3 != r6) goto L_0x0125
            goto L_0x020f
        L_0x0125:
            if (r3 == r14) goto L_0x013c
            if (r3 != r13) goto L_0x012a
            goto L_0x013c
        L_0x012a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x013c:
            j$.time.format.F r4 = p3186j$.time.format.C40973F.NOT_NEGATIVE
            r0.mo43280j(r11, r3, r13, r4)
            goto L_0x022a
        L_0x0143:
            if (r3 != r6) goto L_0x014c
            j$.time.format.u r5 = new j$.time.format.u
            r5.<init>(r4, r3, r3, r3)
            goto L_0x01ee
        L_0x014c:
            if (r3 == r14) goto L_0x014f
            goto L_0x0178
        L_0x014f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid pattern \"cc\""
            r1.<init>(r2)
            throw r1
        L_0x0157:
            if (r3 != r14) goto L_0x016d
            j$.time.LocalDate r3 = p3186j$.time.format.C40993r.f107371i
            p3186j$.util.Objects.requireNonNull(r11, r7)
            java.lang.String r4 = "baseDate"
            p3186j$.util.Objects.requireNonNull(r3, r4)
            j$.time.format.r r4 = new j$.time.format.r
            r4.<init>(r11, r3)
            r0.m71361k(r4)
            goto L_0x022a
        L_0x016d:
            if (r3 >= r5) goto L_0x0175
        L_0x016f:
            j$.time.format.F r4 = p3186j$.time.format.C40973F.NORMAL
        L_0x0171:
            r5 = 19
            goto L_0x0227
        L_0x0175:
            j$.time.format.F r4 = p3186j$.time.format.C40973F.EXCEEDS_PAD
            goto L_0x0171
        L_0x0178:
            r8 = 1
            goto L_0x01b4
        L_0x017a:
            if (r3 != r6) goto L_0x017e
            goto L_0x020f
        L_0x017e:
            if (r3 != r14) goto L_0x0185
        L_0x0180:
            r0.mo43281l(r11, r3)
            goto L_0x022a
        L_0x0185:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0197:
            if (r3 != r6) goto L_0x019a
            goto L_0x01f6
        L_0x019a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ac:
            j$.time.temporal.ChronoField r4 = p3186j$.time.temporal.ChronoField.NANO_OF_SECOND
            r0.mo43273b(r4, r3, r3, r2)
            goto L_0x022a
        L_0x01b3:
            r8 = 0
        L_0x01b4:
            if (r3 == r6) goto L_0x01e5
            if (r3 == r14) goto L_0x01e5
            if (r3 == r13) goto L_0x01e0
            if (r3 == r5) goto L_0x01d8
            if (r3 != r15) goto L_0x01c6
            if (r8 == 0) goto L_0x01c3
            j$.time.format.G r3 = p3186j$.time.format.C40974G.NARROW_STANDALONE
            goto L_0x01f8
        L_0x01c3:
            j$.time.format.G r3 = p3186j$.time.format.C40974G.NARROW
            goto L_0x01f8
        L_0x01c6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d8:
            if (r8 == 0) goto L_0x01dd
            j$.time.format.G r3 = p3186j$.time.format.C40974G.FULL_STANDALONE
            goto L_0x01f8
        L_0x01dd:
            j$.time.format.G r3 = p3186j$.time.format.C40974G.FULL
            goto L_0x01f8
        L_0x01e0:
            if (r8 == 0) goto L_0x01f6
            j$.time.format.G r3 = p3186j$.time.format.C40974G.SHORT_STANDALONE
            goto L_0x01f8
        L_0x01e5:
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L_0x01f2
            j$.time.format.u r5 = new j$.time.format.u
            r5.<init>(r4, r3, r3, r3)
        L_0x01ee:
            r0.m71361k(r5)
            goto L_0x022a
        L_0x01f2:
            r5 = 69
            if (r4 != r5) goto L_0x020d
        L_0x01f6:
            j$.time.format.G r3 = p3186j$.time.format.C40974G.SHORT
        L_0x01f8:
            p3186j$.util.Objects.requireNonNull(r11, r7)
            java.lang.String r4 = "textStyle"
            p3186j$.util.Objects.requireNonNull(r3, r4)
            j$.time.format.t r4 = new j$.time.format.t
            j$.time.format.B r5 = p3186j$.time.format.C40969B.m71334d()
            r4.<init>(r11, r3, r5)
            r0.m71360d(r4)
            goto L_0x022a
        L_0x020d:
            if (r3 != r6) goto L_0x021f
        L_0x020f:
            p3186j$.util.Objects.requireNonNull(r11, r7)
            j$.time.format.l r3 = new j$.time.format.l
            j$.time.format.F r4 = p3186j$.time.format.C40973F.NORMAL
            r5 = 19
            r3.<init>(r11, r6, r5, r4)
            r0.m71361k(r3)
            goto L_0x022a
        L_0x021f:
            r0.mo43281l(r11, r14)
            goto L_0x022a
        L_0x0223:
            r5 = 19
            j$.time.format.F r4 = p3186j$.time.format.C40973F.NOT_NEGATIVE
        L_0x0227:
            r0.mo43280j(r11, r3, r5, r4)
        L_0x022a:
            r3 = -1
            goto L_0x03bb
        L_0x022d:
            if (r4 != r7) goto L_0x0253
            if (r3 > r5) goto L_0x0241
            if (r3 != r5) goto L_0x0236
            j$.time.format.G r3 = p3186j$.time.format.C40974G.FULL
            goto L_0x0238
        L_0x0236:
            j$.time.format.G r3 = p3186j$.time.format.C40974G.SHORT
        L_0x0238:
            j$.time.format.w r4 = new j$.time.format.w
            r4.<init>(r3, r2)
            r0.m71360d(r4)
            goto L_0x022a
        L_0x0241:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0253:
            r7 = 86
            if (r4 != r7) goto L_0x027c
            if (r3 != r14) goto L_0x0268
            j$.time.format.v r3 = new j$.time.format.v
            j$.time.temporal.n r4 = p3186j$.time.temporal.C41022m.m71573g()
            java.lang.String r5 = "ZoneId()"
            r3.<init>(r4, r5)
            r0.m71360d(r3)
            goto L_0x022a
        L_0x0268:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern letter count must be 2: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x027c:
            r7 = 118(0x76, float:1.65E-43)
            if (r4 != r7) goto L_0x02a6
            if (r3 != r6) goto L_0x0285
            j$.time.format.G r3 = p3186j$.time.format.C40974G.SHORT
            goto L_0x0289
        L_0x0285:
            if (r3 != r5) goto L_0x0292
            j$.time.format.G r3 = p3186j$.time.format.C40974G.FULL
        L_0x0289:
            j$.time.format.w r4 = new j$.time.format.w
            r4.<init>(r3, r6)
            r0.m71360d(r4)
            goto L_0x022a
        L_0x0292:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Wrong number of  pattern letters: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02a6:
            java.lang.String r7 = "+0000"
            r8 = 90
            if (r4 != r8) goto L_0x02cc
            if (r3 >= r5) goto L_0x02b2
            java.lang.String r3 = "+HHMM"
            goto L_0x0352
        L_0x02b2:
            if (r3 != r5) goto L_0x02b5
            goto L_0x02d7
        L_0x02b5:
            if (r3 != r15) goto L_0x02ba
            java.lang.String r3 = "+HH:MM:ss"
            goto L_0x031d
        L_0x02ba:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02cc:
            r8 = 79
            if (r4 != r8) goto L_0x030d
            if (r3 != r6) goto L_0x02d5
            j$.time.format.G r3 = p3186j$.time.format.C40974G.SHORT
            goto L_0x02d9
        L_0x02d5:
            if (r3 != r5) goto L_0x02f9
        L_0x02d7:
            j$.time.format.G r3 = p3186j$.time.format.C40974G.FULL
        L_0x02d9:
            java.lang.String r4 = "style"
            p3186j$.util.Objects.requireNonNull(r3, r4)
            j$.time.format.G r4 = p3186j$.time.format.C40974G.FULL
            if (r3 == r4) goto L_0x02ef
            j$.time.format.G r4 = p3186j$.time.format.C40974G.SHORT
            if (r3 != r4) goto L_0x02e7
            goto L_0x02ef
        L_0x02e7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Style must be either full or short"
            r1.<init>(r2)
            throw r1
        L_0x02ef:
            j$.time.format.j r4 = new j$.time.format.j
            r4.<init>(r2, r3)
            r0.m71360d(r4)
            goto L_0x022a
        L_0x02f9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern letter count must be 1 or 4: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x030d:
            r5 = 88
            if (r4 != r5) goto L_0x0336
            if (r3 > r15) goto L_0x0324
            java.lang.String[] r4 = p3186j$.time.format.C40988m.f107352d
            if (r3 != r6) goto L_0x0319
            r5 = 0
            goto L_0x031a
        L_0x0319:
            r5 = 1
        L_0x031a:
            int r3 = r3 + r5
            r3 = r4[r3]
        L_0x031d:
            java.lang.String r4 = "Z"
            r0.appendOffset(r3, r4)
            goto L_0x022a
        L_0x0324:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0336:
            r5 = 120(0x78, float:1.68E-43)
            if (r4 != r5) goto L_0x0369
            if (r3 > r15) goto L_0x0357
            if (r3 != r6) goto L_0x0341
            java.lang.String r7 = "+00"
            goto L_0x0348
        L_0x0341:
            int r4 = r3 % 2
            if (r4 != 0) goto L_0x0346
            goto L_0x0348
        L_0x0346:
            java.lang.String r7 = "+00:00"
        L_0x0348:
            java.lang.String[] r4 = p3186j$.time.format.C40988m.f107352d
            if (r3 != r6) goto L_0x034e
            r5 = 0
            goto L_0x034f
        L_0x034e:
            r5 = 1
        L_0x034f:
            int r3 = r3 + r5
            r3 = r4[r3]
        L_0x0352:
            r0.appendOffset(r3, r7)
            goto L_0x022a
        L_0x0357:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0369:
            r5 = 87
            if (r4 != r5) goto L_0x0387
            if (r3 > r6) goto L_0x0375
            j$.time.format.u r5 = new j$.time.format.u
            r5.<init>(r4, r3, r3, r3)
            goto L_0x03b6
        L_0x0375:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0387:
            r5 = 119(0x77, float:1.67E-43)
            if (r4 != r5) goto L_0x03a5
            if (r3 > r14) goto L_0x0393
            j$.time.format.u r5 = new j$.time.format.u
            r5.<init>(r4, r3, r3, r14)
            goto L_0x03b6
        L_0x0393:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03a5:
            r5 = 89
            if (r4 != r5) goto L_0x03be
            j$.time.format.u r5 = new j$.time.format.u
            if (r3 != r14) goto L_0x03b1
            r5.<init>(r4, r3, r3, r14)
            goto L_0x03b6
        L_0x03b1:
            r7 = 19
            r5.<init>(r4, r3, r3, r7)
        L_0x03b6:
            r0.m71361k(r5)
            goto L_0x022a
        L_0x03bb:
            int r3 = r3 + r10
            goto L_0x0452
        L_0x03be:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown pattern letter: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03d2:
            java.lang.String r5 = "'"
            r7 = 39
            if (r4 != r7) goto L_0x0425
            int r3 = r3 + 1
            r4 = r3
        L_0x03db:
            int r8 = r17.length()
            if (r4 >= r8) goto L_0x03f8
            char r8 = r1.charAt(r4)
            if (r8 != r7) goto L_0x03f6
            int r8 = r4 + 1
            int r9 = r17.length()
            if (r8 >= r9) goto L_0x03f8
            char r9 = r1.charAt(r8)
            if (r9 != r7) goto L_0x03f8
            r4 = r8
        L_0x03f6:
            int r4 = r4 + r6
            goto L_0x03db
        L_0x03f8:
            int r8 = r17.length()
            if (r4 >= r8) goto L_0x0417
            java.lang.String r3 = r1.substring(r3, r4)
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L_0x040c
            r0.mo43275e(r7)
            goto L_0x0415
        L_0x040c:
            java.lang.String r7 = "''"
            java.lang.String r3 = r3.replace(r7, r5)
            r0.mo43276f(r3)
        L_0x0415:
            r3 = r4
            goto L_0x0452
        L_0x0417:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern ends with an incomplete string literal: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0425:
            r7 = 91
            if (r4 != r7) goto L_0x042d
            r16.optionalStart()
            goto L_0x0452
        L_0x042d:
            r7 = 93
            if (r4 != r7) goto L_0x0443
            j$.time.format.DateTimeFormatterBuilder r4 = r0.f107316a
            j$.time.format.DateTimeFormatterBuilder r4 = r4.f107317b
            if (r4 == 0) goto L_0x043b
            r16.optionalEnd()
            goto L_0x0452
        L_0x043b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern invalid as it contains ] without previous ["
            r1.<init>(r2)
            throw r1
        L_0x0443:
            r7 = 123(0x7b, float:1.72E-43)
            if (r4 == r7) goto L_0x0455
            r7 = 125(0x7d, float:1.75E-43)
            if (r4 == r7) goto L_0x0455
            r7 = 35
            if (r4 == r7) goto L_0x0455
            r0.mo43275e(r4)
        L_0x0452:
            int r3 = r3 + r6
            goto L_0x000b
        L_0x0455:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern includes reserved character: '"
            r2.<init>(r3)
            r2.append(r4)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x046c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.format.DateTimeFormatterBuilder.appendPattern(java.lang.String):j$.time.format.DateTimeFormatterBuilder");
    }

    /* renamed from: b */
    public final void mo43273b(ChronoField chronoField, int i, int i2, boolean z) {
        if (i != i2 || z) {
            m71360d(new C40983h(chronoField, i, i2, z));
        } else {
            m71361k(new C40983h(chronoField, i, i2, z));
        }
    }

    /* renamed from: c */
    public final void mo43274c() {
        m71360d(new C40984i());
    }

    /* renamed from: e */
    public final void mo43275e(char c) {
        m71360d(new C40980e(c));
    }

    /* renamed from: f */
    public final void mo43276f(String str) {
        Objects.requireNonNull(str, "literal");
        if (!str.isEmpty()) {
            m71360d(str.length() == 1 ? new C40980e(str.charAt(0)) : new C40985j(1, str));
        }
    }

    /* renamed from: g */
    public final void mo43277g(FormatStyle formatStyle) {
        if (formatStyle != null) {
            m71360d(new C40986k(formatStyle));
            return;
        }
        throw new IllegalArgumentException("Either the date or time style must be non-null");
    }

    /* renamed from: h */
    public final void mo43278h() {
        m71360d(C40988m.f107353e);
    }

    /* renamed from: i */
    public final void mo43279i(ChronoField chronoField, HashMap hashMap) {
        Objects.requireNonNull(chronoField, "field");
        Objects.requireNonNull(hashMap, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        C40974G g = C40974G.FULL;
        m71360d(new C40995t(chronoField, g, new C40977b(new C40968A(Collections.singletonMap(g, linkedHashMap)))));
    }

    /* renamed from: j */
    public final DateTimeFormatterBuilder mo43280j(TemporalField temporalField, int i, int i2, C40973F f) {
        if (i == i2 && f == C40973F.NOT_NEGATIVE) {
            mo43281l(temporalField, i2);
            return this;
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(f, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            m71361k(new C40987l(temporalField, i, i2, f));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: l */
    public final void mo43281l(TemporalField temporalField, int i) {
        Objects.requireNonNull(temporalField, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        m71361k(new C40987l(temporalField, i, i, C40973F.NOT_NEGATIVE));
    }

    /* renamed from: m */
    public final void mo43282m() {
        m71360d(new C40997v(f107313h, "ZoneRegionId()"));
    }

    /* renamed from: n */
    public final void mo43283n() {
        m71360d(C40994s.INSENSITIVE);
    }

    /* renamed from: o */
    public final void mo43284o() {
        m71360d(C40994s.SENSITIVE);
    }

    public DateTimeFormatterBuilder optionalEnd() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f107316a;
        if (dateTimeFormatterBuilder.f107317b != null) {
            if (dateTimeFormatterBuilder.f107318c.size() > 0) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f107316a;
                C40981f fVar = new C40981f(dateTimeFormatterBuilder2.f107318c, dateTimeFormatterBuilder2.f107319d);
                this.f107316a = this.f107316a.f107317b;
                m71360d(fVar);
            } else {
                this.f107316a = this.f107316a.f107317b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public DateTimeFormatterBuilder optionalStart() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f107316a;
        dateTimeFormatterBuilder.f107322g = -1;
        this.f107316a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
        return this;
    }

    /* renamed from: p */
    public final void mo43287p() {
        m71360d(C40994s.LENIENT);
    }

    /* renamed from: q */
    public final void mo43288q() {
        m71360d(C40994s.STRICT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final DateTimeFormatter mo43289r(C40972E e, C40963f fVar) {
        return m71362s(Locale.getDefault(), e, fVar);
    }

    public DateTimeFormatter toFormatter() {
        return toFormatter(Locale.getDefault());
    }

    public DateTimeFormatter toFormatter(Locale locale) {
        return m71362s(locale, C40972E.SMART, (C40963f) null);
    }
}
