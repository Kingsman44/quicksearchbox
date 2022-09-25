package com.google.android.libraries.surveys.internal.p3328e;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64525de;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64526df;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68351a;

/* renamed from: com.google.android.libraries.surveys.internal.e.m */
/* compiled from: PG */
final class C43064m extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ Context f112624a;

    /* renamed from: b */
    final /* synthetic */ String f112625b;

    public C43064m(Context context, String str) {
        this.f112624a = context;
        this.f112625b = str;
    }

    public final void onClick(View view) {
        C43060i iVar = new C43060i();
        C43066o.m76000u(this.f112624a);
        Context context = this.f112624a;
        String str = this.f112625b;
        if (C43054c.m75960c(C68351a.m98703c(C43054c.f112610b))) {
            C43058g a = C43058g.m75965a();
            C64525de deVar = (C64525de) C64526df.f174994c.createBuilder();
            deVar.copyOnWrite();
            ((C64526df) deVar.instance).f174996a = 0;
            deVar.copyOnWrite();
            ((C64526df) deVar.instance).f174997b = 3;
            a.mo46079d((C64526df) deVar.build(), C43060i.m75976b(iVar.f112619a), iVar.mo46080a(), context, str);
        }
    }
}
