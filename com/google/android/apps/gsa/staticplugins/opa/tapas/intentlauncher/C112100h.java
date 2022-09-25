package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.opa.C83572ac;
import com.google.android.apps.gsa.opa.C83573ad;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.h */
/* compiled from: PG */
final class C112100h implements l {

    /* renamed from: a */
    final /* synthetic */ C112101i f311302a;

    /* renamed from: b */
    private final C91097g f311303b;

    public C112100h(C112101i iVar, C91097g gVar) {
        this.f311302a = iVar;
        this.f311303b = gVar;
    }

    /* renamed from: a */
    public final C83573ad mo99385a() {
        return C83573ad.f227888a;
    }

    /* renamed from: b */
    public final void mo99386b(String str, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        C87565h hVar = new C87565h();
        hVar.f236560f = 1;
        hVar.f236568n = str;
        hVar.f236556b = e.bW;
        Bundle a = hVar.mo81685a();
        this.f311302a.getActivity().finish();
        C112101i iVar = this.f311302a;
        iVar.f311310f.mo81689c(iVar.getContext(), a, 268435456);
    }

    /* renamed from: c */
    public final void mo99387c(String str) {
        EditText editText = this.f311302a.f311311g;
        editText.getClass();
        editText.setText(str);
        EditText editText2 = this.f311302a.f311311g;
        editText2.getClass();
        editText2.setSelection(editText2.getText().length());
    }

    /* renamed from: d */
    public final void mo99388d() {
    }

    /* renamed from: e */
    public final void mo99389e(C83572ac acVar) {
    }

    /* renamed from: f */
    public final void mo99390f() {
    }

    /* renamed from: g */
    public final void mo99391g() {
    }

    /* renamed from: h */
    public final void mo99392h(boolean z) {
    }

    /* renamed from: i */
    public final boolean mo99393i(Intent intent) {
        return this.f311303b.mo65089a(intent);
    }
}
