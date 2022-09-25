package com.google.android.apps.gsa.staticplugins.chime.p7661f;

import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.f.d */
/* compiled from: PG */
public final class C97714d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C97714d f272831c;

    /* renamed from: d */
    public static final C62940bt f272832d;

    /* renamed from: e */
    private static volatile C63010eb f272833e;

    /* renamed from: a */
    public int f272834a;

    /* renamed from: b */
    public boolean f272835b;

    static {
        C97714d dVar = new C97714d();
        f272831c = dVar;
        C62942bv.registerDefaultInstance(C97714d.class, dVar);
        f272832d = C62942bv.newSingularGeneratedExtension(C118476ak.f328838a, dVar, dVar, (C62958ce) null, 257855545, C63066gd.MESSAGE, C97714d.class);
    }

    private C97714d() {
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
                return newMessageInfo(f272831c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C97714d();
            case 4:
                return new C97713c();
            case 5:
                return f272831c;
            case 6:
                C63010eb ebVar = f272833e;
                if (ebVar == null) {
                    synchronized (C97714d.class) {
                        ebVar = f272833e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f272831c);
                            f272833e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
