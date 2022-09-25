package p5585l.p5586a.p5587a.p5588a;

import com.evernote.android.state.BuildConfig;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: l.a.a.a.b */
/* compiled from: PG */
public final class C71818b {

    /* renamed from: a */
    private final Pattern f191348a = Pattern.compile("\\n\\r?\\n\\Z", 32);

    /* renamed from: b */
    private final Pattern f191349b = Pattern.compile("\\A\\r?\\n\\r?\\n", 32);

    /* renamed from: c */
    protected static final int m105109c(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == 0 || length2 == 0) {
            return 0;
        }
        if (length > length2) {
            str = str.substring(length - length2);
        } else if (length < length2) {
            str2 = str2.substring(0, length);
        }
        int min = Math.min(length, length2);
        if (str.equals(str2)) {
            return min;
        }
        int i = 1;
        int i2 = 0;
        while (true) {
            int indexOf = str2.indexOf(str.substring(min - i));
            if (indexOf == -1) {
                return i2;
            }
            i += indexOf;
            if (indexOf == 0 || str.substring(min - i).equals(str2.substring(0, i))) {
                i2 = i;
                i++;
            }
        }
    }

    /* renamed from: d */
    public static final int m105110d(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        return min;
    }

    /* renamed from: e */
    public static final int m105111e(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int min = Math.min(length, length2);
        for (int i = 1; i <= min; i++) {
            if (str.charAt(length - i) != str2.charAt(length2 - i)) {
                return i - 1;
            }
        }
        return min;
    }

    /* renamed from: g */
    private final int m105112g(String str, String str2) {
        if (str.length() == 0 || str2.length() == 0) {
            return 6;
        }
        char charAt = str.charAt(str.length() - 1);
        char charAt2 = str2.charAt(0);
        boolean z = !Character.isLetterOrDigit(charAt);
        boolean z2 = !Character.isLetterOrDigit(charAt2);
        boolean z3 = z && Character.isWhitespace(charAt);
        boolean z4 = z2 && Character.isWhitespace(charAt2);
        boolean z5 = z3 && Character.getType(charAt) == 15;
        boolean z6 = z4 && Character.getType(charAt2) == 15;
        boolean z7 = z5 && this.f191348a.matcher(str).find();
        boolean z8 = z6 && this.f191349b.matcher(str2).find();
        if (z7 || z8) {
            return 5;
        }
        if (z5 || z6) {
            return 4;
        }
        if (z && !z3 && z4) {
            return 3;
        }
        if (z3 || z4) {
            return 2;
        }
        if (z || z2) {
            return 1;
        }
        return 0;
    }

    /* renamed from: h */
    private final LinkedList m105113h(String str, String str2, int i, int i2, long j) {
        String str3 = str;
        String str4 = str2;
        int i3 = i;
        int i4 = i2;
        String substring = str.substring(0, i);
        String substring2 = str2.substring(0, i2);
        String substring3 = str.substring(i);
        String substring4 = str2.substring(i2);
        LinkedList i5 = m105114i(substring, substring2, false, j);
        i5.addAll(m105114i(substring3, substring4, false, j));
        return i5;
    }

    /* renamed from: j */
    private static final String m105115j(String str, List list, Map map, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = -1;
        while (i3 < str.length() - 1) {
            i3 = str.indexOf(10, i2);
            if (i3 == -1) {
                i3 = str.length() - 1;
            }
            String substring = str.substring(i2, i3 + 1);
            if (map.containsKey(substring)) {
                sb.append(String.valueOf((char) ((Integer) map.get(substring)).intValue()));
            } else {
                if (list.size() == i) {
                    substring = str.substring(i2);
                    i3 = str.length();
                }
                list.add(substring);
                map.put(substring, Integer.valueOf(list.size() - 1));
                sb.append(String.valueOf((char) (list.size() - 1)));
            }
            i2 = i3 + 1;
        }
        return sb.toString();
    }

    /* renamed from: k */
    private static final String[] m105116k(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        String substring = str3.substring(i2, (str.length() / 4) + i2);
        String str5 = BuildConfig.FLAVOR;
        int i3 = -1;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        int i4 = -1;
        while (true) {
            i4 = str4.indexOf(substring, i4 + 1);
            if (i4 == i3) {
                break;
            }
            int d = m105110d(str3.substring(i2), str4.substring(i4));
            int e = m105111e(str3.substring(0, i2), str4.substring(0, i4));
            if (str5.length() < e + d) {
                int i5 = i4 - e;
                int i6 = i4 + d;
                String concat = String.valueOf(str4.substring(i5, i4)).concat(String.valueOf(str4.substring(i4, i6)));
                String substring2 = str3.substring(0, i2 - e);
                String substring3 = str3.substring(i2 + d);
                String substring4 = str4.substring(0, i5);
                str9 = str4.substring(i6);
                String str10 = substring3;
                str8 = substring4;
                str5 = concat;
                str6 = substring2;
                str7 = str10;
            }
            i3 = -1;
        }
        int length = str5.length();
        if (length + length < str.length()) {
            return null;
        }
        return new String[]{str6, str7, str8, str9, str5};
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63054a(java.util.LinkedList r17) {
        /*
            r16 = this;
            l.a.a.a.a r0 = new l.a.a.a.a
            r1 = 3
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            r3 = r17
            r3.add(r0)
            java.util.ListIterator r0 = r17.listIterator()
            java.lang.Object r4 = r0.next()
            l.a.a.a.a r4 = (p5585l.p5586a.p5587a.p5588a.C71817a) r4
            r5 = 0
            r6 = 0
            r8 = r2
            r9 = r8
            r11 = r6
            r7 = 0
            r10 = 0
        L_0x001e:
            r12 = 1
            if (r4 == 0) goto L_0x0152
            int r13 = r4.f191347b
            int r14 = r13 + -1
            if (r13 == 0) goto L_0x0151
            if (r14 == 0) goto L_0x0133
            if (r14 == r12) goto L_0x0126
            r13 = 2
            if (r14 == r13) goto L_0x0030
            goto L_0x0140
        L_0x0030:
            int r14 = r7 + r10
            if (r14 <= r12) goto L_0x0100
            if (r7 == 0) goto L_0x003d
            if (r10 == 0) goto L_0x003a
            r4 = 1
            goto L_0x003e
        L_0x003a:
            r4 = 0
            r10 = 0
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r0.previous()
        L_0x0041:
            int r11 = r7 + -1
            if (r7 <= 0) goto L_0x004d
            r0.previous()
            r0.remove()
            r7 = r11
            goto L_0x0041
        L_0x004d:
            int r7 = r10 + -1
            if (r10 <= 0) goto L_0x0059
            r0.previous()
            r0.remove()
            r10 = r7
            goto L_0x004d
        L_0x0059:
            if (r4 == 0) goto L_0x00d5
            int r4 = m105110d(r9, r8)
            if (r4 == 0) goto L_0x009b
            boolean r7 = r0.hasPrevious()
            if (r7 == 0) goto L_0x0085
            java.lang.Object r7 = r0.previous()
            l.a.a.a.a r7 = (p5585l.p5586a.p5587a.p5588a.C71817a) r7
            java.lang.String r10 = r7.f191346a
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = r9.substring(r5, r4)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r10 = r10.concat(r11)
            r7.f191346a = r10
            r0.next()
            goto L_0x0091
        L_0x0085:
            l.a.a.a.a r7 = new l.a.a.a.a
            java.lang.String r10 = r9.substring(r5, r4)
            r7.<init>(r1, r10)
            r0.add(r7)
        L_0x0091:
            java.lang.String r7 = r9.substring(r4)
            java.lang.String r4 = r8.substring(r4)
            r8 = r4
            r9 = r7
        L_0x009b:
            int r4 = m105111e(r9, r8)
            if (r4 == 0) goto L_0x00d5
            java.lang.Object r7 = r0.next()
            l.a.a.a.a r7 = (p5585l.p5586a.p5587a.p5588a.C71817a) r7
            int r10 = r9.length()
            int r10 = r10 - r4
            java.lang.String r10 = r9.substring(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = r7.f191346a
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r10 = r10.concat(r11)
            r7.f191346a = r10
            int r7 = r9.length()
            int r7 = r7 - r4
            java.lang.String r9 = r9.substring(r5, r7)
            int r7 = r8.length()
            int r7 = r7 - r4
            java.lang.String r8 = r8.substring(r5, r7)
            r0.previous()
        L_0x00d5:
            int r4 = r8.length()
            if (r4 == 0) goto L_0x00e3
            l.a.a.a.a r4 = new l.a.a.a.a
            r4.<init>(r12, r8)
            r0.add(r4)
        L_0x00e3:
            int r4 = r9.length()
            if (r4 == 0) goto L_0x00f1
            l.a.a.a.a r4 = new l.a.a.a.a
            r4.<init>(r13, r9)
            r0.add(r4)
        L_0x00f1:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00fe
            java.lang.Object r4 = r0.next()
            l.a.a.a.a r4 = (p5585l.p5586a.p5587a.p5588a.C71817a) r4
            goto L_0x0120
        L_0x00fe:
            r4 = r6
            goto L_0x0120
        L_0x0100:
            if (r11 == 0) goto L_0x0120
            java.lang.String r7 = r11.f191346a
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r4 = r4.f191346a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r7.concat(r4)
            r11.f191346a = r4
            r0.remove()
            java.lang.Object r4 = r0.previous()
            l.a.a.a.a r4 = (p5585l.p5586a.p5587a.p5588a.C71817a) r4
            r0.next()
        L_0x0120:
            r8 = r2
            r9 = r8
            r11 = r4
            r7 = 0
            r10 = 0
            goto L_0x0140
        L_0x0126:
            int r10 = r10 + 1
            java.lang.String r4 = r4.f191346a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r9 = r9.concat(r4)
            goto L_0x013f
        L_0x0133:
            int r7 = r7 + 1
            java.lang.String r4 = r4.f191346a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r8 = r8.concat(r4)
        L_0x013f:
            r11 = r6
        L_0x0140:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x014e
            java.lang.Object r4 = r0.next()
            l.a.a.a.a r4 = (p5585l.p5586a.p5587a.p5588a.C71817a) r4
            goto L_0x001e
        L_0x014e:
            r4 = r6
            goto L_0x001e
        L_0x0151:
            throw r6
        L_0x0152:
            java.lang.Object r0 = r17.getLast()
            l.a.a.a.a r0 = (p5585l.p5586a.p5587a.p5588a.C71817a) r0
            java.lang.String r0 = r0.f191346a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0163
            r17.removeLast()
        L_0x0163:
            java.util.ListIterator r0 = r17.listIterator()
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0174
            java.lang.Object r2 = r0.next()
            l.a.a.a.a r2 = (p5585l.p5586a.p5587a.p5588a.C71817a) r2
            goto L_0x0175
        L_0x0174:
            r2 = r6
        L_0x0175:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0182
            java.lang.Object r4 = r0.next()
            l.a.a.a.a r4 = (p5585l.p5586a.p5587a.p5588a.C71817a) r4
            goto L_0x0183
        L_0x0182:
            r4 = r6
        L_0x0183:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0190
            java.lang.Object r7 = r0.next()
            l.a.a.a.a r7 = (p5585l.p5586a.p5587a.p5588a.C71817a) r7
            goto L_0x0191
        L_0x0190:
            r7 = r6
        L_0x0191:
            r8 = 0
        L_0x0192:
            if (r7 == 0) goto L_0x025f
            int r9 = r2.f191347b
            if (r9 != r1) goto L_0x024c
            int r9 = r7.f191347b
            if (r9 != r1) goto L_0x024c
            java.lang.String r9 = r4.f191346a
            java.lang.String r10 = r2.f191346a
            boolean r9 = r9.endsWith(r10)
            if (r9 == 0) goto L_0x01fe
            java.lang.String r8 = r2.f191346a
            java.lang.String r9 = r4.f191346a
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r10 = r9.length()
            java.lang.String r11 = r2.f191346a
            int r11 = r11.length()
            int r10 = r10 - r11
            java.lang.String r9 = r9.substring(r5, r10)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r8 = r8.concat(r9)
            r4.f191346a = r8
            java.lang.String r2 = r2.f191346a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = r7.f191346a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r2.concat(r4)
            r7.f191346a = r2
            r0.previous()
            r0.previous()
            r0.previous()
            r0.remove()
            r0.next()
            java.lang.Object r2 = r0.next()
            l.a.a.a.a r2 = (p5585l.p5586a.p5587a.p5588a.C71817a) r2
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01fb
            java.lang.Object r4 = r0.next()
            l.a.a.a.a r4 = (p5585l.p5586a.p5587a.p5588a.C71817a) r4
            goto L_0x01fc
        L_0x01fb:
            r4 = r6
        L_0x01fc:
            r8 = 1
            goto L_0x024e
        L_0x01fe:
            java.lang.String r9 = r4.f191346a
            java.lang.String r10 = r7.f191346a
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x024c
            java.lang.String r8 = r2.f191346a
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = r7.f191346a
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r8 = r8.concat(r9)
            r2.f191346a = r8
            java.lang.String r2 = r4.f191346a
            java.lang.String r8 = r7.f191346a
            int r8 = r8.length()
            java.lang.String r2 = r2.substring(r8)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r7 = r7.f191346a
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r2 = r2.concat(r7)
            r4.f191346a = r2
            r0.remove()
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0246
            java.lang.Object r2 = r0.next()
            l.a.a.a.a r2 = (p5585l.p5586a.p5587a.p5588a.C71817a) r2
            goto L_0x0247
        L_0x0246:
            r2 = r6
        L_0x0247:
            r8 = 1
            r15 = r4
            r4 = r2
            r2 = r15
            goto L_0x024e
        L_0x024c:
            r2 = r4
            r4 = r7
        L_0x024e:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x025c
            java.lang.Object r7 = r0.next()
            l.a.a.a.a r7 = (p5585l.p5586a.p5587a.p5588a.C71817a) r7
            goto L_0x0192
        L_0x025c:
            r7 = r6
            goto L_0x0192
        L_0x025f:
            if (r8 == 0) goto L_0x0264
            r16.mo63054a(r17)
        L_0x0264:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5585l.p5586a.p5587a.p5588a.C71818b.mo63054a(java.util.LinkedList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0237, code lost:
        if (r11 >= (r14 / 2.0d)) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0274, code lost:
        if (r11 >= (r14 / 2.0d)) goto L_0x027b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0205  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63055b(java.util.LinkedList r19) {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r19.isEmpty()
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.Stack r1 = new java.util.Stack
            r1.<init>()
            java.util.ListIterator r2 = r19.listIterator()
            java.lang.Object r3 = r2.next()
            l.a.a.a.a r3 = (p5585l.p5586a.p5587a.p5588a.C71817a) r3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x001f:
            r12 = 2
            r13 = 3
            r14 = 1
            if (r3 == 0) goto L_0x00bb
            int r15 = r3.f191347b
            if (r15 != r13) goto L_0x0033
            r1.push(r3)
            java.lang.String r9 = r3.f191346a
            r10 = r7
            r11 = r8
            r7 = 0
            r8 = 0
            goto L_0x00aa
        L_0x0033:
            if (r15 != r12) goto L_0x003d
            java.lang.String r13 = r3.f191346a
            int r13 = r13.length()
            int r7 = r7 + r13
            goto L_0x0044
        L_0x003d:
            java.lang.String r13 = r3.f191346a
            int r13 = r13.length()
            int r8 = r8 + r13
        L_0x0044:
            if (r9 == 0) goto L_0x00aa
            int r13 = r9.length()
            int r15 = java.lang.Math.max(r10, r11)
            if (r13 > r15) goto L_0x00aa
            int r13 = r9.length()
            int r15 = java.lang.Math.max(r7, r8)
            if (r13 > r15) goto L_0x00aa
        L_0x005a:
            java.lang.Object r6 = r1.lastElement()
            if (r3 == r6) goto L_0x0067
            java.lang.Object r3 = r2.previous()
            l.a.a.a.a r3 = (p5585l.p5586a.p5587a.p5588a.C71817a) r3
            goto L_0x005a
        L_0x0067:
            r2.next()
            l.a.a.a.a r3 = new l.a.a.a.a
            r3.<init>(r14, r9)
            r2.set(r3)
            l.a.a.a.a r3 = new l.a.a.a.a
            r3.<init>(r12, r9)
            r2.add(r3)
            r1.pop()
            boolean r3 = r1.empty()
            if (r3 != 0) goto L_0x0086
            r1.pop()
        L_0x0086:
            boolean r3 = r1.empty()
            if (r3 == 0) goto L_0x009d
        L_0x008c:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L_0x0096
            r2.previous()
            goto L_0x008c
        L_0x0096:
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            goto L_0x00aa
        L_0x009d:
            java.lang.Object r3 = r1.lastElement()
            l.a.a.a.a r3 = (p5585l.p5586a.p5587a.p5588a.C71817a) r3
        L_0x00a3:
            java.lang.Object r6 = r2.previous()
            if (r3 != r6) goto L_0x00a3
            goto L_0x0096
        L_0x00aa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00b8
            java.lang.Object r3 = r2.next()
            l.a.a.a.a r3 = (p5585l.p5586a.p5587a.p5588a.C71817a) r3
            goto L_0x001f
        L_0x00b8:
            r3 = 0
            goto L_0x001f
        L_0x00bb:
            if (r6 == 0) goto L_0x00c0
            r18.mo63054a(r19)
        L_0x00c0:
            java.util.ListIterator r1 = r19.listIterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d1
            java.lang.Object r2 = r1.next()
            l.a.a.a.a r2 = (p5585l.p5586a.p5587a.p5588a.C71817a) r2
            goto L_0x00d2
        L_0x00d1:
            r2 = 0
        L_0x00d2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00df
            java.lang.Object r3 = r1.next()
            l.a.a.a.a r3 = (p5585l.p5586a.p5587a.p5588a.C71817a) r3
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00ed
            java.lang.Object r6 = r1.next()
            l.a.a.a.a r6 = (p5585l.p5586a.p5587a.p5588a.C71817a) r6
            goto L_0x00ee
        L_0x00ed:
            r6 = 0
        L_0x00ee:
            if (r6 == 0) goto L_0x01e4
            int r7 = r2.f191347b
            if (r7 != r13) goto L_0x01cf
            int r7 = r6.f191347b
            if (r7 != r13) goto L_0x01cf
            java.lang.String r7 = r2.f191346a
            java.lang.String r8 = r3.f191346a
            java.lang.String r9 = r6.f191346a
            int r10 = m105111e(r7, r8)
            if (r10 == 0) goto L_0x0138
            int r11 = r8.length()
            int r11 = r11 - r10
            java.lang.String r11 = r8.substring(r11)
            int r15 = r7.length()
            int r15 = r15 - r10
            java.lang.String r7 = r7.substring(r5, r15)
            java.lang.String r15 = java.lang.String.valueOf(r11)
            int r16 = r8.length()
            int r10 = r16 - r10
            java.lang.String r8 = r8.substring(r5, r10)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r15.concat(r8)
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r10.concat(r9)
        L_0x0138:
            int r10 = r0.m105112g(r7, r8)
            int r11 = r0.m105112g(r8, r9)
            int r10 = r10 + r11
            r11 = r9
            r15 = r11
            r4 = r10
            r9 = r8
            r10 = r9
            r8 = r7
        L_0x0147:
            int r17 = r9.length()
            if (r17 == 0) goto L_0x019d
            int r17 = r11.length()
            if (r17 == 0) goto L_0x019d
            char r13 = r9.charAt(r5)
            char r12 = r11.charAt(r5)
            if (r13 != r12) goto L_0x019d
            char r12 = r9.charAt(r5)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r12)
            java.lang.String r8 = r13.toString()
            java.lang.String r9 = r9.substring(r14)
            char r12 = r11.charAt(r5)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r12)
            java.lang.String r9 = r13.toString()
            java.lang.String r11 = r11.substring(r14)
            int r12 = r0.m105112g(r8, r9)
            int r13 = r0.m105112g(r9, r11)
            int r12 = r12 + r13
            if (r12 < r4) goto L_0x019a
            r7 = r8
            r10 = r9
            r15 = r11
            r4 = r12
        L_0x019a:
            r12 = 2
            r13 = 3
            goto L_0x0147
        L_0x019d:
            java.lang.String r4 = r2.f191346a
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x01cf
            int r4 = r7.length()
            if (r4 == 0) goto L_0x01ae
            r2.f191346a = r7
            goto L_0x01c0
        L_0x01ae:
            r1.previous()
            r1.previous()
            r1.previous()
            r1.remove()
            r1.next()
            r1.next()
        L_0x01c0:
            r3.f191346a = r10
            int r4 = r15.length()
            if (r4 == 0) goto L_0x01cb
            r6.f191346a = r15
            goto L_0x01cf
        L_0x01cb:
            r1.remove()
            goto L_0x01d1
        L_0x01cf:
            r2 = r3
            r3 = r6
        L_0x01d1:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01df
            java.lang.Object r4 = r1.next()
            l.a.a.a.a r4 = (p5585l.p5586a.p5587a.p5588a.C71817a) r4
            r6 = r4
            goto L_0x01e0
        L_0x01df:
            r6 = 0
        L_0x01e0:
            r12 = 2
            r13 = 3
            goto L_0x00ee
        L_0x01e4:
            java.util.ListIterator r1 = r19.listIterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0201
            java.lang.Object r2 = r1.next()
            l.a.a.a.a r2 = (p5585l.p5586a.p5587a.p5588a.C71817a) r2
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0202
            java.lang.Object r3 = r1.next()
            l.a.a.a.a r3 = (p5585l.p5586a.p5587a.p5588a.C71817a) r3
            goto L_0x0203
        L_0x0201:
            r2 = 0
        L_0x0202:
            r3 = 0
        L_0x0203:
            if (r3 == 0) goto L_0x02c8
            int r4 = r2.f191347b
            if (r4 != r14) goto L_0x02b1
            int r4 = r3.f191347b
            r6 = 2
            if (r4 != r6) goto L_0x02b1
            java.lang.String r4 = r2.f191346a
            java.lang.String r6 = r3.f191346a
            int r7 = m105109c(r4, r6)
            int r8 = m105109c(r6, r4)
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r7 < r8) goto L_0x025b
            double r11 = (double) r7
            int r8 = r4.length()
            double r14 = (double) r8
            java.lang.Double.isNaN(r14)
            double r14 = r14 / r9
            int r8 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x0239
            int r8 = r6.length()
            double r14 = (double) r8
            java.lang.Double.isNaN(r14)
            double r14 = r14 / r9
            int r8 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x0277
        L_0x0239:
            r1.previous()
            l.a.a.a.a r8 = new l.a.a.a.a
            java.lang.String r9 = r6.substring(r5, r7)
            r10 = 3
            r8.<init>(r10, r9)
            r1.add(r8)
            int r8 = r4.length()
            int r8 = r8 - r7
            java.lang.String r4 = r4.substring(r5, r8)
            r2.f191346a = r4
            java.lang.String r2 = r6.substring(r7)
            r3.f191346a = r2
            goto L_0x0277
        L_0x025b:
            double r11 = (double) r8
            int r7 = r4.length()
            double r14 = (double) r7
            java.lang.Double.isNaN(r14)
            double r14 = r14 / r9
            int r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x027b
            int r7 = r6.length()
            double r14 = (double) r7
            java.lang.Double.isNaN(r14)
            double r14 = r14 / r9
            int r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r7 < 0) goto L_0x0277
            goto L_0x027b
        L_0x0277:
            r2 = 1
            r7 = 2
            r10 = 3
            goto L_0x02a2
        L_0x027b:
            r1.previous()
            l.a.a.a.a r7 = new l.a.a.a.a
            java.lang.String r9 = r4.substring(r5, r8)
            r10 = 3
            r7.<init>(r10, r9)
            r1.add(r7)
            r7 = 2
            r2.f191347b = r7
            int r9 = r6.length()
            int r9 = r9 - r8
            java.lang.String r6 = r6.substring(r5, r9)
            r2.f191346a = r6
            r2 = 1
            r3.f191347b = r2
            java.lang.String r4 = r4.substring(r8)
            r3.f191346a = r4
        L_0x02a2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02af
            java.lang.Object r3 = r1.next()
            l.a.a.a.a r3 = (p5585l.p5586a.p5587a.p5588a.C71817a) r3
            goto L_0x02b4
        L_0x02af:
            r3 = 0
            goto L_0x02b4
        L_0x02b1:
            r2 = 1
            r7 = 2
            r10 = 3
        L_0x02b4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02c3
            java.lang.Object r4 = r1.next()
            l.a.a.a.a r4 = (p5585l.p5586a.p5587a.p5588a.C71817a) r4
            r2 = r3
            r3 = r4
            goto L_0x02c5
        L_0x02c3:
            r2 = r3
            r3 = 0
        L_0x02c5:
            r14 = 1
            goto L_0x0203
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5585l.p5586a.p5587a.p5588a.C71818b.mo63055b(java.util.LinkedList):void");
    }

    /* renamed from: f */
    public final LinkedList mo63056f(String str, String str2) {
        return m105114i(str, str2, true, 1000 + System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ef, code lost:
        if (r6[r12 - 1] < r6[r12 + 1]) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0358, code lost:
        r22 = r9;
        r23 = r10;
        r29 = r15;
        r7 = r11 + r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0362, code lost:
        if (r7 > (r29 - r20)) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0364, code lost:
        r9 = r4 + r7;
        r15 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0368, code lost:
        if (r7 == r11) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036a, code lost:
        if (r7 == r15) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0374, code lost:
        if (r8[r9 - 1] >= r8[r9 + 1]) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0377, code lost:
        r10 = r8[r9 - 1] + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x037e, code lost:
        r10 = r8[r9 + 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0382, code lost:
        r12 = r10 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0384, code lost:
        if (r10 >= r0) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0386, code lost:
        if (r12 >= r1) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0388, code lost:
        r29 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x039c, code lost:
        if (r3.charAt((r0 - r10) - 1) != r2.charAt((r1 - r12) - 1)) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x039e, code lost:
        r10 = r10 + 1;
        r12 = r12 + 1;
        r11 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a5, code lost:
        r29 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a7, code lost:
        r8[r9] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a9, code lost:
        if (r10 <= r0) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ab, code lost:
        r20 = r20 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03af, code lost:
        if (r12 <= r1) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03b1, code lost:
        r19 = r19 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03b4, code lost:
        if (r16 != 0) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b6, code lost:
        r9 = (r4 + r14) - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03b9, code lost:
        if (r9 < 0) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03bb, code lost:
        if (r9 >= r5) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03bd, code lost:
        r11 = r6[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03c0, code lost:
        if (r11 == -1) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03c2, code lost:
        r9 = (r4 + r11) - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c8, code lost:
        if (r11 < (r0 - r10)) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ca, code lost:
        r0 = m105113h(r3, r2, r11, r9, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03d6, code lost:
        r7 = r7 + 2;
        r11 = r29;
        r29 = r15;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0197  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.LinkedList m105114i(java.lang.String r27, java.lang.String r28, boolean r29, long r30) {
        /*
            r26 = this;
            r7 = r26
            r0 = r27
            r1 = r28
            if (r0 == 0) goto L_0x0431
            if (r1 == 0) goto L_0x0431
            boolean r2 = r27.equals(r28)
            r8 = 3
            if (r2 == 0) goto L_0x0025
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            int r2 = r27.length()
            if (r2 == 0) goto L_0x0024
            l.a.a.a.a r2 = new l.a.a.a.a
            r2.<init>(r8, r0)
            r1.add(r2)
        L_0x0024:
            return r1
        L_0x0025:
            int r2 = m105110d(r27, r28)
            r6 = 0
            java.lang.String r9 = r0.substring(r6, r2)
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r1 = r1.substring(r2)
            int r2 = m105111e(r0, r1)
            int r3 = r0.length()
            int r3 = r3 - r2
            java.lang.String r10 = r0.substring(r3)
            int r3 = r0.length()
            int r3 = r3 - r2
            java.lang.String r3 = r0.substring(r6, r3)
            int r0 = r1.length()
            int r0 = r0 - r2
            java.lang.String r2 = r1.substring(r6, r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            int r1 = r3.length()
            r11 = 2
            if (r1 != 0) goto L_0x006b
            l.a.a.a.a r1 = new l.a.a.a.a
            r1.<init>(r11, r2)
            r0.add(r1)
            goto L_0x00e3
        L_0x006b:
            int r1 = r2.length()
            r12 = 1
            if (r1 != 0) goto L_0x007b
            l.a.a.a.a r1 = new l.a.a.a.a
            r1.<init>(r12, r3)
            r0.add(r1)
            goto L_0x00e3
        L_0x007b:
            int r1 = r3.length()
            int r4 = r2.length()
            if (r1 <= r4) goto L_0x0087
            r1 = r3
            goto L_0x0088
        L_0x0087:
            r1 = r2
        L_0x0088:
            int r4 = r3.length()
            int r5 = r2.length()
            if (r4 <= r5) goto L_0x0094
            r4 = r2
            goto L_0x0095
        L_0x0094:
            r4 = r3
        L_0x0095:
            int r5 = r1.indexOf(r4)
            r13 = -1
            if (r5 == r13) goto L_0x00cd
            int r3 = r3.length()
            int r2 = r2.length()
            if (r3 <= r2) goto L_0x00a7
            r11 = 1
        L_0x00a7:
            l.a.a.a.a r2 = new l.a.a.a.a
            java.lang.String r3 = r1.substring(r6, r5)
            r2.<init>(r11, r3)
            r0.add(r2)
            l.a.a.a.a r2 = new l.a.a.a.a
            r2.<init>(r8, r4)
            r0.add(r2)
            l.a.a.a.a r2 = new l.a.a.a.a
            int r3 = r4.length()
            int r5 = r5 + r3
            java.lang.String r1 = r1.substring(r5)
            r2.<init>(r11, r1)
            r0.add(r2)
            goto L_0x00e3
        L_0x00cd:
            int r1 = r4.length()
            if (r1 != r12) goto L_0x00e9
            l.a.a.a.a r1 = new l.a.a.a.a
            r1.<init>(r12, r3)
            r0.add(r1)
            l.a.a.a.a r1 = new l.a.a.a.a
            r1.<init>(r11, r2)
            r0.add(r1)
        L_0x00e3:
            r22 = r9
            r23 = r10
            goto L_0x0408
        L_0x00e9:
            int r0 = r3.length()
            int r1 = r2.length()
            if (r0 <= r1) goto L_0x00f5
            r0 = r3
            goto L_0x00f6
        L_0x00f5:
            r0 = r2
        L_0x00f6:
            int r1 = r3.length()
            int r4 = r2.length()
            if (r1 <= r4) goto L_0x0102
            r1 = r2
            goto L_0x0103
        L_0x0102:
            r1 = r3
        L_0x0103:
            int r4 = r0.length()
            r14 = 0
            r5 = 4
            if (r4 < r5) goto L_0x0168
            int r4 = r1.length()
            int r4 = r4 + r4
            int r15 = r0.length()
            if (r4 >= r15) goto L_0x0117
            goto L_0x0168
        L_0x0117:
            int r4 = r0.length()
            int r4 = r4 + r8
            int r4 = r4 / r5
            java.lang.String[] r4 = m105116k(r0, r1, r4)
            int r15 = r0.length()
            int r15 = r15 + r12
            int r15 = r15 / r11
            java.lang.String[] r0 = m105116k(r0, r1, r15)
            if (r4 != 0) goto L_0x0130
            if (r0 != 0) goto L_0x0130
            goto L_0x0168
        L_0x0130:
            if (r0 != 0) goto L_0x0133
            goto L_0x0145
        L_0x0133:
            if (r4 == 0) goto L_0x0144
            r1 = r4[r5]
            int r1 = r1.length()
            r15 = r0[r5]
            int r15 = r15.length()
            if (r1 <= r15) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r4 = r0
        L_0x0145:
            int r0 = r3.length()
            int r1 = r2.length()
            if (r0 > r1) goto L_0x0169
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r4[r11]
            r0[r6] = r1
            r1 = r4[r8]
            r0[r12] = r1
            r1 = r4[r6]
            r0[r11] = r1
            r1 = r4[r12]
            r0[r8] = r1
            r1 = r4[r5]
            r0[r5] = r1
            r4 = r0
            goto L_0x0169
        L_0x0168:
            r4 = r14
        L_0x0169:
            if (r4 == 0) goto L_0x0197
            r1 = r4[r6]
            r6 = r4[r12]
            r2 = r4[r11]
            r11 = r4[r8]
            r12 = r4[r5]
            r0 = r26
            r3 = r29
            r4 = r30
            java.util.LinkedList r13 = r0.m105114i(r1, r2, r3, r4)
            r1 = r6
            r2 = r11
            java.util.LinkedList r0 = r0.m105114i(r1, r2, r3, r4)
            l.a.a.a.a r1 = new l.a.a.a.a
            r1.<init>(r8, r12)
            r13.add(r1)
            r13.addAll(r0)
            r22 = r9
            r23 = r10
            r0 = r13
            goto L_0x0408
        L_0x0197:
            if (r29 == 0) goto L_0x029b
            int r0 = r3.length()
            r1 = 100
            if (r0 <= r1) goto L_0x029b
            int r0 = r2.length()
            if (r0 <= r1) goto L_0x029b
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r15 = ""
            r13.add(r15)
            r1 = 40000(0x9c40, float:5.6052E-41)
            java.lang.String r1 = m105115j(r3, r13, r0, r1)
            r3 = 65535(0xffff, float:9.1834E-41)
            java.lang.String r2 = m105115j(r2, r13, r0, r3)
            r3 = 0
            r0 = r26
            r4 = r30
            java.util.LinkedList r4 = r0.m105114i(r1, r2, r3, r4)
            java.util.Iterator r0 = r4.iterator()
        L_0x01d1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0204
            java.lang.Object r1 = r0.next()
            l.a.a.a.a r1 = (p5585l.p5586a.p5587a.p5588a.C71817a) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L_0x01e3:
            java.lang.String r5 = r1.f191346a
            int r5 = r5.length()
            if (r3 >= r5) goto L_0x01fd
            java.lang.String r5 = r1.f191346a
            char r5 = r5.charAt(r3)
            java.lang.Object r5 = r13.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r2.append(r5)
            int r3 = r3 + 1
            goto L_0x01e3
        L_0x01fd:
            java.lang.String r2 = r2.toString()
            r1.f191346a = r2
            goto L_0x01d1
        L_0x0204:
            r7.mo63055b(r4)
            l.a.a.a.a r0 = new l.a.a.a.a
            r0.<init>(r8, r15)
            r4.add(r0)
            java.util.ListIterator r13 = r4.listIterator()
            java.lang.Object r0 = r13.next()
            l.a.a.a.a r0 = (p5585l.p5586a.p5587a.p5588a.C71817a) r0
            r1 = r15
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x021d:
            if (r0 == 0) goto L_0x0294
            int r8 = r0.f191347b
            int r6 = r8 + -1
            if (r8 == 0) goto L_0x0293
            if (r6 == 0) goto L_0x0274
            if (r6 == r12) goto L_0x0266
            if (r6 == r11) goto L_0x022d
            r6 = r4
            goto L_0x0281
        L_0x022d:
            if (r3 <= 0) goto L_0x0260
            if (r5 <= 0) goto L_0x0260
            r13.previous()
            r0 = 0
        L_0x0235:
            int r6 = r3 + r5
            if (r0 >= r6) goto L_0x0242
            r13.previous()
            r13.remove()
            int r0 = r0 + 1
            goto L_0x0235
        L_0x0242:
            r3 = 0
            r0 = r26
            r6 = r4
            r4 = r30
            java.util.LinkedList r0 = r0.m105114i(r1, r2, r3, r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0250:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0261
            java.lang.Object r1 = r0.next()
            l.a.a.a.a r1 = (p5585l.p5586a.p5587a.p5588a.C71817a) r1
            r13.add(r1)
            goto L_0x0250
        L_0x0260:
            r6 = r4
        L_0x0261:
            r1 = r15
            r2 = r1
            r3 = 0
            r5 = 0
            goto L_0x0281
        L_0x0266:
            r6 = r4
            int r5 = r5 + 1
            java.lang.String r0 = r0.f191346a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.concat(r0)
            goto L_0x0281
        L_0x0274:
            r6 = r4
            int r3 = r3 + 1
            java.lang.String r0 = r0.f191346a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r0)
        L_0x0281:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x028e
            java.lang.Object r0 = r13.next()
            l.a.a.a.a r0 = (p5585l.p5586a.p5587a.p5588a.C71817a) r0
            goto L_0x028f
        L_0x028e:
            r0 = r14
        L_0x028f:
            r4 = r6
            r6 = 0
            r8 = 3
            goto L_0x021d
        L_0x0293:
            throw r14
        L_0x0294:
            r6 = r4
            r6.removeLast()
            r0 = r6
            goto L_0x00e3
        L_0x029b:
            int r0 = r3.length()
            int r1 = r2.length()
            int r4 = r0 + r1
            int r4 = r4 + r12
            int r4 = r4 / r11
            int r5 = r4 + r4
            int[] r6 = new int[r5]
            int[] r8 = new int[r5]
            r14 = 0
        L_0x02ae:
            if (r14 >= r5) goto L_0x02b7
            r6[r14] = r13
            r8[r14] = r13
            int r14 = r14 + 1
            goto L_0x02ae
        L_0x02b7:
            int r14 = r4 + 1
            r15 = 0
            r6[r14] = r15
            r8[r14] = r15
            int r14 = r0 - r1
            int r16 = r14 % 2
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x02ca:
            if (r15 >= r4) goto L_0x03ed
            long r21 = java.lang.System.currentTimeMillis()
            int r23 = (r21 > r30 ? 1 : (r21 == r30 ? 0 : -1))
            if (r23 <= 0) goto L_0x02d6
            goto L_0x03ed
        L_0x02d6:
            int r11 = -r15
            int r21 = r11 + r17
            r13 = r21
        L_0x02db:
            int r12 = r15 - r18
            if (r13 > r12) goto L_0x0358
            int r12 = r4 + r13
            if (r13 == r11) goto L_0x02fb
            if (r13 == r15) goto L_0x02f2
            int r22 = r12 + -1
            r7 = r6[r22]
            int r22 = r12 + 1
            r23 = r10
            r10 = r6[r22]
            if (r7 >= r10) goto L_0x02f4
            goto L_0x02fd
        L_0x02f2:
            r23 = r10
        L_0x02f4:
            int r7 = r12 + -1
            r7 = r6[r7]
            r10 = 1
            int r7 = r7 + r10
            goto L_0x0301
        L_0x02fb:
            r23 = r10
        L_0x02fd:
            int r7 = r12 + 1
            r7 = r6[r7]
        L_0x0301:
            int r10 = r7 - r13
        L_0x0303:
            if (r7 >= r0) goto L_0x031e
            if (r10 >= r1) goto L_0x031e
            r22 = r9
            char r9 = r3.charAt(r7)
            r29 = r15
            char r15 = r2.charAt(r10)
            if (r9 != r15) goto L_0x0322
            int r7 = r7 + 1
            int r10 = r10 + 1
            r15 = r29
            r9 = r22
            goto L_0x0303
        L_0x031e:
            r22 = r9
            r29 = r15
        L_0x0322:
            r6[r12] = r7
            if (r7 <= r0) goto L_0x0329
            int r18 = r18 + 2
            goto L_0x034d
        L_0x0329:
            if (r10 <= r1) goto L_0x032e
            int r17 = r17 + 2
            goto L_0x034d
        L_0x032e:
            if (r16 == 0) goto L_0x034d
            int r9 = r4 + r14
            int r9 = r9 - r13
            if (r9 < 0) goto L_0x034d
            if (r9 >= r5) goto L_0x034d
            r9 = r8[r9]
            r12 = -1
            if (r9 == r12) goto L_0x034d
            int r9 = r0 - r9
            if (r7 < r9) goto L_0x034d
            r0 = r26
            r1 = r3
            r3 = r7
            r4 = r10
            r5 = r30
            java.util.LinkedList r0 = r0.m105113h(r1, r2, r3, r4, r5)
            goto L_0x0408
        L_0x034d:
            int r13 = r13 + 2
            r7 = r26
            r15 = r29
            r9 = r22
            r10 = r23
            goto L_0x02db
        L_0x0358:
            r22 = r9
            r23 = r10
            r29 = r15
            int r7 = r11 + r19
        L_0x0360:
            int r15 = r29 - r20
            if (r7 > r15) goto L_0x03dd
            int r9 = r4 + r7
            r15 = r29
            if (r7 == r11) goto L_0x037e
            if (r7 == r15) goto L_0x0377
            int r10 = r9 + -1
            r10 = r8[r10]
            int r12 = r9 + 1
            r12 = r8[r12]
            if (r10 >= r12) goto L_0x0377
            goto L_0x037e
        L_0x0377:
            int r10 = r9 + -1
            r10 = r8[r10]
            r12 = 1
            int r10 = r10 + r12
            goto L_0x0382
        L_0x037e:
            int r10 = r9 + 1
            r10 = r8[r10]
        L_0x0382:
            int r12 = r10 - r7
        L_0x0384:
            if (r10 >= r0) goto L_0x03a5
            if (r12 >= r1) goto L_0x03a5
            int r13 = r0 - r10
            r24 = -1
            int r13 = r13 + -1
            char r13 = r3.charAt(r13)
            int r25 = r1 - r12
            r29 = r11
            int r11 = r25 + -1
            char r11 = r2.charAt(r11)
            if (r13 != r11) goto L_0x03a7
            int r10 = r10 + 1
            int r12 = r12 + 1
            r11 = r29
            goto L_0x0384
        L_0x03a5:
            r29 = r11
        L_0x03a7:
            r8[r9] = r10
            if (r10 <= r0) goto L_0x03af
            int r20 = r20 + 2
        L_0x03ad:
            r12 = -1
            goto L_0x03d6
        L_0x03af:
            if (r12 <= r1) goto L_0x03b4
            int r19 = r19 + 2
            goto L_0x03ad
        L_0x03b4:
            if (r16 != 0) goto L_0x03ad
            int r9 = r4 + r14
            int r9 = r9 - r7
            if (r9 < 0) goto L_0x03ad
            if (r9 >= r5) goto L_0x03ad
            r11 = r6[r9]
            r12 = -1
            if (r11 == r12) goto L_0x03d6
            int r13 = r4 + r11
            int r9 = r13 - r9
            int r10 = r0 - r10
            if (r11 < r10) goto L_0x03d6
            r0 = r26
            r1 = r3
            r3 = r11
            r4 = r9
            r5 = r30
            java.util.LinkedList r0 = r0.m105113h(r1, r2, r3, r4, r5)
            goto L_0x0408
        L_0x03d6:
            int r7 = r7 + 2
            r11 = r29
            r29 = r15
            goto L_0x0360
        L_0x03dd:
            r15 = r29
            r12 = -1
            int r15 = r15 + 1
            r7 = r26
            r9 = r22
            r10 = r23
            r11 = 2
            r12 = 1
            r13 = -1
            goto L_0x02ca
        L_0x03ed:
            r22 = r9
            r23 = r10
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            l.a.a.a.a r1 = new l.a.a.a.a
            r4 = 1
            r1.<init>(r4, r3)
            r0.add(r1)
            l.a.a.a.a r1 = new l.a.a.a.a
            r3 = 2
            r1.<init>(r3, r2)
            r0.add(r1)
        L_0x0408:
            int r1 = r22.length()
            if (r1 == 0) goto L_0x041a
            l.a.a.a.a r1 = new l.a.a.a.a
            r2 = r22
            r3 = 3
            r1.<init>(r3, r2)
            r0.addFirst(r1)
            goto L_0x041b
        L_0x041a:
            r3 = 3
        L_0x041b:
            int r1 = r23.length()
            if (r1 == 0) goto L_0x042b
            l.a.a.a.a r1 = new l.a.a.a.a
            r2 = r23
            r1.<init>(r3, r2)
            r0.addLast(r1)
        L_0x042b:
            r1 = r26
            r1.mo63054a(r0)
            return r0
        L_0x0431:
            r1 = r7
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Null inputs. (diff_main)"
            r0.<init>(r2)
            goto L_0x043b
        L_0x043a:
            throw r0
        L_0x043b:
            goto L_0x043a
        */
        throw new UnsupportedOperationException("Method not decompiled: p5585l.p5586a.p5587a.p5588a.C71818b.m105114i(java.lang.String, java.lang.String, boolean, long):java.util.LinkedList");
    }
}
