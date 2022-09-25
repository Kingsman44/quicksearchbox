package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.v */
/* compiled from: PG */
public final class C121258v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121258v f336821b;

    /* renamed from: c */
    private static volatile C63010eb f336822c;

    /* renamed from: a */
    public C62995dn f336823a = C62995dn.f170057a;

    static {
        C121258v vVar = new C121258v();
        f336821b = vVar;
        C62942bv.registerDefaultInstance(C121258v.class, vVar);
    }

    private C121258v() {
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
                return newMessageInfo(f336821b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C121257u.f336820a});
            case 3:
                return new C121258v();
            case 4:
                return new C121256t();
            case 5:
                return f336821b;
            case 6:
                C63010eb ebVar = f336822c;
                if (ebVar == null) {
                    synchronized (C121258v.class) {
                        ebVar = f336822c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336821b);
                            f336822c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
