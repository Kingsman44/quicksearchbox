package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.br */
/* compiled from: PG */
public final class C48629br extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48629br f125669b;

    /* renamed from: c */
    private static volatile C63010eb f125670c;

    /* renamed from: a */
    public C62971cq f125671a = emptyProtobufList();

    static {
        C48629br brVar = new C48629br();
        f125669b = brVar;
        C62942bv.registerDefaultInstance(C48629br.class, brVar);
    }

    private C48629br() {
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
                return newMessageInfo(f125669b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C113321r.class});
            case 3:
                return new C48629br();
            case 4:
                return new C48628bq();
            case 5:
                return f125669b;
            case 6:
                C63010eb ebVar = f125670c;
                if (ebVar == null) {
                    synchronized (C48629br.class) {
                        ebVar = f125670c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125669b);
                            f125670c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
