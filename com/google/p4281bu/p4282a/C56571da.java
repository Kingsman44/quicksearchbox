package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.da */
/* compiled from: PG */
public final class C56571da extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56571da f151048b;

    /* renamed from: c */
    private static volatile C63010eb f151049c;

    /* renamed from: a */
    public int f151050a;

    static {
        C56571da daVar = new C56571da();
        f151048b = daVar;
        C62942bv.registerDefaultInstance(C56571da.class, daVar);
    }

    private C56571da() {
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
                return newMessageInfo(f151048b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
            case 3:
                return new C56571da();
            case 4:
                return new C56569cz();
            case 5:
                return f151048b;
            case 6:
                C63010eb ebVar = f151049c;
                if (ebVar == null) {
                    synchronized (C56571da.class) {
                        ebVar = f151049c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151048b);
                            f151049c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
