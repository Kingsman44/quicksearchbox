package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.ce */
/* compiled from: PG */
public final class C80238ce extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80238ce f220128c;

    /* renamed from: d */
    private static volatile C63010eb f220129d;

    /* renamed from: a */
    public int f220130a;

    /* renamed from: b */
    public C80187ah f220131b;

    static {
        C80238ce ceVar = new C80238ce();
        f220128c = ceVar;
        C62942bv.registerDefaultInstance(C80238ce.class, ceVar);
    }

    private C80238ce() {
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
                return newMessageInfo(f220128c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80238ce();
            case 4:
                return new C80237cd();
            case 5:
                return f220128c;
            case 6:
                C63010eb ebVar = f220129d;
                if (ebVar == null) {
                    synchronized (C80238ce.class) {
                        ebVar = f220129d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220128c);
                            f220129d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
