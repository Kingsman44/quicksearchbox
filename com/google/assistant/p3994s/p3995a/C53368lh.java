package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lh */
/* compiled from: PG */
public final class C53368lh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53368lh f140044b;

    /* renamed from: c */
    private static volatile C63010eb f140045c;

    /* renamed from: a */
    public C62971cq f140046a = C62942bv.emptyProtobufList();

    static {
        C53368lh lhVar = new C53368lh();
        f140044b = lhVar;
        C62942bv.registerDefaultInstance(C53368lh.class, lhVar);
    }

    private C53368lh() {
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
                return newMessageInfo(f140044b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
            case 3:
                return new C53368lh();
            case 4:
                return new C53367lg();
            case 5:
                return f140044b;
            case 6:
                C63010eb ebVar = f140045c;
                if (ebVar == null) {
                    synchronized (C53368lh.class) {
                        ebVar = f140045c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140044b);
                            f140045c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
