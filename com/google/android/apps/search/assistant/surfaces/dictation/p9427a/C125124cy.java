package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.cy */
/* compiled from: PG */
public final class C125124cy extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C125124cy f345187a;

    /* renamed from: b */
    private static volatile C63010eb f345188b;

    static {
        C125124cy cyVar = new C125124cy();
        f345187a = cyVar;
        C62942bv.registerDefaultInstance(C125124cy.class, cyVar);
    }

    private C125124cy() {
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
                return newMessageInfo(f345187a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C125124cy();
            case 4:
                return new C125123cx();
            case 5:
                return f345187a;
            case 6:
                C63010eb ebVar = f345188b;
                if (ebVar == null) {
                    synchronized (C125124cy.class) {
                        ebVar = f345188b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345187a);
                            f345188b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
