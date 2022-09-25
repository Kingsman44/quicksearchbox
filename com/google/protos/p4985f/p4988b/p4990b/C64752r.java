package com.google.protos.p4985f.p4988b.p4990b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.b.r */
/* compiled from: PG */
public final class C64752r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64752r f175524d;

    /* renamed from: e */
    private static volatile C63010eb f175525e;

    /* renamed from: a */
    public int f175526a;

    /* renamed from: b */
    public String f175527b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C64751q f175528c;

    static {
        C64752r rVar = new C64752r();
        f175524d = rVar;
        C62942bv.registerDefaultInstance(C64752r.class, rVar);
    }

    private C64752r() {
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
                return newMessageInfo(f175524d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64752r();
            case 4:
                return new C64748n();
            case 5:
                return f175524d;
            case 6:
                C63010eb ebVar = f175525e;
                if (ebVar == null) {
                    synchronized (C64752r.class) {
                        ebVar = f175525e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175524d);
                            f175525e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
