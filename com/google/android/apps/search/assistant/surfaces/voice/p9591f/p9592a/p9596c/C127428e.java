package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c;

import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.c.e */
/* compiled from: PG */
public final class C127428e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127428e f350867c;

    /* renamed from: d */
    private static volatile C63010eb f350868d;

    /* renamed from: a */
    public C51805du f350869a;

    /* renamed from: b */
    public C127426c f350870b;

    static {
        C127428e eVar = new C127428e();
        f350867c = eVar;
        C62942bv.registerDefaultInstance(C127428e.class, eVar);
    }

    private C127428e() {
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
                return newMessageInfo(f350867c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C127428e();
            case 4:
                return new C127427d();
            case 5:
                return f350867c;
            case 6:
                C63010eb ebVar = f350868d;
                if (ebVar == null) {
                    synchronized (C127428e.class) {
                        ebVar = f350868d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350867c);
                            f350868d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
