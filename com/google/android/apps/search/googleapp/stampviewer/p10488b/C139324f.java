package com.google.android.apps.search.googleapp.stampviewer.p10488b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.aml;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4242bp.p4253e.p4254a.C56193m;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.b.f */
/* compiled from: PG */
public final class C139324f extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C139324f f378925k;

    /* renamed from: m */
    private static volatile C63010eb f378926m;

    /* renamed from: a */
    public int f378927a;

    /* renamed from: b */
    public C62971cq f378928b;

    /* renamed from: c */
    public int f378929c;

    /* renamed from: d */
    public C60214n f378930d;

    /* renamed from: e */
    public aml f378931e;

    /* renamed from: f */
    public int f378932f;

    /* renamed from: g */
    public C139326h f378933g;

    /* renamed from: h */
    public boolean f378934h;

    /* renamed from: i */
    public boolean f378935i;

    /* renamed from: j */
    public int f378936j;

    /* renamed from: l */
    private byte f378937l = 2;

    static {
        C139324f fVar = new C139324f();
        f378925k = fVar;
        C62942bv.registerDefaultInstance(C139324f.class, fVar);
    }

    private C139324f() {
        emptyProtobufList();
        this.f378928b = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo114904a() {
        C62971cq cqVar = this.f378928b;
        if (!cqVar.mo58948c()) {
            this.f378928b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f378937l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f378937l = b;
                return null;
            case 2:
                return newMessageInfo(f378925k, "\u0001\t\u0000\u0001\u0002\u000b\t\u0000\u0001\u0001\u0002ဋ\u0000\u0004ᐉ\u0001\u0005ဉ\u0002\u0006ဌ\u0003\u0007ဉ\u0004\bဇ\u0005\tဇ\u0006\nဌ\u0007\u000b\u001b", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C56193m.f149721a, C30325g.f82003a, C19618h.f54585a, "i", "j", C139343y.m226484b(), "b", C56610b.class});
            case 3:
                return new C139324f();
            case 4:
                return new C139323e();
            case 5:
                return f378925k;
            case 6:
                C63010eb ebVar = f378926m;
                if (ebVar == null) {
                    synchronized (C139324f.class) {
                        ebVar = f378926m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378925k);
                            f378926m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
