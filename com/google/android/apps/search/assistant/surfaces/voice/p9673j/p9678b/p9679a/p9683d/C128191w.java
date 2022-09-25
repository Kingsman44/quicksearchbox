package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.w */
/* compiled from: PG */
public final class C128191w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128191w f352648d;

    /* renamed from: e */
    private static volatile C63010eb f352649e;

    /* renamed from: a */
    public int f352650a;

    /* renamed from: b */
    public C62971cq f352651b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C128182n f352652c;

    static {
        C128191w wVar = new C128191w();
        f352648d = wVar;
        C62942bv.registerDefaultInstance(C128191w.class, wVar);
    }

    private C128191w() {
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
                return newMessageInfo(f352648d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C128191w();
            case 4:
                return new C128190v();
            case 5:
                return f352648d;
            case 6:
                C63010eb ebVar = f352649e;
                if (ebVar == null) {
                    synchronized (C128191w.class) {
                        ebVar = f352649e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352648d);
                            f352649e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
