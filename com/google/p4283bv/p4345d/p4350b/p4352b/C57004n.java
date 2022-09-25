package com.google.p4283bv.p4345d.p4350b.p4352b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.d.b.b.n */
/* compiled from: PG */
public final class C57004n extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C57004n f152167g;

    /* renamed from: i */
    private static volatile C63010eb f152168i;

    /* renamed from: a */
    public int f152169a;

    /* renamed from: b */
    public boolean f152170b;

    /* renamed from: c */
    public int f152171c;

    /* renamed from: d */
    public C63088z f152172d = C63088z.f170246b;

    /* renamed from: e */
    public C62961ch f152173e = emptyIntList();

    /* renamed from: f */
    public C60220t f152174f;

    /* renamed from: h */
    private byte f152175h = 2;

    static {
        C57004n nVar = new C57004n();
        f152167g = nVar;
        C62942bv.registerDefaultInstance(C57004n.class, nVar);
    }

    private C57004n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152175h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152175h = b;
                return null;
            case 2:
                return newMessageInfo(f152167g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ည\u0002\u0003\u0016\u0004ᐉ\u0003\u0005ဌ\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C45240c.f118157a, C57001k.f152166a});
            case 3:
                return new C57004n();
            case 4:
                return new C57003m();
            case 5:
                return f152167g;
            case 6:
                C63010eb ebVar = f152168i;
                if (ebVar == null) {
                    synchronized (C57004n.class) {
                        ebVar = f152168i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152167g);
                            f152168i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
