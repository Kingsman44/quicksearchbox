package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.cc */
/* compiled from: PG */
public final class C103877cc extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C103877cc f289164m;

    /* renamed from: n */
    private static volatile C63010eb f289165n;

    /* renamed from: a */
    public int f289166a;

    /* renamed from: b */
    public String f289167b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f289168c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63042fg f289169d;

    /* renamed from: e */
    public String f289170e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f289171f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f289172g;

    /* renamed from: h */
    public C103876cb f289173h;

    /* renamed from: i */
    public C103876cb f289174i;

    /* renamed from: j */
    public C103876cb f289175j;

    /* renamed from: k */
    public C103876cb f289176k;

    /* renamed from: l */
    public C62971cq f289177l = emptyProtobufList();

    static {
        C103877cc ccVar = new C103877cc();
        f289164m = ccVar;
        C62942bv.registerDefaultInstance(C103877cc.class, ccVar);
    }

    private C103877cc() {
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
                return newMessageInfo(f289164m, "\u0001\u000b\u0000\u0001\u0001h\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\b\u001b\tဇ\u0005eဉ\u0006fဉ\u0007gဉ\bhဉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, "l", C103872by.class, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C103877cc();
            case 4:
                return new C103870bw();
            case 5:
                return f289164m;
            case 6:
                C63010eb ebVar = f289165n;
                if (ebVar == null) {
                    synchronized (C103877cc.class) {
                        ebVar = f289165n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f289164m);
                            f289165n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
