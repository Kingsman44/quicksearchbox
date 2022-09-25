package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.hw */
/* compiled from: PG */
public final class C49138hw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49138hw f127068d;

    /* renamed from: f */
    private static volatile C63010eb f127069f;

    /* renamed from: a */
    public int f127070a = 0;

    /* renamed from: b */
    public Object f127071b;

    /* renamed from: c */
    public boolean f127072c = true;

    /* renamed from: e */
    private int f127073e;

    static {
        C49138hw hwVar = new C49138hw();
        f127068d = hwVar;
        C62942bv.registerDefaultInstance(C49138hw.class, hwVar);
    }

    private C49138hw() {
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
                return newMessageInfo(f127068d, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ြ\u0000\u0002ဇ\t\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"b", "a", "e", C49133hr.class, C45240c.f118157a, C49137hv.class, C49129hn.class, C49125hj.class, C49131hp.class, C49151u.class, C48985ce.class, C49017dj.class, C49127hl.class});
            case 3:
                return new C49138hw();
            case 4:
                return new C49123hh();
            case 5:
                return f127068d;
            case 6:
                C63010eb ebVar = f127069f;
                if (ebVar == null) {
                    synchronized (C49138hw.class) {
                        ebVar = f127069f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127068d);
                            f127069f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
