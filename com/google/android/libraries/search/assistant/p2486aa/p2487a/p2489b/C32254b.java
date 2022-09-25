package com.google.android.libraries.search.assistant.p2486aa.p2487a.p2489b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.p5219a.C66722az;

/* renamed from: com.google.android.libraries.search.assistant.aa.a.b.b */
/* compiled from: PG */
public final class C32254b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32254b f86479c;

    /* renamed from: e */
    private static volatile C63010eb f86480e;

    /* renamed from: a */
    public int f86481a;

    /* renamed from: b */
    public C66722az f86482b;

    /* renamed from: d */
    private byte f86483d = 2;

    static {
        C32254b bVar = new C32254b();
        f86479c = bVar;
        C62942bv.registerDefaultInstance(C32254b.class, bVar);
    }

    private C32254b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f86483d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f86483d = b;
                return null;
            case 2:
                return newMessageInfo(f86479c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32254b();
            case 4:
                return new C32253a();
            case 5:
                return f86479c;
            case 6:
                C63010eb ebVar = f86480e;
                if (ebVar == null) {
                    synchronized (C32254b.class) {
                        ebVar = f86480e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86479c);
                            f86480e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
