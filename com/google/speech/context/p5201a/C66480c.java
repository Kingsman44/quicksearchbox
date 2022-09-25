package com.google.speech.context.p5201a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.context.a.c */
/* compiled from: PG */
public final class C66480c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66480c f180768c;

    /* renamed from: e */
    private static volatile C63010eb f180769e;

    /* renamed from: a */
    public String f180770a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public float f180771b;

    /* renamed from: d */
    private int f180772d;

    static {
        C66480c cVar = new C66480c();
        f180768c = cVar;
        C62942bv.registerDefaultInstance(C66480c.class, cVar);
    }

    private C66480c() {
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
                return newMessageInfo(f180768c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C66480c();
            case 4:
                return new C66479b();
            case 5:
                return f180768c;
            case 6:
                C63010eb ebVar = f180769e;
                if (ebVar == null) {
                    synchronized (C66480c.class) {
                        ebVar = f180769e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180768c);
                            f180769e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
