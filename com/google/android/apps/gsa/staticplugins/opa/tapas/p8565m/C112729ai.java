package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import java.util.Arrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ai */
/* compiled from: PG */
public final class C112729ai implements C113342cm {

    /* renamed from: a */
    public final C112913hd f312497a;

    /* renamed from: b */
    private final C112880fy f312498b;

    public C112729ai(C112880fy fyVar, C112913hd hdVar) {
        this.f312498b = fyVar;
        this.f312497a = hdVar;
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.calculator_card;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 100342;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112728ah(view, new C112727ag(this));
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        this.f312498b.mo99775c(ezVar.mo100199L(), esVar, ezVar, 18);
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        this.f312498b.mo99774b(ezVar, view);
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112728ah ahVar = (C112728ah) ghVar;
        if (ezVar.mo100219s().isPresent()) {
            this.f312497a.mo99780b("Track calculator card attention", 21, Arrays.asList(new Integer[]{26677}), esVar, ezVar);
            String L = ezVar.mo100199L();
            if (!L.isEmpty() && !L.endsWith("=")) {
                L = String.valueOf(L).concat(String.valueOf(ghVar.itemView.getContext().getResources().getString(R.string.equal_sign_with_spaces)));
            }
            ahVar.f312495b.setText(L);
            ahVar.f312496c.setText((CharSequence) ezVar.mo100219s().get());
            return;
        }
        ahVar.f312494a.setVisibility(8);
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}
