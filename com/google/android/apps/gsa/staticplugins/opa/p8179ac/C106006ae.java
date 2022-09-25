package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.content.Context;
import android.os.Parcelable;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88351yl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88353yn;
import com.google.android.apps.gsa.shared.p7066m.C90041ct;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1528m.p1529a.C18416a;
import com.google.android.libraries.assistant.p1528m.p1529a.C18431p;
import com.google.assistant.p3897e.p3921j.p3926e.C51843bd;
import com.google.assistant.p3897e.p3921j.p3926e.C51876cj;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.ae */
/* compiled from: PG */
final class C106006ae implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C106025ax f295947a;

    public C106006ae(C106025ax axVar) {
        this.f295947a = axVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C51843bd bdVar = C51843bd.APPLICATION_URL;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            C106025ax axVar = this.f295947a;
            if (axVar.f296021s && !axVar.f296005c.mo56113h()) {
                C106025ax axVar2 = this.f295947a;
                WebView a2 = ((GsaWebViewContainer) serviceEventData.mo81912b(Parcelable.class)).mo80858a();
                if (a2 != null) {
                    int a3 = C51876cj.m86404a(axVar2.f296023u.f136086e);
                    if (a3 != 0 && a3 == 2) {
                        a2.getSettings().setDomStorageEnabled(true);
                    }
                    a2.getSettings().setForceDark(0);
                    double dimension = (double) (axVar2.f296010h.getResources().getDimension(R.dimen.title_bar_height) / axVar2.f296010h.getResources().getDisplayMetrics().density);
                    if (!axVar2.f296005c.mo56113h()) {
                        Context context = axVar2.f296010h;
                        C106023av avVar = new C106023av(axVar2);
                        C58485gu guVar = axVar2.f296009g;
                        C63037fb fbVar = axVar2.f296023u.f136102u;
                        if (fbVar == null) {
                            fbVar = C63037fb.f170144b;
                        }
                        C63037fb fbVar2 = fbVar;
                        C63037fb fbVar3 = axVar2.f296023u.f136103v;
                        if (fbVar3 == null) {
                            fbVar3 = C63037fb.f170144b;
                        }
                        C18416a aVar = new C18416a(dimension, guVar, fbVar2, fbVar3);
                        axVar2.f296005c = C58833ax.m90834k(new C18431p(a2, context, avVar, aVar, axVar2.f296013k.mo79743a(C90041ct.f248698k)));
                    }
                    ((FrameLayout) ((FrameLayout) axVar2.f296022t.mo56107c()).findViewById(R.id.canvas_container)).addView(((C18431p) axVar2.f296005c.mo56107c()).f52310b, new LinearLayout.LayoutParams(-1, -1, 1.0f));
                    axVar2.mo95232n(axVar2.f296010h.getResources().getConfiguration());
                    axVar2.f296027y.mo57358p(axVar2.mo95241w());
                }
            }
        } else if (ordinal != 60) {
            if (ordinal != 140) {
                if (ordinal != 31) {
                    if (ordinal != 32) {
                        if (ordinal == 168) {
                            ((C18431p) this.f295947a.f296005c.mo56107c()).mo23968l(3);
                            ((C106053i) this.f295947a.f296006d.mo56107c()).f296079i = true;
                            this.f295947a.f295984A = true;
                        } else if (ordinal == 169) {
                            ((C18431p) this.f295947a.f296005c.mo56107c()).mo23968l(2);
                            ((C106053i) this.f295947a.f296006d.mo56107c()).f296079i = false;
                            this.f295947a.f295984A = false;
                        }
                    } else if (this.f295947a.f296005c.mo56113h()) {
                        ((C18431p) this.f295947a.f296005c.mo56107c()).mo23963h("START");
                    }
                } else if (this.f295947a.f296005c.mo56113h()) {
                    C106025ax axVar3 = this.f295947a;
                    if (axVar3.f296025w != null) {
                        ((C18431p) axVar3.f296005c.mo56107c()).mo23970m(this.f295947a.f296025w, 2);
                        C106025ax axVar4 = this.f295947a;
                        axVar4.f296025w = null;
                        if (axVar4.f296026x) {
                            ((C106053i) axVar4.f296006d.mo56107c()).mo95275h();
                        }
                        this.f295947a.f296026x = false;
                    }
                    ((C18431p) this.f295947a.f296005c.mo56107c()).mo23963h("END");
                }
            } else if (this.f295947a.f296005c.mo56113h()) {
                C62940bt btVar = C88351yl.f238936a;
                C88246uo uoVar = serviceEventData.f236959a;
                C62940bt r0 = C62942bv.checkIsLite(btVar);
                uoVar.mo58887l(r0);
                if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
                    ((C18431p) this.f295947a.f296005c.mo56107c()).mo23963h(((C88353yn) serviceEventData.mo81918e(C88351yl.f238936a)).f238941c);
                }
            }
        } else if (this.f295947a.f296013k.mo79746e(C90041ct.f248694g)) {
            if (!this.f295947a.f296005c.mo56113h()) {
                C59104x d = C106025ax.f295983a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
                ((C59052c) ((C59052c) d).mo56372aa(24657)).mo56386p("Cannot send user interaction when canvas webview container is not present.");
                return;
            }
            ((C18431p) this.f295947a.f296005c.mo56107c()).mo23971n(2);
        }
    }
}
