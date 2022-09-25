package com.google.p3562ao.p3570b.p3575b.p3576a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.b.b.a.d */
/* compiled from: PG */
public final class C45600d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45600d f119932d;

    /* renamed from: f */
    private static volatile C63010eb f119933f;

    /* renamed from: a */
    public String f119934a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C59308f f119935b;

    /* renamed from: c */
    public String f119936c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f119937e;

    static {
        C45600d dVar = new C45600d();
        f119932d = dVar;
        C62942bv.registerDefaultInstance(C45600d.class, dVar);
    }

    private C45600d() {
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
                return newMessageInfo(f119932d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C45600d();
            case 4:
                return new C45599c();
            case 5:
                return f119932d;
            case 6:
                C63010eb ebVar = f119933f;
                if (ebVar == null) {
                    synchronized (C45600d.class) {
                        ebVar = f119933f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119932d);
                            f119933f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
