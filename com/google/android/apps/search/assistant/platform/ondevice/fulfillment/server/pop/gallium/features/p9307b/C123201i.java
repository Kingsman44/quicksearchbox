package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9307b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.b.i */
/* compiled from: PG */
public final class C123201i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C123201i f340900d;

    /* renamed from: f */
    private static volatile C63010eb f340901f;

    /* renamed from: a */
    public String f340902a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C52405qn f340903b;

    /* renamed from: c */
    public C63179l f340904c;

    /* renamed from: e */
    private int f340905e;

    static {
        C123201i iVar = new C123201i();
        f340900d = iVar;
        C62942bv.registerDefaultInstance(C123201i.class, iVar);
    }

    private C123201i() {
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
                return newMessageInfo(f340900d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C123201i();
            case 4:
                return new C123200h();
            case 5:
                return f340900d;
            case 6:
                C63010eb ebVar = f340901f;
                if (ebVar == null) {
                    synchronized (C123201i.class) {
                        ebVar = f340901f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f340900d);
                            f340901f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
