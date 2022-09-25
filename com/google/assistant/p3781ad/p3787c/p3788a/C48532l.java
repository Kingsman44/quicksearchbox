package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.l */
/* compiled from: PG */
public final class C48532l extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C48532l f125367h;

    /* renamed from: i */
    private static volatile C63010eb f125368i;

    /* renamed from: a */
    public int f125369a;

    /* renamed from: b */
    public float f125370b;

    /* renamed from: c */
    public float f125371c;

    /* renamed from: d */
    public float f125372d;

    /* renamed from: e */
    public float f125373e;

    /* renamed from: f */
    public float f125374f;

    /* renamed from: g */
    public float f125375g;

    static {
        C48532l lVar = new C48532l();
        f125367h = lVar;
        C62942bv.registerDefaultInstance(C48532l.class, lVar);
    }

    private C48532l() {
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
                return newMessageInfo(f125367h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C48532l();
            case 4:
                return new C48531k();
            case 5:
                return f125367h;
            case 6:
                C63010eb ebVar = f125368i;
                if (ebVar == null) {
                    synchronized (C48532l.class) {
                        ebVar = f125368i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125367h);
                            f125368i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
