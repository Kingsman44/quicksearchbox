package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.p10181d.C134218g;
import com.google.android.apps.search.googleapp.discover.p10181d.C134220i;
import com.google.android.apps.search.googleapp.discover.p10181d.C134221j;
import com.google.android.apps.search.googleapp.discover.p10181d.C134222k;
import com.google.android.apps.search.googleapp.discover.p10195j.C134426aa;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.b */
/* compiled from: PG */
public final class C134722b {

    /* renamed from: e */
    private static final C59071e f366864e = C59071e.m91331h();

    /* renamed from: a */
    public final C134766q f366865a;

    /* renamed from: b */
    public final C134727g f366866b;

    /* renamed from: c */
    public final C37215b f366867c;

    /* renamed from: d */
    public C134743w f366868d;

    /* renamed from: f */
    private final C134721a f366869f = new C134721a(this);

    /* renamed from: g */
    private final C134426aa f366870g;

    public C134722b(C134766q qVar, C134426aa aaVar, C134727g gVar, C37215b bVar) {
        C69664n.m101061g(qVar, "surface");
        C69664n.m101061g(aaVar, "elementsImageEvents");
        C69664n.m101061g(gVar, "discoverPerSurfaceLaunchStatus");
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f366865a = qVar;
        this.f366870g = aaVar;
        this.f366866b = gVar;
        this.f366867c = bVar;
    }

    /* renamed from: h */
    private final void m218543h() {
        C134743w wVar = this.f366868d;
        if (wVar != null) {
            this.f366870g.f366140a.remove(wVar);
        }
        this.f366868d = null;
    }

    /* renamed from: a */
    public final void mo111905a(C134220i iVar) {
        C134221j jVar;
        C134727g gVar = this.f366866b;
        C134766q qVar = this.f366865a;
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar.f366882a, qVar, new C134726f(qVar));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar = (C134725e) computeIfAbsent;
        synchronized (eVar) {
            if (eVar.mo111917c() && (eVar.f366880f instanceof C134729i)) {
                C37215b bVar = this.f366867c;
                C37258g gVar2 = C37182a.f97759R;
                C69664n.m101060f(gVar2, "DISCOVER_IMAGES_IN_VIEWPORT_LOAD_END");
                int i = iVar.f365627f;
                String str = (String) C134222k.f365683a.get(C134220i.class);
                if (str != null) {
                    bVar.mo19974a(gVar2.mo40810a(i, str));
                    m218543h();
                    eVar.f366880f = new C134728h(iVar);
                    C134740t tVar = eVar.f366879e;
                    if (tVar instanceof C134737q) {
                        C134218g gVar3 = ((C134737q) tVar).f366890a;
                        C134218g gVar4 = C134218g.ATF_UNSPECIFIED;
                        C134720e eVar2 = C134720e.SEARCH_BOX_TAPPED;
                        int ordinal = gVar3.ordinal();
                        if (ordinal == 1) {
                            int ordinal2 = iVar.ordinal();
                            if (ordinal2 == 2 || ordinal2 == 3) {
                                jVar = C134221j.CARDS_RENDERED_BUT_IMAGE_LOADING_FAILED;
                            } else if (ordinal2 != 4) {
                                jVar = C134221j.CARDS_FULLY_RENDERED;
                            } else {
                                jVar = C134221j.CARDS_RENDERED_BUT_IMAGE_LOADING_CANCELLED;
                            }
                        } else if (ordinal != 4) {
                            jVar = C134221j.ABORTED_DUE_TO_INVALID_STATE;
                        } else {
                            jVar = C134221j.FAILED_TO_RENDER;
                        }
                        mo111907c(eVar, jVar);
                    } else {
                        C59052c cVar = (C59052c) f366864e.mo56226d();
                        cVar.mo56379ah(new C59094n(40528));
                        cVar.mo56386p("Image loading finished, but rendering is not");
                        mo111907c(eVar, C134221j.ABORTED_DUE_TO_INVALID_STATE);
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported error space");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo111906b(C134218g gVar) {
        C69664n.m101061g(gVar, "result");
        C134727g gVar2 = this.f366866b;
        C134766q qVar = this.f366865a;
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar2.f366882a, qVar, new C134726f(qVar));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar = (C134725e) computeIfAbsent;
        synchronized (eVar) {
            C134740t tVar = eVar.f366879e;
            if (eVar.mo111917c() && (tVar instanceof C134739s)) {
                C134739s sVar = (C134739s) tVar;
                eVar.f366879e = new C134737q(gVar, sVar.f366893a);
                C134743w wVar = this.f366868d;
                if (wVar != null) {
                    wVar.mo111944g();
                }
                C37215b bVar = this.f366867c;
                C37258g gVar3 = C37182a.f97753L;
                C69664n.m101060f(gVar3, "DISCOVER_ATF_RENDER_END");
                int i = gVar.f365608f;
                String str = (String) C134222k.f365683a.get(C134218g.class);
                if (str != null) {
                    bVar.mo19974a(gVar3.mo40810a(i, str));
                    C134221j jVar = sVar.f366893a;
                    if (jVar != null) {
                        mo111907c(eVar, jVar);
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported error space");
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo111907c(C134725e eVar, C134221j jVar) {
        C134736p pVar;
        if (eVar.mo111917c()) {
            if (eVar.f366876b) {
                C37215b bVar = this.f366867c;
                C37257f fVar = C37182a.f97754M;
                C69664n.m101060f(fVar, "DISCOVER_LAUNCH_FINISHED");
                int i = jVar.f365682ab;
                String str = (String) C134222k.f365683a.get(C134221j.class);
                if (str != null) {
                    bVar.mo19974a(fVar.mo40803a(i, str));
                    pVar = new C134732l(jVar);
                } else {
                    throw new IllegalArgumentException("Unsupported error space");
                }
            } else {
                pVar = new C134734n(jVar);
            }
            eVar.f366878d = pVar;
        }
    }

    /* renamed from: d */
    public final void mo111908d(C134720e eVar) {
        C134221j jVar;
        C69664n.m101061g(eVar, "hideReason");
        C134727g gVar = this.f366866b;
        C134766q qVar = this.f366865a;
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar.f366882a, qVar, new C134726f(qVar));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar2 = (C134725e) computeIfAbsent;
        synchronized (eVar2) {
            if (eVar2.mo111917c()) {
                eVar2.mo111916b(false);
                if (eVar2.f366876b) {
                    m218543h();
                    C69664n.m101061g(eVar, "<this>");
                    C134220i iVar = C134220i.IMAGES_UNSPECIFIED;
                    C134218g gVar2 = C134218g.ATF_UNSPECIFIED;
                    C134720e eVar3 = C134720e.SEARCH_BOX_TAPPED;
                    switch (eVar.ordinal()) {
                        case 0:
                            jVar = C134221j.SEARCH_BOX_TAPPED;
                            break;
                        case 1:
                            jVar = C134221j.VOICE_SEARCH_TAPPED;
                            break;
                        case 2:
                            jVar = C134221j.DOODLE_TAPPED;
                            break;
                        case 3:
                            jVar = C134221j.NAVIGATED_BACK;
                            break;
                        case 4:
                            jVar = C134221j.NAVIGATED_TO_ANOTHER_TAB;
                            break;
                        case 5:
                            jVar = C134221j.ACCOUNT_PARTICLE_DISC_TAPPED;
                            break;
                        case 6:
                            jVar = C134221j.CONFIGURATION_CHANGED;
                            break;
                        case 7:
                            jVar = C134221j.OVERFLOW_MANAGE_INTERESTS_TAPPED;
                            break;
                        case 8:
                            jVar = C134221j.OVERFLOW_SETTINGS_TAPPED;
                            break;
                        case 9:
                            jVar = C134221j.OVERFLOW_FEEDBACK_TAPPED;
                            break;
                        case 10:
                            jVar = C134221j.OVERFLOW_HELP_TAPPED;
                            break;
                        case 11:
                            jVar = C134221j.FRAGMENT_PAUSED;
                            break;
                        case 12:
                            jVar = C134221j.CARD_TAPPED;
                            break;
                        case 13:
                            jVar = C134221j.VIDEO_CARD_TAPPED;
                            break;
                        case 14:
                            jVar = C134221j.CHANNEL_CHIP_TAPPED;
                            break;
                        case 15:
                            jVar = C134221j.FULL_COVERAGE_ICON_TAPPED;
                            break;
                        case 16:
                            jVar = C134221j.MORE_STORIES_TAPPED;
                            break;
                        case 17:
                            jVar = C134221j.MANAGE_INTERESTS_TAPPED;
                            break;
                        case 18:
                            jVar = C134221j.MINUS_ONE_OVERLAY_CLOSED;
                            break;
                        case 19:
                            jVar = C134221j.UNKNOWN_HIDE_REASON;
                            break;
                        default:
                            throw new C69677g();
                    }
                    mo111907c(eVar2, jVar);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo111909e() {
        C134727g gVar = this.f366866b;
        C134766q qVar = this.f366865a;
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar.f366882a, qVar, new C134726f(qVar));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar = (C134725e) computeIfAbsent;
        synchronized (eVar) {
            if (eVar.mo111917c()) {
                if (!(eVar.f366879e instanceof C134738r)) {
                    m218543h();
                    eVar.f366880f = C134730j.f366885a;
                }
                eVar.f366879e = new C134739s((C134221j) null);
                this.f366867c.mo19974a(C37182a.f97752K);
                mo111911g(eVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo111910f(C134221j jVar) {
        C69664n.m101061g(jVar, "error");
        C134727g gVar = this.f366866b;
        C134766q qVar = this.f366865a;
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar.f366882a, qVar, new C134726f(qVar));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar = (C134725e) computeIfAbsent;
        synchronized (eVar) {
            if (eVar.mo111917c()) {
                if (!(eVar.f366879e instanceof C134738r)) {
                    m218543h();
                    eVar.f366880f = C134730j.f366885a;
                }
                eVar.f366879e = new C134739s(jVar);
                this.f366867c.mo19974a(C37182a.f97752K);
            }
        }
    }

    /* renamed from: g */
    public final void mo111911g(C134725e eVar) {
        C134743w wVar = new C134743w(this.f366869f, eVar.f366876b);
        this.f366870g.f366140a.add(wVar);
        this.f366868d = wVar;
    }

    public final String toString() {
        String eVar;
        C134727g gVar = this.f366866b;
        C134766q qVar = this.f366865a;
        C69664n.m101061g(qVar, "surface");
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar.f366882a, qVar, new C134726f(qVar));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar2 = (C134725e) computeIfAbsent;
        synchronized (eVar2) {
            eVar = eVar2.toString();
        }
        return eVar;
    }
}
