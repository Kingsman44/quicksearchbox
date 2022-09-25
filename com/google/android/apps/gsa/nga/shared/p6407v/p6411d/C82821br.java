package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.br */
/* compiled from: PG */
public final class C82821br extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82821br f225675d;

    /* renamed from: e */
    private static volatile C63010eb f225676e;

    /* renamed from: a */
    public int f225677a;

    /* renamed from: b */
    public int f225678b;

    /* renamed from: c */
    public int f225679c;

    static {
        C82821br brVar = new C82821br();
        f225675d = brVar;
        C62942bv.registerDefaultInstance(C82821br.class, brVar);
    }

    private C82821br() {
    }

    /* renamed from: a */
    public final boolean mo76620a() {
        return (this.f225677a & 1) != 0;
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
                return newMessageInfo(f225675d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C82884e.f225976a, C45240c.f118157a, C82819bp.f225674a});
            case 3:
                return new C82821br();
            case 4:
                return new C82818bo();
            case 5:
                return f225675d;
            case 6:
                C63010eb ebVar = f225676e;
                if (ebVar == null) {
                    synchronized (C82821br.class) {
                        ebVar = f225676e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225675d);
                            f225676e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
