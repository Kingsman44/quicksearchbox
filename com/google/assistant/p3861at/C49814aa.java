package com.google.assistant.p3861at;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49262ah;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.aa */
/* compiled from: PG */
public final class C49814aa extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49814aa f128669f;

    /* renamed from: h */
    private static volatile C63010eb f128670h;

    /* renamed from: a */
    public boolean f128671a;

    /* renamed from: b */
    public int f128672b;

    /* renamed from: c */
    public C63088z f128673c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f128674d;

    /* renamed from: e */
    public long f128675e;

    /* renamed from: g */
    private int f128676g;

    static {
        C49814aa aaVar = new C49814aa();
        f128669f = aaVar;
        C62942bv.registerDefaultInstance(C49814aa.class, aaVar);
    }

    private C49814aa() {
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
                return newMessageInfo(f128669f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ည\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{C30325g.f82003a, "a", "b", C49262ah.f127341a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C49814aa();
            case 4:
                return new C50490z();
            case 5:
                return f128669f;
            case 6:
                C63010eb ebVar = f128670h;
                if (ebVar == null) {
                    synchronized (C49814aa.class) {
                        ebVar = f128670h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128669f);
                            f128670h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
