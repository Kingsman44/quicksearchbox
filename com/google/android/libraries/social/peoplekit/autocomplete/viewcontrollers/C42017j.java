package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42064j;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.common.p4522b.C58557jl;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.j */
/* compiled from: PG */
final class C42017j implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C42075e f109713a;

    /* renamed from: b */
    final /* synthetic */ C42023p f109714b;

    /* renamed from: c */
    private String f109715c;

    public C42017j(C42023p pVar, C42075e eVar) {
        this.f109714b = pVar;
        this.f109713a = eVar;
    }

    public final void afterTextChanged(Editable editable) {
        if (C42131a.m73921d() && !TextUtils.isEmpty(editable) && !this.f109714b.f109743t.isEmpty()) {
            ((C42064j) C58557jl.m90131l(this.f109714b.f109743t)).mo44553b(false);
        }
        this.f109714b.mo44496n();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f109715c = charSequence.toString();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        if (!((Boolean) C42131a.f110205c.mo37303b()).booleanValue() || (str = this.f109715c) == null || !str.contentEquals(charSequence)) {
            if ((i3 > i2 && (charSequence.charAt(i) == ',' || charSequence.charAt(i) == ':' || charSequence.charAt(i) == ';')) || (i3 - i2 > 1 && (C42023p.m73543r(charSequence, ',', i, i3) || C42023p.m73543r(charSequence, ':', i, i3) || C42023p.m73543r(charSequence, ';', i, i3)))) {
                this.f109714b.f109728e.post(new C42016i(this));
            }
            if (this.f109714b.f109728e.hasFocus()) {
                C42023p pVar = this.f109714b;
                pVar.f109731h.mo44462c(charSequence, pVar.f109728e);
            }
            if (TextUtils.isEmpty(charSequence)) {
                this.f109714b.mo44492j(8);
            }
            if (this.f109714b.f109743t.isEmpty() && i == 0 && i2 == 0) {
                i2 = 0;
                if (i3 > 0) {
                    this.f109713a.mo44577c(16, this.f109714b.f109736m);
                }
            }
            if (this.f109714b.f109738o && i2 > i3) {
                C42075e eVar = this.f109713a;
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144440C));
                peopleKitVisualElementPath.mo44564a(this.f109714b.f109736m.f109973a);
                eVar.mo44577c(16, peopleKitVisualElementPath);
            }
            Stopwatch a = this.f109713a.mo44575a("TimeToAutocompleteSelection");
            if (!a.f109976c && charSequence.length() > 0) {
                a.mo44570b();
                a.mo44571c();
            }
            this.f109714b.f109738o = true;
        }
    }
}
