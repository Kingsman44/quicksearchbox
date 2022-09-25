package com.google.android.apps.gsa.nga.engine.grammar;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.d.a.r;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.p4735b.p4736a.C62841h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.l */
/* compiled from: PG */
public final class C76134l extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C76134l f211079j;

    /* renamed from: l */
    private static volatile C63010eb f211080l;

    /* renamed from: a */
    public C80513b f211081a;

    /* renamed from: b */
    public C62971cq f211082b = emptyProtobufList();

    /* renamed from: c */
    public r f211083c;

    /* renamed from: d */
    public C62995dn f211084d = C62995dn.f170057a;

    /* renamed from: e */
    public boolean f211085e;

    /* renamed from: f */
    public String f211086f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f211087g;

    /* renamed from: h */
    public boolean f211088h;

    /* renamed from: i */
    public boolean f211089i;

    /* renamed from: k */
    private byte f211090k = 2;

    static {
        C76134l lVar = new C76134l();
        f211079j = lVar;
        C62942bv.registerDefaultInstance(C76134l.class, lVar);
    }

    private C76134l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f211090k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f211090k = b;
                return null;
            case 2:
                return newMessageInfo(f211079j, "\u0000\t\u0000\u0000\u0001\n\t\u0001\u0001\u0003\u0001Љ\u0003Љ\u00042\u0005\u0007\u0006Ȉ\u0007\u0002\b\u0007\tЛ\n\u0007", new Object[]{"a", C45240c.f118157a, "d", C76133k.f211078a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "b", C62841h.class, "i"});
            case 3:
                return new C76134l();
            case 4:
                return new C76132j();
            case 5:
                return f211079j;
            case 6:
                C63010eb ebVar = f211080l;
                if (ebVar == null) {
                    synchronized (C76134l.class) {
                        ebVar = f211080l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211079j);
                            f211080l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
