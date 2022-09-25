package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.evernote.android.state.BuildConfig;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.d */
/* compiled from: PG */
public final class C57089d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57089d f152405c;

    /* renamed from: f */
    private static volatile C63010eb f152406f;

    /* renamed from: a */
    public String f152407a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C57696b f152408b;

    /* renamed from: d */
    private int f152409d;

    /* renamed from: e */
    private byte f152410e = 2;

    static {
        C57089d dVar = new C57089d();
        f152405c = dVar;
        C62942bv.registerDefaultInstance(C57089d.class, dVar);
    }

    private C57089d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152410e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152410e = b;
                return null;
            case 2:
                return newMessageInfo(f152405c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57089d();
            case 4:
                return new C57088c();
            case 5:
                return f152405c;
            case 6:
                C63010eb ebVar = f152406f;
                if (ebVar == null) {
                    synchronized (C57089d.class) {
                        ebVar = f152406f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152405c);
                            f152406f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
