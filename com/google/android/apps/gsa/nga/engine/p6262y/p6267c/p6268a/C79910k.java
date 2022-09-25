package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.k */
/* compiled from: PG */
public final class C79910k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79910k f219038d;

    /* renamed from: e */
    private static volatile C63010eb f219039e;

    /* renamed from: a */
    public int f219040a;

    /* renamed from: b */
    public String f219041b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f219042c = emptyProtobufList();

    static {
        C79910k kVar = new C79910k();
        f219038d = kVar;
        C62942bv.registerDefaultInstance(C79910k.class, kVar);
    }

    private C79910k() {
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
                return newMessageInfo(f219038d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C79908i.class});
            case 3:
                return new C79910k();
            case 4:
                return new C79909j();
            case 5:
                return f219038d;
            case 6:
                C63010eb ebVar = f219039e;
                if (ebVar == null) {
                    synchronized (C79910k.class) {
                        ebVar = f219039e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219038d);
                            f219039e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
