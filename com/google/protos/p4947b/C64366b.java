package com.google.protos.p4947b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.b.b */
/* compiled from: PG */
public final class C64366b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64366b f173976a;

    /* renamed from: e */
    private static volatile C63010eb f173977e;

    /* renamed from: b */
    private int f173978b;

    /* renamed from: c */
    private String f173979c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f173980d = 2;

    static {
        C64366b bVar = new C64366b();
        f173976a = bVar;
        C62942bv.registerDefaultInstance(C64366b.class, bVar);
    }

    private C64366b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173980d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173980d = b;
                return null;
            case 2:
                return newMessageInfo(f173976a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C64366b();
            case 4:
                return new C64365a();
            case 5:
                return f173976a;
            case 6:
                C63010eb ebVar = f173977e;
                if (ebVar == null) {
                    synchronized (C64366b.class) {
                        ebVar = f173977e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173976a);
                            f173977e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
