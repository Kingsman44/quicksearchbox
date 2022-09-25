package com.google.android.apps.gsa.search.shared.p6923b.p6924a;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.shared.b.a.c */
/* compiled from: PG */
public final class C87507c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87507c f236342c;

    /* renamed from: d */
    public static final C62940bt f236343d;

    /* renamed from: e */
    private static volatile C63010eb f236344e;

    /* renamed from: a */
    public int f236345a;

    /* renamed from: b */
    public int f236346b;

    static {
        C87507c cVar = new C87507c();
        f236342c = cVar;
        C62942bv.registerDefaultInstance(C87507c.class, cVar);
        f236343d = C62942bv.newSingularGeneratedExtension(C87741bw.f237477c, cVar, cVar, (C62958ce) null, 401213332, C63066gd.MESSAGE, C87507c.class);
    }

    private C87507c() {
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
                return newMessageInfo(f236342c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C87505a.f236341a});
            case 3:
                return new C87507c();
            case 4:
                return new C87506b();
            case 5:
                return f236342c;
            case 6:
                C63010eb ebVar = f236344e;
                if (ebVar == null) {
                    synchronized (C87507c.class) {
                        ebVar = f236344e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f236342c);
                            f236344e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
