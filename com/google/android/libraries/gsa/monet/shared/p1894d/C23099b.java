package com.google.android.libraries.gsa.monet.shared.p1894d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.shared.d.b */
/* compiled from: PG */
public final class C23099b extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C23099b f63440e;

    /* renamed from: g */
    private static volatile C63010eb f63441g;

    /* renamed from: a */
    public int f63442a;

    /* renamed from: b */
    public int f63443b;

    /* renamed from: c */
    public boolean f63444c;

    /* renamed from: d */
    public boolean f63445d;

    /* renamed from: f */
    private byte f63446f = 2;

    static {
        C23099b bVar = new C23099b();
        f63440e = bVar;
        C62942bv.registerDefaultInstance(C23099b.class, bVar);
    }

    private C23099b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f63446f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f63446f = b;
                return null;
            case 2:
                return newMessageInfo(f63440e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C23099b();
            case 4:
                return new C23098a();
            case 5:
                return f63440e;
            case 6:
                C63010eb ebVar = f63441g;
                if (ebVar == null) {
                    synchronized (C23099b.class) {
                        ebVar = f63441g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63440e);
                            f63441g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
