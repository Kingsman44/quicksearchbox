package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.mi */
/* compiled from: PG */
public final class C14522mi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14522mi f43897b;

    /* renamed from: c */
    private static volatile C63010eb f43898c;

    /* renamed from: a */
    public boolean f43899a;

    static {
        C14522mi miVar = new C14522mi();
        f43897b = miVar;
        C62942bv.registerDefaultInstance(C14522mi.class, miVar);
    }

    private C14522mi() {
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
                return newMessageInfo(f43897b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007", new Object[]{"a"});
            case 3:
                return new C14522mi();
            case 4:
                return new C14521mh();
            case 5:
                return f43897b;
            case 6:
                C63010eb ebVar = f43898c;
                if (ebVar == null) {
                    synchronized (C14522mi.class) {
                        ebVar = f43898c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43897b);
                            f43898c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
