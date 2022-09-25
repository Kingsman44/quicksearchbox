package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bb */
/* compiled from: PG */
public final class C124459bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C124459bb f343469e;

    /* renamed from: f */
    private static volatile C63010eb f343470f;

    /* renamed from: a */
    public int f343471a;

    /* renamed from: b */
    public int f343472b = 0;

    /* renamed from: c */
    public Object f343473c;

    /* renamed from: d */
    public int f343474d;

    static {
        C124459bb bbVar = new C124459bb();
        f343469e = bbVar;
        C62942bv.registerDefaultInstance(C124459bb.class, bbVar);
    }

    private C124459bb() {
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
                return newMessageInfo(f343469e, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဌ\u0000", new Object[]{C45240c.f118157a, "b", "a", C124443an.class, C124441al.class, "d"});
            case 3:
                return new C124459bb();
            case 4:
                return new C124458ba();
            case 5:
                return f343469e;
            case 6:
                C63010eb ebVar = f343470f;
                if (ebVar == null) {
                    synchronized (C124459bb.class) {
                        ebVar = f343470f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343469e);
                            f343470f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
