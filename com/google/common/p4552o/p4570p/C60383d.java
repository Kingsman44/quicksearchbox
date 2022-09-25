package com.google.common.p4552o.p4570p;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.d */
/* compiled from: PG */
public final class C60383d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60383d f163411e;

    /* renamed from: f */
    private static volatile C63010eb f163412f;

    /* renamed from: a */
    public int f163413a;

    /* renamed from: b */
    public C60382c f163414b;

    /* renamed from: c */
    public String f163415c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f163416d = BuildConfig.FLAVOR;

    static {
        C60383d dVar = new C60383d();
        f163411e = dVar;
        C62942bv.registerDefaultInstance(C60383d.class, dVar);
    }

    private C60383d() {
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
                return newMessageInfo(f163411e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60383d();
            case 4:
                return new C60344a();
            case 5:
                return f163411e;
            case 6:
                C63010eb ebVar = f163412f;
                if (ebVar == null) {
                    synchronized (C60383d.class) {
                        ebVar = f163412f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163411e);
                            f163412f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
