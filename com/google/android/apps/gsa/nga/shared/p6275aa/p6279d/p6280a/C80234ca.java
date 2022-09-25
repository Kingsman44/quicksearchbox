package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.ca */
/* compiled from: PG */
public final class C80234ca extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80234ca f220121b;

    /* renamed from: c */
    private static volatile C63010eb f220122c;

    /* renamed from: a */
    public C62995dn f220123a = C62995dn.f170057a;

    static {
        C80234ca caVar = new C80234ca();
        f220121b = caVar;
        C62942bv.registerDefaultInstance(C80234ca.class, caVar);
    }

    private C80234ca() {
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
                return newMessageInfo(f220121b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C80232bz.f220120a});
            case 3:
                return new C80234ca();
            case 4:
                return new C80231by();
            case 5:
                return f220121b;
            case 6:
                C63010eb ebVar = f220122c;
                if (ebVar == null) {
                    synchronized (C80234ca.class) {
                        ebVar = f220122c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220121b);
                            f220122c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
