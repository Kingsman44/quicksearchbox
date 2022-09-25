package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4082j.p4083a.p4084a.C54296c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bd */
/* compiled from: PG */
public final class C54351bd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54351bd f142782b;

    /* renamed from: d */
    private static volatile C63010eb f142783d;

    /* renamed from: a */
    public C54297aa f142784a;

    /* renamed from: c */
    private C54296c f142785c;

    static {
        C54351bd bdVar = new C54351bd();
        f142782b = bdVar;
        C62942bv.registerDefaultInstance(C54351bd.class, bdVar);
    }

    private C54351bd() {
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
                return newMessageInfo(f142782b, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54351bd();
            case 4:
                return new C54350bc();
            case 5:
                return f142782b;
            case 6:
                C63010eb ebVar = f142783d;
                if (ebVar == null) {
                    synchronized (C54351bd.class) {
                        ebVar = f142783d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142782b);
                            f142783d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
