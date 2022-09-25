package com.google.protos.p4934ay.p4937b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5195a.C66453h;

/* renamed from: com.google.protos.ay.b.d */
/* compiled from: PG */
public final class C64276d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64276d f173794c;

    /* renamed from: g */
    private static volatile C63010eb f173795g;

    /* renamed from: a */
    public int f173796a;

    /* renamed from: b */
    public String f173797b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private String f173798d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private C66453h f173799e;

    /* renamed from: f */
    private byte f173800f = 2;

    static {
        C64276d dVar = new C64276d();
        f173794c = dVar;
        C62942bv.registerDefaultInstance(C64276d.class, dVar);
    }

    private C64276d() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173800f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173800f = b;
                return null;
            case 2:
                return newMessageInfo(f173794c, "\u0001\u0003\u0000\u0001\u0001\u0012\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔈ\u0001\u0012ᐉ\u0005", new Object[]{"a", "d", "b", "e"});
            case 3:
                return new C64276d();
            case 4:
                return new C64275c();
            case 5:
                return f173794c;
            case 6:
                C63010eb ebVar = f173795g;
                if (ebVar == null) {
                    synchronized (C64276d.class) {
                        ebVar = f173795g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173794c);
                            f173795g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
