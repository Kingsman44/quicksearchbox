package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bt */
/* compiled from: PG */
public final class C64486bt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64486bt f174906c;

    /* renamed from: d */
    private static volatile C63010eb f174907d;

    /* renamed from: a */
    public C64485bs f174908a;

    /* renamed from: b */
    public String f174909b = BuildConfig.FLAVOR;

    static {
        C64486bt btVar = new C64486bt();
        f174906c = btVar;
        C62942bv.registerDefaultInstance(C64486bt.class, btVar);
    }

    private C64486bt() {
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
                return newMessageInfo(f174906c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C64486bt();
            case 4:
                return new C64483bq();
            case 5:
                return f174906c;
            case 6:
                C63010eb ebVar = f174907d;
                if (ebVar == null) {
                    synchronized (C64486bt.class) {
                        ebVar = f174907d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174906c);
                            f174907d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
