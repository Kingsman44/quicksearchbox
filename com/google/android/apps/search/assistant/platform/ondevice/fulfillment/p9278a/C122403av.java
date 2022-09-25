package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5030q.C65196fc;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.av */
/* compiled from: PG */
public final class C122403av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122403av f339344c;

    /* renamed from: e */
    private static volatile C63010eb f339345e;

    /* renamed from: a */
    public C65196fc f339346a;

    /* renamed from: b */
    public C122448cm f339347b;

    /* renamed from: d */
    private byte f339348d = 2;

    static {
        C122403av avVar = new C122403av();
        f339344c = avVar;
        C62942bv.registerDefaultInstance(C122403av.class, avVar);
    }

    private C122403av() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339348d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339348d = b;
                return null;
            case 2:
                return newMessageInfo(f339344c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C122403av();
            case 4:
                return new C122402au();
            case 5:
                return f339344c;
            case 6:
                C63010eb ebVar = f339345e;
                if (ebVar == null) {
                    synchronized (C122403av.class) {
                        ebVar = f339345e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339344c);
                            f339345e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
