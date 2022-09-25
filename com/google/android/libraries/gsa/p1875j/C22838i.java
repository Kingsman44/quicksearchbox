package com.google.android.libraries.gsa.p1875j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.j.i */
/* compiled from: PG */
public final class C22838i extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C22838i f62869h;

    /* renamed from: i */
    private static volatile C63010eb f62870i;

    /* renamed from: a */
    public int f62871a;

    /* renamed from: b */
    public String f62872b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f62873c;

    /* renamed from: d */
    public String f62874d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f62875e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f62876f;

    /* renamed from: g */
    public int f62877g;

    static {
        C22838i iVar = new C22838i();
        f62869h = iVar;
        C62942bv.registerDefaultInstance(C22838i.class, iVar);
    }

    private C22838i() {
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
                return newMessageInfo(f62869h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဈ\u0000\u0003င\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006င\u0004\u0007င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C22838i();
            case 4:
                return new C22837h();
            case 5:
                return f62869h;
            case 6:
                C63010eb ebVar = f62870i;
                if (ebVar == null) {
                    synchronized (C22838i.class) {
                        ebVar = f62870i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62869h);
                            f62870i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
