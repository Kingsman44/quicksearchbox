package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.lx */
/* compiled from: PG */
public final class C67123lx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67123lx f182464c;

    /* renamed from: e */
    private static volatile C63010eb f182465e;

    /* renamed from: a */
    public String f182466a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C67121lv f182467b;

    /* renamed from: d */
    private int f182468d;

    static {
        C67123lx lxVar = new C67123lx();
        f182464c = lxVar;
        C62942bv.registerDefaultInstance(C67123lx.class, lxVar);
    }

    private C67123lx() {
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
                return newMessageInfo(f182464c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C67123lx();
            case 4:
                return new C67122lw();
            case 5:
                return f182464c;
            case 6:
                C63010eb ebVar = f182465e;
                if (ebVar == null) {
                    synchronized (C67123lx.class) {
                        ebVar = f182465e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182464c);
                            f182465e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
