package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.assistant.p3861at.C50264qq;
import com.google.assistant.p3861at.C50266qs;
import com.google.assistant.p3861at.C50268qu;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.aw */
/* compiled from: PG */
public final /* synthetic */ class C9910aw implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9911ax f33998a;

    /* renamed from: b */
    public final /* synthetic */ C50264qq f33999b;

    public /* synthetic */ C9910aw(C9911ax axVar, C50264qq qqVar) {
        this.f33998a = axVar;
        this.f33999b = qqVar;
    }

    public final void onClick(View view) {
        C50268qu quVar;
        C9911ax axVar = this.f33998a;
        C50266qs qsVar = this.f33999b.f130715e;
        if (qsVar == null) {
            qsVar = C50266qs.f130716c;
        }
        if (qsVar.f130718a == 7) {
            quVar = (C50268qu) qsVar.f130719b;
        } else {
            quVar = C50268qu.f130720e;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("subsection", quVar.toByteArray());
        C18509a c = C18522b.m35986c();
        C18523c cVar = (C18523c) c;
        cVar.f52492a = "main_menu";
        cVar.f52493b = bundle;
        Intent a = c.mo24020b().mo24031a();
        a.putExtra("extra_assistant_settings_entry_source", axVar.f34000a);
        axVar.f34001b.mo65090b(a, new C91095e());
    }
}
