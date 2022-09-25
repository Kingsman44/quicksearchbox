package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.bi */
/* compiled from: PG */
public final class C54843bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54843bi f143982c;

    /* renamed from: d */
    private static volatile C63010eb f143983d;

    /* renamed from: a */
    public int f143984a;

    /* renamed from: b */
    public String f143985b = BuildConfig.FLAVOR;

    static {
        C54843bi biVar = new C54843bi();
        f143982c = biVar;
        C62942bv.registerDefaultInstance(C54843bi.class, biVar);
    }

    private C54843bi() {
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
                return newMessageInfo(f143982c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54843bi();
            case 4:
                return new C54842bh();
            case 5:
                return f143982c;
            case 6:
                C63010eb ebVar = f143983d;
                if (ebVar == null) {
                    synchronized (C54843bi.class) {
                        ebVar = f143983d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143982c);
                            f143983d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
