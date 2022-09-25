package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mx */
/* compiled from: PG */
public final class C53411mx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53411mx f140146e;

    /* renamed from: g */
    private static volatile C63010eb f140147g;

    /* renamed from: a */
    public int f140148a;

    /* renamed from: b */
    public String f140149b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f140150c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C53118ca f140151d;

    /* renamed from: f */
    private byte f140152f = 2;

    static {
        C53411mx mxVar = new C53411mx();
        f140146e = mxVar;
        C62942bv.registerDefaultInstance(C53411mx.class, mxVar);
    }

    private C53411mx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140152f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140152f = b;
                return null;
            case 2:
                return newMessageInfo(f140146e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53411mx();
            case 4:
                return new C53410mw();
            case 5:
                return f140146e;
            case 6:
                C63010eb ebVar = f140147g;
                if (ebVar == null) {
                    synchronized (C53411mx.class) {
                        ebVar = f140147g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140146e);
                            f140147g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
