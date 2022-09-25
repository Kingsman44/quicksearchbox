package com.google.p375ai.p378b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ul */
/* compiled from: PG */
public final class C8071ul extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8071ul f28403g;

    /* renamed from: i */
    private static volatile C63010eb f28404i;

    /* renamed from: a */
    public int f28405a;

    /* renamed from: b */
    public C7536ax f28406b;

    /* renamed from: c */
    public C62971cq f28407c = emptyProtobufList();

    /* renamed from: d */
    public C7536ax f28408d;

    /* renamed from: e */
    public C62971cq f28409e = emptyProtobufList();

    /* renamed from: f */
    public boolean f28410f;

    /* renamed from: h */
    private byte f28411h = 2;

    static {
        C8071ul ulVar = new C8071ul();
        f28403g = ulVar;
        C62942bv.registerDefaultInstance(C8071ul.class, ulVar);
    }

    private C8071ul() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28411h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28411h = b;
                return null;
            case 2:
                return newMessageInfo(f28403g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0002\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004\u001b\u0005ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, C7818lb.class, "d", "e", C7818lb.class, C10662f.f35572a});
            case 3:
                return new C8071ul();
            case 4:
                return new C8070uk();
            case 5:
                return f28403g;
            case 6:
                C63010eb ebVar = f28404i;
                if (ebVar == null) {
                    synchronized (C8071ul.class) {
                        ebVar = f28404i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28403g);
                            f28404i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
