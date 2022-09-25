package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.g */
/* compiled from: PG */
public final /* synthetic */ class C108978g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108988i f303025a;

    public /* synthetic */ C108978g(C108988i iVar) {
        this.f303025a = iVar;
    }

    public final void onClick(View view) {
        C108988i iVar = this.f303025a;
        iVar.f303068e.mo97262a(((C73841bf) iVar.f303069f.mo27525b()).mo65322a().getString(R.string.opa_launcher_icon_text));
        iVar.f303065b = true;
        if (iVar.f303066c.mo79746e(C90037cp.f248610f)) {
            C108899db dbVar = iVar.f303068e;
            C90875ai.m148465b(new C108896cz(dbVar), dbVar.f302772d.mo101393c("opa_launcher_icon_added", true), dbVar.f302773e, "updateFuture").mo85223a(C108898da.f302768a);
        }
        if (iVar.f303066c.mo79746e(C90037cp.f248583da)) {
            iVar.mo97348e();
        }
        iVar.mo77318iT().mo77312a();
    }
}
