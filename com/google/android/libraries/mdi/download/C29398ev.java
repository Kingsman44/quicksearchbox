package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4433bz.p4437b.C57909n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.ev */
/* compiled from: PG */
public final class C29398ev extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C29398ev f79698g;

    /* renamed from: h */
    private static volatile C63010eb f79699h;

    /* renamed from: a */
    public int f79700a;

    /* renamed from: b */
    public String f79701b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f79702c;

    /* renamed from: d */
    public String f79703d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f79704e;

    /* renamed from: f */
    public C57909n f79705f;

    static {
        C29398ev evVar = new C29398ev();
        f79698g = evVar;
        C62942bv.registerDefaultInstance(C29398ev.class, evVar);
    }

    private C29398ev() {
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
                return newMessageInfo(f79698g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C29331do.f79496a, C10662f.f35572a});
            case 3:
                return new C29398ev();
            case 4:
                return new C29397eu();
            case 5:
                return f79698g;
            case 6:
                C63010eb ebVar = f79699h;
                if (ebVar == null) {
                    synchronized (C29398ev.class) {
                        ebVar = f79699h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79698g);
                            f79699h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
