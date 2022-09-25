package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.g */
/* compiled from: PG */
public final class C129460g extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C129460g f355452c;

    /* renamed from: e */
    private static volatile C63010eb f355453e;

    /* renamed from: a */
    public int f355454a;

    /* renamed from: b */
    public int f355455b = 2;

    /* renamed from: d */
    private byte f355456d = 2;

    static {
        C129460g gVar = new C129460g();
        f355452c = gVar;
        C62942bv.registerDefaultInstance(C129460g.class, gVar);
    }

    private C129460g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f355456d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f355456d = b;
                return null;
            case 2:
                return newMessageInfo(f355452c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C129459f.m211359b()});
            case 3:
                return new C129460g();
            case 4:
                return new C129457d();
            case 5:
                return f355452c;
            case 6:
                C63010eb ebVar = f355453e;
                if (ebVar == null) {
                    synchronized (C129460g.class) {
                        ebVar = f355453e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355452c);
                            f355453e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
