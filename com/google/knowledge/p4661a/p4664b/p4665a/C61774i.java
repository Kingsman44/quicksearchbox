package com.google.knowledge.p4661a.p4664b.p4665a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.b.a.i */
/* compiled from: PG */
public final class C61774i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61774i f166864a;

    /* renamed from: c */
    private static volatile C63010eb f166865c;

    /* renamed from: b */
    private C62995dn f166866b = C62995dn.f170057a;

    static {
        C61774i iVar = new C61774i();
        f166864a = iVar;
        C62942bv.registerDefaultInstance(C61774i.class, iVar);
    }

    private C61774i() {
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
                return newMessageInfo(f166864a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C61773h.f166863a});
            case 3:
                return new C61774i();
            case 4:
                return new C61772g();
            case 5:
                return f166864a;
            case 6:
                C63010eb ebVar = f166865c;
                if (ebVar == null) {
                    synchronized (C61774i.class) {
                        ebVar = f166865c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166864a);
                            f166865c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
