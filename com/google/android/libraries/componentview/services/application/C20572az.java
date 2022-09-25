package com.google.android.libraries.componentview.services.application;

import android.app.Dialog;
import android.content.DialogInterface;
import com.google.android.libraries.componentview.components.p1689c.C20193am;
import com.google.android.libraries.componentview.components.p1689c.C20194an;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20107ad;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.services.application.az */
/* compiled from: PG */
final class C20572az implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ Dialog f57748a;

    /* renamed from: b */
    final /* synthetic */ C56425d f57749b;

    /* renamed from: c */
    final /* synthetic */ C20576bc f57750c;

    /* renamed from: d */
    final /* synthetic */ C20193am[] f57751d;

    public C20572az(C20576bc bcVar, Dialog dialog, C56425d dVar, C20193am[] amVarArr) {
        this.f57750c = bcVar;
        this.f57748a = dialog;
        this.f57749b = dVar;
        this.f57751d = amVarArr;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C20576bc bcVar = this.f57750c;
        bcVar.f57755a = this.f57748a;
        C56429h hVar = this.f57749b.f150542d;
        if (hVar == null) {
            hVar = C56429h.f150547k;
        }
        bcVar.f57756b = hVar;
        C20193am[] amVarArr = this.f57751d;
        for (int i = 0; i <= 0; i++) {
            C20194an anVar = amVarArr[i].f56674a;
            C20107ad adVar = anVar.f56676b;
            String str = null;
            if ((adVar.f56352a & 1) != 0) {
                C56425d dVar = adVar.f56353b;
                if (((dVar == null ? C56425d.f150537g : dVar).f150539a & 4) != 0) {
                    C56429h hVar2 = (dVar == null ? C56425d.f150537g : dVar).f150542d;
                    if (hVar2 == null) {
                        hVar2 = C56429h.f150547k;
                    }
                    if ((hVar2.f150549a & 64) != 0) {
                        if (dVar == null) {
                            dVar = C56425d.f150537g;
                        }
                        C56429h hVar3 = dVar.f150542d;
                        if (hVar3 == null) {
                            hVar3 = C56429h.f150547k;
                        }
                        str = hVar3.f150556h;
                    }
                }
            }
            anVar.mo25285m(str, 1);
        }
    }
}
