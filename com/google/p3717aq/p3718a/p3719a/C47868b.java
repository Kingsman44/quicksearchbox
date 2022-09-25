package com.google.p3717aq.p3718a.p3719a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aq.a.a.b */
/* compiled from: PG */
public final class C47868b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C47868b f123936f;

    /* renamed from: g */
    private static volatile C63010eb f123937g;

    /* renamed from: a */
    public int f123938a = 0;

    /* renamed from: b */
    public Object f123939b;

    /* renamed from: c */
    public C62971cq f123940c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public boolean f123941d;

    /* renamed from: e */
    public boolean f123942e;

    static {
        C47868b bVar = new C47868b();
        f123936f = bVar;
        C62942bv.registerDefaultInstance(C47868b.class, bVar);
    }

    private C47868b() {
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
                return newMessageInfo(f123936f, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ț\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006\u0007\u0007\u0007", new Object[]{"b", "a", C45240c.f118157a, C51805du.class, C47870d.class, C47886t.class, "d", "e"});
            case 3:
                return new C47868b();
            case 4:
                return new C47867a();
            case 5:
                return f123936f;
            case 6:
                C63010eb ebVar = f123937g;
                if (ebVar == null) {
                    synchronized (C47868b.class) {
                        ebVar = f123937g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123936f);
                            f123937g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
