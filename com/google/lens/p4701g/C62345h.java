package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.h */
/* compiled from: PG */
public final class C62345h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62345h f168304f;

    /* renamed from: h */
    private static volatile C63010eb f168305h;

    /* renamed from: a */
    public int f168306a;

    /* renamed from: b */
    public C56220aa f168307b;

    /* renamed from: c */
    public C56220aa f168308c;

    /* renamed from: d */
    public int f168309d;

    /* renamed from: e */
    public int f168310e;

    /* renamed from: g */
    private byte f168311g = 2;

    static {
        C62345h hVar = new C62345h();
        f168304f = hVar;
        C62942bv.registerDefaultInstance(C62345h.class, hVar);
    }

    private C62345h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168311g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168311g = b;
                return null;
            case 2:
                return newMessageInfo(f168304f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C62345h();
            case 4:
                return new C62344g();
            case 5:
                return f168304f;
            case 6:
                C63010eb ebVar = f168305h;
                if (ebVar == null) {
                    synchronized (C62345h.class) {
                        ebVar = f168305h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168304f);
                            f168305h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
