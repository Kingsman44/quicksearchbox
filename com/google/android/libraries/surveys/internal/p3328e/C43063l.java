package com.google.android.libraries.surveys.internal.p3328e;

import android.app.Activity;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.p11010ai.p11011a.C147590a;
import com.google.android.libraries.p11010ai.p11011a.C147591b;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64525de;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64526df;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68351a;

/* renamed from: com.google.android.libraries.surveys.internal.e.l */
/* compiled from: PG */
final class C43063l extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ Activity f112622a;

    /* renamed from: b */
    final /* synthetic */ String f112623b;

    public C43063l(Activity activity, String str) {
        this.f112622a = activity;
        this.f112623b = str;
    }

    public final void onClick(View view) {
        C43060i iVar = new C43060i();
        try {
            C147591b.m240663b(this.f112622a, this.f112623b);
        } catch (C147590a e) {
            Log.e("SurveyUtils", "No app found to open URL: ".concat(String.valueOf(e.f398392a)));
        }
        Activity activity = this.f112622a;
        String str = this.f112623b;
        if (C43054c.m75960c(C68351a.m98703c(C43054c.f112610b))) {
            C43058g a = C43058g.m75965a();
            C64525de deVar = (C64525de) C64526df.f174994c.createBuilder();
            deVar.copyOnWrite();
            ((C64526df) deVar.instance).f174996a = 0;
            deVar.copyOnWrite();
            ((C64526df) deVar.instance).f174997b = 2;
            a.mo46079d((C64526df) deVar.build(), C43060i.m75976b(iVar.f112619a), iVar.mo46080a(), activity, str);
        }
    }
}
