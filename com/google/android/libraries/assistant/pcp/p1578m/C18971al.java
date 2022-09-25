package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.al */
/* compiled from: PG */
public final class C18971al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C18971al f53298b;

    /* renamed from: c */
    private static volatile C63010eb f53299c;

    /* renamed from: a */
    public C62995dn f53300a = C62995dn.f170057a;

    static {
        C18971al alVar = new C18971al();
        f53298b = alVar;
        C62942bv.registerDefaultInstance(C18971al.class, alVar);
    }

    private C18971al() {
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
                return newMessageInfo(f53298b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", C18968ai.f53293a});
            case 3:
                return new C18971al();
            case 4:
                return new C18967ah();
            case 5:
                return f53298b;
            case 6:
                C63010eb ebVar = f53299c;
                if (ebVar == null) {
                    synchronized (C18971al.class) {
                        ebVar = f53299c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53298b);
                            f53299c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
