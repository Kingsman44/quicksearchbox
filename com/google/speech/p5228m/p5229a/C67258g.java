package com.google.speech.p5228m.p5229a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.a.g */
/* compiled from: PG */
public final class C67258g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67258g f182818c;

    /* renamed from: e */
    private static volatile C63010eb f182819e;

    /* renamed from: a */
    public String f182820a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f182821b;

    /* renamed from: d */
    private int f182822d;

    static {
        C67258g gVar = new C67258g();
        f182818c = gVar;
        C62942bv.registerDefaultInstance(C67258g.class, gVar);
    }

    private C67258g() {
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
                return newMessageInfo(f182818c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C67256e.f182817a});
            case 3:
                return new C67258g();
            case 4:
                return new C67255d();
            case 5:
                return f182818c;
            case 6:
                C63010eb ebVar = f182819e;
                if (ebVar == null) {
                    synchronized (C67258g.class) {
                        ebVar = f182819e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182818c);
                            f182819e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
