package com.google.p4283bv.p4380j.p4385b.p4411b;

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

/* renamed from: com.google.bv.j.b.b.f */
/* compiled from: PG */
public final class C57809f extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C57809f f154448k;

    /* renamed from: l */
    private static volatile C63010eb f154449l;

    /* renamed from: a */
    public int f154450a;

    /* renamed from: b */
    public int f154451b;

    /* renamed from: c */
    public String f154452c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f154453d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f154454e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f154455f;

    /* renamed from: g */
    public String f154456g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f154457h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C62971cq f154458i = C62942bv.emptyProtobufList();

    /* renamed from: j */
    public String f154459j = BuildConfig.FLAVOR;

    static {
        C57809f fVar = new C57809f();
        f154448k = fVar;
        C62942bv.registerDefaultInstance(C57809f.class, fVar);
    }

    private C57809f() {
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
                return newMessageInfo(f154448k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0004\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0003\u0007ဈ\u0005\bဈ\u0006\t\u001a\nဈ\u0007", new Object[]{"a", "b", C57811h.m88535b(), C10662f.f35572a, C57807d.m88533b(), C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C57809f();
            case 4:
                return new C57808e();
            case 5:
                return f154448k;
            case 6:
                C63010eb ebVar = f154449l;
                if (ebVar == null) {
                    synchronized (C57809f.class) {
                        ebVar = f154449l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154448k);
                            f154449l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
