package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.m */
/* compiled from: PG */
public final class C65529m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65529m f178103d;

    /* renamed from: e */
    private static volatile C63010eb f178104e;

    /* renamed from: a */
    public String f178105a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f178106b;

    /* renamed from: c */
    public String f178107c = BuildConfig.FLAVOR;

    static {
        C65529m mVar = new C65529m();
        f178103d = mVar;
        C62942bv.registerDefaultInstance(C65529m.class, mVar);
    }

    private C65529m() {
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
                return newMessageInfo(f178103d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65529m();
            case 4:
                return new C65528l();
            case 5:
                return f178103d;
            case 6:
                C63010eb ebVar = f178104e;
                if (ebVar == null) {
                    synchronized (C65529m.class) {
                        ebVar = f178104e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178103d);
                            f178104e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
