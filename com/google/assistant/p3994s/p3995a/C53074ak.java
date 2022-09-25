package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5027o.C64969d;

/* renamed from: com.google.assistant.s.a.ak */
/* compiled from: PG */
public final class C53074ak extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53074ak f139084d;

    /* renamed from: f */
    private static volatile C63010eb f139085f;

    /* renamed from: a */
    public int f139086a;

    /* renamed from: b */
    public C64969d f139087b;

    /* renamed from: c */
    public C62971cq f139088c = C62942bv.emptyProtobufList();

    /* renamed from: e */
    private byte f139089e = 2;

    static {
        C53074ak akVar = new C53074ak();
        f139084d = akVar;
        C62942bv.registerDefaultInstance(C53074ak.class, akVar);
    }

    private C53074ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139089e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139089e = b;
                return null;
            case 2:
                return newMessageInfo(f139084d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53074ak();
            case 4:
                return new C53073aj();
            case 5:
                return f139084d;
            case 6:
                C63010eb ebVar = f139085f;
                if (ebVar == null) {
                    synchronized (C53074ak.class) {
                        ebVar = f139085f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139084d);
                            f139085f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
