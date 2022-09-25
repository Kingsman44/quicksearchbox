package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ej */
/* compiled from: PG */
public final class C14307ej extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C14307ej f43274i;

    /* renamed from: k */
    private static volatile C63010eb f43275k;

    /* renamed from: a */
    public C14216b f43276a;

    /* renamed from: b */
    public String f43277b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f43278c;

    /* renamed from: d */
    public C62971cq f43279d = emptyProtobufList();

    /* renamed from: e */
    public C14572oe f43280e;

    /* renamed from: f */
    public C14570oc f43281f;

    /* renamed from: g */
    public int f43282g;

    /* renamed from: h */
    public C14627qf f43283h;

    /* renamed from: j */
    private byte f43284j = 2;

    static {
        C14307ej ejVar = new C14307ej();
        f43274i = ejVar;
        C62942bv.registerDefaultInstance(C14307ej.class, ejVar);
    }

    private C14307ej() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43284j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43284j = b;
                return null;
            case 2:
                return newMessageInfo(f43274i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0002\u0001\t\u0002Ȉ\u0003\f\u0004Л\u0005Љ\u0006\t\u0007\f\b\t", new Object[]{"a", "b", C45240c.f118157a, "d", C14292dv.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C14307ej();
            case 4:
                return new C14306ei();
            case 5:
                return f43274i;
            case 6:
                C63010eb ebVar = f43275k;
                if (ebVar == null) {
                    synchronized (C14307ej.class) {
                        ebVar = f43275k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43274i);
                            f43275k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
