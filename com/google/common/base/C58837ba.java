package com.google.common.base;

import com.evernote.android.state.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: com.google.common.base.ba */
/* compiled from: PG */
public final class C58837ba {

    /* renamed from: a */
    public static final /* synthetic */ int f156634a = 0;

    static {
        Logger.getLogger(C58837ba.class.getName());
    }

    private C58837ba() {
    }

    /* renamed from: a */
    static long m90852a() {
        return System.nanoTime();
    }

    /* renamed from: b */
    public static C58912v m90853b(C58912v vVar) {
        String str;
        BitSet bitSet = new BitSet();
        vVar.mo56143b(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality + cardinality <= 65536) {
            return C58912v.m91035l(cardinality, bitSet, vVar.toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - cardinality;
        String vVar2 = vVar.toString();
        if (vVar2.endsWith(".negate()")) {
            str = vVar2.substring(0, vVar2.length() - 9);
        } else {
            str = String.valueOf(vVar2).concat(".negate()");
        }
        return new C58895e(C58912v.m91035l(i, bitSet, str), vVar2);
    }

    /* renamed from: c */
    public static C58915y m90854c(String str) {
        return new C58822am(Pattern.compile(str));
    }

    /* renamed from: d */
    static C58833ax m90855d(Class cls, String str) {
        Map map;
        synchronized (C58811ab.f156603a) {
            map = (Map) C58811ab.f156603a.get(cls);
            if (map == null) {
                map = new HashMap();
                Iterator it = EnumSet.allOf(cls).iterator();
                while (it.hasNext()) {
                    Enum enumR = (Enum) it.next();
                    map.put(enumR.name(), new WeakReference(enumR));
                }
                C58811ab.f156603a.put(cls, map);
            }
        }
        WeakReference weakReference = (WeakReference) map.get(str);
        if (weakReference == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k((Enum) cls.cast(weakReference.get()));
    }

    /* renamed from: e */
    public static String m90856e(String str) {
        if (m90859h(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    static String m90857f(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    /* renamed from: g */
    public static String m90858g(String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: h */
    public static boolean m90859h(String str) {
        return str == null || str.isEmpty();
    }
}
