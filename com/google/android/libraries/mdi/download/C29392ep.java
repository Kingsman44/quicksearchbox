package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.ep */
/* compiled from: PG */
public final class C29392ep extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C29392ep f79679g;

    /* renamed from: h */
    private static volatile C63010eb f79680h;

    /* renamed from: a */
    public int f79681a;

    /* renamed from: b */
    public String f79682b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f79683c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f79684d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f79685e;

    /* renamed from: f */
    public String f79686f = BuildConfig.FLAVOR;

    static {
        C29392ep epVar = new C29392ep();
        f79679g = epVar;
        C62942bv.registerDefaultInstance(C29392ep.class, epVar);
    }

    private C29392ep() {
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
                return newMessageInfo(f79679g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002\u0006ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C10662f.f35572a});
            case 3:
                return new C29392ep();
            case 4:
                return new C29391eo();
            case 5:
                return f79679g;
            case 6:
                C63010eb ebVar = f79680h;
                if (ebVar == null) {
                    synchronized (C29392ep.class) {
                        ebVar = f79680h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79679g);
                            f79680h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
