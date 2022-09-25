package com.google.speech.p5199c.p5200a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5228m.C67277ah;

/* renamed from: com.google.speech.c.a.d */
/* compiled from: PG */
public final class C66459d extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C66459d f180710h;

    /* renamed from: i */
    private static volatile C63010eb f180711i;

    /* renamed from: a */
    public int f180712a;

    /* renamed from: b */
    public int f180713b;

    /* renamed from: c */
    public int f180714c;

    /* renamed from: d */
    public int f180715d;

    /* renamed from: e */
    public long f180716e;

    /* renamed from: f */
    public long f180717f;

    /* renamed from: g */
    public boolean f180718g;

    static {
        C66459d dVar = new C66459d();
        f180710h = dVar;
        C62942bv.registerDefaultInstance(C66459d.class, dVar);
    }

    private C66459d() {
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
                return newMessageInfo(f180710h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C67277ah.f182881a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C66459d();
            case 4:
                return new C66458c();
            case 5:
                return f180710h;
            case 6:
                C63010eb ebVar = f180711i;
                if (ebVar == null) {
                    synchronized (C66459d.class) {
                        ebVar = f180711i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180710h);
                            f180711i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
