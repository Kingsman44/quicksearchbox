package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.p9330a.C123703a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.p9330a.C123705c;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.av */
/* compiled from: PG */
public final class C123728av extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C123728av f341753l;

    /* renamed from: n */
    private static volatile C63010eb f341754n;

    /* renamed from: a */
    public int f341755a;

    /* renamed from: b */
    public String f341756b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f341757c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f341758d = emptyProtobufList();

    /* renamed from: e */
    public long f341759e;

    /* renamed from: f */
    public String f341760f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f341761g;

    /* renamed from: h */
    public int f341762h;

    /* renamed from: i */
    public C63037fb f341763i;

    /* renamed from: j */
    public long f341764j;

    /* renamed from: k */
    public long f341765k;

    /* renamed from: m */
    private byte f341766m = 2;

    static {
        C123728av avVar = new C123728av();
        f341753l = avVar;
        C62942bv.registerDefaultInstance(C123728av.class, avVar);
    }

    private C123728av() {
    }

    /* renamed from: a */
    public final void mo106113a() {
        C62971cq cqVar = this.f341758d;
        if (!cqVar.mo58948c()) {
            this.f341758d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341766m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341766m = b;
                return null;
            case 2:
                return newMessageInfo(f341753l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဌ\u0005\bဉ\u0006\tဂ\u0007\nဂ\b", new Object[]{"a", "b", "d", C52560wg.class, C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C123705c.f341679a, C19618h.f54585a, C123703a.f341678a, "i", "j", C19621k.f54601a});
            case 3:
                return new C123728av();
            case 4:
                return new C123727au();
            case 5:
                return f341753l;
            case 6:
                C63010eb ebVar = f341754n;
                if (ebVar == null) {
                    synchronized (C123728av.class) {
                        ebVar = f341754n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341753l);
                            f341754n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
