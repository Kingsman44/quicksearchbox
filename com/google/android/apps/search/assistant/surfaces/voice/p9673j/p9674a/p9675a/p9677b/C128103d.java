package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.d */
/* compiled from: PG */
public final class C128103d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128103d f352473c;

    /* renamed from: d */
    private static volatile C63010eb f352474d;

    /* renamed from: a */
    public int f352475a;

    /* renamed from: b */
    public C83320io f352476b;

    static {
        C128103d dVar = new C128103d();
        f352473c = dVar;
        C62942bv.registerDefaultInstance(C128103d.class, dVar);
    }

    private C128103d() {
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
                return newMessageInfo(f352473c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C128103d();
            case 4:
                return new C128102c();
            case 5:
                return f352473c;
            case 6:
                C63010eb ebVar = f352474d;
                if (ebVar == null) {
                    synchronized (C128103d.class) {
                        ebVar = f352474d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352473c);
                            f352474d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
