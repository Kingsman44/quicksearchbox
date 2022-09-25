package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48378p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.je */
/* compiled from: PG */
public final class C60056je extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60056je f162321f;

    /* renamed from: g */
    public static final C62940bt f162322g;

    /* renamed from: h */
    private static volatile C63010eb f162323h;

    /* renamed from: a */
    public int f162324a;

    /* renamed from: b */
    public int f162325b;

    /* renamed from: c */
    public boolean f162326c;

    /* renamed from: d */
    public int f162327d;

    /* renamed from: e */
    public int f162328e;

    static {
        C60056je jeVar = new C60056je();
        f162321f = jeVar;
        C62942bv.registerDefaultInstance(C60056je.class, jeVar);
        f162322g = C62942bv.newSingularGeneratedExtension(aqs.f159780k, jeVar, jeVar, (C62958ce) null, 671, C63066gd.MESSAGE, C60056je.class);
    }

    private C60056je() {
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
                return newMessageInfo(f162321f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C48378p.f125058a, C45240c.f118157a, "d", C60055jd.f162320a, "e", C60054jc.f162319a});
            case 3:
                return new C60056je();
            case 4:
                return new C60053jb();
            case 5:
                return f162321f;
            case 6:
                C63010eb ebVar = f162323h;
                if (ebVar == null) {
                    synchronized (C60056je.class) {
                        ebVar = f162323h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162321f);
                            f162323h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
