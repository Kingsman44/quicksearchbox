package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7520ah;
import com.google.p375ai.p378b.C7704gw;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C8174yg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.ch */
/* compiled from: PG */
public final class C98414ch extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62962ci f274732h = new C98410cd();

    /* renamed from: s */
    public static final C98414ch f274733s;

    /* renamed from: u */
    private static volatile C63010eb f274734u;

    /* renamed from: a */
    public int f274735a;

    /* renamed from: b */
    public int f274736b;

    /* renamed from: c */
    public String f274737c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f274738d;

    /* renamed from: e */
    public boolean f274739e;

    /* renamed from: f */
    public C62961ch f274740f = emptyIntList();

    /* renamed from: g */
    public C62961ch f274741g = emptyIntList();

    /* renamed from: i */
    public C62971cq f274742i = emptyProtobufList();

    /* renamed from: j */
    public C62971cq f274743j = emptyProtobufList();

    /* renamed from: k */
    public boolean f274744k;

    /* renamed from: l */
    public C62971cq f274745l = emptyProtobufList();

    /* renamed from: m */
    public C62971cq f274746m = C62942bv.emptyProtobufList();

    /* renamed from: n */
    public C62971cq f274747n = emptyProtobufList();

    /* renamed from: o */
    public C62961ch f274748o = emptyIntList();

    /* renamed from: p */
    public boolean f274749p;

    /* renamed from: q */
    public boolean f274750q;

    /* renamed from: r */
    public String f274751r = BuildConfig.FLAVOR;

    /* renamed from: t */
    private byte f274752t = 2;

    static {
        C98414ch chVar = new C98414ch();
        f274733s = chVar;
        C62942bv.registerDefaultInstance(C98414ch.class, chVar);
    }

    private C98414ch() {
    }

    /* renamed from: a */
    public final void mo91083a() {
        C62961ch chVar = this.f274740f;
        if (!chVar.mo58948c()) {
            this.f274740f = C62942bv.mutableCopy(chVar);
        }
    }

    /* renamed from: b */
    public final void mo91084b() {
        C62971cq cqVar = this.f274743j;
        if (!cqVar.mo58948c()) {
            this.f274743j = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: c */
    public final void mo91085c() {
        C62971cq cqVar = this.f274745l;
        if (!cqVar.mo58948c()) {
            this.f274745l = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: d */
    public final void mo91086d() {
        C62971cq cqVar = this.f274746m;
        if (!cqVar.mo58948c()) {
            this.f274746m = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f274752t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f274752t = b;
                return null;
            case 2:
                return newMessageInfo(f274733s, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\b\u0003\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005\u0016\u0006\u001e\u0007Л\t\u001b\nဇ\u0004\fЛ\r\u001a\u000eЛ\u000f\u0016\u0010ဇ\u0005\u0011ဇ\u0006\u0012ဈ\u0007", new Object[]{"a", "b", C98413cg.m162978b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C7746ik.m22835b(), "i", C7520ah.class, "j", C8174yg.class, C19621k.f54601a, "l", C60220t.class, "m", C48004n.f124238a, C7704gw.class, C66412o.f180592a, "p", "q", C33259r.f88929b});
            case 3:
                return new C98414ch();
            case 4:
                return new C98411ce();
            case 5:
                return f274733s;
            case 6:
                C63010eb ebVar = f274734u;
                if (ebVar == null) {
                    synchronized (C98414ch.class) {
                        ebVar = f274734u;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274733s);
                            f274734u = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e */
    public final void mo91087e() {
        C62961ch chVar = this.f274748o;
        if (!chVar.mo58948c()) {
            this.f274748o = C62942bv.mutableCopy(chVar);
        }
    }
}
