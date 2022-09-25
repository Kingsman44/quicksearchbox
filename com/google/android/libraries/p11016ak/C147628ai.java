package com.google.android.libraries.p11016ak;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5285d.p5290b.p5291a.p5292a.C68199l;

/* renamed from: com.google.android.libraries.ak.ai */
/* compiled from: PG */
public final class C147628ai extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C147628ai f398454d;

    /* renamed from: e */
    private static volatile C63010eb f398455e;

    /* renamed from: a */
    public int f398456a = 0;

    /* renamed from: b */
    public Object f398457b;

    /* renamed from: c */
    public int f398458c;

    static {
        C147628ai aiVar = new C147628ai();
        f398454d = aiVar;
        C62942bv.registerDefaultInstance(C147628ai.class, aiVar);
    }

    private C147628ai() {
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
                return newMessageInfo(f398454d, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\f", new Object[]{"b", "a", C147627ah.class, C147625af.class, C68199l.class, C45240c.f118157a});
            case 3:
                return new C147628ai();
            case 4:
                return new C147622ac();
            case 5:
                return f398454d;
            case 6:
                C63010eb ebVar = f398455e;
                if (ebVar == null) {
                    synchronized (C147628ai.class) {
                        ebVar = f398455e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398454d);
                            f398455e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
