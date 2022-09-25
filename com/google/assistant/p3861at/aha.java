package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aha */
/* compiled from: PG */
public final class aha extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aha f129273d;

    /* renamed from: e */
    private static volatile C63010eb f129274e;

    /* renamed from: a */
    public int f129275a;

    /* renamed from: b */
    public String f129276b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f129277c;

    static {
        aha aha = new aha();
        f129273d = aha;
        C62942bv.registerDefaultInstance(aha.class, aha);
    }

    private aha() {
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
                return newMessageInfo(f129273d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aha();
            case 4:
                return new agz();
            case 5:
                return f129273d;
            case 6:
                C63010eb ebVar = f129274e;
                if (ebVar == null) {
                    synchronized (aha.class) {
                        ebVar = f129274e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129273d);
                            f129274e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
