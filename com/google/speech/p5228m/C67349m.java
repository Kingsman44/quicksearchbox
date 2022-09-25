package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.m */
/* compiled from: PG */
public final class C67349m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67349m f183060c;

    /* renamed from: f */
    private static volatile C63010eb f183061f;

    /* renamed from: a */
    public int f183062a;

    /* renamed from: b */
    public C62971cq f183063b = emptyProtobufList();

    /* renamed from: d */
    private int f183064d;

    /* renamed from: e */
    private C67276ag f183065e;

    static {
        C67349m mVar = new C67349m();
        f183060c = mVar;
        C62942bv.registerDefaultInstance(C67349m.class, mVar);
    }

    private C67349m() {
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
                return newMessageInfo(f183060c, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\tဉ\u0001", new Object[]{"d", "a", "b", C67280ak.class, "e"});
            case 3:
                return new C67349m();
            case 4:
                return new C67348l();
            case 5:
                return f183060c;
            case 6:
                C63010eb ebVar = f183061f;
                if (ebVar == null) {
                    synchronized (C67349m.class) {
                        ebVar = f183061f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183060c);
                            f183061f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
