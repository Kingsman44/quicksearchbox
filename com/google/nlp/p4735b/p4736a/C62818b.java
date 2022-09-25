package com.google.nlp.p4735b.p4736a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.b */
/* compiled from: PG */
public final class C62818b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62818b f169638e;

    /* renamed from: g */
    private static volatile C63010eb f169639g;

    /* renamed from: a */
    public int f169640a;

    /* renamed from: b */
    public String f169641b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f169642c = emptyProtobufList();

    /* renamed from: d */
    public String f169643d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f169644f = 2;

    static {
        C62818b bVar = new C62818b();
        f169638e = bVar;
        C62942bv.registerDefaultInstance(C62818b.class, bVar);
    }

    private C62818b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169644f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169644f = b;
                return null;
            case 2:
                return newMessageInfo(f169638e, "\u0001\u0003\u0000\u0001\u0003\u0011\u0003\u0000\u0001\u0001\u0003Л\u0006ဈ\u0000\u0011ဈ\u0001", new Object[]{"a", C45240c.f118157a, C62837d.class, "b", "d"});
            case 3:
                return new C62818b();
            case 4:
                return new C62807a();
            case 5:
                return f169638e;
            case 6:
                C63010eb ebVar = f169639g;
                if (ebVar == null) {
                    synchronized (C62818b.class) {
                        ebVar = f169639g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169638e);
                            f169639g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
