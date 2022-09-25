package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j;

/* renamed from: com.google.speech.m.cl */
/* compiled from: PG */
public final class C67335cl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67335cl f183020b;

    /* renamed from: d */
    private static volatile C63010eb f183021d;

    /* renamed from: a */
    public C63265j f183022a;

    /* renamed from: c */
    private int f183023c;

    static {
        C67335cl clVar = new C67335cl();
        f183020b = clVar;
        C62942bv.registerDefaultInstance(C67335cl.class, clVar);
    }

    private C67335cl() {
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
                return newMessageInfo(f183020b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67335cl();
            case 4:
                return new C67334ck();
            case 5:
                return f183020b;
            case 6:
                C63010eb ebVar = f183021d;
                if (ebVar == null) {
                    synchronized (C67335cl.class) {
                        ebVar = f183021d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183020b);
                            f183021d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
