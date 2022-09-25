package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bn */
/* compiled from: PG */
public final class C64480bn extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64480bn f174891g;

    /* renamed from: h */
    private static volatile C63010eb f174892h;

    /* renamed from: a */
    public C64459at f174893a;

    /* renamed from: b */
    public C64540p f174894b;

    /* renamed from: c */
    public C64544t f174895c;

    /* renamed from: d */
    public C64482bp f174896d;

    /* renamed from: e */
    public C62971cq f174897e = emptyProtobufList();

    /* renamed from: f */
    public C62961ch f174898f = emptyIntList();

    static {
        C64480bn bnVar = new C64480bn();
        f174891g = bnVar;
        C62942bv.registerDefaultInstance(C64480bn.class, bnVar);
    }

    private C64480bn() {
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
                return newMessageInfo(f174891g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b\u0007,", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C64488bv.class, C10662f.f35572a});
            case 3:
                return new C64480bn();
            case 4:
                return new C64479bm();
            case 5:
                return f174891g;
            case 6:
                C63010eb ebVar = f174892h;
                if (ebVar == null) {
                    synchronized (C64480bn.class) {
                        ebVar = f174892h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174891g);
                            f174892h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
