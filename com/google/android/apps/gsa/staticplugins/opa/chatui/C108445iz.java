package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7148ui.C90657bb;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4552o.C60321oe;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.iz */
/* compiled from: PG */
public final class C108445iz extends C90657bb {

    /* renamed from: a */
    public Optional f301638a = Optional.empty();

    /* renamed from: b */
    final /* synthetic */ ToggleSettingCard f301639b;

    public C108445iz(ToggleSettingCard toggleSettingCard) {
        this.f301639b = toggleSettingCard;
    }

    /* renamed from: a */
    public final void mo84949a(CompoundButton compoundButton, boolean z) {
        C60321oe j;
        this.f301639b.f301432i.mo83087h(true != z ? "0" : "1");
        if (this.f301638a.isPresent()) {
            ((CompoundButton.OnCheckedChangeListener) this.f301638a.get()).onCheckedChanged(compoundButton, z);
        }
        C28292j a = C28295m.m52915a(this.f301639b.f300945o);
        if (a != null && (j = C28285c.m52883j(a, 4, (Integer) null)) != null) {
            C89949q.m146521e(j, false);
        }
    }
}
