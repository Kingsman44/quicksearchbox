package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.mm */
/* compiled from: PG */
public final class C88028mm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C88028mm f238037f;

    /* renamed from: g */
    private static volatile C63010eb f238038g;

    /* renamed from: a */
    public int f238039a;

    /* renamed from: b */
    public int f238040b;

    /* renamed from: c */
    public C62971cq f238041c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f238042d;

    /* renamed from: e */
    public boolean f238043e;

    static {
        C88028mm mmVar = new C88028mm();
        f238037f = mmVar;
        C62942bv.registerDefaultInstance(C88028mm.class, mmVar);
    }

    private C88028mm() {
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
                return newMessageInfo(f238037f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u001a\u0003င\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C88028mm();
            case 4:
                return new C88027ml();
            case 5:
                return f238037f;
            case 6:
                C63010eb ebVar = f238038g;
                if (ebVar == null) {
                    synchronized (C88028mm.class) {
                        ebVar = f238038g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238037f);
                            f238038g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
