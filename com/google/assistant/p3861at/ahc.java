package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ahc */
/* compiled from: PG */
public final class ahc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final ahc f129278d;

    /* renamed from: e */
    private static volatile C63010eb f129279e;

    /* renamed from: a */
    public int f129280a;

    /* renamed from: b */
    public String f129281b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129282c = BuildConfig.FLAVOR;

    static {
        ahc ahc = new ahc();
        f129278d = ahc;
        C62942bv.registerDefaultInstance(ahc.class, ahc);
    }

    private ahc() {
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
                return newMessageInfo(f129278d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new ahc();
            case 4:
                return new ahb();
            case 5:
                return f129278d;
            case 6:
                C63010eb ebVar = f129279e;
                if (ebVar == null) {
                    synchronized (ahc.class) {
                        ebVar = f129279e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129278d);
                            f129279e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
