package com.google.speech.p5218j.p5220b.p5221a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.j */
/* compiled from: PG */
public final class C66806j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66806j f181670e;

    /* renamed from: f */
    private static volatile C63010eb f181671f;

    /* renamed from: a */
    public int f181672a;

    /* renamed from: b */
    public String f181673b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f181674c;

    /* renamed from: d */
    public int f181675d;

    static {
        C66806j jVar = new C66806j();
        f181670e = jVar;
        C62942bv.registerDefaultInstance(C66806j.class, jVar);
    }

    private C66806j() {
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
                return newMessageInfo(f181670e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C66804h.f181669a});
            case 3:
                return new C66806j();
            case 4:
                return new C66803g();
            case 5:
                return f181670e;
            case 6:
                C63010eb ebVar = f181671f;
                if (ebVar == null) {
                    synchronized (C66806j.class) {
                        ebVar = f181671f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181670e);
                            f181671f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
