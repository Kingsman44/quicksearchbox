package com.google.speech.p5208h.p5209a;

import com.google.assistant.p3897e.p3929l.p3930a.C52692ay;
import com.google.assistant.p3897e.p3929l.p3930a.C52693az;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.a.n */
/* compiled from: PG */
public final class C66543n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f180976c = new C66541l();

    /* renamed from: d */
    public static final C66543n f180977d;

    /* renamed from: f */
    private static volatile C63010eb f180978f;

    /* renamed from: a */
    public int f180979a;

    /* renamed from: b */
    public C62961ch f180980b = emptyIntList();

    /* renamed from: e */
    private int f180981e;

    static {
        C66543n nVar = new C66543n();
        f180977d = nVar;
        C62942bv.registerDefaultInstance(C66543n.class, nVar);
    }

    private C66543n() {
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
                return newMessageInfo(f180977d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"e", "a", C52693az.f138335a, "b", C52692ay.m86690b()});
            case 3:
                return new C66543n();
            case 4:
                return new C66542m();
            case 5:
                return f180977d;
            case 6:
                C63010eb ebVar = f180978f;
                if (ebVar == null) {
                    synchronized (C66543n.class) {
                        ebVar = f180978f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180977d);
                            f180978f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
