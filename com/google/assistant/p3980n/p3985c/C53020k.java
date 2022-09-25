package com.google.assistant.p3980n.p3985c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.c.k */
/* compiled from: PG */
public final class C53020k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53020k f138970d;

    /* renamed from: f */
    private static volatile C63010eb f138971f;

    /* renamed from: a */
    public int f138972a;

    /* renamed from: b */
    public C53024o f138973b;

    /* renamed from: c */
    public C62971cq f138974c = emptyProtobufList();

    /* renamed from: e */
    private byte f138975e = 2;

    static {
        C53020k kVar = new C53020k();
        f138970d = kVar;
        C62942bv.registerDefaultInstance(C53020k.class, kVar);
    }

    private C53020k() {
    }

    /* renamed from: a */
    public final void mo53957a() {
        C62971cq cqVar = this.f138974c;
        if (!cqVar.mo58948c()) {
            this.f138974c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138975e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138975e = b;
                return null;
            case 2:
                return newMessageInfo(f138970d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C52560wg.class});
            case 3:
                return new C53020k();
            case 4:
                return new C53019j();
            case 5:
                return f138970d;
            case 6:
                C63010eb ebVar = f138971f;
                if (ebVar == null) {
                    synchronized (C53020k.class) {
                        ebVar = f138971f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138970d);
                            f138971f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
