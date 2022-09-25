package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.jg */
/* compiled from: PG */
public final class C67052jg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67052jg f182269e;

    /* renamed from: f */
    private static volatile C63010eb f182270f;

    /* renamed from: a */
    public int f182271a;

    /* renamed from: b */
    public C62971cq f182272b = emptyProtobufList();

    /* renamed from: c */
    public C67030il f182273c;

    /* renamed from: d */
    public C67060jo f182274d;

    static {
        C67052jg jgVar = new C67052jg();
        f182269e = jgVar;
        C62942bv.registerDefaultInstance(C67052jg.class, jgVar);
    }

    private C67052jg() {
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
                return newMessageInfo(f182269e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C67068jw.class, C45240c.f118157a, "d"});
            case 3:
                return new C67052jg();
            case 4:
                return new C67051jf();
            case 5:
                return f182269e;
            case 6:
                C63010eb ebVar = f182270f;
                if (ebVar == null) {
                    synchronized (C67052jg.class) {
                        ebVar = f182270f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182269e);
                            f182270f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
