package com.google.protos.p4850an.p4855d.p4858c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.c.j */
/* compiled from: PG */
public final class C63537j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63537j f171852e;

    /* renamed from: g */
    private static volatile C63010eb f171853g;

    /* renamed from: a */
    public String f171854a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f171855b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f171856c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f171857d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f171858f;

    static {
        C63537j jVar = new C63537j();
        f171852e = jVar;
        C62942bv.registerDefaultInstance(C63537j.class, jVar);
    }

    private C63537j() {
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
                return newMessageInfo(f171852e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63537j();
            case 4:
                return new C63536i();
            case 5:
                return f171852e;
            case 6:
                C63010eb ebVar = f171853g;
                if (ebVar == null) {
                    synchronized (C63537j.class) {
                        ebVar = f171853g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171852e);
                            f171853g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
