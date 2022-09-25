package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.e.i */
/* compiled from: PG */
public final class C127930i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f352146d = new C127926e();

    /* renamed from: e */
    public static final C127930i f352147e;

    /* renamed from: f */
    private static volatile C63010eb f352148f;

    /* renamed from: a */
    public int f352149a = 0;

    /* renamed from: b */
    public Object f352150b;

    /* renamed from: c */
    public C62961ch f352151c = emptyIntList();

    static {
        C127930i iVar = new C127930i();
        f352147e = iVar;
        C62942bv.registerDefaultInstance(C127930i.class, iVar);
    }

    private C127930i() {
    }

    /* renamed from: a */
    public final void mo108277a() {
        C62961ch chVar = this.f352151c;
        if (!chVar.mo58948c()) {
            this.f352151c = C62942bv.mutableCopy(chVar);
        }
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
                return newMessageInfo(f352147e, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001:\u0000\u0002<\u0000\u0003,", new Object[]{"b", "a", C127925d.class, C45240c.f118157a});
            case 3:
                return new C127930i();
            case 4:
                return new C127927f();
            case 5:
                return f352147e;
            case 6:
                C63010eb ebVar = f352148f;
                if (ebVar == null) {
                    synchronized (C127930i.class) {
                        ebVar = f352148f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352147e);
                            f352148f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
