package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.cl */
/* compiled from: PG */
public final class C119844cl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119844cl f333788d;

    /* renamed from: f */
    private static volatile C63010eb f333789f;

    /* renamed from: a */
    public int f333790a = 0;

    /* renamed from: b */
    public Object f333791b;

    /* renamed from: c */
    public C119834cb f333792c;

    /* renamed from: e */
    private byte f333793e = 2;

    static {
        C119844cl clVar = new C119844cl();
        f333788d = clVar;
        C62942bv.registerDefaultInstance(C119844cl.class, clVar);
    }

    private C119844cl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333793e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333793e = b;
                return null;
            case 2:
                return newMessageInfo(f333788d, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001\t\u0002<\u0000\u0003<\u0000\u0004м\u0000", new Object[]{"b", "a", C45240c.f118157a, C119843ck.class, C62912at.class, C119840ch.class});
            case 3:
                return new C119844cl();
            case 4:
                return new C119838cf();
            case 5:
                return f333788d;
            case 6:
                C63010eb ebVar = f333789f;
                if (ebVar == null) {
                    synchronized (C119844cl.class) {
                        ebVar = f333789f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333788d);
                            f333789f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
