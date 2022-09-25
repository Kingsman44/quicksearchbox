package com.google.assistant.p3861at;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48384r;
import com.google.assistant.p3825an.p3830c.p3831a.C49349z;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.ao */
/* compiled from: PG */
public final class C49830ao extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C49830ao f129482j;

    /* renamed from: k */
    private static volatile C63010eb f129483k;

    /* renamed from: a */
    public int f129484a;

    /* renamed from: b */
    public int f129485b = 0;

    /* renamed from: c */
    public Object f129486c;

    /* renamed from: d */
    public int f129487d;

    /* renamed from: e */
    public C51058ev f129488e;

    /* renamed from: f */
    public C62971cq f129489f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public C63088z f129490g = C63088z.f170246b;

    /* renamed from: h */
    public C48384r f129491h;

    /* renamed from: i */
    public C49840ay f129492i;

    static {
        C49830ao aoVar = new C49830ao();
        f129482j = aoVar;
        C62942bv.registerDefaultInstance(C49830ao.class, aoVar);
    }

    private C49830ao() {
    }

    /* renamed from: a */
    public final void mo53366a() {
        C62971cq cqVar = this.f129489f;
        if (!cqVar.mo58948c()) {
            this.f129489f = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f129482j, "\u0001\t\u0001\u0001\u0002\n\t\u0000\u0001\u0000\u0002ဉ\u0002\u0003\u001a\u0004ျ\u0000\u0005ဌ\u0000\u0006ြ\u0000\u0007ည\u0006\bဉ\u0007\tဉ\b\nြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "e", C10662f.f35572a, "d", C49349z.f127554a, C49819ae.class, C30325g.f82003a, C19618h.f54585a, "i", C49851bi.class});
            case 3:
                return new C49830ao();
            case 4:
                return new C49829an();
            case 5:
                return f129482j;
            case 6:
                C63010eb ebVar = f129483k;
                if (ebVar == null) {
                    synchronized (C49830ao.class) {
                        ebVar = f129483k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129482j);
                            f129483k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
