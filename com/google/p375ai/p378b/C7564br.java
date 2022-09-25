package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.br */
/* compiled from: PG */
public final class C7564br extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7564br f26162a;

    /* renamed from: e */
    private static volatile C63010eb f26163e;

    /* renamed from: b */
    private int f26164b;

    /* renamed from: c */
    private C7799kj f26165c;

    /* renamed from: d */
    private byte f26166d = 2;

    static {
        C7564br brVar = new C7564br();
        f26162a = brVar;
        C62942bv.registerDefaultInstance(C7564br.class, brVar);
    }

    private C7564br() {
    }

    /* renamed from: a */
    public final C7799kj mo16928a() {
        C7799kj kjVar = this.f26165c;
        return kjVar == null ? C7799kj.f27263h : kjVar;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26166d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26166d = b;
                return null;
            case 2:
                return newMessageInfo(f26162a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C7564br();
            case 4:
                return new C7563bq();
            case 5:
                return f26162a;
            case 6:
                C63010eb ebVar = f26163e;
                if (ebVar == null) {
                    synchronized (C7564br.class) {
                        ebVar = f26163e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26162a);
                            f26163e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
