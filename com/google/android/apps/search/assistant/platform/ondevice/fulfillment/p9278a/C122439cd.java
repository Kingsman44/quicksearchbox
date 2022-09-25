package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5030q.C65191ey;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.cd */
/* compiled from: PG */
public final class C122439cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122439cd f339439c;

    /* renamed from: e */
    private static volatile C63010eb f339440e;

    /* renamed from: a */
    public int f339441a = 0;

    /* renamed from: b */
    public Object f339442b;

    /* renamed from: d */
    private byte f339443d = 2;

    static {
        C122439cd cdVar = new C122439cd();
        f339439c = cdVar;
        C62942bv.registerDefaultInstance(C122439cd.class, cdVar);
    }

    private C122439cd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339443d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339443d = b;
                return null;
            case 2:
                return newMessageInfo(f339439c, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0002\u0002м\u0000\u0003м\u0000", new Object[]{"b", "a", C65191ey.class, C122095d.class});
            case 3:
                return new C122439cd();
            case 4:
                return new C122438cc();
            case 5:
                return f339439c;
            case 6:
                C63010eb ebVar = f339440e;
                if (ebVar == null) {
                    synchronized (C122439cd.class) {
                        ebVar = f339440e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339439c);
                            f339440e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
