package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import com.google.assistant.p3861at.C50495ze;
import com.google.assistant.p3861at.C50498zh;
import com.google.assistant.p3861at.aal;
import com.google.assistant.p3861at.aan;
import com.google.assistant.p3861at.ace;
import com.google.assistant.p3861at.acf;
import com.google.assistant.p3861at.ach;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.bz */
/* compiled from: PG */
public final /* synthetic */ class C73601bz implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ cn f194719a;

    /* renamed from: b */
    public final /* synthetic */ C50498zh f194720b;

    /* renamed from: c */
    public final /* synthetic */ Context f194721c;

    /* renamed from: d */
    public final /* synthetic */ int f194722d;

    public /* synthetic */ C73601bz(cn cnVar, C50498zh zhVar, Context context, int i) {
        this.f194719a = cnVar;
        this.f194720b = zhVar;
        this.f194721c = context;
        this.f194722d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        cn cnVar = this.f194719a;
        C50498zh zhVar = this.f194720b;
        Context context = this.f194721c;
        int i2 = this.f194722d;
        C73571aa aaVar = cnVar.d;
        ck ckVar = new ck(cnVar, context, zhVar, i2);
        Account a = aaVar.f194665b.mo79668a();
        aal aal = (aal) aan.f128708o.createBuilder();
        aal.copyOnWrite();
        aan aan = (aan) aal.instance;
        aan.f128711b = 2;
        aan.f128710a |= 1;
        String str = zhVar.f131430c;
        aal.copyOnWrite();
        aan aan2 = (aan) aal.instance;
        str.getClass();
        aan2.f128710a |= 2;
        aan2.f128712c = str;
        if ((zhVar.f131428a & 4) != 0) {
            long j = zhVar.f131432e;
            aal.copyOnWrite();
            aan aan3 = (aan) aal.instance;
            aan3.f128710a |= 4;
            aan3.f128713d = j;
        }
        C50495ze zeVar = zhVar.f131449v;
        if (zeVar == null) {
            zeVar = C50495ze.f131401g;
        }
        int a2 = ach.m85724a(zeVar.f131406d);
        if (a2 != 0 && a2 == 2) {
            C50495ze zeVar2 = zhVar.f131449v;
            if (zeVar2 == null) {
                zeVar2 = C50495ze.f131401g;
            }
            String str2 = zeVar2.f131404b;
            aal.copyOnWrite();
            aan aan4 = (aan) aal.instance;
            str2.getClass();
            aan4.f128710a |= 8;
            aan4.f128714e = str2;
            C50495ze zeVar3 = zhVar.f131449v;
            if (zeVar3 == null) {
                zeVar3 = C50495ze.f131401g;
            }
            boolean z = zeVar3.f131408f;
            aal.copyOnWrite();
            aan aan5 = (aan) aal.instance;
            aan5.f128710a |= 64;
            aan5.f128717h = z;
        }
        ace ace = (ace) acf.f128844c.createBuilder();
        ace.copyOnWrite();
        acf acf = (acf) ace.instance;
        aan aan6 = (aan) aal.build();
        aan6.getClass();
        acf.f128847b = aan6;
        acf.f128846a |= 2;
        acf acf2 = (acf) ace.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        acf2.getClass();
        acx.f128994k = acf2;
        acx.f128984a |= 256;
        aaVar.f194666c.mo17843h(a, (acx) acw.build(), ckVar);
    }
}
