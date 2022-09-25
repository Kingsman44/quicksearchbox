package com.google.nlp.p4735b.p4736a.p4737a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.p4735b.p4736a.C62841h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.a.j */
/* compiled from: PG */
public final class C62817j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62817j f169632d;

    /* renamed from: f */
    private static volatile C63010eb f169633f;

    /* renamed from: a */
    public int f169634a;

    /* renamed from: b */
    public String f169635b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f169636c = emptyProtobufList();

    /* renamed from: e */
    private byte f169637e = 2;

    static {
        C62817j jVar = new C62817j();
        f169632d = jVar;
        C62942bv.registerDefaultInstance(C62817j.class, jVar);
    }

    private C62817j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169637e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169637e = b;
                return null;
            case 2:
                return newMessageInfo(f169632d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0003Л", new Object[]{"a", "b", C45240c.f118157a, C62841h.class});
            case 3:
                return new C62817j();
            case 4:
                return new C62816i();
            case 5:
                return f169632d;
            case 6:
                C63010eb ebVar = f169633f;
                if (ebVar == null) {
                    synchronized (C62817j.class) {
                        ebVar = f169633f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169632d);
                            f169633f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
