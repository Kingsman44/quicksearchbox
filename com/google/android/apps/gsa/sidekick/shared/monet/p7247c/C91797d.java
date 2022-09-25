package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.d */
/* compiled from: PG */
public final class C91797d extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C91797d f255987l;

    /* renamed from: n */
    private static volatile C63010eb f255988n;

    /* renamed from: a */
    public int f255989a;

    /* renamed from: b */
    public C7718hj f255990b;

    /* renamed from: c */
    public C62971cq f255991c = emptyProtobufList();

    /* renamed from: d */
    public C7718hj f255992d;

    /* renamed from: e */
    public int f255993e;

    /* renamed from: f */
    public int f255994f;

    /* renamed from: g */
    public int f255995g = -1;

    /* renamed from: h */
    public int f255996h = -1;

    /* renamed from: i */
    public C7669fo f255997i;

    /* renamed from: j */
    public C7669fo f255998j;

    /* renamed from: k */
    public int f255999k;

    /* renamed from: m */
    private byte f256000m = 2;

    static {
        C91797d dVar = new C91797d();
        f255987l = dVar;
        C62942bv.registerDefaultInstance(C91797d.class, dVar);
    }

    private C91797d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f256000m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f256000m = b;
                return null;
            case 2:
                return newMessageInfo(f255987l, "\u0001\n\u0000\u0001\u0002\u000f\n\u0000\u0001\u0003\u0002ᐉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\bᐉ\u0000\tЛ\nဉ\u0007\u000eဉ\b\u000fဌ\t", new Object[]{"a", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "b", C45240c.f118157a, C7718hj.class, "i", "j", C19621k.f54601a, C8142xb.m22955b()});
            case 3:
                return new C91797d();
            case 4:
                return new C91796c();
            case 5:
                return f255987l;
            case 6:
                C63010eb ebVar = f255988n;
                if (ebVar == null) {
                    synchronized (C91797d.class) {
                        ebVar = f255988n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255987l);
                            f255988n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
