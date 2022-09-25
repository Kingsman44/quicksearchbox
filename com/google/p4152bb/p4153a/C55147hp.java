package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.hp */
/* compiled from: PG */
public final class C55147hp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55147hp f145175d;

    /* renamed from: f */
    private static volatile C63010eb f145176f;

    /* renamed from: a */
    public int f145177a;

    /* renamed from: b */
    public String f145178b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C54969b f145179c;

    /* renamed from: e */
    private byte f145180e = 2;

    static {
        C55147hp hpVar = new C55147hp();
        f145175d = hpVar;
        C62942bv.registerDefaultInstance(C55147hp.class, hpVar);
    }

    private C55147hp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145180e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145180e = b;
                return null;
            case 2:
                return newMessageInfo(f145175d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55147hp();
            case 4:
                return new C55146ho();
            case 5:
                return f145175d;
            case 6:
                C63010eb ebVar = f145176f;
                if (ebVar == null) {
                    synchronized (C55147hp.class) {
                        ebVar = f145176f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145175d);
                            f145176f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
