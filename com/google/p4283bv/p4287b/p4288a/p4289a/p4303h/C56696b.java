package com.google.p4283bv.p4287b.p4288a.p4289a.p4303h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57844b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.h.b */
/* compiled from: PG */
public final class C56696b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56696b f151332b;

    /* renamed from: f */
    private static volatile C63010eb f151333f;

    /* renamed from: a */
    public C57566aj f151334a;

    /* renamed from: c */
    private int f151335c;

    /* renamed from: d */
    private C57844b f151336d;

    /* renamed from: e */
    private byte f151337e = 2;

    static {
        C56696b bVar = new C56696b();
        f151332b = bVar;
        C62942bv.registerDefaultInstance(C56696b.class, bVar);
    }

    private C56696b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151337e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151337e = b;
                return null;
            case 2:
                return newMessageInfo(f151332b, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0003ᐉ\u0002", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C56696b();
            case 4:
                return new C56695a();
            case 5:
                return f151332b;
            case 6:
                C63010eb ebVar = f151333f;
                if (ebVar == null) {
                    synchronized (C56696b.class) {
                        ebVar = f151333f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151332b);
                            f151333f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
