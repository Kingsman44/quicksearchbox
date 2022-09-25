package com.google.android.apps.p489g.p493c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7799kj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.c.f */
/* compiled from: PG */
public final class C9133f extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C9133f f31429j;

    /* renamed from: l */
    private static volatile C63010eb f31430l;

    /* renamed from: a */
    public int f31431a;

    /* renamed from: b */
    public C7718hj f31432b;

    /* renamed from: c */
    public C7799kj f31433c;

    /* renamed from: d */
    public boolean f31434d;

    /* renamed from: e */
    public boolean f31435e;

    /* renamed from: f */
    public long f31436f;

    /* renamed from: g */
    public long f31437g;

    /* renamed from: h */
    public C62964ck f31438h = emptyLongList();

    /* renamed from: i */
    public int f31439i;

    /* renamed from: k */
    private byte f31440k = 2;

    static {
        C9133f fVar = new C9133f();
        f31429j = fVar;
        C62942bv.registerDefaultInstance(C9133f.class, fVar);
    }

    private C9133f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31440k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31440k = b;
                return null;
            case 2:
                return newMessageInfo(f31429j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0007ဂ\u0006\b\u0014\tင\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C9133f();
            case 4:
                return new C9132e();
            case 5:
                return f31429j;
            case 6:
                C63010eb ebVar = f31430l;
                if (ebVar == null) {
                    synchronized (C9133f.class) {
                        ebVar = f31430l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31429j);
                            f31430l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
