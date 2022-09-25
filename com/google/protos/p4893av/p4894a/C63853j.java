package com.google.protos.p4893av.p4894a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.av.a.j */
/* compiled from: PG */
public final class C63853j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63853j f172669a;

    /* renamed from: e */
    private static volatile C63010eb f172670e;

    /* renamed from: b */
    private int f172671b;

    /* renamed from: c */
    private C62724b f172672c;

    /* renamed from: d */
    private byte f172673d = 2;

    static {
        C63853j jVar = new C63853j();
        f172669a = jVar;
        C62942bv.registerDefaultInstance(C63853j.class, jVar);
    }

    private C63853j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172673d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172673d = b;
                return null;
            case 2:
                return newMessageInfo(f172669a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63853j();
            case 4:
                return new C63852i();
            case 5:
                return f172669a;
            case 6:
                C63010eb ebVar = f172670e;
                if (ebVar == null) {
                    synchronized (C63853j.class) {
                        ebVar = f172670e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172669a);
                            f172670e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
