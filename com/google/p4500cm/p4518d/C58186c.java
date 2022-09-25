package com.google.p4500cm.p4518d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58162n;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58164p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.d.c */
/* compiled from: PG */
public final class C58186c extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C58186c f155565i;

    /* renamed from: k */
    private static volatile C63010eb f155566k;

    /* renamed from: a */
    public int f155567a;

    /* renamed from: b */
    public C58188e f155568b;

    /* renamed from: c */
    public long f155569c;

    /* renamed from: d */
    public long f155570d;

    /* renamed from: e */
    public long f155571e;

    /* renamed from: f */
    public C62971cq f155572f;

    /* renamed from: g */
    public int f155573g;

    /* renamed from: h */
    public C58162n f155574h;

    /* renamed from: j */
    private byte f155575j = 2;

    static {
        C58186c cVar = new C58186c();
        f155565i = cVar;
        C62942bv.registerDefaultInstance(C58186c.class, cVar);
    }

    private C58186c() {
        emptyProtobufList();
        this.f155572f = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155575j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155575j = b;
                return null;
            case 2:
                return newMessageInfo(f155565i, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0006\u001b\u0007ဂ\u0003\bဉ\n\u000eဌ\t", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C58164p.class, "e", C19618h.f54585a, C30325g.f82003a, C58185b.f155564a});
            case 3:
                return new C58186c();
            case 4:
                return new C58177a();
            case 5:
                return f155565i;
            case 6:
                C63010eb ebVar = f155566k;
                if (ebVar == null) {
                    synchronized (C58186c.class) {
                        ebVar = f155566k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155565i);
                            f155566k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
