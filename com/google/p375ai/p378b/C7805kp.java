package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.kp */
/* compiled from: PG */
public final class C7805kp extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C7805kp f27284h;

    /* renamed from: i */
    private static volatile C63010eb f27285i;

    /* renamed from: a */
    public int f27286a;

    /* renamed from: b */
    public double f27287b;

    /* renamed from: c */
    public double f27288c;

    /* renamed from: d */
    public String f27289d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f27290e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public double f27291f;

    /* renamed from: g */
    public long f27292g;

    static {
        C7805kp kpVar = new C7805kp();
        f27284h = kpVar;
        C62942bv.registerDefaultInstance(C7805kp.class, kpVar);
    }

    private C7805kp() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f27284h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006က\u0004\u0007ဂ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C7805kp();
            case 4:
                return new C7804ko();
            case 5:
                return f27284h;
            case 6:
                C63010eb ebVar = f27285i;
                if (ebVar == null) {
                    synchronized (C7805kp.class) {
                        ebVar = f27285i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27284h);
                            f27285i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
