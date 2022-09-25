package com.google.android.apps.gsa.assistant.settings.features.p554ak;

import android.app.Activity;
import android.os.Bundle;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90088em;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.logging.p2185ve.C28310af;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ak.d */
/* compiled from: PG */
public final class C10172d extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C10171c f34579h;

    /* renamed from: i */
    public C28310af f34580i;

    /* renamed from: j */
    public C90021c f34581j;

    /* renamed from: fY */
    public final RecyclerView mo8406fY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView fY = super.mo8406fY(layoutInflater, viewGroup, bundle);
        fY.setClipToPadding(false);
        return fY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return R.xml.assistant_phone_number_settings;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        super.onCreate(bundle);
        getActivity().setTitle(R.string.assistant_settings_personal_info_phone_number_title);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f34581j.mo79746e(C90088em.f250535b)) {
            this.f34580i.mo33806b(onCreateView, 66331).mo33808a();
        } else {
            C28295m.m52919e(onCreateView, new C28292j(66331));
            C89949q.m146521e(C28285c.m52874a(onCreateView, 61687), false);
        }
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        return this.f34579h;
    }
}
