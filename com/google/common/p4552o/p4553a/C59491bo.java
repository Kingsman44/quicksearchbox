package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80239cf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
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

/* renamed from: com.google.common.o.a.bo */
/* compiled from: PG */
public final class C59491bo extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C59491bo f157839m;

    /* renamed from: n */
    private static volatile C63010eb f157840n;

    /* renamed from: a */
    public int f157841a;

    /* renamed from: b */
    public int f157842b = 0;

    /* renamed from: c */
    public Object f157843c;

    /* renamed from: d */
    public int f157844d;

    /* renamed from: e */
    public int f157845e;

    /* renamed from: f */
    public int f157846f;

    /* renamed from: g */
    public int f157847g;

    /* renamed from: h */
    public C59490bn f157848h;

    /* renamed from: i */
    public String f157849i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C62971cq f157850j = emptyProtobufList();

    /* renamed from: k */
    public C59488bl f157851k;

    /* renamed from: l */
    public int f157852l;

    static {
        C59491bo boVar = new C59491bo();
        f157839m = boVar;
        C62942bv.registerDefaultInstance(C59491bo.class, boVar);
    }

    private C59491bo() {
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
                return newMessageInfo(f157839m, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0002\u0003်\u0000\u0004ြ\u0000\u0005ဌ\u0005\u0006ဉ\u0006\u0007ဈ\u0007\b\u001b\tဉ\b\nဌ\u0001\u000bင\t", new Object[]{C45240c.f118157a, "b", "a", "d", C80267v.m128111b(), C10662f.f35572a, C80201av.m128094b(), C59484bh.class, C30325g.f82003a, C80239cf.f220132a, C19618h.f54585a, "i", "j", C59486bj.class, C19621k.f54601a, "e", C80248co.m128105b(), "l"});
            case 3:
                return new C59491bo();
            case 4:
                return new C59482bf();
            case 5:
                return f157839m;
            case 6:
                C63010eb ebVar = f157840n;
                if (ebVar == null) {
                    synchronized (C59491bo.class) {
                        ebVar = f157840n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157839m);
                            f157840n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
