package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.content.Context;
import android.content.DialogInterface;
import com.google.assistant.p3861at.C50495ze;
import com.google.assistant.p3861at.C50498zh;
import com.google.assistant.p3861at.aal;
import com.google.assistant.p3861at.aan;
import com.google.assistant.p3861at.ace;
import com.google.assistant.p3861at.acf;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cm */
/* compiled from: PG */
final class C73606cm implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C50498zh f194730a;

    /* renamed from: b */
    final /* synthetic */ Context f194731b;

    /* renamed from: c */
    final /* synthetic */ cn f194732c;

    public C73606cm(cn cnVar, C50498zh zhVar, Context context) {
        this.f194732c = cnVar;
        this.f194730a = zhVar;
        this.f194731b = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        cn cnVar = this.f194732c;
        C50498zh zhVar = this.f194730a;
        cl clVar = new cl(this);
        ace ace = (ace) acf.f128844c.createBuilder();
        aal aal = (aal) cn.a(zhVar).toBuilder();
        aal.copyOnWrite();
        aan aan = (aan) aal.instance;
        aan.f128711b = 1;
        aan.f128710a = 1 | aan.f128710a;
        C50495ze zeVar = zhVar.f131449v;
        if (zeVar == null) {
            zeVar = C50495ze.f131401g;
        }
        String str = zeVar.f131404b;
        aal.copyOnWrite();
        aan aan2 = (aan) aal.instance;
        str.getClass();
        aan2.f128710a |= 8;
        aan2.f128714e = str;
        C50495ze zeVar2 = zhVar.f131449v;
        if (zeVar2 == null) {
            zeVar2 = C50495ze.f131401g;
        }
        boolean z = zeVar2.f131408f;
        aal.copyOnWrite();
        aan aan3 = (aan) aal.instance;
        aan3.f128710a |= 64;
        aan3.f128717h = z;
        ace.copyOnWrite();
        acf acf = (acf) ace.instance;
        aan aan4 = (aan) aal.build();
        aan4.getClass();
        acf.f128847b = aan4;
        acf.f128846a |= 2;
        acf acf2 = (acf) ace.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        acf2.getClass();
        acx.f128994k = acf2;
        acx.f128984a |= 256;
        cnVar.b.mo65166e((acx) acw.build(), clVar);
    }
}
