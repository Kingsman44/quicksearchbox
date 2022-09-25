package com.google.speech.p5230n.p5232b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.z */
/* compiled from: PG */
public final class C67429z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67429z f183243a;

    /* renamed from: f */
    private static volatile C63010eb f183244f;

    /* renamed from: b */
    private int f183245b;

    /* renamed from: c */
    private C67427x f183246c;

    /* renamed from: d */
    private C67413j f183247d;

    /* renamed from: e */
    private byte f183248e = 2;

    static {
        C67429z zVar = new C67429z();
        f183243a = zVar;
        C62942bv.registerDefaultInstance(C67429z.class, zVar);
    }

    private C67429z() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183248e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183248e = b;
                return null;
            case 2:
                return newMessageInfo(f183243a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C67429z();
            case 4:
                return new C67428y();
            case 5:
                return f183243a;
            case 6:
                C63010eb ebVar = f183244f;
                if (ebVar == null) {
                    synchronized (C67429z.class) {
                        ebVar = f183244f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183243a);
                            f183244f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
