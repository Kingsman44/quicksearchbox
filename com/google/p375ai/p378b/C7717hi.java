package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.hi */
/* compiled from: PG */
public final class C7717hi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7717hi f26920d;

    /* renamed from: f */
    private static volatile C63010eb f26921f;

    /* renamed from: a */
    public int f26922a;

    /* renamed from: b */
    public C62971cq f26923b = emptyProtobufList();

    /* renamed from: c */
    public C57438di f26924c;

    /* renamed from: e */
    private byte f26925e = 2;

    static {
        C7717hi hiVar = new C7717hi();
        f26920d = hiVar;
        C62942bv.registerDefaultInstance(C7717hi.class, hiVar);
    }

    private C7717hi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26925e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26925e = b;
                return null;
            case 2:
                return newMessageInfo(f26920d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"a", "b", C7669fo.class, C45240c.f118157a});
            case 3:
                return new C7717hi();
            case 4:
                return new C7716hh();
            case 5:
                return f26920d;
            case 6:
                C63010eb ebVar = f26921f;
                if (ebVar == null) {
                    synchronized (C7717hi.class) {
                        ebVar = f26921f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26920d);
                            f26921f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
