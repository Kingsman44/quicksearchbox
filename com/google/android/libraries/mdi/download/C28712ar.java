package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.ar */
/* compiled from: PG */
public final class C28712ar extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C28712ar f78008g;

    /* renamed from: h */
    private static volatile C63010eb f78009h;

    /* renamed from: a */
    public int f78010a;

    /* renamed from: b */
    public String f78011b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f78012c;

    /* renamed from: d */
    public String f78013d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f78014e;

    /* renamed from: f */
    public C28698ad f78015f;

    static {
        C28712ar arVar = new C28712ar();
        f78008g = arVar;
        C62942bv.registerDefaultInstance(C28712ar.class, arVar);
    }

    private C28712ar() {
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
                return newMessageInfo(f78008g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0005ဌ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C28710ap.f78007a, C10662f.f35572a});
            case 3:
                return new C28712ar();
            case 4:
                return new C28709ao();
            case 5:
                return f78008g;
            case 6:
                C63010eb ebVar = f78009h;
                if (ebVar == null) {
                    synchronized (C28712ar.class) {
                        ebVar = f78009h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78008g);
                            f78009h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
