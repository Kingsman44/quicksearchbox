package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.b */
/* compiled from: PG */
public final class C16353b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16353b f48133d;

    /* renamed from: g */
    private static volatile C63010eb f48134g;

    /* renamed from: a */
    public String f48135a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f48136b;

    /* renamed from: c */
    public C16333ag f48137c;

    /* renamed from: e */
    private int f48138e;

    /* renamed from: f */
    private byte f48139f = 2;

    static {
        C16353b bVar = new C16353b();
        f48133d = bVar;
        C62942bv.registerDefaultInstance(C16353b.class, bVar);
    }

    private C16353b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48139f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48139f = b;
                return null;
            case 2:
                return newMessageInfo(f48133d, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0005င\u0004\u0006ᐉ\u0005", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C16353b();
            case 4:
                return new C16326a();
            case 5:
                return f48133d;
            case 6:
                C63010eb ebVar = f48134g;
                if (ebVar == null) {
                    synchronized (C16353b.class) {
                        ebVar = f48134g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48133d);
                            f48134g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
