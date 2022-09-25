package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.anv */
/* compiled from: PG */
public final class anv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final anv f159412c;

    /* renamed from: d */
    private static volatile C63010eb f159413d;

    /* renamed from: a */
    public int f159414a;

    /* renamed from: b */
    public String f159415b = BuildConfig.FLAVOR;

    static {
        anv anv = new anv();
        f159412c = anv;
        C62942bv.registerDefaultInstance(anv.class, anv);
    }

    private anv() {
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
                return newMessageInfo(f159412c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new anv();
            case 4:
                return new anu();
            case 5:
                return f159412c;
            case 6:
                C63010eb ebVar = f159413d;
                if (ebVar == null) {
                    synchronized (anv.class) {
                        ebVar = f159413d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159412c);
                            f159413d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
