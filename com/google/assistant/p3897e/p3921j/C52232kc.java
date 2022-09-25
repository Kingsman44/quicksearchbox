package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.kc */
/* compiled from: PG */
public final class C52232kc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52232kc f137062d;

    /* renamed from: e */
    private static volatile C63010eb f137063e;

    /* renamed from: a */
    public int f137064a;

    /* renamed from: b */
    public String f137065b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52230ka f137066c;

    static {
        C52232kc kcVar = new C52232kc();
        f137062d = kcVar;
        C62942bv.registerDefaultInstance(C52232kc.class, kcVar);
    }

    private C52232kc() {
    }

    /* renamed from: a */
    public final C52230ka mo53818a() {
        C52230ka kaVar = this.f137066c;
        return kaVar == null ? C52230ka.f137057d : kaVar;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f137062d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52232kc();
            case 4:
                return new C52231kb();
            case 5:
                return f137062d;
            case 6:
                C63010eb ebVar = f137063e;
                if (ebVar == null) {
                    synchronized (C52232kc.class) {
                        ebVar = f137063e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137062d);
                            f137063e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
