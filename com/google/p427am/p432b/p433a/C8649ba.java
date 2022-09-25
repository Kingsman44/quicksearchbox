package com.google.p427am.p432b.p433a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.ba */
/* compiled from: PG */
public final class C8649ba extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C8649ba f29932h;

    /* renamed from: i */
    private static volatile C63010eb f29933i;

    /* renamed from: a */
    public int f29934a;

    /* renamed from: b */
    public String f29935b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f29936c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f29937d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f29938e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f29939f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f29940g;

    static {
        C8649ba baVar = new C8649ba();
        f29932h = baVar;
        C62942bv.registerDefaultInstance(C8649ba.class, baVar);
    }

    private C8649ba() {
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
                return newMessageInfo(f29932h, "\u0000\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0006ለ\u0005\u0007ለ\u0006\nဌ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C8649ba();
            case 4:
                return new C8646ay();
            case 5:
                return f29932h;
            case 6:
                C63010eb ebVar = f29933i;
                if (ebVar == null) {
                    synchronized (C8649ba.class) {
                        ebVar = f29933i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29932h);
                            f29933i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
