package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.hw */
/* compiled from: PG */
public final class C67014hw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67014hw f182165c;

    /* renamed from: d */
    private static volatile C63010eb f182166d;

    /* renamed from: a */
    public int f182167a;

    /* renamed from: b */
    public String f182168b = BuildConfig.FLAVOR;

    static {
        C67014hw hwVar = new C67014hw();
        f182165c = hwVar;
        C62942bv.registerDefaultInstance(C67014hw.class, hwVar);
    }

    private C67014hw() {
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
                return newMessageInfo(f182165c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67014hw();
            case 4:
                return new C67013hv();
            case 5:
                return f182165c;
            case 6:
                C63010eb ebVar = f182166d;
                if (ebVar == null) {
                    synchronized (C67014hw.class) {
                        ebVar = f182166d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182165c);
                            f182166d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
