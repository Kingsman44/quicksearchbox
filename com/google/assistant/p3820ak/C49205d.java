package com.google.assistant.p3820ak;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ak.d */
/* compiled from: PG */
public final class C49205d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49205d f127223e;

    /* renamed from: f */
    private static volatile C63010eb f127224f;

    /* renamed from: a */
    public int f127225a;

    /* renamed from: b */
    public String f127226b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f127227c;

    /* renamed from: d */
    public String f127228d;

    static {
        C49205d dVar = new C49205d();
        f127223e = dVar;
        C62942bv.registerDefaultInstance(C49205d.class, dVar);
    }

    private C49205d() {
        emptyProtobufList();
        this.f127228d = BuildConfig.FLAVOR;
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
                return newMessageInfo(f127223e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C49203b.f127222a, "d"});
            case 3:
                return new C49205d();
            case 4:
                return new C49202a();
            case 5:
                return f127223e;
            case 6:
                C63010eb ebVar = f127224f;
                if (ebVar == null) {
                    synchronized (C49205d.class) {
                        ebVar = f127224f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127223e);
                            f127224f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
