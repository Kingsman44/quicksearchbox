package com.google.p395al.p408c.p414c.p415a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.a.f */
/* compiled from: PG */
public final class C8456f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8456f f29367d;

    /* renamed from: f */
    private static volatile C63010eb f29368f;

    /* renamed from: a */
    public C62995dn f29369a = C62995dn.f170057a;

    /* renamed from: b */
    public int f29370b;

    /* renamed from: c */
    public String f29371c = "7038ddc8-30f2-11e6-b0ac-40a8f03d3f15";

    /* renamed from: e */
    private int f29372e;

    static {
        C8456f fVar = new C8456f();
        f29367d = fVar;
        C62942bv.registerDefaultInstance(C8456f.class, fVar);
    }

    private C8456f() {
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
                return newMessageInfo(f29367d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0001\u0000\u0000\u00012\u0004င\u0001\u0005ဈ\u0002", new Object[]{"e", "a", C8455e.f29366a, "b", C45240c.f118157a});
            case 3:
                return new C8456f();
            case 4:
                return new C8454d();
            case 5:
                return f29367d;
            case 6:
                C63010eb ebVar = f29368f;
                if (ebVar == null) {
                    synchronized (C8456f.class) {
                        ebVar = f29368f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29367d);
                            f29368f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
