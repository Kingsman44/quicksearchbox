package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.cs */
/* compiled from: PG */
public final class C56562cs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56562cs f151032b;

    /* renamed from: c */
    private static volatile C63010eb f151033c;

    /* renamed from: a */
    public C56561cr f151034a;

    static {
        C56562cs csVar = new C56562cs();
        f151032b = csVar;
        C62942bv.registerDefaultInstance(C56562cs.class, csVar);
    }

    private C56562cs() {
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
                return newMessageInfo(f151032b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C56562cs();
            case 4:
                return new C56553cj();
            case 5:
                return f151032b;
            case 6:
                C63010eb ebVar = f151033c;
                if (ebVar == null) {
                    synchronized (C56562cs.class) {
                        ebVar = f151033c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151032b);
                            f151033c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
