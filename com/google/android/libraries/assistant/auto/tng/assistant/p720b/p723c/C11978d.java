package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.c.d */
/* compiled from: PG */
public final class C11978d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C11978d f38470d;

    /* renamed from: f */
    private static volatile C63010eb f38471f;

    /* renamed from: a */
    public int f38472a;

    /* renamed from: b */
    public String f38473b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C11976b f38474c;

    /* renamed from: e */
    private byte f38475e = 2;

    static {
        C11978d dVar = new C11978d();
        f38470d = dVar;
        C62942bv.registerDefaultInstance(C11978d.class, dVar);
    }

    private C11978d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f38475e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f38475e = b;
                return null;
            case 2:
                return newMessageInfo(f38470d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C11978d();
            case 4:
                return new C11977c();
            case 5:
                return f38470d;
            case 6:
                C63010eb ebVar = f38471f;
                if (ebVar == null) {
                    synchronized (C11978d.class) {
                        ebVar = f38471f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38470d);
                            f38471f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
