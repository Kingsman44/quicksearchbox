package com.google.android.apps.gsa.nga.shared.p6339f.p6342c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.c.b */
/* compiled from: PG */
public final class C81044b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C81044b f222115h;

    /* renamed from: j */
    private static volatile C63010eb f222116j;

    /* renamed from: a */
    public int f222117a;

    /* renamed from: b */
    public int f222118b = 0;

    /* renamed from: c */
    public Object f222119c;

    /* renamed from: d */
    public C81052j f222120d;

    /* renamed from: e */
    public C81054l f222121e;

    /* renamed from: f */
    public C81056n f222122f;

    /* renamed from: g */
    public C81058p f222123g;

    /* renamed from: i */
    private byte f222124i = 2;

    static {
        C81044b bVar = new C81044b();
        f222115h = bVar;
        C62942bv.registerDefaultInstance(C81044b.class, bVar);
    }

    private C81044b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f222124i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f222124i = b;
                return null;
            case 2:
                return newMessageInfo(f222115h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ြ\u0000\u0006ဉ\u0005", new Object[]{C45240c.f118157a, "b", "a", C81046d.class, "d", "e", C10662f.f35572a, C81050h.class, C30325g.f82003a});
            case 3:
                return new C81044b();
            case 4:
                return new C81043a();
            case 5:
                return f222115h;
            case 6:
                C63010eb ebVar = f222116j;
                if (ebVar == null) {
                    synchronized (C81044b.class) {
                        ebVar = f222116j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222115h);
                            f222116j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
