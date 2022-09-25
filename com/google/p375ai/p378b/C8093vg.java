package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.vg */
/* compiled from: PG */
public final class C8093vg extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C8093vg f28461c;

    /* renamed from: f */
    private static volatile C63010eb f28462f;

    /* renamed from: a */
    public int f28463a;

    /* renamed from: b */
    public String f28464b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f28465d;

    /* renamed from: e */
    private byte f28466e = 2;

    static {
        C8093vg vgVar = new C8093vg();
        f28461c = vgVar;
        C62942bv.registerDefaultInstance(C8093vg.class, vgVar);
    }

    private C8093vg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28466e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28466e = b;
                return null;
            case 2:
                return newMessageInfo(f28461c, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0007ဈ\u0005", new Object[]{"d", "a", C8110vx.m22950b(), "b"});
            case 3:
                return new C8093vg();
            case 4:
                return new C8092vf();
            case 5:
                return f28461c;
            case 6:
                C63010eb ebVar = f28462f;
                if (ebVar == null) {
                    synchronized (C8093vg.class) {
                        ebVar = f28462f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28461c);
                            f28462f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
