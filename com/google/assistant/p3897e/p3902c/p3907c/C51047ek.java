package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ek */
/* compiled from: PG */
public final class C51047ek extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51047ek f132921d;

    /* renamed from: f */
    private static volatile C63010eb f132922f;

    /* renamed from: a */
    public int f132923a;

    /* renamed from: b */
    public C62971cq f132924b = emptyProtobufList();

    /* renamed from: c */
    public int f132925c;

    /* renamed from: e */
    private byte f132926e = 2;

    static {
        C51047ek ekVar = new C51047ek();
        f132921d = ekVar;
        C62942bv.registerDefaultInstance(C51047ek.class, ekVar);
    }

    private C51047ek() {
    }

    /* renamed from: a */
    public final void mo53510a() {
        C62971cq cqVar = this.f132924b;
        if (!cqVar.mo58948c()) {
            this.f132924b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132926e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132926e = b;
                return null;
            case 2:
                return newMessageInfo(f132921d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000", new Object[]{"a", "b", C51045ei.class, C45240c.f118157a});
            case 3:
                return new C51047ek();
            case 4:
                return new C51046ej();
            case 5:
                return f132921d;
            case 6:
                C63010eb ebVar = f132922f;
                if (ebVar == null) {
                    synchronized (C51047ek.class) {
                        ebVar = f132922f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132921d);
                            f132922f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
