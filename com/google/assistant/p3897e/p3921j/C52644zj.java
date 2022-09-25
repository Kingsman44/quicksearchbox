package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.zj */
/* compiled from: PG */
public final class C52644zj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52644zj f138224d;

    /* renamed from: e */
    private static volatile C63010eb f138225e;

    /* renamed from: a */
    public int f138226a;

    /* renamed from: b */
    public String f138227b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f138228c;

    static {
        C52644zj zjVar = new C52644zj();
        f138224d = zjVar;
        C62942bv.registerDefaultInstance(C52644zj.class, zjVar);
    }

    private C52644zj() {
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
                return newMessageInfo(f138224d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C52645zk.f138229a});
            case 3:
                return new C52644zj();
            case 4:
                return new C52643zi();
            case 5:
                return f138224d;
            case 6:
                C63010eb ebVar = f138225e;
                if (ebVar == null) {
                    synchronized (C52644zj.class) {
                        ebVar = f138225e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138224d);
                            f138225e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
