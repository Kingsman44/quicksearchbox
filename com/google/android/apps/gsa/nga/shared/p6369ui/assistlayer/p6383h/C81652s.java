package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6383h;

import android.text.TextUtils;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80705cg;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.h.s */
/* compiled from: PG */
public final /* synthetic */ class C81652s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81656w f223313a;

    public /* synthetic */ C81652s(C81656w wVar) {
        this.f223313a = wVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81656w wVar = this.f223313a;
        wVar.f223337s.setOnClickListener(new C81634a(wVar));
        String d = ((C80705cg) obj).mo74459d();
        Locale locale = Locale.getDefault();
        if (!TextUtils.isEmpty(d)) {
            locale = Locale.forLanguageTag(d);
        }
        int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(locale);
        ((C59052c) ((C59052c) C81656w.f223319a.mo56224b()).mo56372aa(6188)).mo56395y("Setting layout direction to %s because Assistant locale is %s", layoutDirectionFromLocale, d);
        wVar.f223320b.setLayoutDirection(layoutDirectionFromLocale);
    }
}
