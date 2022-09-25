package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.a.a.a.a.b */
/* compiled from: PG */
public final class C65475b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65475b f177978d;

    /* renamed from: e */
    private static volatile C63010eb f177979e;

    /* renamed from: a */
    public C83320io f177980a;

    /* renamed from: b */
    public String f177981b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f177982c = BuildConfig.FLAVOR;

    static {
        C65475b bVar = new C65475b();
        f177978d = bVar;
        C62942bv.registerDefaultInstance(C65475b.class, bVar);
    }

    private C65475b() {
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
                return newMessageInfo(f177978d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65475b();
            case 4:
                return new C65474a();
            case 5:
                return f177978d;
            case 6:
                C63010eb ebVar = f177979e;
                if (ebVar == null) {
                    synchronized (C65475b.class) {
                        ebVar = f177979e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177978d);
                            f177979e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
