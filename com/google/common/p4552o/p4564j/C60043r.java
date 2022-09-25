package com.google.common.p4552o.p4564j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.r */
/* compiled from: PG */
public final class C60043r extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60043r f162286h;

    /* renamed from: i */
    private static volatile C63010eb f162287i;

    /* renamed from: a */
    public int f162288a;

    /* renamed from: b */
    public int f162289b;

    /* renamed from: c */
    public int f162290c;

    /* renamed from: d */
    public int f162291d;

    /* renamed from: e */
    public C60039n f162292e;

    /* renamed from: f */
    public C60035j f162293f;

    /* renamed from: g */
    public C60037l f162294g;

    static {
        C60043r rVar = new C60043r();
        f162286h = rVar;
        C62942bv.registerDefaultInstance(C60043r.class, rVar);
    }

    private C60043r() {
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
                return newMessageInfo(f162286h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0006ဉ\u0005\bဉ\u0007\nဉ\t", new Object[]{"a", "b", C60041p.f162284a, C45240c.f118157a, C60042q.f162285a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C60043r();
            case 4:
                return new C60040o();
            case 5:
                return f162286h;
            case 6:
                C63010eb ebVar = f162287i;
                if (ebVar == null) {
                    synchronized (C60043r.class) {
                        ebVar = f162287i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162286h);
                            f162287i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
