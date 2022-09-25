package com.google.p4242bp.p4252d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.d.b */
/* compiled from: PG */
public final class C56180b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56180b f149684c;

    /* renamed from: e */
    private static volatile C63010eb f149685e;

    /* renamed from: a */
    public int f149686a;

    /* renamed from: b */
    public String f149687b;

    /* renamed from: d */
    private byte f149688d = 2;

    static {
        C56180b bVar = new C56180b();
        f149684c = bVar;
        C62942bv.registerDefaultInstance(C56180b.class, bVar);
    }

    private C56180b() {
        C62942bv.emptyProtobufList();
        this.f149687b = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149688d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149688d = b;
                return null;
            case 2:
                return newMessageInfo(f149684c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0003", new Object[]{"a", "b"});
            case 3:
                return new C56180b();
            case 4:
                return new C56179a();
            case 5:
                return f149684c;
            case 6:
                C63010eb ebVar = f149685e;
                if (ebVar == null) {
                    synchronized (C56180b.class) {
                        ebVar = f149685e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149684c);
                            f149685e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
