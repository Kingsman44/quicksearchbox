package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.b */
/* compiled from: PG */
public final class C128170b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128170b f352587d;

    /* renamed from: f */
    private static volatile C63010eb f352588f;

    /* renamed from: a */
    public int f352589a;

    /* renamed from: b */
    public C128178j f352590b;

    /* renamed from: c */
    public C128172d f352591c;

    /* renamed from: e */
    private byte f352592e = 2;

    static {
        C128170b bVar = new C128170b();
        f352587d = bVar;
        C62942bv.registerDefaultInstance(C128170b.class, bVar);
    }

    private C128170b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f352592e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f352592e = b;
                return null;
            case 2:
                return newMessageInfo(f352587d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C128170b();
            case 4:
                return new C128169a();
            case 5:
                return f352587d;
            case 6:
                C63010eb ebVar = f352588f;
                if (ebVar == null) {
                    synchronized (C128170b.class) {
                        ebVar = f352588f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352587d);
                            f352588f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
