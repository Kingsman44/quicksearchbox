package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.h */
/* compiled from: PG */
public final class C121244h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121244h f336790b;

    /* renamed from: c */
    private static volatile C63010eb f336791c;

    /* renamed from: a */
    public C62995dn f336792a = C62995dn.f170057a;

    static {
        C121244h hVar = new C121244h();
        f336790b = hVar;
        C62942bv.registerDefaultInstance(C121244h.class, hVar);
    }

    private C121244h() {
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
                return newMessageInfo(f336790b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", C121243g.f336789a});
            case 3:
                return new C121244h();
            case 4:
                return new C121242f();
            case 5:
                return f336790b;
            case 6:
                C63010eb ebVar = f336791c;
                if (ebVar == null) {
                    synchronized (C121244h.class) {
                        ebVar = f336791c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336790b);
                            f336791c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
