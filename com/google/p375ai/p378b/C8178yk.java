package com.google.p375ai.p378b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.yk */
/* compiled from: PG */
public final class C8178yk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8178yk f28736g;

    /* renamed from: i */
    private static volatile C63010eb f28737i;

    /* renamed from: a */
    public int f28738a;

    /* renamed from: b */
    public int f28739b = 0;

    /* renamed from: c */
    public Object f28740c;

    /* renamed from: d */
    public boolean f28741d;

    /* renamed from: e */
    public boolean f28742e;

    /* renamed from: f */
    public int f28743f;

    /* renamed from: h */
    private byte f28744h = 2;

    static {
        C8178yk ykVar = new C8178yk();
        f28736g = ykVar;
        C62942bv.registerDefaultInstance(C8178yk.class, ykVar);
    }

    private C8178yk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28744h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28744h = b;
                return null;
            case 2:
                return newMessageInfo(f28736g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0004င\u0004\u0005ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", C8176yi.class, "d", "e", C10662f.f35572a, C60214n.class});
            case 3:
                return new C8178yk();
            case 4:
                return new C8177yj();
            case 5:
                return f28736g;
            case 6:
                C63010eb ebVar = f28737i;
                if (ebVar == null) {
                    synchronized (C8178yk.class) {
                        ebVar = f28737i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28736g);
                            f28737i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
