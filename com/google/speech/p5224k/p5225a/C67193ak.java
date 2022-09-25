package com.google.speech.p5224k.p5225a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.ak */
/* compiled from: PG */
public final class C67193ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67193ak f182639c;

    /* renamed from: d */
    private static volatile C63010eb f182640d;

    /* renamed from: a */
    public int f182641a;

    /* renamed from: b */
    public String f182642b = BuildConfig.FLAVOR;

    static {
        C67193ak akVar = new C67193ak();
        f182639c = akVar;
        C62942bv.registerDefaultInstance(C67193ak.class, akVar);
    }

    private C67193ak() {
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
                return newMessageInfo(f182639c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0003", new Object[]{"a", "b"});
            case 3:
                return new C67193ak();
            case 4:
                return new C67192aj();
            case 5:
                return f182639c;
            case 6:
                C63010eb ebVar = f182640d;
                if (ebVar == null) {
                    synchronized (C67193ak.class) {
                        ebVar = f182640d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182639c);
                            f182640d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
