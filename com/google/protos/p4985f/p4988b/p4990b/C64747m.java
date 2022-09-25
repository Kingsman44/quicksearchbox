package com.google.protos.p4985f.p4988b.p4990b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.b.m */
/* compiled from: PG */
public final class C64747m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64747m f175510f;

    /* renamed from: h */
    private static volatile C63010eb f175511h;

    /* renamed from: a */
    public int f175512a;

    /* renamed from: b */
    public int f175513b;

    /* renamed from: c */
    public int f175514c;

    /* renamed from: d */
    public int f175515d;

    /* renamed from: e */
    public C64746l f175516e;

    /* renamed from: g */
    private int f175517g;

    static {
        C64747m mVar = new C64747m();
        f175510f = mVar;
        C62942bv.registerDefaultInstance(C64747m.class, mVar);
    }

    private C64747m() {
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
                return newMessageInfo(f175510f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64747m();
            case 4:
                return new C64744j();
            case 5:
                return f175510f;
            case 6:
                C63010eb ebVar = f175511h;
                if (ebVar == null) {
                    synchronized (C64747m.class) {
                        ebVar = f175511h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175510f);
                            f175511h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
