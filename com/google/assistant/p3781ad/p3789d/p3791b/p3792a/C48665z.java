package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.z */
/* compiled from: PG */
public final class C48665z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48665z f125771d;

    /* renamed from: e */
    private static volatile C63010eb f125772e;

    /* renamed from: a */
    public int f125773a;

    /* renamed from: b */
    public C62971cq f125774b = emptyProtobufList();

    /* renamed from: c */
    public double f125775c;

    static {
        C48665z zVar = new C48665z();
        f125771d = zVar;
        C62942bv.registerDefaultInstance(C48665z.class, zVar);
    }

    private C48665z() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f125771d, "\u0000\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0001\u0000\u0002\u001b\u0006က\u0000", new Object[]{"a", "b", C48663x.class, C45240c.f118157a});
            case 3:
                return new C48665z();
            case 4:
                return new C48664y();
            case 5:
                return f125771d;
            case 6:
                C63010eb ebVar = f125772e;
                if (ebVar == null) {
                    synchronized (C48665z.class) {
                        ebVar = f125772e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125771d);
                            f125772e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
