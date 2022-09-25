package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.b */
/* compiled from: PG */
public final class C80112b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80112b f219825d;

    /* renamed from: e */
    private static volatile C63010eb f219826e;

    /* renamed from: a */
    public int f219827a;

    /* renamed from: b */
    public String f219828b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f219829c = BuildConfig.FLAVOR;

    static {
        C80112b bVar = new C80112b();
        f219825d = bVar;
        C62942bv.registerDefaultInstance(C80112b.class, bVar);
    }

    private C80112b() {
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
                return newMessageInfo(f219825d, "\u0001\u0002\u0000\u0001\u0002\f\u0002\u0000\u0000\u0000\u0002ဈ\u0000\fဈ\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80112b();
            case 4:
                return new C80081a();
            case 5:
                return f219825d;
            case 6:
                C63010eb ebVar = f219826e;
                if (ebVar == null) {
                    synchronized (C80112b.class) {
                        ebVar = f219826e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219825d);
                            f219826e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
