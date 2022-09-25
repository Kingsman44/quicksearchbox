package com.google.android.libraries.search.p2904c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.fn */
/* compiled from: PG */
public final class C37602fn extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C37602fn f99922h;

    /* renamed from: i */
    private static volatile C63010eb f99923i;

    /* renamed from: a */
    public int f99924a;

    /* renamed from: b */
    public C37467cp f99925b;

    /* renamed from: c */
    public boolean f99926c;

    /* renamed from: d */
    public boolean f99927d;

    /* renamed from: e */
    public boolean f99928e;

    /* renamed from: f */
    public boolean f99929f;

    /* renamed from: g */
    public C37467cp f99930g;

    static {
        C37602fn fnVar = new C37602fn();
        f99922h = fnVar;
        C62942bv.registerDefaultInstance(C37602fn.class, fnVar);
    }

    private C37602fn() {
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
                return newMessageInfo(f99922h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C37602fn();
            case 4:
                return new C37601fm();
            case 5:
                return f99922h;
            case 6:
                C63010eb ebVar = f99923i;
                if (ebVar == null) {
                    synchronized (C37602fn.class) {
                        ebVar = f99923i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99922h);
                            f99923i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
