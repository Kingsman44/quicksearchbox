package com.google.assistant.p3781ad.p3789d;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79938am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ad.d.z */
/* compiled from: PG */
public final class C48768z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48768z f126189b;

    /* renamed from: c */
    public static final C62940bt f126190c;

    /* renamed from: e */
    private static volatile C63010eb f126191e;

    /* renamed from: a */
    public C79938am f126192a;

    /* renamed from: d */
    private int f126193d;

    static {
        C48768z zVar = new C48768z();
        f126189b = zVar;
        C62942bv.registerDefaultInstance(C48768z.class, zVar);
        f126190c = C62942bv.newSingularGeneratedExtension(C48576aj.f125494h, zVar, zVar, (C62958ce) null, 311736573, C63066gd.MESSAGE, C48768z.class);
    }

    private C48768z() {
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
                return newMessageInfo(f126189b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C48768z();
            case 4:
                return new C48767y();
            case 5:
                return f126189b;
            case 6:
                C63010eb ebVar = f126191e;
                if (ebVar == null) {
                    synchronized (C48768z.class) {
                        ebVar = f126191e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126189b);
                            f126191e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
