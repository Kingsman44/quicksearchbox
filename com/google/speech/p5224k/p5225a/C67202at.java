package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.at */
/* compiled from: PG */
public final class C67202at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67202at f182655c;

    /* renamed from: d */
    private static volatile C63010eb f182656d;

    /* renamed from: a */
    public int f182657a;

    /* renamed from: b */
    public String f182658b = BuildConfig.FLAVOR;

    static {
        C67202at atVar = new C67202at();
        f182655c = atVar;
        C62942bv.registerDefaultInstance(C67202at.class, atVar);
    }

    private C67202at() {
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
                return newMessageInfo(f182655c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67202at();
            case 4:
                return new C67201as();
            case 5:
                return f182655c;
            case 6:
                C63010eb ebVar = f182656d;
                if (ebVar == null) {
                    synchronized (C67202at.class) {
                        ebVar = f182656d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182655c);
                            f182656d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
