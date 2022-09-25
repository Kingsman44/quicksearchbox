package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.s */
/* compiled from: PG */
public final class C83010s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83010s f226522b;

    /* renamed from: c */
    private static volatile C63010eb f226523c;

    /* renamed from: a */
    public C62971cq f226524a = emptyProtobufList();

    static {
        C83010s sVar = new C83010s();
        f226522b = sVar;
        C62942bv.registerDefaultInstance(C83010s.class, sVar);
    }

    private C83010s() {
    }

    /* renamed from: a */
    public final void mo76643a() {
        C62971cq cqVar = this.f226524a;
        if (!cqVar.mo58948c()) {
            this.f226524a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f226522b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C83009r.class});
            case 3:
                return new C83010s();
            case 4:
                return new C83007p();
            case 5:
                return f226522b;
            case 6:
                C63010eb ebVar = f226523c;
                if (ebVar == null) {
                    synchronized (C83010s.class) {
                        ebVar = f226523c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226522b);
                            f226523c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
