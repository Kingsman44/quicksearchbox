package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.a.c.i */
/* compiled from: PG */
public final class C119681i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119681i f333477b;

    /* renamed from: c */
    private static volatile C63010eb f333478c;

    /* renamed from: a */
    public C63088z f333479a = C63088z.f170246b;

    static {
        C119681i iVar = new C119681i();
        f333477b = iVar;
        C62942bv.registerDefaultInstance(C119681i.class, iVar);
    }

    private C119681i() {
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
                return newMessageInfo(f333477b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
            case 3:
                return new C119681i();
            case 4:
                return new C119680h();
            case 5:
                return f333477b;
            case 6:
                C63010eb ebVar = f333478c;
                if (ebVar == null) {
                    synchronized (C119681i.class) {
                        ebVar = f333478c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333477b);
                            f333478c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
