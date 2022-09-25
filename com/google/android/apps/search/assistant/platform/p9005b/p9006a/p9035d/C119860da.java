package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.da */
/* compiled from: PG */
public final class C119860da extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119860da f333818b;

    /* renamed from: c */
    private static volatile C63010eb f333819c;

    /* renamed from: a */
    public C119834cb f333820a;

    static {
        C119860da daVar = new C119860da();
        f333818b = daVar;
        C62942bv.registerDefaultInstance(C119860da.class, daVar);
    }

    private C119860da() {
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
                return newMessageInfo(f333818b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C119860da();
            case 4:
                return new C119858cz();
            case 5:
                return f333818b;
            case 6:
                C63010eb ebVar = f333819c;
                if (ebVar == null) {
                    synchronized (C119860da.class) {
                        ebVar = f333819c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333818b);
                            f333819c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
