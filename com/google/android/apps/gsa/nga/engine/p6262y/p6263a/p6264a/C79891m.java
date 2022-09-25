package com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.a.a.m */
/* compiled from: PG */
public final class C79891m extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C79891m f218975e;

    /* renamed from: g */
    private static volatile C63010eb f218976g;

    /* renamed from: a */
    public int f218977a;

    /* renamed from: b */
    public C62971cq f218978b = emptyProtobufList();

    /* renamed from: c */
    public String f218979c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f218980d;

    /* renamed from: f */
    private byte f218981f = 2;

    static {
        C79891m mVar = new C79891m();
        f218975e = mVar;
        C62942bv.registerDefaultInstance(C79891m.class, mVar);
    }

    private C79891m() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f218981f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f218981f = b;
                return null;
            case 2:
                return newMessageInfo(f218975e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0001\u0001Л\u0003ဈ\u0000\u0006ဌ\u0002", new Object[]{"a", "b", C79890l.class, C45240c.f118157a, "d", C79887i.f218967a});
            case 3:
                return new C79891m();
            case 4:
                return new C79886h();
            case 5:
                return f218975e;
            case 6:
                C63010eb ebVar = f218976g;
                if (ebVar == null) {
                    synchronized (C79891m.class) {
                        ebVar = f218976g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218975e);
                            f218976g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
