package com.google.android.apps.gsa.shared.monet.p7070b.p7079af;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.af.k */
/* compiled from: PG */
public final class C90205k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C90205k f251975b;

    /* renamed from: d */
    private static volatile C63010eb f251976d;

    /* renamed from: a */
    public boolean f251977a;

    /* renamed from: c */
    private int f251978c;

    static {
        C90205k kVar = new C90205k();
        f251975b = kVar;
        C62942bv.registerDefaultInstance(C90205k.class, kVar);
    }

    private C90205k() {
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
                return newMessageInfo(f251975b, "\u0001\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0000\nဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C90205k();
            case 4:
                return new C90204j();
            case 5:
                return f251975b;
            case 6:
                C63010eb ebVar = f251976d;
                if (ebVar == null) {
                    synchronized (C90205k.class) {
                        ebVar = f251976d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f251975b);
                            f251976d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
