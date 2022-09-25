package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.a.d */
/* compiled from: PG */
public final class C122095d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C122095d f338736e;

    /* renamed from: g */
    private static volatile C63010eb f338737g;

    /* renamed from: a */
    public int f338738a;

    /* renamed from: b */
    public int f338739b = 0;

    /* renamed from: c */
    public Object f338740c;

    /* renamed from: d */
    public String f338741d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f338742f = 2;

    static {
        C122095d dVar = new C122095d();
        f338736e = dVar;
        C62942bv.registerDefaultInstance(C122095d.class, dVar);
    }

    private C122095d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f338742f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f338742f = b;
                return null;
            case 2:
                return newMessageInfo(f338736e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐼ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C122101j.class, C122103l.class});
            case 3:
                return new C122095d();
            case 4:
                return new C122094c();
            case 5:
                return f338736e;
            case 6:
                C63010eb ebVar = f338737g;
                if (ebVar == null) {
                    synchronized (C122095d.class) {
                        ebVar = f338737g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338736e);
                            f338737g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
