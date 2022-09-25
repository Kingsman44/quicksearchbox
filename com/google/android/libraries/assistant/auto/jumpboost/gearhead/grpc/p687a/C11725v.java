package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.android.apps.auto.p450a.p451a.C8859ad;
import com.google.android.apps.auto.p450a.p451a.C8861af;
import com.google.android.apps.auto.p450a.p451a.C8899bq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.v */
/* compiled from: PG */
public final class C11725v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11725v f37769c;

    /* renamed from: d */
    private static volatile C63010eb f37770d;

    /* renamed from: a */
    public int f37771a = 0;

    /* renamed from: b */
    public Object f37772b;

    static {
        C11725v vVar = new C11725v();
        f37769c = vVar;
        C62942bv.registerDefaultInstance(C11725v.class, vVar);
    }

    private C11725v() {
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
                return newMessageInfo(f37769c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C8899bq.class, C8861af.class, C8859ad.class});
            case 3:
                return new C11725v();
            case 4:
                return new C11724u();
            case 5:
                return f37769c;
            case 6:
                C63010eb ebVar = f37770d;
                if (ebVar == null) {
                    synchronized (C11725v.class) {
                        ebVar = f37770d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37769c);
                            f37770d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
