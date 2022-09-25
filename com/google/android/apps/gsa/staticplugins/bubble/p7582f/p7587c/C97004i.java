package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.c.i */
/* compiled from: PG */
public final class C97004i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C97004i f271084d;

    /* renamed from: g */
    private static volatile C63010eb f271085g;

    /* renamed from: a */
    public String f271086a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C57438di f271087b;

    /* renamed from: c */
    public int f271088c;

    /* renamed from: e */
    private int f271089e;

    /* renamed from: f */
    private byte f271090f = 2;

    static {
        C97004i iVar = new C97004i();
        f271084d = iVar;
        C62942bv.registerDefaultInstance(C97004i.class, iVar);
    }

    private C97004i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f271090f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f271090f = b;
                return null;
            case 2:
                return newMessageInfo(f271084d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a, C97002g.f271083a});
            case 3:
                return new C97004i();
            case 4:
                return new C97001f();
            case 5:
                return f271084d;
            case 6:
                C63010eb ebVar = f271085g;
                if (ebVar == null) {
                    synchronized (C97004i.class) {
                        ebVar = f271085g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271084d);
                            f271085g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
