package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.cp */
/* compiled from: PG */
public final class C34080cp extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C34080cp f90803i;

    /* renamed from: j */
    private static volatile C63010eb f90804j;

    /* renamed from: a */
    public int f90805a;

    /* renamed from: b */
    public int f90806b;

    /* renamed from: c */
    public int f90807c;

    /* renamed from: d */
    public long f90808d;

    /* renamed from: e */
    public int f90809e;

    /* renamed from: f */
    public long f90810f;

    /* renamed from: g */
    public int f90811g;

    /* renamed from: h */
    public int f90812h;

    static {
        C34080cp cpVar = new C34080cp();
        f90803i = cpVar;
        C62942bv.registerDefaultInstance(C34080cp.class, cpVar);
    }

    private C34080cp() {
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
                return newMessageInfo(f90803i, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C34080cp();
            case 4:
                return new C34079co();
            case 5:
                return f90803i;
            case 6:
                C63010eb ebVar = f90804j;
                if (ebVar == null) {
                    synchronized (C34080cp.class) {
                        ebVar = f90804j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90803i);
                            f90804j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
