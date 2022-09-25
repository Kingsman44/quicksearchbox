package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bw */
/* compiled from: PG */
public final class C80229bw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80229bw f220111b;

    /* renamed from: c */
    private static volatile C63010eb f220112c;

    /* renamed from: a */
    public C62971cq f220113a = emptyProtobufList();

    static {
        C80229bw bwVar = new C80229bw();
        f220111b = bwVar;
        C62942bv.registerDefaultInstance(C80229bw.class, bwVar);
    }

    private C80229bw() {
    }

    /* renamed from: a */
    public final void mo74290a() {
        C62971cq cqVar = this.f220113a;
        if (!cqVar.mo58948c()) {
            this.f220113a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f220111b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C80213bg.class});
            case 3:
                return new C80229bw();
            case 4:
                return new C80228bv();
            case 5:
                return f220111b;
            case 6:
                C63010eb ebVar = f220112c;
                if (ebVar == null) {
                    synchronized (C80229bw.class) {
                        ebVar = f220112c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220111b);
                            f220112c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
