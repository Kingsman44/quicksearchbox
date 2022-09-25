package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.aw */
/* compiled from: PG */
public final class C66782aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66782aw f181618c;

    /* renamed from: d */
    private static volatile C63010eb f181619d;

    /* renamed from: a */
    public int f181620a;

    /* renamed from: b */
    public String f181621b = BuildConfig.FLAVOR;

    static {
        C66782aw awVar = new C66782aw();
        f181618c = awVar;
        C62942bv.registerDefaultInstance(C66782aw.class, awVar);
    }

    private C66782aw() {
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
                return newMessageInfo(f181618c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66782aw();
            case 4:
                return new C66781av();
            case 5:
                return f181618c;
            case 6:
                C63010eb ebVar = f181619d;
                if (ebVar == null) {
                    synchronized (C66782aw.class) {
                        ebVar = f181619d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181618c);
                            f181619d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
