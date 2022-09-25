package com.google.android.libraries.lens.view.main;

import android.animation.Animator;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.C25935c;
import com.google.android.libraries.lens.view.filters.C26012i;
import com.google.android.libraries.lens.view.filters.C26022s;
import com.google.android.libraries.lens.view.filters.C26234v;
import com.google.android.libraries.lens.view.filters.carousel.C25952h;
import com.google.android.libraries.lens.view.filters.carousel.C25961q;
import com.google.android.libraries.lens.view.filters.carousel.C25966v;
import com.google.android.libraries.lens.view.filters.carousel.C25967w;
import com.google.android.libraries.lens.view.filters.carousel.FilterTooltip;
import com.google.android.libraries.lens.view.filters.p2101e.C25987b;
import com.google.android.libraries.lens.view.filters.p2101e.C25993h;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25986j;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.gallery.p2112e.C26416i;
import com.google.android.libraries.lens.view.p2067ak.C25206al;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2067ak.C25274m;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.session.C28020r;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4552o.adn;
import com.google.common.p4552o.ado;
import com.google.common.p4552o.p4563i.C59962l;
import com.google.common.p4552o.p4563i.C59963m;
import com.google.lens.p4707j.C62398ab;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62995dn;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.lens.view.main.bp */
/* compiled from: PG */
final class C27326bp implements C27286ac {

    /* renamed from: a */
    final /* synthetic */ C27327bq f74752a;

    public C27326bp(C27327bq bqVar) {
        this.f74752a = bqVar;
    }

    /* renamed from: a */
    public final void mo32866a(C56304dd ddVar, List list, boolean z) {
        C25935c cVar;
        int i;
        C58833ax axVar;
        Animator animator;
        ViewStub viewStub;
        if (!ddVar.f150052a.isEmpty()) {
            C27322bl blVar = this.f74752a.f74787ag;
            blVar.getClass();
            if (ddVar != null) {
                C26234v vVar = ((C27384dt) blVar).f74924aT;
                vVar.getClass();
                C25986j jVar = vVar.mo17754z().f71289d;
                if (jVar != null) {
                    jVar.mo31045b(ddVar);
                }
            }
        }
        if (!z || !this.f74752a.f74804i.mo31462g(C26239a.SELECTION_STATE_ENABLED)) {
            C27322bl blVar2 = this.f74752a.f74787ag;
            blVar2.getClass();
            C27384dt dtVar = (C27384dt) blVar2;
            if (dtVar.f74923aS != null) {
                C26022s q = dtVar.mo32952q();
                if (q.f70720i.mo31462g(C26239a.ENABLE_FILTER_RECOMMENDATIONS) && (cVar = q.f70725n) != null) {
                    C26012i a = cVar.mo17754z();
                    C25987b bVar = a.f70678c;
                    Iterator it = list.iterator();
                    while (true) {
                        i = 3;
                        if (!it.hasNext()) {
                            bVar.f70633b = C58836b.f156633a;
                            break;
                        }
                        C62398ab abVar = (C62398ab) it.next();
                        C56306df a2 = C56306df.m87964a(abVar.f168442a);
                        if (a2 == null) {
                            a2 = C56306df.UNKNOWN_FILTER_TYPE;
                        }
                        C25980d a3 = C25980d.m47949a(a2);
                        if (!a3.equals(bVar.f70634c.f70649b) && Collection.EL.stream(bVar.f70634c.f70648a).anyMatch(new C25993h(a3))) {
                            C56306df a4 = C56306df.m87964a(abVar.f168442a);
                            if (a4 == null) {
                                a4 = C56306df.UNKNOWN_FILTER_TYPE;
                            }
                            if (bVar.f70632a.contains(a4)) {
                                continue;
                            } else {
                                C56306df a5 = C56306df.m87964a(abVar.f168442a);
                                if (a5 == null) {
                                    a5 = C56306df.UNKNOWN_FILTER_TYPE;
                                }
                                C25274m e = bVar.f70637f.mo30349e();
                                int i2 = a5.f150068m;
                                C62995dn dnVar = e.f68760h;
                                Integer valueOf = Integer.valueOf(i2);
                                if (!((Boolean) ((C58847bk) C58833ax.m90834k(Boolean.valueOf(dnVar.containsKey(valueOf) && ((Integer) dnVar.get(valueOf)).intValue() >= 3))).f156646a).booleanValue() && !abVar.f168443b.isEmpty() && bVar.f70634c.f70649b.equals(C25980d.AUTO_FILTER)) {
                                    bVar.f70633b = C58833ax.m90834k(abVar);
                                    EnumSet enumSet = bVar.f70632a;
                                    C56306df a6 = C56306df.m87964a(abVar.f168442a);
                                    if (a6 == null) {
                                        a6 = C56306df.UNKNOWN_FILTER_TYPE;
                                    }
                                    enumSet.add(a6);
                                    C25225bd bdVar = bVar.f70637f;
                                    C56306df a7 = C56306df.m87964a(abVar.f168442a);
                                    if (a7 == null) {
                                        a7 = C56306df.UNKNOWN_FILTER_TYPE;
                                    }
                                    bdVar.f68662a.mo30363c(new C25206al(a7));
                                }
                            }
                        }
                    }
                    C25987b bVar2 = a.f70678c;
                    if (bVar2.f70633b.mo56113h()) {
                        C56306df a8 = C56306df.m87964a(((C62398ab) bVar2.f70633b.mo56107c()).f168442a);
                        if (a8 == null) {
                            a8 = C56306df.UNKNOWN_FILTER_TYPE;
                        }
                        axVar = C58833ax.m90834k(a8);
                    } else {
                        axVar = C58836b.f156633a;
                    }
                    if (axVar.mo56113h()) {
                        C25980d a9 = C25980d.m47949a((C56306df) axVar.mo56107c());
                        C25961q a10 = a.f70687l.mo17754z();
                        String str = ((C62398ab) a.f70678c.f70633b.mo56109e(C62398ab.f168440c)).f168443b;
                        C56306df dfVar = (C56306df) axVar.mo56107c();
                        int a11 = a.f70677b.f70642a.mo31208a(a9);
                        a10.f70561n = C58833ax.m90834k(Integer.valueOf(a11));
                        if (a10.f70551d == null && (viewStub = a10.f70550c) != null) {
                            a10.f70551d = (FilterTooltip) viewStub.inflate();
                        }
                        View findViewByPosition = a10.mo31143e().findViewByPosition(a11);
                        FilterTooltip filterTooltip = a10.f70551d;
                        if (filterTooltip != null && findViewByPosition != null) {
                            filterTooltip.mo17754z().f70585l = new C25952h(a10, a11);
                            C25967w a12 = a10.f70551d.mo17754z();
                            int left = findViewByPosition.getLeft();
                            a12.f70580g = left + left > ((View) findViewByPosition.getParent()).getWidth();
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a12.f70576c.getLayoutParams();
                            layoutParams.gravity = (true != a12.f70580g ? 3 : 5) | 48;
                            a12.f70576c.setLayoutParams(layoutParams);
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) a12.f70575b.getLayoutParams();
                            if (true == a12.f70580g) {
                                i = 5;
                            }
                            layoutParams2.gravity = i;
                            a12.f70575b.setLayoutParams(layoutParams2);
                            a12.mo31161b(findViewByPosition);
                            ((TextView) a12.f70575b.findViewById(R.id.tooltip_text)).setText(str);
                            a12.f70575b.setVisibility(0);
                            C28306ab abVar2 = a12.f70578e;
                            FilterTooltip filterTooltip2 = a12.f70575b;
                            C28313c a13 = abVar2.f76990a.mo33805a(C28427h.m53115a(79271));
                            adn adn = (adn) ado.f158388g.createBuilder();
                            C59962l lVar = (C59962l) C59963m.f162060c.createBuilder();
                            lVar.copyOnWrite();
                            C59963m mVar = (C59963m) lVar.instance;
                            mVar.f162063b = dfVar.f150068m;
                            mVar.f162062a |= 1;
                            adn.copyOnWrite();
                            ado ado = (ado) adn.instance;
                            C59963m mVar2 = (C59963m) lVar.build();
                            mVar2.getClass();
                            ado.f158394d = mVar2;
                            ado.f158391a |= 8;
                            a13.mo33858f(new C28353e(C25686g.f69825a, (ado) adn.build()));
                            abVar2.mo33802c(filterTooltip2, a13);
                            if (!a12.f70579f.isNegative() && (animator = a12.f70574a) != null) {
                                if (animator.isRunning()) {
                                    a12.f70574a.cancel();
                                }
                                a12.f70574a.setStartDelay(a12.f70579f.toMillis());
                                a12.f70574a.addListener(new C25966v(a12));
                                a12.f70574a.setTarget(a12.f70575b);
                                a12.f70574a.start();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo32867b(int i) {
        C58833ax j = C58833ax.m90833j(this.f74752a.f74816u.f74684q);
        if (j.mo56113h() && ((C27228h) j.mo56107c()).mo32669c().mo56113h()) {
            if (i == Status.Code.INVALID_ARGUMENT.value() || i == Status.Code.PERMISSION_DENIED.value()) {
                this.f74752a.mo32884o(C28020r.m52205a((C27228h) j.mo56107c()));
                this.f74752a.mo32882m((C26416i) null);
            }
        }
    }
}
