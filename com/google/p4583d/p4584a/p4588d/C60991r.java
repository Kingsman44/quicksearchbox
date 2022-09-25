package com.google.p4583d.p4584a.p4588d;

import com.google.common.p4535g.C59203do;
import java.util.Iterator;

/* renamed from: com.google.d.a.d.r */
/* compiled from: PG */
public final class C60991r implements Iterable, C60987n {

    /* renamed from: a */
    public final String f165128a;

    public C60991r(String str) {
        if (str != null) {
            this.f165128a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    /* renamed from: d */
    public final C60987n mo57468d() {
        return new C60991r(this.f165128a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60991r)) {
            return false;
        }
        return this.f165128a.equals(((C60991r) obj).f165128a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0190, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0191, code lost:
        com.google.p4583d.p4584a.C61013h.m93265g(r5, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a6, code lost:
        com.google.p4583d.p4584a.C61013h.m93265g(r5, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01bd, code lost:
        r0 = r21;
        com.google.p4583d.p4584a.C61013h.m93265g(r6, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c7, code lost:
        com.google.p4583d.p4584a.C61013h.m93265g("toLowerCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01de, code lost:
        com.google.p4583d.p4584a.C61013h.m93265g("toLocaleLowerCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f4, code lost:
        com.google.p4583d.p4584a.C61013h.m93265g(r14, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0209, code lost:
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93267i("substring", 2, r1);
        r2 = r21.f165128a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0218, code lost:
        if (r24.isEmpty() != false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021a, code lost:
        r3 = r23;
        r4 = (int) com.google.p4583d.p4584a.C61013h.m93259a(r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0)).mo57473h().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0236, code lost:
        r3 = r23;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x023e, code lost:
        if (r24.size() <= 1) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0240, code lost:
        r1 = (int) com.google.p4583d.p4584a.C61013h.m93259a(r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(1)).mo57473h().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x025a, code lost:
        r1 = r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025e, code lost:
        r4 = java.lang.Math.min(java.lang.Math.max(r4, 0), r2.length());
        r1 = java.lang.Math.min(java.lang.Math.max(r1, 0), r2.length());
        r3 = new com.google.p4583d.p4584a.p4588d.C60991r(r2.substring(java.lang.Math.min(r4, r1), java.lang.Math.max(r4, r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028b, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93267i("split", 2, r1);
        r2 = r0.f165128a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x029b, code lost:
        if (r2.length() != 0) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ae, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02b8, code lost:
        if (r24.isEmpty() == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ba, code lost:
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02bf, code lost:
        r4 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0)).mo57475i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d4, code lost:
        if (r24.size() <= 1) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d6, code lost:
        r6 = com.google.p4583d.p4584a.C61013h.m93261c(r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(1)).mo57473h().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ef, code lost:
        r6 = 2147483647L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02f6, code lost:
        if (r6 != 0) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ff, code lost:
        r1 = r2.split(java.util.regex.Pattern.quote(r4), ((int) r6) + 1);
        r2 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x030f, code lost:
        if (r4.isEmpty() == false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0311, code lost:
        if (r2 <= 0) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0313, code lost:
        r14 = r1[0].isEmpty();
        r3 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0322, code lost:
        if (r1[r3].isEmpty() != false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0324, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0326, code lost:
        r3 = r2;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x032b, code lost:
        if (((long) r2) <= r6) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x032d, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x032f, code lost:
        if (r14 >= r3) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0331, code lost:
        r5.add(new com.google.p4583d.p4584a.p4588d.C60991r(r1[r14]));
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0345, code lost:
        r3 = r23;
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93267i("slice", 2, r1);
        r2 = r21.f165128a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0355, code lost:
        if (r24.isEmpty() != false) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0357, code lost:
        r4 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0)).mo57473h().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x036d, code lost:
        r4 = com.google.common.p4535g.C59203do.f157270a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036f, code lost:
        r4 = com.google.p4583d.p4584a.C61013h.m93259a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0377, code lost:
        if (r4 >= com.google.common.p4535g.C59203do.f157270a) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0379, code lost:
        r8 = (double) r2.length();
        java.lang.Double.isNaN(r8);
        r4 = java.lang.Math.max(r8 + r4, com.google.common.p4535g.C59203do.f157270a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0387, code lost:
        r4 = java.lang.Math.min(r4, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0390, code lost:
        r4 = (int) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0396, code lost:
        if (r24.size() <= 1) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0398, code lost:
        r5 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(1)).mo57473h().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03ad, code lost:
        r5 = (double) r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03b2, code lost:
        r5 = com.google.p4583d.p4584a.C61013h.m93259a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03ba, code lost:
        if (r5 >= com.google.common.p4535g.C59203do.f157270a) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03bc, code lost:
        r10 = (double) r2.length();
        java.lang.Double.isNaN(r10);
        r5 = java.lang.Math.max(r10 + r5, com.google.common.p4535g.C59203do.f157270a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ca, code lost:
        r5 = java.lang.Math.min(r5, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03d3, code lost:
        r3 = new com.google.p4583d.p4584a.p4588d.C60991r(r2.substring(r4, java.lang.Math.max(0, ((int) r5) - r4) + r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03e6, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93267i("search", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03f5, code lost:
        if (r24.isEmpty() != false) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03f7, code lost:
        r17 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0)).mo57475i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0407, code lost:
        r1 = java.util.regex.Pattern.compile(r17).matcher(r0.f165128a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0415, code lost:
        if (r1.find() == false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0434, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93267i("replace", 2, r1);
        r2 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0444, code lost:
        if (r24.isEmpty() != false) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0446, code lost:
        r17 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0)).mo57475i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x045c, code lost:
        if (r24.size() <= 1) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x045e, code lost:
        r2 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x046a, code lost:
        r1 = r17;
        r4 = r0.f165128a;
        r5 = r4.indexOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0472, code lost:
        if (r5 < 0) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0476, code lost:
        if ((r2 instanceof com.google.p4583d.p4584a.p4588d.C60980g) == false) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0478, code lost:
        r2 = ((com.google.p4583d.p4584a.p4588d.C60980g) r2).mo57451a(r3, java.util.Arrays.asList(new com.google.p4583d.p4584a.p4588d.C60987n[]{new com.google.p4583d.p4584a.p4588d.C60991r(r1), new com.google.p4583d.p4584a.p4588d.C60979f(java.lang.Double.valueOf((double) r5)), r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x049d, code lost:
        r3 = new com.google.p4583d.p4584a.p4588d.C60991r(r4.substring(0, r5) + r2.mo57475i() + r4.substring(r5 + r1.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04c8, code lost:
        r3 = r23;
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93267i("match", 1, r1);
        r2 = r21.f165128a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04d8, code lost:
        if (r24.size() > 0) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04da, code lost:
        r1 = com.evernote.android.state.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04dd, code lost:
        r1 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0)).mo57475i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04ee, code lost:
        r1 = java.util.regex.Pattern.compile(r1).matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04fa, code lost:
        if (r1.find() == false) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x051a, code lost:
        r3 = r23;
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93267i("lastIndexOf", 2, r1);
        r2 = r21.f165128a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x052b, code lost:
        if (r24.size() > 0) goto L_0x052e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x052e, code lost:
        r17 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0)).mo57475i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x053e, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0545, code lost:
        if (r24.size() >= 2) goto L_0x054a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0547, code lost:
        r5 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x054a, code lost:
        r5 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(1)).mo57473h().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0563, code lost:
        if (java.lang.Double.isNaN(r5) == false) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0565, code lost:
        r5 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0568, code lost:
        r5 = com.google.p4583d.p4584a.C61013h.m93259a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x056c, code lost:
        r1 = new com.google.p4583d.p4584a.p4588d.C60979f(java.lang.Double.valueOf((double) r2.lastIndexOf(r4, (int) r5)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x057d, code lost:
        r3 = r23;
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93267i("indexOf", 2, r1);
        r2 = r21.f165128a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x058f, code lost:
        if (r24.size() > 0) goto L_0x0592;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0592, code lost:
        r17 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0)).mo57475i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05a3, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05aa, code lost:
        if (r24.size() >= 2) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05ac, code lost:
        r5 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05ae, code lost:
        r5 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(1)).mo57473h().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05c3, code lost:
        r1 = new com.google.p4583d.p4584a.p4588d.C60979f(java.lang.Double.valueOf((double) r2.indexOf(r4, (int) com.google.p4583d.p4584a.C61013h.m93259a(r5))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05d8, code lost:
        r3 = r23;
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93265g(r20, 1, r1);
        r2 = r21.f165128a;
        r1 = r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05fd, code lost:
        if ("length".equals(r1.mo57475i()) == false) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0603, code lost:
        r3 = r1.mo57473h().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0611, code lost:
        if (r3 != java.lang.Math.floor(r3)) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0613, code lost:
        r1 = (int) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0614, code lost:
        if (r1 < 0) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x061a, code lost:
        if (r1 >= r2.length()) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0624, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x062e, code lost:
        if (r24.isEmpty() != false) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0630, code lost:
        r2 = new java.lang.StringBuilder(r0.f165128a);
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x063c, code lost:
        if (r14 >= r24.size()) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x063e, code lost:
        r2.append(r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(r14)).mo57475i());
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0654, code lost:
        r1 = new com.google.p4583d.p4584a.p4588d.C60991r(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0661, code lost:
        r0 = r21;
        r3 = r23;
        r1 = r24;
        com.google.p4583d.p4584a.C61013h.m93267i(r19, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0671, code lost:
        if (r24.isEmpty() != false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0673, code lost:
        r14 = (int) com.google.p4583d.p4584a.C61013h.m93259a(r3.f165215b.mo57519a(r3, (com.google.p4583d.p4584a.p4588d.C60987n) r1.get(0)).mo57473h().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x068e, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0690, code lost:
        r1 = r0.f165128a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0692, code lost:
        if (r14 < 0) goto L_0x06a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0698, code lost:
        if (r14 < r1.length()) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return com.google.p4583d.p4584a.p4588d.C60987n.f165121m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60991r(r21.f165128a.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60991r(r21.f165128a.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60991r(r21.f165128a.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60991r(r21.f165128a.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60991r(r21.f165128a.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60976c(java.util.Arrays.asList(new com.google.p4583d.p4584a.p4588d.C60987n[]{r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60976c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60976c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60979f(java.lang.Double.valueOf((double) r1.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60979f(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60976c(java.util.Arrays.asList(new com.google.p4583d.p4584a.p4588d.C60987n[]{new com.google.p4583d.p4584a.p4588d.C60991r(r1.group())}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        return com.google.p4583d.p4584a.p4588d.C60987n.f165115g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        return com.google.p4583d.p4584a.p4588d.C60977d.f165119k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        return com.google.p4583d.p4584a.p4588d.C60977d.f165119k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        return com.google.p4583d.p4584a.p4588d.C60977d.f165120l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        return new com.google.p4583d.p4584a.p4588d.C60991r(java.lang.String.valueOf(r1.charAt(r14)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
        r3 = r17;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012f, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0158, code lost:
        r3 = r17;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017d, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x017e, code lost:
        r17 = "undefined";
        r20 = r3;
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0184, code lost:
        switch(r1) {
            case 0: goto L_0x0661;
            case 1: goto L_0x0624;
            case 2: goto L_0x05d8;
            case 3: goto L_0x057d;
            case 4: goto L_0x051a;
            case 5: goto L_0x04c8;
            case 6: goto L_0x0434;
            case 7: goto L_0x03e6;
            case 8: goto L_0x0345;
            case 9: goto L_0x028b;
            case 10: goto L_0x0209;
            case 11: goto L_0x01f4;
            case 12: goto L_0x01de;
            case 13: goto L_0x01c7;
            case 14: goto L_0x01bd;
            case 15: goto L_0x01a6;
            case 16: goto L_0x0191;
            default: goto L_0x0187;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0187, code lost:
        r0 = r21;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x016f  */
    /* renamed from: fK */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4583d.p4584a.p4588d.C60987n mo57452fK(java.lang.String r22, com.google.p4583d.p4584a.C61012g r23, java.util.List r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "concat"
            java.lang.String r7 = "indexOf"
            java.lang.String r8 = "replace"
            java.lang.String r9 = "substring"
            java.lang.String r10 = "split"
            java.lang.String r11 = "slice"
            java.lang.String r12 = "match"
            java.lang.String r13 = "lastIndexOf"
            java.lang.String r14 = "toLocaleUpperCase"
            java.lang.String r15 = "search"
            java.lang.String r2 = "toLowerCase"
            java.lang.String r0 = "toLocaleLowerCase"
            java.lang.String r3 = "toString"
            r16 = r4
            java.lang.String r4 = "hasOwnProperty"
            r17 = r14
            java.lang.String r14 = "toUpperCase"
            r18 = r14
            if (r5 != 0) goto L_0x00af
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00af
            r5 = r18
            boolean r18 = r5.equals(r1)
            r14 = r17
            if (r18 != 0) goto L_0x00b3
            boolean r17 = r14.equals(r1)
            if (r17 != 0) goto L_0x00b3
            r17 = r4
            java.lang.String r4 = "trim"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00af:
            r14 = r17
            r5 = r18
        L_0x00b3:
            r17 = r4
        L_0x00b5:
            int r4 = r22.hashCode()
            r19 = r3
            switch(r4) {
                case -1789698943: goto L_0x016f;
                case -1776922004: goto L_0x015d;
                case -1464939364: goto L_0x014e;
                case -1361633751: goto L_0x0140;
                case -1354795244: goto L_0x0132;
                case -1137582698: goto L_0x0127;
                case -906336856: goto L_0x011f;
                case -726908483: goto L_0x0116;
                case -467511597: goto L_0x010e;
                case -399551817: goto L_0x0105;
                case 3568674: goto L_0x00fa;
                case 103668165: goto L_0x00f2;
                case 109526418: goto L_0x00e9;
                case 109648666: goto L_0x00e0;
                case 530542161: goto L_0x00d7;
                case 1094496948: goto L_0x00cf;
                case 1943291465: goto L_0x00c6;
                default: goto L_0x00be;
            }
        L_0x00be:
            r4 = r16
        L_0x00c0:
            r3 = r17
            r6 = r19
            goto L_0x017d
        L_0x00c6:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00be
            r1 = 3
            goto L_0x012f
        L_0x00cf:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00be
            r1 = 6
            goto L_0x012f
        L_0x00d7:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00be
            r1 = 10
            goto L_0x012f
        L_0x00e0:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00be
            r1 = 9
            goto L_0x012f
        L_0x00e9:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00be
            r1 = 8
            goto L_0x012f
        L_0x00f2:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00be
            r1 = 5
            goto L_0x012f
        L_0x00fa:
            java.lang.String r4 = "trim"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00be
            r1 = 16
            goto L_0x012f
        L_0x0105:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00be
            r1 = 15
            goto L_0x012f
        L_0x010e:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00be
            r1 = 4
            goto L_0x012f
        L_0x0116:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00be
            r1 = 11
            goto L_0x012f
        L_0x011f:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00be
            r1 = 7
            goto L_0x012f
        L_0x0127:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00be
            r1 = 13
        L_0x012f:
            r4 = r16
            goto L_0x0158
        L_0x0132:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00be
            r4 = r16
            r3 = r17
            r6 = r19
            r1 = 1
            goto L_0x017e
        L_0x0140:
            r4 = r16
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00c0
            r3 = r17
            r6 = r19
            r1 = 0
            goto L_0x017e
        L_0x014e:
            r4 = r16
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00c0
            r1 = 12
        L_0x0158:
            r3 = r17
            r6 = r19
            goto L_0x017e
        L_0x015d:
            r4 = r16
            r6 = r19
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x016c
            r1 = 14
            r3 = r17
            goto L_0x017e
        L_0x016c:
            r3 = r17
            goto L_0x017d
        L_0x016f:
            r4 = r16
            r3 = r17
            r6 = r19
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x017d
            r1 = 2
            goto L_0x017e
        L_0x017d:
            r1 = -1
        L_0x017e:
            java.lang.String r17 = "undefined"
            r20 = r3
            r19 = r4
            switch(r1) {
                case 0: goto L_0x0661;
                case 1: goto L_0x0624;
                case 2: goto L_0x05d8;
                case 3: goto L_0x057d;
                case 4: goto L_0x051a;
                case 5: goto L_0x04c8;
                case 6: goto L_0x0434;
                case 7: goto L_0x03e6;
                case 8: goto L_0x0345;
                case 9: goto L_0x028b;
                case 10: goto L_0x0209;
                case 11: goto L_0x01f4;
                case 12: goto L_0x01de;
                case 13: goto L_0x01c7;
                case 14: goto L_0x01bd;
                case 15: goto L_0x01a6;
                case 16: goto L_0x0191;
                default: goto L_0x0187;
            }
        L_0x0187:
            r0 = r21
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r1.<init>(r2)
            throw r1
        L_0x0191:
            r1 = r24
            r3 = 0
            com.google.p4583d.p4584a.C61013h.m93265g(r5, r3, r1)
            r0 = r21
            java.lang.String r1 = r0.f165128a
            com.google.d.a.d.r r2 = new com.google.d.a.d.r
            java.lang.String r1 = r1.trim()
            r2.<init>(r1)
            goto L_0x06ab
        L_0x01a6:
            r3 = 0
            r0 = r21
            r1 = r24
            com.google.p4583d.p4584a.C61013h.m93265g(r5, r3, r1)
            java.lang.String r1 = r0.f165128a
            com.google.d.a.d.r r2 = new com.google.d.a.d.r
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r3)
            r2.<init>(r1)
            goto L_0x06ab
        L_0x01bd:
            r3 = 0
            r0 = r21
            r1 = r24
            com.google.p4583d.p4584a.C61013h.m93265g(r6, r3, r1)
            goto L_0x065f
        L_0x01c7:
            r3 = 0
            r0 = r21
            r1 = r24
            com.google.p4583d.p4584a.C61013h.m93265g(r2, r3, r1)
            java.lang.String r1 = r0.f165128a
            com.google.d.a.d.r r2 = new com.google.d.a.d.r
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r3)
            r2.<init>(r1)
            goto L_0x06ab
        L_0x01de:
            r3 = 0
            r1 = r24
            r2 = r0
            r0 = r21
            com.google.p4583d.p4584a.C61013h.m93265g(r2, r3, r1)
            java.lang.String r1 = r0.f165128a
            com.google.d.a.d.r r2 = new com.google.d.a.d.r
            java.lang.String r1 = r1.toLowerCase()
            r2.<init>(r1)
            goto L_0x06ab
        L_0x01f4:
            r3 = 0
            r0 = r21
            r1 = r24
            com.google.p4583d.p4584a.C61013h.m93265g(r14, r3, r1)
            java.lang.String r1 = r0.f165128a
            com.google.d.a.d.r r2 = new com.google.d.a.d.r
            java.lang.String r1 = r1.toUpperCase()
            r2.<init>(r1)
            goto L_0x06ab
        L_0x0209:
            r0 = r21
            r1 = r24
            r2 = 2
            r3 = 0
            com.google.p4583d.p4584a.C61013h.m93267i(r9, r2, r1)
            java.lang.String r2 = r0.f165128a
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x0236
            java.lang.Object r4 = r1.get(r3)
            com.google.d.a.d.n r4 = (com.google.p4583d.p4584a.p4588d.C60987n) r4
            r3 = r23
            com.google.d.a.e.c r5 = r3.f165215b
            com.google.d.a.d.n r4 = r5.mo57519a(r3, r4)
            java.lang.Double r4 = r4.mo57473h()
            double r4 = r4.doubleValue()
            double r4 = com.google.p4583d.p4584a.C61013h.m93259a(r4)
            int r4 = (int) r4
            goto L_0x0239
        L_0x0236:
            r3 = r23
            r4 = 0
        L_0x0239:
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x025a
            java.lang.Object r1 = r1.get(r6)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r5 = r3.f165215b
            com.google.d.a.d.n r1 = r5.mo57519a(r3, r1)
            java.lang.Double r1 = r1.mo57473h()
            double r5 = r1.doubleValue()
            double r5 = com.google.p4583d.p4584a.C61013h.m93259a(r5)
            int r1 = (int) r5
            goto L_0x025e
        L_0x025a:
            int r1 = r2.length()
        L_0x025e:
            r3 = 0
            int r4 = java.lang.Math.max(r4, r3)
            int r5 = r2.length()
            int r4 = java.lang.Math.min(r4, r5)
            int r1 = java.lang.Math.max(r1, r3)
            int r3 = r2.length()
            int r1 = java.lang.Math.min(r1, r3)
            com.google.d.a.d.r r3 = new com.google.d.a.d.r
            int r5 = java.lang.Math.min(r4, r1)
            int r1 = java.lang.Math.max(r4, r1)
            java.lang.String r1 = r2.substring(r5, r1)
            r3.<init>(r1)
        L_0x0288:
            r2 = r3
            goto L_0x06ab
        L_0x028b:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            com.google.p4583d.p4584a.C61013h.m93267i(r10, r2, r1)
            java.lang.String r2 = r0.f165128a
            int r4 = r2.length()
            if (r4 != 0) goto L_0x02ae
            com.google.d.a.d.c r2 = new com.google.d.a.d.c
            r1 = 1
            com.google.d.a.d.n[] r1 = new com.google.p4583d.p4584a.p4588d.C60987n[r1]
            r4 = 0
            r1[r4] = r0
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.<init>(r1)
            goto L_0x06ab
        L_0x02ae:
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r24.isEmpty()
            if (r6 == 0) goto L_0x02bf
            r5.add(r0)
            goto L_0x033e
        L_0x02bf:
            java.lang.Object r6 = r1.get(r4)
            com.google.d.a.d.n r6 = (com.google.p4583d.p4584a.p4588d.C60987n) r6
            com.google.d.a.e.c r4 = r3.f165215b
            com.google.d.a.d.n r4 = r4.mo57519a(r3, r6)
            java.lang.String r4 = r4.mo57475i()
            int r6 = r24.size()
            r7 = 1
            if (r6 <= r7) goto L_0x02ef
            java.lang.Object r1 = r1.get(r7)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r6 = r3.f165215b
            com.google.d.a.d.n r1 = r6.mo57519a(r3, r1)
            java.lang.Double r1 = r1.mo57473h()
            double r6 = r1.doubleValue()
            long r6 = com.google.p4583d.p4584a.C61013h.m93261c(r6)
            goto L_0x02f2
        L_0x02ef:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x02f2:
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x02ff
            com.google.d.a.d.c r2 = new com.google.d.a.d.c
            r2.<init>()
            goto L_0x06ab
        L_0x02ff:
            java.lang.String r1 = java.util.regex.Pattern.quote(r4)
            int r3 = (int) r6
            r8 = 1
            int r3 = r3 + r8
            java.lang.String[] r1 = r2.split(r1, r3)
            int r2 = r1.length
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0326
            if (r2 <= 0) goto L_0x0326
            r3 = 0
            r3 = r1[r3]
            boolean r14 = r3.isEmpty()
            int r3 = r2 + -1
            r4 = r1[r3]
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0328
            r3 = r2
            goto L_0x0328
        L_0x0326:
            r3 = r2
            r14 = 0
        L_0x0328:
            long r8 = (long) r2
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x032f
            int r3 = r3 + -1
        L_0x032f:
            if (r14 >= r3) goto L_0x033e
            com.google.d.a.d.r r2 = new com.google.d.a.d.r
            r4 = r1[r14]
            r2.<init>(r4)
            r5.add(r2)
            int r14 = r14 + 1
            goto L_0x032f
        L_0x033e:
            com.google.d.a.d.c r2 = new com.google.d.a.d.c
            r2.<init>(r5)
            goto L_0x06ab
        L_0x0345:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            com.google.p4583d.p4584a.C61013h.m93267i(r11, r2, r1)
            java.lang.String r2 = r0.f165128a
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x036d
            r4 = 0
            java.lang.Object r5 = r1.get(r4)
            com.google.d.a.d.n r5 = (com.google.p4583d.p4584a.p4588d.C60987n) r5
            com.google.d.a.e.c r4 = r3.f165215b
            com.google.d.a.d.n r4 = r4.mo57519a(r3, r5)
            java.lang.Double r4 = r4.mo57473h()
            double r4 = r4.doubleValue()
            goto L_0x036f
        L_0x036d:
            r4 = 0
        L_0x036f:
            double r4 = com.google.p4583d.p4584a.C61013h.m93259a(r4)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0387
            int r8 = r2.length()
            double r8 = (double) r8
            java.lang.Double.isNaN(r8)
            double r8 = r8 + r4
            double r4 = java.lang.Math.max(r8, r6)
            goto L_0x0390
        L_0x0387:
            int r6 = r2.length()
            double r6 = (double) r6
            double r4 = java.lang.Math.min(r4, r6)
        L_0x0390:
            int r4 = (int) r4
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x03ad
            java.lang.Object r1 = r1.get(r6)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r5 = r3.f165215b
            com.google.d.a.d.n r1 = r5.mo57519a(r3, r1)
            java.lang.Double r1 = r1.mo57473h()
            double r5 = r1.doubleValue()
            goto L_0x03b2
        L_0x03ad:
            int r1 = r2.length()
            double r5 = (double) r1
        L_0x03b2:
            double r5 = com.google.p4583d.p4584a.C61013h.m93259a(r5)
            r8 = 0
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x03ca
            int r1 = r2.length()
            double r10 = (double) r1
            java.lang.Double.isNaN(r10)
            double r10 = r10 + r5
            double r5 = java.lang.Math.max(r10, r8)
            goto L_0x03d3
        L_0x03ca:
            int r1 = r2.length()
            double r7 = (double) r1
            double r5 = java.lang.Math.min(r5, r7)
        L_0x03d3:
            int r1 = (int) r5
            int r1 = r1 - r4
            r5 = 0
            int r1 = java.lang.Math.max(r5, r1)
            com.google.d.a.d.r r3 = new com.google.d.a.d.r
            int r1 = r1 + r4
            java.lang.String r1 = r2.substring(r4, r1)
            r3.<init>(r1)
            goto L_0x0288
        L_0x03e6:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 1
            r5 = 0
            com.google.p4583d.p4584a.C61013h.m93267i(r15, r2, r1)
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x0407
            java.lang.Object r1 = r1.get(r5)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r2 = r3.f165215b
            com.google.d.a.d.n r1 = r2.mo57519a(r3, r1)
            java.lang.String r17 = r1.mo57475i()
        L_0x0407:
            java.lang.String r1 = r0.f165128a
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r17)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x0427
            com.google.d.a.d.f r2 = new com.google.d.a.d.f
            int r1 = r1.start()
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x06ab
        L_0x0427:
            com.google.d.a.d.f r2 = new com.google.d.a.d.f
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x06ab
        L_0x0434:
            r2 = 2
            r0 = r21
            r3 = r23
            r1 = r24
            com.google.p4583d.p4584a.C61013h.m93267i(r8, r2, r1)
            com.google.d.a.d.n r2 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x046a
            r4 = 0
            java.lang.Object r5 = r1.get(r4)
            com.google.d.a.d.n r5 = (com.google.p4583d.p4584a.p4588d.C60987n) r5
            com.google.d.a.e.c r4 = r3.f165215b
            com.google.d.a.d.n r4 = r4.mo57519a(r3, r5)
            java.lang.String r17 = r4.mo57475i()
            int r4 = r24.size()
            r5 = 1
            if (r4 <= r5) goto L_0x046a
            java.lang.Object r1 = r1.get(r5)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r2 = r3.f165215b
            com.google.d.a.d.n r2 = r2.mo57519a(r3, r1)
        L_0x046a:
            r1 = r17
            java.lang.String r4 = r0.f165128a
            int r5 = r4.indexOf(r1)
            if (r5 < 0) goto L_0x065f
            boolean r6 = r2 instanceof com.google.p4583d.p4584a.p4588d.C60980g
            if (r6 == 0) goto L_0x049d
            com.google.d.a.d.g r2 = (com.google.p4583d.p4584a.p4588d.C60980g) r2
            r6 = 3
            com.google.d.a.d.n[] r6 = new com.google.p4583d.p4584a.p4588d.C60987n[r6]
            com.google.d.a.d.r r7 = new com.google.d.a.d.r
            r7.<init>(r1)
            r8 = 0
            r6[r8] = r7
            com.google.d.a.d.f r7 = new com.google.d.a.d.f
            double r8 = (double) r5
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.<init>(r8)
            r8 = 1
            r6[r8] = r7
            r7 = 2
            r6[r7] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            com.google.d.a.d.n r2 = r2.mo57451a(r3, r6)
        L_0x049d:
            com.google.d.a.d.r r3 = new com.google.d.a.d.r
            r6 = 0
            java.lang.String r6 = r4.substring(r6, r5)
            java.lang.String r2 = r2.mo57475i()
            int r1 = r1.length()
            int r5 = r5 + r1
            java.lang.String r1 = r4.substring(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            goto L_0x0288
        L_0x04c8:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 1
            com.google.p4583d.p4584a.C61013h.m93267i(r12, r2, r1)
            java.lang.String r2 = r0.f165128a
            int r4 = r24.size()
            if (r4 > 0) goto L_0x04dd
            java.lang.String r1 = ""
            goto L_0x04ee
        L_0x04dd:
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r4 = r3.f165215b
            com.google.d.a.d.n r1 = r4.mo57519a(r3, r1)
            java.lang.String r1 = r1.mo57475i()
        L_0x04ee:
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x0516
            com.google.d.a.d.c r2 = new com.google.d.a.d.c
            r3 = 1
            com.google.d.a.d.n[] r3 = new com.google.p4583d.p4584a.p4588d.C60987n[r3]
            com.google.d.a.d.r r4 = new com.google.d.a.d.r
            java.lang.String r1 = r1.group()
            r4.<init>(r1)
            r5 = 0
            r3[r5] = r4
            java.util.List r1 = java.util.Arrays.asList(r3)
            r2.<init>(r1)
            goto L_0x06ab
        L_0x0516:
            com.google.d.a.d.n r2 = com.google.p4583d.p4584a.p4588d.C60987n.f165115g
            goto L_0x06ab
        L_0x051a:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            r5 = 0
            com.google.p4583d.p4584a.C61013h.m93267i(r13, r2, r1)
            java.lang.String r2 = r0.f165128a
            int r4 = r24.size()
            if (r4 > 0) goto L_0x052e
            goto L_0x053e
        L_0x052e:
            java.lang.Object r4 = r1.get(r5)
            com.google.d.a.d.n r4 = (com.google.p4583d.p4584a.p4588d.C60987n) r4
            com.google.d.a.e.c r5 = r3.f165215b
            com.google.d.a.d.n r4 = r5.mo57519a(r3, r4)
            java.lang.String r17 = r4.mo57475i()
        L_0x053e:
            r4 = r17
            int r5 = r24.size()
            r6 = 2
            if (r5 >= r6) goto L_0x054a
            r5 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x055f
        L_0x054a:
            r5 = 1
            java.lang.Object r1 = r1.get(r5)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r5 = r3.f165215b
            com.google.d.a.d.n r1 = r5.mo57519a(r3, r1)
            java.lang.Double r1 = r1.mo57473h()
            double r5 = r1.doubleValue()
        L_0x055f:
            boolean r1 = java.lang.Double.isNaN(r5)
            if (r1 == 0) goto L_0x0568
            r5 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x056c
        L_0x0568:
            double r5 = com.google.p4583d.p4584a.C61013h.m93259a(r5)
        L_0x056c:
            com.google.d.a.d.f r1 = new com.google.d.a.d.f
            int r3 = (int) r5
            int r2 = r2.lastIndexOf(r4, r3)
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r1.<init>(r2)
            goto L_0x065d
        L_0x057d:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = 2
            r8 = 0
            com.google.p4583d.p4584a.C61013h.m93267i(r7, r2, r1)
            java.lang.String r2 = r0.f165128a
            int r4 = r24.size()
            if (r4 > 0) goto L_0x0592
            goto L_0x05a3
        L_0x0592:
            r4 = 0
            java.lang.Object r4 = r1.get(r4)
            com.google.d.a.d.n r4 = (com.google.p4583d.p4584a.p4588d.C60987n) r4
            com.google.d.a.e.c r5 = r3.f165215b
            com.google.d.a.d.n r4 = r5.mo57519a(r3, r4)
            java.lang.String r17 = r4.mo57475i()
        L_0x05a3:
            r4 = r17
            int r5 = r24.size()
            r6 = 2
            if (r5 >= r6) goto L_0x05ae
            r5 = r8
            goto L_0x05c3
        L_0x05ae:
            r5 = 1
            java.lang.Object r1 = r1.get(r5)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r5 = r3.f165215b
            com.google.d.a.d.n r1 = r5.mo57519a(r3, r1)
            java.lang.Double r1 = r1.mo57473h()
            double r5 = r1.doubleValue()
        L_0x05c3:
            double r5 = com.google.p4583d.p4584a.C61013h.m93259a(r5)
            com.google.d.a.d.f r1 = new com.google.d.a.d.f
            int r3 = (int) r5
            int r2 = r2.indexOf(r4, r3)
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r1.<init>(r2)
            goto L_0x065d
        L_0x05d8:
            r0 = r21
            r3 = r23
            r1 = r24
            r2 = r20
            r4 = 1
            com.google.p4583d.p4584a.C61013h.m93265g(r2, r4, r1)
            java.lang.String r2 = r0.f165128a
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r4 = r3.f165215b
            com.google.d.a.d.n r1 = r4.mo57519a(r3, r1)
            java.lang.String r3 = "length"
            java.lang.String r4 = r1.mo57475i()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0603
            com.google.d.a.d.n r2 = com.google.p4583d.p4584a.p4588d.C60977d.f165119k
            goto L_0x06ab
        L_0x0603:
            java.lang.Double r1 = r1.mo57473h()
            double r3 = r1.doubleValue()
            double r5 = java.lang.Math.floor(r3)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0620
            int r1 = (int) r3
            if (r1 < 0) goto L_0x0620
            int r2 = r2.length()
            if (r1 >= r2) goto L_0x0620
            com.google.d.a.d.n r2 = com.google.p4583d.p4584a.p4588d.C60977d.f165119k
            goto L_0x06ab
        L_0x0620:
            com.google.d.a.d.n r2 = com.google.p4583d.p4584a.p4588d.C60977d.f165120l
            goto L_0x06ab
        L_0x0624:
            r0 = r21
            r3 = r23
            r1 = r24
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x065f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = r0.f165128a
            r2.<init>(r4)
            r14 = 0
        L_0x0638:
            int r4 = r24.size()
            if (r14 >= r4) goto L_0x0654
            java.lang.Object r4 = r1.get(r14)
            com.google.d.a.d.n r4 = (com.google.p4583d.p4584a.p4588d.C60987n) r4
            com.google.d.a.e.c r5 = r3.f165215b
            com.google.d.a.d.n r4 = r5.mo57519a(r3, r4)
            java.lang.String r4 = r4.mo57475i()
            r2.append(r4)
            int r14 = r14 + 1
            goto L_0x0638
        L_0x0654:
            com.google.d.a.d.r r1 = new com.google.d.a.d.r
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
        L_0x065d:
            r2 = r1
            goto L_0x06ab
        L_0x065f:
            r2 = r0
            goto L_0x06ab
        L_0x0661:
            r0 = r21
            r3 = r23
            r1 = r24
            r4 = r19
            r2 = 1
            com.google.p4583d.p4584a.C61013h.m93267i(r4, r2, r1)
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x068e
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r2 = r3.f165215b
            com.google.d.a.d.n r1 = r2.mo57519a(r3, r1)
            java.lang.Double r1 = r1.mo57473h()
            double r1 = r1.doubleValue()
            double r1 = com.google.p4583d.p4584a.C61013h.m93259a(r1)
            int r14 = (int) r1
            goto L_0x0690
        L_0x068e:
            r2 = 0
            r14 = 0
        L_0x0690:
            java.lang.String r1 = r0.f165128a
            if (r14 < 0) goto L_0x06a9
            int r2 = r1.length()
            if (r14 < r2) goto L_0x069b
            goto L_0x06a9
        L_0x069b:
            com.google.d.a.d.r r2 = new com.google.d.a.d.r
            char r1 = r1.charAt(r14)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            goto L_0x06ab
        L_0x06a9:
            com.google.d.a.d.n r2 = com.google.p4583d.p4584a.p4588d.C60987n.f165121m
        L_0x06ab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4583d.p4584a.p4588d.C60991r.mo57452fK(java.lang.String, com.google.d.a.g, java.util.List):com.google.d.a.d.n");
    }

    /* renamed from: g */
    public final Boolean mo57472g() {
        return Boolean.valueOf(!this.f165128a.isEmpty());
    }

    /* renamed from: h */
    public final Double mo57473h() {
        if (this.f165128a.isEmpty()) {
            return Double.valueOf(C59203do.f157270a);
        }
        try {
            return Double.valueOf(this.f165128a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.f165128a.hashCode();
    }

    /* renamed from: i */
    public final String mo57475i() {
        return this.f165128a;
    }

    public final Iterator iterator() {
        return new C60990q(this);
    }

    /* renamed from: l */
    public final Iterator mo57479l() {
        return new C60989p(this);
    }

    public final String toString() {
        String str = this.f165128a;
        return "\"" + str + "\"";
    }
}
