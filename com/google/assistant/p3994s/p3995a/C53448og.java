package com.google.assistant.p3994s.p3995a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.og */
/* compiled from: PG */
public final class C53448og extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53448og f140280h;

    /* renamed from: i */
    private static volatile C63010eb f140281i;

    /* renamed from: a */
    public int f140282a;

    /* renamed from: b */
    public int f140283b;

    /* renamed from: c */
    public int f140284c;

    /* renamed from: d */
    public int f140285d;

    /* renamed from: e */
    public C62961ch f140286e = emptyIntList();

    /* renamed from: f */
    public C62961ch f140287f = emptyIntList();

    /* renamed from: g */
    public C62961ch f140288g = emptyIntList();

    static {
        C53448og ogVar = new C53448og();
        f140280h = ogVar;
        C62942bv.registerDefaultInstance(C53448og.class, ogVar);
    }

    private C53448og() {
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
                return newMessageInfo(f140280h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'\u0005င\u0002\u0006'", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, "d", C30325g.f82003a});
            case 3:
                return new C53448og();
            case 4:
                return new C53447of();
            case 5:
                return f140280h;
            case 6:
                C63010eb ebVar = f140281i;
                if (ebVar == null) {
                    synchronized (C53448og.class) {
                        ebVar = f140281i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140280h);
                            f140281i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
