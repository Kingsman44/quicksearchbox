package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.cy */
/* compiled from: PG */
public final class C51891cy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51891cy f136114c;

    /* renamed from: e */
    private static volatile C63010eb f136115e;

    /* renamed from: a */
    public String f136116a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f136117b = C62942bv.emptyProtobufList();

    /* renamed from: d */
    private int f136118d;

    static {
        C51891cy cyVar = new C51891cy();
        f136114c = cyVar;
        C62942bv.registerDefaultInstance(C51891cy.class, cyVar);
    }

    private C51891cy() {
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
                return newMessageInfo(f136114c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
            case 3:
                return new C51891cy();
            case 4:
                return new C51890cx();
            case 5:
                return f136114c;
            case 6:
                C63010eb ebVar = f136115e;
                if (ebVar == null) {
                    synchronized (C51891cy.class) {
                        ebVar = f136115e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136114c);
                            f136115e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
