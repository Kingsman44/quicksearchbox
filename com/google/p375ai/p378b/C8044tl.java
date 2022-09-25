package com.google.p375ai.p378b;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.tl */
/* compiled from: PG */
public final class C8044tl extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C8044tl f28250c;

    /* renamed from: f */
    private static volatile C63010eb f28251f;

    /* renamed from: a */
    public C62971cq f28252a = emptyProtobufList();

    /* renamed from: b */
    public C57438di f28253b;

    /* renamed from: d */
    private int f28254d;

    /* renamed from: e */
    private byte f28255e = 2;

    static {
        C8044tl tlVar = new C8044tl();
        f28250c = tlVar;
        C62942bv.registerDefaultInstance(C8044tl.class, tlVar);
    }

    private C8044tl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28255e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28255e = b;
                return null;
            case 2:
                return newMessageInfo(f28250c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"d", "a", C7669fo.class, "b"});
            case 3:
                return new C8044tl();
            case 4:
                return new C8043tk();
            case 5:
                return f28250c;
            case 6:
                C63010eb ebVar = f28251f;
                if (ebVar == null) {
                    synchronized (C8044tl.class) {
                        ebVar = f28251f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28250c);
                            f28251f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
