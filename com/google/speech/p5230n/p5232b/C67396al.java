package com.google.speech.p5230n.p5232b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.al */
/* compiled from: PG */
public final class C67396al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67396al f183177c;

    /* renamed from: d */
    private static volatile C63010eb f183178d;

    /* renamed from: a */
    public int f183179a;

    /* renamed from: b */
    public String f183180b = BuildConfig.FLAVOR;

    static {
        C67396al alVar = new C67396al();
        f183177c = alVar;
        C62942bv.registerDefaultInstance(C67396al.class, alVar);
    }

    private C67396al() {
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
                return newMessageInfo(f183177c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67396al();
            case 4:
                return new C67395ak();
            case 5:
                return f183177c;
            case 6:
                C63010eb ebVar = f183178d;
                if (ebVar == null) {
                    synchronized (C67396al.class) {
                        ebVar = f183178d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183177c);
                            f183178d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
