package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.hi */
/* compiled from: PG */
public final class C53261hi extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53261hi f139621e;

    /* renamed from: f */
    private static volatile C63010eb f139622f;

    /* renamed from: a */
    public int f139623a;

    /* renamed from: b */
    public C58079k f139624b;

    /* renamed from: c */
    public String f139625c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C53259hg f139626d;

    static {
        C53261hi hiVar = new C53261hi();
        f139621e = hiVar;
        C62942bv.registerDefaultInstance(C53261hi.class, hiVar);
    }

    private C53261hi() {
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
                return newMessageInfo(f139621e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53261hi();
            case 4:
                return new C53260hh();
            case 5:
                return f139621e;
            case 6:
                C63010eb ebVar = f139622f;
                if (ebVar == null) {
                    synchronized (C53261hi.class) {
                        ebVar = f139622f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139621e);
                            f139622f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
