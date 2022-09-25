package com.google.protos.p4985f.p4988b.p4992c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.c.d */
/* compiled from: PG */
public final class C64756d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64756d f175537f;

    /* renamed from: h */
    private static volatile C63010eb f175538h;

    /* renamed from: a */
    public float f175539a;

    /* renamed from: b */
    public float f175540b;

    /* renamed from: c */
    public float f175541c;

    /* renamed from: d */
    public float f175542d;

    /* renamed from: e */
    public float f175543e;

    /* renamed from: g */
    private int f175544g;

    static {
        C64756d dVar = new C64756d();
        f175537f = dVar;
        C62942bv.registerDefaultInstance(C64756d.class, dVar);
    }

    private C64756d() {
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
                return newMessageInfo(f175537f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64756d();
            case 4:
                return new C64755c();
            case 5:
                return f175537f;
            case 6:
                C63010eb ebVar = f175538h;
                if (ebVar == null) {
                    synchronized (C64756d.class) {
                        ebVar = f175538h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175537f);
                            f175538h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
