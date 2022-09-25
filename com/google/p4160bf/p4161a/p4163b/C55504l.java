package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.l */
/* compiled from: PG */
public final class C55504l extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C55504l f146467k;

    /* renamed from: l */
    private static volatile C63010eb f146468l;

    /* renamed from: a */
    public int f146469a;

    /* renamed from: b */
    public C62971cq f146470b = emptyProtobufList();

    /* renamed from: c */
    public String f146471c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f146472d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C55470bg f146473e;

    /* renamed from: f */
    public C55483bt f146474f;

    /* renamed from: g */
    public C55517y f146475g;

    /* renamed from: h */
    public long f146476h;

    /* renamed from: i */
    public long f146477i;

    /* renamed from: j */
    public C55451ao f146478j;

    static {
        C55504l lVar = new C55504l();
        f146467k = lVar;
        C62942bv.registerDefaultInstance(C55504l.class, lVar);
    }

    private C55504l() {
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
                return newMessageInfo(f146467k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဈ\u0001\u0007ဉ\u0004\tဂ\u0006\nဂ\u0007\u000bဉ\b", new Object[]{"a", "b", C55503k.class, C45240c.f118157a, "e", C10662f.f35572a, "d", C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C55504l();
            case 4:
                return new C55501i();
            case 5:
                return f146467k;
            case 6:
                C63010eb ebVar = f146468l;
                if (ebVar == null) {
                    synchronized (C55504l.class) {
                        ebVar = f146468l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146467k);
                            f146468l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
