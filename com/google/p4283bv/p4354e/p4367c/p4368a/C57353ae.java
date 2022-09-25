package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ae */
/* compiled from: PG */
public final class C57353ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57353ae f153220c;

    /* renamed from: e */
    private static volatile C63010eb f153221e;

    /* renamed from: a */
    public String f153222a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f153223b;

    /* renamed from: d */
    private int f153224d;

    static {
        C57353ae aeVar = new C57353ae();
        f153220c = aeVar;
        C62942bv.registerDefaultInstance(C57353ae.class, aeVar);
    }

    private C57353ae() {
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
                return newMessageInfo(f153220c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57353ae();
            case 4:
                return new C57352ad();
            case 5:
                return f153220c;
            case 6:
                C63010eb ebVar = f153221e;
                if (ebVar == null) {
                    synchronized (C57353ae.class) {
                        ebVar = f153221e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153220c);
                            f153221e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
