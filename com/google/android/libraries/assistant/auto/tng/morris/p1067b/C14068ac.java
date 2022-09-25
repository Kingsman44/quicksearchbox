package com.google.android.libraries.assistant.auto.tng.morris.p1067b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.b.ac */
/* compiled from: PG */
public final class C14068ac extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C14068ac f42705h;

    /* renamed from: i */
    private static volatile C63010eb f42706i;

    /* renamed from: a */
    public int f42707a;

    /* renamed from: b */
    public int f42708b;

    /* renamed from: c */
    public int f42709c;

    /* renamed from: d */
    public C63042fg f42710d;

    /* renamed from: e */
    public C63042fg f42711e;

    /* renamed from: f */
    public int f42712f;

    /* renamed from: g */
    public int f42713g;

    static {
        C14068ac acVar = new C14068ac();
        f42705h = acVar;
        C62942bv.registerDefaultInstance(C14068ac.class, acVar);
    }

    private C14068ac() {
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
                return newMessageInfo(f42705h, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004င\u0004\u0005င\u0005\u0006ဌ\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C45240c.f118157a});
            case 3:
                return new C14068ac();
            case 4:
                return new C14066aa();
            case 5:
                return f42705h;
            case 6:
                C63010eb ebVar = f42706i;
                if (ebVar == null) {
                    synchronized (C14068ac.class) {
                        ebVar = f42706i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42705h);
                            f42706i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
