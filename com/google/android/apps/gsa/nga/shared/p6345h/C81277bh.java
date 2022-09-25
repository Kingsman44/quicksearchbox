package com.google.android.apps.gsa.nga.shared.p6345h;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49917du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bh */
/* compiled from: PG */
public final class C81277bh extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C81277bh f222481m;

    /* renamed from: n */
    private static volatile C63010eb f222482n;

    /* renamed from: a */
    public int f222483a;

    /* renamed from: b */
    public boolean f222484b;

    /* renamed from: c */
    public boolean f222485c;

    /* renamed from: d */
    public String f222486d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f222487e;

    /* renamed from: f */
    public int f222488f;

    /* renamed from: g */
    public String f222489g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f222490h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f222491i;

    /* renamed from: j */
    public int f222492j;

    /* renamed from: k */
    public long f222493k;

    /* renamed from: l */
    public C62995dn f222494l = C62995dn.f170057a;

    static {
        C81277bh bhVar = new C81277bh();
        f222481m = bhVar;
        C62942bv.registerDefaultInstance(C81277bh.class, bhVar);
    }

    private C81277bh() {
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
                return newMessageInfo(f222481m, "\u0001\u000b\u0000\u0001\u0001Ϩ\u000b\u0001\u0000\u0000\u0001ဇ\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဌ\b\tဂ\t\u000bဇ\u0001\fဇ\u0007Ϩ2", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C49917du.f129745a, C30325g.f82003a, C19618h.f54585a, "j", C81275bf.f222479a, C19621k.f54601a, C45240c.f118157a, "i", "l", C81276bg.f222480a});
            case 3:
                return new C81277bh();
            case 4:
                return new C81274be();
            case 5:
                return f222481m;
            case 6:
                C63010eb ebVar = f222482n;
                if (ebVar == null) {
                    synchronized (C81277bh.class) {
                        ebVar = f222482n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222481m);
                            f222482n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
