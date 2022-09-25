package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.lx */
/* compiled from: PG */
public final class C52280lx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52280lx f137230e;

    /* renamed from: f */
    private static volatile C63010eb f137231f;

    /* renamed from: a */
    public int f137232a;

    /* renamed from: b */
    public int f137233b = 0;

    /* renamed from: c */
    public Object f137234c;

    /* renamed from: d */
    public int f137235d;

    static {
        C52280lx lxVar = new C52280lx();
        f137230e = lxVar;
        C62942bv.registerDefaultInstance(C52280lx.class, lxVar);
    }

    private C52280lx() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
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
                return newMessageInfo(f137230e, "\u0001\u0003\u0001\u0001\u0007\f\u0003\u0000\u0000\u0000\u0007ဌ\u0007\tျ\u0000\fျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C52278lv.f137229a});
            case 3:
                return new C52280lx();
            case 4:
                return new C52279lw();
            case 5:
                return f137230e;
            case 6:
                C63010eb ebVar = f137231f;
                if (ebVar == null) {
                    synchronized (C52280lx.class) {
                        ebVar = f137231f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137230e);
                            f137231f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
