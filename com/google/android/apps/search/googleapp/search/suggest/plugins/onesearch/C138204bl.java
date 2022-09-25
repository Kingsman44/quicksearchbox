package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bl */
/* compiled from: PG */
public final class C138204bl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C138204bl f376029b;

    /* renamed from: c */
    private static volatile C63010eb f376030c;

    /* renamed from: a */
    public C62971cq f376031a = C62942bv.emptyProtobufList();

    static {
        C138204bl blVar = new C138204bl();
        f376029b = blVar;
        C62942bv.registerDefaultInstance(C138204bl.class, blVar);
    }

    private C138204bl() {
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
                return newMessageInfo(f376029b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C138204bl();
            case 4:
                return new C138203bk();
            case 5:
                return f376029b;
            case 6:
                C63010eb ebVar = f376030c;
                if (ebVar == null) {
                    synchronized (C138204bl.class) {
                        ebVar = f376030c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376029b);
                            f376030c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
