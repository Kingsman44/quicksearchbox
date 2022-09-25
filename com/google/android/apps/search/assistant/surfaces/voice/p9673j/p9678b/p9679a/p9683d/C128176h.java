package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.h */
/* compiled from: PG */
public final class C128176h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128176h f352604d;

    /* renamed from: f */
    private static volatile C63010eb f352605f;

    /* renamed from: a */
    public int f352606a;

    /* renamed from: b */
    public C62971cq f352607b = emptyProtobufList();

    /* renamed from: c */
    public C128182n f352608c;

    /* renamed from: e */
    private byte f352609e = 2;

    static {
        C128176h hVar = new C128176h();
        f352604d = hVar;
        C62942bv.registerDefaultInstance(C128176h.class, hVar);
    }

    private C128176h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f352609e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f352609e = b;
                return null;
            case 2:
                return newMessageInfo(f352604d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"a", "b", C128178j.class, C45240c.f118157a});
            case 3:
                return new C128176h();
            case 4:
                return new C128175g();
            case 5:
                return f352604d;
            case 6:
                C63010eb ebVar = f352605f;
                if (ebVar == null) {
                    synchronized (C128176h.class) {
                        ebVar = f352605f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352604d);
                            f352605f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
