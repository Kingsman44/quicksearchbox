package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.dv */
/* compiled from: PG */
public final class C29338dv extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C29338dv f79522g;

    /* renamed from: h */
    private static volatile C63010eb f79523h;

    /* renamed from: a */
    public int f79524a;

    /* renamed from: b */
    public String f79525b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f79526c;

    /* renamed from: d */
    public String f79527d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f79528e;

    /* renamed from: f */
    public C29318dd f79529f;

    static {
        C29338dv dvVar = new C29338dv();
        f79522g = dvVar;
        C62942bv.registerDefaultInstance(C29338dv.class, dvVar);
    }

    private C29338dv() {
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
                return newMessageInfo(f79522g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0005ဌ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C29336dt.f79521a, C10662f.f35572a});
            case 3:
                return new C29338dv();
            case 4:
                return new C29335ds();
            case 5:
                return f79522g;
            case 6:
                C63010eb ebVar = f79523h;
                if (ebVar == null) {
                    synchronized (C29338dv.class) {
                        ebVar = f79523h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79522g);
                            f79523h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
