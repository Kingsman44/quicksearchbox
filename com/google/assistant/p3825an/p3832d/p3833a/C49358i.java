package com.google.assistant.p3825an.p3832d.p3833a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.d.a.i */
/* compiled from: PG */
public final class C49358i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49358i f127584a;

    /* renamed from: c */
    private static volatile C63010eb f127585c;

    /* renamed from: b */
    private C62995dn f127586b = C62995dn.f170057a;

    static {
        C49358i iVar = new C49358i();
        f127584a = iVar;
        C62942bv.registerDefaultInstance(C49358i.class, iVar);
    }

    private C49358i() {
        emptyProtobufList();
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
                return newMessageInfo(f127584a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C49357h.f127583a});
            case 3:
                return new C49358i();
            case 4:
                return new C49356g();
            case 5:
                return f127584a;
            case 6:
                C63010eb ebVar = f127585c;
                if (ebVar == null) {
                    synchronized (C49358i.class) {
                        ebVar = f127585c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127584a);
                            f127585c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
