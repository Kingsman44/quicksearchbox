package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.dv */
/* compiled from: PG */
public final class C57321dv extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C57321dv f153009i;

    /* renamed from: j */
    private static volatile C63010eb f153010j;

    /* renamed from: a */
    public int f153011a;

    /* renamed from: b */
    public int f153012b;

    /* renamed from: c */
    public int f153013c;

    /* renamed from: d */
    public int f153014d;

    /* renamed from: e */
    public int f153015e;

    /* renamed from: f */
    public int f153016f;

    /* renamed from: g */
    public int f153017g;

    /* renamed from: h */
    public int f153018h;

    static {
        C57321dv dvVar = new C57321dv();
        f153009i = dvVar;
        C62942bv.registerDefaultInstance(C57321dv.class, dvVar);
    }

    private C57321dv() {
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
                return newMessageInfo(f153009i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C57317dr.m88311b(), C30325g.f82003a, C57319dt.m88313b(), C19618h.f54585a});
            case 3:
                return new C57321dv();
            case 4:
                return new C57320du();
            case 5:
                return f153009i;
            case 6:
                C63010eb ebVar = f153010j;
                if (ebVar == null) {
                    synchronized (C57321dv.class) {
                        ebVar = f153010j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153009i);
                            f153010j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
