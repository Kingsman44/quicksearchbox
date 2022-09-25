package com.google.p4283bv.p4287b.p4288a.p4289a.p4299d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4412k.p4413a.C57836d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.d.b */
/* compiled from: PG */
public final class C56674b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56674b f151280b;

    /* renamed from: d */
    private static volatile C63010eb f151281d;

    /* renamed from: a */
    public C57836d f151282a;

    /* renamed from: c */
    private int f151283c;

    static {
        C56674b bVar = new C56674b();
        f151280b = bVar;
        C62942bv.registerDefaultInstance(C56674b.class, bVar);
    }

    private C56674b() {
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
                return newMessageInfo(f151280b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56674b();
            case 4:
                return new C56673a();
            case 5:
                return f151280b;
            case 6:
                C63010eb ebVar = f151281d;
                if (ebVar == null) {
                    synchronized (C56674b.class) {
                        ebVar = f151281d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151280b);
                            f151281d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
