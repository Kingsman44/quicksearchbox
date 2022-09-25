package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.i */
/* compiled from: PG */
public final class C87907i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87907i f237794c;

    /* renamed from: d */
    private static volatile C63010eb f237795d;

    /* renamed from: a */
    public int f237796a;

    /* renamed from: b */
    public int f237797b;

    static {
        C87907i iVar = new C87907i();
        f237794c = iVar;
        C62942bv.registerDefaultInstance(C87907i.class, iVar);
    }

    private C87907i() {
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
                return newMessageInfo(f237794c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C88219to.f238455a});
            case 3:
                return new C87907i();
            case 4:
                return new C87880h();
            case 5:
                return f237794c;
            case 6:
                C63010eb ebVar = f237795d;
                if (ebVar == null) {
                    synchronized (C87907i.class) {
                        ebVar = f237795d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237794c);
                            f237795d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
