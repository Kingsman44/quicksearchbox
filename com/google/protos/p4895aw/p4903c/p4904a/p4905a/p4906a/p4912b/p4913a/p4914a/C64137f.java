package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a;

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

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.a.f */
/* compiled from: PG */
public final class C64137f extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C64137f f173402k;

    /* renamed from: l */
    private static volatile C63010eb f173403l;

    /* renamed from: a */
    public int f173404a;

    /* renamed from: b */
    public int f173405b = 0;

    /* renamed from: c */
    public Object f173406c;

    /* renamed from: d */
    public String f173407d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f173408e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f173409f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f173410g = emptyProtobufList();

    /* renamed from: h */
    public C62971cq f173411h = emptyProtobufList();

    /* renamed from: i */
    public int f173412i;

    /* renamed from: j */
    public int f173413j;

    static {
        C64137f fVar = new C64137f();
        f173402k = fVar;
        C62942bv.registerDefaultInstance(C64137f.class, fVar);
    }

    private C64137f() {
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
                return newMessageInfo(f173402k, "\u0001\t\u0001\u0001\u0001e\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006ဌ\u0003\u0007ဌ\u0004dြ\u0000eြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C64139h.class, C19618h.f54585a, C64147p.class, "i", C64133b.f173400a, "j", C64135d.f173401a, C64150s.class, C64153v.class});
            case 3:
                return new C64137f();
            case 4:
                return new C64132a();
            case 5:
                return f173402k;
            case 6:
                C63010eb ebVar = f173403l;
                if (ebVar == null) {
                    synchronized (C64137f.class) {
                        ebVar = f173403l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173402k);
                            f173403l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
