package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3562ao.p3563a.p3567c.C45528f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.ac */
/* compiled from: PG */
public final class C45532ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45532ac f119011d;

    /* renamed from: e */
    private static volatile C63010eb f119012e;

    /* renamed from: a */
    public C45528f f119013a;

    /* renamed from: b */
    public String f119014b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f119015c = C62942bv.emptyProtobufList();

    static {
        C45532ac acVar = new C45532ac();
        f119011d = acVar;
        C62942bv.registerDefaultInstance(C45532ac.class, acVar);
    }

    private C45532ac() {
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
                return newMessageInfo(f119011d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002Ț\u0003Ȉ", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C45532ac();
            case 4:
                return new C45531ab();
            case 5:
                return f119011d;
            case 6:
                C63010eb ebVar = f119012e;
                if (ebVar == null) {
                    synchronized (C45532ac.class) {
                        ebVar = f119012e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119011d);
                            f119012e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
