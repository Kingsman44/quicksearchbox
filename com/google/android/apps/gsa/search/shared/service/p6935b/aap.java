package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aap */
/* compiled from: PG */
public final class aap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aap f237093d;

    /* renamed from: e */
    private static volatile C63010eb f237094e;

    /* renamed from: a */
    public int f237095a;

    /* renamed from: b */
    public boolean f237096b;

    /* renamed from: c */
    public String f237097c = BuildConfig.FLAVOR;

    static {
        aap aap = new aap();
        f237093d = aap;
        C62942bv.registerDefaultInstance(aap.class, aap);
    }

    private aap() {
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
                return newMessageInfo(f237093d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aap();
            case 4:
                return new aao();
            case 5:
                return f237093d;
            case 6:
                C63010eb ebVar = f237094e;
                if (ebVar == null) {
                    synchronized (aap.class) {
                        ebVar = f237094e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237093d);
                            f237094e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
