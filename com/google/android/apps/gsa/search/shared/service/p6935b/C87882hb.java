package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hb */
/* compiled from: PG */
public final class C87882hb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87882hb f237739e;

    /* renamed from: f */
    private static volatile C63010eb f237740f;

    /* renamed from: a */
    public int f237741a;

    /* renamed from: b */
    public String f237742b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f237743c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f237744d;

    static {
        C87882hb hbVar = new C87882hb();
        f237739e = hbVar;
        C62942bv.registerDefaultInstance(C87882hb.class, hbVar);
    }

    private C87882hb() {
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
                return newMessageInfo(f237739e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C87882hb();
            case 4:
                return new C87881ha();
            case 5:
                return f237739e;
            case 6:
                C63010eb ebVar = f237740f;
                if (ebVar == null) {
                    synchronized (C87882hb.class) {
                        ebVar = f237740f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237739e);
                            f237740f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
