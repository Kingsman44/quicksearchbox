package com.google.android.libraries.search.location.p3029a.p3030a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.location.a.a.e */
/* compiled from: PG */
public final class C38576e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38576e f101973c;

    /* renamed from: d */
    private static volatile C63010eb f101974d;

    /* renamed from: a */
    public int f101975a;

    /* renamed from: b */
    public C38573b f101976b;

    static {
        C38576e eVar = new C38576e();
        f101973c = eVar;
        C62942bv.registerDefaultInstance(C38576e.class, eVar);
    }

    private C38576e() {
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
                return newMessageInfo(f101973c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C38576e();
            case 4:
                return new C38575d();
            case 5:
                return f101973c;
            case 6:
                C63010eb ebVar = f101974d;
                if (ebVar == null) {
                    synchronized (C38576e.class) {
                        ebVar = f101974d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101973c);
                            f101974d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
