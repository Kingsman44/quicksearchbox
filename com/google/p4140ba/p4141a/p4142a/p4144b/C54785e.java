package com.google.p4140ba.p4141a.p4142a.p4144b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57055c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.b.e */
/* compiled from: PG */
public final class C54785e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54785e f143724d;

    /* renamed from: e */
    private static volatile C63010eb f143725e;

    /* renamed from: a */
    public int f143726a;

    /* renamed from: b */
    public int f143727b;

    /* renamed from: c */
    public String f143728c = BuildConfig.FLAVOR;

    static {
        C54785e eVar = new C54785e();
        f143724d = eVar;
        C62942bv.registerDefaultInstance(C54785e.class, eVar);
    }

    private C54785e() {
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
                return newMessageInfo(f143724d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C57055c.f152310a, C45240c.f118157a});
            case 3:
                return new C54785e();
            case 4:
                return new C54784d();
            case 5:
                return f143724d;
            case 6:
                C63010eb ebVar = f143725e;
                if (ebVar == null) {
                    synchronized (C54785e.class) {
                        ebVar = f143725e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143724d);
                            f143725e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
