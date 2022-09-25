package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.fg */
/* compiled from: PG */
public final class C49957fg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49957fg f129874a;

    /* renamed from: c */
    private static volatile C63010eb f129875c;

    /* renamed from: b */
    private C62995dn f129876b = C62995dn.f170057a;

    static {
        C49957fg fgVar = new C49957fg();
        f129874a = fgVar;
        C62942bv.registerDefaultInstance(C49957fg.class, fgVar);
    }

    private C49957fg() {
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
                return newMessageInfo(f129874a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C49956ff.f129873a});
            case 3:
                return new C49957fg();
            case 4:
                return new C49955fe();
            case 5:
                return f129874a;
            case 6:
                C63010eb ebVar = f129875c;
                if (ebVar == null) {
                    synchronized (C49957fg.class) {
                        ebVar = f129875c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129874a);
                            f129875c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
