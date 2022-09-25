package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.protos.aw.b.bl */
/* compiled from: PG */
public final class C64002bl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64002bl f173078f;

    /* renamed from: g */
    private static volatile C63010eb f173079g;

    /* renamed from: a */
    public int f173080a;

    /* renamed from: b */
    public C64098p f173081b;

    /* renamed from: c */
    public C64108z f173082c;

    /* renamed from: d */
    public C64057dm f173083d;

    /* renamed from: e */
    public C64001bk f173084e;

    static {
        C64002bl blVar = new C64002bl();
        f173078f = blVar;
        C62942bv.registerDefaultInstance(C64002bl.class, blVar);
    }

    private C64002bl() {
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
                return newMessageInfo(f173078f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64002bl();
            case 4:
                return new C63999bi();
            case 5:
                return f173078f;
            case 6:
                C63010eb ebVar = f173079g;
                if (ebVar == null) {
                    synchronized (C64002bl.class) {
                        ebVar = f173079g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173078f);
                            f173079g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
