package com.google.knowledge.p4671b;

import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51452if;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.knowledge.p4682d.C61995f;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4242bp.p4243a.p4247d.C56162b;
import com.google.p5277z.p5282c.C68030t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.knowledge.b.k */
/* compiled from: PG */
public final class C61818k extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C61818k f166999r;

    /* renamed from: u */
    private static volatile C63010eb f167000u;

    /* renamed from: a */
    public int f167001a;

    /* renamed from: b */
    public C62971cq f167002b;

    /* renamed from: c */
    public C62971cq f167003c;

    /* renamed from: d */
    public C68030t f167004d;

    /* renamed from: e */
    public boolean f167005e;

    /* renamed from: f */
    public boolean f167006f;

    /* renamed from: g */
    public int f167007g;

    /* renamed from: h */
    public C61790ai f167008h;

    /* renamed from: i */
    public long f167009i;

    /* renamed from: j */
    public C62971cq f167010j;

    /* renamed from: k */
    public C56162b f167011k;

    /* renamed from: l */
    public C9418h f167012l;

    /* renamed from: m */
    public C61782aa f167013m;

    /* renamed from: n */
    public C61802au f167014n;

    /* renamed from: o */
    public C52091ex f167015o;

    /* renamed from: p */
    public C61995f f167016p;

    /* renamed from: q */
    public boolean f167017q;

    /* renamed from: s */
    private C54946ad f167018s;

    /* renamed from: t */
    private byte f167019t = 2;

    static {
        C61818k kVar = new C61818k();
        f166999r = kVar;
        C62942bv.registerDefaultInstance(C61818k.class, kVar);
    }

    private C61818k() {
        emptyProtobufList();
        this.f167002b = emptyProtobufList();
        this.f167003c = emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
        this.f167010j = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo58202a() {
        C62971cq cqVar = this.f167002b;
        if (!cqVar.mo58948c()) {
            this.f167002b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo58203b() {
        C62971cq cqVar = this.f167003c;
        if (!cqVar.mo58948c()) {
            this.f167003c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167019t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167019t = b;
                return null;
            case 2:
                return newMessageInfo(f166999r, "\u0001\u0011\u0000\u0001\u0002\u001a\u0011\u0000\u0003\b\u0002Л\u0004Л\u0005ᐉ\u0001\u0007ဇ\u0004\bဇ\u0005\tᐉ\u0007\nဂ\b\u000b\u001b\fᐉ\u000b\u000fᐉ\n\u0011ᐉ\r\u0013ဉ\u0011\u0014ဉ\u0012\u0015ᐉ\f\u0017ဉ\u0013\u0018ဇ\u0014\u001aဌ\u0006", new Object[]{"a", "b", C54946ad.class, C45240c.f118157a, C61790ai.class, "d", "e", C10662f.f35572a, C19618h.f54585a, "i", "j", C61808b.class, "l", C19621k.f54601a, C59002s.f156871a, C48004n.f124238a, C66412o.f180592a, "m", "p", "q", C30325g.f82003a, C51452if.m86191b()});
            case 3:
                return new C61818k();
            case 4:
                return new C61817j();
            case 5:
                return f166999r;
            case 6:
                C63010eb ebVar = f167000u;
                if (ebVar == null) {
                    synchronized (C61818k.class) {
                        ebVar = f167000u;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166999r);
                            f167000u = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
