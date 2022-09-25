package com.google.android.apps.gsa.staticplugins.opa;

import android.content.SharedPreferences;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.du */
/* compiled from: PG */
final class C108787du implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C109040fj f302515a;

    public C108787du(C109040fj fjVar) {
        this.f302515a = fjVar;
    }

    public final void onGlobalLayout() {
        int i;
        C109040fj fjVar = this.f302515a;
        if (fjVar.f303226L.getVisibility() == 8) {
            i = 0;
        } else {
            i = this.f302515a.f303226L.getHeight();
        }
        fjVar.mo97473ai(i);
        TextView textView = (TextView) this.f302515a.f303226L.findViewById(R.id.finish_setup_bar_description);
        if (textView != null && this.f302515a.f303329bj.mo96478k()) {
            textView.setText(this.f302515a.f303455t.mo79758x(C90037cp.f248615k));
        }
        if (textView != null && this.f302515a.f303455t.mo79746e(C90037cp.f248583da) && ((long) ((SharedPreferences) this.f302515a.f303251aK.mo27525b()).getInt("opa_add_shortcut_screen_seen_count", 0)) < this.f302515a.f303455t.mo79743a(C90037cp.f248572cu) && !this.f302515a.f303327bh.mo100727a() && !this.f302515a.f303348cB.mo101288a()) {
            textView.setText(((C73841bf) this.f302515a.f303395d.mo27525b()).mo65322a().getString(R.string.opa_finish_setup_bar_description_add_shortcut));
        }
        if (textView != null) {
            C109040fj fjVar2 = this.f302515a;
            if (fjVar2.f303334bo) {
                textView.setText(fjVar2.mo97534f().getString(R.string.opa_persistent_finish_setup_bar_description_aol));
            }
        }
        if (textView != null) {
            C109040fj fjVar3 = this.f302515a;
            if (fjVar3.f303335bp) {
                textView.setText(fjVar3.mo97534f().getString(R.string.opa_persistent_finish_setup_bar_description_tmf));
            }
        }
        this.f302515a.f303226L.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
