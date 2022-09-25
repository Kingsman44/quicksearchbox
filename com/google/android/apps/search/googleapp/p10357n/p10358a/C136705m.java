package com.google.android.apps.search.googleapp.p10357n.p10358a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54118q;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.n.a.m */
/* compiled from: PG */
public final class C136705m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136705m f372112d;

    /* renamed from: f */
    private static volatile C63010eb f372113f;

    /* renamed from: a */
    public int f372114a;

    /* renamed from: b */
    public C54118q f372115b;

    /* renamed from: c */
    public int f372116c;

    /* renamed from: e */
    private byte f372117e = 2;

    static {
        C136705m mVar = new C136705m();
        f372112d = mVar;
        C62942bv.registerDefaultInstance(C136705m.class, mVar);
    }

    private C136705m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f372117e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f372117e = b;
                return null;
            case 2:
                return newMessageInfo(f372112d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C136708p.f372125a});
            case 3:
                return new C136705m();
            case 4:
                return new C136704l();
            case 5:
                return f372112d;
            case 6:
                C63010eb ebVar = f372113f;
                if (ebVar == null) {
                    synchronized (C136705m.class) {
                        ebVar = f372113f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372112d);
                            f372113f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
