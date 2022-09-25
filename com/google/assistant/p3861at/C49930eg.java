package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5036r.C65318d;

/* renamed from: com.google.assistant.at.eg */
/* compiled from: PG */
public final class C49930eg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49930eg f129777d;

    /* renamed from: f */
    private static volatile C63010eb f129778f;

    /* renamed from: a */
    public String f129779a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f129780b;

    /* renamed from: c */
    public int f129781c;

    /* renamed from: e */
    private int f129782e;

    static {
        C49930eg egVar = new C49930eg();
        f129777d = egVar;
        C62942bv.registerDefaultInstance(C49930eg.class, egVar);
    }

    private C49930eg() {
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
                return newMessageInfo(f129777d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", C65318d.f176653a, C45240c.f118157a, C49931eh.f129783a});
            case 3:
                return new C49930eg();
            case 4:
                return new C49929ef();
            case 5:
                return f129777d;
            case 6:
                C63010eb ebVar = f129778f;
                if (ebVar == null) {
                    synchronized (C49930eg.class) {
                        ebVar = f129778f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129777d);
                            f129778f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
