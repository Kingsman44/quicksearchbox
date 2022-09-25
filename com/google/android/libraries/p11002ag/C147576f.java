package com.google.android.libraries.p11002ag;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p11002ag.p11003a.C147551a;
import com.google.android.libraries.p11002ag.p11003a.C147552b;
import com.google.android.libraries.p11002ag.p11003a.C147555e;
import com.google.android.libraries.p11002ag.p11004b.C147557a;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147561b;
import com.google.android.libraries.p11002ag.p11004b.p11006b.C147568i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.ag.f */
/* compiled from: PG */
public final class C147576f {

    /* renamed from: a */
    public static final Map f398274a;

    /* renamed from: b */
    public static final Pattern f398275b = Pattern.compile("[+＋]+");

    /* renamed from: c */
    static final Pattern f398276c = Pattern.compile("[\\\\/] *x");

    /* renamed from: d */
    static final Pattern f398277d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");

    /* renamed from: f */
    private static final Logger f398278f = Logger.getLogger(C147576f.class.getName());

    /* renamed from: g */
    private static final Map f398279g;

    /* renamed from: h */
    private static final Map f398280h;

    /* renamed from: i */
    private static final String f398281i;

    /* renamed from: j */
    private static final Pattern f398282j = Pattern.compile("(\\p{Nd})");

    /* renamed from: k */
    private static final Pattern f398283k = Pattern.compile("[+＋\\p{Nd}]");

    /* renamed from: l */
    private static final Pattern f398284l = Pattern.compile("(?:.*?[A-Za-z]){3}.*");

    /* renamed from: m */
    private static final String f398285m;

    /* renamed from: n */
    private static final String f398286n;

    /* renamed from: o */
    private static final Pattern f398287o;

    /* renamed from: p */
    private static final Pattern f398288p;

    /* renamed from: q */
    private static final Pattern f398289q = Pattern.compile("(\\$\\d)");

    /* renamed from: r */
    private static final Pattern f398290r = Pattern.compile("\\(?\\$1\\)?");

    /* renamed from: s */
    private static C147576f f398291s = null;

    /* renamed from: e */
    public final Set f398292e = new HashSet(320);

    /* renamed from: t */
    private final Map f398293t;

    /* renamed from: u */
    private final Set f398294u = new HashSet(35);

    /* renamed from: v */
    private final C147555e f398295v = new C147555e(100);

    /* renamed from: w */
    private final Set f398296w = new HashSet();

    /* renamed from: x */
    private final C147568i f398297x;

    /* renamed from: y */
    private final C147552b f398298y = new C147552b();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        f398279g = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f398280h = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f398274a = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character charValue : unmodifiableMap.keySet()) {
            char charValue2 = charValue.charValue();
            Character valueOf = Character.valueOf(Character.toLowerCase(charValue2));
            Character valueOf2 = Character.valueOf(charValue2);
            hashMap6.put(valueOf, valueOf2);
            hashMap6.put(valueOf2, valueOf2);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put(65293, '-');
        hashMap6.put(8208, '-');
        hashMap6.put(8209, '-');
        hashMap6.put(8210, '-');
        hashMap6.put(8211, '-');
        hashMap6.put(8212, '-');
        hashMap6.put(8213, '-');
        hashMap6.put(8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put(65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put(12288, ' ');
        hashMap6.put(8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put(65294, '.');
        Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        Map map = f398279g;
        String concat = String.valueOf(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", BuildConfig.FLAVOR)).concat(String.valueOf(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", BuildConfig.FLAVOR)));
        f398281i = concat;
        Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*" + concat + "\\p{Nd}]*";
        f398285m = str;
        String D = m240612D(true);
        f398286n = D;
        m240612D(false);
        f398287o = Pattern.compile("(?:" + D + ")$", 66);
        f398288p = Pattern.compile(str + "(?:" + D + ")?", 66);
        Pattern.compile("(\\D+)");
    }

    public C147576f(C147568i iVar, Map map) {
        this.f398297x = iVar;
        this.f398293t = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.f398292e.addAll(list);
            } else {
                this.f398296w.add(entry.getKey());
            }
        }
        if (this.f398292e.remove("001")) {
            f398278f.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f398294u.addAll((Collection) map.get(1));
    }

    /* renamed from: A */
    private final int m240609A(String str) {
        C147579i e = mo124319e(str);
        if (e != null) {
            return e.f398350o;
        }
        throw new IllegalArgumentException("Invalid region code: ".concat(String.valueOf(str)));
    }

    /* renamed from: B */
    private final C147579i m240610B(int i, String str) {
        if ("001".equals(str)) {
            return mo124318d(i);
        }
        return mo124319e(str);
    }

    /* renamed from: C */
    private static C147582l m240611C(C147582l lVar) {
        C147582l lVar2 = new C147582l();
        lVar2.f398369a = lVar.f398369a;
        lVar2.f398370b = lVar.f398370b;
        if (lVar.f398372d.length() > 0) {
            lVar2.mo124347b(lVar.f398372d);
        }
        if (lVar.f398374f) {
            lVar2.mo124348c();
            lVar2.mo124349d(lVar.f398376h);
        }
        return lVar2;
    }

    /* renamed from: D */
    private static String m240612D(boolean z) {
        String E = m240613E(20);
        String str = ";ext=".concat(E) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + m240613E(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + m240613E(9) + "#?") + "|" + ("[- ]+" + m240613E(6) + "#");
        if (!z) {
            return str;
        }
        return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + m240613E(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + m240613E(9) + "#?");
    }

    /* renamed from: E */
    private static String m240613E(int i) {
        return "(\\p{Nd}{1," + i + "})";
    }

    /* renamed from: F */
    private static void m240614F(C147579i iVar, String str) {
        if (iVar == null) {
            throw new C147574d(str);
        }
    }

    /* renamed from: G */
    private static boolean m240615G(C147581k kVar) {
        return (kVar.mo124343a() == 1 && ((Integer) kVar.f398364b.get(0)).intValue() == -1) ? false : true;
    }

    /* renamed from: H */
    private final boolean m240616H(String str) {
        return str != null && this.f398292e.contains(str);
    }

    /* renamed from: I */
    private final int m240617I(String str, C147579i iVar) {
        if (!mo124324n(str, iVar.f398333a)) {
            return 12;
        }
        if (mo124324n(str, iVar.f398340e)) {
            return 5;
        }
        if (mo124324n(str, iVar.f398339d)) {
            return 4;
        }
        if (mo124324n(str, iVar.f398341f)) {
            return 6;
        }
        if (mo124324n(str, iVar.f398343h)) {
            return 7;
        }
        if (mo124324n(str, iVar.f398342g)) {
            return 8;
        }
        if (mo124324n(str, iVar.f398344i)) {
            return 9;
        }
        if (mo124324n(str, iVar.f398345j)) {
            return 10;
        }
        if (mo124324n(str, iVar.f398348m)) {
            return 11;
        }
        if (mo124324n(str, iVar.f398337b)) {
            if (iVar.f398357v || mo124324n(str, iVar.f398338c)) {
                return 3;
            }
            return 1;
        } else if (iVar.f398357v || !mo124324n(str, iVar.f398338c)) {
            return 12;
        } else {
            return 2;
        }
    }

    /* renamed from: J */
    private final int m240618J(CharSequence charSequence, C147579i iVar, int i) {
        ArrayList arrayList;
        List list;
        C147581k t = m240627t(iVar, i);
        if (t.f398364b.isEmpty()) {
            arrayList = iVar.f398333a.f398364b;
        } else {
            arrayList = t.f398364b;
        }
        List list2 = t.f398365c;
        if (i == 3) {
            if (!m240615G(m240627t(iVar, 1))) {
                return m240618J(charSequence, iVar, 2);
            }
            C147581k t2 = m240627t(iVar, 2);
            if (m240615G(t2)) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (t2.mo124343a() == 0) {
                    list = iVar.f398333a.f398364b;
                } else {
                    list = t2.f398364b;
                }
                arrayList2.addAll(list);
                Collections.sort(arrayList2);
                if (list2.isEmpty()) {
                    list2 = t2.f398365c;
                } else {
                    ArrayList arrayList3 = new ArrayList(list2);
                    arrayList3.addAll(t2.f398365c);
                    Collections.sort(arrayList3);
                    list2 = arrayList3;
                }
                arrayList = arrayList2;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Integer valueOf = Integer.valueOf(length);
        if (list2.contains(valueOf)) {
            return 2;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue == length) {
            return 1;
        }
        if (intValue > length) {
            return 4;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return 6;
        }
        if (arrayList.subList(1, arrayList.size()).contains(valueOf)) {
            return 1;
        }
        return 5;
    }

    /* renamed from: K */
    private static final boolean m240619K(C147582l lVar, C147582l lVar2) {
        String valueOf = String.valueOf(lVar.f398370b);
        String valueOf2 = String.valueOf(lVar2.f398370b);
        return valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf);
    }

    /* renamed from: L */
    private static final void m240620L(int i, int i2, StringBuilder sb) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            sb.insert(0, i).insert(0, '+');
        } else if (i3 == 1) {
            sb.insert(0, " ").insert(0, i).insert(0, '+');
        }
    }

    /* renamed from: c */
    public static synchronized C147576f m240621c() {
        C147576f fVar;
        synchronized (C147576f.class) {
            if (f398291s == null) {
                C147557a aVar = C147557a.f398252a;
                m240624l(new C147576f(new C147568i(aVar.f398255d, aVar.f398254c, C147557a.f398252a.f398253b), C147556b.m240593a()));
            }
            fVar = f398291s;
        }
        return fVar;
    }

    /* renamed from: g */
    public static CharSequence m240622g(CharSequence charSequence) {
        Matcher matcher = f398283k.matcher(charSequence);
        if (!matcher.find()) {
            return BuildConfig.FLAVOR;
        }
        CharSequence subSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        Matcher matcher2 = f398277d.matcher(subSequence);
        if (matcher2.find()) {
            subSequence = subSequence.subSequence(0, matcher2.start());
        }
        Matcher matcher3 = f398276c.matcher(subSequence);
        return matcher3.find() ? subSequence.subSequence(0, matcher3.start()) : subSequence;
    }

    /* renamed from: k */
    public static String m240623k(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int digit = Character.digit(charSequence.charAt(i), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    /* renamed from: l */
    static synchronized void m240624l(C147576f fVar) {
        synchronized (C147576f.class) {
            f398291s = fVar;
        }
    }

    /* renamed from: m */
    static boolean m240625m(String str) {
        return str.length() == 0 || f398290r.matcher(str).matches();
    }

    /* renamed from: p */
    static boolean m240626p(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return f398288p.matcher(charSequence).matches();
    }

    /* renamed from: t */
    static final C147581k m240627t(C147579i iVar, int i) {
        switch (i - 1) {
            case 0:
            case 2:
                return iVar.f398337b;
            case 1:
                return iVar.f398338c;
            case 3:
                return iVar.f398339d;
            case 4:
                return iVar.f398340e;
            case 5:
                return iVar.f398341f;
            case 6:
                return iVar.f398343h;
            case 7:
                return iVar.f398342g;
            case 8:
                return iVar.f398344i;
            case 9:
                return iVar.f398345j;
            case 10:
                return iVar.f398348m;
            default:
                return iVar.f398333a;
        }
    }

    /* renamed from: w */
    static void m240628w(StringBuilder sb) {
        if (f398284l.matcher(sb).matches()) {
            sb.replace(0, sb.length(), m240629x(sb, f398280h));
        } else {
            sb.replace(0, sb.length(), m240623k(sb));
        }
    }

    /* renamed from: x */
    public static String m240629x(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    /* renamed from: z */
    public static final int m240630z(C147582l lVar, C147582l lVar2) {
        C147582l C = m240611C(lVar);
        C147582l C2 = m240611C(lVar2);
        if (C.f398371c && C2.f398371c && !C.f398372d.equals(C2.f398372d)) {
            return 2;
        }
        int i = C.f398369a;
        int i2 = C2.f398369a;
        if (i == 0 || i2 == 0) {
            C.f398369a = i2;
            if (C.mo124346a(C2)) {
                return 4;
            }
            if (m240619K(C, C2)) {
                return 3;
            }
            return 2;
        } else if (C.mo124346a(C2)) {
            return 5;
        } else {
            if (i != i2 || !m240619K(C, C2)) {
                return 2;
            }
            return 3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo124316a(StringBuilder sb, StringBuilder sb2) {
        if (!(sb.length() == 0 || sb.charAt(0) == '0')) {
            int length = sb.length();
            int i = 1;
            while (i <= 3 && i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (this.f398293t.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
                i++;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo124317b(String str) {
        if (m240616H(str)) {
            return m240609A(str);
        }
        Logger logger = f398278f;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(") provided.");
        logger.log(level, sb.toString());
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C147579i mo124318d(int i) {
        Set set = this.f398296w;
        Integer valueOf = Integer.valueOf(i);
        if (!set.contains(valueOf)) {
            return null;
        }
        C147568i iVar = this.f398297x;
        List list = (List) C147556b.m240593a().get(valueOf);
        if (list == null || list.contains("001")) {
            C147579i b = ((C147561b) iVar.f398267b.mo124310a(iVar.f398266a.mo124314a(valueOf))).f398262a.mo124313b(valueOf);
            m240614F(b, "Missing metadata for country code " + i);
            return b;
        }
        throw new IllegalArgumentException(i + " calling code belongs to a geo entity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C147579i mo124319e(String str) {
        if (!m240616H(str)) {
            return null;
        }
        C147568i iVar = this.f398297x;
        if (C147551a.m240588a(str)) {
            C147579i b = ((C147561b) iVar.f398267b.mo124310a(iVar.f398266a.mo124314a(str))).f398263b.mo124313b(str);
            m240614F(b, "Missing metadata for region code ".concat(String.valueOf(str)));
            return b;
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" region code is a non-geo entity"));
    }

    /* renamed from: f */
    public final C147582l mo124320f(CharSequence charSequence, String str) {
        C147582l lVar = new C147582l();
        mo124331y(charSequence, str, true, lVar);
        return lVar;
    }

    /* renamed from: h */
    public final String mo124321h(C147582l lVar) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (lVar.f398374f && (i = lVar.f398376h) > 0) {
            char[] cArr = new char[i];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(lVar.f398370b);
        return sb.toString();
    }

    /* renamed from: i */
    public final String mo124322i(int i) {
        List list = (List) this.f398293t.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return (String) list.get(0);
    }

    /* renamed from: j */
    public final String mo124323j(C147582l lVar) {
        int i = lVar.f398369a;
        List<String> list = (List) this.f398293t.get(Integer.valueOf(i));
        if (list == null) {
            Logger logger = f398278f;
            Level level = Level.INFO;
            logger.log(level, "Missing/invalid country_code (" + i + ")");
            return null;
        } else if (list.size() == 1) {
            return (String) list.get(0);
        } else {
            String h = mo124321h(lVar);
            for (String str : list) {
                C147579i e = mo124319e(str);
                if (e.f398360y) {
                    if (this.f398295v.mo124309a(e.f398361z).matcher(h).lookingAt()) {
                    }
                } else if (m240617I(h, e) != 12) {
                }
                return str;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo124324n(String str, C147581k kVar) {
        int length = str.length();
        List list = kVar.f398364b;
        if (list.size() <= 0 || list.contains(Integer.valueOf(length))) {
            return this.f398298y.mo124305a(str, kVar, false);
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo124325o(C147582l lVar, String str) {
        int i = lVar.f398369a;
        C147579i B = m240610B(i, str);
        if (B == null || ((!"001".equals(str) && i != m240609A(str)) || m240617I(mo124321h(lVar), B) == 12)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final int mo124326q(C147582l lVar, CharSequence charSequence) {
        try {
            return m240630z(lVar, mo124320f(charSequence, "ZZ"));
        } catch (C147575e e) {
            if (e.f398272a == 1) {
                String i = mo124322i(lVar.f398369a);
                try {
                    if (!i.equals("ZZ")) {
                        int z = m240630z(lVar, mo124320f(charSequence, i));
                        if (z == 5) {
                            return 4;
                        }
                        return z;
                    }
                    C147582l lVar2 = new C147582l();
                    mo124331y(charSequence, (String) null, false, lVar2);
                    return m240630z(lVar, lVar2);
                } catch (C147575e unused) {
                    return 1;
                }
            }
            return 1;
        }
    }

    /* renamed from: r */
    public final int mo124327r(CharSequence charSequence, CharSequence charSequence2) {
        try {
            return mo124326q(mo124320f(charSequence, "ZZ"), charSequence2);
        } catch (C147575e e) {
            if (e.f398272a == 1) {
                try {
                    return mo124326q(mo124320f(charSequence2, "ZZ"), charSequence);
                } catch (C147575e e2) {
                    if (e2.f398272a == 1) {
                        try {
                            C147582l lVar = new C147582l();
                            C147582l lVar2 = new C147582l();
                            mo124331y(charSequence, (String) null, false, lVar);
                            mo124331y(charSequence2, (String) null, false, lVar2);
                            return m240630z(lVar, lVar2);
                        } catch (C147575e unused) {
                            return 1;
                        }
                    }
                    return 1;
                }
            }
            return 1;
        }
    }

    /* renamed from: s */
    public final String mo124328s(C147582l lVar, int i) {
        List list;
        C147577g gVar;
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i2 = lVar.f398369a;
        String h = mo124321h(lVar);
        if (i == 1) {
            sb.append(h);
            m240620L(i2, 1, sb);
        } else if (!this.f398293t.containsKey(Integer.valueOf(i2))) {
            sb.append(h);
        } else {
            C147579i B = m240610B(i2, mo124322i(i2));
            if (B.f398359x.size() == 0 || i == 3) {
                list = B.f398358w;
            } else {
                list = B.f398359x;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (C147577g) it.next();
                int a = gVar.mo124332a();
                if ((a == 0 || this.f398295v.mo124309a(gVar.mo124333b(a - 1)).matcher(h).lookingAt()) && this.f398295v.mo124309a(gVar.f398299a).matcher(h).matches()) {
                    break;
                }
            }
            if (gVar != null) {
                String str = gVar.f398300b;
                Matcher matcher = this.f398295v.mo124309a(gVar.f398299a).matcher(h);
                String str2 = gVar.f398301c;
                if (i != 3 || str2 == null || str2.length() <= 0) {
                    h = matcher.replaceAll(str);
                } else {
                    h = matcher.replaceAll(f398289q.matcher(str).replaceFirst(str2));
                }
            }
            sb.append(h);
            if (lVar.f398371c && lVar.f398372d.length() > 0) {
                if (B.f398352q) {
                    sb.append(B.f398353r);
                    sb.append(lVar.f398372d);
                } else {
                    sb.append(" ext. ");
                    sb.append(lVar.f398372d);
                }
            }
            m240620L(i2, i, sb);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final int mo124329u(CharSequence charSequence, C147579i iVar, StringBuilder sb, C147582l lVar) {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = iVar != null ? iVar.f398351p : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = f398275b.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                m240628w(sb2);
            } else {
                Pattern a = this.f398295v.mo124309a(str);
                m240628w(sb2);
                Matcher matcher2 = a.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = f398282j.matcher(sb2.substring(end));
                    if (!matcher3.find() || !m240623k(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                    }
                }
            }
            if (sb2.length() > 2) {
                int a2 = mo124316a(sb2, sb);
                if (a2 != 0) {
                    lVar.f398369a = a2;
                    return a2;
                }
                throw new C147575e(1, "Country calling code supplied was not recognised.");
            }
            throw new C147575e(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (iVar != null) {
            int i = iVar.f398350o;
            String valueOf = String.valueOf(i);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                C147581k kVar = iVar.f398333a;
                mo124330v(sb4, iVar, (StringBuilder) null);
                if ((!this.f398298y.mo124305a(sb2, kVar, false) && this.f398298y.mo124305a(sb4, kVar, false)) || m240618J(sb2, iVar, 12) == 6) {
                    sb.append(sb4);
                    lVar.f398369a = i;
                    return i;
                }
            }
        }
        lVar.f398369a = 0;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo124330v(StringBuilder sb, C147579i iVar, StringBuilder sb2) {
        int length = sb.length();
        String str = iVar.f398355t;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.f398295v.mo124309a(str).matcher(sb);
            if (matcher.lookingAt()) {
                C147581k kVar = iVar.f398333a;
                boolean a = this.f398298y.mo124305a(sb, kVar, false);
                int groupCount = matcher.groupCount();
                String str2 = iVar.f398356u;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!a || this.f398298y.mo124305a(sb3.toString(), kVar, false)) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                    }
                } else if (!a || this.f398298y.mo124305a(sb.substring(matcher.end()), kVar, false)) {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo124331y(CharSequence charSequence, String str, boolean z, C147582l lVar) {
        String str2;
        int i;
        if (charSequence == null) {
            throw new C147575e(2, "The phone number supplied was null.");
        } else if (charSequence.length() <= 250) {
            StringBuilder sb = new StringBuilder();
            String obj = charSequence.toString();
            int indexOf = obj.indexOf(";phone-context=");
            if (indexOf >= 0) {
                int i2 = indexOf + 15;
                if (i2 < obj.length() - 1 && obj.charAt(i2) == '+') {
                    int indexOf2 = obj.indexOf(59, i2);
                    if (indexOf2 > 0) {
                        sb.append(obj.substring(i2, indexOf2));
                    } else {
                        sb.append(obj.substring(i2));
                    }
                }
                int indexOf3 = obj.indexOf("tel:");
                sb.append(obj.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
            } else {
                sb.append(m240622g(obj));
            }
            int indexOf4 = sb.indexOf(";isub=");
            if (indexOf4 > 0) {
                sb.delete(indexOf4, sb.length());
            }
            if (!m240626p(sb)) {
                throw new C147575e(2, "The string supplied did not seem to be a phone number.");
            } else if (!z || m240616H(str) || (sb.length() != 0 && f398275b.matcher(sb).lookingAt())) {
                Matcher matcher = f398287o.matcher(sb);
                if (matcher.find() && m240626p(sb.substring(0, matcher.start()))) {
                    int groupCount = matcher.groupCount();
                    int i3 = 1;
                    while (true) {
                        if (i3 > groupCount) {
                            break;
                        } else if (matcher.group(i3) != null) {
                            str2 = matcher.group(i3);
                            sb.delete(matcher.start(), sb.length());
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                str2 = BuildConfig.FLAVOR;
                if (str2.length() > 0) {
                    lVar.mo124347b(str2);
                }
                C147579i e = mo124319e(str);
                StringBuilder sb2 = new StringBuilder();
                try {
                    i = mo124329u(sb, e, sb2, lVar);
                } catch (C147575e e2) {
                    Matcher matcher2 = f398275b.matcher(sb);
                    if (e2.f398272a != 1 || !matcher2.lookingAt()) {
                        throw new C147575e(e2.f398272a, e2.getMessage());
                    }
                    i = mo124329u(sb.substring(matcher2.end()), e, sb2, lVar);
                    if (i == 0) {
                        throw new C147575e(1, "Could not interpret numbers after plus-sign.");
                    }
                }
                if (i != 0) {
                    String i4 = mo124322i(i);
                    if (!i4.equals(str)) {
                        e = m240610B(i, i4);
                    }
                } else {
                    m240628w(sb);
                    sb2.append(sb);
                    if (str != null) {
                        lVar.f398369a = e.f398350o;
                    }
                }
                if (sb2.length() >= 2) {
                    if (e != null) {
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder sb4 = new StringBuilder(sb2);
                        mo124330v(sb4, e, sb3);
                        int J = m240618J(sb4, e, 12);
                        if (!(J == 4 || J == 2 || J == 5)) {
                            sb2 = sb4;
                        }
                    }
                    int length = sb2.length();
                    if (length < 2) {
                        throw new C147575e(4, "The string supplied is too short to be a phone number.");
                    } else if (length <= 17) {
                        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                            lVar.mo124348c();
                            int i5 = 1;
                            while (i5 < sb2.length() - 1 && sb2.charAt(i5) == '0') {
                                i5++;
                            }
                            if (i5 != 1) {
                                lVar.mo124349d(i5);
                            }
                        }
                        lVar.f398370b = Long.parseLong(sb2.toString());
                    } else {
                        throw new C147575e(5, "The string supplied is too long to be a phone number.");
                    }
                } else {
                    throw new C147575e(4, "The string supplied is too short to be a phone number.");
                }
            } else {
                throw new C147575e(1, "Missing or invalid default region.");
            }
        } else {
            throw new C147575e(5, "The string supplied was too long to parse.");
        }
    }
}
