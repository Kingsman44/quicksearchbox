package com.google.android.apps.search.fedora.p10099e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.fedora.e.ab */
/* compiled from: PG */
public final class C132771ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C132771ab f362221c;

    /* renamed from: d */
    private static volatile C63010eb f362222d;

    /* renamed from: a */
    public int f362223a;

    /* renamed from: b */
    public C63042fg f362224b;

    static {
        C132771ab abVar = new C132771ab();
        f362221c = abVar;
        C62942bv.registerDefaultInstance(C132771ab.class, abVar);
    }

    private C132771ab() {
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
                return newMessageInfo(f362221c, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C132771ab();
            case 4:
                return new C132770aa();
            case 5:
                return f362221c;
            case 6:
                C63010eb ebVar = f362222d;
                if (ebVar == null) {
                    synchronized (C132771ab.class) {
                        ebVar = f362222d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362221c);
                            f362222d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
