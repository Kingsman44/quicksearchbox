package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.s */
/* compiled from: PG */
public final class C41693s extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C41693s f109053h;

    /* renamed from: i */
    private static volatile C63010eb f109054i;

    /* renamed from: a */
    public int f109055a;

    /* renamed from: b */
    public String f109056b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f109057c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f109058d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f109059e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f109060f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f109061g = BuildConfig.FLAVOR;

    static {
        C41693s sVar = new C41693s();
        f109053h = sVar;
        C62942bv.registerDefaultInstance(C41693s.class, sVar);
    }

    private C41693s() {
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
                return newMessageInfo(f109053h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C41693s();
            case 4:
                return new C41692r();
            case 5:
                return f109053h;
            case 6:
                C63010eb ebVar = f109054i;
                if (ebVar == null) {
                    synchronized (C41693s.class) {
                        ebVar = f109054i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109053h);
                            f109054i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
