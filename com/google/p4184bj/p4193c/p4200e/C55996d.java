package com.google.p4184bj.p4193c.p4200e;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3912f.C51207b;
import com.google.assistant.p3897e.p3912f.C51213h;
import com.google.assistant.p3897e.p3912f.C51220o;
import com.google.assistant.p3897e.p3912f.C51222q;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.e.d */
/* compiled from: PG */
public final class C55996d extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55996d f149115h;

    /* renamed from: i */
    private static volatile C63010eb f149116i;

    /* renamed from: a */
    public int f149117a;

    /* renamed from: b */
    public C62971cq f149118b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f149119c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f149120d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f149121e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f149122f = emptyProtobufList();

    /* renamed from: g */
    public C51222q f149123g;

    static {
        C55996d dVar = new C55996d();
        f149115h = dVar;
        C62942bv.registerDefaultInstance(C55996d.class, dVar);
    }

    private C55996d() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo54311a() {
        C62971cq cqVar = this.f149119c;
        if (!cqVar.mo58948c()) {
            this.f149119c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f149115h, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u000bဉ\u0002\u000f\u001b", new Object[]{"a", "b", C56000h.class, C45240c.f118157a, C51220o.class, "e", C51207b.class, C10662f.f35572a, C51213h.class, C30325g.f82003a, "d", C51220o.class});
            case 3:
                return new C55996d();
            case 4:
                return new C55995c();
            case 5:
                return f149115h;
            case 6:
                C63010eb ebVar = f149116i;
                if (ebVar == null) {
                    synchronized (C55996d.class) {
                        ebVar = f149116i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149115h);
                            f149116i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
