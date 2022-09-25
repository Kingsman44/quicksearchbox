package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.aw */
/* compiled from: PG */
public final class C54830aw extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54830aw f143876g;

    /* renamed from: h */
    private static volatile C63010eb f143877h;

    /* renamed from: a */
    public int f143878a;

    /* renamed from: b */
    public float f143879b;

    /* renamed from: c */
    public int f143880c;

    /* renamed from: d */
    public int f143881d;

    /* renamed from: e */
    public float f143882e = -1.0f;

    /* renamed from: f */
    public float f143883f = -1.0f;

    static {
        C54830aw awVar = new C54830aw();
        f143876g = awVar;
        C62942bv.registerDefaultInstance(C54830aw.class, awVar);
    }

    private C54830aw() {
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
                return newMessageInfo(f143876g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C54830aw();
            case 4:
                return new C54829av();
            case 5:
                return f143876g;
            case 6:
                C63010eb ebVar = f143877h;
                if (ebVar == null) {
                    synchronized (C54830aw.class) {
                        ebVar = f143877h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143876g);
                            f143877h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
