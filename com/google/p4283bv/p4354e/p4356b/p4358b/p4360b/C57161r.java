package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66208dv;

/* renamed from: com.google.bv.e.b.b.b.r */
/* compiled from: PG */
public final class C57161r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57161r f152600b;

    /* renamed from: c */
    public static final C62940bt f152601c;

    /* renamed from: e */
    private static volatile C63010eb f152602e;

    /* renamed from: a */
    public String f152603a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f152604d;

    static {
        C57161r rVar = new C57161r();
        f152600b = rVar;
        C62942bv.registerDefaultInstance(C57161r.class, rVar);
        f152601c = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, rVar, rVar, (C62958ce) null, 340228869, C63066gd.MESSAGE, C57161r.class);
    }

    private C57161r() {
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
                return newMessageInfo(f152600b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "a"});
            case 3:
                return new C57161r();
            case 4:
                return new C57160q();
            case 5:
                return f152600b;
            case 6:
                C63010eb ebVar = f152602e;
                if (ebVar == null) {
                    synchronized (C57161r.class) {
                        ebVar = f152602e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152600b);
                            f152602e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
