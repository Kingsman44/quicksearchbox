package com.google.android.apps.search.fedora.p10107j.p10108a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.speech.p5228m.C67277ah;
import com.google.speech.p5228m.C67313bq;

/* renamed from: com.google.android.apps.search.fedora.j.a.b */
/* compiled from: PG */
public final class C132955b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C132955b f362639f;

    /* renamed from: g */
    private static volatile C63010eb f362640g;

    /* renamed from: a */
    public int f362641a;

    /* renamed from: b */
    public int f362642b;

    /* renamed from: c */
    public C63088z f362643c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f362644d;

    /* renamed from: e */
    public int f362645e;

    static {
        C132955b bVar = new C132955b();
        f362639f = bVar;
        C62942bv.registerDefaultInstance(C132955b.class, bVar);
    }

    private C132955b() {
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
                return newMessageInfo(f362639f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ဇ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C67277ah.f182881a, C45240c.f118157a, "d", "e", C67313bq.f182966a});
            case 3:
                return new C132955b();
            case 4:
                return new C132954a();
            case 5:
                return f362639f;
            case 6:
                C63010eb ebVar = f362640g;
                if (ebVar == null) {
                    synchronized (C132955b.class) {
                        ebVar = f362640g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362639f);
                            f362640g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
