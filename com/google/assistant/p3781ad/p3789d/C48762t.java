package com.google.assistant.p3781ad.p3789d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.t */
/* compiled from: PG */
public final class C48762t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48762t f126164e;

    /* renamed from: g */
    private static volatile C63010eb f126165g;

    /* renamed from: a */
    public int f126166a;

    /* renamed from: b */
    public String f126167b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f126168c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f126169d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f126170f;

    static {
        C48762t tVar = new C48762t();
        f126164e = tVar;
        C62942bv.registerDefaultInstance(C48762t.class, tVar);
    }

    private C48762t() {
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
                return newMessageInfo(f126164e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{C10662f.f35572a, "a", C48760r.f126163a, "b", C45240c.f118157a, "d"});
            case 3:
                return new C48762t();
            case 4:
                return new C48759q();
            case 5:
                return f126164e;
            case 6:
                C63010eb ebVar = f126165g;
                if (ebVar == null) {
                    synchronized (C48762t.class) {
                        ebVar = f126165g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126164e);
                            f126165g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
