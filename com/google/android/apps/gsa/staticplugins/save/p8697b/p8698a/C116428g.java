package com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.b.a.g */
/* compiled from: PG */
public final class C116428g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C116428g f322833d;

    /* renamed from: f */
    private static volatile C63010eb f322834f;

    /* renamed from: a */
    public C116424c f322835a;

    /* renamed from: b */
    public C116424c f322836b;

    /* renamed from: c */
    public C62971cq f322837c = emptyProtobufList();

    /* renamed from: e */
    private byte f322838e = 2;

    static {
        C116428g gVar = new C116428g();
        f322833d = gVar;
        C62942bv.registerDefaultInstance(C116428g.class, gVar);
    }

    private C116428g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f322838e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f322838e = b;
                return null;
            case 2:
                return newMessageInfo(f322833d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0001\u0001\t\u0002Л\u0003\t", new Object[]{"a", C45240c.f118157a, C57569am.class, "b"});
            case 3:
                return new C116428g();
            case 4:
                return new C116427f();
            case 5:
                return f322833d;
            case 6:
                C63010eb ebVar = f322834f;
                if (ebVar == null) {
                    synchronized (C116428g.class) {
                        ebVar = f322834f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f322833d);
                            f322834f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
