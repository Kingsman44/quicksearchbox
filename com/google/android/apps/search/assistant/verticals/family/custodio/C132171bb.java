package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.DialogInterface;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.p427am.p432b.p433a.C8632ak;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8687q;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bb */
/* compiled from: PG */
final class C132171bb implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C132173bd f360761a;

    public C132171bb(C132173bd bdVar) {
        this.f360761a = bdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C132173bd bdVar = this.f360761a;
        C132167ba baVar = bdVar.f360765d;
        C46439e eVar = baVar.f360748f;
        C132140a aVar = baVar.f360749g;
        String str = bdVar.f360763b;
        String str2 = bdVar.f360764c;
        C8632ak akVar = (C8632ak) C8633al.f29901j.createBuilder();
        C8687q qVar = C8687q.f30013c;
        akVar.copyOnWrite();
        qVar.getClass();
        ((C8633al) akVar.instance).f29911i = qVar;
        C46438d b = C46438d.m82810b(aVar.mo110504d(str, str2, (C8633al) akVar.build()));
        eVar.mo50428h(b.f121541a, (Object) null, this.f360761a.f360765d.f360751i);
    }
}
