package com.google.android.apps.gsa.search.core.p6775c.p6776a;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6775c.C85677a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88513g;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88521o;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.shared.logger.p7065j.C89931b;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89933d;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.p7032c.C89696a;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.C90633ai;
import com.google.android.apps.gsa.shared.p7148ui.C90638an;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.actionsui.C93439af;
import com.google.android.apps.gsa.staticplugins.actionsui.C93440ag;
import com.google.android.apps.gsa.staticplugins.actionsui.C93501g;
import com.google.android.apps.gsa.staticplugins.actionsui.C93502h;
import com.google.android.apps.gsa.staticplugins.actionsui.C93699x;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.apps.gsa.search.core.c.a.b */
/* compiled from: PG */
public final class C85679b implements C90991b, C89696a {

    /* renamed from: e */
    private static final C59071e f231632e = C59071e.m91332i("com.google.android.apps.gsa.search.core.c.a.b");

    /* renamed from: a */
    public final List f231633a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final C88521o f231634b;

    /* renamed from: c */
    public final C89932c f231635c;

    /* renamed from: d */
    public final C87681ai f231636d;

    /* renamed from: f */
    private final C88513g f231637f;

    /* renamed from: g */
    private final C85677a f231638g;

    /* renamed from: h */
    private final C58881cr f231639h;

    /* renamed from: i */
    private final C58881cr f231640i;

    /* renamed from: j */
    private final C91097g f231641j;

    /* renamed from: k */
    private final C58881cr f231642k;

    /* renamed from: l */
    private final C58833ax f231643l;

    /* renamed from: m */
    private ActionData f231644m;

    /* renamed from: n */
    private boolean f231645n;

    /* renamed from: o */
    private boolean f231646o;

    /* renamed from: p */
    private boolean f231647p = true;

    /* renamed from: q */
    private C93699x f231648q;

    public C85679b(C58881cr crVar, C58881cr crVar2, C87681ai aiVar, C89932c cVar, C91097g gVar, Context context, C58881cr crVar3, C58833ax axVar, C58833ax axVar2) {
        C58838bb.m90884s(axVar.mo56113h(), "EntryPoint not present.");
        this.f231639h = crVar;
        this.f231640i = crVar2;
        this.f231636d = aiVar;
        this.f231635c = cVar;
        C93440ag agVar = (C93440ag) axVar.mo56107c();
        C93502h hVar = (C93502h) agVar.f260800a.mo17428b();
        hVar.getClass();
        Context context2 = (Context) agVar.f260801b.mo17428b();
        context2.getClass();
        C68214a a = C68219e.m98518a(((C68226l) agVar.f260802c).f184585a);
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) agVar.f260803d).f184585a);
        a2.getClass();
        C90465g gVar2 = (C90465g) agVar.f260804e.mo17428b();
        gVar2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) agVar.f260805f).f184585a);
        a3.getClass();
        ((C90476a) agVar.f260806g.mo17428b()).getClass();
        C91142g gVar3 = (C91142g) agVar.f260807h.mo17428b();
        gVar3.getClass();
        C93439af afVar = new C93439af(hVar, context2, a, a2, gVar2, a3, gVar3);
        this.f231638g = afVar;
        this.f231641j = gVar;
        C93439af afVar2 = afVar;
        C93502h hVar2 = afVar.f260793b;
        context.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) hVar2.f260972a).f184585a);
        a4.getClass();
        ((C90476a) hVar2.f260973b.mo17428b()).getClass();
        this.f231637f = new C93501g(context, a4);
        this.f231642k = crVar3;
        this.f231634b = new C88521o();
        this.f231643l = axVar2;
    }

    /* renamed from: b */
    private static CardDecision m137563b(CardDecision cardDecision, VoiceAction voiceAction, VoiceAction voiceAction2) {
        return (voiceAction2 == null || voiceAction2 != voiceAction || cardDecision == null) ? CardDecision.f236248b : cardDecision;
    }

    /* renamed from: c */
    private final void m137564c(C89933d dVar) {
        int i;
        TextView textView;
        TextView textView2;
        C58881cr crVar;
        this.f231645n = false;
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        ActionData actionData = this.f231644m;
        boolean z = actionData != null && actionData.mo81099j();
        C88521o oVar = this.f231634b;
        if (oVar.f239246c) {
            LayoutInflater layoutInflater = (LayoutInflater) this.f231642k.mo6453a();
            int i2 = 3;
            if (oVar.f239249f == null) {
                TextView textView3 = (TextView) layoutInflater.inflate(R.layout.classic_action_editor_follow_on_prompt, (ViewGroup) null);
                C90638an anVar = new C90638an(0);
                anVar.f253489r = 3;
                anVar.bottomMargin = (int) TypedValue.applyDimension(1, -36.0f, textView3.getResources().getDisplayMetrics());
                anVar.f253473b = false;
                textView3.setLayoutParams(anVar);
                oVar.f239249f = textView3;
                C89941l.m146512c(oVar.f239249f, 6741);
            }
            TextView textView4 = this.f231634b.f239249f;
            if (textView4 != null) {
                C90638an anVar2 = (C90638an) textView4.getLayoutParams();
                if (z) {
                    i2 = 7;
                }
                anVar2.f253489r = i2;
            }
        }
        boolean z2 = this.f231634b.f239248e;
        boolean z3 = false;
        for (int i3 = 0; i3 < this.f231633a.size(); i3++) {
            C85680c cVar = (C85680c) this.f231633a.get(i3);
            if (cVar.mo79251a()) {
                z2 = true;
            } else if (!cVar.mo79251a()) {
                if (cVar.f231651c == null) {
                    C88508b n = this.f231637f.mo82119n(cVar.f231650b);
                    C58838bb.m90883r(cVar.f231651c == null);
                    n.getClass();
                    cVar.f231651c = n;
                    if (n.getLayoutParams() == null) {
                        C90638an anVar3 = new C90638an(0);
                        anVar3.f253473b = false;
                        anVar3.f253489r = true != z ? 1 : 5;
                        n.setLayoutParams(anVar3);
                    }
                    z2 = true;
                } else if (!cVar.mo79252b()) {
                }
                z3 = true;
            }
        }
        if (z2) {
            if (z3 && (crVar = this.f231640i) != null) {
                ((C90633ai) crVar.mo6453a()).mo84827u();
            }
            SuggestionGridLayout suggestionGridLayout = (SuggestionGridLayout) this.f231639h.mo6453a();
            ArrayList arrayList = new ArrayList();
            for (C85680c cVar2 : this.f231633a) {
                if (cVar2.mo79251a()) {
                    suggestionGridLayout.mo84839b(cVar2.f231651c);
                    arrayList.add(cVar2);
                }
            }
            this.f231633a.removeAll(arrayList);
            C88521o oVar2 = this.f231634b;
            boolean z4 = oVar2.f239246c;
            boolean z5 = oVar2.f239247d;
            oVar2.f239247d = false;
            if ((z5 || !z4) && (textView2 = oVar2.f239249f) != null) {
                suggestionGridLayout.mo84839b(textView2);
            }
            if (z4) {
                C88521o oVar3 = this.f231634b;
                if (oVar3.f239248e && (textView = oVar3.f239249f) != null && oVar3.f239246c) {
                    textView.setText(oVar3.f239244a);
                    oVar3.f239249f.setActivated(true);
                }
                oVar3.f239248e = false;
                TextView textView5 = this.f231634b.f239249f;
                if (suggestionGridLayout.getChildCount() == 0 || suggestionGridLayout.getChildAt(0) != textView5) {
                    textView5.getClass();
                    suggestionGridLayout.mo84844f(textView5, 0, 0);
                }
                i = 1;
            } else {
                i = 0;
            }
            C89931b bVar = new C89931b();
            boolean z6 = false;
            for (C85680c cVar3 : this.f231633a) {
                if (cVar3.mo79252b()) {
                    C88508b bVar2 = cVar3.f231651c;
                    C58838bb.m90883r(cVar3.mo79252b());
                    cVar3.f231652d = 1;
                    if (bVar2.mo82068h(bVar)) {
                        bVar.mo83770b();
                    }
                    suggestionGridLayout.mo84844f(bVar2, i, 0);
                    z6 = true;
                }
                i++;
            }
            if (z4 && i > 1) {
                suggestionGridLayout.getChildAt(1).bringToFront();
            }
            if (z6 && dVar != null) {
                bVar.mo83769a(this.f231635c, suggestionGridLayout, dVar);
            }
        }
    }

    /* renamed from: e */
    private final boolean m137565e(VoiceAction voiceAction, CardDecision cardDecision, boolean z, boolean z2) {
        String str = cardDecision.f236249c;
        boolean z3 = false;
        if (voiceAction.mo81082u() || TextUtils.isEmpty(str)) {
            return this.f231634b.mo82137a(false);
        }
        boolean z4 = true;
        boolean a = this.f231634b.mo82137a(true);
        C88521o oVar = this.f231634b;
        boolean z5 = !TextUtils.equals(str, oVar.f239244a);
        oVar.f239248e |= z5;
        oVar.f239244a = str;
        boolean z6 = a | z5;
        C88521o oVar2 = this.f231634b;
        if (z != oVar2.f239245b) {
            z3 = true;
        }
        oVar2.f239248e |= z3;
        oVar2.f239245b = z;
        boolean z7 = z6 | z3;
        if (z2) {
            oVar2.f239248e = true;
            oVar2.f239247d = true;
        } else {
            z4 = z7;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: com.google.android.apps.gsa.search.shared.actions.VoiceAction} */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027c, code lost:
        if (r4.f231650b.f239226b == r2) goto L_0x02a8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0214  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79250a(com.google.android.apps.gsa.search.shared.service.ServiceEventData r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            com.google.android.apps.gsa.search.shared.service.b.uo r2 = r1.f236959a
            int r2 = r2.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r2)
            if (r2 != 0) goto L_0x0010
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x0010:
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r2 = r2.ordinal()
            r3 = 14
            r4 = 1
            if (r2 == r3) goto L_0x042f
            r3 = 15
            r5 = 0
            if (r2 == r3) goto L_0x03e9
            r3 = 59
            if (r2 == r3) goto L_0x0026
            goto L_0x0449
        L_0x0026:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.aab.f237058a
            java.lang.Object r2 = r1.mo81918e(r2)
            com.google.android.apps.gsa.search.shared.service.b.aad r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.aad) r2
            boolean r3 = r2.f237064d
            boolean r6 = r2.f237063c
            boolean r7 = r0.f231647p
            r7 = r7 & r6
            r0.f231647p = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r8 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            com.google.android.apps.gsa.shared.search.Query r9 = com.google.android.apps.gsa.shared.search.Query.f252741b
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable> r10 = com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable.class
            boolean r10 = r1.mo81913d(r10)
            if (r10 == 0) goto L_0x006e
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable> r8 = com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable.class
            android.os.Parcelable r1 = r1.mo81912b(r8)
            com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable r1 = (com.google.android.apps.gsa.search.shared.service.UpdateVoiceActionUiEventParcelable) r1
            java.util.List r8 = r1.f236966b
            java.util.Iterator r8 = r8.iterator()
        L_0x0056:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x006a
            java.lang.Object r9 = r8.next()
            com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction r9 = (com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction) r9
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r9 = r9.f236008a
            if (r9 == 0) goto L_0x0056
            r7.add(r9)
            goto L_0x0056
        L_0x006a:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r8 = r1.f236967c
            com.google.android.apps.gsa.shared.search.Query r9 = r1.f236965a
        L_0x006e:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x007b
            java.lang.Object r1 = r7.get(r5)
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r1 = (com.google.android.apps.gsa.search.shared.actions.VoiceAction) r1
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            com.google.protobuf.z r11 = r2.f237068h
            byte[] r11 = r11.mo59174N()
            android.os.Parcelable$Creator r12 = com.google.android.apps.gsa.search.shared.actions.ActionData.CREATOR
            android.os.Parcelable r11 = com.google.android.apps.gsa.shared.util.C90772bp.m148302j(r11, r12)
            com.google.android.apps.gsa.search.shared.actions.ActionData r11 = (com.google.android.apps.gsa.search.shared.actions.ActionData) r11
            r0.f231644m = r11
            boolean r11 = r2.f237062b
            boolean r12 = r2.f237065e
            if (r12 == 0) goto L_0x00af
            com.google.common.base.cr r12 = r0.f231639h
            java.lang.Object r12 = r12.mo6453a()
            com.google.android.apps.gsa.shared.ui.SuggestionGridLayout r12 = (com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout) r12
            r12.removeAllViews()
            com.google.common.base.cr r12 = r0.f231640i
            if (r12 == 0) goto L_0x00aa
            java.lang.Object r12 = r12.mo6453a()
            com.google.android.apps.gsa.shared.ui.ai r12 = (com.google.android.apps.gsa.shared.p7148ui.C90633ai) r12
            r12.setScrollY(r5)
        L_0x00aa:
            java.util.List r12 = r0.f231633a
            r12.clear()
        L_0x00af:
            boolean r12 = r2.f237066f
            if (r12 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            if (r8 == 0) goto L_0x00c0
            boolean r12 = r0.f231645n
            boolean r13 = r0.m137565e(r1, r8, r11, r5)
            r12 = r12 | r13
            r0.f231645n = r12
        L_0x00c0:
            com.google.android.apps.gsa.search.shared.service.b.ar r12 = r2.f237069i
            if (r12 != 0) goto L_0x00c6
            com.google.android.apps.gsa.search.shared.service.b.ar r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87709ar.f237172f
        L_0x00c6:
            int r13 = r2.f237061a
            r13 = r13 & 128(0x80, float:1.794E-43)
            java.lang.String r14 = "ActionCardControllerImp"
            if (r13 == 0) goto L_0x0132
            boolean r13 = r12.f237178e
            if (r13 != 0) goto L_0x0144
            com.google.protobuf.z r13 = r12.f237176c
            byte[] r13 = r13.mo59174N()
            android.os.Parcelable$Creator r15 = com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction.CREATOR
            android.os.Parcelable r13 = com.google.android.apps.gsa.shared.util.C90772bp.m148302j(r13, r15)
            com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction r13 = (com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction) r13
            if (r13 == 0) goto L_0x00e5
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r13 = r13.f236008a
            goto L_0x00e6
        L_0x00e5:
            r13 = 0
        L_0x00e6:
            com.google.protobuf.z r15 = r12.f237177d
            byte[] r15 = r15.mo59174N()
            android.os.Parcelable$Creator r10 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.CREATOR
            android.os.Parcelable r10 = com.google.android.apps.gsa.shared.util.C90772bp.m148302j(r15, r10)
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r10 = (com.google.android.apps.gsa.search.shared.actions.util.CardDecision) r10
            com.google.protobuf.z r12 = r12.f237175b
            byte[] r12 = r12.mo59174N()
            android.os.Parcelable$Creator r15 = com.google.android.apps.gsa.shared.search.Query.CREATOR
            android.os.Parcelable r12 = com.google.android.apps.gsa.shared.util.C90772bp.m148302j(r12, r15)
            com.google.android.apps.gsa.shared.search.Query r12 = (com.google.android.apps.gsa.shared.search.Query) r12
            com.google.protobuf.z r15 = r2.f237068h
            byte[] r15 = r15.mo59174N()
            android.os.Parcelable$Creator r5 = com.google.android.apps.gsa.search.shared.actions.ActionData.CREATOR
            android.os.Parcelable r5 = com.google.android.apps.gsa.shared.util.C90772bp.m148302j(r15, r5)
            com.google.android.apps.gsa.search.shared.actions.ActionData r5 = (com.google.android.apps.gsa.search.shared.actions.ActionData) r5
            if (r10 == 0) goto L_0x011f
            if (r5 != 0) goto L_0x0116
            r14 = 0
            goto L_0x011a
        L_0x0116:
            int r14 = r5.mo81089a()
        L_0x011a:
            com.google.android.apps.gsa.shared.logger.j.d r5 = com.google.android.apps.gsa.search.shared.actions.p6921b.C87400a.m141528a(r12, r5, r14, r13, r10)
            goto L_0x0145
        L_0x011f:
            com.google.common.f.e r5 = f231632e
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r10, r14)
            java.lang.String r10 = "Failed to unmarshall CardDecision."
            r12 = 7542(0x1d76, float:1.0569E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r12)).mo56386p(r10)
            goto L_0x0144
        L_0x0132:
            com.google.common.f.e r5 = f231632e
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r10, r14)
            java.lang.String r10 = "No BuildVeLoggingEventData included in the UpdateVoiceActionUiEventData."
            r12 = 7543(0x1d77, float:1.057E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r12)).mo56386p(r10)
        L_0x0144:
            r5 = 0
        L_0x0145:
            boolean r10 = r0.f231647p
            if (r10 != 0) goto L_0x0154
            boolean r2 = r2.f237067g
            if (r2 == 0) goto L_0x014e
            goto L_0x0154
        L_0x014e:
            r24 = r5
            r35 = r6
            goto L_0x03da
        L_0x0154:
            boolean r2 = r7.isEmpty()
            r10 = 2
            if (r2 == 0) goto L_0x0181
            java.util.List r1 = r0.f231633a
            java.util.Iterator r1 = r1.iterator()
        L_0x0161:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0178
            java.lang.Object r2 = r1.next()
            com.google.android.apps.gsa.search.core.c.a.c r2 = (com.google.android.apps.gsa.search.core.p6775c.p6776a.C85680c) r2
            boolean r3 = r2.mo79251a()
            if (r3 != 0) goto L_0x0161
            r0.f231645n = r4
            r2.f231652d = r10
            goto L_0x0161
        L_0x0178:
            boolean r1 = r0.f231645n
            if (r1 == 0) goto L_0x03e5
            r0.m137564c(r5)
            goto L_0x03e5
        L_0x0181:
            boolean r2 = r0.f231647p
            if (r2 != 0) goto L_0x018a
            if (r3 == 0) goto L_0x0188
            goto L_0x018a
        L_0x0188:
            r2 = 0
            goto L_0x018b
        L_0x018a:
            r2 = 1
        L_0x018b:
            int r3 = r7.size()
            java.util.ArrayList r3 = com.google.common.p4522b.C58597ky.m90214e(r3)
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89842j(r7)
            java.util.List r13 = r0.f231633a
            java.util.Iterator r13 = r13.iterator()
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.List r15 = r0.f231633a
            java.util.Iterator r15 = r15.iterator()
        L_0x01a8:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x01c5
            java.lang.Object r16 = r15.next()
            r4 = r16
            com.google.android.apps.gsa.search.core.c.a.c r4 = (com.google.android.apps.gsa.search.core.p6775c.p6776a.C85680c) r4
            boolean r16 = r4.mo79251a()
            if (r16 != 0) goto L_0x01c3
            com.google.android.apps.gsa.search.shared.ui.actions.a r4 = r4.f231650b
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r4 = r4.f239226b
            r14.add(r4)
        L_0x01c3:
            r4 = 1
            goto L_0x01a8
        L_0x01c5:
            boolean r4 = r0.f231646o
            if (r4 != 0) goto L_0x01ce
            if (r2 == 0) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            r2 = 0
            goto L_0x01cf
        L_0x01ce:
            r2 = 1
        L_0x01cf:
            r0.f231646o = r2
            int r2 = r12.size()
            r4 = 0
            r10 = 0
            r15 = 0
            r16 = 0
            r18 = 1
            r19 = 0
        L_0x01de:
            if (r10 >= r2) goto L_0x0389
            java.lang.Object r20 = r12.get(r10)
            r21 = r2
            r2 = r20
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = (com.google.android.apps.gsa.search.shared.actions.VoiceAction) r2
            boolean r20 = r7.contains(r2)
            if (r20 == 0) goto L_0x036d
        L_0x01f0:
            boolean r20 = r13.hasNext()
            if (r20 == 0) goto L_0x0203
            java.lang.Object r20 = r13.next()
            com.google.android.apps.gsa.search.core.c.a.c r20 = (com.google.android.apps.gsa.search.core.p6775c.p6776a.C85680c) r20
            r36 = r20
            r20 = r4
            r4 = r36
            goto L_0x0206
        L_0x0203:
            r20 = r4
            r4 = 0
        L_0x0206:
            if (r4 == 0) goto L_0x0212
            boolean r22 = r4.mo79251a()
            if (r22 != 0) goto L_0x020f
            goto L_0x0212
        L_0x020f:
            r4 = r20
            goto L_0x01f0
        L_0x0212:
            if (r18 == 0) goto L_0x02bc
            if (r4 == 0) goto L_0x02af
            r22 = r7
            com.google.android.apps.gsa.search.shared.ui.actions.a r7 = r4.f231650b
            r23 = r12
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r12 = r7.f239226b
            if (r12 != r2) goto L_0x0258
            r24 = r5
            if (r16 != 0) goto L_0x0232
            boolean r5 = r0.f231646o
            if (r5 == 0) goto L_0x0229
            goto L_0x0232
        L_0x0229:
            r35 = r6
            r34 = r14
            r4 = r20
            r16 = 0
            goto L_0x0254
        L_0x0232:
            r5 = 0
            r0.f231646o = r5
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r2 = m137563b(r8, r1, r2)
            com.google.android.apps.gsa.search.shared.ui.actions.f r4 = r4.f231649a
            com.google.android.apps.gsa.staticplugins.actionsui.bj r4 = (com.google.android.apps.gsa.staticplugins.actionsui.C93482bj) r4
            r4.f260881b = r9
            r4.f260882c = r2
            if (r12 == 0) goto L_0x024c
            boolean r2 = r12.equals(r1)
            if (r2 == 0) goto L_0x024c
            r7.mo82049l(r12)
        L_0x024c:
            r35 = r6
            r34 = r14
            r4 = r20
            r16 = 1
        L_0x0254:
            r18 = 1
            goto L_0x0379
        L_0x0258:
            r24 = r5
            boolean r5 = r14.contains(r2)
            if (r5 == 0) goto L_0x027f
        L_0x0260:
            com.google.android.apps.gsa.search.shared.ui.actions.a r5 = r4.f231650b
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r5 = r5.f239226b
            if (r5 == r2) goto L_0x0278
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x0278
            r5 = 2
            r4.f231652d = r5
            java.lang.Object r4 = r13.next()
            com.google.android.apps.gsa.search.core.c.a.c r4 = (com.google.android.apps.gsa.search.core.p6775c.p6776a.C85680c) r4
            r20 = 1
            goto L_0x0260
        L_0x0278:
            com.google.android.apps.gsa.search.shared.ui.actions.a r5 = r4.f231650b
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r5 = r5.f239226b
            if (r5 != r2) goto L_0x02b5
            goto L_0x02a8
        L_0x027f:
            boolean r5 = r2.mo81078q(r12)
            if (r5 == 0) goto L_0x02b5
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r5 = m137563b(r8, r1, r2)
            com.google.android.apps.gsa.search.shared.ui.actions.f r4 = r4.f231649a
            r12 = r4
            com.google.android.apps.gsa.staticplugins.actionsui.bj r12 = (com.google.android.apps.gsa.staticplugins.actionsui.C93482bj) r12
            r12.f260881b = r9
            r12.f260882c = r5
            r7.mo82054q(r2)
            com.google.android.apps.gsa.search.shared.actions.ActionData r2 = r0.f231644m
            if (r2 != 0) goto L_0x029d
            com.google.android.apps.gsa.search.shared.actions.ActionData r2 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            r0.f231644m = r2
        L_0x029d:
            com.google.android.apps.gsa.search.shared.actions.ActionData r2 = r0.f231644m
            r4.mo82114v(r2)
            r7.mo82056s()
            r2 = 1
            r0.f231645n = r2
        L_0x02a8:
            r35 = r6
            r34 = r14
            r4 = r20
            goto L_0x0254
        L_0x02af:
            r24 = r5
            r22 = r7
            r23 = r12
        L_0x02b5:
            r5 = r4
            r4 = r20
            r20 = r4
            r4 = r5
            goto L_0x02c2
        L_0x02bc:
            r24 = r5
            r22 = r7
            r23 = r12
        L_0x02c2:
            if (r4 == 0) goto L_0x02c9
            r5 = 2
            r4.f231652d = r5
            r20 = 1
        L_0x02c9:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = m137563b(r8, r1, r2)
            com.google.android.apps.gsa.search.shared.actions.ActionData r5 = r0.f231644m
            if (r5 != 0) goto L_0x02d3
            com.google.android.apps.gsa.search.shared.actions.ActionData r5 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
        L_0x02d3:
            r28 = r5
            com.google.android.apps.gsa.search.core.c.a r5 = r0.f231638g
            com.google.common.base.cr r7 = r0.f231639h
            com.google.android.apps.gsa.shared.util.t.g r12 = r0.f231641j
            com.google.android.apps.gsa.search.shared.service.ai r15 = r0.f231636d
            r34 = r14
            com.google.android.apps.gsa.staticplugins.actionsui.bj r14 = new com.google.android.apps.gsa.staticplugins.actionsui.bj
            com.google.android.apps.gsa.staticplugins.actionsui.af r5 = (com.google.android.apps.gsa.staticplugins.actionsui.C93439af) r5
            r35 = r6
            dagger.a r6 = r5.f260796e
            java.lang.Object r6 = r6.mo27525b()
            r26 = r6
            com.google.android.apps.gsa.shared.util.c.cb r26 = (com.google.android.apps.gsa.shared.util.p7159c.C90932cb) r26
            com.google.android.apps.gsa.shared.logger.j.c r29 = com.google.android.apps.gsa.shared.logger.p7065j.C89932c.f246391b
            dagger.a r6 = r5.f260798g
            android.content.Context r5 = r5.f260794c
            r25 = r14
            r27 = r7
            r30 = r12
            r31 = r6
            r32 = r15
            r33 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r14.f260881b = r9
            r14.f260882c = r4
            com.google.android.apps.gsa.staticplugins.actionsui.x r4 = r0.f231648q
            if (r4 != 0) goto L_0x0339
            com.google.android.apps.gsa.search.core.c.a r4 = r0.f231638g
            com.google.common.base.ax r5 = r0.f231643l
            com.google.android.apps.gsa.staticplugins.actionsui.x r6 = new com.google.android.apps.gsa.staticplugins.actionsui.x
            com.google.android.apps.gsa.staticplugins.actionsui.af r4 = (com.google.android.apps.gsa.staticplugins.actionsui.C93439af) r4
            android.content.Context r7 = r4.f260794c
            dagger.a r12 = r4.f260795d
            java.lang.Object r12 = r12.mo27525b()
            r27 = r12
            com.google.android.apps.gsa.shared.util.v r27 = (com.google.android.apps.gsa.shared.util.C91123v) r27
            com.google.android.apps.gsa.shared.r.g r12 = r4.f260797f
            com.google.common.base.b r33 = com.google.common.base.C58836b.f156633a
            r29 = 1
            r30 = 0
            com.google.android.apps.gsa.shared.util.v.g r4 = r4.f260799h
            r25 = r6
            r26 = r7
            r28 = r12
            r31 = r4
            r32 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0.f231648q = r6
        L_0x0339:
            com.google.android.apps.gsa.staticplugins.actionsui.x r4 = r0.f231648q
            if (r4 != 0) goto L_0x033f
        L_0x033d:
            r5 = 0
            goto L_0x034e
        L_0x033f:
            com.google.android.apps.gsa.search.shared.ui.actions.a r4 = r4.mo88150a(r2, r14)
            if (r4 != 0) goto L_0x0346
            goto L_0x033d
        L_0x0346:
            r4.mo82054q(r2)
            com.google.android.apps.gsa.search.core.c.a.c r5 = new com.google.android.apps.gsa.search.core.c.a.c
            r5.<init>(r14, r4)
        L_0x034e:
            if (r5 != 0) goto L_0x0352
            goto L_0x03da
        L_0x0352:
            com.google.android.apps.gsa.search.shared.ui.actions.a r4 = r5.f231650b
            r4.mo82056s()
            if (r2 != r1) goto L_0x035d
            r2 = 1
            r17 = 0
            goto L_0x0360
        L_0x035d:
            r2 = 1
            r17 = 1
        L_0x0360:
            r4 = r17 ^ 1
            r19 = r4 | r19
            r3.add(r5)
            r4 = r20
            r15 = 1
            r18 = 0
            goto L_0x0379
        L_0x036d:
            r20 = r4
            r24 = r5
            r35 = r6
            r22 = r7
            r23 = r12
            r34 = r14
        L_0x0379:
            int r10 = r10 + 1
            r2 = r21
            r7 = r22
            r12 = r23
            r5 = r24
            r14 = r34
            r6 = r35
            goto L_0x01de
        L_0x0389:
            r20 = r4
            r24 = r5
            r35 = r6
        L_0x038f:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x03a1
            java.lang.Object r2 = r13.next()
            com.google.android.apps.gsa.search.core.c.a.c r2 = (com.google.android.apps.gsa.search.core.p6775c.p6776a.C85680c) r2
            r4 = 2
            r2.f231652d = r4
            r20 = 1
            goto L_0x038f
        L_0x03a1:
            java.util.List r2 = r0.f231633a
            r2.addAll(r3)
            java.util.List r2 = r0.f231633a
            java.util.Iterator r2 = r2.iterator()
        L_0x03ac:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03c9
            java.lang.Object r3 = r2.next()
            com.google.android.apps.gsa.search.core.c.a.c r3 = (com.google.android.apps.gsa.search.core.p6775c.p6776a.C85680c) r3
            com.google.android.apps.gsa.search.shared.ui.actions.a r4 = r3.f231650b
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r4 = r4.f239226b
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = m137563b(r8, r1, r4)
            com.google.android.apps.gsa.search.shared.ui.actions.f r3 = r3.f231649a
            com.google.android.apps.gsa.staticplugins.actionsui.bj r3 = (com.google.android.apps.gsa.staticplugins.actionsui.C93482bj) r3
            r3.f260881b = r9
            r3.f260882c = r4
            goto L_0x03ac
        L_0x03c9:
            if (r19 == 0) goto L_0x03d3
            r1.getClass()
            r2 = 1
            r0.m137565e(r1, r8, r11, r2)
            goto L_0x03d4
        L_0x03d3:
            r2 = 1
        L_0x03d4:
            if (r15 != 0) goto L_0x03d8
            if (r20 == 0) goto L_0x03da
        L_0x03d8:
            r0.f231645n = r2
        L_0x03da:
            boolean r1 = r0.f231645n
            if (r1 == 0) goto L_0x03e5
            if (r35 == 0) goto L_0x03e5
            r5 = r24
            r0.m137564c(r5)
        L_0x03e5:
            r2 = 0
            r0.f231647p = r2
            return
        L_0x03e9:
            r2 = 0
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88357yr.f238949a
            java.lang.Object r1 = r1.mo81918e(r3)
            com.google.android.apps.gsa.search.shared.service.b.yt r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88359yt) r1
            com.google.android.apps.gsa.search.shared.actions.k r1 = r1.f238953b
            if (r1 != 0) goto L_0x03f8
            com.google.android.apps.gsa.search.shared.actions.k r1 = com.google.android.apps.gsa.search.shared.actions.C87423k.f236084e
        L_0x03f8:
            r1.getClass()
            java.util.List r3 = r0.f231633a
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x0402:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x041c
            java.lang.Object r2 = r3.next()
            com.google.android.apps.gsa.search.core.c.a.c r2 = (com.google.android.apps.gsa.search.core.p6775c.p6776a.C85680c) r2
            com.google.android.apps.gsa.search.shared.ui.actions.a r2 = r2.f231650b
            boolean r4 = r2.mo82060w()
            if (r4 == 0) goto L_0x0402
            boolean r2 = r2.mo82059v(r1)
            r5 = r5 | r2
            goto L_0x0402
        L_0x041c:
            if (r5 != 0) goto L_0x0449
            com.google.android.apps.gsa.search.shared.service.ai r1 = r0.f231636d
            com.google.android.apps.gsa.search.shared.service.j r2 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNDOABLE_INTERACTION_NOT_HANDLED
            r2.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r3)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r2 = r2.mo82013a()
            r1.mo81937i(r2)
            return
        L_0x042f:
            java.util.List r1 = r0.f231633a
            java.util.Iterator r1 = r1.iterator()
        L_0x0435:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0449
            java.lang.Object r2 = r1.next()
            com.google.android.apps.gsa.search.core.c.a.c r2 = (com.google.android.apps.gsa.search.core.p6775c.p6776a.C85680c) r2
            com.google.android.apps.gsa.search.shared.ui.actions.f r2 = r2.f231649a
            com.google.android.apps.gsa.staticplugins.actionsui.bj r2 = (com.google.android.apps.gsa.staticplugins.actionsui.C93482bj) r2
            r3 = 1
            r2.f260880a = r3
            goto L_0x0435
        L_0x0449:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6775c.p6776a.C85679b.mo79250a(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActionCardPresenter");
        fVar.mo85292s(C90752i.m148233g(this.f231633a.toString()));
    }
}
