package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.text.Html;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.hr */
/* compiled from: PG */
public final class C96276hr extends C96098bb {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "HerbieConnectionQuestion";
    }

    /* renamed from: g */
    public final void mo89941g(OpaPageLayout opaPageLayout) {
        String str;
        super.mo89941g(opaPageLayout);
        Button button = this.f269033g;
        button.getClass();
        button.setText(R.string.use_aux);
        Button button2 = this.f269034h;
        button2.getClass();
        button2.setText(R.string.try_bluetooth);
        Button button3 = this.f269034h;
        button3.getClass();
        button3.setOnClickListener(new C89943l(new C96274hp(this)));
        Button button4 = this.f269033g;
        button4.getClass();
        button4.setOnClickListener(new C89943l(new C96275hq(this)));
        C96095az azVar = this.f269050l;
        if (azVar != null && (str = azVar.f269044e) != null) {
            mo89943i(Html.fromHtml(str), true);
        }
    }
}
