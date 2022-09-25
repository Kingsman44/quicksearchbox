package com.google.android.apps.search.assistant.verticals.ambient.p9917g;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131195b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.g */
/* compiled from: PG */
public final class C130685g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C130685g f357848c;

    /* renamed from: d */
    private static volatile C63010eb f357849d;

    /* renamed from: a */
    public int f357850a;

    /* renamed from: b */
    public C131195b f357851b;

    static {
        C130685g gVar = new C130685g();
        f357848c = gVar;
        C62942bv.registerDefaultInstance(C130685g.class, gVar);
    }

    private C130685g() {
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
                return newMessageInfo(f357848c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C130685g();
            case 4:
                return new C130684f();
            case 5:
                return f357848c;
            case 6:
                C63010eb ebVar = f357849d;
                if (ebVar == null) {
                    synchronized (C130685g.class) {
                        ebVar = f357849d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357848c);
                            f357849d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
