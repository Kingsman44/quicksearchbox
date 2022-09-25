package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jf */
/* compiled from: PG */
public final class C87940jf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87940jf f237855a;

    /* renamed from: b */
    private static volatile C63010eb f237856b;

    static {
        C87940jf jfVar = new C87940jf();
        f237855a = jfVar;
        C62942bv.registerDefaultInstance(C87940jf.class, jfVar);
    }

    private C87940jf() {
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
                return newMessageInfo(f237855a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87940jf();
            case 4:
                return new C87939je();
            case 5:
                return f237855a;
            case 6:
                C63010eb ebVar = f237856b;
                if (ebVar == null) {
                    synchronized (C87940jf.class) {
                        ebVar = f237856b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237855a);
                            f237856b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
