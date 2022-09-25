package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.d */
/* compiled from: PG */
public final class C119282d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C119282d f332631e;

    /* renamed from: f */
    private static volatile C63010eb f332632f;

    /* renamed from: a */
    public boolean f332633a;

    /* renamed from: b */
    public boolean f332634b;

    /* renamed from: c */
    public boolean f332635c;

    /* renamed from: d */
    public C63042fg f332636d;

    static {
        C119282d dVar = new C119282d();
        f332631e = dVar;
        C62942bv.registerDefaultInstance(C119282d.class, dVar);
    }

    private C119282d() {
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
                return newMessageInfo(f332631e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C119282d();
            case 4:
                return new C119281c();
            case 5:
                return f332631e;
            case 6:
                C63010eb ebVar = f332632f;
                if (ebVar == null) {
                    synchronized (C119282d.class) {
                        ebVar = f332632f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332631e);
                            f332632f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
