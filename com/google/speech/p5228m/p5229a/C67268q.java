package com.google.speech.p5228m.p5229a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.a.q */
/* compiled from: PG */
public final class C67268q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67268q f182846c;

    /* renamed from: e */
    private static volatile C63010eb f182847e;

    /* renamed from: a */
    public String f182848a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public float f182849b;

    /* renamed from: d */
    private int f182850d;

    static {
        C67268q qVar = new C67268q();
        f182846c = qVar;
        C62942bv.registerDefaultInstance(C67268q.class, qVar);
    }

    private C67268q() {
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
                return newMessageInfo(f182846c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C67268q();
            case 4:
                return new C67267p();
            case 5:
                return f182846c;
            case 6:
                C63010eb ebVar = f182847e;
                if (ebVar == null) {
                    synchronized (C67268q.class) {
                        ebVar = f182847e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182846c);
                            f182847e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
