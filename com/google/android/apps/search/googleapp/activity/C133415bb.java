package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.activity.bb */
/* compiled from: PG */
public final class C133415bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C133415bb f363541e;

    /* renamed from: f */
    private static volatile C63010eb f363542f;

    /* renamed from: a */
    public int f363543a;

    /* renamed from: b */
    public C62995dn f363544b = C62995dn.f170057a;

    /* renamed from: c */
    public int f363545c;

    /* renamed from: d */
    public int f363546d;

    static {
        C133415bb bbVar = new C133415bb();
        f363541e = bbVar;
        C62942bv.registerDefaultInstance(C133415bb.class, bbVar);
    }

    private C133415bb() {
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
                return newMessageInfo(f363541e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002ဌ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", C133414ba.f363540a, C45240c.f118157a, C139779t.m227246b(), "d", C139779t.m227246b()});
            case 3:
                return new C133415bb();
            case 4:
                return new C133402az();
            case 5:
                return f363541e;
            case 6:
                C63010eb ebVar = f363542f;
                if (ebVar == null) {
                    synchronized (C133415bb.class) {
                        ebVar = f363542f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363541e);
                            f363542f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
