package com.google.protos.p5129p.p5130a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.a.ai */
/* compiled from: PG */
public final class C65710ai extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65710ai f178526b;

    /* renamed from: e */
    private static volatile C63010eb f178527e;

    /* renamed from: a */
    public C62724b f178528a;

    /* renamed from: c */
    private int f178529c;

    /* renamed from: d */
    private byte f178530d = 2;

    static {
        C65710ai aiVar = new C65710ai();
        f178526b = aiVar;
        C62942bv.registerDefaultInstance(C65710ai.class, aiVar);
    }

    private C65710ai() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178530d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178530d = b;
                return null;
            case 2:
                return newMessageInfo(f178526b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65710ai();
            case 4:
                return new C65709ah();
            case 5:
                return f178526b;
            case 6:
                C63010eb ebVar = f178527e;
                if (ebVar == null) {
                    synchronized (C65710ai.class) {
                        ebVar = f178527e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178526b);
                            f178527e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
