package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.apn */
/* compiled from: PG */
public final class apn extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final apn f135563g;

    /* renamed from: h */
    private static volatile C63010eb f135564h;

    /* renamed from: a */
    public C52374pj f135565a;

    /* renamed from: b */
    public C62971cq f135566b = emptyProtobufList();

    /* renamed from: c */
    public C51098gh f135567c;

    /* renamed from: d */
    public apm f135568d;

    /* renamed from: e */
    public C52374pj f135569e;

    /* renamed from: f */
    public C52372ph f135570f;

    static {
        apn apn = new apn();
        f135563g = apn;
        C62942bv.registerDefaultInstance(apn.class, apn);
    }

    private apn() {
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
                return newMessageInfo(f135563g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\u001b\u0005\t\u0006\t", new Object[]{"a", C45240c.f118157a, "d", "b", C52374pj.class, "e", C10662f.f35572a});
            case 3:
                return new apn();
            case 4:
                return new apk();
            case 5:
                return f135563g;
            case 6:
                C63010eb ebVar = f135564h;
                if (ebVar == null) {
                    synchronized (apn.class) {
                        ebVar = f135564h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135563g);
                            f135564h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
