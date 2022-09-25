package com.google.android.apps.gsa.nga.shared.p6305ae.p6306a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ae.a.j */
/* compiled from: PG */
public final class C80565j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80565j f221147b;

    /* renamed from: c */
    private static volatile C63010eb f221148c;

    /* renamed from: a */
    public C62971cq f221149a = emptyProtobufList();

    static {
        C80565j jVar = new C80565j();
        f221147b = jVar;
        C62942bv.registerDefaultInstance(C80565j.class, jVar);
    }

    private C80565j() {
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
                return newMessageInfo(f221147b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C80563h.class});
            case 3:
                return new C80565j();
            case 4:
                return new C80564i();
            case 5:
                return f221147b;
            case 6:
                C63010eb ebVar = f221148c;
                if (ebVar == null) {
                    synchronized (C80565j.class) {
                        ebVar = f221148c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221147b);
                            f221148c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
