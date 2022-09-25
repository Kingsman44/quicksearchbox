package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55534an;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55550bc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.bf.b.a.ch */
/* compiled from: PG */
public final class C55652ch extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C55652ch f146826r;

    /* renamed from: s */
    private static volatile C63010eb f146827s;

    /* renamed from: a */
    public int f146828a;

    /* renamed from: b */
    public float f146829b;

    /* renamed from: c */
    public int f146830c;

    /* renamed from: d */
    public String f146831d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f146832e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f146833f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f146834g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f146835h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f146836i;

    /* renamed from: j */
    public String f146837j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f146838k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C62971cq f146839l = emptyProtobufList();

    /* renamed from: m */
    public C62971cq f146840m = emptyProtobufList();

    /* renamed from: n */
    public int f146841n;

    /* renamed from: o */
    public String f146842o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public C55534an f146843p;

    /* renamed from: q */
    public C55550bc f146844q;

    static {
        C55652ch chVar = new C55652ch();
        f146826r = chVar;
        C62942bv.registerDefaultInstance(C55652ch.class, chVar);
    }

    private C55652ch() {
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
                return newMessageInfo(f146826r, "\u0001\u0010\u0000\u0001\u0002\u0011\u0010\u0000\u0002\u0000\u0002ခ\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007င\u0007\bဈ\b\tဌ\u0001\nဈ\u0002\u000bဈ\t\f\u001b\r\u001b\u000eဌ\n\u000fဈ\u000b\u0010ဉ\f\u0011ဉ\r", new Object[]{"a", "b", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C45240c.f118157a, C55651cg.f146825a, "d", C19621k.f54601a, "l", C55647cc.class, "m", C55650cf.class, C48004n.f124238a, C55642by.f146809a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C55652ch();
            case 4:
                return new C55643bz();
            case 5:
                return f146826r;
            case 6:
                C63010eb ebVar = f146827s;
                if (ebVar == null) {
                    synchronized (C55652ch.class) {
                        ebVar = f146827s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146826r);
                            f146827s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
