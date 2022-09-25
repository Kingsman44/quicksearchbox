package com.google.android.libraries.lens.view.p2067ak;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.f */
/* compiled from: PG */
public final class C25267f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C25267f f68736e;

    /* renamed from: f */
    private static volatile C63010eb f68737f;

    /* renamed from: a */
    public int f68738a;

    /* renamed from: b */
    public int f68739b;

    /* renamed from: c */
    public C62964ck f68740c = emptyLongList();

    /* renamed from: d */
    public long f68741d;

    static {
        C25267f fVar = new C25267f();
        f68736e = fVar;
        C62942bv.registerDefaultInstance(C25267f.class, fVar);
    }

    private C25267f() {
    }

    /* renamed from: a */
    public final void mo30365a() {
        C62964ck ckVar = this.f68740c;
        if (!ckVar.mo58948c()) {
            this.f68740c = C62942bv.mutableCopy(ckVar);
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
                return newMessageInfo(f68736e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002%\u0003\u0004\u0004\u0002", new Object[]{"a", C45240c.f118157a, "b", "d"});
            case 3:
                return new C25267f();
            case 4:
                return new C25266e();
            case 5:
                return f68736e;
            case 6:
                C63010eb ebVar = f68737f;
                if (ebVar == null) {
                    synchronized (C25267f.class) {
                        ebVar = f68737f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68736e);
                            f68737f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
