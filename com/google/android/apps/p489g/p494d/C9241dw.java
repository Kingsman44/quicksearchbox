package com.google.android.apps.p489g.p494d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C7893nw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62955cb;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dw */
/* compiled from: PG */
public final class C9241dw extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C9241dw f31942h;

    /* renamed from: i */
    private static volatile C63010eb f31943i;

    /* renamed from: a */
    public int f31944a;

    /* renamed from: b */
    public C7818lb f31945b;

    /* renamed from: c */
    public C62971cq f31946c = emptyProtobufList();

    /* renamed from: d */
    public int f31947d;

    /* renamed from: e */
    public C62955cb f31948e;

    /* renamed from: f */
    public C7893nw f31949f;

    /* renamed from: g */
    public boolean f31950g;

    static {
        C9241dw dwVar = new C9241dw();
        f31942h = dwVar;
        C62942bv.registerDefaultInstance(C9241dw.class, dwVar);
    }

    private C9241dw() {
        C62942bv.emptyProtobufList();
        this.f31948e = emptyBooleanList();
    }

    /* renamed from: a */
    public final void mo17457a() {
        C62971cq cqVar = this.f31946c;
        if (!cqVar.mo58948c()) {
            this.f31946c = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f31942h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0005\u0019\u0006ဉ\u0002\u0007ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, C7818lb.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C9241dw();
            case 4:
                return new C9240dv();
            case 5:
                return f31942h;
            case 6:
                C63010eb ebVar = f31943i;
                if (ebVar == null) {
                    synchronized (C9241dw.class) {
                        ebVar = f31943i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31942h);
                            f31943i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
