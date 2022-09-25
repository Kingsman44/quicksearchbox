package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7066m.C90088em;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.logging.p2185ve.C28310af;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.i */
/* compiled from: PG */
public final class C10072i extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C68214a f34330h;

    /* renamed from: i */
    public C68214a f34331i;

    /* renamed from: j */
    public C86124t f34332j;

    /* renamed from: k */
    public C28310af f34333k;

    /* renamed from: b */
    private final int m24888b() {
        return this.f34332j.mo79746e(C90059dk.f249127bk) ? 64474 : 64473;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f34332j.mo79746e(C90088em.f250535b)) {
            this.f34333k.mo33806b(onCreateView, m24888b()).mo33808a();
        } else {
            C28295m.m52919e(onCreateView, new C28292j(m24888b()));
            C89949q.m146521e(C28285c.m52874a(onCreateView, 61687), false);
        }
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        if (this.f34332j.mo79746e(C90059dk.f249127bk)) {
            return (C9504g) this.f34331i.mo27525b();
        }
        return (C9504g) this.f34330h.mo27525b();
    }
}
