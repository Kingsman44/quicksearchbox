package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ch */
/* compiled from: PG */
public final class C119840ch extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119840ch f333779b;

    /* renamed from: d */
    private static volatile C63010eb f333780d;

    /* renamed from: a */
    public C34822b f333781a;

    /* renamed from: c */
    private byte f333782c = 2;

    static {
        C119840ch chVar = new C119840ch();
        f333779b = chVar;
        C62942bv.registerDefaultInstance(C119840ch.class, chVar);
    }

    private C119840ch() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333782c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f333782c = b;
                return null;
            case 2:
                return newMessageInfo(f333779b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C119840ch();
            case 4:
                return new C119839cg();
            case 5:
                return f333779b;
            case 6:
                C63010eb ebVar = f333780d;
                if (ebVar == null) {
                    synchronized (C119840ch.class) {
                        ebVar = f333780d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333779b);
                            f333780d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
