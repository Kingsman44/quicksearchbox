package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ey */
/* compiled from: PG */
public final class C66935ey extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66935ey f181937c;

    /* renamed from: e */
    private static volatile C63010eb f181938e;

    /* renamed from: a */
    public int f181939a;

    /* renamed from: b */
    public C66922el f181940b;

    /* renamed from: d */
    private int f181941d;

    static {
        C66935ey eyVar = new C66935ey();
        f181937c = eyVar;
        C62942bv.registerDefaultInstance(C66935ey.class, eyVar);
    }

    private C66935ey() {
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
                return newMessageInfo(f181937c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"d", "a", C66933ew.f181936a, "b"});
            case 3:
                return new C66935ey();
            case 4:
                return new C66932ev();
            case 5:
                return f181937c;
            case 6:
                C63010eb ebVar = f181938e;
                if (ebVar == null) {
                    synchronized (C66935ey.class) {
                        ebVar = f181938e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181937c);
                            f181938e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
