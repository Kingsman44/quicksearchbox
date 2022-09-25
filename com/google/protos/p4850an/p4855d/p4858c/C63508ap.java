package com.google.protos.p4850an.p4855d.p4858c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.d.c.ap */
/* compiled from: PG */
public final class C63508ap extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63508ap f171778b;

    /* renamed from: f */
    private static volatile C63010eb f171779f;

    /* renamed from: a */
    public String f171780a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f171781c;

    /* renamed from: d */
    private C63389bg f171782d;

    /* renamed from: e */
    private byte f171783e = 2;

    static {
        C63508ap apVar = new C63508ap();
        f171778b = apVar;
        C62942bv.registerDefaultInstance(C63508ap.class, apVar);
    }

    private C63508ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171783e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171783e = b;
                return null;
            case 2:
                return newMessageInfo(f171778b, "\u0001\u0002\u0000\u0001\u0001\b\u0002\u0000\u0000\u0001\u0001ဈ\u0000\bᐉ\u0007", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C63508ap();
            case 4:
                return new C63507ao();
            case 5:
                return f171778b;
            case 6:
                C63010eb ebVar = f171779f;
                if (ebVar == null) {
                    synchronized (C63508ap.class) {
                        ebVar = f171779f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171778b);
                            f171779f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
