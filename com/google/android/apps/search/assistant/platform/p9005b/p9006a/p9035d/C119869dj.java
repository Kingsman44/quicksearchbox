package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.dj */
/* compiled from: PG */
public final class C119869dj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119869dj f333832c;

    /* renamed from: d */
    private static volatile C63010eb f333833d;

    /* renamed from: a */
    public int f333834a;

    /* renamed from: b */
    public boolean f333835b;

    static {
        C119869dj djVar = new C119869dj();
        f333832c = djVar;
        C62942bv.registerDefaultInstance(C119869dj.class, djVar);
    }

    private C119869dj() {
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
                return newMessageInfo(f333832c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C119869dj();
            case 4:
                return new C119868di();
            case 5:
                return f333832c;
            case 6:
                C63010eb ebVar = f333833d;
                if (ebVar == null) {
                    synchronized (C119869dj.class) {
                        ebVar = f333833d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333832c);
                            f333833d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
