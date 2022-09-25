package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.ad */
/* compiled from: PG */
public final class C145224ad {

    /* renamed from: a */
    public static final C145224ad f392558a = new C145224ad((Boolean) null, (Boolean) null);

    /* renamed from: b */
    public final EnumMap f392559b;

    public C145224ad(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(C145223ac.class);
        this.f392559b = enumMap;
        enumMap.put(C145223ac.AD_STORAGE, bool);
        enumMap.put(C145223ac.ANALYTICS_STORAGE, bool2);
    }

    /* renamed from: a */
    public static C145224ad m235919a(Bundle bundle) {
        if (bundle == null) {
            return f392558a;
        }
        EnumMap enumMap = new EnumMap(C145223ac.class);
        for (C145223ac acVar : C145223ac.values()) {
            enumMap.put(acVar, m235924k(bundle.getString(acVar.f392557d)));
        }
        return new C145224ad(enumMap);
    }

    /* renamed from: b */
    public static C145224ad m235920b(String str) {
        EnumMap enumMap = new EnumMap(C145223ac.class);
        if (str != null) {
            int i = 0;
            while (true) {
                int length = C145223ac.f392555c.length;
                if (i >= 2) {
                    break;
                }
                C145223ac acVar = C145223ac.f392555c[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(acVar, bool);
                }
                i++;
            }
        }
        return new C145224ad(enumMap);
    }

    /* renamed from: d */
    public static String m235921d(Bundle bundle) {
        String string;
        for (C145223ac acVar : C145223ac.values()) {
            if (bundle.containsKey(acVar.f392557d) && (string = bundle.getString(acVar.f392557d)) != null && m235924k(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m235922g(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: j */
    static final int m235923j(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: k */
    private static Boolean m235924k(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C145224ad mo120783c(C145224ad adVar) {
        EnumMap enumMap = new EnumMap(C145223ac.class);
        for (C145223ac acVar : C145223ac.values()) {
            Boolean bool = (Boolean) this.f392559b.get(acVar);
            Boolean bool2 = (Boolean) adVar.f392559b.get(acVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(acVar, bool);
        }
        return new C145224ad(enumMap);
    }

    /* renamed from: e */
    public final String mo120784e() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        C145223ac[] acVarArr = C145223ac.f392555c;
        int length = acVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f392559b.get(acVarArr[i]);
            if (bool == null) {
                c = '-';
            } else {
                c = bool.booleanValue() ? '1' : '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C145224ad)) {
            return false;
        }
        C145224ad adVar = (C145224ad) obj;
        for (C145223ac acVar : C145223ac.values()) {
            if (m235923j((Boolean) this.f392559b.get(acVar)) != m235923j((Boolean) adVar.f392559b.get(acVar))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo120786f(C145223ac acVar) {
        Boolean bool = (Boolean) this.f392559b.get(acVar);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: h */
    public final boolean mo120787h(C145224ad adVar) {
        return mo120789i(adVar, (C145223ac[]) this.f392559b.keySet().toArray(new C145223ac[0]));
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean j : this.f392559b.values()) {
            i = (i * 31) + m235923j(j);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo120789i(C145224ad adVar, C145223ac... acVarArr) {
        for (C145223ac acVar : acVarArr) {
            Boolean bool = (Boolean) this.f392559b.get(acVar);
            Boolean bool2 = (Boolean) adVar.f392559b.get(acVar);
            if (bool == Boolean.FALSE && bool2 != Boolean.FALSE) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        C145223ac[] values = C145223ac.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            C145223ac acVar = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(acVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f392559b.get(acVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public C145224ad(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(C145223ac.class);
        this.f392559b = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
