package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.t */
/* compiled from: PG */
public final class C80586t extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C80586t f221205g;

    /* renamed from: h */
    private static volatile C63010eb f221206h;

    /* renamed from: a */
    public String f221207a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f221208b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f221209c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C80584r f221210d;

    /* renamed from: e */
    public int f221211e;

    /* renamed from: f */
    public int f221212f;

    static {
        C80586t tVar = new C80586t();
        f221205g = tVar;
        C62942bv.registerDefaultInstance(C80586t.class, tVar);
    }

    private C80586t() {
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
                return newMessageInfo(f221205g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0004\u0004\u0005Ȉ\u0006\f\u0007Ȉ", new Object[]{"b", "d", "e", "a", C10662f.f35572a, C45240c.f118157a});
            case 3:
                return new C80586t();
            case 4:
                return new C80585s();
            case 5:
                return f221205g;
            case 6:
                C63010eb ebVar = f221206h;
                if (ebVar == null) {
                    synchronized (C80586t.class) {
                        ebVar = f221206h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221205g);
                            f221206h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
