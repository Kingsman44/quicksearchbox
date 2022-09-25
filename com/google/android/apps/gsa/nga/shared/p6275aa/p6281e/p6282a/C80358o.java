package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.o */
/* compiled from: PG */
public final class C80358o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80358o f220485b;

    /* renamed from: c */
    private static volatile C63010eb f220486c;

    /* renamed from: a */
    public C62964ck f220487a = emptyLongList();

    static {
        C80358o oVar = new C80358o();
        f220485b = oVar;
        C62942bv.registerDefaultInstance(C80358o.class, oVar);
    }

    private C80358o() {
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
                return newMessageInfo(f220485b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
            case 3:
                return new C80358o();
            case 4:
                return new C80357n();
            case 5:
                return f220485b;
            case 6:
                C63010eb ebVar = f220486c;
                if (ebVar == null) {
                    synchronized (C80358o.class) {
                        ebVar = f220486c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220485b);
                            f220486c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
