package com.google.android.libraries.lens.view.p2067ak;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.lens.view.ak.p */
/* compiled from: PG */
public final class C25277p extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C25277p f68762g;

    /* renamed from: h */
    private static volatile C63010eb f68763h;

    /* renamed from: a */
    public C62971cq f68764a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f68765b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f68766c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f68767d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f68768e;

    /* renamed from: f */
    public C62995dn f68769f = C62995dn.f170057a;

    static {
        C25277p pVar = new C25277p();
        f68762g = pVar;
        C62942bv.registerDefaultInstance(C25277p.class, pVar);
    }

    private C25277p() {
        emptyProtobufList();
        emptyProtobufList();
        this.f68768e = emptyProtobufList();
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
                return newMessageInfo(f68762g, "\u0000\u0006\u0000\u0000\u0002\t\u0006\u0001\u0005\u0000\u00022\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\t\u001b", new Object[]{C10662f.f35572a, C25276o.f68761a, "a", C63042fg.class, "b", C63042fg.class, C45240c.f118157a, C63042fg.class, "d", C63042fg.class, "e", C63042fg.class});
            case 3:
                return new C25277p();
            case 4:
                return new C25275n();
            case 5:
                return f68762g;
            case 6:
                C63010eb ebVar = f68763h;
                if (ebVar == null) {
                    synchronized (C25277p.class) {
                        ebVar = f68763h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68762g);
                            f68763h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
