package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import android.view.View;
import android.view.ViewGroup;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129297a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129300d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129302f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129304h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129308l;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.r */
/* compiled from: PG */
public final /* synthetic */ class C129329r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C129331t f355197a;

    /* renamed from: b */
    public final /* synthetic */ C129308l f355198b;

    /* renamed from: c */
    public final /* synthetic */ C129304h f355199c;

    public /* synthetic */ C129329r(C129331t tVar, C129308l lVar, C129304h hVar) {
        this.f355197a = tVar;
        this.f355198b = lVar;
        this.f355199c = hVar;
    }

    public final void onClick(View view) {
        C129300d dVar;
        C129331t tVar = this.f355197a;
        C129308l lVar = this.f355198b;
        C129304h hVar = this.f355199c;
        tVar.f355215n.mo108811c(view);
        SuggestionViewModel suggestionViewModel = tVar.f355217p;
        suggestionViewModel.getClass();
        suggestionViewModel.f355121a = lVar.f355153b;
        ViewGroup a = C129331t.m211143a(tVar.f355206e);
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= a.getChildCount()) {
                break;
            }
            View childAt = a.getChildAt(i);
            if (view != childAt) {
                z = false;
            }
            childAt.setEnabled(z);
            childAt.setClickable(false);
            i++;
        }
        C129302f fVar = hVar.f355143b;
        if (fVar == null) {
            fVar = C129302f.f355133f;
        }
        int a2 = C129297a.m211112a(fVar.f355135a);
        int i2 = a2 - 1;
        if (a2 == 0) {
            throw null;
        } else if (i2 == 0) {
            C46439e eVar = tVar.f355210i;
            C127118j jVar = tVar.f355212k;
            C127454b bVar = C127454b.SUGGESTION_CHIP;
            amm amm = (amm) C51682amp.f135384d.createBuilder();
            C129302f fVar2 = hVar.f355143b;
            if (fVar2 == null) {
                fVar2 = C129302f.f355133f;
            }
            String str = fVar2.f355135a == 2 ? (String) fVar2.f355136b : BuildConfig.FLAVOR;
            amm.copyOnWrite();
            C51682amp amp = (C51682amp) amm.instance;
            str.getClass();
            amp.f135386a = 1 | amp.f135386a;
            amp.f135387b = str;
            amo amo = amo.TRUSTED;
            amm.copyOnWrite();
            C51682amp amp2 = (C51682amp) amm.instance;
            amp2.f135388c = amo.f135383d;
            amp2.f135386a = 2 | amp2.f135386a;
            eVar.mo50428h(C46438d.m82810b(jVar.mo107931g(C127407d.m208363c(bVar, (C51682amp) amm.build()))).f121541a, (Object) null, tVar.f355216o);
        } else if (i2 == 1) {
            C46439e eVar2 = tVar.f355210i;
            C129302f fVar3 = hVar.f355143b;
            if (fVar3 == null) {
                fVar3 = C129302f.f355133f;
            }
            if (fVar3.f355135a == 3) {
                dVar = (C129300d) fVar3.f355136b;
            } else {
                dVar = C129300d.f355128d;
            }
            eVar2.mo50428h(C46438d.m82810b(C129337y.m211156b(dVar, tVar.f355213l)).f121541a, (Object) null, tVar.f355216o);
        } else if (i2 == 2) {
            ((C59052c) ((C59052c) C129331t.f355202a.mo56226d()).mo56372aa(38265)).mo56386p("Suggestion does not have an action set.");
        }
    }
}
