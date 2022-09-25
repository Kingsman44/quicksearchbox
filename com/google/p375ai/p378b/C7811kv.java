package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.kv */
/* compiled from: PG */
public final class C7811kv extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C7811kv f27305h;

    /* renamed from: i */
    private static volatile C63010eb f27306i;

    /* renamed from: a */
    public int f27307a;

    /* renamed from: b */
    public int f27308b = 0;

    /* renamed from: c */
    public Object f27309c;

    /* renamed from: d */
    public int f27310d;

    /* renamed from: e */
    public C8150xj f27311e;

    /* renamed from: f */
    public int f27312f;

    /* renamed from: g */
    public int f27313g;

    static {
        C7811kv kvVar = new C7811kv();
        f27305h = kvVar;
        C62942bv.registerDefaultInstance(C7811kv.class, kvVar);
    }

    private C7811kv() {
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
                return newMessageInfo(f27305h, "\u0001\u000b\u0001\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ျ\u0000\u0007ြ\u0000\bဉ\t\tြ\u0000\nဌ\u0000\u000bင\n\fင\u000b", new Object[]{C45240c.f118157a, "b", "a", C7828ll.class, C7826lj.class, C7824lh.class, C7807kr.class, C7838lv.class, "e", C7937pm.class, "d", C7810ku.m22855b(), C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C7811kv();
            case 4:
                return new C7808ks();
            case 5:
                return f27305h;
            case 6:
                C63010eb ebVar = f27306i;
                if (ebVar == null) {
                    synchronized (C7811kv.class) {
                        ebVar = f27306i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27305h);
                            f27306i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
