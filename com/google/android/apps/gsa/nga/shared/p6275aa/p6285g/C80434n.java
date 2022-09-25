package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.n */
/* compiled from: PG */
public final class C80434n extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C80434n f220756h;

    /* renamed from: j */
    private static volatile C63010eb f220757j;

    /* renamed from: a */
    public int f220758a;

    /* renamed from: b */
    public C80413ae f220759b;

    /* renamed from: c */
    public String f220760c = "en-US";

    /* renamed from: d */
    public C80432l f220761d;

    /* renamed from: e */
    public boolean f220762e;

    /* renamed from: f */
    public int f220763f;

    /* renamed from: g */
    public C83320io f220764g;

    /* renamed from: i */
    private byte f220765i = 2;

    static {
        C80434n nVar = new C80434n();
        f220756h = nVar;
        C62942bv.registerDefaultInstance(C80434n.class, nVar);
    }

    private C80434n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220765i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220765i = b;
                return null;
            case 2:
                return newMessageInfo(f220756h, "\u0001\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ဇ\u0003\u0005ᐉ\u0002\u000bဉ\u0006\rဈ\u0001\u000eဌ\u0005", new Object[]{"a", "b", "e", "d", C30325g.f82003a, C45240c.f118157a, C10662f.f35572a, C80438r.m128162b()});
            case 3:
                return new C80434n();
            case 4:
                return new C80433m();
            case 5:
                return f220756h;
            case 6:
                C63010eb ebVar = f220757j;
                if (ebVar == null) {
                    synchronized (C80434n.class) {
                        ebVar = f220757j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220756h);
                            f220757j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
