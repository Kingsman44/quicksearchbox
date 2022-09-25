package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.al.d.a.ac */
/* compiled from: PG */
public final class C8523ac extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C8523ac f29564e;

    /* renamed from: g */
    private static volatile C63010eb f29565g;

    /* renamed from: a */
    public int f29566a;

    /* renamed from: b */
    public String f29567b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f29568c;

    /* renamed from: d */
    public boolean f29569d;

    /* renamed from: f */
    private byte f29570f = 2;

    static {
        C8523ac acVar = new C8523ac();
        f29564e = acVar;
        C62942bv.registerDefaultInstance(C8523ac.class, acVar);
    }

    private C8523ac() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29570f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29570f = b;
                return null;
            case 2:
                return newMessageInfo(f29564e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0004င\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8523ac();
            case 4:
                return new C8522ab();
            case 5:
                return f29564e;
            case 6:
                C63010eb ebVar = f29565g;
                if (ebVar == null) {
                    synchronized (C8523ac.class) {
                        ebVar = f29565g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29564e);
                            f29565g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
