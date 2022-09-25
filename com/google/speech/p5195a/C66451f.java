package com.google.speech.p5195a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.f */
/* compiled from: PG */
public final class C66451f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66451f f180685d;

    /* renamed from: g */
    private static volatile C63010eb f180686g;

    /* renamed from: a */
    public int f180687a;

    /* renamed from: b */
    public int f180688b;

    /* renamed from: c */
    public C62971cq f180689c = emptyProtobufList();

    /* renamed from: e */
    private int f180690e;

    /* renamed from: f */
    private byte f180691f = 2;

    static {
        C66451f fVar = new C66451f();
        f180685d = fVar;
        C62942bv.registerDefaultInstance(C66451f.class, fVar);
    }

    private C66451f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180691f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180691f = b;
                return null;
            case 2:
                return newMessageInfo(f180685d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003Л", new Object[]{"e", "a", "b", C45240c.f118157a, C66447b.class});
            case 3:
                return new C66451f();
            case 4:
                return new C66450e();
            case 5:
                return f180685d;
            case 6:
                C63010eb ebVar = f180686g;
                if (ebVar == null) {
                    synchronized (C66451f.class) {
                        ebVar = f180686g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180685d);
                            f180686g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
