package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ag */
/* compiled from: PG */
public final class C119785ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119785ag f333648b;

    /* renamed from: c */
    private static volatile C63010eb f333649c;

    /* renamed from: a */
    public int f333650a;

    static {
        C119785ag agVar = new C119785ag();
        f333648b = agVar;
        C62942bv.registerDefaultInstance(C119785ag.class, agVar);
    }

    private C119785ag() {
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
                return newMessageInfo(f333648b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C119785ag();
            case 4:
                return new C119784af();
            case 5:
                return f333648b;
            case 6:
                C63010eb ebVar = f333649c;
                if (ebVar == null) {
                    synchronized (C119785ag.class) {
                        ebVar = f333649c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333648b);
                            f333649c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
