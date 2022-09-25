package com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.b.a.e */
/* compiled from: PG */
public final class C116426e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C116426e f322830b;

    /* renamed from: c */
    private static volatile C63010eb f322831c;

    /* renamed from: a */
    public C62971cq f322832a = emptyProtobufList();

    static {
        C116426e eVar = new C116426e();
        f322830b = eVar;
        C62942bv.registerDefaultInstance(C116426e.class, eVar);
    }

    private C116426e() {
    }

    /* renamed from: a */
    public final void mo102696a() {
        C62971cq cqVar = this.f322832a;
        if (!cqVar.mo58948c()) {
            this.f322832a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f322830b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C116424c.class});
            case 3:
                return new C116426e();
            case 4:
                return new C116425d();
            case 5:
                return f322830b;
            case 6:
                C63010eb ebVar = f322831c;
                if (ebVar == null) {
                    synchronized (C116426e.class) {
                        ebVar = f322831c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f322830b);
                            f322831c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
