package com.google.android.libraries.lens.view.p2069am;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62491dn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.ak */
/* compiled from: PG */
public final class C25303ak extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C25303ak f68821f;

    /* renamed from: g */
    private static volatile C63010eb f68822g;

    /* renamed from: a */
    public C62491dn f68823a;

    /* renamed from: b */
    public C62491dn f68824b;

    /* renamed from: c */
    public C62971cq f68825c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f68826d = emptyProtobufList();

    /* renamed from: e */
    public C25302aj f68827e;

    static {
        C25303ak akVar = new C25303ak();
        f68821f = akVar;
        C62942bv.registerDefaultInstance(C25303ak.class, akVar);
    }

    private C25303ak() {
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
                return newMessageInfo(f68821f, "\u0000\u0005\u0000\u0000\u0003\n\u0005\u0000\u0002\u0000\u0003\t\u0005\u001b\u0006\u001b\u0007\t\n\t", new Object[]{"a", C45240c.f118157a, C25300ah.class, "d", C25298af.class, "e", "b"});
            case 3:
                return new C25303ak();
            case 4:
                return new C25294ab();
            case 5:
                return f68821f;
            case 6:
                C63010eb ebVar = f68822g;
                if (ebVar == null) {
                    synchronized (C25303ak.class) {
                        ebVar = f68822g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68821f);
                            f68822g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
