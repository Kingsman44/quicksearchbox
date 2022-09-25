package com.google.p335a.p336a;

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

/* renamed from: com.google.a.a.p */
/* compiled from: PG */
public final class C6594p extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C6594p f19600j;

    /* renamed from: k */
    private static volatile C63010eb f19601k;

    /* renamed from: a */
    public int f19602a;

    /* renamed from: b */
    public C6580b f19603b;

    /* renamed from: c */
    public String f19604c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f19605d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public boolean f19606e;

    /* renamed from: f */
    public C62971cq f19607f = emptyProtobufList();

    /* renamed from: g */
    public String f19608g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f19609h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f19610i = BuildConfig.FLAVOR;

    static {
        C6594p pVar = new C6594p();
        f19600j = pVar;
        C62942bv.registerDefaultInstance(C6594p.class, pVar);
    }

    private C6594p() {
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
                return newMessageInfo(f19600j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဇ\u0002\u0007\u001b\bဈ\u0003\tဈ\u0004\nဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C6594p.class, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C6594p();
            case 4:
                return new C6593o();
            case 5:
                return f19600j;
            case 6:
                C63010eb ebVar = f19601k;
                if (ebVar == null) {
                    synchronized (C6594p.class) {
                        ebVar = f19601k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19600j);
                            f19601k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
