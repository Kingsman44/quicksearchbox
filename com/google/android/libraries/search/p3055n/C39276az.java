package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.az */
/* compiled from: PG */
public final class C39276az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C39276az f103456b;

    /* renamed from: c */
    private static volatile C63010eb f103457c;

    /* renamed from: a */
    public C62971cq f103458a = C62942bv.emptyProtobufList();

    static {
        C39276az azVar = new C39276az();
        f103456b = azVar;
        C62942bv.registerDefaultInstance(C39276az.class, azVar);
    }

    private C39276az() {
    }

    /* renamed from: a */
    public final void mo41754a() {
        C62971cq cqVar = this.f103458a;
        if (!cqVar.mo58948c()) {
            this.f103458a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f103456b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C39276az();
            case 4:
                return new C39275ay();
            case 5:
                return f103456b;
            case 6:
                C63010eb ebVar = f103457c;
                if (ebVar == null) {
                    synchronized (C39276az.class) {
                        ebVar = f103457c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103456b);
                            f103457c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
