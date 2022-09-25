package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ej */
/* compiled from: PG */
public final class C7637ej extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7637ej f26386e;

    /* renamed from: f */
    private static volatile C63010eb f26387f;

    /* renamed from: a */
    public int f26388a;

    /* renamed from: b */
    public String f26389b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f26390c;

    /* renamed from: d */
    public int f26391d;

    static {
        C7637ej ejVar = new C7637ej();
        f26386e = ejVar;
        C62942bv.registerDefaultInstance(C7637ej.class, ejVar);
    }

    private C7637ej() {
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
                return newMessageInfo(f26386e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C7637ej();
            case 4:
                return new C7636ei();
            case 5:
                return f26386e;
            case 6:
                C63010eb ebVar = f26387f;
                if (ebVar == null) {
                    synchronized (C7637ej.class) {
                        ebVar = f26387f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26386e);
                            f26387f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
