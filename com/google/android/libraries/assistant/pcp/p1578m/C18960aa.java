package com.google.android.libraries.assistant.pcp.p1578m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.aa */
/* compiled from: PG */
public final class C18960aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C18960aa f53280d;

    /* renamed from: f */
    private static volatile C63010eb f53281f;

    /* renamed from: a */
    public String f53282a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f53283b;

    /* renamed from: c */
    public int f53284c;

    /* renamed from: e */
    private int f53285e;

    static {
        C18960aa aaVar = new C18960aa();
        f53280d = aaVar;
        C62942bv.registerDefaultInstance(C18960aa.class, aaVar);
    }

    private C18960aa() {
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
                return newMessageInfo(f53280d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"e", "a", "b", C18981k.m36416b(), C45240c.f118157a});
            case 3:
                return new C18960aa();
            case 4:
                return new C18996z();
            case 5:
                return f53280d;
            case 6:
                C63010eb ebVar = f53281f;
                if (ebVar == null) {
                    synchronized (C18960aa.class) {
                        ebVar = f53281f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53280d);
                            f53281f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
