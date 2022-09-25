package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.ady;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.m */
/* compiled from: PG */
public final class C129080m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C129080m f354595d;

    /* renamed from: f */
    private static volatile C63010eb f354596f;

    /* renamed from: a */
    public int f354597a;

    /* renamed from: b */
    public ady f354598b;

    /* renamed from: c */
    public String f354599c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f354600e = 2;

    static {
        C129080m mVar = new C129080m();
        f354595d = mVar;
        C62942bv.registerDefaultInstance(C129080m.class, mVar);
    }

    private C129080m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f354600e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f354600e = b;
                return null;
            case 2:
                return newMessageInfo(f354595d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C129080m();
            case 4:
                return new C129079l();
            case 5:
                return f354595d;
            case 6:
                C63010eb ebVar = f354596f;
                if (ebVar == null) {
                    synchronized (C129080m.class) {
                        ebVar = f354596f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f354595d);
                            f354596f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
