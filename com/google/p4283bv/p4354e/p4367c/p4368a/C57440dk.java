package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.dk */
/* compiled from: PG */
public final class C57440dk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57440dk f153428c;

    /* renamed from: e */
    private static volatile C63010eb f153429e;

    /* renamed from: a */
    public C62971cq f153430a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f153431b = emptyProtobufList();

    /* renamed from: d */
    private byte f153432d = 2;

    static {
        C57440dk dkVar = new C57440dk();
        f153428c = dkVar;
        C62942bv.registerDefaultInstance(C57440dk.class, dkVar);
    }

    private C57440dk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153432d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153432d = b;
                return null;
            case 2:
                return newMessageInfo(f153428c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", C57442dm.class, "b", C57446dq.class});
            case 3:
                return new C57440dk();
            case 4:
                return new C57439dj();
            case 5:
                return f153428c;
            case 6:
                C63010eb ebVar = f153429e;
                if (ebVar == null) {
                    synchronized (C57440dk.class) {
                        ebVar = f153429e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153428c);
                            f153429e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
