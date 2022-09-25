package com.google.protos.p4985f.p5030q.p5032b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.protos.f.q.b.d */
/* compiled from: PG */
public final class C65057d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65057d f176173d;

    /* renamed from: g */
    private static volatile C63010eb f176174g;

    /* renamed from: a */
    public C62971cq f176175a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f176176b = emptyProtobufList();

    /* renamed from: c */
    public String f176177c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f176178e;

    /* renamed from: f */
    private byte f176179f = 2;

    static {
        C65057d dVar = new C65057d();
        f176173d = dVar;
        C62942bv.registerDefaultInstance(C65057d.class, dVar);
    }

    private C65057d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176179f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176179f = b;
                return null;
            case 2:
                return newMessageInfo(f176173d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0003ဈ\u0000", new Object[]{"e", "a", C65768az.class, "b", C65768az.class, C45240c.f118157a});
            case 3:
                return new C65057d();
            case 4:
                return new C65056c();
            case 5:
                return f176173d;
            case 6:
                C63010eb ebVar = f176174g;
                if (ebVar == null) {
                    synchronized (C65057d.class) {
                        ebVar = f176174g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176173d);
                            f176174g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
