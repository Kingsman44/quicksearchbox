package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.policyfooter.PolicyFooterView;
import com.google.android.libraries.onegoogle.accountmenu.p2376g.C30643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bi */
/* compiled from: PG */
public final class C30738bi extends ScrollView {

    /* renamed from: a */
    public final C63644b f82968a;

    /* renamed from: b */
    public final PolicyFooterView f82969b = ((PolicyFooterView) findViewById(R.id.og_footer));

    /* renamed from: c */
    public final C30643a f82970c;

    public C30738bi(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.incognito_off_account_menu, this);
        this.f82970c = new C30643a(context);
        C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172123c = 1;
        bVar.f172121a |= 2;
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172125e = 8;
        bVar2.f172121a |= 32;
        aVar.copyOnWrite();
        C63644b bVar3 = (C63644b) aVar.instance;
        bVar3.f172124d = 3;
        bVar3.f172121a = 8 | bVar3.f172121a;
        this.f82968a = (C63644b) aVar.build();
    }
}
