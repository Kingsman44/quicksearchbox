package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.shared.p6970ab.C89080j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hr */
/* compiled from: PG */
public final class C87898hr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87898hr f237779c;

    /* renamed from: d */
    private static volatile C63010eb f237780d;

    /* renamed from: a */
    public int f237781a;

    /* renamed from: b */
    public C89080j f237782b;

    static {
        C87898hr hrVar = new C87898hr();
        f237779c = hrVar;
        C62942bv.registerDefaultInstance(C87898hr.class, hrVar);
    }

    private C87898hr() {
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
                return newMessageInfo(f237779c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87898hr();
            case 4:
                return new C87897hq();
            case 5:
                return f237779c;
            case 6:
                C63010eb ebVar = f237780d;
                if (ebVar == null) {
                    synchronized (C87898hr.class) {
                        ebVar = f237780d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237779c);
                            f237780d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
