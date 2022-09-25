package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gq */
/* compiled from: PG */
public final class C66981gq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66981gq f182064g;

    /* renamed from: h */
    private static volatile C63010eb f182065h;

    /* renamed from: a */
    public int f182066a;

    /* renamed from: b */
    public int f182067b = 0;

    /* renamed from: c */
    public Object f182068c;

    /* renamed from: d */
    public String f182069d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C67131me f182070e;

    /* renamed from: f */
    public C66983gs f182071f;

    static {
        C66981gq gqVar = new C66981gq();
        f182064g = gqVar;
        C62942bv.registerDefaultInstance(C66981gq.class, gqVar);
    }

    private C66981gq() {
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
                return newMessageInfo(f182064g, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ွ\u0000\u0003ဉ\u0005\u0005ျ\u0000\u0006ျ\u0000\tဉ\t", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a});
            case 3:
                return new C66981gq();
            case 4:
                return new C66980gp();
            case 5:
                return f182064g;
            case 6:
                C63010eb ebVar = f182065h;
                if (ebVar == null) {
                    synchronized (C66981gq.class) {
                        ebVar = f182065h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182064g);
                            f182065h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
