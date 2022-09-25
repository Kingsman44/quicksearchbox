package com.google.speech.p5218j.p5219a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67175t;

/* renamed from: com.google.speech.j.a.q */
/* compiled from: PG */
public final class C66750q extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66750q f181536g;

    /* renamed from: h */
    private static volatile C63010eb f181537h;

    /* renamed from: a */
    public int f181538a;

    /* renamed from: b */
    public int f181539b;

    /* renamed from: c */
    public int f181540c;

    /* renamed from: d */
    public C67175t f181541d;

    /* renamed from: e */
    public boolean f181542e;

    /* renamed from: f */
    public long f181543f;

    static {
        C66750q qVar = new C66750q();
        f181536g = qVar;
        C62942bv.registerDefaultInstance(C66750q.class, qVar);
    }

    private C66750q() {
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
                return newMessageInfo(f181536g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဉ\u0004\u0006ဇ\u0005\u0007ဃ\u0006", new Object[]{"a", "b", C66747n.f181534a, C45240c.f118157a, C66749p.f181535a, "d", "e", C10662f.f35572a});
            case 3:
                return new C66750q();
            case 4:
                return new C66746m();
            case 5:
                return f181536g;
            case 6:
                C63010eb ebVar = f181537h;
                if (ebVar == null) {
                    synchronized (C66750q.class) {
                        ebVar = f181537h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181536g);
                            f181537h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
