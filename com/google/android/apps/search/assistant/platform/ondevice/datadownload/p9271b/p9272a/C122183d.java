package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.b.a.d */
/* compiled from: PG */
public final class C122183d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C122183d f338870d;

    /* renamed from: e */
    private static volatile C63010eb f338871e;

    /* renamed from: a */
    public String f338872a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f338873b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f338874c = BuildConfig.FLAVOR;

    static {
        C122183d dVar = new C122183d();
        f338870d = dVar;
        C62942bv.registerDefaultInstance(C122183d.class, dVar);
    }

    private C122183d() {
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
                return newMessageInfo(f338870d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C122183d();
            case 4:
                return new C122182c();
            case 5:
                return f338870d;
            case 6:
                C63010eb ebVar = f338871e;
                if (ebVar == null) {
                    synchronized (C122183d.class) {
                        ebVar = f338871e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338870d);
                            f338871e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
