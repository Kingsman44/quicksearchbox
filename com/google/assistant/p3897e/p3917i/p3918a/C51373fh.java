package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.fh */
/* compiled from: PG */
public final class C51373fh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51373fh f133802b;

    /* renamed from: d */
    private static volatile C63010eb f133803d;

    /* renamed from: a */
    public C62971cq f133804a = emptyProtobufList();

    /* renamed from: c */
    private byte f133805c = 2;

    static {
        C51373fh fhVar = new C51373fh();
        f133802b = fhVar;
        C62942bv.registerDefaultInstance(C51373fh.class, fhVar);
    }

    private C51373fh() {
    }

    /* renamed from: a */
    public final void mo53606a() {
        C62971cq cqVar = this.f133804a;
        if (!cqVar.mo58948c()) {
            this.f133804a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133805c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133805c = b;
                return null;
            case 2:
                return newMessageInfo(f133802b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C51372fg.class});
            case 3:
                return new C51373fh();
            case 4:
                return new C51370fe();
            case 5:
                return f133802b;
            case 6:
                C63010eb ebVar = f133803d;
                if (ebVar == null) {
                    synchronized (C51373fh.class) {
                        ebVar = f133803d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133802b);
                            f133803d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
