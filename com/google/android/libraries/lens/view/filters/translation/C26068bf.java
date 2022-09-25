package com.google.android.libraries.lens.view.filters.translation;

import android.app.Dialog;
import android.support.p031v4.app.C0260w;
import android.support.p033v7.app.C0392m;
import android.view.View;
import android.widget.Button;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28456a;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28459d;
import com.google.apps.tiktok.account.p3603a.C45954d;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.bf */
/* compiled from: PG */
public final /* synthetic */ class C26068bf implements C28456a {

    /* renamed from: a */
    public final /* synthetic */ C26070bh f70860a;

    public /* synthetic */ C26068bf(C26070bh bhVar) {
        this.f70860a = bhVar;
    }

    /* renamed from: a */
    public final void mo18181a(Dialog dialog, View view) {
        C26070bh bhVar = this.f70860a;
        C0392m mVar = (C0392m) dialog;
        C28306ab abVar = bhVar.f70864d;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(bhVar.f70861a.f70851j));
        a.mo33859g(C45954d.m82060a(bhVar.f70863c.f69824a));
        abVar.mo33801b(view, a);
        C28306ab abVar2 = bhVar.f70864d;
        Button button = mVar.f1349a.f1110j;
        C28310af afVar = abVar2.f76990a;
        C26126i iVar = bhVar.f70861a.f70842a;
        if (iVar == null) {
            iVar = C26126i.f70993c;
        }
        abVar2.mo33801b(button, afVar.mo33805a(C28427h.m53115a(iVar.f70996b)));
        C28306ab abVar3 = bhVar.f70864d;
        Button button2 = mVar.f1349a.f1113m;
        C28310af afVar2 = abVar3.f76990a;
        C26126i iVar2 = bhVar.f70861a.f70843b;
        if (iVar2 == null) {
            iVar2 = C26126i.f70993c;
        }
        abVar3.mo33801b(button2, afVar2.mo33805a(C28427h.m53115a(iVar2.f70996b)));
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18182b(C0260w wVar) {
        C28459d.m53188c(wVar);
    }
}
