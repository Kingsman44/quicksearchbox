package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.acy */
/* compiled from: PG */
public final class acy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final acy f134860d;

    /* renamed from: e */
    private static volatile C63010eb f134861e;

    /* renamed from: a */
    public int f134862a;

    /* renamed from: b */
    public String f134863b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public acx f134864c;

    static {
        acy acy = new acy();
        f134860d = acy;
        C62942bv.registerDefaultInstance(acy.class, acy);
    }

    private acy() {
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
                return newMessageInfo(f134860d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new acy();
            case 4:
                return new acv();
            case 5:
                return f134860d;
            case 6:
                C63010eb ebVar = f134861e;
                if (ebVar == null) {
                    synchronized (acy.class) {
                        ebVar = f134861e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134860d);
                            f134861e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
