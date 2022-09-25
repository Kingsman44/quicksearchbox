package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52353op;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lb */
/* compiled from: PG */
public final class C53362lb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53362lb f140012d;

    /* renamed from: e */
    private static volatile C63010eb f140013e;

    /* renamed from: a */
    public int f140014a;

    /* renamed from: b */
    public String f140015b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52353op f140016c;

    static {
        C53362lb lbVar = new C53362lb();
        f140012d = lbVar;
        C62942bv.registerDefaultInstance(C53362lb.class, lbVar);
    }

    private C53362lb() {
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
                return newMessageInfo(f140012d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53362lb();
            case 4:
                return new C53361la();
            case 5:
                return f140012d;
            case 6:
                C63010eb ebVar = f140013e;
                if (ebVar == null) {
                    synchronized (C53362lb.class) {
                        ebVar = f140013e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140012d);
                            f140013e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
