package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import android.content.res.ColorStateList;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129304h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129306j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129308l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129310n;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129312p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.chip.Chip;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.assistant.p3897e.p3921j.p3926e.C51991gq;
import com.google.common.base.C58852bp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.m */
/* compiled from: PG */
public final /* synthetic */ class C129324m implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C129331t f355192a;

    public /* synthetic */ C129324m(C129331t tVar) {
        this.f355192a = tVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        boolean z;
        boolean z2;
        C129331t tVar = this.f355192a;
        C58485gu j = C58485gu.m89842j(((C129310n) obj).f355160a);
        C58485gu c = tVar.mo108970c();
        SuggestionViewModel suggestionViewModel = tVar.f355217p;
        suggestionViewModel.getClass();
        suggestionViewModel.f355122b = j;
        ViewGroup a = C129331t.m211143a(tVar.f355206e);
        SuggestionViewModel suggestionViewModel2 = tVar.f355217p;
        suggestionViewModel2.getClass();
        String str = suggestionViewModel2.f355121a;
        boolean z3 = false;
        boolean z4 = true;
        boolean z5 = TextUtils.isEmpty(str) || Collection.EL.stream(j).noneMatch(new C129326o(str));
        a.removeAllViews();
        int size = j.size();
        int i = 0;
        while (i < size) {
            C129304h hVar = (C129304h) j.get(i);
            Chip chip = (Chip) tVar.f355205d.inflate(R.layout.assistant_suggestion_chip, a, z3);
            C129312p pVar = hVar.f355144c;
            if (pVar == null) {
                pVar = C129312p.f355162d;
            }
            C129024a aVar = tVar.f355215n;
            int i2 = pVar.f355164a;
            if (i2 <= 0) {
                i2 = 27105;
            }
            aVar.mo108810b(i2, chip);
            C129308l lVar = hVar.f355142a;
            if (lVar == null) {
                lVar = C129308l.f355150g;
            }
            if (!lVar.f355154c.isEmpty()) {
                chip.setText(lVar.f355154c);
            } else {
                chip.mo47664D(0.0f);
                chip.mo47663C(0.0f);
                chip.setContentDescription(lVar.f355155d);
            }
            chip.setFocusable(z4);
            if (lVar.f355156e != null) {
                int dimensionPixelSize = tVar.f355204c.getResources().getDimensionPixelSize(R.dimen.assistant_suggestion_chip_drawable_size);
                C129306j jVar = lVar.f355156e;
                if (jVar == null) {
                    jVar = C129306j.f355146c;
                }
                String str2 = jVar.f355149b;
                if (!str2.isEmpty()) {
                    C6007z zVar = (C6007z) ((C6007z) tVar.f355211j.mo51286a().mo11870h(Uri.parse(str2)).mo11962O(LinearLayoutManager.INVALID_OFFSET, dimensionPixelSize)).mo11955H();
                    zVar.mo12455s(new C129330s(tVar, chip), (C5592i) null, zVar, C5622i.f16959a);
                }
            }
            C129308l lVar2 = hVar.f355142a;
            if (lVar2 == null) {
                lVar2 = C129308l.f355150g;
            }
            C51991gq gqVar = lVar2.f355157f;
            if (gqVar == null) {
                gqVar = C51991gq.f136433k;
            }
            if ((gqVar.f136435a & 1) != 0) {
                chip.setTextColor(gqVar.f136436b);
            }
            if ((gqVar.f136435a & 2) != 0) {
                chip.mo47684o(ColorStateList.valueOf(gqVar.f136437c));
            }
            if ((gqVar.f136435a & 4) != 0) {
                chip.mo47721v(ColorStateList.valueOf(gqVar.f136438d));
            }
            chip.setOnClickListener(new C47591co(tVar.f355214m, "Suggestion chip clicked", new C129329r(tVar, lVar, hVar)));
            chip.setClickable(z5);
            if (!z5) {
                C129308l lVar3 = hVar.f355142a;
                if (lVar3 == null) {
                    lVar3 = C129308l.f355150g;
                }
                if (!str.equals(lVar3.f355153b)) {
                    z2 = false;
                    chip.setEnabled(z2);
                    a.addView(chip);
                    i++;
                    z3 = false;
                    z4 = true;
                }
            }
            z2 = true;
            chip.setEnabled(z2);
            a.addView(chip);
            i++;
            z3 = false;
            z4 = true;
        }
        if (z5) {
            z = false;
            ((ViewGroup) tVar.f355206e.requireView().findViewById(R.id.assistant_suggestion_inner_container)).scrollTo(0, 0);
        } else {
            z = false;
        }
        tVar.f355218q = z;
        tVar.mo108971d(true);
        if (!C58597ky.m90218i(j, c)) {
            Fragment parentFragment = tVar.f355206e.getParentFragment();
            if (parentFragment instanceof C47231d) {
                Object z6 = ((C47231d) parentFragment).mo17754z();
                if (z6 instanceof C129321j) {
                    ((C129321j) z6).mo108967a();
                }
            }
        }
    }
}
