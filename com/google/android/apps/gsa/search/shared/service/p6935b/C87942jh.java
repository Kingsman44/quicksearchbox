package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jh */
/* compiled from: PG */
public final class C87942jh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87942jh f237857a;

    /* renamed from: b */
    private static volatile C63010eb f237858b;

    static {
        C87942jh jhVar = new C87942jh();
        f237857a = jhVar;
        C62942bv.registerDefaultInstance(C87942jh.class, jhVar);
    }

    private C87942jh() {
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
                return newMessageInfo(f237857a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87942jh();
            case 4:
                return new C87941jg();
            case 5:
                return f237857a;
            case 6:
                C63010eb ebVar = f237858b;
                if (ebVar == null) {
                    synchronized (C87942jh.class) {
                        ebVar = f237858b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237857a);
                            f237858b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
