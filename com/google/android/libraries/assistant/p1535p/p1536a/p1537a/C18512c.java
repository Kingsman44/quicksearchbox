package com.google.android.libraries.assistant.p1535p.p1536a.p1537a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.p.a.a.c */
/* compiled from: PG */
public final class C18512c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18512c f52464c;

    /* renamed from: d */
    private static volatile C63010eb f52465d;

    /* renamed from: a */
    public int f52466a = 0;

    /* renamed from: b */
    public Object f52467b;

    static {
        C18512c cVar = new C18512c();
        f52464c = cVar;
        C62942bv.registerDefaultInstance(C18512c.class, cVar);
    }

    private C18512c() {
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
                return newMessageInfo(f52464c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001်\u0000\u0002်\u0000\u0003ျ\u0000\u0004ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C18512c();
            case 4:
                return new C18510a();
            case 5:
                return f52464c;
            case 6:
                C63010eb ebVar = f52465d;
                if (ebVar == null) {
                    synchronized (C18512c.class) {
                        ebVar = f52465d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52464c);
                            f52465d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
