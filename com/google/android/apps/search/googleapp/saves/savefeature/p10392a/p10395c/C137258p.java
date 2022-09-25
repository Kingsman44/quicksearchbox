package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.c.p */
/* compiled from: PG */
public final class C137258p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C137258p f373421d;

    /* renamed from: f */
    private static volatile C63010eb f373422f;

    /* renamed from: a */
    public C57663x f373423a;

    /* renamed from: b */
    public C57648i f373424b;

    /* renamed from: c */
    public boolean f373425c;

    /* renamed from: e */
    private byte f373426e = 2;

    static {
        C137258p pVar = new C137258p();
        f373421d = pVar;
        C62942bv.registerDefaultInstance(C137258p.class, pVar);
    }

    private C137258p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373426e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373426e = b;
                return null;
            case 2:
                return newMessageInfo(f373421d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001Љ\u0002\t\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C137258p();
            case 4:
                return new C137257o();
            case 5:
                return f373421d;
            case 6:
                C63010eb ebVar = f373422f;
                if (ebVar == null) {
                    synchronized (C137258p.class) {
                        ebVar = f373422f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373421d);
                            f373422f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
