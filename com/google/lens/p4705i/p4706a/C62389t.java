package com.google.lens.p4705i.p4706a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4963bf.p4964a.p4965a.C64578b;

/* renamed from: com.google.lens.i.a.t */
/* compiled from: PG */
public final class C62389t extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62389t f168414h;

    /* renamed from: i */
    private static volatile C63010eb f168415i;

    /* renamed from: a */
    public C64578b f168416a;

    /* renamed from: b */
    public float f168417b;

    /* renamed from: c */
    public boolean f168418c;

    /* renamed from: d */
    public float f168419d;

    /* renamed from: e */
    public int f168420e;

    /* renamed from: f */
    public float f168421f;

    /* renamed from: g */
    public C62387r f168422g;

    static {
        C62389t tVar = new C62389t();
        f168414h = tVar;
        C62942bv.registerDefaultInstance(C62389t.class, tVar);
    }

    private C62389t() {
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
                return newMessageInfo(f168414h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\t\u0002\u0001\u0004\u0001\u0005\u0001\u0006\f\u0007\t\b\u0007", new Object[]{"a", "b", "d", C10662f.f35572a, "e", C30325g.f82003a, C45240c.f118157a});
            case 3:
                return new C62389t();
            case 4:
                return new C62388s();
            case 5:
                return f168414h;
            case 6:
                C63010eb ebVar = f168415i;
                if (ebVar == null) {
                    synchronized (C62389t.class) {
                        ebVar = f168415i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168414h);
                            f168415i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
