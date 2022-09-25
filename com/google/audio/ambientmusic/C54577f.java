package com.google.audio.ambientmusic;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.ambientmusic.f */
/* compiled from: PG */
public final class C54577f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54577f f143297b;

    /* renamed from: c */
    private static volatile C63010eb f143298c;

    /* renamed from: a */
    public C62971cq f143299a = emptyProtobufList();

    static {
        C54577f fVar = new C54577f();
        f143297b = fVar;
        C62942bv.registerDefaultInstance(C54577f.class, fVar);
    }

    private C54577f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f143297b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54573b.class});
            case 3:
                return new C54577f();
            case 4:
                return new C54576e();
            case 5:
                return f143297b;
            case 6:
                C63010eb ebVar = f143298c;
                if (ebVar == null) {
                    synchronized (C54577f.class) {
                        ebVar = f143298c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143297b);
                            f143298c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
