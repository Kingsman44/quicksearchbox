package com.google.android.apps.gsa.speech.settingsui.hotword.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p033v7.app.C0395p;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6775c.C85677a;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92596c;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

@ProguardMustNotDelete
/* compiled from: PG */
public abstract class HotwordSettingsFragmentBase extends SettingsFragmentBase {

    /* renamed from: c */
    public C86054o f258438c;

    /* renamed from: d */
    public C92602a f258439d;

    /* renamed from: e */
    public C90465g f258440e;

    /* renamed from: f */
    protected C91097g f258441f;

    /* renamed from: g */
    protected C92597d f258442g;

    /* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.base.HotwordSettingsFragmentBase$a */
    /* compiled from: PG */
    public interface C92601a {
        /* renamed from: qt */
        void mo87382qt(HotwordSettingsFragmentBase hotwordSettingsFragmentBase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo87381f() {
        if (getActivity() != null) {
            return true;
        }
        C58976aa aaVar = C58975e.f156826a;
        return false;
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("keep_options_menu")) {
            Activity activity = getActivity();
            Menu menu2 = menu;
            this.f258440e.mo84210a(activity).mo84208a(menu2, "now_voice_settings", this.f258438c.mo79668a(), C87562e.m142218a(getActivity(), "now_voice_settings"), false, activity instanceof C0395p);
        }
    }

    public final void onResume() {
        C58976aa aaVar = C58975e.f156826a;
        C92597d dVar = this.f258442g;
        if (dVar != null) {
            C91077d dVar2 = (C91077d) dVar.f258412e.mo27525b();
            if (!dVar2.f254356c.mo85346a("android.permission.RECORD_AUDIO") && dVar2.mo85350f("android.permission.RECORD_AUDIO")) {
                C92597d dVar3 = this.f258442g;
                C92606e eVar = new C92606e(this);
                Intent intent = new Intent();
                intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.PermissionActivity");
                intent.putExtra("requested_permissions", new String[]{"android.permission.RECORD_AUDIO"});
                intent.putExtra("permission_request_source", 3);
                dVar3.f258408a.mo65090b(C85677a.f231630a.mo83277a(intent), new C92596c(eVar));
            }
        }
        super.onResume();
    }
}
