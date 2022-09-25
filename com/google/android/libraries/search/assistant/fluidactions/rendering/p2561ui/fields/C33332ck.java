package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.text.Editable;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33231i;
import com.google.assistant.p3897e.p3902c.p3907c.C51045ei;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.aco;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ck */
/* compiled from: PG */
public final /* synthetic */ class C33332ck implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C33338cq f89336a;

    /* renamed from: b */
    public final /* synthetic */ C33337cp f89337b;

    /* renamed from: c */
    public final /* synthetic */ aco f89338c;

    /* renamed from: d */
    public final /* synthetic */ C51045ei f89339d;

    public /* synthetic */ C33332ck(C33338cq cqVar, C33337cp cpVar, aco aco, C51045ei eiVar) {
        this.f89336a = cqVar;
        this.f89337b = cpVar;
        this.f89338c = aco;
        this.f89339d = eiVar;
    }

    public final void onClick(View view) {
        C33338cq cqVar = this.f89336a;
        C33337cp cpVar = this.f89337b;
        aco aco = this.f89338c;
        C51045ei eiVar = this.f89339d;
        cpVar.f89359c.setEnabled(false);
        cpVar.f89362f.setEnabled(false);
        if (!cpVar.f89363g) {
            cpVar.f89363g = true;
            cqVar.f89367c.mo38397c();
        }
        String str = aco.f134834l;
        Editable text = cpVar.f89359c.getText();
        text.getClass();
        String obj = text.toString();
        if (str.isEmpty() || obj.isEmpty()) {
            C33334cm cmVar = cqVar.f89368d;
            int i = eiVar.f132917d;
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.INTERNAL;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            kdVar.copyOnWrite();
            C52236kg kgVar2 = (C52236kg) kdVar.instance;
            kgVar2.f137091a |= 2;
            kgVar2.f137093c = "Failed to reply to message, invalid NotificationKey or reply message";
            cmVar.mo38790h(C33231i.m61626c(i, 4, (C52236kg) kdVar.build()));
            return;
        }
        cqVar.f89368d.mo38792j(eiVar.f132917d, obj);
    }
}
