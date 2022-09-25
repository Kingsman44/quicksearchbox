package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3991q.p3992a.C53057b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.x */
/* compiled from: PG */
public final class C66690x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66690x f181420b;

    /* renamed from: f */
    private static volatile C63010eb f181421f;

    /* renamed from: a */
    public String f181422a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f181423c;

    /* renamed from: d */
    private C53057b f181424d;

    /* renamed from: e */
    private byte f181425e = 2;

    static {
        C66690x xVar = new C66690x();
        f181420b = xVar;
        C62942bv.registerDefaultInstance(C66690x.class, xVar);
    }

    private C66690x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181425e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181425e = b;
                return null;
            case 2:
                return newMessageInfo(f181420b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C66690x();
            case 4:
                return new C66689w();
            case 5:
                return f181420b;
            case 6:
                C63010eb ebVar = f181421f;
                if (ebVar == null) {
                    synchronized (C66690x.class) {
                        ebVar = f181421f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181420b);
                            f181421f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
