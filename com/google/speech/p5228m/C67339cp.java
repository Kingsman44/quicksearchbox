package com.google.speech.p5228m;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.cp */
/* compiled from: PG */
public final class C67339cp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67339cp f183030c;

    /* renamed from: d */
    private static volatile C63010eb f183031d;

    /* renamed from: a */
    public int f183032a;

    /* renamed from: b */
    public String f183033b = BuildConfig.FLAVOR;

    static {
        C67339cp cpVar = new C67339cp();
        f183030c = cpVar;
        C62942bv.registerDefaultInstance(C67339cp.class, cpVar);
    }

    private C67339cp() {
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
                return newMessageInfo(f183030c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67339cp();
            case 4:
                return new C67338co();
            case 5:
                return f183030c;
            case 6:
                C63010eb ebVar = f183031d;
                if (ebVar == null) {
                    synchronized (C67339cp.class) {
                        ebVar = f183031d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183030c);
                            f183031d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
