package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jr */
/* compiled from: PG */
public final class C87952jr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87952jr f237869b;

    /* renamed from: c */
    private static volatile C63010eb f237870c;

    /* renamed from: a */
    public C62971cq f237871a = C62942bv.emptyProtobufList();

    static {
        C87952jr jrVar = new C87952jr();
        f237869b = jrVar;
        C62942bv.registerDefaultInstance(C87952jr.class, jrVar);
    }

    private C87952jr() {
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
                return newMessageInfo(f237869b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C87952jr();
            case 4:
                return new C87951jq();
            case 5:
                return f237869b;
            case 6:
                C63010eb ebVar = f237870c;
                if (ebVar == null) {
                    synchronized (C87952jr.class) {
                        ebVar = f237870c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237869b);
                            f237870c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
