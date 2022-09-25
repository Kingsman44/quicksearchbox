package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.b */
/* compiled from: PG */
public final class C128150b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128150b f352549d;

    /* renamed from: e */
    private static volatile C63010eb f352550e;

    /* renamed from: a */
    public int f352551a;

    /* renamed from: b */
    public long f352552b;

    /* renamed from: c */
    public long f352553c;

    static {
        C128150b bVar = new C128150b();
        f352549d = bVar;
        C62942bv.registerDefaultInstance(C128150b.class, bVar);
    }

    private C128150b() {
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
                return newMessageInfo(f352549d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C128150b();
            case 4:
                return new C128126a();
            case 5:
                return f352549d;
            case 6:
                C63010eb ebVar = f352550e;
                if (ebVar == null) {
                    synchronized (C128150b.class) {
                        ebVar = f352550e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352549d);
                            f352550e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
