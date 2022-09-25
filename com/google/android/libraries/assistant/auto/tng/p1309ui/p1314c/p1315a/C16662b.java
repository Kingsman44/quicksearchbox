package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a;

import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16648m;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16656u;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16658w;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16660y;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.b */
/* compiled from: PG */
public final class C16662b extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C16662b f48800l;

    /* renamed from: n */
    private static volatile C63010eb f48801n;

    /* renamed from: a */
    public int f48802a;

    /* renamed from: b */
    public boolean f48803b;

    /* renamed from: c */
    public C62971cq f48804c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f48805d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f48806e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f48807f = emptyProtobufList();

    /* renamed from: g */
    public boolean f48808g;

    /* renamed from: h */
    public C62971cq f48809h = emptyProtobufList();

    /* renamed from: i */
    public C54201r f48810i;

    /* renamed from: j */
    public C51953ff f48811j;

    /* renamed from: k */
    public boolean f48812k;

    /* renamed from: m */
    private byte f48813m = 2;

    static {
        C16662b bVar = new C16662b();
        f48800l = bVar;
        C62942bv.registerDefaultInstance(C16662b.class, bVar);
    }

    private C16662b() {
    }

    /* renamed from: a */
    public final void mo22949a() {
        C62971cq cqVar = this.f48804c;
        if (!cqVar.mo58948c()) {
            this.f48804c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo22950b() {
        C62971cq cqVar = this.f48805d;
        if (!cqVar.mo58948c()) {
            this.f48805d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: c */
    public final void mo22951c() {
        C62971cq cqVar = this.f48809h;
        if (!cqVar.mo58948c()) {
            this.f48809h = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48813m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48813m = b;
                return null;
            case 2:
                return newMessageInfo(f48800l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0005\u0007\u0001ဇ\u0000\u0002Л\u0003Л\u0004Л\u0006Л\u0007ဇ\u0001\bЛ\tᐉ\u0002\nᐉ\u0003\u000bဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, C16648m.class, "d", C16658w.class, "e", C16646k.class, C10662f.f35572a, C16656u.class, C30325g.f82003a, C19618h.f54585a, C16660y.class, "i", "j", C19621k.f54601a});
            case 3:
                return new C16662b();
            case 4:
                return new C16627a();
            case 5:
                return f48800l;
            case 6:
                C63010eb ebVar = f48801n;
                if (ebVar == null) {
                    synchronized (C16662b.class) {
                        ebVar = f48801n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48800l);
                            f48801n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
