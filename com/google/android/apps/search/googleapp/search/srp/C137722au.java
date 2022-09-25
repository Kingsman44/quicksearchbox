package com.google.android.apps.search.googleapp.search.srp;

import com.google.android.apps.search.googleapp.search.p10409e.C137414c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.au */
/* compiled from: PG */
public final class C137722au extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C137722au f374618e;

    /* renamed from: f */
    private static volatile C63010eb f374619f;

    /* renamed from: a */
    public int f374620a;

    /* renamed from: b */
    public int f374621b;

    /* renamed from: c */
    public int f374622c;

    /* renamed from: d */
    public int f374623d;

    static {
        C137722au auVar = new C137722au();
        f374618e = auVar;
        C62942bv.registerDefaultInstance(C137722au.class, auVar);
    }

    private C137722au() {
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
                Object[] objArr = new Object[6];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C137414c.f373765a;
                objArr[4] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[5] = "d";
                return newMessageInfo(f374618e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဋ\u0002", objArr);
            case 3:
                return new C137722au();
            case 4:
                return new C137721at();
            case 5:
                return f374618e;
            case 6:
                C63010eb ebVar = f374619f;
                if (ebVar == null) {
                    synchronized (C137722au.class) {
                        ebVar = f374619f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f374618e);
                            f374619f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
