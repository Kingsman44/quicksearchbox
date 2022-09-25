package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.av.au;
import com.google.android.googlequicksearchbox.R;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bg */
/* compiled from: PG */
public final /* synthetic */ class C101670bg implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C101671bh f283690a;

    public /* synthetic */ C101670bg(C101671bh bhVar) {
        this.f283690a = bhVar;
    }

    public final void onClick(View view) {
        C101671bh bhVar = this.f283690a;
        List list = (List) Collection.EL.stream(bhVar.f283693c.j(bhVar.f283692b, 3)).filter(C101666bc.f283686a).collect(Collectors.toList());
        if (list.isEmpty()) {
            bhVar.f283694d.J(bhVar.f283692b, 2, bhVar.mo92479a());
            bhVar.mo92481c();
            return;
        }
        au.a(bhVar.f283691a.getContext(), list, new C101667bd(bhVar), new C101668be(bhVar), R.string.dialog_decline_pr_consent_title, R.string.dialog_decline_pr_consent_content, R.string.dialog_decline_pr_footer, R.string.dialog_turn_off);
    }
}
