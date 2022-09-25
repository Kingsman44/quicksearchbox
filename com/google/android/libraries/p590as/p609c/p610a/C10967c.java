package com.google.android.libraries.p590as.p609c.p610a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.c.a.c */
/* compiled from: PG */
public final class C10967c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C10967c f36090c;

    /* renamed from: d */
    private static volatile C63010eb f36091d;

    /* renamed from: a */
    public int f36092a;

    /* renamed from: b */
    public int f36093b;

    static {
        C10967c cVar = new C10967c();
        f36090c = cVar;
        C62942bv.registerDefaultInstance(C10967c.class, cVar);
    }

    private C10967c() {
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
                return newMessageInfo(f36090c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C10965a.f36089a});
            case 3:
                return new C10967c();
            case 4:
                return new C10966b();
            case 5:
                return f36090c;
            case 6:
                C63010eb ebVar = f36091d;
                if (ebVar == null) {
                    synchronized (C10967c.class) {
                        ebVar = f36091d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f36090c);
                            f36091d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
