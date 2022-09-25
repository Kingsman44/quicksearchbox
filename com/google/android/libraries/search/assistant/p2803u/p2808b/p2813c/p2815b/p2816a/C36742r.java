package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.support.p033v7.app.C0391l;
import android.text.Html;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.assistant.p3861at.C50357ub;
import com.google.assistant.p3861at.C50358uc;
import com.google.common.p4538j.p4539a.C59305c;
import com.google.common.p4538j.p4539a.C59308f;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.r */
/* compiled from: PG */
final class C36742r extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C50358uc f95736a;

    /* renamed from: b */
    final /* synthetic */ C36745u f95737b;

    public C36742r(C36745u uVar, C50358uc ucVar) {
        this.f95737b = uVar;
        this.f95736a = ucVar;
    }

    public final void onClick(View view) {
        C36745u uVar = this.f95737b;
        C50358uc ucVar = this.f95736a;
        C50357ub ubVar = ucVar.f131077j;
        if (ubVar == null) {
            ubVar = C50357ub.f131060d;
        }
        String str = ubVar.f131062a;
        ArrayList arrayList = new ArrayList();
        C50357ub ubVar2 = ucVar.f131077j;
        if (ubVar2 == null) {
            ubVar2 = C50357ub.f131060d;
        }
        for (C59308f fVar : ubVar2.f131063b) {
            arrayList.add(new C59305c(fVar.f157474a).f157465a);
        }
        String join = TextUtils.join("<p>", arrayList);
        C50357ub ubVar3 = ucVar.f131077j;
        if (ubVar3 == null) {
            ubVar3 = C50357ub.f131060d;
        }
        String str2 = ubVar3.f131064c;
        C0391l lVar = new C0391l(uVar.f95742b);
        lVar.setTitle(Html.fromHtml(str));
        lVar.f1347a.f1326g = Html.fromHtml(join);
        lVar.mo1306k(str2, new C47752cq(uVar.f95743c, "LearnMoreDialog.positiveButton", C36741q.f95735a));
        lVar.create().show();
    }
}
