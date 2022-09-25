package com.google.android.apps.gsa.shared.p7041h;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.h.b */
/* compiled from: PG */
public final class C89770b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C89770b f242968h;

    /* renamed from: i */
    private static volatile C63010eb f242969i;

    /* renamed from: a */
    public int f242970a;

    /* renamed from: b */
    public long f242971b;

    /* renamed from: c */
    public String f242972c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f242973d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f242974e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f242975f;

    /* renamed from: g */
    public int f242976g;

    static {
        C89770b bVar = new C89770b();
        f242968h = bVar;
        C62942bv.registerDefaultInstance(C89770b.class, bVar);
    }

    private C89770b() {
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
                return newMessageInfo(f242968h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C89770b();
            case 4:
                return new C89769a();
            case 5:
                return f242968h;
            case 6:
                C63010eb ebVar = f242969i;
                if (ebVar == null) {
                    synchronized (C89770b.class) {
                        ebVar = f242969i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242968h);
                            f242969i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
