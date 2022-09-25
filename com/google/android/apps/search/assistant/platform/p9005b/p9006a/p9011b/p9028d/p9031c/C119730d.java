package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5224k.p5225a.C67186ad;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.d.c.d */
/* compiled from: PG */
public final class C119730d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119730d f333555b;

    /* renamed from: d */
    private static volatile C63010eb f333556d;

    /* renamed from: a */
    public C67186ad f333557a;

    /* renamed from: c */
    private byte f333558c = 2;

    static {
        C119730d dVar = new C119730d();
        f333555b = dVar;
        C62942bv.registerDefaultInstance(C119730d.class, dVar);
    }

    private C119730d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333558c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f333558c = b;
                return null;
            case 2:
                return newMessageInfo(f333555b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C119730d();
            case 4:
                return new C119729c();
            case 5:
                return f333555b;
            case 6:
                C63010eb ebVar = f333556d;
                if (ebVar == null) {
                    synchronized (C119730d.class) {
                        ebVar = f333556d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333555b);
                            f333556d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
