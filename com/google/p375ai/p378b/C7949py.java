package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4653i.p4654a.p4655a.C61655f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.ai.b.py */
/* compiled from: PG */
public final class C7949py extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7949py f27908d;

    /* renamed from: e */
    public static final C62940bt f27909e;

    /* renamed from: g */
    private static volatile C63010eb f27910g;

    /* renamed from: a */
    public int f27911a;

    /* renamed from: b */
    public boolean f27912b;

    /* renamed from: c */
    public C62971cq f27913c = emptyProtobufList();

    /* renamed from: f */
    private byte f27914f = 2;

    static {
        C7949py pyVar = new C7949py();
        f27908d = pyVar;
        C62942bv.registerDefaultInstance(C7949py.class, pyVar);
        f27909e = C62942bv.newSingularGeneratedExtension(C7704gw.f26884c, pyVar, pyVar, (C62958ce) null, 85745471, C63066gd.MESSAGE, C7949py.class);
    }

    private C7949py() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27914f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27914f = b;
                return null;
            case 2:
                return newMessageInfo(f27908d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဇ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C61655f.class});
            case 3:
                return new C7949py();
            case 4:
                return new C7948px();
            case 5:
                return f27908d;
            case 6:
                C63010eb ebVar = f27910g;
                if (ebVar == null) {
                    synchronized (C7949py.class) {
                        ebVar = f27910g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27908d);
                            f27910g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
