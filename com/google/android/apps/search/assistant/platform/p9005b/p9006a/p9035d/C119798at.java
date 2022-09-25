package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.at */
/* compiled from: PG */
public final class C119798at extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119798at f333687d;

    /* renamed from: f */
    private static volatile C63010eb f333688f;

    /* renamed from: a */
    public int f333689a = 0;

    /* renamed from: b */
    public Object f333690b;

    /* renamed from: c */
    public long f333691c;

    /* renamed from: e */
    private byte f333692e = 2;

    static {
        C119798at atVar = new C119798at();
        f333687d = atVar;
        C62942bv.registerDefaultInstance(C119798at.class, atVar);
    }

    private C119798at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333692e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333692e = b;
                return null;
            case 2:
                return newMessageInfo(f333687d, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u0002\u0002м\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C45240c.f118157a, C119796ar.class, C62912at.class, C62912at.class});
            case 3:
                return new C119798at();
            case 4:
                return new C119794ap();
            case 5:
                return f333687d;
            case 6:
                C63010eb ebVar = f333688f;
                if (ebVar == null) {
                    synchronized (C119798at.class) {
                        ebVar = f333688f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333687d);
                            f333688f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
