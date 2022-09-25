package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.ag.b.a.an */
/* compiled from: PG */
public final class C48899an extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48899an f126532g;

    /* renamed from: i */
    private static volatile C63010eb f126533i;

    /* renamed from: a */
    public int f126534a;

    /* renamed from: b */
    public C48917s f126535b;

    /* renamed from: c */
    public int f126536c;

    /* renamed from: d */
    public int f126537d;

    /* renamed from: e */
    public C48897al f126538e;

    /* renamed from: f */
    public C63042fg f126539f;

    /* renamed from: h */
    private byte f126540h = 2;

    static {
        C48899an anVar = new C48899an();
        f126532g = anVar;
        C62942bv.registerDefaultInstance(C48899an.class, anVar);
    }

    private C48899an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126540h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126540h = b;
                return null;
            case 2:
                return newMessageInfo(f126532g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C48922x.m85307b(), "d", C48922x.m85307b(), "e", C10662f.f35572a});
            case 3:
                return new C48899an();
            case 4:
                return new C48898am();
            case 5:
                return f126532g;
            case 6:
                C63010eb ebVar = f126533i;
                if (ebVar == null) {
                    synchronized (C48899an.class) {
                        ebVar = f126533i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126532g);
                            f126533i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
