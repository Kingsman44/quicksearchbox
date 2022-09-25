package com.google.p4283bv.p4287b.p4288a.p4289a.p4307l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.l.d */
/* compiled from: PG */
public final class C56728d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56728d f151406f;

    /* renamed from: g */
    private static volatile C63010eb f151407g;

    /* renamed from: a */
    public int f151408a;

    /* renamed from: b */
    public long f151409b;

    /* renamed from: c */
    public double f151410c;

    /* renamed from: d */
    public double f151411d;

    /* renamed from: e */
    public float f151412e;

    static {
        C56728d dVar = new C56728d();
        f151406f = dVar;
        C62942bv.registerDefaultInstance(C56728d.class, dVar);
    }

    private C56728d() {
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
                return newMessageInfo(f151406f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002က\u0001\u0003က\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56728d();
            case 4:
                return new C56727c();
            case 5:
                return f151406f;
            case 6:
                C63010eb ebVar = f151407g;
                if (ebVar == null) {
                    synchronized (C56728d.class) {
                        ebVar = f151407g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151406f);
                            f151407g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
