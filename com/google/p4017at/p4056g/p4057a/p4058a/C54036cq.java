package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62441br;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.cq */
/* compiled from: PG */
public final class C54036cq extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C54036cq f141772i;

    /* renamed from: j */
    private static volatile C63010eb f141773j;

    /* renamed from: a */
    public int f141774a;

    /* renamed from: b */
    public int f141775b;

    /* renamed from: c */
    public int f141776c;

    /* renamed from: d */
    public int f141777d;

    /* renamed from: e */
    public int f141778e;

    /* renamed from: f */
    public float f141779f;

    /* renamed from: g */
    public String f141780g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62441br f141781h;

    static {
        C54036cq cqVar = new C54036cq();
        f141772i = cqVar;
        C62942bv.registerDefaultInstance(C54036cq.class, cqVar);
    }

    private C54036cq() {
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
                return newMessageInfo(f141772i, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0001\bȈ\t\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C54036cq();
            case 4:
                return new C54035cp();
            case 5:
                return f141772i;
            case 6:
                C63010eb ebVar = f141773j;
                if (ebVar == null) {
                    synchronized (C54036cq.class) {
                        ebVar = f141773j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141772i);
                            f141773j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
