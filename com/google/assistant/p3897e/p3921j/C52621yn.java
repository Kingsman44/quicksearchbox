package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yn */
/* compiled from: PG */
public final class C52621yn extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52621yn f138154g;

    /* renamed from: h */
    private static volatile C63010eb f138155h;

    /* renamed from: a */
    public int f138156a;

    /* renamed from: b */
    public C52625yr f138157b;

    /* renamed from: c */
    public String f138158c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f138159d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f138160e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f138161f = BuildConfig.FLAVOR;

    static {
        C52621yn ynVar = new C52621yn();
        f138154g = ynVar;
        C62942bv.registerDefaultInstance(C52621yn.class, ynVar);
    }

    private C52621yn() {
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
                return newMessageInfo(f138154g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C52621yn();
            case 4:
                return new C52620ym();
            case 5:
                return f138154g;
            case 6:
                C63010eb ebVar = f138155h;
                if (ebVar == null) {
                    synchronized (C52621yn.class) {
                        ebVar = f138155h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138154g);
                            f138155h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
