package com.google.android.apps.gsa.staticplugins.accl.p7329a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.a.e */
/* compiled from: PG */
public final class C92717e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C92717e f258816b;

    /* renamed from: c */
    private static volatile C63010eb f258817c;

    /* renamed from: a */
    public C62971cq f258818a = emptyProtobufList();

    static {
        C92717e eVar = new C92717e();
        f258816b = eVar;
        C62942bv.registerDefaultInstance(C92717e.class, eVar);
    }

    private C92717e() {
    }

    /* renamed from: a */
    public final void mo87448a() {
        C62971cq cqVar = this.f258818a;
        if (!cqVar.mo58948c()) {
            this.f258818a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f258816b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C92716d.class});
            case 3:
                return new C92717e();
            case 4:
                return new C92714b();
            case 5:
                return f258816b;
            case 6:
                C63010eb ebVar = f258817c;
                if (ebVar == null) {
                    synchronized (C92717e.class) {
                        ebVar = f258817c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f258816b);
                            f258817c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
