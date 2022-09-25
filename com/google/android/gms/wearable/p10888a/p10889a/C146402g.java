package com.google.android.gms.wearable.p10888a.p10889a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.gms.wearable.a.a.g */
/* compiled from: PG */
public final class C146402g extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C146402g f395484p;

    /* renamed from: r */
    private static volatile C63010eb f395485r;

    /* renamed from: a */
    public int f395486a;

    /* renamed from: b */
    public C63088z f395487b = C63088z.f170246b;

    /* renamed from: c */
    public String f395488c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public double f395489d;

    /* renamed from: e */
    public float f395490e;

    /* renamed from: f */
    public long f395491f;

    /* renamed from: g */
    public int f395492g;

    /* renamed from: h */
    public int f395493h;

    /* renamed from: i */
    public boolean f395494i;

    /* renamed from: j */
    public C62971cq f395495j = emptyProtobufList();

    /* renamed from: k */
    public C62971cq f395496k = emptyProtobufList();

    /* renamed from: l */
    public C62971cq f395497l = C62942bv.emptyProtobufList();

    /* renamed from: m */
    public C62964ck f395498m = emptyLongList();

    /* renamed from: n */
    public C62960cg f395499n = emptyFloatList();

    /* renamed from: o */
    public long f395500o;

    /* renamed from: q */
    private byte f395501q = 2;

    static {
        C146402g gVar = new C146402g();
        f395484p = gVar;
        C62942bv.registerDefaultInstance(C146402g.class, gVar);
    }

    private C146402g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f395501q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f395501q = b;
                return null;
            case 2:
                return newMessageInfo(f395484p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C146404i.class, C19621k.f54601a, C146403h.class, "l", "m", C66412o.f180592a, C48004n.f124238a});
            case 3:
                return new C146402g();
            case 4:
                return new C146401f();
            case 5:
                return f395484p;
            case 6:
                C63010eb ebVar = f395485r;
                if (ebVar == null) {
                    synchronized (C146402g.class) {
                        ebVar = f395485r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f395484p);
                            f395485r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
