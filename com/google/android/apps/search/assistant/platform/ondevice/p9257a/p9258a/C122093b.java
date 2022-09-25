package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.a.b */
/* compiled from: PG */
public final class C122093b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C122093b f338729e;

    /* renamed from: g */
    private static volatile C63010eb f338730g;

    /* renamed from: a */
    public int f338731a;

    /* renamed from: b */
    public String f338732b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f338733c;

    /* renamed from: d */
    public C122099h f338734d;

    /* renamed from: f */
    private byte f338735f = 2;

    static {
        C122093b bVar = new C122093b();
        f338729e = bVar;
        C62942bv.registerDefaultInstance(C122093b.class, bVar);
    }

    private C122093b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f338735f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f338735f = b;
                return null;
            case 2:
                return newMessageInfo(f338729e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0002\u0003င\u0001", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C122093b();
            case 4:
                return new C122092a();
            case 5:
                return f338729e;
            case 6:
                C63010eb ebVar = f338730g;
                if (ebVar == null) {
                    synchronized (C122093b.class) {
                        ebVar = f338730g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338729e);
                            f338730g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
