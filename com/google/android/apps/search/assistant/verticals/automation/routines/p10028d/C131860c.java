package com.google.android.apps.search.assistant.verticals.automation.routines.p10028d;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.d.c */
/* compiled from: PG */
public final class C131860c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C131860c f360088c;

    /* renamed from: d */
    private static volatile C63010eb f360089d;

    /* renamed from: a */
    public int f360090a;

    /* renamed from: b */
    public C62910ar f360091b;

    static {
        C131860c cVar = new C131860c();
        f360088c = cVar;
        C62942bv.registerDefaultInstance(C131860c.class, cVar);
    }

    private C131860c() {
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
                return newMessageInfo(f360088c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C131860c();
            case 4:
                return new C131859b();
            case 5:
                return f360088c;
            case 6:
                C63010eb ebVar = f360089d;
                if (ebVar == null) {
                    synchronized (C131860c.class) {
                        ebVar = f360089d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360088c);
                            f360089d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
