package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.we */
/* compiled from: PG */
public final class C8118we extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8118we f28532g;

    /* renamed from: h */
    private static volatile C63010eb f28533h;

    /* renamed from: a */
    public int f28534a;

    /* renamed from: b */
    public int f28535b = 1;

    /* renamed from: c */
    public String f28536c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f28537d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f28538e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f28539f = BuildConfig.FLAVOR;

    static {
        C8118we weVar = new C8118we();
        f28532g = weVar;
        C62942bv.registerDefaultInstance(C8118we.class, weVar);
    }

    private C8118we() {
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
                return newMessageInfo(f28532g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", C8116wc.f28531a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C8118we();
            case 4:
                return new C8115wb();
            case 5:
                return f28532g;
            case 6:
                C63010eb ebVar = f28533h;
                if (ebVar == null) {
                    synchronized (C8118we.class) {
                        ebVar = f28533h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28532g);
                            f28533h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
