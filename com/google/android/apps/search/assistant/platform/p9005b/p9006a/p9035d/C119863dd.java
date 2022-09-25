package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.dd */
/* compiled from: PG */
public final class C119863dd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119863dd f333821c;

    /* renamed from: d */
    private static volatile C63010eb f333822d;

    /* renamed from: a */
    public int f333823a = 0;

    /* renamed from: b */
    public Object f333824b;

    static {
        C119863dd ddVar = new C119863dd();
        f333821c = ddVar;
        C62942bv.registerDefaultInstance(C119863dd.class, ddVar);
    }

    private C119863dd() {
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
                return newMessageInfo(f333821c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C62912at.class, C119834cb.class});
            case 3:
                return new C119863dd();
            case 4:
                return new C119861db();
            case 5:
                return f333821c;
            case 6:
                C63010eb ebVar = f333822d;
                if (ebVar == null) {
                    synchronized (C119863dd.class) {
                        ebVar = f333822d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333821c);
                            f333822d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
