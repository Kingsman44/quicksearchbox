package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.aw */
/* compiled from: PG */
public final class C48504aw extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C48504aw f125303h;

    /* renamed from: i */
    private static volatile C63010eb f125304i;

    /* renamed from: a */
    public int f125305a;

    /* renamed from: b */
    public C48506ay f125306b;

    /* renamed from: c */
    public C48500as f125307c;

    /* renamed from: d */
    public C48500as f125308d;

    /* renamed from: e */
    public C48530j f125309e;

    /* renamed from: f */
    public C48490ai f125310f;

    /* renamed from: g */
    public C48522bn f125311g;

    static {
        C48504aw awVar = new C48504aw();
        f125303h = awVar;
        C62942bv.registerDefaultInstance(C48504aw.class, awVar);
    }

    private C48504aw() {
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
                return newMessageInfo(f125303h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0000", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, "b"});
            case 3:
                return new C48504aw();
            case 4:
                return new C48503av();
            case 5:
                return f125303h;
            case 6:
                C63010eb ebVar = f125304i;
                if (ebVar == null) {
                    synchronized (C48504aw.class) {
                        ebVar = f125304i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125303h);
                            f125304i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
