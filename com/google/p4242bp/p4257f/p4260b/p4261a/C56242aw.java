package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.aw */
/* compiled from: PG */
public final class C56242aw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56242aw f149799b;

    /* renamed from: c */
    private static volatile C63010eb f149800c;

    /* renamed from: a */
    public C62971cq f149801a = emptyProtobufList();

    static {
        C56242aw awVar = new C56242aw();
        f149799b = awVar;
        C62942bv.registerDefaultInstance(C56242aw.class, awVar);
    }

    private C56242aw() {
    }

    /* renamed from: a */
    public final void mo54344a() {
        C62971cq cqVar = this.f149801a;
        if (!cqVar.mo58948c()) {
            this.f149801a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f149799b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56235ap.class});
            case 3:
                return new C56242aw();
            case 4:
                return new C56231al();
            case 5:
                return f149799b;
            case 6:
                C63010eb ebVar = f149800c;
                if (ebVar == null) {
                    synchronized (C56242aw.class) {
                        ebVar = f149800c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149799b);
                            f149800c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
