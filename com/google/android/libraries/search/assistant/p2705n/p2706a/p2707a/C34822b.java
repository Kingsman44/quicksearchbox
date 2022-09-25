package com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.n.a.a.b */
/* compiled from: PG */
public final class C34822b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C34822b f92358d;

    /* renamed from: f */
    private static volatile C63010eb f92359f;

    /* renamed from: a */
    public int f92360a;

    /* renamed from: b */
    public String f92361b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C34834b f92362c;

    /* renamed from: e */
    private byte f92363e = 2;

    static {
        C34822b bVar = new C34822b();
        f92358d = bVar;
        C62942bv.registerDefaultInstance(C34822b.class, bVar);
    }

    private C34822b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f92363e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f92363e = b;
                return null;
            case 2:
                return newMessageInfo(f92358d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C34822b();
            case 4:
                return new C34821a();
            case 5:
                return f92358d;
            case 6:
                C63010eb ebVar = f92359f;
                if (ebVar == null) {
                    synchronized (C34822b.class) {
                        ebVar = f92359f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92358d);
                            f92359f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
