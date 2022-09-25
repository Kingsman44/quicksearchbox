package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.es */
/* compiled from: PG */
public final class C55069es extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55069es f144870d;

    /* renamed from: e */
    private static volatile C63010eb f144871e;

    /* renamed from: a */
    public int f144872a;

    /* renamed from: b */
    public String f144873b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f144874c = BuildConfig.FLAVOR;

    static {
        C55069es esVar = new C55069es();
        f144870d = esVar;
        C62942bv.registerDefaultInstance(C55069es.class, esVar);
    }

    private C55069es() {
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
                return newMessageInfo(f144870d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55069es();
            case 4:
                return new C55068er();
            case 5:
                return f144870d;
            case 6:
                C63010eb ebVar = f144871e;
                if (ebVar == null) {
                    synchronized (C55069es.class) {
                        ebVar = f144871e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144870d);
                            f144871e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
