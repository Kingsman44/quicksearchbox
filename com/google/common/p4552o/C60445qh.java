package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.qh */
/* compiled from: PG */
public final class C60445qh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60445qh f163576c;

    /* renamed from: d */
    private static volatile C63010eb f163577d;

    /* renamed from: a */
    public int f163578a;

    /* renamed from: b */
    public String f163579b = BuildConfig.FLAVOR;

    static {
        C60445qh qhVar = new C60445qh();
        f163576c = qhVar;
        C62942bv.registerDefaultInstance(C60445qh.class, qhVar);
    }

    private C60445qh() {
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
                return newMessageInfo(f163576c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60445qh();
            case 4:
                return new C60444qg();
            case 5:
                return f163576c;
            case 6:
                C63010eb ebVar = f163577d;
                if (ebVar == null) {
                    synchronized (C60445qh.class) {
                        ebVar = f163577d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163576c);
                            f163577d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
