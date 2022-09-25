package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3899b.p3901b.C50877d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.fi */
/* compiled from: PG */
public final class C87835fi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87835fi f237649d;

    /* renamed from: e */
    private static volatile C63010eb f237650e;

    /* renamed from: a */
    public int f237651a;

    /* renamed from: b */
    public C50877d f237652b;

    /* renamed from: c */
    public String f237653c = BuildConfig.FLAVOR;

    static {
        C87835fi fiVar = new C87835fi();
        f237649d = fiVar;
        C62942bv.registerDefaultInstance(C87835fi.class, fiVar);
    }

    private C87835fi() {
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
                return newMessageInfo(f237649d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87835fi();
            case 4:
                return new C87834fh();
            case 5:
                return f237649d;
            case 6:
                C63010eb ebVar = f237650e;
                if (ebVar == null) {
                    synchronized (C87835fi.class) {
                        ebVar = f237650e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237649d);
                            f237650e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
