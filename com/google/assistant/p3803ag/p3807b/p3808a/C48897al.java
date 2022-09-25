package com.google.assistant.p3803ag.p3807b.p3808a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.al */
/* compiled from: PG */
public final class C48897al extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48897al f126526e;

    /* renamed from: f */
    private static volatile C63010eb f126527f;

    /* renamed from: a */
    public int f126528a;

    /* renamed from: b */
    public int f126529b = 0;

    /* renamed from: c */
    public Object f126530c;

    /* renamed from: d */
    public String f126531d = BuildConfig.FLAVOR;

    static {
        C48897al alVar = new C48897al();
        f126526e = alVar;
        C62942bv.registerDefaultInstance(C48897al.class, alVar);
    }

    private C48897al() {
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
                return newMessageInfo(f126526e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ျ\u0000\u0005ဈ\u0004", new Object[]{C45240c.f118157a, "b", "a", C48896ak.class, C48896ak.class, C48897al.class, "d"});
            case 3:
                return new C48897al();
            case 4:
                return new C48893ah();
            case 5:
                return f126526e;
            case 6:
                C63010eb ebVar = f126527f;
                if (ebVar == null) {
                    synchronized (C48897al.class) {
                        ebVar = f126527f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126526e);
                            f126527f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
