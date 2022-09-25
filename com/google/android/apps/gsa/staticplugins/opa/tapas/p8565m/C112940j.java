package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p033v7.widget.C0673gh;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.p5826p.C73897c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110964ab;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4553a.C59545do;
import com.google.common.p4552o.p4553a.C59546dp;
import dagger.C68214a;
import java.util.Arrays;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.j */
/* compiled from: PG */
public final class C112940j implements C113342cm {

    /* renamed from: b */
    private static final C59071e f312986b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.j");

    /* renamed from: a */
    public final C113367dh f312987a;

    /* renamed from: c */
    private final C110964ab f312988c;

    /* renamed from: d */
    private final C73897c f312989d;

    /* renamed from: e */
    private final C112794ct f312990e;

    /* renamed from: f */
    private final C68214a f312991f;

    public C112940j(C110964ab abVar, C73897c cVar, C112794ct ctVar, C113367dh dhVar, C68214a aVar) {
        this.f312988c = abVar;
        this.f312989d = cVar;
        this.f312990e = ctVar;
        this.f312987a = dhVar;
        this.f312991f = aVar;
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.app_action_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return C48672ag.APP_ACTIONS_SHORTCUT.equals(ezVar.mo100211k()) ? 125143 : 88405;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112936i(view);
    }

    /* renamed from: d */
    public final Optional mo99715d(C113415ez ezVar) {
        Optional r = ezVar.mo100218r();
        C59545do doVar = (C59545do) C59546dp.f158007d.createBuilder();
        if (!r.isPresent()) {
            return Optional.empty();
        }
        Optional j = ((C113502n) r.get()).mo100047j();
        Objects.requireNonNull(doVar);
        j.ifPresent(new C112855f(doVar));
        Optional f = ((C113502n) r.get()).mo100042f();
        Objects.requireNonNull(doVar);
        f.ifPresent(new C112882g(doVar));
        return Optional.m71637of((C59546dp) doVar.build());
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        this.f312990e.mo99739a(4, ezVar, esVar, Optional.m71637of(Arrays.asList(new Integer[]{74338})));
        Optional r = ezVar.mo100218r();
        if (r.isPresent()) {
            C113502n nVar = (C113502n) r.get();
            C58495hd c = nVar.mo100038c();
            if (c.isEmpty()) {
                this.f312988c.mo98994a(nVar, C58729pv.f156485a);
            } else {
                this.f312988c.mo98994a(nVar, c);
            }
        } else {
            ((C59052c) ((C59052c) f312986b.mo56226d()).mo56372aa(27760)).mo56386p("#handleOnClick: OnClick was called without AppActionSuggestionParams.");
        }
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        ((C112880fy) this.f312991f.mo27525b()).mo99774b(ezVar, view);
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112936i iVar = (C112936i) ghVar;
        Optional r = ezVar.mo100218r();
        if (r.isPresent()) {
            C113502n nVar = (C113502n) r.get();
            nVar.mo100039d().ifPresent(new C112909h(this, iVar));
            C58495hd c = nVar.mo100038c();
            if (c.isEmpty()) {
                iVar.f312980b.setText(new SpannableStringBuilder().append(ezVar.mo100199L(), new ForegroundColorSpan(this.f312989d.mo65405a() == 1 ? -1 : -16777216), 33));
                return;
            }
            String L = ezVar.mo100199L();
            iVar.f312981c.setVisibility(0);
            iVar.f312980b.setVisibility(8);
            iVar.f312982d.setText(L);
            for (Map.Entry value : c.entrySet()) {
                iVar.f312983e.setText((CharSequence) value.getValue());
            }
        }
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}
