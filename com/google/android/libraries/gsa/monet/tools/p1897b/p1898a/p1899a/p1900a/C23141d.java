package com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.a.a.a.d */
/* compiled from: PG */
public final class C23141d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C23141d f63489b;

    /* renamed from: d */
    private static volatile C63010eb f63490d;

    /* renamed from: a */
    public C62971cq f63491a = emptyProtobufList();

    /* renamed from: c */
    private byte f63492c = 2;

    static {
        C23141d dVar = new C23141d();
        f63489b = dVar;
        C62942bv.registerDefaultInstance(C23141d.class, dVar);
    }

    private C23141d() {
    }

    /* renamed from: a */
    public final void mo28588a() {
        C62971cq cqVar = this.f63491a;
        if (!cqVar.mo58948c()) {
            this.f63491a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f63492c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f63492c = b;
                return null;
            case 2:
                return newMessageInfo(f63489b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C23139b.class});
            case 3:
                return new C23141d();
            case 4:
                return new C23140c();
            case 5:
                return f63489b;
            case 6:
                C63010eb ebVar = f63490d;
                if (ebVar == null) {
                    synchronized (C23141d.class) {
                        ebVar = f63490d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63489b);
                            f63490d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
