package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.as */
/* compiled from: PG */
public final class C119599as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119599as f333333c;

    /* renamed from: e */
    private static volatile C63010eb f333334e;

    /* renamed from: a */
    public boolean f333335a;

    /* renamed from: b */
    public boolean f333336b;

    /* renamed from: d */
    private int f333337d;

    static {
        C119599as asVar = new C119599as();
        f333333c = asVar;
        C62942bv.registerDefaultInstance(C119599as.class, asVar);
    }

    private C119599as() {
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
                return newMessageInfo(f333333c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C119599as();
            case 4:
                return new C119598ar();
            case 5:
                return f333333c;
            case 6:
                C63010eb ebVar = f333334e;
                if (ebVar == null) {
                    synchronized (C119599as.class) {
                        ebVar = f333334e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333333c);
                            f333334e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
