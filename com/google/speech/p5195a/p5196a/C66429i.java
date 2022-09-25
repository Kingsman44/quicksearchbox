package com.google.speech.p5195a.p5196a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.a.i */
/* compiled from: PG */
public final class C66429i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66429i f180626d;

    /* renamed from: e */
    private static volatile C63010eb f180627e;

    /* renamed from: a */
    public int f180628a;

    /* renamed from: b */
    public String f180629b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f180630c = 1.0f;

    static {
        C66429i iVar = new C66429i();
        f180626d = iVar;
        C62942bv.registerDefaultInstance(C66429i.class, iVar);
    }

    private C66429i() {
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
                return newMessageInfo(f180626d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66429i();
            case 4:
                return new C66428h();
            case 5:
                return f180626d;
            case 6:
                C63010eb ebVar = f180627e;
                if (ebVar == null) {
                    synchronized (C66429i.class) {
                        ebVar = f180627e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180626d);
                            f180627e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
