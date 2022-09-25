package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.media.session.C0310l;
import com.google.android.apps.gsa.p6486s.C84263c;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.apps.gsa.p6486s.C84273m;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.p6486s.C84278r;
import com.google.android.apps.gsa.search.core.p6519al.p6745m.C85527a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115164a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3902c.p3907c.C51084fu;
import com.google.assistant.p3897e.p3902c.p3907c.C51085fv;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52579wz;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.bb */
/* compiled from: PG */
public final class C115157bb implements C84274n {

    /* renamed from: a */
    public static final C59071e f319590a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.bb");

    /* renamed from: b */
    final C0310l f319591b = new C115138ay(this);

    /* renamed from: c */
    public final Context f319592c;

    /* renamed from: d */
    public final C85527a f319593d;

    /* renamed from: e */
    public final C22871g f319594e;

    /* renamed from: f */
    public final C22871g f319595f;

    /* renamed from: g */
    public final C68214a f319596g;

    /* renamed from: h */
    public final C86124t f319597h;

    /* renamed from: i */
    public final Set f319598i;

    /* renamed from: j */
    public List f319599j;

    /* renamed from: k */
    public C58833ax f319600k;

    /* renamed from: l */
    public C115162bg f319601l;

    /* renamed from: m */
    private final C22871g f319602m;

    /* renamed from: n */
    private C84278r f319603n;

    public C115157bb(Context context, C85527a aVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C68214a aVar2, Set set, C86124t tVar) {
        this.f319592c = context;
        this.f319593d = aVar;
        this.f319602m = gVar;
        this.f319594e = gVar2;
        this.f319595f = gVar3;
        this.f319596g = aVar2;
        this.f319598i = set;
        this.f319597h = tVar;
        gVar2.getClass();
        gVar2.mo28212l("initialize", new C115130aq(this, set));
    }

    /* renamed from: q */
    public static boolean m190863q(C52174hz hzVar) {
        C52583xc xcVar;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c != 26) {
            return true;
        }
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        if (woVar2.f137996c == 26) {
            xcVar = (C52583xc) woVar2.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52579wz a = C52579wz.m86656a(xcVar.f138066b);
        if (a == null) {
            a = C52579wz.UNKNOWN_READ_STATE;
        }
        return a != C52579wz.READ;
    }

    /* renamed from: t */
    private final C60870cx m190864t(int i, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f319594e.mo28202b("play-next", new C115502r(this, i, z));
    }

    /* renamed from: a */
    public final C60870cx mo77785a() {
        return this.f319594e.mo28201a("get-media-data", new C115494j(this));
    }

    /* renamed from: b */
    public final C60870cx mo77786b() {
        SettableFuture settableFuture = new SettableFuture();
        this.f319594e.mo28212l("get-media-session-info", new C115118ae(this, settableFuture));
        return settableFuture;
    }

    /* renamed from: c */
    public final C60870cx mo77787c(C84269i iVar) {
        return mo77788d(iVar, new C84263c().mo77754a());
    }

    /* renamed from: d */
    public final C60870cx mo77788d(C84269i iVar, C84271k kVar) {
        this.f319594e.mo28212l("update-event-loggers", new C115133at(this, iVar, kVar));
        C84269i iVar2 = C84269i.AUTO_PLAY_NEXT;
        switch (iVar.ordinal()) {
            case 0:
                C84278r rVar = this.f319603n;
                if (rVar == null || rVar.mo77775f()) {
                    return m190864t(1, false);
                }
                C58976aa aaVar = C58975e.f156826a;
                return C60856cj.m92900i(C84272l.SUCCESS);
            case 1:
                if (kVar.mo77757a().mo56113h()) {
                    return this.f319594e.mo28202b("play", new C115125al(this, kVar));
                }
                if (kVar.mo77758b().mo56113h()) {
                    return this.f319594e.mo28202b("play", new C115126am(this, kVar));
                }
                return this.f319594e.mo28202b("play", new C115127an(this));
            case 2:
                C58976aa aaVar2 = C58975e.f156826a;
                return this.f319594e.mo28202b("toggle-play-pause", new C115498n(this));
            case 3:
                return m190864t(1, true);
            case 4:
                return m190864t(-1, true);
            case 5:
                C58976aa aaVar3 = C58975e.f156826a;
                return this.f319594e.mo28202b("fast-forward", new C115128ao(this));
            case 6:
                C58976aa aaVar4 = C58975e.f156826a;
                return this.f319594e.mo28202b("rewind", new C115129ap(this));
            case 7:
                if (!kVar.mo77760d().mo56113h()) {
                    return C60856cj.m92900i(C84272l.FAILURE);
                }
                long longValue = ((Long) kVar.mo77760d().mo56107c()).longValue();
                C58976aa aaVar5 = C58975e.f156826a;
                return this.f319594e.mo28202b("seek-to", new C115121ah(this, longValue));
            case 8:
                if (!kVar.mo77761e().mo56113h()) {
                    return C60856cj.m92900i(C84272l.FAILURE);
                }
                int intValue = ((Integer) kVar.mo77761e().mo56107c()).intValue();
                C58976aa aaVar6 = C58975e.f156826a;
                return this.f319594e.mo28202b("seek-to", new C115122ai(this, intValue, kVar));
            case 9:
                C58976aa aaVar7 = C58975e.f156826a;
                return this.f319594e.mo28202b("stop", new C115117ad(this));
            case 10:
                C58976aa aaVar8 = C58975e.f156826a;
                return this.f319594e.mo28202b("stop-session", new C115124ak(this));
            default:
                C59104x c = f319590a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaMediaPlayer");
                ((C59052c) ((C59052c) c).mo56372aa(29670)).mo56389s("Unsupported playback action: %s", iVar.name());
                return C60856cj.m92900i(C84272l.FAILURE);
        }
    }

    /* renamed from: e */
    public final C60870cx mo77789e(C84278r rVar) {
        return mo77790f(rVar, true, C58836b.f156633a);
    }

    /* renamed from: f */
    public final C60870cx mo77790f(C84278r rVar, boolean z, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f319603n = rVar;
        return this.f319594e.mo28202b("prepare", new C115839w(this, rVar, z, axVar));
    }

    /* renamed from: g */
    public final void mo77791g(C84273m mVar) {
        this.f319594e.mo28212l("add-listener", new C115838v(this, mVar));
    }

    /* renamed from: h */
    public final void mo77792h(C84273m mVar) {
        this.f319594e.mo28212l("remove-listener", new C115496l(this, mVar));
    }

    /* renamed from: i */
    public final void mo77793i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f319594e.mo28212l("save-media-session", new C115499o(this));
    }

    /* renamed from: j */
    public final void mo77794j(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        this.f319594e.mo28212l("update-playback-params", new C115495k(this, bundle));
    }

    /* renamed from: k */
    public final C60870cx mo101859k(C115139az azVar) {
        if (this.f319600k.mo56113h()) {
            return azVar.mo101844a((C115493i) this.f319600k.mo56107c());
        }
        return this.f319594e.mo28210j(this.f319602m.mo28209i(this.f319593d.mo79044a(mo101860l()), "opa-media-player-worker-connect", new C115115ab(this)), "media-controller-future-success", new C115116ac(this, azVar));
    }

    /* renamed from: l */
    public final String mo101860l() {
        C58833ax axVar;
        C115169f fVar = (C115169f) this.f319601l.f319612c.instance;
        if ((fVar.f319627a & 32) != 0) {
            axVar = C58833ax.m90834k(fVar.f319633g);
        } else {
            axVar = C58836b.f156633a;
        }
        return (String) axVar.mo56109e("opa_media_player");
    }

    /* renamed from: m */
    public final void mo101861m(C115156ba baVar) {
        mo101859k(new C115119af(baVar));
    }

    /* renamed from: n */
    public final void mo101862n() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319600k.mo56113h()) {
            ((C115493i) this.f319600k.mo56107c()).f320350a.mo1041i(this.f319591b);
        }
        this.f319600k = C58836b.f156633a;
    }

    /* renamed from: o */
    public final void mo101863o(C84273m mVar, C52176ia iaVar) {
        this.f319595f.mo28212l("on-media-data-changed", new C115120ag(mVar, iaVar));
    }

    /* renamed from: p */
    public final void mo101864p(C84273m mVar, C84275o oVar) {
        this.f319595f.mo28212l("on-playback-state-changed", new C115841y(mVar, oVar));
    }

    /* renamed from: r */
    public final C60870cx mo101865r(int i, int i2) {
        C51085fv fvVar;
        Bundle bundle;
        C115162bg bgVar = this.f319601l;
        if (bgVar.mo101870d(i)) {
            C115164a aVar = bgVar.f319612c;
            aVar.copyOnWrite();
            C115169f fVar = (C115169f) aVar.instance;
            C115169f fVar2 = C115169f.f319625h;
            fVar.f319627a |= 2;
            fVar.f319629c = i;
            if (!this.f319601l.mo101868a(i).mo56113h() || !this.f319601l.mo101869b(i).mo56113h()) {
                C59104x c = f319590a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaMediaPlayer");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(new IllegalStateException("MediaItem or MediaBundle not found"))).mo56372aa(29672)).mo56387q("Failed to play media item at index: %d", i);
                return C60856cj.m92900i(C84272l.FAILURE);
            }
            C58976aa aaVar = C58975e.f156826a;
            C51098gh ghVar = ((C52174hz) this.f319601l.mo101868a(i).mo56107c()).f136896c;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b == 7) {
                fvVar = (C51085fv) ghVar.f133013c;
            } else {
                fvVar = C51085fv.f132995c;
            }
            int a = C51084fu.m86032a(fvVar.f132998b);
            if (a == 0) {
                a = 1;
            }
            if (i2 == 2 && this.f319597h.mo79746e(C90125fw.f250890G) && a == 7) {
                C58833ax b = this.f319601l.mo101869b(i);
                if (b.mo56113h()) {
                    ((Bundle) b.mo56107c()).putBoolean("com.google.android.apps.gsa.search.core.work.audioplayer.PlayChime", true);
                }
                bundle = (Bundle) b.mo56107c();
            } else {
                bundle = (Bundle) this.f319601l.mo101869b(i).mo56107c();
            }
            String string = bundle.getString("android.media.metadata.MEDIA_URI");
            if (string != null) {
                return mo101859k(new C115497m(string, bundle));
            }
            C59104x c2 = f319590a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OpaMediaPlayer");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(new IllegalStateException("Media Uri is missing."))).mo56372aa(29673)).mo56387q("Failed to play media item at index: %d", i);
            return C60856cj.m92900i(C84272l.FAILURE);
        }
        C59104x c3 = f319590a.mo56225c();
        c3.mo56378ag(C58975e.f156826a, "OpaMediaPlayer");
        C59052c cVar = (C59052c) ((C59052c) c3).mo56372aa(29675);
        C52176ia iaVar = ((C115169f) this.f319601l.f319612c.instance).f319628b;
        if (iaVar == null) {
            iaVar = C52176ia.f136911k;
        }
        cVar.mo56393w("#playMediaItemInternal: media item index(%d) outside of range [0, %d)", i, iaVar.f136914b.size());
        return C60856cj.m92900i(C84272l.FAILURE);
    }

    /* renamed from: s */
    public final void mo101866s(int i) {
        C58976aa aaVar = C58975e.f156826a;
        for (C84273m mVar : this.f319599j) {
            C84269i iVar = C84269i.AUTO_PLAY_NEXT;
            if (i - 1 == 0) {
                C52176ia iaVar = ((C115169f) this.f319601l.f319612c.instance).f319628b;
                if (iaVar == null) {
                    iaVar = C52176ia.f136911k;
                }
                mo101863o(mVar, iaVar);
            } else if (this.f319600k.mo56113h()) {
                mo101864p(mVar, new C115159bd((C115493i) this.f319600k.mo56107c()));
            }
        }
    }
}
