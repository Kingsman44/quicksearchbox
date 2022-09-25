package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.google.android.libraries.assistant.hotword.p1516b.C18343b;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.bf */
/* compiled from: PG */
public final class C121784bf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C121784bf f337956e;

    /* renamed from: f */
    private static volatile C63010eb f337957f;

    /* renamed from: a */
    public int f337958a;

    /* renamed from: b */
    public C37454cc f337959b;

    /* renamed from: c */
    public C39260aj f337960c;

    /* renamed from: d */
    public C18343b f337961d;

    static {
        C121784bf bfVar = new C121784bf();
        f337956e = bfVar;
        C62942bv.registerDefaultInstance(C121784bf.class, bfVar);
    }

    private C121784bf() {
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
                return newMessageInfo(f337956e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C121784bf();
            case 4:
                return new C121783be();
            case 5:
                return f337956e;
            case 6:
                C63010eb ebVar = f337957f;
                if (ebVar == null) {
                    synchronized (C121784bf.class) {
                        ebVar = f337957f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337956e);
                            f337957f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
