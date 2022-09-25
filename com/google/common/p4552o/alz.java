package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.alz */
/* compiled from: PG */
public final class alz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final alz f159118c;

    /* renamed from: d */
    private static volatile C63010eb f159119d;

    /* renamed from: a */
    public int f159120a;

    /* renamed from: b */
    public String f159121b = BuildConfig.FLAVOR;

    static {
        alz alz = new alz();
        f159118c = alz;
        C62942bv.registerDefaultInstance(alz.class, alz);
    }

    private alz() {
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
                return newMessageInfo(f159118c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new alz();
            case 4:
                return new aly();
            case 5:
                return f159118c;
            case 6:
                C63010eb ebVar = f159119d;
                if (ebVar == null) {
                    synchronized (alz.class) {
                        ebVar = f159119d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159118c);
                            f159119d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
