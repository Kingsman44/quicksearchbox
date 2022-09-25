package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.gr */
/* compiled from: PG */
public final class C7699gr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7699gr f26868e;

    /* renamed from: f */
    private static volatile C63010eb f26869f;

    /* renamed from: a */
    public int f26870a;

    /* renamed from: b */
    public C7887nq f26871b;

    /* renamed from: c */
    public int f26872c = 1;

    /* renamed from: d */
    public String f26873d = BuildConfig.FLAVOR;

    static {
        C7699gr grVar = new C7699gr();
        f26868e = grVar;
        C62942bv.registerDefaultInstance(C7699gr.class, grVar);
    }

    private C7699gr() {
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
                return newMessageInfo(f26868e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C7696go.f26867a, "d"});
            case 3:
                return new C7699gr();
            case 4:
                return new C7698gq();
            case 5:
                return f26868e;
            case 6:
                C63010eb ebVar = f26869f;
                if (ebVar == null) {
                    synchronized (C7699gr.class) {
                        ebVar = f26869f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26868e);
                            f26869f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
