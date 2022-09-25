package com.google.apps.tiktok.account.data.manager.p3615a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.account.data.manager.a.f */
/* compiled from: PG */
public final class C46225f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C46225f f121180b;

    /* renamed from: c */
    private static volatile C63010eb f121181c;

    /* renamed from: a */
    public C62995dn f121182a = C62995dn.f170057a;

    static {
        C46225f fVar = new C46225f();
        f121180b = fVar;
        C62942bv.registerDefaultInstance(C46225f.class, fVar);
    }

    private C46225f() {
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
                return newMessageInfo(f121180b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C46224e.f121179a});
            case 3:
                return new C46225f();
            case 4:
                return new C46223d();
            case 5:
                return f121180b;
            case 6:
                C63010eb ebVar = f121181c;
                if (ebVar == null) {
                    synchronized (C46225f.class) {
                        ebVar = f121181c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f121180b);
                            f121181c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
