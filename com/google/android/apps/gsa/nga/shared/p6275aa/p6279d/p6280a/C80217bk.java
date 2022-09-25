package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bk */
/* compiled from: PG */
public final class C80217bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80217bk f220088c;

    /* renamed from: d */
    private static volatile C63010eb f220089d;

    /* renamed from: a */
    public int f220090a = 0;

    /* renamed from: b */
    public Object f220091b;

    static {
        C80217bk bkVar = new C80217bk();
        f220088c = bkVar;
        C62942bv.registerDefaultInstance(C80217bk.class, bkVar);
    }

    private C80217bk() {
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
                return newMessageInfo(f220088c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", C80249d.class, C80195ap.class, C80225bs.class, C80185af.class, C62912at.class});
            case 3:
                return new C80217bk();
            case 4:
                return new C80216bj();
            case 5:
                return f220088c;
            case 6:
                C63010eb ebVar = f220089d;
                if (ebVar == null) {
                    synchronized (C80217bk.class) {
                        ebVar = f220089d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220088c);
                            f220089d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
