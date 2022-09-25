package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.el */
/* compiled from: PG */
public final class C66922el extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66922el f181915b;

    /* renamed from: c */
    private static volatile C63010eb f181916c;

    /* renamed from: a */
    public C62995dn f181917a = C62995dn.f170057a;

    static {
        C66922el elVar = new C66922el();
        f181915b = elVar;
        C62942bv.registerDefaultInstance(C66922el.class, elVar);
    }

    private C66922el() {
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
                return newMessageInfo(f181915b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", C66921ek.f181914a});
            case 3:
                return new C66922el();
            case 4:
                return new C66920ej();
            case 5:
                return f181915b;
            case 6:
                C63010eb ebVar = f181916c;
                if (ebVar == null) {
                    synchronized (C66922el.class) {
                        ebVar = f181916c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181915b);
                            f181916c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
