package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.k */
/* compiled from: PG */
public final class C122456k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C122456k f339476f;

    /* renamed from: h */
    private static volatile C63010eb f339477h;

    /* renamed from: a */
    public C122445cj f339478a;

    /* renamed from: b */
    public C61752n f339479b;

    /* renamed from: c */
    public C122419bk f339480c;

    /* renamed from: d */
    public C122454i f339481d;

    /* renamed from: e */
    public int f339482e;

    /* renamed from: g */
    private byte f339483g = 2;

    static {
        C122456k kVar = new C122456k();
        f339476f = kVar;
        C62942bv.registerDefaultInstance(C122456k.class, kVar);
    }

    private C122456k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339483g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339483g = b;
                return null;
            case 2:
                return newMessageInfo(f339476f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0002\u0001\t\u0002Љ\u0003\t\u0004Љ\u0005\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C122456k();
            case 4:
                return new C122455j();
            case 5:
                return f339476f;
            case 6:
                C63010eb ebVar = f339477h;
                if (ebVar == null) {
                    synchronized (C122456k.class) {
                        ebVar = f339477h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339476f);
                            f339477h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
