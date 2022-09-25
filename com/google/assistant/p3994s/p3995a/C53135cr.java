package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.cr */
/* compiled from: PG */
public final class C53135cr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53135cr f139264d;

    /* renamed from: e */
    private static volatile C63010eb f139265e;

    /* renamed from: a */
    public int f139266a;

    /* renamed from: b */
    public int f139267b;

    /* renamed from: c */
    public String f139268c = BuildConfig.FLAVOR;

    static {
        C53135cr crVar = new C53135cr();
        f139264d = crVar;
        C62942bv.registerDefaultInstance(C53135cr.class, crVar);
    }

    private C53135cr() {
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
                return newMessageInfo(f139264d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C53306j.m86810b(), C45240c.f118157a});
            case 3:
                return new C53135cr();
            case 4:
                return new C53134cq();
            case 5:
                return f139264d;
            case 6:
                C63010eb ebVar = f139265e;
                if (ebVar == null) {
                    synchronized (C53135cr.class) {
                        ebVar = f139265e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139264d);
                            f139265e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
