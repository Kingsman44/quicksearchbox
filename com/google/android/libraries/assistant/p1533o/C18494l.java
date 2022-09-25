package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.l */
/* compiled from: PG */
public final class C18494l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18494l f52434c;

    /* renamed from: d */
    private static volatile C63010eb f52435d;

    /* renamed from: a */
    public boolean f52436a;

    /* renamed from: b */
    public boolean f52437b;

    static {
        C18494l lVar = new C18494l();
        f52434c = lVar;
        C62942bv.registerDefaultInstance(C18494l.class, lVar);
    }

    private C18494l() {
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
                return newMessageInfo(f52434c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C18494l();
            case 4:
                return new C18493k();
            case 5:
                return f52434c;
            case 6:
                C63010eb ebVar = f52435d;
                if (ebVar == null) {
                    synchronized (C18494l.class) {
                        ebVar = f52435d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52434c);
                            f52435d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
