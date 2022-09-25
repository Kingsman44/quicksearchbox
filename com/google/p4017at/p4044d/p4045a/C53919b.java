package com.google.p4017at.p4044d.p4045a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.at.d.a.b */
/* compiled from: PG */
public final class C53919b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53919b f141476d;

    /* renamed from: e */
    private static volatile C63010eb f141477e;

    /* renamed from: a */
    public C63070h f141478a;

    /* renamed from: b */
    public String f141479b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63070h f141480c;

    static {
        C53919b bVar = new C53919b();
        f141476d = bVar;
        C62942bv.registerDefaultInstance(C53919b.class, bVar);
    }

    private C53919b() {
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
                return newMessageInfo(f141476d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53919b();
            case 4:
                return new C53918a();
            case 5:
                return f141476d;
            case 6:
                C63010eb ebVar = f141477e;
                if (ebVar == null) {
                    synchronized (C53919b.class) {
                        ebVar = f141477e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141476d);
                            f141477e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
