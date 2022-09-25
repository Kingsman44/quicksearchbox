package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.shared.p7148ui.C90657bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.er */
/* compiled from: PG */
final class C93648er extends C90657bb {

    /* renamed from: a */
    public boolean f261414a = true;

    /* renamed from: b */
    final /* synthetic */ ValyrianToggleSettingsArgumentView f261415b;

    public C93648er(ValyrianToggleSettingsArgumentView valyrianToggleSettingsArgumentView) {
        this.f261415b = valyrianToggleSettingsArgumentView;
    }

    /* renamed from: a */
    public final void mo84949a(CompoundButton compoundButton, boolean z) {
        ValyrianToggleSettingsArgumentView valyrianToggleSettingsArgumentView = this.f261415b;
        C93595cs csVar = valyrianToggleSettingsArgumentView.f261444j;
        if (csVar != null) {
            ((DeviceSettingsArgument) valyrianToggleSettingsArgumentView.f261447m).f236155i = z;
            csVar.mo88007d();
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f261414a) {
            super.onCheckedChanged(compoundButton, z);
        }
    }
}
