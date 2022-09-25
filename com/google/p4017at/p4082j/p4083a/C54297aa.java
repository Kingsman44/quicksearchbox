package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.aa */
/* compiled from: PG */
public final class C54297aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54297aa f142650b;

    /* renamed from: c */
    private static volatile C63010eb f142651c;

    /* renamed from: a */
    public C62971cq f142652a = emptyProtobufList();

    static {
        C54297aa aaVar = new C54297aa();
        f142650b = aaVar;
        C62942bv.registerDefaultInstance(C54297aa.class, aaVar);
    }

    private C54297aa() {
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
                return newMessageInfo(f142650b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54299ac.class});
            case 3:
                return new C54297aa();
            case 4:
                return new C54461z();
            case 5:
                return f142650b;
            case 6:
                C63010eb ebVar = f142651c;
                if (ebVar == null) {
                    synchronized (C54297aa.class) {
                        ebVar = f142651c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142650b);
                            f142651c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
