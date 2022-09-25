package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.ab */
/* compiled from: PG */
public final class C79569ab extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C79569ab f218316f;

    /* renamed from: h */
    private static volatile C63010eb f218317h;

    /* renamed from: a */
    public int f218318a;

    /* renamed from: b */
    public C62995dn f218319b = C62995dn.f170057a;

    /* renamed from: c */
    public C62910ar f218320c;

    /* renamed from: d */
    public C79568aa f218321d;

    /* renamed from: e */
    public C62910ar f218322e;

    /* renamed from: g */
    private C62995dn f218323g = C62995dn.f170057a;

    static {
        C79569ab abVar = new C79569ab();
        f218316f = abVar;
        C62942bv.registerDefaultInstance(C79569ab.class, abVar);
    }

    private C79569ab() {
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
                return newMessageInfo(f218316f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0002\u0000\u0000\u00012\u0002ဉ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u00062", new Object[]{"a", "b", C79578j.f218351a, C45240c.f118157a, "d", "e", C30325g.f82003a, C79589u.f218371a});
            case 3:
                return new C79569ab();
            case 4:
                return new C79577i();
            case 5:
                return f218316f;
            case 6:
                C63010eb ebVar = f218317h;
                if (ebVar == null) {
                    synchronized (C79569ab.class) {
                        ebVar = f218317h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218316f);
                            f218317h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
