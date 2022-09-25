package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.fl */
/* compiled from: PG */
public final class C49073fl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49073fl f126929c;

    /* renamed from: d */
    private static volatile C63010eb f126930d;

    /* renamed from: a */
    public C62995dn f126931a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f126932b = C62995dn.f170057a;

    static {
        C49073fl flVar = new C49073fl();
        f126929c = flVar;
        C62942bv.registerDefaultInstance(C49073fl.class, flVar);
    }

    private C49073fl() {
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
                return newMessageInfo(f126929c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"a", C49072fk.f126928a, "b", C49071fj.f126927a});
            case 3:
                return new C49073fl();
            case 4:
                return new C49070fi();
            case 5:
                return f126929c;
            case 6:
                C63010eb ebVar = f126930d;
                if (ebVar == null) {
                    synchronized (C49073fl.class) {
                        ebVar = f126930d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126929c);
                            f126930d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
