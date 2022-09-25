package com.google.android.apps.search.podcasts.language;

import android.app.Dialog;
import android.view.View;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.j */
/* compiled from: PG */
final class C140545j implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ C140539e f381715a;

    public C140545j(C140539e eVar) {
        this.f381715a = eVar;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        View findViewById;
        C69664n.m101061g(view, "view");
        int i = cpVar.f5994b.mo5216a(7).f5824e;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        Dialog dialog = this.f381715a.f381700b.getDialog();
        if (!(dialog == null || (findViewById = dialog.findViewById(R.id.podcasts_language_dialog_save_button_container)) == null)) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i);
        }
        return cpVar;
    }
}
