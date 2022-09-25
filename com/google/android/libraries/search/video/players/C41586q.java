package com.google.android.libraries.search.video.players;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.libraries.search.video.lightbox.C41533l;
import com.google.android.libraries.search.video.p3191a.C41452k;
import com.google.android.libraries.search.video.p3195e.C41502a;
import com.google.android.libraries.search.video.p3195e.C41506e;
import com.google.android.libraries.search.video.thirdparty.C41598ab;
import com.google.android.libraries.search.video.thirdparty.C41599ac;
import com.google.android.libraries.search.video.thirdparty.C41606h;
import com.google.android.libraries.search.video.thirdparty.C41607i;
import com.google.android.libraries.search.video.thirdparty.C41610l;
import com.google.android.libraries.search.video.thirdparty.C41611m;
import com.google.android.libraries.search.video.thirdparty.C41613o;
import com.google.android.libraries.search.video.thirdparty.C41616r;
import com.google.android.libraries.search.video.thirdparty.C41617s;
import com.google.android.libraries.search.video.thirdparty.C41624y;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54791k;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54794n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.players.q */
/* compiled from: PG */
final class C41586q implements C41606h {

    /* renamed from: a */
    public final C41585p f108707a;

    /* renamed from: b */
    C41607i f108708b;

    /* renamed from: c */
    public int f108709c = 1;

    /* renamed from: d */
    final C41611m f108710d;

    /* renamed from: e */
    public C41533l f108711e;

    /* renamed from: f */
    private final Context f108712f;

    /* renamed from: g */
    private final ViewGroup f108713g;

    /* renamed from: h */
    private final C41588s f108714h;

    /* renamed from: i */
    private final Set f108715i = new HashSet();

    /* renamed from: j */
    private final Set f108716j = new HashSet();

    /* renamed from: k */
    private final List f108717k = new ArrayList();

    /* renamed from: l */
    private boolean f108718l;

    /* renamed from: m */
    private C41589t f108719m;

    /* renamed from: n */
    private final C41452k f108720n;

    /* renamed from: o */
    private int f108721o;

    /* renamed from: p */
    private final C41613o f108722p;

    public C41586q(C41611m mVar, C41613o oVar, C41585p pVar, ViewGroup viewGroup, C41588s sVar, C41452k kVar) {
        this.f108720n = kVar;
        this.f108710d = mVar;
        this.f108722p = oVar;
        this.f108707a = pVar;
        this.f108713g = viewGroup;
        this.f108712f = viewGroup.getContext();
        this.f108714h = sVar;
    }

    /* renamed from: r */
    private final void m72795r(C54794n nVar) {
        for (C41590u e : this.f108716j) {
            e.mo44016e(nVar);
        }
        this.f108719m = null;
    }

    /* renamed from: s */
    private final void m72796s(C41589t tVar) {
        for (C41590u c : this.f108716j) {
            c.mo44014c(this.f108707a.mo44127a(), tVar);
        }
        this.f108719m = tVar;
    }

    /* renamed from: t */
    private static C54794n m72797t(int i, boolean z) {
        int i2 = i - 1;
        int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 1 : 29 : 28 : 27 : 26;
        C54791k kVar = (C54791k) C54794n.f143741d.createBuilder();
        kVar.copyOnWrite();
        C54794n nVar = (C54794n) kVar.instance;
        nVar.f143744b = i3 - 1;
        nVar.f143743a |= 1;
        kVar.copyOnWrite();
        C54794n nVar2 = (C54794n) kVar.instance;
        nVar2.f143743a = 2 | nVar2.f143743a;
        nVar2.f143745c = z;
        return (C54794n) kVar.build();
    }

    /* renamed from: a */
    public final Duration mo44135a() {
        C41607i iVar = this.f108708b;
        if (iVar == null) {
            return Duration.ZERO;
        }
        return iVar.mo44176z();
    }

    /* renamed from: b */
    public final Optional mo44136b() {
        C41607i iVar = this.f108708b;
        if (iVar == null) {
            return Optional.empty();
        }
        return iVar.mo44167A();
    }

    /* renamed from: c */
    public final void mo44137c(C41590u uVar) {
        this.f108716j.add(uVar);
    }

    /* renamed from: d */
    public final void mo44138d(C41591v vVar) {
        this.f108715i.add(vVar);
    }

    /* renamed from: e */
    public final void mo44139e() {
        if (((C41567b) this.f108714h).f108665c) {
            this.f108713g.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final void mo44141h() {
        C41607i iVar = this.f108708b;
        if (iVar != null) {
            iVar.mo44170D();
            this.f108708b.mo44173G();
            if (this.f108720n.mo43981a().mo43972g()) {
                C41607i iVar2 = this.f108708b;
                iVar2.getClass();
                ((C41610l) iVar2).f108759a.mo44187h((C41616r) null);
            }
        }
        this.f108708b = null;
        this.f108718l = false;
        this.f108721o = 0;
        this.f108717k.clear();
        m72798u(1);
        this.f108713g.setVisibility(0);
    }

    /* renamed from: hW */
    public final void mo44142hW() {
        m72796s(C41589t.SCRUB);
    }

    /* renamed from: i */
    public final void mo44143i(int i) {
        m72795r(m72797t(i, false));
        m72798u(7);
    }

    /* renamed from: j */
    public final void mo44144j(int i) {
        if (i == 6) {
            m72796s(C41589t.AD_PLAY);
            m72796s(C41589t.PLAYBACK_ERROR);
            return;
        }
        m72795r(m72797t(5, true));
    }

    /* renamed from: l */
    public final void mo44146l(C41591v vVar) {
        this.f108715i.remove(vVar);
    }

    /* renamed from: m */
    public final void mo44147m(boolean z) {
        C41583n nVar = new C41583n(this, z);
        if (this.f108708b != null) {
            nVar.run();
        } else {
            this.f108717k.add(nVar);
        }
    }

    /* renamed from: n */
    public final void mo44148n() {
        C41607i iVar = this.f108708b;
        if (iVar != null) {
            iVar.mo44170D();
        }
    }

    /* renamed from: o */
    public final void mo44149o(int i) {
        for (C41590u d : this.f108716j) {
            d.mo44015d(this.f108707a.mo44127a(), i);
        }
        this.f108719m = null;
    }

    /* renamed from: p */
    public final void mo44150p() {
        m72796s(C41589t.PLAYBACK_NOT_VISIBLE);
        mo44148n();
    }

    /* renamed from: q */
    public final C41506e mo44151q() {
        mo44149o(1);
        return new C41502a(Optional.m71637of(mo44135a()), Optional.empty());
    }

    /* renamed from: u */
    private final void m72798u(int i) {
        int i2 = this.f108709c;
        if (i2 == 0) {
            throw null;
        } else if (i2 != i) {
            this.f108709c = i;
            if (!((C41567b) this.f108714h).f108665c || i == 3 || i == 4 || i == 5 || i == 6) {
                this.f108713g.setVisibility(0);
            } else {
                this.f108713g.setVisibility(8);
            }
            for (C41591v a : this.f108715i) {
                a.mo42106a(this.f108707a.mo44127a(), this.f108709c, i2);
            }
        }
    }

    /* renamed from: k */
    public final void mo44145k(int i, C41607i iVar) {
        int i2 = this.f108721o;
        this.f108721o = i;
        int i3 = i - 1;
        int i4 = 5;
        switch (i3) {
            case 1:
                if (!C41589t.LOAD_START.equals(this.f108719m)) {
                    m72796s(C41589t.LOAD_START);
                    break;
                }
                break;
            case 2:
                m72796s(C41589t.PLAYBACK_PAUSE);
                break;
            case 3:
            case 5:
                if (i2 == 5) {
                    m72796s(C41589t.PLAYBACK_END);
                }
                if (C41589t.LOAD_START.equals(this.f108719m)) {
                    m72796s(C41589t.LOAD_END);
                }
                m72796s(C41589t.PLAY);
                break;
            case 4:
                if (C41589t.LOAD_START.equals(this.f108719m)) {
                    m72796s(C41589t.LOAD_END);
                }
                m72796s(C41589t.AD_PLAY);
                break;
            case 6:
            case 7:
                m72796s(C41589t.PLAYBACK_END);
                break;
        }
        switch (i3) {
            case 0:
                i4 = 1;
                break;
            case 1:
                i4 = 2;
                break;
            case 2:
            case 4:
            case 6:
                break;
            case 3:
            case 5:
                i4 = 3;
                break;
            case 7:
                i4 = 6;
                break;
            default:
                i4 = 7;
                break;
        }
        m72798u(i4);
    }

    /* renamed from: f */
    public final void mo44140f() {
        if (!this.f108718l) {
            m72796s(C41589t.INIT_START);
            C41598ab f = C41599ac.m72859f();
            f.mo44154b(((C41567b) this.f108714h).f108669g);
            f.mo44156d(((C41567b) this.f108714h).f108671i);
            f.mo44157e(((C41567b) this.f108714h).f108670h);
            f.mo44155c(((C41567b) this.f108714h).f108668f.isPresent());
            C41617s a = C41624y.m72991a(this.f108712f, f.mo44153a());
            a.mo44182b(this.f108713g);
            a.mo44183c();
            float f2 = ((C41567b) this.f108714h).f108666d;
            if (f2 > 0.0f) {
                a.mo44184d(f2);
            }
            C41607i a2 = this.f108710d.mo44179a(this.f108722p, a);
            this.f108708b = a2;
            a2.mo44168B(this);
            C41607i iVar = this.f108708b;
            Context context = this.f108712f;
            C41567b bVar = (C41567b) this.f108714h;
            iVar.mo44169C(context, bVar.f108663a, bVar.f108667e, bVar.f108668f);
            a.mo44187h(new C41584o(this));
            C41607i iVar2 = this.f108708b;
            iVar2.getClass();
            a.mo44181a(iVar2);
            for (Runnable run : this.f108717k) {
                run.run();
            }
            this.f108717k.clear();
            C41585p pVar = this.f108707a;
            C41607i iVar3 = this.f108708b;
            iVar3.getClass();
            pVar.mo44128b(iVar3, a, this.f108722p);
            this.f108718l = true;
            m72796s(C41589t.INIT_END);
        }
        C41607i iVar4 = this.f108708b;
        if (iVar4 != null) {
            m72796s(C41589t.LOAD_START);
            C41567b bVar2 = (C41567b) this.f108714h;
            if (!bVar2.f108665c) {
                Duration duration = bVar2.f108664b;
                if (!duration.isZero() && !duration.isNegative()) {
                    iVar4.mo44174H(duration);
                }
                iVar4.mo44171E();
                return;
            }
            iVar4.mo44172F();
        }
    }
}
