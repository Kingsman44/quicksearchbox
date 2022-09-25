package com.google.speech.p5228m.p5229a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5228m.C67307bk;
import com.google.speech.p5228m.C67347k;
import com.google.speech.p5228m.C67359w;

/* renamed from: com.google.speech.m.a.l */
/* compiled from: PG */
public final class C67263l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67263l f182837d;

    /* renamed from: e */
    private static volatile C63010eb f182838e;

    /* renamed from: a */
    public C62971cq f182839a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f182840b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f182841c = emptyProtobufList();

    static {
        C67263l lVar = new C67263l();
        f182837d = lVar;
        C62942bv.registerDefaultInstance(C67263l.class, lVar);
    }

    private C67263l() {
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
                return newMessageInfo(f182837d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", C67347k.class, "b", C67307bk.class, C45240c.f118157a, C67359w.class});
            case 3:
                return new C67263l();
            case 4:
                return new C67262k();
            case 5:
                return f182837d;
            case 6:
                C63010eb ebVar = f182838e;
                if (ebVar == null) {
                    synchronized (C67263l.class) {
                        ebVar = f182838e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182837d);
                            f182838e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
