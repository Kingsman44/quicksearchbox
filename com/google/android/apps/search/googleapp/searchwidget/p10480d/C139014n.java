package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.n */
/* compiled from: PG */
public final class C139014n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C139014n f378062b;

    /* renamed from: c */
    private static volatile C63010eb f378063c;

    /* renamed from: a */
    public C62971cq f378064a = emptyProtobufList();

    static {
        C139014n nVar = new C139014n();
        f378062b = nVar;
        C62942bv.registerDefaultInstance(C139014n.class, nVar);
    }

    private C139014n() {
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
                return newMessageInfo(f378062b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C139006f.class});
            case 3:
                return new C139014n();
            case 4:
                return new C139013m();
            case 5:
                return f378062b;
            case 6:
                C63010eb ebVar = f378063c;
                if (ebVar == null) {
                    synchronized (C139014n.class) {
                        ebVar = f378063c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378062b);
                            f378063c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
