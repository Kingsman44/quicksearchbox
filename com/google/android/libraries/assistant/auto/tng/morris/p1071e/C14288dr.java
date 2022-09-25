package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dr */
/* compiled from: PG */
public final class C14288dr extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C14288dr f43223h;

    /* renamed from: j */
    private static volatile C63010eb f43224j;

    /* renamed from: a */
    public C14216b f43225a;

    /* renamed from: b */
    public C14572oe f43226b;

    /* renamed from: c */
    public C14570oc f43227c;

    /* renamed from: d */
    public int f43228d;

    /* renamed from: e */
    public int f43229e;

    /* renamed from: f */
    public C62971cq f43230f = emptyProtobufList();

    /* renamed from: g */
    public C14627qf f43231g;

    /* renamed from: i */
    private byte f43232i = 2;

    static {
        C14288dr drVar = new C14288dr();
        f43223h = drVar;
        C62942bv.registerDefaultInstance(C14288dr.class, drVar);
    }

    private C14288dr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43232i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43232i = b;
                return null;
            case 2:
                return newMessageInfo(f43223h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0002\u0001\t\u0002Л\u0003\f\u0004Љ\u0005\f\u0006\t\u0007\t", new Object[]{"a", C10662f.f35572a, C14292dv.class, "e", "b", "d", C45240c.f118157a, C30325g.f82003a});
            case 3:
                return new C14288dr();
            case 4:
                return new C14287dq();
            case 5:
                return f43223h;
            case 6:
                C63010eb ebVar = f43224j;
                if (ebVar == null) {
                    synchronized (C14288dr.class) {
                        ebVar = f43224j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43223h);
                            f43224j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
