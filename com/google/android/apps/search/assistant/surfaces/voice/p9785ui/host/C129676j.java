package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.j */
/* compiled from: PG */
public final class C129676j extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C129676j f355890c;

    /* renamed from: e */
    private static volatile C63010eb f355891e;

    /* renamed from: a */
    public int f355892a;

    /* renamed from: b */
    public int f355893b;

    /* renamed from: d */
    private byte f355894d = 2;

    static {
        C129676j jVar = new C129676j();
        f355890c = jVar;
        C62942bv.registerDefaultInstance(C129676j.class, jVar);
    }

    private C129676j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f355894d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f355894d = b;
                return null;
            case 2:
                return newMessageInfo(f355890c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C129662i.m211714b()});
            case 3:
                return new C129676j();
            case 4:
                return new C129660g();
            case 5:
                return f355890c;
            case 6:
                C63010eb ebVar = f355891e;
                if (ebVar == null) {
                    synchronized (C129676j.class) {
                        ebVar = f355891e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355890c);
                            f355891e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
