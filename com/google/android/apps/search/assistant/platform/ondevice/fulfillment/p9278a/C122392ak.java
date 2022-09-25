package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5030q.C65196fc;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ak */
/* compiled from: PG */
public final class C122392ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122392ak f339309c;

    /* renamed from: e */
    private static volatile C63010eb f339310e;

    /* renamed from: a */
    public C65196fc f339311a;

    /* renamed from: b */
    public C122448cm f339312b;

    /* renamed from: d */
    private byte f339313d = 2;

    static {
        C122392ak akVar = new C122392ak();
        f339309c = akVar;
        C62942bv.registerDefaultInstance(C122392ak.class, akVar);
    }

    private C122392ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339313d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339313d = b;
                return null;
            case 2:
                return newMessageInfo(f339309c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C122392ak();
            case 4:
                return new C122391aj();
            case 5:
                return f339309c;
            case 6:
                C63010eb ebVar = f339310e;
                if (ebVar == null) {
                    synchronized (C122392ak.class) {
                        ebVar = f339310e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339309c);
                            f339310e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
