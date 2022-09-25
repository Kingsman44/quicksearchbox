package com.google.android.apps.search.pronunciationlearning.p10638ui.practicing;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.libraries.search.p2871b.p2872a.p2882j.C37200a;
import com.google.common.p4552o.apx;
import com.google.common.p4552o.aqb;
import com.google.common.p4552o.aqf;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.practicing.d */
/* compiled from: PG */
final class C141500d extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ CharSequence f384092a;

    /* renamed from: b */
    final /* synthetic */ String f384093b;

    /* renamed from: c */
    final /* synthetic */ CharSequence f384094c;

    /* renamed from: d */
    final /* synthetic */ int f384095d;

    /* renamed from: e */
    final /* synthetic */ int f384096e;

    /* renamed from: f */
    final /* synthetic */ C141501e f384097f;

    public C141500d(C141501e eVar, CharSequence charSequence, String str, CharSequence charSequence2, int i, int i2) {
        this.f384097f = eVar;
        this.f384092a = charSequence;
        this.f384093b = str;
        this.f384094c = charSequence2;
        this.f384095d = i;
        this.f384096e = i2;
    }

    public final void onClick(View view) {
        PhonemeView phonemeView = this.f384097f.f384099b;
        phonemeView.getClass();
        phonemeView.mo17754z().mo116518b(this.f384092a, this.f384093b);
        PhonemeView phonemeView2 = this.f384097f.f384100c;
        phonemeView2.getClass();
        C141497a a = phonemeView2.mo17754z();
        CharSequence charSequence = this.f384094c;
        String str = this.f384093b;
        int i = this.f384095d;
        int i2 = this.f384096e;
        a.f384088b = i;
        a.f384089c = i2;
        a.mo116518b(charSequence, str);
        C141330c cVar = this.f384097f.f384098a;
        cVar.mo116362b(C37200a.f98706p.mo40812e(aqf.f159732l, cVar.mo116361a((apx) null, (aqb) null)));
    }
}
