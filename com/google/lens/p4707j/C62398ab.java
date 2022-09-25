package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ab */
/* compiled from: PG */
public final class C62398ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62398ab f168440c;

    /* renamed from: e */
    private static volatile C63010eb f168441e;

    /* renamed from: a */
    public int f168442a;

    /* renamed from: b */
    public String f168443b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f168444d;

    static {
        C62398ab abVar = new C62398ab();
        f168440c = abVar;
        C62942bv.registerDefaultInstance(C62398ab.class, abVar);
    }

    private C62398ab() {
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
                return newMessageInfo(f168440c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C56306df.m87965b(), "b"});
            case 3:
                return new C62398ab();
            case 4:
                return new C62397aa();
            case 5:
                return f168440c;
            case 6:
                C63010eb ebVar = f168441e;
                if (ebVar == null) {
                    synchronized (C62398ab.class) {
                        ebVar = f168441e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168440c);
                            f168441e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
