package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.i */
/* compiled from: PG */
public final class C18979i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C18979i f53317b;

    /* renamed from: c */
    private static volatile C63010eb f53318c;

    /* renamed from: a */
    public C62995dn f53319a = C62995dn.f170057a;

    static {
        C18979i iVar = new C18979i();
        f53317b = iVar;
        C62942bv.registerDefaultInstance(C18979i.class, iVar);
    }

    private C18979i() {
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
                return newMessageInfo(f53317b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C18978h.f53316a});
            case 3:
                return new C18979i();
            case 4:
                return new C18977g();
            case 5:
                return f53317b;
            case 6:
                C63010eb ebVar = f53318c;
                if (ebVar == null) {
                    synchronized (C18979i.class) {
                        ebVar = f53318c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53317b);
                            f53318c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
