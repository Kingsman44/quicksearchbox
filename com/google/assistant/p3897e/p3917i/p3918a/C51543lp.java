package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.lp */
/* compiled from: PG */
public final class C51543lp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51543lp f134334f;

    /* renamed from: h */
    private static volatile C63010eb f134335h;

    /* renamed from: a */
    public boolean f134336a;

    /* renamed from: b */
    public boolean f134337b;

    /* renamed from: c */
    public boolean f134338c;

    /* renamed from: d */
    public boolean f134339d;

    /* renamed from: e */
    public boolean f134340e;

    /* renamed from: g */
    private int f134341g;

    static {
        C51543lp lpVar = new C51543lp();
        f134334f = lpVar;
        C62942bv.registerDefaultInstance(C51543lp.class, lpVar);
    }

    private C51543lp() {
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
                return newMessageInfo(f134334f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C51543lp();
            case 4:
                return new C51542lo();
            case 5:
                return f134334f;
            case 6:
                C63010eb ebVar = f134335h;
                if (ebVar == null) {
                    synchronized (C51543lp.class) {
                        ebVar = f134335h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134334f);
                            f134335h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
