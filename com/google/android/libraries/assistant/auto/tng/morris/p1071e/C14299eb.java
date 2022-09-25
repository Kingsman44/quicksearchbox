package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.eb */
/* compiled from: PG */
public final class C14299eb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14299eb f43261d;

    /* renamed from: f */
    private static volatile C63010eb f43262f;

    /* renamed from: a */
    public C62971cq f43263a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f43264b = emptyProtobufList();

    /* renamed from: c */
    public C14627qf f43265c;

    /* renamed from: e */
    private byte f43266e = 2;

    static {
        C14299eb ebVar = new C14299eb();
        f43261d = ebVar;
        C62942bv.registerDefaultInstance(C14299eb.class, ebVar);
    }

    private C14299eb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43266e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43266e = b;
                return null;
            case 2:
                return newMessageInfo(f43261d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0001\u0001Л\u0002\u001b\u0003\t", new Object[]{"a", C14292dv.class, "b", C14216b.class, C45240c.f118157a});
            case 3:
                return new C14299eb();
            case 4:
                return new C14298ea();
            case 5:
                return f43261d;
            case 6:
                C63010eb ebVar = f43262f;
                if (ebVar == null) {
                    synchronized (C14299eb.class) {
                        ebVar = f43262f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43261d);
                            f43262f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
