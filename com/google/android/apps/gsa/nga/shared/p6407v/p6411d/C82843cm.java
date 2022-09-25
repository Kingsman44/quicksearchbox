package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.nlp.p4735b.p4736a.C62841h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.cm */
/* compiled from: PG */
public final class C82843cm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C82843cm f225889f;

    /* renamed from: i */
    private static volatile C63010eb f225890i;

    /* renamed from: a */
    public C61752n f225891a;

    /* renamed from: b */
    public C62841h f225892b;

    /* renamed from: c */
    public C62995dn f225893c = C62995dn.f170057a;

    /* renamed from: d */
    public int f225894d;

    /* renamed from: e */
    public C82988hw f225895e;

    /* renamed from: g */
    private C83001j f225896g;

    /* renamed from: h */
    private byte f225897h = 2;

    static {
        C82843cm cmVar = new C82843cm();
        f225889f = cmVar;
        C62942bv.registerDefaultInstance(C82843cm.class, cmVar);
    }

    private C82843cm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225897h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225897h = b;
                return null;
            case 2:
                return newMessageInfo(f225889f, "\u0000\u0006\u0000\u0000\u0002\t\u0006\u0001\u0000\u0003\u00022\u0004\f\u0006\t\u0007Љ\bЉ\tЉ", new Object[]{C45240c.f118157a, C82842cl.f225888a, "d", C30325g.f82003a, "a", "e", "b"});
            case 3:
                return new C82843cm();
            case 4:
                return new C82841ck();
            case 5:
                return f225889f;
            case 6:
                C63010eb ebVar = f225890i;
                if (ebVar == null) {
                    synchronized (C82843cm.class) {
                        ebVar = f225890i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225889f);
                            f225890i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
