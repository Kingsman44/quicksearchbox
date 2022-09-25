package com.google.assistant.p3897e.p3921j;

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

/* renamed from: com.google.assistant.e.j.ia */
/* compiled from: PG */
public final class C52176ia extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C52176ia f136911k;

    /* renamed from: m */
    private static volatile C63010eb f136912m;

    /* renamed from: a */
    public int f136913a;

    /* renamed from: b */
    public C62971cq f136914b = emptyProtobufList();

    /* renamed from: c */
    public boolean f136915c;

    /* renamed from: d */
    public int f136916d;

    /* renamed from: e */
    public long f136917e;

    /* renamed from: f */
    public int f136918f;

    /* renamed from: g */
    public boolean f136919g;

    /* renamed from: h */
    public double f136920h;

    /* renamed from: i */
    public C52407qp f136921i;

    /* renamed from: j */
    public int f136922j;

    /* renamed from: l */
    private byte f136923l = 2;

    static {
        C52176ia iaVar = new C52176ia();
        f136911k = iaVar;
        C62942bv.registerDefaultInstance(C52176ia.class, iaVar);
    }

    private C52176ia() {
    }

    /* renamed from: a */
    public final void mo53812a() {
        C62971cq cqVar = this.f136914b;
        if (!cqVar.mo58948c()) {
            this.f136914b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136923l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136923l = b;
                return null;
            case 2:
                return newMessageInfo(f136911k, "\u0001\t\u0000\u0001\u0002\f\t\u0000\u0001\u0001\u0002Л\u0004ဇ\u0001\u0005င\u0003\u0006ဂ\u0004\u0007ဌ\u0005\tဇ\u0007\nက\b\u000bဉ\t\fင\n", new Object[]{"a", "b", C52174hz.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C52200iy.f137002a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C52176ia();
            case 4:
                return new C52170hv();
            case 5:
                return f136911k;
            case 6:
                C63010eb ebVar = f136912m;
                if (ebVar == null) {
                    synchronized (C52176ia.class) {
                        ebVar = f136912m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136911k);
                            f136912m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
