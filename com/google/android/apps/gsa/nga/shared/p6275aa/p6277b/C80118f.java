package com.google.android.apps.gsa.nga.shared.p6275aa.p6277b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.recognizer.p5233a.C67438ag;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.b.f */
/* compiled from: PG */
public final class C80118f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80118f f219836e;

    /* renamed from: g */
    private static volatile C63010eb f219837g;

    /* renamed from: a */
    public int f219838a;

    /* renamed from: b */
    public String f219839b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C67438ag f219840c;

    /* renamed from: d */
    public String f219841d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f219842f = 2;

    static {
        C80118f fVar = new C80118f();
        f219836e = fVar;
        C62942bv.registerDefaultInstance(C80118f.class, fVar);
    }

    private C80118f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219842f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219842f = b;
                return null;
            case 2:
                return newMessageInfo(f219836e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80118f();
            case 4:
                return new C80117e();
            case 5:
                return f219836e;
            case 6:
                C63010eb ebVar = f219837g;
                if (ebVar == null) {
                    synchronized (C80118f.class) {
                        ebVar = f219837g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219836e);
                            f219837g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
