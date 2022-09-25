package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceCategory;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7184t.C91098h;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.HotwordSettingsFragmentBase;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92598e;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92599f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

@ProguardMustNotDelete
/* compiled from: PG */
public class HotwordSettingsFragment extends HotwordSettingsFragmentBase {

    /* renamed from: a */
    public C92598e f258325a;

    /* renamed from: b */
    public C92620o f258326b;

    /* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.HotwordSettingsFragment$a */
    /* compiled from: PG */
    public interface C92568a {
        /* renamed from: qs */
        void mo87352qs(HotwordSettingsFragment hotwordSettingsFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return R.xml.hotword_settings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo87381f()) {
            return null;
        }
        C92620o oVar = this.f258326b;
        C92597d dVar = this.f258442g;
        C92597d dVar2 = dVar;
        C92602a aVar = this.f258439d;
        C92602a aVar2 = aVar;
        C91097g gVar = this.f258441f;
        C91097g gVar2 = gVar;
        Context context = getContext();
        dVar.getClass();
        aVar.getClass();
        gVar.getClass();
        context.getClass();
        C90021c cVar = (C90021c) oVar.f258503a.mo17428b();
        C90021c cVar2 = cVar;
        cVar.getClass();
        C89994f fVar = (C89994f) oVar.f258504b.mo17428b();
        C89994f fVar2 = fVar;
        fVar.getClass();
        C92599f fVar3 = (C92599f) oVar.f258505c.mo17428b();
        C92599f fVar4 = fVar3;
        fVar3.getClass();
        C92486a aVar3 = (C92486a) oVar.f258506d.mo17428b();
        C92486a aVar4 = aVar3;
        aVar3.getClass();
        C68214a a = C68219e.m98518a(((C68226l) oVar.f258507e).f184585a);
        C68214a aVar5 = a;
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) oVar.f258508f).f184585a);
        C68214a aVar6 = a2;
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) oVar.f258509g).f184585a);
        C68214a aVar7 = a3;
        a3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) oVar.f258510h).f184585a);
        C68214a aVar8 = a4;
        a4.getClass();
        C68214a a5 = C68219e.m98518a(((C68226l) oVar.f258511i).f184585a);
        C68214a aVar9 = a5;
        a5.getClass();
        C68214a a6 = C68219e.m98518a(((C68226l) oVar.f258512j).f184585a);
        C68214a aVar10 = a6;
        a6.getClass();
        C68214a a7 = C68219e.m98518a(((C68226l) oVar.f258513k).f184585a);
        C68214a aVar11 = a7;
        a7.getClass();
        C68214a a8 = C68219e.m98518a(((C68226l) oVar.f258514l).f184585a);
        C68214a aVar12 = a8;
        a8.getClass();
        C68214a a9 = C68219e.m98518a(((C68226l) oVar.f258515m).f184585a);
        C68214a aVar13 = a9;
        a9.getClass();
        C68214a a10 = C68219e.m98518a(((C68226l) oVar.f258516n).f184585a);
        a10.getClass();
        return new C92619n(dVar2, aVar2, gVar2, cVar2, fVar2, fVar4, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, a10);
    }

    public final void onCreate(Bundle bundle) {
        ((HotwordSettingsFragmentBase.C92601a) C47266f.m84076a(getActivity(), HotwordSettingsFragmentBase.C92601a.class)).mo87382qt(this);
        Activity activity = getActivity();
        this.f258441f = null;
        if (activity instanceof C91098h) {
            this.f258441f = ((C91098h) activity).mo17775x();
        }
        ((C92568a) C47266f.m84076a(getActivity(), C92568a.class)).mo87352qs(this);
        C9439b bVar = C9439b.VOICE_SETTINGS;
        Intent intent = getActivity().getIntent();
        if (intent != null) {
            bVar = C9439b.m23955a(intent.getIntExtra("enrollment_entry_id", 0));
        }
        C91097g gVar = this.f258441f;
        if (gVar != null) {
            this.f258442g = this.f258325a.mo87377a(gVar, bVar);
        }
        super.onCreate(bundle);
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("pref_category_voice_model");
        C92597d dVar = this.f258442g;
        if (dVar != null && preferenceCategory != null) {
            preferenceCategory.setTitle(dVar.f258409b.getString(R.string.hotword_enrollment_pref_category_voice_model, new Object[]{dVar.mo87370d()}));
        }
    }
}
