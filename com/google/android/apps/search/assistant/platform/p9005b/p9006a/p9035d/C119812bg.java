package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.bg */
/* compiled from: PG */
public final class C119812bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119812bg f333724c;

    /* renamed from: d */
    private static volatile C63010eb f333725d;

    /* renamed from: a */
    public int f333726a;

    /* renamed from: b */
    public C32849cq f333727b;

    static {
        C119812bg bgVar = new C119812bg();
        f333724c = bgVar;
        C62942bv.registerDefaultInstance(C119812bg.class, bgVar);
    }

    private C119812bg() {
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
                return newMessageInfo(f333724c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C119812bg();
            case 4:
                return new C119811bf();
            case 5:
                return f333724c;
            case 6:
                C63010eb ebVar = f333725d;
                if (ebVar == null) {
                    synchronized (C119812bg.class) {
                        ebVar = f333725d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333724c);
                            f333725d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
