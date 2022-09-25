package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.q */
/* compiled from: PG */
public final class C123528q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C123528q f341341e;

    /* renamed from: g */
    private static volatile C63010eb f341342g;

    /* renamed from: a */
    public String f341343a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C52405qn f341344b;

    /* renamed from: c */
    public C63179l f341345c;

    /* renamed from: d */
    public String f341346d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f341347f;

    static {
        C123528q qVar = new C123528q();
        f341341e = qVar;
        C62942bv.registerDefaultInstance(C123528q.class, qVar);
    }

    private C123528q() {
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
                return newMessageInfo(f341341e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C123528q();
            case 4:
                return new C123527p();
            case 5:
                return f341341e;
            case 6:
                C63010eb ebVar = f341342g;
                if (ebVar == null) {
                    synchronized (C123528q.class) {
                        ebVar = f341342g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341341e);
                            f341342g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
