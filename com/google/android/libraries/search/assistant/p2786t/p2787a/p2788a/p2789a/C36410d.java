package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a.d */
/* compiled from: PG */
public final class C36410d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36410d f95091d;

    /* renamed from: e */
    private static volatile C63010eb f95092e;

    /* renamed from: a */
    public int f95093a;

    /* renamed from: b */
    public boolean f95094b;

    /* renamed from: c */
    public C36427u f95095c;

    static {
        C36410d dVar = new C36410d();
        f95091d = dVar;
        C62942bv.registerDefaultInstance(C36410d.class, dVar);
    }

    private C36410d() {
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
                return newMessageInfo(f95091d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36410d();
            case 4:
                return new C36409c();
            case 5:
                return f95091d;
            case 6:
                C63010eb ebVar = f95092e;
                if (ebVar == null) {
                    synchronized (C36410d.class) {
                        ebVar = f95092e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95091d);
                            f95092e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
