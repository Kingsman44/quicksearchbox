package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.o */
/* compiled from: PG */
public final class C80385o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80385o f220574c;

    /* renamed from: d */
    private static volatile C63010eb f220575d;

    /* renamed from: a */
    public double f220576a;

    /* renamed from: b */
    public boolean f220577b;

    static {
        C80385o oVar = new C80385o();
        f220574c = oVar;
        C62942bv.registerDefaultInstance(C80385o.class, oVar);
    }

    private C80385o() {
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
                return newMessageInfo(f220574c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C80385o();
            case 4:
                return new C80384n();
            case 5:
                return f220574c;
            case 6:
                C63010eb ebVar = f220575d;
                if (ebVar == null) {
                    synchronized (C80385o.class) {
                        ebVar = f220575d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220574c);
                            f220575d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
