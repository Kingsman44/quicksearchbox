package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.cm */
/* compiled from: PG */
public final class C55657cm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55657cm f146855e;

    /* renamed from: f */
    private static volatile C63010eb f146856f;

    /* renamed from: a */
    public int f146857a;

    /* renamed from: b */
    public int f146858b;

    /* renamed from: c */
    public C55678r f146859c;

    /* renamed from: d */
    public String f146860d = BuildConfig.FLAVOR;

    static {
        C55657cm cmVar = new C55657cm();
        f146855e = cmVar;
        C62942bv.registerDefaultInstance(C55657cm.class, cmVar);
    }

    private C55657cm() {
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
                return newMessageInfo(f146855e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C55672l.f146892a, C45240c.f118157a, "d"});
            case 3:
                return new C55657cm();
            case 4:
                return new C55656cl();
            case 5:
                return f146855e;
            case 6:
                C63010eb ebVar = f146856f;
                if (ebVar == null) {
                    synchronized (C55657cm.class) {
                        ebVar = f146856f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146855e);
                            f146856f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
