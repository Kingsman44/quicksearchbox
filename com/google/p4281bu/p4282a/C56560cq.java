package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.cq */
/* compiled from: PG */
public final class C56560cq extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56560cq f151021f;

    /* renamed from: g */
    private static volatile C63010eb f151022g;

    /* renamed from: a */
    public String f151023a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f151024b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151025c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151026d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f151027e = BuildConfig.FLAVOR;

    static {
        C56560cq cqVar = new C56560cq();
        f151021f = cqVar;
        C62942bv.registerDefaultInstance(C56560cq.class, cqVar);
    }

    private C56560cq() {
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
                return newMessageInfo(f151021f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56560cq();
            case 4:
                return new C56559cp();
            case 5:
                return f151021f;
            case 6:
                C63010eb ebVar = f151022g;
                if (ebVar == null) {
                    synchronized (C56560cq.class) {
                        ebVar = f151022g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151021f);
                            f151022g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
