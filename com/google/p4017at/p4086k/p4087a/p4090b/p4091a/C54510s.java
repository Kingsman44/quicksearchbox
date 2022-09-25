package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.s */
/* compiled from: PG */
public final class C54510s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54510s f143125b;

    /* renamed from: c */
    private static volatile C63010eb f143126c;

    /* renamed from: a */
    public String f143127a = BuildConfig.FLAVOR;

    static {
        C54510s sVar = new C54510s();
        f143125b = sVar;
        C62942bv.registerDefaultInstance(C54510s.class, sVar);
    }

    private C54510s() {
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
                return newMessageInfo(f143125b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C54510s();
            case 4:
                return new C54509r();
            case 5:
                return f143125b;
            case 6:
                C63010eb ebVar = f143126c;
                if (ebVar == null) {
                    synchronized (C54510s.class) {
                        ebVar = f143126c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143125b);
                            f143126c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
