package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.ez */
/* compiled from: PG */
public final class C29402ez extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C29402ez f79711h;

    /* renamed from: i */
    private static volatile C63010eb f79712i;

    /* renamed from: a */
    public int f79713a;

    /* renamed from: b */
    public String f79714b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f79715c;

    /* renamed from: d */
    public boolean f79716d;

    /* renamed from: e */
    public long f79717e;

    /* renamed from: f */
    public String f79718f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f79719g;

    static {
        C29402ez ezVar = new C29402ez();
        f79711h = ezVar;
        C62942bv.registerDefaultInstance(C29402ez.class, ezVar);
    }

    private C29402ez() {
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
                return newMessageInfo(f79711h, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဌ\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004\u000bင\u0005", new Object[]{"a", "b", C45240c.f118157a, C29390en.m54309b(), "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C29402ez();
            case 4:
                return new C29401ey();
            case 5:
                return f79711h;
            case 6:
                C63010eb ebVar = f79712i;
                if (ebVar == null) {
                    synchronized (C29402ez.class) {
                        ebVar = f79712i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79711h);
                            f79712i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
