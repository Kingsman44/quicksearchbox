package com.google.p4653i.p4654a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.am */
/* compiled from: PG */
public final class C61672am extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C61672am f166603f;

    /* renamed from: g */
    private static volatile C63010eb f166604g;

    /* renamed from: a */
    public int f166605a;

    /* renamed from: b */
    public C62961ch f166606b = emptyIntList();

    /* renamed from: c */
    public int f166607c = 1;

    /* renamed from: d */
    public int f166608d;

    /* renamed from: e */
    public boolean f166609e;

    static {
        C61672am amVar = new C61672am();
        f166603f = amVar;
        C62942bv.registerDefaultInstance(C61672am.class, amVar);
    }

    private C61672am() {
    }

    /* renamed from: a */
    public final void mo58168a() {
        C62961ch chVar = this.f166606b;
        if (!chVar.mo58948c()) {
            this.f166606b = C62942bv.mutableCopy(chVar);
        }
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
                return newMessageInfo(f166603f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0016\u0003ဌ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, C61677ar.f166624a, "d", "e"});
            case 3:
                return new C61672am();
            case 4:
                return new C61671al();
            case 5:
                return f166603f;
            case 6:
                C63010eb ebVar = f166604g;
                if (ebVar == null) {
                    synchronized (C61672am.class) {
                        ebVar = f166604g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166603f);
                            f166604g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
