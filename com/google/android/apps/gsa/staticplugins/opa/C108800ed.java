package com.google.android.apps.gsa.staticplugins.opa;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.m.b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88213ti;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88214tj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88215tk;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90737au;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108412ht;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109100ar;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109105b;
import com.google.android.apps.gsa.staticplugins.opa.p8310av.C107621a;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.VoiceSearchUi;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3775ac.p3779d.C48462b;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62940bt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ed */
/* compiled from: PG */
public final class C108800ed extends C88499t {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f302540a;

    public C108800ed(C109040fj fjVar) {
        this.f302540a = fjVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x018e, code lost:
        r5 = r6.mo97802c(r5, r10, r9, r7);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17567f(com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r11.f302540a
            com.google.android.apps.gsa.staticplugins.opa.av.a r1 = r0.f303274ah
            android.os.Bundle r0 = r0.f303442g
            r2 = 1
            if (r0 == 0) goto L_0x0017
            boolean r3 = r1.mo96076a()
            if (r3 == 0) goto L_0x0017
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.p8310av.C107621a.m178509b(r0)
            if (r0 == 0) goto L_0x0017
            r1.f299393e = r2
        L_0x0017:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r11.f302540a
            dagger.a r0 = r0.f303325bf
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bi r0 = (com.google.android.apps.gsa.staticplugins.opa.util.C113793bi) r0
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r11.f302540a
            android.view.ViewGroup r1 = r1.f303449n
            r3 = 0
            r0.mo100643c(r1, r3)
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r11.f302540a
            com.google.android.libraries.assistant.assistantactions.rendering.c.h r0 = r0.f303310bQ
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.mo19705I()
            if (r0 == 0) goto L_0x0039
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x01f2
        L_0x0039:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r11.f302540a
            com.google.android.apps.gsa.staticplugins.opa.b r0 = r0.f303237W
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r12 = r12.f236008a
            com.google.android.apps.gsa.search.shared.actions.SearchError r12 = (com.google.android.apps.gsa.search.shared.actions.SearchError) r12
            if (r12 == 0) goto L_0x01f2
            com.google.android.apps.gsa.search.shared.actions.SearchError r1 = r0.f299733g
            boolean r1 = r12.equals(r1)
            if (r1 != 0) goto L_0x01f2
            r0.f299733g = r12
            com.google.android.apps.gsa.staticplugins.opa.ef r1 = r0.f299737k
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r1.f302543b
            r1.mo97459aU()
            boolean r1 = r12 instanceof com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError
            if (r1 == 0) goto L_0x005e
            r1 = r12
            com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError r1 = (com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError) r1
            int r1 = r1.f236066n
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            int r4 = r12.mo81135N()
            com.google.common.base.ax r5 = r12.f236026j
            r6 = 524289(0x80001, float:7.34685E-40)
            if (r4 != r6) goto L_0x0076
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            com.google.common.base.ax r5 = r5.mo56105a(r4)
        L_0x0076:
            boolean r4 = r5.mo56113h()
            if (r4 == 0) goto L_0x01bb
            com.google.android.apps.gsa.staticplugins.opa.ef r4 = r0.f299737k
            java.lang.Object r5 = r5.mo56107c()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.google.android.apps.gsa.shared.logger.d.b r5 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.m146362a(r5)
            com.google.android.apps.gsa.shared.search.Query r6 = r12.f236023g
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r4.f302543b
            com.google.android.apps.gsa.staticplugins.opa.ki r8 = r7.f303286at
            if (r8 == 0) goto L_0x01b9
            r7.mo97546s()
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r4.f302543b
            r7.mo97418F()
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r4.f302543b
            r7.mo97544q()
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r4.f302543b
            com.google.android.apps.gsa.staticplugins.opa.ki r8 = r7.f303286at
            long r9 = r7.f303235U
            com.google.android.apps.gsa.staticplugins.opa.x r7 = new com.google.android.apps.gsa.staticplugins.opa.x
            r7.<init>(r6, r9)
            r8.f304576e = r2
            boolean r6 = r8.f304574c
            if (r6 == 0) goto L_0x00e1
            r5 = 2132090712(0x7f151f58, float:1.9821772E38)
            java.lang.String r5 = r8.mo97777a(r5)
            com.google.android.apps.gsa.staticplugins.opa.kr r5 = com.google.android.apps.gsa.staticplugins.opa.C109355kr.m182051e(r5)
            com.google.android.apps.gsa.staticplugins.opa.kr r5 = r5.mo97799g(r7)
            r6 = 2132090711(0x7f151f57, float:1.982177E38)
            java.lang.String r6 = r8.mo97777a(r6)
            com.google.android.apps.gsa.staticplugins.opa.v r9 = new com.google.android.apps.gsa.staticplugins.opa.v
            r9.<init>()
            r10 = 123396(0x1e204, float:1.72915E-40)
            r9.mo97792d(r6, r10)
            com.google.android.apps.gsa.staticplugins.opa.kr r6 = r9.mo97789a()
            com.google.android.apps.gsa.staticplugins.opa.kr r6 = r6.mo97799g(r7)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89847o(r5, r6)
            goto L_0x01a4
        L_0x00e1:
            com.google.android.apps.gsa.staticplugins.opa.kw r6 = r8.f304573b
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r5 = r5.ordinal()
            r9 = 170(0xaa, float:2.38E-43)
            if (r5 == r9) goto L_0x0193
            switch(r5) {
                case 180: goto L_0x017e;
                case 181: goto L_0x017e;
                case 182: goto L_0x016d;
                case 183: goto L_0x016d;
                case 184: goto L_0x015c;
                case 185: goto L_0x015c;
                case 186: goto L_0x012b;
                case 187: goto L_0x012b;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            switch(r5) {
                case 190: goto L_0x011a;
                case 191: goto L_0x011a;
                case 192: goto L_0x0108;
                case 193: goto L_0x0108;
                case 194: goto L_0x00f9;
                case 195: goto L_0x00f9;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x01a4
        L_0x00f9:
            com.google.android.apps.gsa.staticplugins.opa.kn r5 = r6.f304637c
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.gsa.staticplugins.opa.kt r9 = new com.google.android.apps.gsa.staticplugins.opa.kt
            r9.<init>(r5)
            r5 = 2132090705(0x7f151f51, float:1.9821758E38)
            goto L_0x01a0
        L_0x0108:
            com.google.android.apps.gsa.staticplugins.opa.kn r5 = r6.f304637c
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.gsa.staticplugins.opa.ks r9 = new com.google.android.apps.gsa.staticplugins.opa.ks
            r9.<init>(r5)
            r5 = 2132090697(0x7f151f49, float:1.9821741E38)
            r10 = 2132090698(0x7f151f4a, float:1.9821743E38)
            goto L_0x018e
        L_0x011a:
            com.google.android.apps.gsa.staticplugins.opa.kn r5 = r6.f304637c
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.gsa.staticplugins.opa.ks r9 = new com.google.android.apps.gsa.staticplugins.opa.ks
            r9.<init>(r5)
            r5 = 2132090701(0x7f151f4d, float:1.982175E38)
            r10 = 2132090702(0x7f151f4e, float:1.9821751E38)
            goto L_0x018e
        L_0x012b:
            dagger.a r5 = r6.f304636b
            java.lang.Object r5 = r5.mo27525b()
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5
            int r5 = r5.getSimState()
            com.google.common.b.ij r9 = com.google.android.apps.gsa.staticplugins.opa.C109360kw.f304635a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x014b
            r5 = 2132090716(0x7f151f5c, float:1.982178E38)
            com.google.common.b.gu r5 = r6.mo97800a(r5, r7)
            goto L_0x01a4
        L_0x014b:
            com.google.android.apps.gsa.staticplugins.opa.kn r5 = r6.f304637c
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.gsa.staticplugins.opa.ks r9 = new com.google.android.apps.gsa.staticplugins.opa.ks
            r9.<init>(r5)
            r5 = 2132090717(0x7f151f5d, float:1.9821782E38)
            r10 = 2132090718(0x7f151f5e, float:1.9821784E38)
            goto L_0x018e
        L_0x015c:
            com.google.android.apps.gsa.staticplugins.opa.kn r5 = r6.f304637c
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.gsa.staticplugins.opa.ks r9 = new com.google.android.apps.gsa.staticplugins.opa.ks
            r9.<init>(r5)
            r5 = 2132090706(0x7f151f52, float:1.982176E38)
            r10 = 2132090707(0x7f151f53, float:1.9821762E38)
            goto L_0x018e
        L_0x016d:
            com.google.android.apps.gsa.staticplugins.opa.kn r5 = r6.f304637c
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.gsa.staticplugins.opa.ks r9 = new com.google.android.apps.gsa.staticplugins.opa.ks
            r9.<init>(r5)
            r5 = 2132090703(0x7f151f4f, float:1.9821753E38)
            r10 = 2132090704(0x7f151f50, float:1.9821756E38)
            goto L_0x018e
        L_0x017e:
            com.google.android.apps.gsa.staticplugins.opa.kn r5 = r6.f304637c
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.gsa.staticplugins.opa.ku r9 = new com.google.android.apps.gsa.staticplugins.opa.ku
            r9.<init>(r5)
            r5 = 2132090694(0x7f151f46, float:1.9821735E38)
            r10 = 2132090695(0x7f151f47, float:1.9821737E38)
        L_0x018e:
            com.google.common.b.gu r5 = r6.mo97802c(r5, r10, r9, r7)
            goto L_0x01a4
        L_0x0193:
            com.google.android.apps.gsa.staticplugins.opa.kn r5 = r6.f304637c
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.gsa.staticplugins.opa.kv r9 = new com.google.android.apps.gsa.staticplugins.opa.kv
            r9.<init>(r5)
            r5 = 2132090696(0x7f151f48, float:1.982174E38)
        L_0x01a0:
            com.google.common.b.gu r5 = r6.mo97801b(r5, r9, r7)
        L_0x01a4:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x01b3
            java.util.LinkedList r2 = r8.f304575d
            r2.addAll(r5)
            r8.mo97779f()
            goto L_0x01b6
        L_0x01b3:
            r8.mo97782i(r2, r7)
        L_0x01b6:
            r4.mo97173b()
        L_0x01b9:
            r2 = 3
            goto L_0x01c2
        L_0x01bb:
            int r2 = r12.mo81139S()
            if (r2 != 0) goto L_0x01c6
            r2 = 2
        L_0x01c2:
            r0.mo96245f(r2, r1)
            goto L_0x01e6
        L_0x01c6:
            dagger.a r4 = r0.f299730d
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bf r4 = (com.google.android.apps.gsa.assistant.shared.C73841bf) r4
            android.content.res.Resources r4 = r4.mo65322a()
            java.lang.String r5 = r4.getString(r2)
            com.google.android.apps.gsa.staticplugins.opa.ef r2 = r0.f299737k
            r2 = 4
            r0.mo96245f(r2, r1)
            r6 = 0
            r7 = 0
            r8 = 4
            r9 = 82496(0x14240, float:1.15602E-40)
            r4 = r0
            r4.mo96246g(r5, r6, r7, r8, r9)
        L_0x01e6:
            com.google.android.apps.gsa.staticplugins.opa.ef r0 = r0.f299737k
            com.google.android.apps.gsa.shared.search.Query r12 = r12.f236023g
            long r1 = r12.f252749G
            r12 = 0
            java.lang.String r4 = "error-card-rendered"
            r0.mo97172a(r1, r12, r4)
        L_0x01f2:
            com.google.android.apps.gsa.staticplugins.opa.fj r12 = r11.f302540a
            r12.mo97490az(r3)
            com.google.android.apps.gsa.staticplugins.opa.fj r12 = r11.f302540a
            com.google.android.apps.gsa.staticplugins.opa.samson.a.b.a r12 = r12.f303265aY
            if (r12 == 0) goto L_0x0200
            r12.mo98291a()
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C108800ed.mo17567f(com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction):void");
    }

    /* renamed from: fO */
    public final void mo49088fO(Intent intent) {
        ComponentName component;
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        if (intent.getBooleanExtra("com.google.opa.SHOULD_AUTO_EXPAND_KEYBOARD", false)) {
            this.f302540a.f303326bg = true;
        }
        if (intent.getBooleanExtra("com.google.opa.USE_VIS_INTENT_STARTER", false)) {
            C109065gb gbVar = this.f302540a.f303456u;
            C91097g gVar = gbVar.f304398e;
            if (gVar instanceof C109444lq) {
                ((C109444lq) gVar).f304774f.f295634T.mo97837p();
            }
            gbVar.f303630d.mo81707e(intent, 0);
        } else if (!C109040fj.m181378bx(this.f302540a.f303450o) || !((C113989h) ((C113988g) this.f302540a.f303450o).mo100833bf().mo56107c()).mo100915dv()) {
            this.f302540a.f303456u.mo65089a(intent);
        } else {
            this.f302540a.mo97416D(new C108798eb(this, intent));
        }
        if (this.f302540a.f303371cc && (component = intent.getComponent()) != null && component.getClassName().equals("com.google.android.apps.googleassistant.AssistantActivity")) {
            this.f302540a.f303448m.mo28212l("dismissOpaForShellApp", new C108799ec(this));
        }
    }

    /* renamed from: g */
    public final void mo17568g(int i) {
        this.f302540a.f303306bM = i;
        C58976aa aaVar = C58975e.f156826a;
        C90737au.m148206a(i);
        C11300h hVar = this.f302540a.f303310bQ;
        if (hVar != null) {
            hVar.mo19698B(i);
        }
        C109743nq nqVar = this.f302540a.f303227M;
        if (nqVar != null) {
            nqVar.f305742c.mo76915b(i);
        }
        this.f302540a.f303238X.mo96157ai(i);
        if (C109040fj.m181378bx(this.f302540a.f303450o)) {
            ((C113989h) ((C113988g) this.f302540a.f303450o).mo100833bf().mo56107c()).mo100873cG(i);
        }
        this.f302540a.mo97511bc();
    }

    /* renamed from: h */
    public final void mo17569h(Query query, List list, CardDecision cardDecision, int i) {
        View view;
        String str;
        String str2;
        Query query2 = query;
        List list2 = list;
        CardDecision cardDecision2 = cardDecision;
        int i2 = i;
        C107711b bVar = this.f302540a.f303237W;
        if (i2 != -1 && list2.get(i2) != null) {
            long j = query2.f252749G;
            VoiceAction voiceAction = ((ParcelableVoiceAction) list2.get(i2)).f236008a;
            bVar.f299734h = voiceAction;
            bVar.f299735i = cardDecision2;
            if (voiceAction == null) {
                return;
            }
            if (!query.mo84332bQ() || voiceAction.mo81066g() != C55421x.HELP || voiceAction.equals(bVar.f299732f)) {
                if (cardDecision2.f236255i && !bVar.f299728b.mo95405ap()) {
                    C107698i iVar = bVar.f299737k.f302543b.f303454s;
                    C88489j jVar = new C88489j(C87739bu.REQUEST_EXECUTE_ACTION);
                    jVar.mo82015c(new ParcelableVoiceAction(voiceAction));
                    C62940bt btVar = C88213ti.f238443a;
                    C88214tj tjVar = (C88214tj) C88215tk.f238444d.createBuilder();
                    tjVar.copyOnWrite();
                    C88215tk tkVar = (C88215tk) tjVar.instance;
                    tkVar.f238446a |= 1;
                    tkVar.f238447b = 1;
                    tjVar.copyOnWrite();
                    C88215tk tkVar2 = (C88215tk) tjVar.instance;
                    tkVar2.f238446a = 2 | tkVar2.f238446a;
                    tkVar2.f238448c = false;
                    jVar.mo82014b(btVar, (C88215tk) tjVar.build());
                    iVar.mo96219b(jVar.mo82013a());
                }
                if (!voiceAction.equals(bVar.f299732f)) {
                    if (query2.f252780s == bVar.f299736j) {
                        C108232bc c = bVar.f299728b.mo95421j().mo95353c();
                        if ((c instanceof C108212aj) || (c instanceof C108412ht)) {
                            return;
                        }
                    }
                    String bf = query2.mo84347bf("android.search.extra.EVENT_ID");
                    C108802ef efVar = bVar.f299737k;
                    boolean z = efVar.f302542a != j;
                    C58976aa aaVar = C58975e.f156826a;
                    efVar.f302543b.f303450o.mo95369K(z, j, C109040fj.m181410j(bf));
                    efVar.f302542a = j;
                    if (bVar.f299729c.mo82126g()) {
                        if (voiceAction.mo81082u()) {
                            view = bVar.f299729c.mo82122b();
                        } else {
                            view = bVar.f299729c.mo82123c(voiceAction);
                        }
                        if (view != null) {
                            if (voiceAction.mo81084w() || cardDecision.mo81425i()) {
                                if (!cardDecision.mo81425i() || TextUtils.isEmpty(cardDecision2.f236249c)) {
                                    str = ((C73841bf) bVar.f299730d.mo27525b()).mo65322a().getString(R.string.immersive_actions_confirmation_card_done);
                                } else {
                                    str = cardDecision2.f236249c;
                                }
                                if (voiceAction.mo81082u()) {
                                    ModularAction modularAction = (ModularAction) voiceAction;
                                    C55244le a = modularAction.f235985a.mo81111a(modularAction.mo81219Z());
                                    String str3 = cardDecision2.f236249c;
                                    C87449m mVar = new C87449m(bVar.f299727a);
                                    if (!(a == null || (a.f145468a & 1) == 0)) {
                                        C55136he heVar = a.f145471d;
                                        if (heVar == null) {
                                            heVar = C55136he.f145130j;
                                        }
                                        if (!TextUtils.isEmpty(mVar.mo81378a(heVar, modularAction, true).toString()) && !TextUtils.isEmpty(str3)) {
                                            str = str3;
                                        }
                                    }
                                }
                                str.getClass();
                                bVar.mo96242b(str, view);
                            } else {
                                if (voiceAction.mo81083v()) {
                                    str2 = ((C73841bf) bVar.f299730d.mo27525b()).mo65322a().getString(R.string.immersive_actions_confirmation_card_canceled);
                                } else if (voiceAction.mo81053C()) {
                                    str2 = ((C73841bf) bVar.f299730d.mo27525b()).mo65322a().getString(R.string.immersive_actions_confirmation_card_done);
                                } else if (voiceAction.mo81065f() == null || !voiceAction.mo81065f().mo81435e()) {
                                    str2 = cardDecision2.f236249c;
                                    if (TextUtils.isEmpty(str2)) {
                                        str2 = ((C73841bf) bVar.f299730d.mo27525b()).mo65322a().getString(R.string.immersive_actions_confirmation_card_default);
                                    }
                                } else {
                                    String str4 = cardDecision2.f236249c;
                                    TtsRequest ttsRequest = cardDecision2.f236250d;
                                    if (TextUtils.isEmpty(str4)) {
                                        if (ttsRequest == null || TextUtils.isEmpty(ttsRequest.toString())) {
                                            str4 = ((C73841bf) bVar.f299730d.mo27525b()).mo65322a().getString(R.string.opa_actions_app_not_installed);
                                        } else {
                                            str4 = ttsRequest.toString();
                                        }
                                    }
                                    bVar.mo96246g(str4, true, false, 1, 0);
                                }
                                bVar.mo96242b(str2, view);
                            }
                            bVar.f299732f = voiceAction;
                            bVar.f299736j = query2.f252780s;
                            bVar.mo96243d(cardDecision2.f236251e);
                            if (!cardDecision2.f236267u) {
                                bVar.f299728b.mo95432u(((C108250bu) bVar.f299731e.mo27525b()).mo96700a(C108248bs.FEEDBACK, new Object[0]));
                                bVar.f299737k.mo97173b();
                            }
                            bVar.f299737k.mo97172a(j, bf, "m-action-card-rendered");
                        }
                    } else if (cardDecision2.f236266t.isEmpty()) {
                        String str5 = cardDecision2.f236249c;
                        TtsRequest ttsRequest2 = cardDecision2.f236250d;
                        if (TextUtils.isEmpty(str5) && ttsRequest2 != null) {
                            str5 = ttsRequest2.toString();
                        }
                        String str6 = str5;
                        if (!TextUtils.isEmpty(str6)) {
                            bVar.mo96246g(str6, true, false, 5, 0);
                            if (voiceAction.mo81052B()) {
                                bVar.mo96243d(cardDecision2.f236251e);
                                bVar.f299737k.mo97172a(j, bf, "nm-action-card-rendered");
                            }
                            if (!bVar.f299729c.mo82124e()) {
                                bVar.f299732f = voiceAction;
                            }
                            bVar.f299736j = query2.f252780s;
                        }
                    } else {
                        bVar.f299732f = voiceAction;
                    }
                }
            } else {
                bVar.f299732f = voiceAction;
                C108802ef efVar2 = bVar.f299737k;
                C109040fj fjVar = efVar2.f302543b;
                if (fjVar.f303286at != null) {
                    fjVar.mo97546s();
                    efVar2.f302543b.mo97418F();
                    efVar2.f302543b.mo97544q();
                    C109040fj fjVar2 = efVar2.f302543b;
                    fjVar2.f303286at.mo97782i(2, new C114512x(query2, fjVar2.f303235U));
                    efVar2.mo97173b();
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo17570i(String str, String str2, String str3) {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        C11300h hVar = this.f302540a.f303310bQ;
        if ((hVar == null || !hVar.mo19706J(str, str2, str3)) && !this.f302540a.f303450o.mo95405ap()) {
            C109743nq nqVar = this.f302540a.f303227M;
            if (nqVar != null) {
                VoiceSearchUi voiceSearchUi = nqVar.f305741b;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    voiceSearchUi.f314936a.setVisibility(8);
                }
                voiceSearchUi.f314937b.mo82923b(str, str2);
            }
            C109105b bVar = this.f302540a.f303323bd;
            int i = bVar.f303836m;
            if (!(i == 1 || i == 5)) {
                bVar.f303836m = 4;
                C109100ar arVar = bVar.f303830g;
                if (arVar != null) {
                    arVar.f303748M = true;
                    arVar.f303772e.setVisibility(8);
                    arVar.f303787t.setVisibility(8);
                    arVar.f303773f.setVisibility(8);
                    arVar.f303786s.setVisibility(0);
                    arVar.f303786s.mo82923b(str, str2);
                    bVar.f303830g.mo97593i();
                }
            }
            if (C87566i.m142268aP(this.f302540a.f303442g)) {
                this.f302540a.f303238X.mo96166ar(str, str2);
            }
            this.f302540a.f303450o.mo95385aA();
            C108451je jeVar = new C108451je();
            jeVar.f301660b = str;
            jeVar.f301661c = str2;
            if (this.f302540a.mo97519bk()) {
                jeVar.f301029k.mo85049c(0, 4);
            }
            this.f302540a.f303450o.mo95430s(jeVar);
            this.f302540a.f303450o.mo95411av();
            this.f302540a.mo97431S(false);
            if ((jeVar.f301662d >= 2 || this.f302540a.f303450o.mo95417f() >= 3) && this.f302540a.f303234T.mo95358d() == 1) {
                this.f302540a.mo97498bH(false, false, false, 2);
            }
        }
    }

    /* renamed from: iK */
    public final void mo17572iK(int i, String str, String str2) {
        C109743nq nqVar = this.f302540a.f303227M;
        if (nqVar != null) {
            nqVar.f305742c.mo76919g(i & -8193);
        }
        this.f302540a.f303238X.mo96148aU(i);
        if ((i & 16) != 0 && this.f302540a.f303450o.mo95405ap()) {
            this.f302540a.f303454s.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        }
    }

    /* renamed from: iL */
    public final void mo17573iL(String str, String str2) {
        Locale locale;
        C60321oe i;
        Intent intent;
        ((C109467mf) this.f302540a.f303313bT.mo27525b()).mo97847b(C89849ae.OPA_INPUT_PLATE_VOICE_QUERY_COMMITTED);
        C58976aa aaVar = C58975e.f156826a;
        C109040fj fjVar = this.f302540a;
        C107621a aVar = fjVar.f303274ah;
        Bundle bundle = fjVar.f303442g;
        if (bundle != null && aVar.mo96077d(bundle)) {
            if (C107621a.m178509b(bundle)) {
                intent = new Intent();
                ArrayList c = C58597ky.m90212c(str);
                ArrayList c2 = C58597ky.m90212c(str2);
                intent.putStringArrayListExtra("android.speech.extra.RESULTS", c);
                intent.putExtra("android.speech.extra.CONFIDENCE_SCORES", new float[]{1.0f});
                intent.putStringArrayListExtra("android.speech.extra.LANGUAGE", c2);
            } else if (C107621a.m178510c(bundle)) {
                intent = new Intent("android.intent.action.WEB_SEARCH");
                intent.setPackage("com.google.android.googlequicksearchbox");
                intent.putExtra("query", str);
                intent.setFlags(268435456);
            } else {
                intent = null;
            }
            if (intent != null) {
                if (C107621a.m178509b(bundle)) {
                    ((C89859i) aVar.f299392d.mo27525b()).mo83702b(C89849ae.OPA_CHROME_VOICE_SEARCH_SUCCESS);
                    aVar.f299393e = -1;
                    aVar.f299389a.setResult(-1, intent);
                    aVar.f299389a.finish();
                    return;
                }
                aVar.f299390b.mo65089a(intent);
                return;
            }
        }
        C11300h hVar = this.f302540a.f303310bQ;
        if ((hVar == null || !hVar.mo19704H(str, str2)) && !this.f302540a.f303450o.mo95405ap()) {
            C109040fj fjVar2 = this.f302540a;
            fjVar2.f303304bK = false;
            fjVar2.mo97460aV();
            C109105b bVar = this.f302540a.f303323bd;
            int i2 = bVar.f303836m;
            if (!(i2 == 1 || i2 == 5)) {
                bVar.f303836m = 4;
                C109100ar arVar = bVar.f303830g;
                if (arVar != null) {
                    if (!arVar.f303761Z) {
                        C113984c cVar = arVar.f303788u;
                        if (arVar.f303791x.mo79746e(C90037cp.f248494bV) && (cVar == C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION || cVar == C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_NEW_USERS || cVar == C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_ACTIVATED_USERS)) {
                            Account a = ((C86054o) arVar.f303742G.mo27525b()).mo79668a();
                            TextView textView = (TextView) arVar.f303752Q.findViewById(R.id.query_suggestion_text);
                            if (C28295m.m52915a(textView) != null && arVar.f303762aa.isPresent()) {
                                if (a != null) {
                                    locale = ((ae) arVar.f303743H.mo27525b()).d(a.name);
                                } else {
                                    locale = Locale.getDefault();
                                }
                                if (b.a(((C48462b) arVar.f303762aa.get()).f125192b, str, locale) == 1.0d && (i = C28285c.m52882i(textView, 18, (Integer) null)) != null) {
                                    C89949q.m146521e(i, false);
                                }
                            }
                            arVar.f303761Z = false;
                        }
                    }
                    arVar.f303772e.setVisibility(8);
                    arVar.f303787t.setVisibility(8);
                    arVar.f303773f.setVisibility(8);
                    arVar.f303786s.mo82924c(str);
                    arVar.mo97594j(C89849ae.OPA_FRE_INPUT_PLATE_VOICE_QUERY_COMMITTED);
                    bVar.f303830g.mo97593i();
                }
            }
            if (C87566i.m142268aP(this.f302540a.f303442g)) {
                if (C109040fj.m181378bx(this.f302540a.f303450o) && this.f302540a.mo97521bm()) {
                    ((C113989h) ((C113988g) this.f302540a.f303450o).mo100833bf().mo56107c()).mo100864bq();
                }
                this.f302540a.f303238X.mo96123V(str);
            }
            if (this.f302540a.f303262aV.mo95240v()) {
                this.f302540a.f303383co = str;
            } else {
                this.f302540a.f303383co = BuildConfig.FLAVOR;
            }
            this.f302540a.mo97543p(str, true, false);
            this.f302540a.f303218D.mo96344a(2);
            this.f302540a.mo97487aw();
            this.f302540a.mo97444aF(str);
        }
    }

    /* renamed from: j */
    public final void mo17574j(int i) {
        this.f302540a.mo97513be(i);
    }
}
