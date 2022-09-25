package com.google.android.libraries.search.p2904c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.p2913d.p2915b.C37493b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.fj */
/* compiled from: PG */
public final class C37598fj extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C37598fj f99912h;

    /* renamed from: i */
    private static volatile C63010eb f99913i;

    /* renamed from: a */
    public int f99914a;

    /* renamed from: b */
    public int f99915b = 0;

    /* renamed from: c */
    public Object f99916c;

    /* renamed from: d */
    public long f99917d;

    /* renamed from: e */
    public C37493b f99918e;

    /* renamed from: f */
    public C37773c f99919f;

    /* renamed from: g */
    public long f99920g;

    static {
        C37598fj fjVar = new C37598fj();
        f99912h = fjVar;
        C62942bv.registerDefaultInstance(C37598fj.class, fjVar);
    }

    private C37598fj() {
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
                return newMessageInfo(f99912h, "\u0001\f\u0001\u0001\u0001Ì\f\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\bြ\u0000dြ\u0000eြ\u0000fြ\u0000Éဂ\bÊဉ\tËဉ\nÌဂ\u000b", new Object[]{C45240c.f118157a, "b", "a", C37416bu.class, C37418bw.class, C37338ac.class, C37348am.class, C37572em.class, C37664hk.class, C37666hm.class, C37604fp.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C37598fj();
            case 4:
                return new C37596fh();
            case 5:
                return f99912h;
            case 6:
                C63010eb ebVar = f99913i;
                if (ebVar == null) {
                    synchronized (C37598fj.class) {
                        ebVar = f99913i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99912h);
                            f99913i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
