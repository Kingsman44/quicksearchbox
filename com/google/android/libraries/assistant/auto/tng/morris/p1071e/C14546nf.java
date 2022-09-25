package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.nf */
/* compiled from: PG */
public final class C14546nf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14546nf f43997b;

    /* renamed from: c */
    private static volatile C63010eb f43998c;

    /* renamed from: a */
    public C62971cq f43999a = emptyProtobufList();

    static {
        C14546nf nfVar = new C14546nf();
        f43997b = nfVar;
        C62942bv.registerDefaultInstance(C14546nf.class, nfVar);
    }

    private C14546nf() {
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
                return newMessageInfo(f43997b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C123766cf.class});
            case 3:
                return new C14546nf();
            case 4:
                return new C14545ne();
            case 5:
                return f43997b;
            case 6:
                C63010eb ebVar = f43998c;
                if (ebVar == null) {
                    synchronized (C14546nf.class) {
                        ebVar = f43998c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43997b);
                            f43998c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
