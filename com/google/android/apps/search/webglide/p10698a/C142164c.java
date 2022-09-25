package com.google.android.apps.search.webglide.p10698a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.webglide.a.c */
/* compiled from: PG */
public final class C142164c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142164c f385665b;

    /* renamed from: c */
    private static volatile C63010eb f385666c;

    /* renamed from: a */
    public C62995dn f385667a = C62995dn.f170057a;

    static {
        C142164c cVar = new C142164c();
        f385665b = cVar;
        C62942bv.registerDefaultInstance(C142164c.class, cVar);
    }

    private C142164c() {
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
                return newMessageInfo(f385665b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C142163b.f385664a});
            case 3:
                return new C142164c();
            case 4:
                return new C142162a();
            case 5:
                return f385665b;
            case 6:
                C63010eb ebVar = f385666c;
                if (ebVar == null) {
                    synchronized (C142164c.class) {
                        ebVar = f385666c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385665b);
                            f385666c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
