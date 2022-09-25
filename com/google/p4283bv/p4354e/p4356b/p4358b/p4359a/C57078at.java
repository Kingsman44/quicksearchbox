package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.at */
/* compiled from: PG */
public final class C57078at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57078at f152372c;

    /* renamed from: e */
    private static volatile C63010eb f152373e;

    /* renamed from: a */
    public String f152374a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f152375b;

    /* renamed from: d */
    private int f152376d;

    static {
        C57078at atVar = new C57078at();
        f152372c = atVar;
        C62942bv.registerDefaultInstance(C57078at.class, atVar);
    }

    private C57078at() {
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
                return newMessageInfo(f152372c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C57076ar.f152371a});
            case 3:
                return new C57078at();
            case 4:
                return new C57075aq();
            case 5:
                return f152372c;
            case 6:
                C63010eb ebVar = f152373e;
                if (ebVar == null) {
                    synchronized (C57078at.class) {
                        ebVar = f152373e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152372c);
                            f152373e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
