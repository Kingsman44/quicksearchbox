package com.google.p4152bb.p4153a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.oo */
/* compiled from: PG */
public final class C55335oo extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55335oo f145781h;

    /* renamed from: i */
    private static volatile C63010eb f145782i;

    /* renamed from: a */
    public int f145783a;

    /* renamed from: b */
    public int f145784b;

    /* renamed from: c */
    public int f145785c;

    /* renamed from: d */
    public int f145786d;

    /* renamed from: e */
    public int f145787e;

    /* renamed from: f */
    public int f145788f;

    /* renamed from: g */
    public int f145789g;

    static {
        C55335oo ooVar = new C55335oo();
        f145781h = ooVar;
        C62942bv.registerDefaultInstance(C55335oo.class, ooVar);
    }

    private C55335oo() {
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
                return newMessageInfo(f145781h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C55335oo();
            case 4:
                return new C55334on();
            case 5:
                return f145781h;
            case 6:
                C63010eb ebVar = f145782i;
                if (ebVar == null) {
                    synchronized (C55335oo.class) {
                        ebVar = f145782i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145781h);
                            f145782i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
