package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ch */
/* compiled from: PG */
public final class C59511ch extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59511ch f157903d;

    /* renamed from: e */
    private static volatile C63010eb f157904e;

    /* renamed from: a */
    public int f157905a;

    /* renamed from: b */
    public String f157906b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f157907c;

    static {
        C59511ch chVar = new C59511ch();
        f157903d = chVar;
        C62942bv.registerDefaultInstance(C59511ch.class, chVar);
    }

    private C59511ch() {
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
                return newMessageInfo(f157903d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59511ch();
            case 4:
                return new C59510cg();
            case 5:
                return f157903d;
            case 6:
                C63010eb ebVar = f157904e;
                if (ebVar == null) {
                    synchronized (C59511ch.class) {
                        ebVar = f157904e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157903d);
                            f157904e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
