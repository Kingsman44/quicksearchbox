package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.aj */
/* compiled from: PG */
public final class C56756aj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56756aj f151463e;

    /* renamed from: f */
    private static volatile C63010eb f151464f;

    /* renamed from: a */
    public int f151465a;

    /* renamed from: b */
    public double f151466b;

    /* renamed from: c */
    public double f151467c;

    /* renamed from: d */
    public String f151468d = BuildConfig.FLAVOR;

    static {
        C56756aj ajVar = new C56756aj();
        f151463e = ajVar;
        C62942bv.registerDefaultInstance(C56756aj.class, ajVar);
    }

    private C56756aj() {
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
                return newMessageInfo(f151463e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56756aj();
            case 4:
                return new C56755ai();
            case 5:
                return f151463e;
            case 6:
                C63010eb ebVar = f151464f;
                if (ebVar == null) {
                    synchronized (C56756aj.class) {
                        ebVar = f151464f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151463e);
                            f151464f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
