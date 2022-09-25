package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.w */
/* compiled from: PG */
public final class C119904w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119904w f333909c;

    /* renamed from: d */
    private static volatile C63010eb f333910d;

    /* renamed from: a */
    public int f333911a = 0;

    /* renamed from: b */
    public Object f333912b;

    static {
        C119904w wVar = new C119904w();
        f333909c = wVar;
        C62942bv.registerDefaultInstance(C119904w.class, wVar);
    }

    private C119904w() {
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
                return newMessageInfo(f333909c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C62912at.class, C119903v.class});
            case 3:
                return new C119904w();
            case 4:
                return new C119896o();
            case 5:
                return f333909c;
            case 6:
                C63010eb ebVar = f333910d;
                if (ebVar == null) {
                    synchronized (C119904w.class) {
                        ebVar = f333910d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333909c);
                            f333910d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
