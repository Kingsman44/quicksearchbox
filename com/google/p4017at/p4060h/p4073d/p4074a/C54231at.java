package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.anf;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4440ca.p4441a.C57924d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.at.h.d.a.at */
/* compiled from: PG */
public final class C54231at extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C54231at f142359r;

    /* renamed from: v */
    private static volatile C63010eb f142360v;

    /* renamed from: a */
    public int f142361a;

    /* renamed from: b */
    public int f142362b;

    /* renamed from: c */
    public boolean f142363c;

    /* renamed from: d */
    public String f142364d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f142365e;

    /* renamed from: f */
    public boolean f142366f;

    /* renamed from: g */
    public String f142367g;

    /* renamed from: h */
    public String f142368h;

    /* renamed from: i */
    public C62964ck f142369i;

    /* renamed from: j */
    public boolean f142370j;

    /* renamed from: k */
    public C54224am f142371k;

    /* renamed from: l */
    public C62971cq f142372l;

    /* renamed from: m */
    public long f142373m;

    /* renamed from: n */
    public long f142374n;

    /* renamed from: o */
    public C62971cq f142375o;

    /* renamed from: p */
    public long f142376p;

    /* renamed from: q */
    public C57924d f142377q;

    /* renamed from: s */
    private int f142378s;

    /* renamed from: t */
    private C54235ax f142379t;

    /* renamed from: u */
    private byte f142380u = 2;

    static {
        C54231at atVar = new C54231at();
        f142359r = atVar;
        C62942bv.registerDefaultInstance(C54231at.class, atVar);
    }

    private C54231at() {
        emptyProtobufList();
        this.f142367g = BuildConfig.FLAVOR;
        this.f142368h = BuildConfig.FLAVOR;
        this.f142369i = emptyLongList();
        this.f142372l = emptyProtobufList();
        this.f142375o = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142380u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142380u = b;
                return null;
            case 2:
                return newMessageInfo(f142359r, "\u0001\u0012\u0000\u0001\u0002+\u0012\u0000\u0003\u0001\u0002င\u0001\u0003ဇ\u0002\u0005ဈ\u0004\u0007ဇ\u0006\bဇ\u0007\nင\b\u000bဈ\t\fဈ\n\u0010\u0014\u0015ဇ\u000f\u001cဉ\u0013\u001eᐉ\u0015#\u001b%စ\u0019&ဃ\u001a(\u001b*စ\u001c+ဉ\u001d", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C59002s.f156871a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C42181t.f110467a, "l", C54233av.class, "m", C48004n.f124238a, C66412o.f180592a, anf.class, "p", "q"});
            case 3:
                return new C54231at();
            case 4:
                return new C54230as();
            case 5:
                return f142359r;
            case 6:
                C63010eb ebVar = f142360v;
                if (ebVar == null) {
                    synchronized (C54231at.class) {
                        ebVar = f142360v;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142359r);
                            f142360v = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
