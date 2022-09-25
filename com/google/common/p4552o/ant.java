package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ant */
/* compiled from: PG */
public final class ant extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final ant f159403h;

    /* renamed from: i */
    private static volatile C63010eb f159404i;

    /* renamed from: a */
    public int f159405a;

    /* renamed from: b */
    public int f159406b;

    /* renamed from: c */
    public int f159407c;

    /* renamed from: d */
    public int f159408d;

    /* renamed from: e */
    public int f159409e;

    /* renamed from: f */
    public int f159410f;

    /* renamed from: g */
    public int f159411g;

    static {
        ant ant = new ant();
        f159403h = ant;
        C62942bv.registerDefaultInstance(ant.class, ant);
    }

    private ant() {
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
                return newMessageInfo(f159403h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new ant();
            case 4:
                return new ans();
            case 5:
                return f159403h;
            case 6:
                C63010eb ebVar = f159404i;
                if (ebVar == null) {
                    synchronized (ant.class) {
                        ebVar = f159404i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159403h);
                            f159404i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
