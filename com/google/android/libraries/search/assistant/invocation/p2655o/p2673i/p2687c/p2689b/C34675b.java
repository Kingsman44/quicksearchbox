package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C66942fe;
import com.google.speech.p5218j.C66948fk;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.c.b.b */
/* compiled from: PG */
public final class C34675b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C34675b f92064d;

    /* renamed from: e */
    private static volatile C63010eb f92065e;

    /* renamed from: a */
    public int f92066a;

    /* renamed from: b */
    public int f92067b;

    /* renamed from: c */
    public int f92068c;

    static {
        C34675b bVar = new C34675b();
        f92064d = bVar;
        C62942bv.registerDefaultInstance(C34675b.class, bVar);
    }

    private C34675b() {
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
                return newMessageInfo(f92064d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C66948fk.m97390b(), C45240c.f118157a, C66942fe.m97388b()});
            case 3:
                return new C34675b();
            case 4:
                return new C34674a();
            case 5:
                return f92064d;
            case 6:
                C63010eb ebVar = f92065e;
                if (ebVar == null) {
                    synchronized (C34675b.class) {
                        ebVar = f92065e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92064d);
                            f92065e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
