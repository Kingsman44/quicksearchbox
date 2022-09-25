package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.android.apps.auto.p450a.C8963i;
import com.google.android.apps.auto.p450a.p451a.C8915h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ba */
/* compiled from: PG */
public final class C11697ba extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C11697ba f37712e;

    /* renamed from: g */
    private static volatile C63010eb f37713g;

    /* renamed from: a */
    public C8915h f37714a;

    /* renamed from: b */
    public C8963i f37715b;

    /* renamed from: c */
    public C11696b f37716c;

    /* renamed from: d */
    public boolean f37717d;

    /* renamed from: f */
    private int f37718f;

    static {
        C11697ba baVar = new C11697ba();
        f37712e = baVar;
        C62942bv.registerDefaultInstance(C11697ba.class, baVar);
    }

    private C11697ba() {
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
                return newMessageInfo(f37712e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C11697ba();
            case 4:
                return new C11695az();
            case 5:
                return f37712e;
            case 6:
                C63010eb ebVar = f37713g;
                if (ebVar == null) {
                    synchronized (C11697ba.class) {
                        ebVar = f37713g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37712e);
                            f37713g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
