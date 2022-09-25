package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57366ar;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57414cl;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57448ds;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.ai.b.oe */
/* compiled from: PG */
public final class C7902oe extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C7902oe f27767i;

    /* renamed from: j */
    public static final C62940bt f27768j;

    /* renamed from: l */
    private static volatile C63010eb f27769l;

    /* renamed from: a */
    public int f27770a;

    /* renamed from: b */
    public C57414cl f27771b;

    /* renamed from: c */
    public String f27772c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f27773d = true;

    /* renamed from: e */
    public C57448ds f27774e;

    /* renamed from: f */
    public C7536ax f27775f;

    /* renamed from: g */
    public C7669fo f27776g;

    /* renamed from: h */
    public boolean f27777h;

    /* renamed from: k */
    private byte f27778k = 2;

    static {
        C7902oe oeVar = new C7902oe();
        f27767i = oeVar;
        C62942bv.registerDefaultInstance(C7902oe.class, oeVar);
        f27768j = C62942bv.newSingularGeneratedExtension(C57366ar.f153251a, oeVar, oeVar, (C62958ce) null, 214621521, C63066gd.MESSAGE, C7902oe.class);
    }

    private C7902oe() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27778k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27778k = b;
                return null;
            case 2:
                return newMessageInfo(f27767i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဉ\u0005\u0006ဇ\u0002\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, "d", C19618h.f54585a});
            case 3:
                return new C7902oe();
            case 4:
                return new C7901od();
            case 5:
                return f27767i;
            case 6:
                C63010eb ebVar = f27769l;
                if (ebVar == null) {
                    synchronized (C7902oe.class) {
                        ebVar = f27769l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27767i);
                            f27769l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
