package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.widget.CompoundButton;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.p427am.p432b.p433a.C8632ak;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8685o;
import com.google.p427am.p432b.p433a.C8686p;
import com.google.p427am.p432b.p433a.C8687q;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.au */
/* compiled from: PG */
public final /* synthetic */ class C132133au implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C132167ba f360672a;

    /* renamed from: b */
    public final /* synthetic */ String f360673b;

    /* renamed from: c */
    public final /* synthetic */ String f360674c;

    /* renamed from: d */
    public final /* synthetic */ C8675e f360675d;

    public /* synthetic */ C132133au(C132167ba baVar, String str, String str2, C8675e eVar) {
        this.f360672a = baVar;
        this.f360673b = str;
        this.f360674c = str2;
        this.f360675d = eVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C132167ba baVar = this.f360672a;
        String str = this.f360673b;
        String str2 = this.f360674c;
        C8675e eVar = this.f360675d;
        C46439e eVar2 = baVar.f360748f;
        C132140a aVar = baVar.f360749g;
        C8632ak akVar = (C8632ak) C8633al.f29901j.createBuilder();
        C8686p pVar = (C8686p) C8687q.f30013c.createBuilder();
        pVar.copyOnWrite();
        ((C8687q) pVar.instance).f30016b = z;
        C8633al alVar = eVar.f29993b;
        if (alVar == null) {
            alVar = C8633al.f29901j;
        }
        C8687q qVar = alVar.f29911i;
        if (qVar == null) {
            qVar = C8687q.f30013c;
        }
        C8685o oVar = (C8685o) qVar.f30015a.get(0);
        pVar.copyOnWrite();
        C8687q qVar2 = (C8687q) pVar.instance;
        oVar.getClass();
        qVar2.mo17213a();
        qVar2.f30015a.add(oVar);
        akVar.copyOnWrite();
        C8687q qVar3 = (C8687q) pVar.build();
        qVar3.getClass();
        ((C8633al) akVar.instance).f29911i = qVar3;
        C46438d b = C46438d.m82810b(aVar.mo110504d(str, str2, (C8633al) akVar.build()));
        eVar2.mo50428h(b.f121541a, (Object) null, baVar.f360750h);
    }
}
