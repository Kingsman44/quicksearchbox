package com.google.protos.p4985f.p5022m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.m.d */
/* compiled from: PG */
public final class C64955d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64955d f175910e;

    /* renamed from: f */
    private static volatile C63010eb f175911f;

    /* renamed from: a */
    public int f175912a;

    /* renamed from: b */
    public C64954c f175913b;

    /* renamed from: c */
    public String f175914c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62961ch f175915d = emptyIntList();

    static {
        C64955d dVar = new C64955d();
        f175910e = dVar;
        C62942bv.registerDefaultInstance(C64955d.class, dVar);
    }

    private C64955d() {
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
                return newMessageInfo(f175910e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u0016", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64955d();
            case 4:
                return new C64952a();
            case 5:
                return f175910e;
            case 6:
                C63010eb ebVar = f175911f;
                if (ebVar == null) {
                    synchronized (C64955d.class) {
                        ebVar = f175911f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175910e);
                            f175911f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
