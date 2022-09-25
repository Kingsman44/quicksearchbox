package com.google.p4283bv.p4287b.p4288a.p4289a.p4290a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.a.h */
/* compiled from: PG */
public final class C56616h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56616h f151163d;

    /* renamed from: f */
    private static volatile C63010eb f151164f;

    /* renamed from: a */
    public int f151165a;

    /* renamed from: b */
    public C56612d f151166b;

    /* renamed from: c */
    public C60214n f151167c;

    /* renamed from: e */
    private byte f151168e = 2;

    static {
        C56616h hVar = new C56616h();
        f151163d = hVar;
        C62942bv.registerDefaultInstance(C56616h.class, hVar);
    }

    private C56616h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151168e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151168e = b;
                return null;
            case 2:
                return newMessageInfo(f151163d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56616h();
            case 4:
                return new C56615g();
            case 5:
                return f151163d;
            case 6:
                C63010eb ebVar = f151164f;
                if (ebVar == null) {
                    synchronized (C56616h.class) {
                        ebVar = f151164f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151163d);
                            f151164f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
