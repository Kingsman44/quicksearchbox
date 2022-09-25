package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.c.b */
/* compiled from: PG */
public final class C15992b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C15992b f47400b;

    /* renamed from: c */
    private static volatile C63010eb f47401c;

    /* renamed from: a */
    public C62971cq f47402a = C62942bv.emptyProtobufList();

    static {
        C15992b bVar = new C15992b();
        f47400b = bVar;
        C62942bv.registerDefaultInstance(C15992b.class, bVar);
    }

    private C15992b() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f47400b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C15992b();
            case 4:
                return new C15987a();
            case 5:
                return f47400b;
            case 6:
                C63010eb ebVar = f47401c;
                if (ebVar == null) {
                    synchronized (C15992b.class) {
                        ebVar = f47401c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f47400b);
                            f47401c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
