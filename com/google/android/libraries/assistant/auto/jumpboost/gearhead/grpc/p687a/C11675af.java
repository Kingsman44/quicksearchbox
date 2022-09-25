package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16347au;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.af */
/* compiled from: PG */
public final class C11675af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11675af f37663c;

    /* renamed from: d */
    public static final C62940bt f37664d;

    /* renamed from: e */
    private static volatile C63010eb f37665e;

    /* renamed from: a */
    public int f37666a;

    /* renamed from: b */
    public C11671ab f37667b;

    static {
        C11675af afVar = new C11675af();
        f37663c = afVar;
        C62942bv.registerDefaultInstance(C11675af.class, afVar);
        f37664d = C62942bv.newSingularGeneratedExtension(C16347au.f48122b, afVar, afVar, (C62958ce) null, 101, C63066gd.MESSAGE, C11675af.class);
    }

    private C11675af() {
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
                return newMessageInfo(f37663c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C11675af();
            case 4:
                return new C11674ae();
            case 5:
                return f37663c;
            case 6:
                C63010eb ebVar = f37665e;
                if (ebVar == null) {
                    synchronized (C11675af.class) {
                        ebVar = f37665e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37663c);
                            f37665e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
