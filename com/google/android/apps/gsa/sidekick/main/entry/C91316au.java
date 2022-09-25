package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.apps.gsa.sidekick.shared.util.C92005x;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.au */
/* compiled from: PG */
public final class C91316au extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C91316au f254839o;

    /* renamed from: p */
    public static final C62940bt f254840p;

    /* renamed from: q */
    private static volatile C63010eb f254841q;

    /* renamed from: a */
    public int f254842a;

    /* renamed from: b */
    public boolean f254843b;

    /* renamed from: c */
    public boolean f254844c;

    /* renamed from: d */
    public boolean f254845d;

    /* renamed from: e */
    public boolean f254846e;

    /* renamed from: f */
    public C62971cq f254847f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f254848g = emptyProtobufList();

    /* renamed from: h */
    public C62971cq f254849h = emptyProtobufList();

    /* renamed from: i */
    public int f254850i;

    /* renamed from: j */
    public int f254851j;

    /* renamed from: k */
    public int f254852k;

    /* renamed from: l */
    public C62971cq f254853l = emptyProtobufList();

    /* renamed from: m */
    public int f254854m;

    /* renamed from: n */
    public boolean f254855n;

    static {
        C91316au auVar = new C91316au();
        f254839o = auVar;
        C62942bv.registerDefaultInstance(C91316au.class, auVar);
        f254840p = C62942bv.newSingularGeneratedExtension(C91000i.f254200e, auVar, auVar, (C62958ce) null, 170546514, C63066gd.MESSAGE, C91316au.class);
    }

    private C91316au() {
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
                return newMessageInfo(f254839o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0004\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\bင\u0004\tင\u0005\nင\u0006\u000b\u001b\fင\u0007\rဇ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C92005x.class, C30325g.f82003a, C92005x.class, C19618h.f54585a, C92005x.class, "i", "j", C19621k.f54601a, "l", C92005x.class, "m", C48004n.f124238a});
            case 3:
                return new C91316au();
            case 4:
                return new C91315at();
            case 5:
                return f254839o;
            case 6:
                C63010eb ebVar = f254841q;
                if (ebVar == null) {
                    synchronized (C91316au.class) {
                        ebVar = f254841q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f254839o);
                            f254841q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
