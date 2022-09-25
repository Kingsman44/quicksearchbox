package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.y */
/* compiled from: PG */
public final class C53469y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53469y f140323e;

    /* renamed from: g */
    private static volatile C63010eb f140324g;

    /* renamed from: a */
    public String f140325a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f140326b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f140327c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f140328d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f140329f;

    static {
        C53469y yVar = new C53469y();
        f140323e = yVar;
        C62942bv.registerDefaultInstance(C53469y.class, yVar);
    }

    private C53469y() {
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
                return newMessageInfo(f140323e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53469y();
            case 4:
                return new C53468x();
            case 5:
                return f140323e;
            case 6:
                C63010eb ebVar = f140324g;
                if (ebVar == null) {
                    synchronized (C53469y.class) {
                        ebVar = f140324g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140323e);
                            f140324g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
