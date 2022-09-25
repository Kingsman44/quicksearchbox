package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e */
/* compiled from: PG */
public final class C128194e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C128194e f352655e;

    /* renamed from: f */
    private static volatile C63010eb f352656f;

    /* renamed from: a */
    public int f352657a;

    /* renamed from: b */
    public long f352658b;

    /* renamed from: c */
    public long f352659c;

    /* renamed from: d */
    public C62995dn f352660d = C62995dn.f170057a;

    static {
        C128194e eVar = new C128194e();
        f352655e = eVar;
        C62942bv.registerDefaultInstance(C128194e.class, eVar);
    }

    private C128194e() {
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
                return newMessageInfo(f352655e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u00032", new Object[]{"a", "b", C45240c.f118157a, "d", C128168d.f352586a});
            case 3:
                return new C128194e();
            case 4:
                return new C128152c();
            case 5:
                return f352655e;
            case 6:
                C63010eb ebVar = f352656f;
                if (ebVar == null) {
                    synchronized (C128194e.class) {
                        ebVar = f352656f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352655e);
                            f352656f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
