package com.google.p4283bv.p4345d.p4350b.p4353c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.c.m */
/* compiled from: PG */
public final class C57021m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57021m f152232e;

    /* renamed from: f */
    private static volatile C63010eb f152233f;

    /* renamed from: a */
    public int f152234a;

    /* renamed from: b */
    public String f152235b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f152236c;

    /* renamed from: d */
    public double f152237d;

    static {
        C57021m mVar = new C57021m();
        f152232e = mVar;
        C62942bv.registerDefaultInstance(C57021m.class, mVar);
    }

    private C57021m() {
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
                return newMessageInfo(f152232e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0003\u0003ဂ\u0004\u0006က\u0005", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57021m();
            case 4:
                return new C57020l();
            case 5:
                return f152232e;
            case 6:
                C63010eb ebVar = f152233f;
                if (ebVar == null) {
                    synchronized (C57021m.class) {
                        ebVar = f152233f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152232e);
                            f152233f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
