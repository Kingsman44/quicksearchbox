package com.google.assistant.p3863av.p3875f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.f.b */
/* compiled from: PG */
public final class C50569b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50569b f131604b;

    /* renamed from: d */
    private static volatile C63010eb f131605d;

    /* renamed from: a */
    public C50578k f131606a;

    /* renamed from: c */
    private int f131607c;

    static {
        C50569b bVar = new C50569b();
        f131604b = bVar;
        C62942bv.registerDefaultInstance(C50569b.class, bVar);
    }

    private C50569b() {
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
                return newMessageInfo(f131604b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50569b();
            case 4:
                return new C50568a();
            case 5:
                return f131604b;
            case 6:
                C63010eb ebVar = f131605d;
                if (ebVar == null) {
                    synchronized (C50569b.class) {
                        ebVar = f131605d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131604b);
                            f131605d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
