package com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridLayout;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26217r;
import com.google.android.libraries.lens.view.p2067ak.C25224bc;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59888ax;
import com.google.common.p4552o.p4563i.C59890az;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Locale;

/* compiled from: PG */
public final class OnboardingLanguageMenuFragmentPeer {

    /* renamed from: a */
    static final String[] f71204a = {"hi", "en", "bn", "te", "mr", "ta", "kn", "ml", "gu", "ur"};

    /* renamed from: b */
    static final C26206a[] f71205b = C26206a.values();

    /* renamed from: c */
    public LiveData f71206c;

    /* renamed from: d */
    public boolean f71207d;

    /* renamed from: e */
    public final C26208c f71208e;

    /* renamed from: f */
    public final C26059ax f71209f;

    /* renamed from: g */
    public final C28310af f71210g;

    /* renamed from: h */
    public final C28306ab f71211h;

    /* renamed from: i */
    public final C37215b f71212i;

    /* renamed from: j */
    public final OnboardingLanguageMenuLifecycleObserver f71213j = new OnboardingLanguageMenuLifecycleObserver();

    /* renamed from: k */
    private final C26217r f71214k;

    /* renamed from: l */
    private final C47770dh f71215l;

    /* compiled from: PG */
    final class OnboardingLanguageMenuLifecycleObserver implements C2376g {
        public OnboardingLanguageMenuLifecycleObserver() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            OnboardingLanguageMenuFragmentPeer.this.f71212i.mo19974a(C37194a.f98625dz);
            OnboardingLanguageMenuFragmentPeer.this.f71207d = false;
        }

        /* renamed from: ha */
        public final void mo3525ha(C2391v vVar) {
            if (!OnboardingLanguageMenuFragmentPeer.this.f71207d) {
                C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
                C59888ax axVar = (C59888ax) C59890az.f161838e.createBuilder();
                int i = OnboardingLanguageMenuFragmentPeer.this.f71209f.f70800N;
                axVar.copyOnWrite();
                C59890az azVar = (C59890az) axVar.instance;
                azVar.f161840a |= 1;
                azVar.f161841b = i;
                afVar.copyOnWrite();
                C59898bg bgVar = (C59898bg) afVar.instance;
                C59890az azVar2 = (C59890az) axVar.build();
                azVar2.getClass();
                bgVar.f161889u = azVar2;
                bgVar.f161869a |= 524288;
                C37215b bVar = OnboardingLanguageMenuFragmentPeer.this.f71212i;
                C37252a i2 = C37194a.f98597dA.mo40815i(C62722b.CANCELLED);
                ((C37253b) i2).mo40792p(C59898bg.f161867w, (C59898bg) afVar.build());
                bVar.mo19974a(i2);
            }
        }
    }

    /* renamed from: com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu.OnboardingLanguageMenuFragmentPeer$a */
    /* compiled from: PG */
    public final class C26203a implements C47388b {
    }

    /* renamed from: com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu.OnboardingLanguageMenuFragmentPeer$b */
    /* compiled from: PG */
    public final class C26204b implements C47388b {
    }

    /* renamed from: com.google.android.libraries.lens.view.filters.translation.onboardinglanguagemenu.OnboardingLanguageMenuFragmentPeer$c */
    /* compiled from: PG */
    public final class C26205c implements C47388b {
    }

    public OnboardingLanguageMenuFragmentPeer(C26208c cVar, C26217r rVar, C26059ax axVar, C47770dh dhVar, C28310af afVar, C28306ab abVar, C37215b bVar) {
        this.f71208e = cVar;
        this.f71214k = rVar;
        this.f71209f = axVar;
        this.f71215l = dhVar;
        this.f71210g = afVar;
        this.f71211h = abVar;
        this.f71212i = bVar;
    }

    /* renamed from: a */
    public static C26208c m48379a(AccountId accountId) {
        C26208c cVar = new C26208c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        return cVar;
    }

    /* renamed from: b */
    public final void mo31423b(View view, LayoutInflater layoutInflater) {
        String str;
        int i = this.f71208e.getResources().getConfiguration().orientation;
        GridLayout gridLayout = (GridLayout) view.findViewById(R.id.onboarding_language_menu_table);
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.onboarding_language_menu_all_languages_button);
        gridLayout.setColumnCount(i == 1 ? 2 : 4);
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            MaterialButton materialButton2 = (MaterialButton) layoutInflater.inflate(R.layout.lens_translate_filter_onboarding_language_menu_button, gridLayout, false);
            Locale forLanguageTag = Locale.forLanguageTag(f71204a[i3]);
            if (forLanguageTag.equals(Locale.ENGLISH)) {
                str = this.f71214k.mo31434d(forLanguageTag);
            } else {
                str = String.format("%s\n%s", new Object[]{this.f71214k.mo31433c(forLanguageTag), this.f71214k.mo31434d(forLanguageTag)});
            }
            materialButton2.setText(str);
            C26206a[] aVarArr = f71205b;
            C26206a aVar = aVarArr[i3];
            Context context = this.f71208e.getContext();
            materialButton2.mo47556m(new ColorStateList(C26206a.f71227k, new int[]{context.getColor(aVar.f71229l), context.getColor(aVar.f71230m)}));
            C26206a aVar2 = aVarArr[i3];
            Context context2 = this.f71208e.getContext();
            materialButton2.setTextColor(new ColorStateList(C26206a.f71227k, new int[]{context2.getColor(aVar2.f71231n), context2.getColor(aVar2.f71232o)}));
            materialButton2.setOnClickListener(new C47591co(this.f71215l, "Click target", new C26211f(this, forLanguageTag)));
            gridLayout.addView(materialButton2);
            GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) materialButton2.getLayoutParams();
            layoutParams.getClass();
            layoutParams.rowSpec = GridLayout.spec(LinearLayoutManager.INVALID_OFFSET, 1.0f);
        }
        if (i != 1) {
            MaterialButton materialButton3 = (MaterialButton) layoutInflater.inflate(R.layout.lens_translate_filter_onboarding_language_menu_all_languages_button, gridLayout, false);
            materialButton3.setOnClickListener(C26209d.f71238a);
            gridLayout.addView(materialButton3);
        }
        if (i != 1) {
            i2 = 8;
        }
        materialButton.setVisibility(i2);
    }

    /* renamed from: c */
    public final void mo31424c(Locale locale, int i) {
        C59888ax axVar = (C59888ax) C59890az.f161838e.createBuilder();
        String languageTag = locale.toLanguageTag();
        axVar.copyOnWrite();
        C59890az azVar = (C59890az) axVar.instance;
        languageTag.getClass();
        azVar.f161840a |= 2;
        azVar.f161842c = languageTag;
        axVar.copyOnWrite();
        C59890az azVar2 = (C59890az) axVar.instance;
        azVar2.f161843d = i - 1;
        azVar2.f161840a |= 4;
        int i2 = this.f71209f.f70800N;
        axVar.copyOnWrite();
        C59890az azVar3 = (C59890az) axVar.instance;
        azVar3.f161840a |= 1;
        azVar3.f161841b = i2;
        C59890az azVar4 = (C59890az) axVar.build();
        C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
        afVar.copyOnWrite();
        C59898bg bgVar = (C59898bg) afVar.instance;
        azVar4.getClass();
        bgVar.f161889u = azVar4;
        bgVar.f161869a |= 524288;
        C37215b bVar = this.f71212i;
        C37252a i3 = C37194a.f98597dA.mo40815i(C62722b.OK);
        ((C37253b) i3).mo40792p(C59898bg.f161867w, (C59898bg) afVar.build());
        bVar.mo19974a(i3);
        C26059ax axVar2 = this.f71209f;
        axVar2.f70816f.f68662a.mo30363c(new C25224bc());
        axVar2.f70794H = true;
        this.f71207d = true;
        this.f71208e.dismiss();
    }
}
