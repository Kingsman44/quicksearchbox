package com.google.android.apps.gsa.assist;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.n */
/* compiled from: PG */
public final class C9424n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9424n f32737d;

    /* renamed from: e */
    private static volatile C63010eb f32738e;

    /* renamed from: a */
    public int f32739a;

    /* renamed from: b */
    public String f32740b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f32741c = C62942bv.emptyProtobufList();

    static {
        C9424n nVar = new C9424n();
        f32737d = nVar;
        C62942bv.registerDefaultInstance(C9424n.class, nVar);
    }

    private C9424n() {
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
                return newMessageInfo(f32737d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9424n();
            case 4:
                return new C9423m();
            case 5:
                return f32737d;
            case 6:
                C63010eb ebVar = f32738e;
                if (ebVar == null) {
                    synchronized (C9424n.class) {
                        ebVar = f32738e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32737d);
                            f32738e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
