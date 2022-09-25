package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.aa */
/* compiled from: PG */
public final class C125943aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C125943aa f347158d;

    /* renamed from: e */
    private static volatile C63010eb f347159e;

    /* renamed from: a */
    public C62995dn f347160a = C62995dn.f170057a;

    /* renamed from: b */
    public boolean f347161b;

    /* renamed from: c */
    public int f347162c;

    static {
        C125943aa aaVar = new C125943aa();
        f347158d = aaVar;
        C62942bv.registerDefaultInstance(C125943aa.class, aaVar);
    }

    private C125943aa() {
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
                return newMessageInfo(f347158d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002\u0007\u0003\u0004", new Object[]{"a", C126162z.f347638a, "b", C45240c.f118157a});
            case 3:
                return new C125943aa();
            case 4:
                return new C126161y();
            case 5:
                return f347158d;
            case 6:
                C63010eb ebVar = f347159e;
                if (ebVar == null) {
                    synchronized (C125943aa.class) {
                        ebVar = f347159e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f347158d);
                            f347159e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
