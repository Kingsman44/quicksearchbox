package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.e */
/* compiled from: PG */
public final class C65496e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65496e f178050f;

    /* renamed from: g */
    private static volatile C63010eb f178051g;

    /* renamed from: a */
    public int f178052a;

    /* renamed from: b */
    public String f178053b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f178054c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C65495d f178055d;

    /* renamed from: e */
    public int f178056e;

    static {
        C65496e eVar = new C65496e();
        f178050f = eVar;
        C62942bv.registerDefaultInstance(C65496e.class, eVar);
    }

    private C65496e() {
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
                return newMessageInfo(f178050f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C65496e();
            case 4:
                return new C65493b();
            case 5:
                return f178050f;
            case 6:
                C63010eb ebVar = f178051g;
                if (ebVar == null) {
                    synchronized (C65496e.class) {
                        ebVar = f178051g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178050f);
                            f178051g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
