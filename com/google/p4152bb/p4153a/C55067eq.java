package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.eq */
/* compiled from: PG */
public final class C55067eq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55067eq f144865d;

    /* renamed from: e */
    private static volatile C63010eb f144866e;

    /* renamed from: a */
    public int f144867a;

    /* renamed from: b */
    public String f144868b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C55097ft f144869c;

    static {
        C55067eq eqVar = new C55067eq();
        f144865d = eqVar;
        C62942bv.registerDefaultInstance(C55067eq.class, eqVar);
    }

    private C55067eq() {
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
                return newMessageInfo(f144865d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55067eq();
            case 4:
                return new C55066ep();
            case 5:
                return f144865d;
            case 6:
                C63010eb ebVar = f144866e;
                if (ebVar == null) {
                    synchronized (C55067eq.class) {
                        ebVar = f144866e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144865d);
                            f144866e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
