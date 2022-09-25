package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.a.o */
/* compiled from: PG */
public final class C122106o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122106o f338758c;

    /* renamed from: d */
    private static volatile C63010eb f338759d;

    /* renamed from: a */
    public int f338760a = 0;

    /* renamed from: b */
    public Object f338761b;

    static {
        C122106o oVar = new C122106o();
        f338758c = oVar;
        C62942bv.registerDefaultInstance(C122106o.class, oVar);
    }

    private C122106o() {
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
                return newMessageInfo(f338758c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002့\u0000", new Object[]{"b", "a"});
            case 3:
                return new C122106o();
            case 4:
                return new C122104m();
            case 5:
                return f338758c;
            case 6:
                C63010eb ebVar = f338759d;
                if (ebVar == null) {
                    synchronized (C122106o.class) {
                        ebVar = f338759d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338758c);
                            f338759d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
