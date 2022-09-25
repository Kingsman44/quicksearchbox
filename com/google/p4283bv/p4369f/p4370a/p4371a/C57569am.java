package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.am */
/* compiled from: PG */
public final class C57569am extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57569am f153797f;

    /* renamed from: i */
    private static volatile C63010eb f153798i;

    /* renamed from: a */
    public int f153799a = 0;

    /* renamed from: b */
    public Object f153800b;

    /* renamed from: c */
    public C57663x f153801c;

    /* renamed from: d */
    public String f153802d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C57661v f153803e;

    /* renamed from: g */
    private C62995dn f153804g = C62995dn.f170057a;

    /* renamed from: h */
    private byte f153805h = 2;

    static {
        C57569am amVar = new C57569am();
        f153797f = amVar;
        C62942bv.registerDefaultInstance(C57569am.class, amVar);
    }

    private C57569am() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153805h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153805h = b;
                return null;
            case 2:
                return newMessageInfo(f153797f, "\u0000\u0017\u0001\u0000\u0002)\u0017\u0001\u0000\u0004\u0002м\u0000\u0003Ȉ\b2\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u0011Љ\u0013\t\u0014<\u0000\u0015<\u0000\u0016м\u0000\u0017<\u0000\u0019<\u0000\u001a<\u0000\u001e<\u0000!м\u0000\"<\u0000$<\u0000&<\u0000'<\u0000)<\u0000", new Object[]{"b", "a", C57590bg.class, "d", C30325g.f82003a, C57568al.f153796a, C57643df.class, C57659t.class, C57641dd.class, C57558ab.class, C57562af.class, C45240c.f118157a, "e", C57560ad.class, C57593bj.class, C57657r.class, C57622cl.class, C57607bx.class, C57645f.class, C57634cx.class, C57655p.class, C57632cv.class, C57650k.class, C57628cr.class, C57630ct.class, C57639db.class});
            case 3:
                return new C57569am();
            case 4:
                return new C57567ak();
            case 5:
                return f153797f;
            case 6:
                C63010eb ebVar = f153798i;
                if (ebVar == null) {
                    synchronized (C57569am.class) {
                        ebVar = f153798i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153797f);
                            f153798i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
