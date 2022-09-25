package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.shared.p7148ui.C90657bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dz */
/* compiled from: PG */
final class C93629dz extends C90657bb {

    /* renamed from: a */
    public boolean f261378a = true;

    /* renamed from: b */
    final /* synthetic */ ToggleSettingsArgumentView f261379b;

    public C93629dz(ToggleSettingsArgumentView toggleSettingsArgumentView) {
        this.f261379b = toggleSettingsArgumentView;
    }

    /* renamed from: a */
    public final void mo84949a(CompoundButton compoundButton, boolean z) {
        ToggleSettingsArgumentView toggleSettingsArgumentView = this.f261379b;
        C93595cs csVar = toggleSettingsArgumentView.f261444j;
        if (csVar != null) {
            ((DeviceSettingsArgument) toggleSettingsArgumentView.f261447m).f236155i = z;
            csVar.mo88007d();
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f261378a) {
            super.onCheckedChanged(compoundButton, z);
        }
    }
}
