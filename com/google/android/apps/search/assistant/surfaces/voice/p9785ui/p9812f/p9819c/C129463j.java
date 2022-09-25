package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.j */
/* compiled from: PG */
public final class C129463j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129463j f355459c;

    /* renamed from: e */
    private static volatile C63010eb f355460e;

    /* renamed from: a */
    public int f355461a = 0;

    /* renamed from: b */
    public Object f355462b;

    /* renamed from: d */
    private byte f355463d = 2;

    static {
        C129463j jVar = new C129463j();
        f355459c = jVar;
        C62942bv.registerDefaultInstance(C129463j.class, jVar);
    }

    private C129463j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f355463d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f355463d = b;
                return null;
            case 2:
                return newMessageInfo(f355459c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C129460g.class, C129462i.class});
            case 3:
                return new C129463j();
            case 4:
                return new C129456c();
            case 5:
                return f355459c;
            case 6:
                C63010eb ebVar = f355460e;
                if (ebVar == null) {
                    synchronized (C129463j.class) {
                        ebVar = f355460e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355459c);
                            f355460e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
