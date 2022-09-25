package com.google.android.apps.search.googleapp.googleappbrowser.p10262c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.c.e */
/* compiled from: PG */
public final class C135545e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C135545e f369229c;

    /* renamed from: d */
    private static volatile C63010eb f369230d;

    /* renamed from: a */
    public int f369231a;

    /* renamed from: b */
    public boolean f369232b;

    static {
        C135545e eVar = new C135545e();
        f369229c = eVar;
        C62942bv.registerDefaultInstance(C135545e.class, eVar);
    }

    private C135545e() {
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
                return newMessageInfo(f369229c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C135545e();
            case 4:
                return new C135544d();
            case 5:
                return f369229c;
            case 6:
                C63010eb ebVar = f369230d;
                if (ebVar == null) {
                    synchronized (C135545e.class) {
                        ebVar = f369230d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369229c);
                            f369230d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
