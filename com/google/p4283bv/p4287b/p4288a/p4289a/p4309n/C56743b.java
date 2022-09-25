package com.google.p4283bv.p4287b.p4288a.p4289a.p4309n;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.n.b */
/* compiled from: PG */
public final class C56743b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56743b f151439c;

    /* renamed from: d */
    private static volatile C63010eb f151440d;

    /* renamed from: a */
    public int f151441a;

    /* renamed from: b */
    public String f151442b = BuildConfig.FLAVOR;

    static {
        C56743b bVar = new C56743b();
        f151439c = bVar;
        C62942bv.registerDefaultInstance(C56743b.class, bVar);
    }

    private C56743b() {
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
                return newMessageInfo(f151439c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56743b();
            case 4:
                return new C56742a();
            case 5:
                return f151439c;
            case 6:
                C63010eb ebVar = f151440d;
                if (ebVar == null) {
                    synchronized (C56743b.class) {
                        ebVar = f151440d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151439c);
                            f151440d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
