package com.google.android.libraries.search.p2904c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.fg */
/* compiled from: PG */
public final class C37595fg extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C37595fg f99904g;

    /* renamed from: h */
    private static volatile C63010eb f99905h;

    /* renamed from: a */
    public int f99906a;

    /* renamed from: b */
    public int f99907b = 0;

    /* renamed from: c */
    public Object f99908c;

    /* renamed from: d */
    public C37773c f99909d;

    /* renamed from: e */
    public long f99910e;

    /* renamed from: f */
    public int f99911f;

    static {
        C37595fg fgVar = new C37595fg();
        f99904g = fgVar;
        C62942bv.registerDefaultInstance(C37595fg.class, fgVar);
    }

    private C37595fg() {
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
                return newMessageInfo(f99904g, "\u0001\u0006\u0001\u0001\u0001f\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000dဉ\u0003eဂ\u0004fင\u0005", new Object[]{C45240c.f118157a, "b", "a", C37574eo.class, C37606fr.class, C37567eh.class, "d", "e", C10662f.f35572a});
            case 3:
                return new C37595fg();
            case 4:
                return new C37593fe();
            case 5:
                return f99904g;
            case 6:
                C63010eb ebVar = f99905h;
                if (ebVar == null) {
                    synchronized (C37595fg.class) {
                        ebVar = f99905h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99904g);
                            f99905h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
