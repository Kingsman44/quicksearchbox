package com.google.p4109av.p4114c.p4115a.p4116a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.av.c.a.a.k */
/* compiled from: PG */
public final class C54618k extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54618k f143390g;

    /* renamed from: h */
    private static volatile C63010eb f143391h;

    /* renamed from: a */
    public int f143392a;

    /* renamed from: b */
    public int f143393b = 0;

    /* renamed from: c */
    public Object f143394c;

    /* renamed from: d */
    public String f143395d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f143396e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f143397f;

    static {
        C54618k kVar = new C54618k();
        f143390g = kVar;
        C62942bv.registerDefaultInstance(C54618k.class, kVar);
    }

    private C54618k() {
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
                return newMessageInfo(f143390g, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0002\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C54609b.class, C54620m.class, C54622o.class});
            case 3:
                return new C54618k();
            case 4:
                return new C54616i();
            case 5:
                return f143390g;
            case 6:
                C63010eb ebVar = f143391h;
                if (ebVar == null) {
                    synchronized (C54618k.class) {
                        ebVar = f143391h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143390g);
                            f143391h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
