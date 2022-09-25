package com.google.android.libraries.gsa.actionusermodel.p1830c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.c.k */
/* compiled from: PG */
public final class C22108k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C22108k f60936b;

    /* renamed from: c */
    private static volatile C63010eb f60937c;

    /* renamed from: a */
    public C62971cq f60938a = emptyProtobufList();

    static {
        C22108k kVar = new C22108k();
        f60936b = kVar;
        C62942bv.registerDefaultInstance(C22108k.class, kVar);
    }

    private C22108k() {
    }

    /* renamed from: a */
    public final void mo27360a() {
        C62971cq cqVar = this.f60938a;
        if (!cqVar.mo58948c()) {
            this.f60938a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f60936b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C22106i.class});
            case 3:
                return new C22108k();
            case 4:
                return new C22107j();
            case 5:
                return f60936b;
            case 6:
                C63010eb ebVar = f60937c;
                if (ebVar == null) {
                    synchronized (C22108k.class) {
                        ebVar = f60937c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60936b);
                            f60937c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
