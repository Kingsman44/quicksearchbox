package com.google.protos.p4985f.p4986a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.n */
/* compiled from: PG */
public final class C64704n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64704n f175392c;

    /* renamed from: d */
    private static volatile C63010eb f175393d;

    /* renamed from: a */
    public int f175394a;

    /* renamed from: b */
    public String f175395b = BuildConfig.FLAVOR;

    static {
        C64704n nVar = new C64704n();
        f175392c = nVar;
        C62942bv.registerDefaultInstance(C64704n.class, nVar);
    }

    private C64704n() {
        emptyIntList();
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
                return newMessageInfo(f175392c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64704n();
            case 4:
                return new C64703m();
            case 5:
                return f175392c;
            case 6:
                C63010eb ebVar = f175393d;
                if (ebVar == null) {
                    synchronized (C64704n.class) {
                        ebVar = f175393d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175392c);
                            f175393d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
