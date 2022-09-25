package com.google.assistant.p3775ac.p3776a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ac.a.c */
/* compiled from: PG */
public final class C48452c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48452c f125177a;

    /* renamed from: c */
    private static volatile C63010eb f125178c;

    /* renamed from: b */
    private C62995dn f125179b = C62995dn.f170057a;

    static {
        C48452c cVar = new C48452c();
        f125177a = cVar;
        C62942bv.registerDefaultInstance(C48452c.class, cVar);
    }

    private C48452c() {
        emptyIntList();
        C62942bv.emptyProtobufList();
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(f125177a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new Object[]{"b", C48451b.f125176a});
            case 3:
                return new C48452c();
            case 4:
                return new C48450a();
            case 5:
                return f125177a;
            case 6:
                C63010eb ebVar = f125178c;
                if (ebVar == null) {
                    synchronized (C48452c.class) {
                        ebVar = f125178c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125177a);
                            f125178c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
