package com.google.protos.p4850an.p4854c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.c.ac */
/* compiled from: PG */
public final class C63402ac extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63402ac f171336b;

    /* renamed from: d */
    private static volatile C63010eb f171337d;

    /* renamed from: a */
    public C62971cq f171338a = emptyProtobufList();

    /* renamed from: c */
    private byte f171339c = 2;

    static {
        C63402ac acVar = new C63402ac();
        f171336b = acVar;
        C62942bv.registerDefaultInstance(C63402ac.class, acVar);
    }

    private C63402ac() {
    }

    /* renamed from: a */
    public final void mo59212a() {
        C62971cq cqVar = this.f171338a;
        if (!cqVar.mo58948c()) {
            this.f171338a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171339c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171339c = b;
                return null;
            case 2:
                return newMessageInfo(f171336b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C63410ak.class});
            case 3:
                return new C63402ac();
            case 4:
                return new C63401ab();
            case 5:
                return f171336b;
            case 6:
                C63010eb ebVar = f171337d;
                if (ebVar == null) {
                    synchronized (C63402ac.class) {
                        ebVar = f171337d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171336b);
                            f171337d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
