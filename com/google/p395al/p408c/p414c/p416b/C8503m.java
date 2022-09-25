package com.google.p395al.p408c.p414c.p416b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.m */
/* compiled from: PG */
public final class C8503m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f29503e = new C8499i();

    /* renamed from: f */
    public static final C8503m f29504f;

    /* renamed from: h */
    private static volatile C63010eb f29505h;

    /* renamed from: a */
    public int f29506a;

    /* renamed from: b */
    public int f29507b;

    /* renamed from: c */
    public int f29508c;

    /* renamed from: d */
    public C62961ch f29509d = emptyIntList();

    /* renamed from: g */
    private int f29510g;

    static {
        C8503m mVar = new C8503m();
        f29504f = mVar;
        C62942bv.registerDefaultInstance(C8503m.class, mVar);
    }

    private C8503m() {
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
                return newMessageInfo(f29504f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001e", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", C8502l.m23272b()});
            case 3:
                return new C8503m();
            case 4:
                return new C8500j();
            case 5:
                return f29504f;
            case 6:
                C63010eb ebVar = f29505h;
                if (ebVar == null) {
                    synchronized (C8503m.class) {
                        ebVar = f29505h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29504f);
                            f29505h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
