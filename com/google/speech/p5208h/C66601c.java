package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.c */
/* compiled from: PG */
public final class C66601c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66601c f181177c;

    /* renamed from: d */
    public static final C62940bt f181178d;

    /* renamed from: e */
    private static volatile C63010eb f181179e;

    /* renamed from: a */
    public int f181180a;

    /* renamed from: b */
    public int f181181b;

    static {
        C66601c cVar = new C66601c();
        f181177c = cVar;
        C62942bv.registerDefaultInstance(C66601c.class, cVar);
        f181178d = C62942bv.newSingularGeneratedExtension(C66592br.f181140e, cVar, cVar, (C62958ce) null, 295125038, C63066gd.MESSAGE, C66601c.class);
    }

    private C66601c() {
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
                return newMessageInfo(f181177c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66570b.f181082a});
            case 3:
                return new C66601c();
            case 4:
                return new C66529a();
            case 5:
                return f181177c;
            case 6:
                C63010eb ebVar = f181179e;
                if (ebVar == null) {
                    synchronized (C66601c.class) {
                        ebVar = f181179e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181177c);
                            f181179e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
