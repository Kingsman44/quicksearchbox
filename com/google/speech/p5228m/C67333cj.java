package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63259d;

/* renamed from: com.google.speech.m.cj */
/* compiled from: PG */
public final class C67333cj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67333cj f183016c;

    /* renamed from: d */
    private static volatile C63010eb f183017d;

    /* renamed from: a */
    public int f183018a;

    /* renamed from: b */
    public C63259d f183019b;

    static {
        C67333cj cjVar = new C67333cj();
        f183016c = cjVar;
        C62942bv.registerDefaultInstance(C67333cj.class, cjVar);
    }

    private C67333cj() {
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
                return newMessageInfo(f183016c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67333cj();
            case 4:
                return new C67332ci();
            case 5:
                return f183016c;
            case 6:
                C63010eb ebVar = f183017d;
                if (ebVar == null) {
                    synchronized (C67333cj.class) {
                        ebVar = f183017d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183016c);
                            f183017d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
