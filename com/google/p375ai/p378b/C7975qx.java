package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57054b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.qx */
/* compiled from: PG */
public final class C7975qx extends C62937bq implements C62938br {

    /* renamed from: u */
    public static final C7975qx f28007u;

    /* renamed from: w */
    private static volatile C63010eb f28008w;

    /* renamed from: a */
    public int f28009a;

    /* renamed from: b */
    public String f28010b;

    /* renamed from: c */
    public String f28011c;

    /* renamed from: d */
    public boolean f28012d;

    /* renamed from: e */
    public boolean f28013e;

    /* renamed from: f */
    public boolean f28014f;

    /* renamed from: g */
    public C7801kl f28015g;

    /* renamed from: h */
    public long f28016h;

    /* renamed from: i */
    public int f28017i;

    /* renamed from: j */
    public String f28018j;

    /* renamed from: k */
    public int f28019k;

    /* renamed from: l */
    public int f28020l;

    /* renamed from: m */
    public boolean f28021m;

    /* renamed from: n */
    public boolean f28022n;

    /* renamed from: o */
    public boolean f28023o;

    /* renamed from: p */
    public boolean f28024p;

    /* renamed from: q */
    public int f28025q;

    /* renamed from: r */
    public boolean f28026r;

    /* renamed from: s */
    public boolean f28027s;

    /* renamed from: t */
    public boolean f28028t;

    /* renamed from: v */
    private byte f28029v = 2;

    static {
        C7975qx qxVar = new C7975qx();
        f28007u = qxVar;
        C62942bv.registerDefaultInstance(C7975qx.class, qxVar);
    }

    private C7975qx() {
        emptyProtobufList();
        emptyProtobufList();
        this.f28010b = BuildConfig.FLAVOR;
        this.f28011c = BuildConfig.FLAVOR;
        this.f28012d = true;
        this.f28013e = true;
        this.f28018j = BuildConfig.FLAVOR;
        this.f28020l = 1;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28029v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28029v = b;
                return null;
            case 2:
                return newMessageInfo(f28007u, "\u0001\u0013\u0000\u0001\u0002\u0019\u0013\u0000\u0000\u0000\u0002ဈ\u0000\u0004ဇ\u0003\u0005ဉ\u0006\u0006ဂ\u0007\u0007င\b\bဇ\u0005\tင\n\nဌ\u000b\u000bဈ\t\rဇ\f\u000eဇ\u0004\u0010ဈ\u0001\u0011ဇ\r\u0012ဇ\u000e\u0013ဇ\u000f\u0014င\u0010\u0015ဇ\u0011\u0018ဇ\u0014\u0019ဇ\u0015", new Object[]{"a", "b", "d", C30325g.f82003a, C19618h.f54585a, "i", C10662f.f35572a, C19621k.f54601a, "l", C57054b.f152309a, "j", "m", "e", C45240c.f118157a, C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a});
            case 3:
                return new C7975qx();
            case 4:
                return new C7974qw();
            case 5:
                return f28007u;
            case 6:
                C63010eb ebVar = f28008w;
                if (ebVar == null) {
                    synchronized (C7975qx.class) {
                        ebVar = f28008w;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28007u);
                            f28008w = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
