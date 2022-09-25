package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.db */
/* compiled from: PG */
public final class C124690db extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124690db f343992c;

    /* renamed from: d */
    private static volatile C63010eb f343993d;

    /* renamed from: a */
    public int f343994a;

    /* renamed from: b */
    public int f343995b;

    static {
        C124690db dbVar = new C124690db();
        f343992c = dbVar;
        C62942bv.registerDefaultInstance(C124690db.class, dbVar);
    }

    private C124690db() {
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
                return newMessageInfo(f343992c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C124690db();
            case 4:
                return new C124689da();
            case 5:
                return f343992c;
            case 6:
                C63010eb ebVar = f343993d;
                if (ebVar == null) {
                    synchronized (C124690db.class) {
                        ebVar = f343993d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343992c);
                            f343993d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
