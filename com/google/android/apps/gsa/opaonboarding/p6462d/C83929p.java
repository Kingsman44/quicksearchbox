package com.google.android.apps.gsa.opaonboarding.p6462d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.p */
/* compiled from: PG */
public final class C83929p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83929p f228585b;

    /* renamed from: c */
    private static volatile C63010eb f228586c;

    /* renamed from: a */
    public C62971cq f228587a = emptyProtobufList();

    static {
        C83929p pVar = new C83929p();
        f228585b = pVar;
        C62942bv.registerDefaultInstance(C83929p.class, pVar);
    }

    private C83929p() {
    }

    /* renamed from: a */
    public final void mo77333a() {
        C62971cq cqVar = this.f228587a;
        if (!cqVar.mo58948c()) {
            this.f228587a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f228585b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C83928o.class});
            case 3:
                return new C83929p();
            case 4:
                return new C83926m();
            case 5:
                return f228585b;
            case 6:
                C63010eb ebVar = f228586c;
                if (ebVar == null) {
                    synchronized (C83929p.class) {
                        ebVar = f228586c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228585b);
                            f228586c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
