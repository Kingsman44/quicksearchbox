package com.google.android.libraries.p590as.p593b.p596b.p602f.p603a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.b.b.f.a.b */
/* compiled from: PG */
public final class C10867b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C10867b f35929c;

    /* renamed from: e */
    private static volatile C63010eb f35930e;

    /* renamed from: a */
    public String f35931a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62964ck f35932b = emptyLongList();

    /* renamed from: d */
    private int f35933d;

    static {
        C10867b bVar = new C10867b();
        f35929c = bVar;
        C62942bv.registerDefaultInstance(C10867b.class, bVar);
    }

    private C10867b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f35929c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002%", new Object[]{"d", "a", "b"});
            case 3:
                return new C10867b();
            case 4:
                return new C10866a();
            case 5:
                return f35929c;
            case 6:
                C63010eb ebVar = f35930e;
                if (ebVar == null) {
                    synchronized (C10867b.class) {
                        ebVar = f35930e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35929c);
                            f35930e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
