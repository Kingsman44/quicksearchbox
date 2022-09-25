package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4887at.C63815b;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.p */
/* compiled from: PG */
public final class C80436p extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C80436p f220766g;

    /* renamed from: i */
    private static volatile C63010eb f220767i;

    /* renamed from: a */
    public int f220768a;

    /* renamed from: b */
    public C62971cq f220769b = emptyProtobufList();

    /* renamed from: c */
    public C63815b f220770c;

    /* renamed from: d */
    public C80430j f220771d;

    /* renamed from: e */
    public C80442v f220772e;

    /* renamed from: f */
    public boolean f220773f;

    /* renamed from: h */
    private byte f220774h = 2;

    static {
        C80436p pVar = new C80436p();
        f220766g = pVar;
        C62942bv.registerDefaultInstance(C80436p.class, pVar);
    }

    private C80436p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220774h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220774h = b;
                return null;
            case 2:
                return newMessageInfo(f220766g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0002\u0001Л\u0004ᐉ\u0001\u0005ဉ\u0003\u0006ဉ\u0004\tဇ\u0006", new Object[]{"a", "b", C80417ai.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C80436p();
            case 4:
                return new C80435o();
            case 5:
                return f220766g;
            case 6:
                C63010eb ebVar = f220767i;
                if (ebVar == null) {
                    synchronized (C80436p.class) {
                        ebVar = f220767i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220766g);
                            f220767i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
