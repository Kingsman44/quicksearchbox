package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.an */
/* compiled from: PG */
public final class C54956an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54956an f144569c;

    /* renamed from: d */
    private static volatile C63010eb f144570d;

    /* renamed from: a */
    public int f144571a;

    /* renamed from: b */
    public String f144572b = BuildConfig.FLAVOR;

    static {
        C54956an anVar = new C54956an();
        f144569c = anVar;
        C62942bv.registerDefaultInstance(C54956an.class, anVar);
    }

    private C54956an() {
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
                return newMessageInfo(f144569c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54956an();
            case 4:
                return new C54955am();
            case 5:
                return f144569c;
            case 6:
                C63010eb ebVar = f144570d;
                if (ebVar == null) {
                    synchronized (C54956an.class) {
                        ebVar = f144570d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144569c);
                            f144570d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
