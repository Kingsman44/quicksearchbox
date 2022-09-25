package com.google.speech.p5218j.p5219a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.ak */
/* compiled from: PG */
public final class C66707ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66707ak f181458e;

    /* renamed from: g */
    private static volatile C63010eb f181459g;

    /* renamed from: a */
    public int f181460a;

    /* renamed from: b */
    public int f181461b = 0;

    /* renamed from: c */
    public Object f181462c;

    /* renamed from: d */
    public String f181463d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f181464f = 2;

    static {
        C66707ak akVar = new C66707ak();
        f181458e = akVar;
        C62942bv.registerDefaultInstance(C66707ak.class, akVar);
    }

    private C66707ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181464f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181464f = b;
                return null;
            case 2:
                return newMessageInfo(f181458e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C66706aj.class, C66700ad.class});
            case 3:
                return new C66707ak();
            case 4:
                return new C66698ab();
            case 5:
                return f181458e;
            case 6:
                C63010eb ebVar = f181459g;
                if (ebVar == null) {
                    synchronized (C66707ak.class) {
                        ebVar = f181459g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181458e);
                            f181459g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
