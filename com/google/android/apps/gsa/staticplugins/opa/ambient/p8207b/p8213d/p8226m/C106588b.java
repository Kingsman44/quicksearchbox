package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m;

import com.google.assistant.p4016z.C53708bf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.m.b */
/* compiled from: PG */
public final class C106588b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C106588b f297185b;

    /* renamed from: d */
    private static volatile C63010eb f297186d;

    /* renamed from: a */
    public C62971cq f297187a = emptyProtobufList();

    /* renamed from: c */
    private byte f297188c = 2;

    static {
        C106588b bVar = new C106588b();
        f297185b = bVar;
        C62942bv.registerDefaultInstance(C106588b.class, bVar);
    }

    private C106588b() {
    }

    /* renamed from: a */
    public final void mo95584a() {
        C62971cq cqVar = this.f297187a;
        if (!cqVar.mo58948c()) {
            this.f297187a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f297188c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f297188c = b;
                return null;
            case 2:
                return newMessageInfo(f297185b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C53708bf.class});
            case 3:
                return new C106588b();
            case 4:
                return new C106587a();
            case 5:
                return f297185b;
            case 6:
                C63010eb ebVar = f297186d;
                if (ebVar == null) {
                    synchronized (C106588b.class) {
                        ebVar = f297186d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297185b);
                            f297186d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
