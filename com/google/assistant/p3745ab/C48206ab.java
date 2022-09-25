package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ab */
/* compiled from: PG */
public final class C48206ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48206ab f124736b;

    /* renamed from: c */
    private static volatile C63010eb f124737c;

    /* renamed from: a */
    public C62971cq f124738a = emptyProtobufList();

    static {
        C48206ab abVar = new C48206ab();
        f124736b = abVar;
        C62942bv.registerDefaultInstance(C48206ab.class, abVar);
    }

    private C48206ab() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53148a() {
        C62971cq cqVar = this.f124738a;
        if (!cqVar.mo58948c()) {
            this.f124738a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f124736b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48314dm.class});
            case 3:
                return new C48206ab();
            case 4:
                return new C48201aa();
            case 5:
                return f124736b;
            case 6:
                C63010eb ebVar = f124737c;
                if (ebVar == null) {
                    synchronized (C48206ab.class) {
                        ebVar = f124737c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124736b);
                            f124737c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
