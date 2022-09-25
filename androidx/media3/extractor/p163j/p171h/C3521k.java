package androidx.media3.extractor.p163j.p171h;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p135a.C2567c;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2633u;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.j.h.k */
/* compiled from: PG */
public final class C3521k {

    /* renamed from: a */
    public static final Pattern f11013a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f11014b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map f11015c;

    /* renamed from: d */
    private static final Map f11016d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap.put("red", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, PrivateKeyType.INVALID)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f11015c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, PrivateKeyType.INVALID)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f11016d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0135  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.text.SpannedString m10164a(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x0017:
            int r8 = r18.length()
            java.lang.String r9 = ""
            if (r7 < r8) goto L_0x0044
        L_0x001f:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x002f
            java.lang.Object r1 = r4.pop()
            androidx.media3.extractor.j.h.h r1 = (androidx.media3.extractor.p163j.p171h.C3518h) r1
            m10170g(r0, r1, r5, r3, r2)
            goto L_0x001f
        L_0x002f:
            androidx.media3.extractor.j.h.h r1 = new androidx.media3.extractor.j.h.h
            java.util.Set r4 = java.util.Collections.emptySet()
            r1.<init>(r9, r6, r9, r4)
            java.util.List r4 = java.util.Collections.emptyList()
            m10170g(r0, r1, r4, r3, r2)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r3)
            return r0
        L_0x0044:
            char r8 = r1.charAt(r7)
            java.lang.String r10 = " "
            r11 = 62
            r12 = 60
            r13 = 38
            r14 = -1
            r15 = 1
            if (r8 == r13) goto L_0x01b5
            if (r8 == r12) goto L_0x005c
            r3.append(r8)
            int r7 = r7 + 1
            goto L_0x0017
        L_0x005c:
            int r8 = r7 + 1
            int r12 = r18.length()
            if (r8 < r12) goto L_0x0066
            r7 = r8
            goto L_0x0017
        L_0x0066:
            char r12 = r1.charAt(r8)
            int r8 = r1.indexOf(r11, r8)
            if (r8 != r14) goto L_0x0075
            int r8 = r18.length()
            goto L_0x0077
        L_0x0075:
            int r8 = r8 + 1
        L_0x0077:
            int r11 = r8 + -2
            char r13 = r1.charAt(r11)
            r14 = 47
            if (r13 != r14) goto L_0x0083
            r13 = 1
            goto L_0x0084
        L_0x0083:
            r13 = 0
        L_0x0084:
            if (r12 != r14) goto L_0x0089
            r16 = 2
            goto L_0x008b
        L_0x0089:
            r16 = 1
        L_0x008b:
            int r7 = r7 + r16
            if (r13 == 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            int r11 = r8 + -1
        L_0x0092:
            java.lang.String r7 = r1.substring(r7, r11)
            java.lang.String r11 = r7.trim()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x00a3
        L_0x00a0:
            r14 = 0
            goto L_0x01b2
        L_0x00a3:
            java.lang.String r11 = r7.trim()
            boolean r16 = r11.isEmpty()
            r16 = r16 ^ 1
            androidx.media3.common.p136b.C2601a.m6830b(r16)
            java.lang.String r15 = "[ \\.]"
            java.lang.String[] r11 = androidx.media3.common.p136b.C2612ak.m6968ar(r11, r15)
            r11 = r11[r6]
            int r15 = r11.hashCode()
            r6 = 98
            if (r15 == r6) goto L_0x0125
            r6 = 99
            if (r15 == r6) goto L_0x011b
            r6 = 105(0x69, float:1.47E-43)
            if (r15 == r6) goto L_0x0111
            r6 = 3650(0xe42, float:5.115E-42)
            if (r15 == r6) goto L_0x0107
            r6 = 3314158(0x3291ee, float:4.644125E-39)
            if (r15 == r6) goto L_0x00fd
            r6 = 3511770(0x3595da, float:4.921038E-39)
            if (r15 == r6) goto L_0x00f3
            r6 = 117(0x75, float:1.64E-43)
            if (r15 == r6) goto L_0x00e9
            r6 = 118(0x76, float:1.65E-43)
            if (r15 == r6) goto L_0x00df
            goto L_0x012f
        L_0x00df:
            java.lang.String r6 = "v"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x012f
            r6 = 7
            goto L_0x0130
        L_0x00e9:
            java.lang.String r6 = "u"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x012f
            r6 = 6
            goto L_0x0130
        L_0x00f3:
            java.lang.String r6 = "ruby"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x012f
            r6 = 4
            goto L_0x0130
        L_0x00fd:
            java.lang.String r6 = "lang"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x012f
            r6 = 3
            goto L_0x0130
        L_0x0107:
            java.lang.String r6 = "rt"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x012f
            r6 = 5
            goto L_0x0130
        L_0x0111:
            java.lang.String r6 = "i"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x012f
            r6 = 2
            goto L_0x0130
        L_0x011b:
            java.lang.String r6 = "c"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x012f
            r6 = 1
            goto L_0x0130
        L_0x0125:
            java.lang.String r6 = "b"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x012f
            r6 = 0
            goto L_0x0130
        L_0x012f:
            r6 = -1
        L_0x0130:
            switch(r6) {
                case 0: goto L_0x0135;
                case 1: goto L_0x0135;
                case 2: goto L_0x0135;
                case 3: goto L_0x0135;
                case 4: goto L_0x0135;
                case 5: goto L_0x0135;
                case 6: goto L_0x0135;
                case 7: goto L_0x0135;
                default: goto L_0x0133;
            }
        L_0x0133:
            goto L_0x00a0
        L_0x0135:
            if (r12 != r14) goto L_0x0168
        L_0x0137:
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x013f
            goto L_0x00a0
        L_0x013f:
            java.lang.Object r6 = r4.pop()
            androidx.media3.extractor.j.h.h r6 = (androidx.media3.extractor.p163j.p171h.C3518h) r6
            m10170g(r0, r6, r5, r3, r2)
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x015b
            androidx.media3.extractor.j.h.g r7 = new androidx.media3.extractor.j.h.g
            int r9 = r3.length()
            r7.<init>(r6, r9)
            r5.add(r7)
            goto L_0x015e
        L_0x015b:
            r5.clear()
        L_0x015e:
            java.lang.String r6 = r6.f10996a
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x0137
            goto L_0x00a0
        L_0x0168:
            if (r13 != 0) goto L_0x00a0
            int r6 = r3.length()
            java.lang.String r7 = r7.trim()
            boolean r11 = r7.isEmpty()
            r12 = 1
            r11 = r11 ^ r12
            androidx.media3.common.p136b.C2601a.m6830b(r11)
            int r10 = r7.indexOf(r10)
            r11 = -1
            if (r10 != r11) goto L_0x0184
            r14 = 0
            goto L_0x0191
        L_0x0184:
            java.lang.String r9 = r7.substring(r10)
            java.lang.String r9 = r9.trim()
            r14 = 0
            java.lang.String r7 = r7.substring(r14, r10)
        L_0x0191:
            java.lang.String r10 = "\\."
            java.lang.String[] r7 = androidx.media3.common.p136b.C2612ak.m6967aq(r7, r10)
            r10 = r7[r14]
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r15 = 1
        L_0x019f:
            int r12 = r7.length
            if (r15 >= r12) goto L_0x01aa
            r12 = r7[r15]
            r11.add(r12)
            int r15 = r15 + 1
            goto L_0x019f
        L_0x01aa:
            androidx.media3.extractor.j.h.h r7 = new androidx.media3.extractor.j.h.h
            r7.<init>(r10, r6, r9, r11)
            r4.push(r7)
        L_0x01b2:
            r7 = r8
            goto L_0x0253
        L_0x01b5:
            r14 = 0
            int r7 = r7 + 1
            r6 = 59
            int r6 = r1.indexOf(r6, r7)
            r9 = 32
            int r15 = r1.indexOf(r9, r7)
            r14 = -1
            if (r6 != r14) goto L_0x01c9
            r6 = r15
            goto L_0x01cf
        L_0x01c9:
            if (r15 == r14) goto L_0x01cf
            int r6 = java.lang.Math.min(r6, r15)
        L_0x01cf:
            if (r6 == r14) goto L_0x0250
            java.lang.String r7 = r1.substring(r7, r6)
            int r8 = r7.hashCode()
            r14 = 3309(0xced, float:4.637E-42)
            if (r8 == r14) goto L_0x020a
            r14 = 3464(0xd88, float:4.854E-42)
            if (r8 == r14) goto L_0x0200
            r14 = 96708(0x179c4, float:1.35517E-40)
            if (r8 == r14) goto L_0x01f6
            r14 = 3374865(0x337f11, float:4.729193E-39)
            if (r8 == r14) goto L_0x01ec
            goto L_0x0214
        L_0x01ec:
            java.lang.String r8 = "nbsp"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0214
            r14 = 2
            goto L_0x0215
        L_0x01f6:
            java.lang.String r8 = "amp"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0214
            r14 = 3
            goto L_0x0215
        L_0x0200:
            java.lang.String r8 = "lt"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0214
            r14 = 0
            goto L_0x0215
        L_0x020a:
            java.lang.String r8 = "gt"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0214
            r14 = 1
            goto L_0x0215
        L_0x0214:
            r14 = -1
        L_0x0215:
            if (r14 == 0) goto L_0x0245
            r8 = 1
            if (r14 == r8) goto L_0x0241
            r8 = 2
            if (r14 == r8) goto L_0x023d
            r8 = 3
            if (r14 == r8) goto L_0x0239
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ignoring unsupported entity: '&"
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = ";'"
            r8.append(r7)
            java.lang.String r7 = "WebvttCueParser"
            java.lang.String r8 = r8.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r7, r8)
            goto L_0x0248
        L_0x0239:
            r3.append(r13)
            goto L_0x0248
        L_0x023d:
            r3.append(r9)
            goto L_0x0248
        L_0x0241:
            r3.append(r11)
            goto L_0x0248
        L_0x0245:
            r3.append(r12)
        L_0x0248:
            if (r6 != r15) goto L_0x024d
            r3.append(r10)
        L_0x024d:
            int r7 = r6 + 1
            goto L_0x0253
        L_0x0250:
            r3.append(r8)
        L_0x0253:
            r6 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p171h.C3521k.m10164a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* renamed from: b */
    static C2566b m10165b(String str) {
        C3520j jVar = new C3520j();
        m10171h(str, jVar);
        return jVar.mo7451a();
    }

    /* renamed from: c */
    static C2567c m10166c(CharSequence charSequence) {
        C3520j jVar = new C3520j();
        jVar.f11004c = charSequence;
        return jVar.mo7451a().mo6076a();
    }

    /* renamed from: d */
    public static C3515e m10167d(C2604ac acVar, List list) {
        String q = acVar.mo6149q();
        if (q == null) {
            return null;
        }
        Pattern pattern = f11013a;
        Matcher matcher = pattern.matcher(q);
        if (matcher.matches()) {
            return m10168e((String) null, matcher, acVar, list);
        }
        String q2 = acVar.mo6149q();
        if (q2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(q2);
        if (matcher2.matches()) {
            return m10168e(q.trim(), matcher2, acVar, list);
        }
        return null;
    }

    /* renamed from: e */
    private static C3515e m10168e(String str, Matcher matcher, C2604ac acVar, List list) {
        C3520j jVar = new C3520j();
        try {
            String group = matcher.group(1);
            group.getClass();
            jVar.f11002a = C3523m.m10175b(group);
            String group2 = matcher.group(2);
            group2.getClass();
            jVar.f11003b = C3523m.m10175b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            m10171h(group3, jVar);
            StringBuilder sb = new StringBuilder();
            String q = acVar.mo6149q();
            while (!TextUtils.isEmpty(q)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(q.trim());
                q = acVar.mo6149q();
            }
            jVar.f11004c = m10164a(str, sb.toString(), list);
            return new C3515e(jVar.mo7451a().mo6076a(), jVar.f11002a, jVar.f11003b);
        } catch (NumberFormatException unused) {
            C2633u.m7050e("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m10169f(java.util.List r10, java.lang.String r11, androidx.media3.extractor.p163j.p171h.C3518h r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            int r3 = r10.size()
            if (r2 >= r3) goto L_0x007b
            java.lang.Object r3 = r10.get(r2)
            androidx.media3.extractor.j.h.d r3 = (androidx.media3.extractor.p163j.p171h.C3514d) r3
            java.lang.String r4 = r12.f10996a
            java.util.Set r5 = r12.f10999d
            java.lang.String r6 = r12.f10998c
            java.lang.String r7 = r3.f10973a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0041
            java.lang.String r7 = r3.f10974b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0041
            java.util.Set r7 = r3.f10975c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0041
            java.lang.String r7 = r3.f10976d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0041
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x006d
            r4 = 1
            goto L_0x006e
        L_0x0041:
            java.lang.String r7 = r3.f10973a
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = androidx.media3.extractor.p163j.p171h.C3514d.m10161b(r1, r7, r11, r8)
            java.lang.String r8 = r3.f10974b
            r9 = 2
            int r4 = androidx.media3.extractor.p163j.p171h.C3514d.m10161b(r7, r8, r4, r9)
            java.lang.String r7 = r3.f10976d
            r8 = 4
            int r4 = androidx.media3.extractor.p163j.p171h.C3514d.m10161b(r4, r7, r6, r8)
            r6 = -1
            if (r4 == r6) goto L_0x006d
            java.util.Set r6 = r3.f10975c
            boolean r5 = r5.containsAll(r6)
            if (r5 != 0) goto L_0x0063
            goto L_0x006d
        L_0x0063:
            java.util.Set r5 = r3.f10975c
            int r5 = r5.size()
            int r5 = r5 * 4
            int r4 = r4 + r5
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r4 <= 0) goto L_0x0078
            androidx.media3.extractor.j.h.i r5 = new androidx.media3.extractor.j.h.i
            r5.<init>(r4, r3)
            r0.add(r5)
        L_0x0078:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x007b:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p171h.C3521k.m10169f(java.util.List, java.lang.String, androidx.media3.extractor.j.h.h):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10170g(java.lang.String r17, androidx.media3.extractor.p163j.p171h.C3518h r18, java.util.List r19, android.text.SpannableStringBuilder r20, java.util.List r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            int r4 = r1.f10997b
            int r5 = r20.length()
            java.lang.String r6 = r1.f10996a
            int r7 = r6.hashCode()
            r9 = -1
            r10 = 2
            r12 = 1
            if (r7 == 0) goto L_0x007e
            r13 = 105(0x69, float:1.47E-43)
            if (r7 == r13) goto L_0x0074
            r13 = 3314158(0x3291ee, float:4.644125E-39)
            if (r7 == r13) goto L_0x006a
            r13 = 3511770(0x3595da, float:4.921038E-39)
            if (r7 == r13) goto L_0x0060
            r13 = 98
            if (r7 == r13) goto L_0x0056
            r13 = 99
            if (r7 == r13) goto L_0x004c
            r13 = 117(0x75, float:1.64E-43)
            if (r7 == r13) goto L_0x0042
            r13 = 118(0x76, float:1.65E-43)
            if (r7 == r13) goto L_0x0038
            goto L_0x0088
        L_0x0038:
            java.lang.String r7 = "v"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0088
            r6 = 6
            goto L_0x0089
        L_0x0042:
            java.lang.String r7 = "u"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0088
            r6 = 3
            goto L_0x0089
        L_0x004c:
            java.lang.String r7 = "c"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0088
            r6 = 4
            goto L_0x0089
        L_0x0056:
            java.lang.String r7 = "b"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0088
            r6 = 0
            goto L_0x0089
        L_0x0060:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0088
            r6 = 2
            goto L_0x0089
        L_0x006a:
            java.lang.String r7 = "lang"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0088
            r6 = 5
            goto L_0x0089
        L_0x0074:
            java.lang.String r7 = "i"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0088
            r6 = 1
            goto L_0x0089
        L_0x007e:
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0088
            r6 = 7
            goto L_0x0089
        L_0x0088:
            r6 = -1
        L_0x0089:
            r7 = 33
            switch(r6) {
                case 0: goto L_0x014b;
                case 1: goto L_0x0142;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00d7;
                case 4: goto L_0x008f;
                case 5: goto L_0x0153;
                case 6: goto L_0x0153;
                case 7: goto L_0x0153;
                default: goto L_0x008e;
            }
        L_0x008e:
            return
        L_0x008f:
            java.util.Set r6 = r1.f10999d
            java.util.Iterator r6 = r6.iterator()
        L_0x0095:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0153
            java.lang.Object r13 = r6.next()
            java.lang.String r13 = (java.lang.String) r13
            java.util.Map r14 = f11015c
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto L_0x00bc
            java.lang.Object r13 = r14.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            android.text.style.ForegroundColorSpan r14 = new android.text.style.ForegroundColorSpan
            r14.<init>(r13)
            r2.setSpan(r14, r4, r5, r7)
            goto L_0x0095
        L_0x00bc:
            java.util.Map r14 = f11016d
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto L_0x0095
            java.lang.Object r13 = r14.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            android.text.style.BackgroundColorSpan r14 = new android.text.style.BackgroundColorSpan
            r14.<init>(r13)
            r2.setSpan(r14, r4, r5, r7)
            goto L_0x0095
        L_0x00d7:
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r2.setSpan(r6, r4, r5, r7)
            goto L_0x0153
        L_0x00e1:
            m10172i(r3, r0, r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r13 = r19.size()
            r6.<init>(r13)
            r13 = r19
            r6.addAll(r13)
            java.util.Comparator r13 = androidx.media3.extractor.p163j.p171h.C3517g.f10993a
            java.util.Collections.sort(r6, r13)
            int r13 = r1.f10997b
            r14 = 0
            r15 = 0
        L_0x00fb:
            int r11 = r6.size()
            if (r14 >= r11) goto L_0x0153
            java.lang.Object r11 = r6.get(r14)
            androidx.media3.extractor.j.h.g r11 = (androidx.media3.extractor.p163j.p171h.C3517g) r11
            androidx.media3.extractor.j.h.h r11 = r11.f10994b
            java.lang.String r11 = r11.f10996a
            java.lang.String r8 = "rt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0114
            goto L_0x013f
        L_0x0114:
            java.lang.Object r8 = r6.get(r14)
            androidx.media3.extractor.j.h.g r8 = (androidx.media3.extractor.p163j.p171h.C3517g) r8
            androidx.media3.extractor.j.h.h r11 = r8.f10994b
            m10172i(r3, r0, r11)
            androidx.media3.extractor.j.h.h r11 = r8.f10994b
            int r11 = r11.f10997b
            int r11 = r11 - r15
            int r8 = r8.f10995c
            int r8 = r8 - r15
            java.lang.CharSequence r16 = r2.subSequence(r11, r8)
            r2.delete(r11, r8)
            androidx.media3.common.a.g r8 = new androidx.media3.common.a.g
            r16.toString()
            r8.<init>()
            r2.setSpan(r8, r13, r11, r7)
            int r8 = r16.length()
            int r15 = r15 + r8
            r13 = r11
        L_0x013f:
            int r14 = r14 + 1
            goto L_0x00fb
        L_0x0142:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r10)
            r2.setSpan(r6, r4, r5, r7)
            goto L_0x0153
        L_0x014b:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r12)
            r2.setSpan(r6, r4, r5, r7)
        L_0x0153:
            java.util.List r0 = m10169f(r3, r0, r1)
            r11 = 0
        L_0x0158:
            int r1 = r0.size()
            if (r11 >= r1) goto L_0x020d
            java.lang.Object r1 = r0.get(r11)
            androidx.media3.extractor.j.h.i r1 = (androidx.media3.extractor.p163j.p171h.C3519i) r1
            androidx.media3.extractor.j.h.d r1 = r1.f11001b
            if (r1 != 0) goto L_0x016b
            r6 = 3
            goto L_0x0209
        L_0x016b:
            int r3 = r1.mo7448a()
            if (r3 == r9) goto L_0x017d
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            int r6 = r1.mo7448a()
            r3.<init>(r6)
            androidx.media3.common.p135a.C2572h.m6791a(r2, r3, r4, r5)
        L_0x017d:
            int r3 = r1.f10982j
            if (r3 != r12) goto L_0x0189
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            r2.setSpan(r3, r4, r5, r7)
        L_0x0189:
            boolean r3 = r1.f10979g
            if (r3 == 0) goto L_0x01a4
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            boolean r6 = r1.f10979g
            if (r6 == 0) goto L_0x019c
            int r6 = r1.f10978f
            r3.<init>(r6)
            androidx.media3.common.p135a.C2572h.m6791a(r2, r3, r4, r5)
            goto L_0x01a4
        L_0x019c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
            r0.<init>(r1)
            throw r0
        L_0x01a4:
            boolean r3 = r1.f10981i
            if (r3 == 0) goto L_0x01bf
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            boolean r6 = r1.f10981i
            if (r6 == 0) goto L_0x01b7
            int r6 = r1.f10980h
            r3.<init>(r6)
            androidx.media3.common.p135a.C2572h.m6791a(r2, r3, r4, r5)
            goto L_0x01bf
        L_0x01b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
        L_0x01bf:
            java.lang.String r3 = r1.f10977e
            if (r3 == 0) goto L_0x01cd
            android.text.style.TypefaceSpan r3 = new android.text.style.TypefaceSpan
            java.lang.String r6 = r1.f10977e
            r3.<init>(r6)
            androidx.media3.common.p135a.C2572h.m6791a(r2, r3, r4, r5)
        L_0x01cd:
            int r3 = r1.f10985m
            if (r3 == r12) goto L_0x01f1
            if (r3 == r10) goto L_0x01e5
            r6 = 3
            if (r3 == r6) goto L_0x01d7
            goto L_0x01fd
        L_0x01d7:
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            float r8 = r1.f10986n
            r13 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r13
            r3.<init>(r8)
            androidx.media3.common.p135a.C2572h.m6791a(r2, r3, r4, r5)
            goto L_0x01fd
        L_0x01e5:
            r6 = 3
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            float r8 = r1.f10986n
            r3.<init>(r8)
            androidx.media3.common.p135a.C2572h.m6791a(r2, r3, r4, r5)
            goto L_0x01fd
        L_0x01f1:
            r6 = 3
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r8 = r1.f10986n
            int r8 = (int) r8
            r3.<init>(r8, r12)
            androidx.media3.common.p135a.C2572h.m6791a(r2, r3, r4, r5)
        L_0x01fd:
            boolean r1 = r1.f10988p
            if (r1 == 0) goto L_0x0209
            androidx.media3.common.a.e r1 = new androidx.media3.common.a.e
            r1.<init>()
            r2.setSpan(r1, r4, r5, r7)
        L_0x0209:
            int r11 = r11 + 1
            goto L_0x0158
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p171h.C3521k.m10170g(java.lang.String, androidx.media3.extractor.j.h.h, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01cc  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10171h(java.lang.String r17, androidx.media3.extractor.p163j.p171h.C3520j r18) {
        /*
            r0 = r18
            java.lang.String r1 = "WebvttCueParser"
            java.util.regex.Pattern r2 = f11014b
            r3 = r17
            java.util.regex.Matcher r2 = r2.matcher(r3)
        L_0x000c:
            boolean r3 = r2.find()
            if (r3 == 0) goto L_0x0210
            r3 = 1
            java.lang.String r4 = r2.group(r3)
            r4.getClass()
            r5 = 2
            java.lang.String r6 = r2.group(r5)
            r6.getClass()
            java.lang.String r7 = "line"
            boolean r7 = r7.equals(r4)     // Catch:{ NumberFormatException -> 0x01fd }
            java.lang.String r8 = "Invalid anchor value: "
            r9 = 44
            java.lang.String r11 = "start"
            java.lang.String r12 = "end"
            java.lang.String r13 = "middle"
            java.lang.String r14 = "center"
            r15 = -1
            r10 = 0
            if (r7 == 0) goto L_0x00a8
            int r4 = r6.indexOf(r9)     // Catch:{ NumberFormatException -> 0x01fd }
            if (r4 == r15) goto L_0x008b
            int r7 = r4 + 1
            java.lang.String r7 = r6.substring(r7)     // Catch:{ NumberFormatException -> 0x01fd }
            int r9 = r7.hashCode()     // Catch:{ NumberFormatException -> 0x01fd }
            switch(r9) {
                case -1364013995: goto L_0x0064;
                case -1074341483: goto L_0x005c;
                case 100571: goto L_0x0054;
                case 109757538: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x006b
        L_0x004c:
            boolean r9 = r7.equals(r11)
            if (r9 == 0) goto L_0x006b
            r15 = 0
            goto L_0x006b
        L_0x0054:
            boolean r9 = r7.equals(r12)
            if (r9 == 0) goto L_0x006b
            r15 = 3
            goto L_0x006b
        L_0x005c:
            boolean r9 = r7.equals(r13)
            if (r9 == 0) goto L_0x006b
            r15 = 2
            goto L_0x006b
        L_0x0064:
            boolean r9 = r7.equals(r14)
            if (r9 == 0) goto L_0x006b
            r15 = 1
        L_0x006b:
            if (r15 == 0) goto L_0x0084
            if (r15 == r3) goto L_0x0082
            if (r15 == r5) goto L_0x0082
            r9 = 3
            if (r15 == r9) goto L_0x0085
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch:{ NumberFormatException -> 0x01fd }
            java.lang.String r5 = r8.concat(r5)     // Catch:{ NumberFormatException -> 0x01fd }
            androidx.media3.common.p136b.C2633u.m7050e(r1, r5)     // Catch:{ NumberFormatException -> 0x01fd }
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0085
        L_0x0082:
            r5 = 1
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            r0.f11008g = r5     // Catch:{ NumberFormatException -> 0x01fd }
            java.lang.String r6 = r6.substring(r10, r4)     // Catch:{ NumberFormatException -> 0x01fd }
        L_0x008b:
            java.lang.String r4 = "%"
            boolean r4 = r6.endsWith(r4)     // Catch:{ NumberFormatException -> 0x01fd }
            if (r4 == 0) goto L_0x009d
            float r3 = androidx.media3.extractor.p163j.p171h.C3523m.m10174a(r6)     // Catch:{ NumberFormatException -> 0x01fd }
            r0.f11006e = r3     // Catch:{ NumberFormatException -> 0x01fd }
            r0.f11007f = r10     // Catch:{ NumberFormatException -> 0x01fd }
            goto L_0x000c
        L_0x009d:
            int r4 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x01fd }
            float r4 = (float) r4     // Catch:{ NumberFormatException -> 0x01fd }
            r0.f11006e = r4     // Catch:{ NumberFormatException -> 0x01fd }
            r0.f11007f = r3     // Catch:{ NumberFormatException -> 0x01fd }
            goto L_0x000c
        L_0x00a8:
            java.lang.String r7 = "align"
            boolean r7 = r7.equals(r4)     // Catch:{ NumberFormatException -> 0x01fd }
            r10 = 5
            r15 = 4
            if (r7 == 0) goto L_0x0111
            int r4 = r6.hashCode()     // Catch:{ NumberFormatException -> 0x01fd }
            switch(r4) {
                case -1364013995: goto L_0x00e6;
                case -1074341483: goto L_0x00de;
                case 100571: goto L_0x00d6;
                case 3317767: goto L_0x00cc;
                case 108511772: goto L_0x00c2;
                case 109757538: goto L_0x00ba;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x00ee
        L_0x00ba:
            boolean r4 = r6.equals(r11)
            if (r4 == 0) goto L_0x00ee
            r4 = 0
            goto L_0x00ef
        L_0x00c2:
            java.lang.String r4 = "right"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00ee
            r4 = 5
            goto L_0x00ef
        L_0x00cc:
            java.lang.String r4 = "left"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00ee
            r4 = 1
            goto L_0x00ef
        L_0x00d6:
            boolean r4 = r6.equals(r12)
            if (r4 == 0) goto L_0x00ee
            r4 = 4
            goto L_0x00ef
        L_0x00de:
            boolean r4 = r6.equals(r13)
            if (r4 == 0) goto L_0x00ee
            r4 = 3
            goto L_0x00ef
        L_0x00e6:
            boolean r4 = r6.equals(r14)
            if (r4 == 0) goto L_0x00ee
            r4 = 2
            goto L_0x00ef
        L_0x00ee:
            r4 = -1
        L_0x00ef:
            if (r4 == 0) goto L_0x010d
            if (r4 == r3) goto L_0x010c
            if (r4 == r5) goto L_0x010a
            r3 = 3
            if (r4 == r3) goto L_0x010a
            if (r4 == r15) goto L_0x0108
            if (r4 == r10) goto L_0x0106
            java.lang.String r3 = "Invalid alignment value: "
            java.lang.String r3 = r3.concat(r6)     // Catch:{ NumberFormatException -> 0x01fd }
            androidx.media3.common.p136b.C2633u.m7050e(r1, r3)     // Catch:{ NumberFormatException -> 0x01fd }
            goto L_0x010a
        L_0x0106:
            r3 = 5
            goto L_0x010d
        L_0x0108:
            r3 = 3
            goto L_0x010d
        L_0x010a:
            r3 = 2
            goto L_0x010d
        L_0x010c:
            r3 = 4
        L_0x010d:
            r0.f11005d = r3     // Catch:{ NumberFormatException -> 0x01fd }
            goto L_0x000c
        L_0x0111:
            java.lang.String r7 = "position"
            boolean r7 = r7.equals(r4)     // Catch:{ NumberFormatException -> 0x01fd }
            if (r7 == 0) goto L_0x018e
            int r4 = r6.indexOf(r9)     // Catch:{ NumberFormatException -> 0x01fd }
            r7 = -1
            if (r4 == r7) goto L_0x0186
            int r9 = r4 + 1
            java.lang.String r9 = r6.substring(r9)     // Catch:{ NumberFormatException -> 0x01fd }
            int r16 = r9.hashCode()     // Catch:{ NumberFormatException -> 0x01fd }
            switch(r16) {
                case -1842484672: goto L_0x0158;
                case -1364013995: goto L_0x0150;
                case -1276788989: goto L_0x0146;
                case -1074341483: goto L_0x013e;
                case 100571: goto L_0x0136;
                case 109757538: goto L_0x012e;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x0161
        L_0x012e:
            boolean r11 = r9.equals(r11)
            if (r11 == 0) goto L_0x0161
            r7 = 1
            goto L_0x0161
        L_0x0136:
            boolean r11 = r9.equals(r12)
            if (r11 == 0) goto L_0x0161
            r7 = 5
            goto L_0x0161
        L_0x013e:
            boolean r11 = r9.equals(r13)
            if (r11 == 0) goto L_0x0161
            r7 = 3
            goto L_0x0161
        L_0x0146:
            java.lang.String r11 = "line-right"
            boolean r11 = r9.equals(r11)
            if (r11 == 0) goto L_0x0161
            r7 = 4
            goto L_0x0161
        L_0x0150:
            boolean r11 = r9.equals(r14)
            if (r11 == 0) goto L_0x0161
            r7 = 2
            goto L_0x0161
        L_0x0158:
            java.lang.String r11 = "line-left"
            boolean r11 = r9.equals(r11)
            if (r11 == 0) goto L_0x0161
            r7 = 0
        L_0x0161:
            if (r7 == 0) goto L_0x017e
            if (r7 == r3) goto L_0x017e
            if (r7 == r5) goto L_0x017f
            r11 = 3
            if (r7 == r11) goto L_0x017f
            if (r7 == r15) goto L_0x017c
            if (r7 == r10) goto L_0x017c
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ NumberFormatException -> 0x01fd }
            java.lang.String r3 = r8.concat(r3)     // Catch:{ NumberFormatException -> 0x01fd }
            androidx.media3.common.p136b.C2633u.m7050e(r1, r3)     // Catch:{ NumberFormatException -> 0x01fd }
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x017f
        L_0x017c:
            r3 = 2
            goto L_0x017f
        L_0x017e:
            r3 = 0
        L_0x017f:
            r0.f11010i = r3     // Catch:{ NumberFormatException -> 0x01fd }
            r8 = 0
            java.lang.String r6 = r6.substring(r8, r4)     // Catch:{ NumberFormatException -> 0x01fd }
        L_0x0186:
            float r3 = androidx.media3.extractor.p163j.p171h.C3523m.m10174a(r6)     // Catch:{ NumberFormatException -> 0x01fd }
            r0.f11009h = r3     // Catch:{ NumberFormatException -> 0x01fd }
            goto L_0x000c
        L_0x018e:
            r7 = -1
            r8 = 0
            java.lang.String r9 = "size"
            boolean r9 = r9.equals(r4)     // Catch:{ NumberFormatException -> 0x01fd }
            if (r9 == 0) goto L_0x01a0
            float r3 = androidx.media3.extractor.p163j.p171h.C3523m.m10174a(r6)     // Catch:{ NumberFormatException -> 0x01fd }
            r0.f11011j = r3     // Catch:{ NumberFormatException -> 0x01fd }
            goto L_0x000c
        L_0x01a0:
            java.lang.String r9 = "vertical"
            boolean r9 = r9.equals(r4)     // Catch:{ NumberFormatException -> 0x01fd }
            if (r9 == 0) goto L_0x01df
            int r4 = r6.hashCode()     // Catch:{ NumberFormatException -> 0x01fd }
            r9 = 3462(0xd86, float:4.851E-42)
            if (r4 == r9) goto L_0x01bf
            r9 = 3642(0xe3a, float:5.104E-42)
            if (r4 == r9) goto L_0x01b5
            goto L_0x01c9
        L_0x01b5:
            java.lang.String r4 = "rl"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x01c9
            r15 = 0
            goto L_0x01ca
        L_0x01bf:
            java.lang.String r4 = "lr"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x01c9
            r15 = 1
            goto L_0x01ca
        L_0x01c9:
            r15 = -1
        L_0x01ca:
            if (r15 == 0) goto L_0x01db
            if (r15 == r3) goto L_0x01da
            java.lang.String r3 = "Invalid 'vertical' value: "
            java.lang.String r3 = r3.concat(r6)     // Catch:{ NumberFormatException -> 0x01fd }
            androidx.media3.common.p136b.C2633u.m7050e(r1, r3)     // Catch:{ NumberFormatException -> 0x01fd }
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01db
        L_0x01da:
            r3 = 2
        L_0x01db:
            r0.f11012k = r3     // Catch:{ NumberFormatException -> 0x01fd }
            goto L_0x000c
        L_0x01df:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01fd }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x01fd }
            java.lang.String r5 = "Unknown cue setting "
            r3.append(r5)     // Catch:{ NumberFormatException -> 0x01fd }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x01fd }
            java.lang.String r4 = ":"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x01fd }
            r3.append(r6)     // Catch:{ NumberFormatException -> 0x01fd }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x01fd }
            androidx.media3.common.p136b.C2633u.m7050e(r1, r3)     // Catch:{ NumberFormatException -> 0x01fd }
            goto L_0x000c
        L_0x01fd:
            java.lang.String r3 = r2.group()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Skipping bad cue setting: "
            java.lang.String r3 = r4.concat(r3)
            androidx.media3.common.p136b.C2633u.m7050e(r1, r3)
            goto L_0x000c
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p171h.C3521k.m10171h(java.lang.String, androidx.media3.extractor.j.h.j):void");
    }

    /* renamed from: i */
    private static void m10172i(List list, String str, C3518h hVar) {
        List f = m10169f(list, str, hVar);
        int i = 0;
        while (i < f.size() && ((C3519i) f.get(i)).f11001b.f10987o == -1) {
            i++;
        }
    }
}
