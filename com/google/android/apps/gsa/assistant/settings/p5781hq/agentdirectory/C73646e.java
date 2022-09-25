package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.content.Context;
import android.support.p033v7.app.C0392m;
import android.view.View;
import android.widget.RadioGroup;
import com.google.assistant.p3861at.C50498zh;
import com.google.assistant.p3861at.C50506zp;
import com.google.assistant.p3861at.C50511zu;
import com.google.assistant.p3861at.aal;
import com.google.assistant.p3861at.aan;
import com.google.assistant.p3861at.aaz;
import com.google.assistant.p3861at.abs;
import com.google.assistant.p3861at.abt;
import com.google.assistant.p3861at.ace;
import com.google.assistant.p3861at.acf;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3897e.p3910e.p3911a.C51201p;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.e */
/* compiled from: PG */
public final /* synthetic */ class C73646e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ j f194825a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f194826b;

    /* renamed from: c */
    public final /* synthetic */ RadioGroup f194827c;

    /* renamed from: d */
    public final /* synthetic */ C50498zh f194828d;

    public /* synthetic */ C73646e(j jVar, C0392m mVar, RadioGroup radioGroup, C50498zh zhVar) {
        this.f194825a = jVar;
        this.f194826b = mVar;
        this.f194827c = radioGroup;
        this.f194828d = zhVar;
    }

    public final void onClick(View view) {
        cn cnVar;
        j jVar = this.f194825a;
        C0392m mVar = this.f194826b;
        RadioGroup radioGroup = this.f194827c;
        C50498zh zhVar = this.f194828d;
        mVar.dismiss();
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId >= 0 && checkedRadioButtonId < zhVar.f131451y.size() && (cnVar = jVar.i) != null) {
            Context context = jVar.b;
            aaz aaz = (aaz) zhVar.f131451y.get(checkedRadioButtonId);
            abs abs = (abs) abt.f128804g.createBuilder();
            String str = zhVar.f131435h;
            abs.copyOnWrite();
            abt abt = (abt) abs.instance;
            str.getClass();
            abt.f128806a |= 2;
            abt.f128808c = str;
            if ((zhVar.f131428a & 33554432) != 0) {
                C51201p pVar = zhVar.f131415D;
                if (pVar == null) {
                    pVar = C51201p.f133290e;
                }
                String str2 = pVar.f133294c;
                abs.copyOnWrite();
                abt abt2 = (abt) abs.instance;
                str2.getClass();
                abt2.f128806a |= 8;
                abt2.f128809d = str2;
            }
            abs.copyOnWrite();
            abt abt3 = (abt) abs.instance;
            aaz.getClass();
            abt3.f128807b = aaz;
            abt3.f128806a |= 1;
            C50506zp zpVar = zhVar.f131421J;
            if (zpVar == null) {
                zpVar = C50506zp.f131470f;
            }
            if (zpVar.f131473b) {
                if ((zhVar.f131428a & 4096) != 0) {
                    C50511zu zuVar = zhVar.f131440m;
                    if (zuVar == null) {
                        zuVar = C50511zu.f131489d;
                    }
                    String str3 = zuVar.f131492b;
                    abs.copyOnWrite();
                    abt abt4 = (abt) abs.instance;
                    str3.getClass();
                    abt4.f128806a |= 16;
                    abt4.f128810e = str3;
                }
                if (!zhVar.f131434g.isEmpty()) {
                    String str4 = zhVar.f131434g;
                    abs.copyOnWrite();
                    abt abt5 = (abt) abs.instance;
                    str4.getClass();
                    abt5.f128806a |= 32;
                    abt5.f128811f = str4;
                }
            }
            ace ace = (ace) acf.f128844c.createBuilder();
            aal aal = (aal) cn.a(zhVar).toBuilder();
            aal.copyOnWrite();
            aan aan = (aan) aal.instance;
            aan.f128711b = 10;
            aan.f128710a |= 1;
            aal.copyOnWrite();
            aan aan2 = (aan) aal.instance;
            abt abt6 = (abt) abs.build();
            abt6.getClass();
            aan2.f128723n = abt6;
            aan2.f128710a |= 4096;
            ace.copyOnWrite();
            acf acf = (acf) ace.instance;
            aan aan3 = (aan) aal.build();
            aan3.getClass();
            acf.f128847b = aan3;
            acf.f128846a |= 2;
            acf acf2 = (acf) ace.build();
            acw acw = (acw) acx.f128971H.createBuilder();
            acw.copyOnWrite();
            acx acx = (acx) acw.instance;
            acf2.getClass();
            acx.f128994k = acf2;
            acx.f128984a |= 256;
            cnVar.b.mo65166e((acx) acw.build(), new ci(cnVar, context, aaz));
        }
    }
}
