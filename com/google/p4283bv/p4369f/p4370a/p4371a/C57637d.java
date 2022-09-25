package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.d */
/* compiled from: PG */
public final class C57637d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57637d f153936c;

    /* renamed from: e */
    private static volatile C63010eb f153937e;

    /* renamed from: a */
    public C62971cq f153938a = emptyProtobufList();

    /* renamed from: b */
    public C57578av f153939b;

    /* renamed from: d */
    private byte f153940d = 2;

    static {
        C57637d dVar = new C57637d();
        f153936c = dVar;
        C62942bv.registerDefaultInstance(C57637d.class, dVar);
    }

    private C57637d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153940d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153940d = b;
                return null;
            case 2:
                return newMessageInfo(f153936c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002Љ", new Object[]{"a", C57569am.class, "b"});
            case 3:
                return new C57637d();
            case 4:
                return new C57610c();
            case 5:
                return f153936c;
            case 6:
                C63010eb ebVar = f153937e;
                if (ebVar == null) {
                    synchronized (C57637d.class) {
                        ebVar = f153937e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153936c);
                            f153937e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
