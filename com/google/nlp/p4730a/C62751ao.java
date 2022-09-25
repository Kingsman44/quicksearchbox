package com.google.nlp.p4730a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.ao */
/* compiled from: PG */
public final class C62751ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62751ao f169475d;

    /* renamed from: e */
    private static volatile C63010eb f169476e;

    /* renamed from: a */
    public int f169477a;

    /* renamed from: b */
    public String f169478b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f169479c = BuildConfig.FLAVOR;

    static {
        C62751ao aoVar = new C62751ao();
        f169475d = aoVar;
        C62942bv.registerDefaultInstance(C62751ao.class, aoVar);
    }

    private C62751ao() {
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
                return newMessageInfo(f169475d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62751ao();
            case 4:
                return new C62750an();
            case 5:
                return f169475d;
            case 6:
                C63010eb ebVar = f169476e;
                if (ebVar == null) {
                    synchronized (C62751ao.class) {
                        ebVar = f169476e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169475d);
                            f169476e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
