package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.d.b */
/* compiled from: PG */
public final class C128537b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128537b f353446d;

    /* renamed from: e */
    private static volatile C63010eb f353447e;

    /* renamed from: a */
    public int f353448a;

    /* renamed from: b */
    public int f353449b;

    /* renamed from: c */
    public int f353450c;

    static {
        C128537b bVar = new C128537b();
        f353446d = bVar;
        C62942bv.registerDefaultInstance(C128537b.class, bVar);
    }

    private C128537b() {
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
                return newMessageInfo(f353446d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C128539d.m209784b(), C45240c.f118157a, C79570b.m127649b()});
            case 3:
                return new C128537b();
            case 4:
                return new C128536a();
            case 5:
                return f353446d;
            case 6:
                C63010eb ebVar = f353447e;
                if (ebVar == null) {
                    synchronized (C128537b.class) {
                        ebVar = f353447e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f353446d);
                            f353447e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
