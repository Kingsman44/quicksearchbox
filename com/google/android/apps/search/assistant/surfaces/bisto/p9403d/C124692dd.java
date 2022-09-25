package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.dd */
/* compiled from: PG */
public final class C124692dd extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C124692dd f343996g;

    /* renamed from: h */
    private static volatile C63010eb f343997h;

    /* renamed from: a */
    public int f343998a;

    /* renamed from: b */
    public String f343999b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f344000c;

    /* renamed from: d */
    public String f344001d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63088z f344002e = C63088z.f170246b;

    /* renamed from: f */
    public boolean f344003f;

    static {
        C124692dd ddVar = new C124692dd();
        f343996g = ddVar;
        C62942bv.registerDefaultInstance(C124692dd.class, ddVar);
    }

    private C124692dd() {
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
                return newMessageInfo(f343996g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C124692dd();
            case 4:
                return new C124691dc();
            case 5:
                return f343996g;
            case 6:
                C63010eb ebVar = f343997h;
                if (ebVar == null) {
                    synchronized (C124692dd.class) {
                        ebVar = f343997h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343996g);
                            f343997h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
