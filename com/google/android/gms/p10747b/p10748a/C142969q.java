package com.google.android.gms.p10747b.p10748a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.b.a.q */
/* compiled from: PG */
public final class C142969q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142969q f387920d;

    /* renamed from: e */
    private static volatile C63010eb f387921e;

    /* renamed from: a */
    public int f387922a;

    /* renamed from: b */
    public C142967o f387923b;

    /* renamed from: c */
    public String f387924c = BuildConfig.FLAVOR;

    static {
        C142969q qVar = new C142969q();
        f387920d = qVar;
        C62942bv.registerDefaultInstance(C142969q.class, qVar);
    }

    private C142969q() {
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
                return newMessageInfo(f387920d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142969q();
            case 4:
                return new C142968p();
            case 5:
                return f387920d;
            case 6:
                C63010eb ebVar = f387921e;
                if (ebVar == null) {
                    synchronized (C142969q.class) {
                        ebVar = f387921e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387920d);
                            f387921e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
