package com.google.android.apps.gsa.sidekick.shared.p7238g;

import com.google.android.apps.gsa.sidekick.shared.p7244m.C91762b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.g.b */
/* compiled from: PG */
public final class C91732b extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C91732b f255833m;

    /* renamed from: o */
    private static volatile C63010eb f255834o;

    /* renamed from: a */
    public int f255835a;

    /* renamed from: b */
    public boolean f255836b;

    /* renamed from: c */
    public boolean f255837c;

    /* renamed from: d */
    public boolean f255838d;

    /* renamed from: e */
    public boolean f255839e;

    /* renamed from: f */
    public C62971cq f255840f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f255841g = emptyProtobufList();

    /* renamed from: h */
    public C62971cq f255842h = emptyProtobufList();

    /* renamed from: i */
    public C91762b f255843i;

    /* renamed from: j */
    public C62971cq f255844j = emptyProtobufList();

    /* renamed from: k */
    public boolean f255845k;

    /* renamed from: l */
    public boolean f255846l;

    /* renamed from: n */
    private byte f255847n = 2;

    static {
        C91732b bVar = new C91732b();
        f255833m = bVar;
        C62942bv.registerDefaultInstance(C91732b.class, bVar);
    }

    private C91732b() {
    }

    /* renamed from: a */
    public final void mo86231a() {
        C62971cq cqVar = this.f255844j;
        if (!cqVar.mo58948c()) {
            this.f255844j = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f255847n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f255847n = b;
                return null;
            case 2:
                return newMessageInfo(f255833m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0004\u0004\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005Л\u0006Л\u0007Л\bဉ\u0004\tЛ\nဇ\u0005\u000bဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C7718hj.class, C30325g.f82003a, C91736f.class, C19618h.f54585a, C91734d.class, "i", "j", C7718hj.class, C19621k.f54601a, "l"});
            case 3:
                return new C91732b();
            case 4:
                return new C91731a();
            case 5:
                return f255833m;
            case 6:
                C63010eb ebVar = f255834o;
                if (ebVar == null) {
                    synchronized (C91732b.class) {
                        ebVar = f255834o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255833m);
                            f255834o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
