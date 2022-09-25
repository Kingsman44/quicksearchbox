package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.fh */
/* compiled from: PG */
public final class C49069fh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49069fh f126924b;

    /* renamed from: c */
    private static volatile C63010eb f126925c;

    /* renamed from: a */
    public C62971cq f126926a = emptyProtobufList();

    static {
        C49069fh fhVar = new C49069fh();
        f126924b = fhVar;
        C62942bv.registerDefaultInstance(C49069fh.class, fhVar);
    }

    private C49069fh() {
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
                return newMessageInfo(f126924b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49067ff.class});
            case 3:
                return new C49069fh();
            case 4:
                return new C49068fg();
            case 5:
                return f126924b;
            case 6:
                C63010eb ebVar = f126925c;
                if (ebVar == null) {
                    synchronized (C49069fh.class) {
                        ebVar = f126925c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126924b);
                            f126925c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
