package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123764cd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.nd */
/* compiled from: PG */
public final class C14544nd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14544nd f43994b;

    /* renamed from: c */
    private static volatile C63010eb f43995c;

    /* renamed from: a */
    public C123764cd f43996a;

    static {
        C14544nd ndVar = new C14544nd();
        f43994b = ndVar;
        C62942bv.registerDefaultInstance(C14544nd.class, ndVar);
    }

    private C14544nd() {
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
                return newMessageInfo(f43994b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C14544nd();
            case 4:
                return new C14543nc();
            case 5:
                return f43994b;
            case 6:
                C63010eb ebVar = f43995c;
                if (ebVar == null) {
                    synchronized (C14544nd.class) {
                        ebVar = f43995c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43994b);
                            f43995c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
