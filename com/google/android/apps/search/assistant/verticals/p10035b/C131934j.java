package com.google.android.apps.search.assistant.verticals.p10035b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.b.j */
/* compiled from: PG */
public final class C131934j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C131934j f360237b;

    /* renamed from: c */
    private static volatile C63010eb f360238c;

    /* renamed from: a */
    public C62971cq f360239a = emptyProtobufList();

    static {
        C131934j jVar = new C131934j();
        f360237b = jVar;
        C62942bv.registerDefaultInstance(C131934j.class, jVar);
    }

    private C131934j() {
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
                return newMessageInfo(f360237b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C131933i.class});
            case 3:
                return new C131934j();
            case 4:
                return new C131931g();
            case 5:
                return f360237b;
            case 6:
                C63010eb ebVar = f360238c;
                if (ebVar == null) {
                    synchronized (C131934j.class) {
                        ebVar = f360238c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360237b);
                            f360238c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
