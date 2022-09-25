package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.a.p */
/* compiled from: PG */
public final class C129312p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C129312p f355162d;

    /* renamed from: f */
    private static volatile C63010eb f355163f;

    /* renamed from: a */
    public int f355164a;

    /* renamed from: b */
    public boolean f355165b;

    /* renamed from: c */
    public C63204j f355166c;

    /* renamed from: e */
    private byte f355167e = 2;

    static {
        C129312p pVar = new C129312p();
        f355162d = pVar;
        C62942bv.registerDefaultInstance(C129312p.class, pVar);
    }

    private C129312p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f355167e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f355167e = b;
                return null;
            case 2:
                return newMessageInfo(f355162d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u0004\u0002\u0007\u0003Љ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C129312p();
            case 4:
                return new C129311o();
            case 5:
                return f355162d;
            case 6:
                C63010eb ebVar = f355163f;
                if (ebVar == null) {
                    synchronized (C129312p.class) {
                        ebVar = f355163f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355162d);
                            f355163f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
