package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.b */
/* compiled from: PG */
public final class C129043b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129043b f354521c;

    /* renamed from: e */
    private static volatile C63010eb f354522e;

    /* renamed from: a */
    public int f354523a;

    /* renamed from: b */
    public C54201r f354524b;

    /* renamed from: d */
    private byte f354525d = 2;

    static {
        C129043b bVar = new C129043b();
        f354521c = bVar;
        C62942bv.registerDefaultInstance(C129043b.class, bVar);
    }

    private C129043b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f354525d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f354525d = b;
                return null;
            case 2:
                return newMessageInfo(f354521c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C129043b();
            case 4:
                return new C129026a();
            case 5:
                return f354521c;
            case 6:
                C63010eb ebVar = f354522e;
                if (ebVar == null) {
                    synchronized (C129043b.class) {
                        ebVar = f354522e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f354521c);
                            f354522e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
