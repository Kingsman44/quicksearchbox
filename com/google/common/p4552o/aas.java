package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4563i.C59937cs;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.aas */
/* compiled from: PG */
public final class aas extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final aas f158145p;

    /* renamed from: q */
    private static volatile C63010eb f158146q;

    /* renamed from: a */
    public int f158147a;

    /* renamed from: b */
    public aak f158148b;

    /* renamed from: c */
    public acb f158149c;

    /* renamed from: d */
    public acp f158150d;

    /* renamed from: e */
    public acf f158151e;

    /* renamed from: f */
    public C60703zs f158152f;

    /* renamed from: g */
    public C63088z f158153g = C63088z.f170246b;

    /* renamed from: h */
    public aao f158154h;

    /* renamed from: i */
    public C59961k f158155i;

    /* renamed from: j */
    public aac f158156j;

    /* renamed from: k */
    public ach f158157k;

    /* renamed from: l */
    public aaw f158158l;

    /* renamed from: m */
    public C59937cs f158159m;

    /* renamed from: n */
    public aba f158160n;

    /* renamed from: o */
    public C63088z f158161o = C63088z.f170246b;

    static {
        aas aas = new aas();
        f158145p = aas;
        C62942bv.registerDefaultInstance(aas.class, aas);
    }

    private aas() {
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
                return newMessageInfo(f158145p, "\u0001\u000e\u0000\u0001\u0002\u0018\u000e\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\tဉ\b\fဉ\u000b\u000eည\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0016ဉ\u0014\u0017ဉ\u0015\u0018ည\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new aas();
            case 4:
                return new aar();
            case 5:
                return f158145p;
            case 6:
                C63010eb ebVar = f158146q;
                if (ebVar == null) {
                    synchronized (aas.class) {
                        ebVar = f158146q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158145p);
                            f158146q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
