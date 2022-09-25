package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.gsa.staticplugins.opa.tapas.C113516u;
import com.google.android.apps.gsa.staticplugins.opa.tapas.C113584v;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8532b.C111790b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.hh */
/* compiled from: PG */
public final class C112917hh implements C113342cm {

    /* renamed from: a */
    public final C111790b f312951a;

    /* renamed from: b */
    public final C112794ct f312952b;

    public C112917hh(C111790b bVar, C112794ct ctVar) {
        this.f312951a = bVar;
        this.f312952b = ctVar;
    }

    /* renamed from: j */
    public static int m186846j(EditText editText) {
        String obj = editText.getText().toString();
        if (obj.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(obj);
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.create_timer_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 97542;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112916hg(view);
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
    }

    /* renamed from: g */
    public final /* synthetic */ void mo99717g(C113415ez ezVar, View view) {
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112916hg hgVar = (C112916hg) ghVar;
        if (ezVar.mo100194G().isPresent() && ((C113584v) ezVar.mo100194G().get()).f314501a != null) {
            C113516u uVar = ((C113584v) ezVar.mo100194G().get()).f314501a;
            if (uVar == null) {
                uVar = C113516u.f314280b;
            }
            long j = uVar.f314282a / 1000;
            hgVar.f312947a.setText(String.valueOf(j / 3600));
            hgVar.f312948b.setText(String.valueOf((j / 60) % 60));
            hgVar.f312949c.setText(String.valueOf(j % 60));
        }
        hgVar.f312950d.setOnClickListener(new C112915hf(this, ezVar, esVar, hgVar));
    }

    /* renamed from: i */
    public final boolean mo99718i() {
        return true;
    }
}
