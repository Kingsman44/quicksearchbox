package com.google.protos.p5132q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.q.j */
/* compiled from: PG */
public final class C65867j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65867j f179045d;

    /* renamed from: f */
    private static volatile C63010eb f179046f;

    /* renamed from: a */
    public int f179047a;

    /* renamed from: b */
    public String f179048b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f179049c = 1.0f;

    /* renamed from: e */
    private byte f179050e = 2;

    static {
        C65867j jVar = new C65867j();
        f179045d = jVar;
        C62942bv.registerDefaultInstance(C65867j.class, jVar);
    }

    private C65867j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179050e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179050e = b;
                return null;
            case 2:
                return newMessageInfo(f179045d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65867j();
            case 4:
                return new C65866i();
            case 5:
                return f179045d;
            case 6:
                C63010eb ebVar = f179046f;
                if (ebVar == null) {
                    synchronized (C65867j.class) {
                        ebVar = f179046f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179045d);
                            f179046f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
