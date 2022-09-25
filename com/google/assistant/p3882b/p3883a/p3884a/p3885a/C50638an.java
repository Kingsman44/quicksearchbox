package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.an */
/* compiled from: PG */
public final class C50638an extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50638an f131726h;

    /* renamed from: i */
    private static volatile C63010eb f131727i;

    /* renamed from: a */
    public int f131728a;

    /* renamed from: b */
    public C62971cq f131729b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f131730c = emptyProtobufList();

    /* renamed from: d */
    public long f131731d;

    /* renamed from: e */
    public long f131732e;

    /* renamed from: f */
    public boolean f131733f;

    /* renamed from: g */
    public boolean f131734g;

    static {
        C50638an anVar = new C50638an();
        f131726h = anVar;
        C62942bv.registerDefaultInstance(C50638an.class, anVar);
    }

    private C50638an() {
    }

    /* renamed from: a */
    public final void mo53415a() {
        C62971cq cqVar = this.f131729b;
        if (!cqVar.mo58948c()) {
            this.f131729b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo53416b() {
        C62971cq cqVar = this.f131730c;
        if (!cqVar.mo58948c()) {
            this.f131730c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f131726h, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001b\u0002\u0002\u0003\u0002\u0004ဇ\u0000\u0005\u001b\u0006ဇ\u0001", new Object[]{"a", "b", C50662y.class, "d", "e", C10662f.f35572a, C45240c.f118157a, C50662y.class, C30325g.f82003a});
            case 3:
                return new C50638an();
            case 4:
                return new C50637am();
            case 5:
                return f131726h;
            case 6:
                C63010eb ebVar = f131727i;
                if (ebVar == null) {
                    synchronized (C50638an.class) {
                        ebVar = f131727i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131726h);
                            f131727i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
