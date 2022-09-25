package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ib */
/* compiled from: PG */
public final class C82994ib extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C82994ib f226476g;

    /* renamed from: h */
    private static volatile C63010eb f226477h;

    /* renamed from: a */
    public int f226478a;

    /* renamed from: b */
    public boolean f226479b;

    /* renamed from: c */
    public boolean f226480c;

    /* renamed from: d */
    public C83000ih f226481d;

    /* renamed from: e */
    public C62995dn f226482e = C62995dn.f170057a;

    /* renamed from: f */
    public C82997ie f226483f;

    static {
        C82994ib ibVar = new C82994ib();
        f226476g = ibVar;
        C62942bv.registerDefaultInstance(C82994ib.class, ibVar);
    }

    private C82994ib() {
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
                return newMessageInfo(f226476g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u00042\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C82993ia.f226475a, C10662f.f35572a});
            case 3:
                return new C82994ib();
            case 4:
                return new C82991hz();
            case 5:
                return f226476g;
            case 6:
                C63010eb ebVar = f226477h;
                if (ebVar == null) {
                    synchronized (C82994ib.class) {
                        ebVar = f226477h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226476g);
                            f226477h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
