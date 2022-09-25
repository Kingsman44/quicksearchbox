package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ft */
/* compiled from: PG */
public final class C55097ft extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55097ft f144980d;

    /* renamed from: e */
    private static volatile C63010eb f144981e;

    /* renamed from: a */
    public int f144982a;

    /* renamed from: b */
    public int f144983b = 1;

    /* renamed from: c */
    public String f144984c = BuildConfig.FLAVOR;

    static {
        C55097ft ftVar = new C55097ft();
        f144980d = ftVar;
        C62942bv.registerDefaultInstance(C55097ft.class, ftVar);
    }

    private C55097ft() {
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
                return newMessageInfo(f144980d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C55095fr.f144979a, C45240c.f118157a});
            case 3:
                return new C55097ft();
            case 4:
                return new C55094fq();
            case 5:
                return f144980d;
            case 6:
                C63010eb ebVar = f144981e;
                if (ebVar == null) {
                    synchronized (C55097ft.class) {
                        ebVar = f144981e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144980d);
                            f144981e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
