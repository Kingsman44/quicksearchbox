package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.i */
/* compiled from: PG */
public final class C122026i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122026i f338565b;

    /* renamed from: c */
    private static volatile C63010eb f338566c;

    /* renamed from: a */
    public int f338567a;

    static {
        C122026i iVar = new C122026i();
        f338565b = iVar;
        C62942bv.registerDefaultInstance(C122026i.class, iVar);
    }

    private C122026i() {
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
                return newMessageInfo(f338565b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C122026i();
            case 4:
                return new C122025h();
            case 5:
                return f338565b;
            case 6:
                C63010eb ebVar = f338566c;
                if (ebVar == null) {
                    synchronized (C122026i.class) {
                        ebVar = f338566c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338565b);
                            f338566c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
