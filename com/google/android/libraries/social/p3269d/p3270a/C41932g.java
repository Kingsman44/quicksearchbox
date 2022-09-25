package com.google.android.libraries.social.p3269d.p3270a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.social.d.a.g */
/* compiled from: PG */
public final class C41932g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C41932g f109390d;

    /* renamed from: g */
    private static volatile C63010eb f109391g;

    /* renamed from: a */
    public int f109392a;

    /* renamed from: b */
    public C62971cq f109393b = emptyProtobufList();

    /* renamed from: c */
    public C41924aa f109394c;

    /* renamed from: e */
    private C41928c f109395e;

    /* renamed from: f */
    private byte f109396f = 2;

    static {
        C41932g gVar = new C41932g();
        f109390d = gVar;
        C62942bv.registerDefaultInstance(C41932g.class, gVar);
    }

    private C41932g() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f109396f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f109396f = b;
                return null;
            case 2:
                return newMessageInfo(f109390d, "\u0001\u0003\u0000\u0001\u0002\b\u0003\u0000\u0001\u0002\u0002Л\u0007ဉ\u0004\bᐉ\u0005", new Object[]{"a", "b", C41926ac.class, C45240c.f118157a, "e"});
            case 3:
                return new C41932g();
            case 4:
                return new C41931f();
            case 5:
                return f109390d;
            case 6:
                C63010eb ebVar = f109391g;
                if (ebVar == null) {
                    synchronized (C41932g.class) {
                        ebVar = f109391g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109390d);
                            f109391g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
