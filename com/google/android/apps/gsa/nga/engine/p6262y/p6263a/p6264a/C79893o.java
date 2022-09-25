package com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.a.a.o */
/* compiled from: PG */
public final class C79893o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79893o f218982d;

    /* renamed from: f */
    private static volatile C63010eb f218983f;

    /* renamed from: a */
    public int f218984a;

    /* renamed from: b */
    public String f218985b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f218986c = emptyProtobufList();

    /* renamed from: e */
    private byte f218987e = 2;

    static {
        C79893o oVar = new C79893o();
        f218982d = oVar;
        C62942bv.registerDefaultInstance(C79893o.class, oVar);
    }

    private C79893o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f218987e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f218987e = b;
                return null;
            case 2:
                return newMessageInfo(f218982d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0001\u0003ဈ\u0000\u0004Л", new Object[]{"a", "b", C45240c.f118157a, C80047aa.class});
            case 3:
                return new C79893o();
            case 4:
                return new C79892n();
            case 5:
                return f218982d;
            case 6:
                C63010eb ebVar = f218983f;
                if (ebVar == null) {
                    synchronized (C79893o.class) {
                        ebVar = f218983f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218982d);
                            f218983f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
