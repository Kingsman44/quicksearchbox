package android.p017a.p019b;

import android.p017a.p018a.C0086e;
import android.p017a.p020c.C0108a;
import android.p017a.p020c.C0110c;
import android.p017a.p020c.C0111d;
import com.evernote.android.state.BuildConfig;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: android.a.b.g */
/* compiled from: PG */
public final class C0093g extends Format {

    /* renamed from: d */
    private static final String[] f255d = {"number", "date", "time", "spellout", "ordinal", "duration"};

    /* renamed from: e */
    private static final String[] f256e = {BuildConfig.FLAVOR, "currency", "percent", "integer"};

    /* renamed from: f */
    private static final String[] f257f = {BuildConfig.FLAVOR, "short", "medium", "long", "full"};

    /* renamed from: g */
    private static final Locale f258g = new Locale(BuildConfig.FLAVOR);
    static final long serialVersionUID = 7136212545847378652L;

    /* renamed from: a */
    public transient Locale f259a;

    /* renamed from: b */
    public transient C0111d f260b;

    /* renamed from: c */
    public transient Map f261c;

    /* renamed from: h */
    private transient DateFormat f262h;

    /* renamed from: i */
    private transient NumberFormat f263i;

    /* renamed from: j */
    private transient C0092f f264j;

    /* renamed from: k */
    private transient C0092f f265k;

    public C0093g(String str, Locale locale) {
        Object obj;
        this.f259a = locale;
        try {
            C0111d dVar = this.f260b;
            if (dVar == null) {
                this.f260b = new C0111d(str);
            } else {
                dVar.mo83h(str);
            }
            Map map = this.f261c;
            if (map != null) {
                map.clear();
            }
            int size = this.f260b.f316b.size() - 2;
            int i = 1;
            while (i < size) {
                C0110c c = this.f260b.mo76c(i);
                if (c.f312e == 6) {
                    if (c.mo70a() == 2) {
                        int i2 = i + 2;
                        C0111d dVar2 = this.f260b;
                        int i3 = i2 + 1;
                        String e = dVar2.mo79e(dVar2.mo76c(i2));
                        String str2 = BuildConfig.FLAVOR;
                        C0110c c2 = this.f260b.mo76c(i3);
                        if (c2.f312e == 11) {
                            str2 = this.f260b.mo79e(c2);
                            i3++;
                        }
                        int c3 = m44c(e, f255d);
                        if (c3 == 0) {
                            int c4 = m44c(str2, f256e);
                            if (c4 == 0) {
                                obj = NumberFormat.getInstance(this.f259a);
                            } else if (c4 == 1) {
                                obj = NumberFormat.getCurrencyInstance(this.f259a);
                            } else if (c4 == 2) {
                                obj = NumberFormat.getPercentInstance(this.f259a);
                            } else if (c4 != 3) {
                                obj = new DecimalFormat(str2, new DecimalFormatSymbols(this.f259a));
                            } else {
                                obj = NumberFormat.getIntegerInstance(this.f259a);
                            }
                        } else if (c3 == 1) {
                            int c5 = m44c(str2, f257f);
                            if (c5 == 0) {
                                obj = DateFormat.getDateInstance(2, this.f259a);
                            } else if (c5 == 1) {
                                obj = DateFormat.getDateInstance(3, this.f259a);
                            } else if (c5 == 2) {
                                obj = DateFormat.getDateInstance(2, this.f259a);
                            } else if (c5 == 3) {
                                obj = DateFormat.getDateInstance(1, this.f259a);
                            } else if (c5 != 4) {
                                obj = new SimpleDateFormat(str2, this.f259a);
                            } else {
                                obj = DateFormat.getDateInstance(0, this.f259a);
                            }
                        } else if (c3 == 2) {
                            int c6 = m44c(str2, f257f);
                            if (c6 == 0) {
                                obj = DateFormat.getTimeInstance(2, this.f259a);
                            } else if (c6 == 1) {
                                obj = DateFormat.getTimeInstance(3, this.f259a);
                            } else if (c6 == 2) {
                                obj = DateFormat.getTimeInstance(2, this.f259a);
                            } else if (c6 == 3) {
                                obj = DateFormat.getTimeInstance(1, this.f259a);
                            } else if (c6 != 4) {
                                obj = new SimpleDateFormat(str2, this.f259a);
                            } else {
                                obj = DateFormat.getTimeInstance(0, this.f259a);
                            }
                        } else {
                            throw new IllegalArgumentException("Unknown format type \"" + e + "\"");
                        }
                        if (this.f261c == null) {
                            this.f261c = new HashMap();
                        }
                        this.f261c.put(Integer.valueOf(i), obj);
                        i = i3;
                    } else {
                        continue;
                    }
                }
                i++;
            }
        } catch (RuntimeException e2) {
            C0111d dVar3 = this.f260b;
            if (dVar3 != null) {
                dVar3.f315a = null;
                dVar3.f318d = false;
                dVar3.f316b.clear();
                ArrayList arrayList = dVar3.f317c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.f261c;
            if (map2 != null) {
                map2.clear();
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public static final String m43a(Locale locale, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder(str.length());
        new C0093g(str, locale).m47f(0, (C0091e) null, (Object[]) null, (Map) null, objArr, new C0088b(sb), (FieldPosition) null);
        return sb.toString();
    }

    /* renamed from: c */
    private static final int m44c(String str, String[] strArr) {
        int i = C0086e.f231a;
        if (str.length() != 0 && (C0086e.m38c(str.charAt(0)) || C0086e.m38c(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length && C0086e.m38c(str.charAt(i2))) {
                i2++;
            }
            if (i2 < length) {
                while (true) {
                    int i3 = length - 1;
                    if (!C0086e.m38c(str.charAt(i3))) {
                        break;
                    }
                    length = i3;
                }
            }
            str = str.substring(i2, length);
        }
        String lowerCase = str.toLowerCase(f258g);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (lowerCase.equals(strArr[i4])) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private final void m45d(Object obj, C0088b bVar, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            m46e((Object[]) null, (Map) obj, bVar, fieldPosition);
        } else {
            m46e((Object[]) obj, (Map) null, bVar, fieldPosition);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: java.lang.Number} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0279, code lost:
        r36 = r10;
        r37 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0364, code lost:
        if (r4 == 2) goto L_0x0368;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0504 A[LOOP:3: B:113:0x0267->B:242:0x0504, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05cf  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x05e0  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05f0  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05fd  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x04f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m47f(int r40, android.p017a.p019b.C0091e r41, java.lang.Object[] r42, java.util.Map r43, java.lang.Object[] r44, android.p017a.p019b.C0088b r45, java.text.FieldPosition r46) {
        /*
            r39 = this;
            r8 = r39
            r0 = r40
            r9 = r41
            r10 = r42
            r11 = r43
            r12 = r44
            r13 = r45
            android.a.c.d r1 = r8.f260b
            java.lang.String r14 = r1.f315a
            android.a.c.c r1 = r1.mo76c(r0)
            int r2 = r1.f308a
            char r1 = r1.f309b
            int r2 = r2 + r1
            r15 = 1
            int r0 = r0 + r15
            r1 = r0
            r0 = r46
        L_0x0020:
            android.a.c.d r3 = r8.f260b
            android.a.c.c r3 = r3.mo76c(r1)
            int r4 = r3.f312e
            int r5 = r3.f308a
            java.lang.Appendable r6 = r13.f236a     // Catch:{ IOException -> 0x0620 }
            r6.append(r14, r2, r5)     // Catch:{ IOException -> 0x0620 }
            int r6 = r13.f237b     // Catch:{ IOException -> 0x0620 }
            int r5 = r5 - r2
            int r6 = r6 + r5
            r13.f237b = r6     // Catch:{ IOException -> 0x0620 }
            r2 = 2
            if (r4 == r2) goto L_0x061f
            int r5 = r3.f308a
            char r6 = r3.f309b
            int r5 = r5 + r6
            r6 = 5
            if (r4 != r6) goto L_0x0058
            boolean r2 = r9.f251h
            if (r2 == 0) goto L_0x004e
            java.text.Format r2 = r9.f249f
            java.lang.Number r3 = r9.f246c
            java.lang.String r4 = r9.f250g
            r13.mo37c(r2, r3, r4)
            goto L_0x005b
        L_0x004e:
            java.text.NumberFormat r2 = r39.mo41b()
            java.lang.Number r3 = r9.f246c
            r13.mo36b(r2, r3)
            goto L_0x005b
        L_0x0058:
            r7 = 6
            if (r4 == r7) goto L_0x0063
        L_0x005b:
            r3 = r1
            r2 = r5
            r1 = r13
            r20 = r14
        L_0x0060:
            r4 = 1
            goto L_0x060f
        L_0x0063:
            android.a.c.d r4 = r8.f260b
            int r5 = r4.mo75b(r1)
            int r3 = r3.mo70a()
            int r1 = r1 + 1
            android.a.c.d r4 = r8.f260b
            android.a.c.c r4 = r4.mo76c(r1)
            android.a.c.d r7 = r8.f260b
            java.lang.String r7 = r7.mo79e(r4)
            r22 = 0
            r23 = 0
            if (r10 == 0) goto L_0x0096
            short r4 = r4.f310c
            java.util.List r6 = r13.f238c
            if (r6 == 0) goto L_0x008c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            goto L_0x008e
        L_0x008c:
            r6 = r22
        L_0x008e:
            if (r4 < 0) goto L_0x00c6
            int r2 = r10.length
            if (r4 >= r2) goto L_0x00c6
            r2 = r10[r4]
            goto L_0x00c3
        L_0x0096:
            if (r12 == 0) goto L_0x00b6
            r2 = 0
        L_0x0099:
            int r4 = r12.length
            if (r2 >= r4) goto L_0x00b1
            r4 = r12[r2]
            java.lang.String r4 = r4.toString()
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x00ae
            int r2 = r2 + 1
            r2 = r12[r2]
            r4 = 0
            goto L_0x00b4
        L_0x00ae:
            int r2 = r2 + 2
            goto L_0x0099
        L_0x00b1:
            r2 = r22
            r4 = 1
        L_0x00b4:
            r6 = r7
            goto L_0x00c9
        L_0x00b6:
            if (r11 == 0) goto L_0x00c5
            boolean r2 = r11.containsKey(r7)
            if (r2 == 0) goto L_0x00c5
            java.lang.Object r2 = r11.get(r7)
            r6 = r7
        L_0x00c3:
            r4 = 0
            goto L_0x00c9
        L_0x00c5:
            r6 = r7
        L_0x00c6:
            r2 = r22
            r4 = 1
        L_0x00c9:
            int r1 = r1 + 1
            int r15 = r13.f237b
            if (r4 == 0) goto L_0x00f2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = "}"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.mo35a(r1)
        L_0x00e5:
            r27 = r0
            r21 = r5
            r36 = r6
        L_0x00eb:
            r1 = r13
            r20 = r14
            r37 = r15
            goto L_0x05cb
        L_0x00f2:
            if (r2 != 0) goto L_0x00fa
            java.lang.String r1 = "null"
            r13.mo35a(r1)
            goto L_0x00e5
        L_0x00fa:
            r25 = 0
            if (r9 == 0) goto L_0x011c
            int r4 = r9.f248e
            r16 = r5
            int r5 = r1 + -2
            if (r4 != r5) goto L_0x011e
            double r3 = r9.f247d
            int r1 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r1 != 0) goto L_0x0116
            java.text.Format r1 = r9.f249f
            java.lang.Number r2 = r9.f246c
            java.lang.String r3 = r9.f250g
            r13.mo37c(r1, r2, r3)
            goto L_0x0133
        L_0x0116:
            java.text.Format r1 = r9.f249f
            r13.mo36b(r1, r2)
            goto L_0x0133
        L_0x011c:
            r16 = r5
        L_0x011e:
            java.util.Map r4 = r8.f261c
            if (r4 == 0) goto L_0x0140
            int r5 = r1 + -2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            java.text.Format r4 = (java.text.Format) r4
            if (r4 == 0) goto L_0x0140
            r13.mo36b(r4, r2)
        L_0x0133:
            r27 = r0
            r36 = r6
            r1 = r13
            r20 = r14
            r37 = r15
            r21 = r16
            goto L_0x05cb
        L_0x0140:
            r5 = 1
            if (r3 == r5) goto L_0x0593
            java.util.Map r5 = r8.f261c
            if (r5 == 0) goto L_0x0155
            int r17 = r1 + -2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            boolean r4 = r5.containsKey(r4)
            if (r4 == 0) goto L_0x0155
            goto L_0x0593
        L_0x0155:
            java.lang.String r4 = "' is not a Number"
            java.lang.String r5 = "'"
            r17 = r6
            r6 = 3
            if (r3 != r6) goto L_0x01e6
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L_0x01cd
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            android.a.c.d r4 = r8.f260b
            java.util.ArrayList r5 = r4.f316b
            int r5 = r5.size()
            int r1 = r1 + 2
        L_0x0172:
            r6 = r1
            int r1 = r4.mo75b(r6)
            r7 = 1
            int r1 = r1 + r7
            if (r1 < r5) goto L_0x017c
            goto L_0x01b1
        L_0x017c:
            int r7 = r1 + 1
            android.a.c.c r1 = r4.mo76c(r1)
            r40 = r5
            int r5 = r1.f312e
            r9 = 7
            if (r5 == r9) goto L_0x01b1
            double r18 = r4.mo74a(r1)
            int r1 = r7 + 1
            java.util.ArrayList r5 = r4.f316b
            java.lang.Object r5 = r5.get(r7)
            android.a.c.c r5 = (android.p017a.p020c.C0110c) r5
            int r5 = r5.f308a
            java.lang.String r7 = r4.f315a
            char r5 = r7.charAt(r5)
            r7 = 60
            if (r5 != r7) goto L_0x01a8
            int r5 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r5 <= 0) goto L_0x01b1
            goto L_0x01ac
        L_0x01a8:
            int r5 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r5 < 0) goto L_0x01b1
        L_0x01ac:
            r5 = r40
            r9 = r41
            goto L_0x0172
        L_0x01b1:
            r3 = 0
            r1 = r39
            r2 = r6
            r4 = r42
            r9 = r16
            r5 = r43
            r7 = r17
            r6 = r44
            r10 = r7
            r7 = r45
            r1.m48g(r2, r3, r4, r5, r6, r7)
            r27 = r0
            r21 = r9
            r36 = r10
            goto L_0x00eb
        L_0x01cd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x01e6:
            r9 = r16
            r10 = r17
            boolean r6 = android.p017a.p020c.C0108a.m70b(r3)
            java.lang.String r11 = "other"
            if (r6 == 0) goto L_0x052f
            boolean r6 = r2 instanceof java.lang.Number
            if (r6 == 0) goto L_0x0516
            r4 = 4
            if (r3 != r4) goto L_0x0208
            android.a.b.f r3 = r8.f264j
            if (r3 != 0) goto L_0x0205
            android.a.b.f r3 = new android.a.b.f
            r4 = 1
            r3.<init>(r8, r4)
            r8.f264j = r3
        L_0x0205:
            android.a.b.f r3 = r8.f264j
            goto L_0x0216
        L_0x0208:
            android.a.b.f r3 = r8.f265k
            if (r3 != 0) goto L_0x0214
            android.a.b.f r3 = new android.a.b.f
            r4 = 2
            r3.<init>(r8, r4)
            r8.f265k = r3
        L_0x0214:
            android.a.b.f r3 = r8.f265k
        L_0x0216:
            java.lang.Number r2 = (java.lang.Number) r2
            android.a.c.d r4 = r8.f260b
            java.util.ArrayList r5 = r4.f316b
            java.lang.Object r5 = r5.get(r1)
            android.a.c.c r5 = (android.p017a.p020c.C0110c) r5
            int r6 = r5.f312e
            boolean r6 = android.p017a.p020c.C0109b.m71a(r6)
            if (r6 == 0) goto L_0x0231
            double r4 = r4.mo74a(r5)
            r20 = r4
            goto L_0x0233
        L_0x0231:
            r20 = r25
        L_0x0233:
            android.a.b.e r6 = new android.a.b.e
            r16 = r6
            r17 = r1
            r18 = r7
            r19 = r2
            r16.<init>(r17, r18, r19, r20)
            android.a.c.d r7 = r8.f260b
            double r16 = r2.doubleValue()
            java.util.ArrayList r2 = r7.f316b
            int r2 = r2.size()
            android.a.c.c r4 = r7.mo76c(r1)
            int r5 = r4.f312e
            boolean r5 = android.p017a.p020c.C0109b.m71a(r5)
            if (r5 == 0) goto L_0x0261
            double r4 = r7.mo74a(r4)
            int r1 = r1 + 1
            r18 = r4
            goto L_0x0263
        L_0x0261:
            r18 = r25
        L_0x0263:
            r12 = r22
            r4 = 0
            r5 = 0
        L_0x0267:
            r20 = r14
            int r14 = r1 + 1
            android.a.c.c r1 = r7.mo76c(r1)
            r21 = r9
            int r9 = r1.f312e
            r27 = r0
            r0 = 7
            if (r9 != r0) goto L_0x027f
            r2 = r5
        L_0x0279:
            r36 = r10
            r37 = r15
            goto L_0x04f4
        L_0x027f:
            int r0 = r7.mo82g(r14)
            boolean r0 = android.p017a.p020c.C0109b.m71a(r0)
            if (r0 == 0) goto L_0x02a7
            int r0 = r14 + 1
            android.a.c.c r1 = r7.mo76c(r14)
            double r28 = r7.mo74a(r1)
            int r1 = (r16 > r28 ? 1 : (r16 == r28 ? 0 : -1))
            if (r1 != 0) goto L_0x0299
            r2 = r0
            goto L_0x0279
        L_0x0299:
            r14 = r0
            r38 = r2
            r40 = r3
            r36 = r10
        L_0x02a0:
            r37 = r15
            r3 = 6
        L_0x02a3:
            r24 = 2
            goto L_0x04e9
        L_0x02a7:
            if (r4 != 0) goto L_0x04d6
            boolean r0 = r7.mo81f(r1, r11)
            if (r0 == 0) goto L_0x02cd
            if (r5 != 0) goto L_0x04d6
            if (r12 == 0) goto L_0x02c5
            boolean r0 = r12.equals(r11)
            if (r0 == 0) goto L_0x02c5
            r38 = r2
            r40 = r3
            r36 = r10
            r5 = r14
            r37 = r15
            r3 = 6
            r4 = 1
            goto L_0x02a3
        L_0x02c5:
            r38 = r2
            r40 = r3
            r36 = r10
            r5 = r14
            goto L_0x02a0
        L_0x02cd:
            if (r12 != 0) goto L_0x04ba
            r0 = r10
            double r9 = r16 - r18
            android.a.b.t r12 = r3.f253b
            if (r12 != 0) goto L_0x02e5
            android.a.b.g r12 = r3.f252a
            java.util.Locale r12 = r12.f259a
            r34 = r4
            int r4 = r3.f254c
            android.a.b.t r4 = android.p017a.p019b.C0106t.m63d(r12, r4)
            r3.f253b = r4
            goto L_0x02e7
        L_0x02e5:
            r34 = r4
        L_0x02e7:
            android.a.b.g r4 = r3.f252a
            int r12 = r6.f244a
            r35 = r14
            android.a.c.d r14 = r4.f260b
            java.util.ArrayList r14 = r14.f316b
            int r14 = r14.size()
            r36 = r0
            android.a.c.d r0 = r4.f260b
            android.a.c.c r0 = r0.mo76c(r12)
            int r0 = r0.f312e
            boolean r0 = android.p017a.p020c.C0109b.m71a(r0)
            if (r0 == 0) goto L_0x0307
            int r12 = r12 + 1
        L_0x0307:
            int r0 = r12 + 1
            r37 = r15
            android.a.c.d r15 = r4.f260b
            android.a.c.c r12 = r15.mo76c(r12)
            int r15 = r12.f312e
            r13 = 7
            if (r15 != r13) goto L_0x0319
            r0 = 0
        L_0x0317:
            r12 = 1
            goto L_0x033b
        L_0x0319:
            android.a.c.d r13 = r4.f260b
            boolean r12 = r13.mo81f(r12, r11)
            if (r12 == 0) goto L_0x0322
            goto L_0x0317
        L_0x0322:
            android.a.c.d r12 = r4.f260b
            int r12 = r12.mo82g(r0)
            boolean r12 = android.p017a.p020c.C0109b.m71a(r12)
            if (r12 == 0) goto L_0x0330
            int r0 = r0 + 1
        L_0x0330:
            android.a.c.d r12 = r4.f260b
            int r0 = r12.mo75b(r0)
            r12 = 1
            int r0 = r0 + r12
            if (r0 < r14) goto L_0x04ac
            r0 = 0
        L_0x033b:
            android.a.b.g r13 = r3.f252a
            java.lang.String r15 = r6.f245b
            int r0 = r0 + r12
        L_0x0340:
            android.a.c.d r4 = r13.f260b
            android.a.c.c r4 = r4.mo76c(r0)
            int r12 = r4.f312e
            r14 = 2
            if (r12 != r14) goto L_0x034e
            r0 = 0
        L_0x034c:
            r14 = 6
            goto L_0x037a
        L_0x034e:
            r14 = 5
            if (r12 != r14) goto L_0x0353
            r0 = -1
            goto L_0x034c
        L_0x0353:
            r14 = 6
            if (r12 != r14) goto L_0x04a0
            int r4 = r4.mo70a()
            int r12 = r15.length()
            if (r12 == 0) goto L_0x0495
            r12 = 1
            if (r4 == r12) goto L_0x0367
            r12 = 2
            if (r4 != r12) goto L_0x0495
            goto L_0x0368
        L_0x0367:
            r12 = 2
        L_0x0368:
            android.a.c.d r4 = r13.f260b
            int r12 = r0 + 1
            android.a.c.c r4 = r4.mo76c(r12)
            android.a.c.d r12 = r13.f260b
            boolean r4 = r12.mo81f(r4, r15)
            if (r4 != 0) goto L_0x037a
            goto L_0x0495
        L_0x037a:
            r6.f248e = r0
            if (r0 <= 0) goto L_0x0390
            android.a.b.g r4 = r3.f252a
            java.util.Map r4 = r4.f261c
            if (r4 == 0) goto L_0x0390
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.text.Format r0 = (java.text.Format) r0
            r6.f249f = r0
        L_0x0390:
            java.text.Format r0 = r6.f249f
            if (r0 != 0) goto L_0x039f
            android.a.b.g r0 = r3.f252a
            java.text.NumberFormat r0 = r0.mo41b()
            r6.f249f = r0
            r0 = 1
            r6.f251h = r0
        L_0x039f:
            java.text.Format r0 = r6.f249f
            java.lang.Number r4 = r6.f246c
            java.lang.String r0 = r0.format(r4)
            r6.f250g = r0
            android.a.b.t r0 = r3.f253b
            android.a.b.s r0 = r0.f302h
            android.a.b.m r4 = new android.a.b.m
            boolean r12 = java.lang.Double.isInfinite(r9)
            if (r12 != 0) goto L_0x043d
            boolean r12 = java.lang.Double.isNaN(r9)
            if (r12 == 0) goto L_0x03bd
            goto L_0x043d
        L_0x03bd:
            int r12 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r12 >= 0) goto L_0x03c3
            double r12 = -r9
            goto L_0x03c4
        L_0x03c3:
            r12 = r9
        L_0x03c4:
            r28 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            int r15 = (r12 > r28 ? 1 : (r12 == r28 ? 0 : -1))
            if (r15 >= 0) goto L_0x03f9
            r28 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r12 = r12 * r28
            long r12 = (long) r12
            r28 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r12 % r28
            r15 = 10
            r28 = 6
        L_0x03de:
            if (r28 <= 0) goto L_0x043d
            r38 = r2
            r40 = r3
            long r2 = (long) r15
            long r2 = r12 % r2
            r29 = 0
            int r31 = (r2 > r29 ? 1 : (r2 == r29 ? 0 : -1))
            if (r31 == 0) goto L_0x03f0
            r13 = r28
            goto L_0x0442
        L_0x03f0:
            int r15 = r15 * 10
            int r28 = r28 + -1
            r3 = r40
            r2 = r38
            goto L_0x03de
        L_0x03f9:
            r38 = r2
            r40 = r3
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r3 = 1
            java.lang.Object[] r15 = new java.lang.Object[r3]
            java.lang.Double r3 = java.lang.Double.valueOf(r12)
            r15[r23] = r3
            java.lang.String r3 = "%1.15e"
            java.lang.String r2 = java.lang.String.format(r2, r3, r15)
            r3 = 101(0x65, float:1.42E-43)
            int r3 = r2.lastIndexOf(r3)
            int r12 = r3 + 1
            char r13 = r2.charAt(r12)
            r15 = 43
            if (r13 != r15) goto L_0x0420
            int r12 = r12 + 1
        L_0x0420:
            int r13 = r3 + -2
            java.lang.String r12 = r2.substring(r12)
            int r12 = java.lang.Integer.parseInt(r12)
            int r13 = r13 - r12
            if (r13 >= 0) goto L_0x042e
            goto L_0x0441
        L_0x042e:
            int r3 = r3 + -1
            if (r13 <= 0) goto L_0x0442
            char r12 = r2.charAt(r3)
            r15 = 48
            if (r12 != r15) goto L_0x0442
            int r13 = r13 + -1
            goto L_0x042e
        L_0x043d:
            r38 = r2
            r40 = r3
        L_0x0441:
            r13 = 0
        L_0x0442:
            int r2 = android.p017a.p019b.C0099m.m54a(r9, r13)
            long r2 = (long) r2
            r28 = r4
            r29 = r9
            r31 = r13
            r32 = r2
            r28.<init>(r29, r31, r32)
            double r2 = r4.f268a
            boolean r2 = java.lang.Double.isInfinite(r2)
            if (r2 != 0) goto L_0x0483
            double r2 = r4.f268a
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 == 0) goto L_0x0463
            goto L_0x0483
        L_0x0463:
            java.util.List r0 = r0.f292b
            java.util.Iterator r0 = r0.iterator()
        L_0x0469:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x047e
            java.lang.Object r2 = r0.next()
            android.a.b.r r2 = (android.p017a.p019b.C0104r) r2
            android.a.b.k r3 = r2.f288b
            boolean r3 = r3.mo46a(r4)
            if (r3 == 0) goto L_0x0469
            goto L_0x0480
        L_0x047e:
            r2 = r22
        L_0x0480:
            java.lang.String r0 = r2.f287a
            goto L_0x0484
        L_0x0483:
            r0 = r11
        L_0x0484:
            if (r5 == 0) goto L_0x0493
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x0493
            r12 = r0
            r3 = 6
            r24 = 2
            r34 = 1
            goto L_0x04c9
        L_0x0493:
            r12 = r0
            goto L_0x04c6
        L_0x0495:
            r38 = r2
            r40 = r3
            android.a.c.d r2 = r13.f260b
            int r0 = r2.mo75b(r0)
            goto L_0x04a4
        L_0x04a0:
            r38 = r2
            r40 = r3
        L_0x04a4:
            r2 = 1
            int r0 = r0 + r2
            r3 = r40
            r2 = r38
            goto L_0x0340
        L_0x04ac:
            r40 = r3
            r3 = 6
            r24 = 2
            r3 = r40
            r13 = r45
            r12 = r0
            r15 = r37
            goto L_0x0307
        L_0x04ba:
            r38 = r2
            r40 = r3
            r34 = r4
            r36 = r10
            r35 = r14
            r37 = r15
        L_0x04c6:
            r3 = 6
            r24 = 2
        L_0x04c9:
            if (r34 != 0) goto L_0x04e5
            boolean r0 = r7.mo81f(r1, r12)
            if (r0 == 0) goto L_0x04e5
            r5 = r35
            r14 = r5
            r4 = 1
            goto L_0x04e9
        L_0x04d6:
            r38 = r2
            r40 = r3
            r34 = r4
            r36 = r10
            r35 = r14
            r37 = r15
            r3 = 6
            r24 = 2
        L_0x04e5:
            r4 = r34
            r14 = r35
        L_0x04e9:
            int r0 = r7.mo75b(r14)
            r1 = 1
            int r0 = r0 + r1
            r1 = r38
            if (r0 < r1) goto L_0x0504
            r2 = r5
        L_0x04f4:
            r1 = r39
            r3 = r6
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r45
            r1.m48g(r2, r3, r4, r5, r6, r7)
            goto L_0x0580
        L_0x0504:
            r3 = r40
            r13 = r45
            r2 = r1
            r14 = r20
            r9 = r21
            r10 = r36
            r15 = r37
            r1 = r0
            r0 = r27
            goto L_0x0267
        L_0x0516:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x052f:
            r27 = r0
            r21 = r9
            r36 = r10
            r20 = r14
            r37 = r15
            r0 = 5
            if (r3 != r0) goto L_0x0583
            android.a.c.d r0 = r8.f260b
            java.lang.String r2 = r2.toString()
            java.util.ArrayList r3 = r0.f316b
            int r4 = r3.size()
            r3 = 0
        L_0x0549:
            int r5 = r1 + 1
            android.a.c.c r1 = r0.mo76c(r1)
            int r6 = r1.f312e
            r7 = 7
            if (r6 != r7) goto L_0x0556
        L_0x0554:
            r2 = r3
            goto L_0x0572
        L_0x0556:
            boolean r6 = r0.mo81f(r1, r2)
            if (r6 == 0) goto L_0x055e
            r2 = r5
            goto L_0x0572
        L_0x055e:
            if (r3 != 0) goto L_0x0569
            boolean r1 = r0.mo81f(r1, r11)
            if (r1 == 0) goto L_0x0568
            r3 = r5
            goto L_0x0569
        L_0x0568:
            r3 = 0
        L_0x0569:
            int r1 = r0.mo75b(r5)
            r5 = 1
            int r1 = r1 + r5
            if (r1 < r4) goto L_0x0549
            goto L_0x0554
        L_0x0572:
            r3 = 0
            r1 = r39
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r45
            r1.m48g(r2, r3, r4, r5, r6, r7)
        L_0x0580:
            r1 = r45
            goto L_0x05cb
        L_0x0583:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected argType "
            java.lang.String r2 = android.p017a.p020c.C0108a.m69a(r3)
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x0593:
            r27 = r0
            r36 = r6
            r20 = r14
            r37 = r15
            r21 = r16
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L_0x05ab
            java.text.NumberFormat r0 = r39.mo41b()
            r1 = r45
            r1.mo36b(r0, r2)
            goto L_0x05cb
        L_0x05ab:
            r1 = r45
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto L_0x05c4
            java.text.DateFormat r0 = r8.f262h
            if (r0 != 0) goto L_0x05be
            java.util.Locale r0 = r8.f259a
            r3 = 3
            java.text.DateFormat r0 = java.text.DateFormat.getDateTimeInstance(r3, r3, r0)
            r8.f262h = r0
        L_0x05be:
            java.text.DateFormat r0 = r8.f262h
            r1.mo36b(r0, r2)
            goto L_0x05cb
        L_0x05c4:
            java.lang.String r0 = r2.toString()
            r1.mo35a(r0)
        L_0x05cb:
            java.util.List r0 = r1.f238c
            if (r0 == 0) goto L_0x05e0
            int r2 = r1.f237b
            r3 = r37
            if (r3 >= r2) goto L_0x05e2
            android.a.b.c r4 = new android.a.b.c
            r7 = r36
            r4.<init>(r7, r3, r2)
            r0.add(r4)
            goto L_0x05e2
        L_0x05e0:
            r3 = r37
        L_0x05e2:
            if (r27 == 0) goto L_0x05fd
            android.a.b.d r0 = android.p017a.p019b.C0090d.f243a
            java.text.Format$Field r2 = r27.getFieldAttribute()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x05fd
            r0 = r27
            r0.setBeginIndex(r3)
            int r2 = r1.f237b
            r0.setEndIndex(r2)
            r0 = r22
            goto L_0x05ff
        L_0x05fd:
            r0 = r27
        L_0x05ff:
            android.a.c.d r2 = r8.f260b
            r3 = r21
            android.a.c.c r2 = r2.mo76c(r3)
            int r4 = r2.f308a
            char r2 = r2.f309b
            int r4 = r4 + r2
            r2 = r4
            goto L_0x0060
        L_0x060f:
            int r3 = r3 + r4
            r9 = r41
            r10 = r42
            r11 = r43
            r12 = r44
            r13 = r1
            r1 = r3
            r14 = r20
            r15 = 1
            goto L_0x0020
        L_0x061f:
            return
        L_0x0620:
            r0 = move-exception
            android.a.d.c r1 = new android.a.d.c
            r1.<init>(r0)
            goto L_0x0628
        L_0x0627:
            throw r1
        L_0x0628:
            goto L_0x0627
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p017a.p019b.C0093g.m47f(int, android.a.b.e, java.lang.Object[], java.util.Map, java.lang.Object[], android.a.b.b, java.text.FieldPosition):void");
    }

    /* renamed from: h */
    private final void m49h(String str, ParsePosition parsePosition, Object[] objArr, Map map) {
        String str2;
        Integer num;
        short s;
        String str3;
        String str4;
        Object obj;
        int i;
        Map map2;
        C0111d dVar;
        int i2;
        int i3;
        Format format;
        String str5 = str;
        ParsePosition parsePosition2 = parsePosition;
        Map map3 = map;
        if (str5 != null) {
            C0111d dVar2 = this.f260b;
            String str6 = dVar2.f315a;
            C0110c c = dVar2.mo76c(0);
            int i4 = c.f308a + c.f309b;
            int index = parsePosition.getIndex();
            ParsePosition parsePosition3 = new ParsePosition(0);
            boolean z = true;
            int i5 = 1;
            while (true) {
                C0110c c2 = this.f260b.mo76c(i5);
                int i6 = c2.f312e;
                int i7 = c2.f308a - i4;
                if (i7 == 0 || str6.regionMatches(i4, str5, index, i7)) {
                    index += i7;
                    if (i6 == 2) {
                        parsePosition2.setIndex(index);
                        return;
                    }
                    if (i6 == 3 || i6 == 4) {
                        str2 = str6;
                        i4 = c2.f308a + c2.f309b;
                    } else {
                        int b = this.f260b.mo75b(i5);
                        int a = c2.mo70a();
                        int i8 = i5 + 1;
                        C0110c c3 = this.f260b.mo76c(i8);
                        if (objArr != null) {
                            s = c3.f310c;
                            num = Integer.valueOf(s);
                            str3 = null;
                        } else {
                            if (c3.f312e == 9) {
                                str3 = this.f260b.mo79e(c3);
                            } else {
                                str3 = Integer.toString(c3.f310c);
                            }
                            num = str3;
                            s = 0;
                        }
                        int i9 = i8 + 1;
                        Map map4 = this.f261c;
                        if (map4 != null && (format = (Format) map4.get(Integer.valueOf(i9 - 2))) != null) {
                            parsePosition3.setIndex(index);
                            obj = format.parseObject(str5, parsePosition3);
                            if (parsePosition3.getIndex() == index) {
                                parsePosition2.setErrorIndex(index);
                                return;
                            }
                            index = parsePosition3.getIndex();
                            str2 = str6;
                            str4 = str3;
                        } else if (a == z || ((map2 = this.f261c) != null && map2.containsKey(Integer.valueOf(i9 - 2)))) {
                            str2 = str6;
                            str4 = str3;
                            StringBuilder sb = new StringBuilder();
                            C0111d dVar3 = this.f260b;
                            String str7 = dVar3.f315a;
                            C0110c c4 = dVar3.mo76c(b);
                            int i10 = c4.f308a + c4.f309b;
                            int i11 = b + 1;
                            while (true) {
                                C0110c c5 = this.f260b.mo76c(i11);
                                int i12 = c5.f312e;
                                sb.append(str7, i10, c5.f308a);
                                if (i12 == 6 || i12 == 2) {
                                    String sb2 = sb.toString();
                                } else {
                                    i11++;
                                    i10 = c5.f309b + c5.f308a;
                                }
                            }
                            String sb22 = sb.toString();
                            if (sb22.length() != 0) {
                                i = str5.indexOf(sb22, index);
                            } else {
                                i = str.length();
                            }
                            if (i < 0) {
                                parsePosition2.setErrorIndex(index);
                                return;
                            }
                            String substring = str5.substring(index, i);
                            boolean equals = substring.equals("{" + num.toString() + "}");
                            z = !equals;
                            obj = true == equals ? null : substring;
                            index = i;
                        } else if (a == 3) {
                            parsePosition3.setIndex(index);
                            C0111d dVar4 = this.f260b;
                            int index2 = parsePosition3.getIndex();
                            double d = Double.NaN;
                            int i13 = index2;
                            while (true) {
                                if (dVar4.mo82g(i9) == 7) {
                                    str2 = str6;
                                    str4 = str3;
                                    break;
                                }
                                double a2 = dVar4.mo74a(dVar4.mo76c(i9));
                                int i14 = i9 + 2;
                                int b2 = dVar4.mo75b(i14);
                                String str8 = dVar4.f315a;
                                str2 = str6;
                                C0110c c6 = dVar4.mo76c(i14);
                                int i15 = c6.f308a + c6.f309b;
                                int i16 = i14;
                                int i17 = 0;
                                while (true) {
                                    i16++;
                                    str4 = str3;
                                    C0110c c7 = dVar4.mo76c(i16);
                                    dVar = dVar4;
                                    if (i16 != b2) {
                                        if (c7.f312e != 3) {
                                            continue;
                                            Map map5 = map;
                                            str3 = str4;
                                            dVar4 = dVar;
                                        }
                                    }
                                    int i18 = c7.f308a - i15;
                                    if (i18 != 0 && !str5.regionMatches(index2, str8, i15, i18)) {
                                        i2 = -1;
                                        break;
                                    }
                                    i17 += i18;
                                    if (i16 == b2) {
                                        i2 = i17;
                                        break;
                                    }
                                    i15 = c7.f308a + c7.f309b;
                                    Map map52 = map;
                                    str3 = str4;
                                    dVar4 = dVar;
                                }
                                if (i2 >= 0 && (i3 = i2 + index2) > i13) {
                                    if (i3 == str.length()) {
                                        i13 = i3;
                                        d = a2;
                                        break;
                                    }
                                    i13 = i3;
                                    d = a2;
                                }
                                i9 = b2 + 1;
                                Map map6 = map;
                                str6 = str2;
                                str3 = str4;
                                dVar4 = dVar;
                            }
                            if (i13 == index2) {
                                parsePosition3.setErrorIndex(index2);
                            } else {
                                parsePosition3.setIndex(i13);
                            }
                            if (parsePosition3.getIndex() == index) {
                                parsePosition2.setErrorIndex(index);
                                return;
                            }
                            obj = Double.valueOf(d);
                            index = parsePosition3.getIndex();
                            z = true;
                        } else if (C0108a.m70b(a) || a == 5) {
                            throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                        } else {
                            throw new IllegalStateException("unexpected argType ".concat(C0108a.m69a(a)));
                        }
                        if (z) {
                            if (objArr != null) {
                                objArr[s] = obj;
                            } else {
                                Map map7 = map;
                                if (map7 != null) {
                                    map7.put(str4, obj);
                                }
                                C0110c c8 = this.f260b.mo76c(b);
                                i4 = c8.f308a + c8.f309b;
                                i5 = b;
                            }
                        }
                        Map map8 = map;
                        C0110c c82 = this.f260b.mo76c(b);
                        i4 = c82.f308a + c82.f309b;
                        i5 = b;
                    }
                    i5++;
                    str6 = str2;
                    z = true;
                } else {
                    parsePosition2.setErrorIndex(index);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final NumberFormat mo41b() {
        if (this.f263i == null) {
            this.f263i = NumberFormat.getInstance(this.f259a);
        }
        return this.f263i;
    }

    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        m45d(obj, new C0088b(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj != null) {
            StringBuilder sb = new StringBuilder();
            C0088b bVar = new C0088b(sb);
            bVar.f238c = new ArrayList();
            m45d(obj, bVar, (FieldPosition) null);
            AttributedString attributedString = new AttributedString(sb.toString());
            for (C0089c cVar : bVar.f238c) {
                attributedString.addAttribute(cVar.f239a, cVar.f240b, cVar.f241c, cVar.f242d);
            }
            return attributedString.getIterator();
        }
        throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
    }

    public final int hashCode() {
        return this.f260b.f315a.hashCode();
    }

    /* renamed from: e */
    private final void m46e(Object[] objArr, Map map, C0088b bVar, FieldPosition fieldPosition) {
        if (objArr == null || !this.f260b.f318d) {
            m47f(0, (C0091e) null, objArr, map, (Object[]) null, bVar, fieldPosition);
            return;
        }
        throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
    }

    /* renamed from: g */
    private final void m48g(int i, C0091e eVar, Object[] objArr, Map map, Object[] objArr2, C0088b bVar) {
        if (this.f260b.f319f != 2) {
            m47f(i, eVar, objArr, map, objArr2, bVar, (FieldPosition) null);
            return;
        }
        throw new UnsupportedOperationException("JDK apostrophe mode not supported");
    }

    public final Object parseObject(String str, ParsePosition parsePosition) {
        if (!this.f260b.f318d) {
            int i = 0;
            short s = -1;
            while (true) {
                if (i != 0) {
                    i = this.f260b.mo75b(i);
                }
                while (true) {
                    i++;
                    int g = this.f260b.mo82g(i);
                    if (g != 6) {
                        if (g == 2) {
                            i = -1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    break;
                }
                short s2 = this.f260b.mo76c(i + 1).f310c;
                if (s2 > s) {
                    s = s2;
                }
            }
            Object[] objArr = new Object[(s + 1)];
            int index = parsePosition.getIndex();
            m49h(str, parsePosition, objArr, (Map) null);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return objArr;
        }
        HashMap hashMap = new HashMap();
        int index2 = parsePosition.getIndex();
        m49h(str, parsePosition, (Object[]) null, hashMap);
        if (parsePosition.getIndex() == index2) {
            return null;
        }
        return hashMap;
    }
}
