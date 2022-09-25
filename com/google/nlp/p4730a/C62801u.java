package com.google.nlp.p4730a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.speech.p5230n.p5232b.C67402ar;

/* renamed from: com.google.nlp.a.u */
/* compiled from: PG */
public final class C62801u extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C62801u f169598d;

    /* renamed from: g */
    private static volatile C63010eb f169599g;

    /* renamed from: a */
    public C67402ar f169600a;

    /* renamed from: b */
    public String f169601b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f169602c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f169603e;

    /* renamed from: f */
    private byte f169604f = 2;

    static {
        C62801u uVar = new C62801u();
        f169598d = uVar;
        C62942bv.registerDefaultInstance(C62801u.class, uVar);
    }

    private C62801u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169604f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169604f = b;
                return null;
            case 2:
                return newMessageInfo(f169598d, "\u0001\u0003\u0000\u0001\u0005\n\u0003\u0000\u0000\u0001\u0005ဈ\u0005\u0007ᐉ\u0000\nဈ\u0002", new Object[]{"e", C45240c.f118157a, "a", "b"});
            case 3:
                return new C62801u();
            case 4:
                return new C62800t();
            case 5:
                return f169598d;
            case 6:
                C63010eb ebVar = f169599g;
                if (ebVar == null) {
                    synchronized (C62801u.class) {
                        ebVar = f169599g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169598d);
                            f169599g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
