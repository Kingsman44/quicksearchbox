package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.alv */
/* compiled from: PG */
public final class alv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final alv f159107c;

    /* renamed from: d */
    private static volatile C63010eb f159108d;

    /* renamed from: a */
    public int f159109a;

    /* renamed from: b */
    public String f159110b = BuildConfig.FLAVOR;

    static {
        alv alv = new alv();
        f159107c = alv;
        C62942bv.registerDefaultInstance(alv.class, alv);
    }

    private alv() {
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
                return newMessageInfo(f159107c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new alv();
            case 4:
                return new alu();
            case 5:
                return f159107c;
            case 6:
                C63010eb ebVar = f159108d;
                if (ebVar == null) {
                    synchronized (alv.class) {
                        ebVar = f159108d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159107c);
                            f159108d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
