package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.DialogInterface;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87847fu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87848fv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87894hn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87897hq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87898hr;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6970ab.C89079i;
import com.google.android.apps.gsa.shared.p6970ab.C89080j;
import com.google.android.apps.gsa.shared.p6970ab.C89081k;
import com.google.android.apps.gsa.shared.p6970ab.C89082l;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.q */
/* compiled from: PG */
public final /* synthetic */ class C88746q implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88750u f240077a;

    /* renamed from: b */
    public final /* synthetic */ Suggestion f240078b;

    /* renamed from: c */
    public final /* synthetic */ C88803an f240079c;

    /* renamed from: d */
    public final /* synthetic */ String f240080d;

    /* renamed from: e */
    public final /* synthetic */ int f240081e;

    /* renamed from: f */
    public final /* synthetic */ Integer f240082f;

    /* renamed from: g */
    public final /* synthetic */ String f240083g;

    public /* synthetic */ C88746q(C88750u uVar, Suggestion suggestion, C88803an anVar, String str, int i, Integer num, String str2) {
        this.f240077a = uVar;
        this.f240078b = suggestion;
        this.f240079c = anVar;
        this.f240080d = str;
        this.f240081e = i;
        this.f240082f = num;
        this.f240083g = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C88750u uVar = this.f240077a;
        Suggestion suggestion = this.f240078b;
        C88803an anVar = this.f240079c;
        String str = this.f240080d;
        int i2 = this.f240081e;
        Integer num = this.f240082f;
        String str2 = this.f240083g;
        uVar.mo82480b(suggestion, 3);
        Integer valueOf = Integer.valueOf(i2);
        C89081k kVar = (C89081k) C89082l.f241414d.createBuilder();
        kVar.copyOnWrite();
        C89082l lVar = (C89082l) kVar.instance;
        str2.getClass();
        lVar.f241416a |= 1;
        lVar.f241417b = str2;
        C89082l lVar2 = (C89082l) kVar.build();
        C89079i iVar = (C89079i) C89080j.f241408e.createBuilder();
        int intValue = valueOf.intValue();
        iVar.copyOnWrite();
        C89080j jVar = (C89080j) iVar.instance;
        jVar.f241410a |= 1;
        jVar.f241411b = intValue;
        iVar.copyOnWrite();
        C89080j jVar2 = (C89080j) iVar.instance;
        lVar2.getClass();
        jVar2.f241413d = lVar2;
        jVar2.f241410a |= 4;
        if (num != null) {
            int intValue2 = num.intValue();
            iVar.copyOnWrite();
            C89080j jVar3 = (C89080j) iVar.instance;
            jVar3.f241410a |= 2;
            jVar3.f241412c = intValue2;
        }
        C87897hq hqVar = (C87897hq) C87898hr.f237779c.createBuilder();
        hqVar.copyOnWrite();
        C87898hr hrVar = (C87898hr) hqVar.instance;
        C89080j jVar4 = (C89080j) iVar.build();
        jVar4.getClass();
        hrVar.f237782b = jVar4;
        hrVar.f237781a |= 1;
        C87847fu fuVar = (C87847fu) C87848fv.f237681d.createBuilder();
        fuVar.copyOnWrite();
        C87848fv fvVar = (C87848fv) fuVar.instance;
        fvVar.f237683a |= 2;
        fvVar.f237685c = 179502416;
        fuVar.mo58885m(C87894hn.f237774b, (C87898hr) hqVar.build());
        uVar.f240094b.mo82300A((C87848fv) fuVar.build(), new C88749t(uVar, str, anVar, 3));
    }
}
