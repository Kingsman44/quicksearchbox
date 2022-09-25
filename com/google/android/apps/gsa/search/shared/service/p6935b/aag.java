package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.assistant.shared.l.x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aag */
/* compiled from: PG */
public final class aag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aag f237071b;

    /* renamed from: c */
    private static volatile C63010eb f237072c;

    /* renamed from: a */
    public C62971cq f237073a = emptyProtobufList();

    static {
        aag aag = new aag();
        f237071b = aag;
        C62942bv.registerDefaultInstance(aag.class, aag);
    }

    private aag() {
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
                return newMessageInfo(f237071b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", x.class});
            case 3:
                return new aag();
            case 4:
                return new aaf();
            case 5:
                return f237071b;
            case 6:
                C63010eb ebVar = f237072c;
                if (ebVar == null) {
                    synchronized (aag.class) {
                        ebVar = f237072c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237071b);
                            f237072c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
