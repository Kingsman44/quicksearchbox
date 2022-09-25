package com.google.protos.p4816ai.p4817a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.aqu;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.protos.ai.a.f */
/* compiled from: PG */
public final class C63192f extends C62937bq implements C62938br {

    /* renamed from: q */
    public static final C63192f f170699q;

    /* renamed from: s */
    private static volatile C63010eb f170700s;

    /* renamed from: a */
    public int f170701a;

    /* renamed from: b */
    public int f170702b = 0;

    /* renamed from: c */
    public Object f170703c;

    /* renamed from: d */
    public long f170704d;

    /* renamed from: e */
    public int f170705e;

    /* renamed from: f */
    public int f170706f;

    /* renamed from: g */
    public int f170707g;

    /* renamed from: h */
    public int f170708h;

    /* renamed from: i */
    public int f170709i;

    /* renamed from: j */
    public int f170710j;

    /* renamed from: k */
    public int f170711k;

    /* renamed from: l */
    public long f170712l;

    /* renamed from: m */
    public int f170713m = 1;

    /* renamed from: n */
    public int f170714n;

    /* renamed from: o */
    public String f170715o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public boolean f170716p;

    /* renamed from: r */
    private byte f170717r = 2;

    static {
        C63192f fVar = new C63192f();
        f170699q = fVar;
        C62942bv.registerDefaultInstance(C63192f.class, fVar);
    }

    private C63192f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f170717r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f170717r = b;
                return null;
            case 2:
                return newMessageInfo(f170699q, "\u0001\u0010\u0001\u0001\u0001\u0013\u0010\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007င\u0006\bင\u0007\tဃ\b\n့\u0000\u000bဌ\f\fဋ\r\u000eဈ\u000f\u0010ြ\u0000\u0011ဇ\u0011\u0013ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C63189c.f170697a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C63191e.f170698a, C48004n.f124238a, C66412o.f180592a, aqu.class, "p", C60214n.class});
            case 3:
                return new C63192f();
            case 4:
                return new C63188b();
            case 5:
                return f170699q;
            case 6:
                C63010eb ebVar = f170700s;
                if (ebVar == null) {
                    synchronized (C63192f.class) {
                        ebVar = f170700s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170699q);
                            f170700s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
