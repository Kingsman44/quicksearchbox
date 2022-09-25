package com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9151c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.c.c.d */
/* compiled from: PG */
public final class C121034d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121034d f336413c;

    /* renamed from: d */
    private static volatile C63010eb f336414d;

    /* renamed from: a */
    public int f336415a;

    /* renamed from: b */
    public boolean f336416b;

    static {
        C121034d dVar = new C121034d();
        f336413c = dVar;
        C62942bv.registerDefaultInstance(C121034d.class, dVar);
    }

    private C121034d() {
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
                return newMessageInfo(f336413c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C121034d();
            case 4:
                return new C121033c();
            case 5:
                return f336413c;
            case 6:
                C63010eb ebVar = f336414d;
                if (ebVar == null) {
                    synchronized (C121034d.class) {
                        ebVar = f336414d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336413c);
                            f336414d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
