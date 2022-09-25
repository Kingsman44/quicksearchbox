package com.google.p4283bv.p4287b.p4288a.p4289a.p4309n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.n.d */
/* compiled from: PG */
public final class C56745d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56745d f151443b;

    /* renamed from: d */
    private static volatile C63010eb f151444d;

    /* renamed from: a */
    public C8575bc f151445a;

    /* renamed from: c */
    private int f151446c;

    static {
        C56745d dVar = new C56745d();
        f151443b = dVar;
        C62942bv.registerDefaultInstance(C56745d.class, dVar);
    }

    private C56745d() {
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
                return newMessageInfo(f151443b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56745d();
            case 4:
                return new C56744c();
            case 5:
                return f151443b;
            case 6:
                C63010eb ebVar = f151444d;
                if (ebVar == null) {
                    synchronized (C56745d.class) {
                        ebVar = f151444d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151443b);
                            f151444d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
