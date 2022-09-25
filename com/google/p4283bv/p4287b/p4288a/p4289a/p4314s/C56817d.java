package com.google.p4283bv.p4287b.p4288a.p4289a.p4314s;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.s.d */
/* compiled from: PG */
public final class C56817d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56817d f151604b;

    /* renamed from: d */
    private static volatile C63010eb f151605d;

    /* renamed from: a */
    public String f151606a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f151607c;

    static {
        C56817d dVar = new C56817d();
        f151604b = dVar;
        C62942bv.registerDefaultInstance(C56817d.class, dVar);
    }

    private C56817d() {
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
                return newMessageInfo(f151604b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56817d();
            case 4:
                return new C56816c();
            case 5:
                return f151604b;
            case 6:
                C63010eb ebVar = f151605d;
                if (ebVar == null) {
                    synchronized (C56817d.class) {
                        ebVar = f151605d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151604b);
                            f151605d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
