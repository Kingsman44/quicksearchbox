package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.av */
/* compiled from: PG */
public final class C119800av extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119800av f333693d;

    /* renamed from: f */
    private static volatile C63010eb f333694f;

    /* renamed from: a */
    public int f333695a = 0;

    /* renamed from: b */
    public Object f333696b;

    /* renamed from: c */
    public long f333697c;

    /* renamed from: e */
    private byte f333698e = 2;

    static {
        C119800av avVar = new C119800av();
        f333693d = avVar;
        C62942bv.registerDefaultInstance(C119800av.class, avVar);
    }

    private C119800av() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333698e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333698e = b;
                return null;
            case 2:
                return newMessageInfo(f333693d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u0002\u0002<\u0000\u0003м\u0000", new Object[]{"b", "a", C45240c.f118157a, C52070ec.class, C34822b.class});
            case 3:
                return new C119800av();
            case 4:
                return new C119799au();
            case 5:
                return f333693d;
            case 6:
                C63010eb ebVar = f333694f;
                if (ebVar == null) {
                    synchronized (C119800av.class) {
                        ebVar = f333694f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333693d);
                            f333694f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
