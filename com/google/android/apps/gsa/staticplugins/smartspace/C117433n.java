package com.google.android.apps.gsa.staticplugins.smartspace;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.n */
/* compiled from: PG */
public final /* synthetic */ class C117433n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C117434o f325954a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f325955b;

    public /* synthetic */ C117433n(C117434o oVar, ArrayList arrayList) {
        this.f325954a = oVar;
        this.f325955b = arrayList;
    }

    public final void accept(Object obj) {
        C60870cx cxVar;
        C117434o oVar = this.f325954a;
        ArrayList arrayList = this.f325955b;
        C92113i iVar = (C92113i) obj;
        if (iVar == null) {
            cxVar = C118826c.f331423b;
        } else {
            if (oVar.f325958c.f232790a.mo79722a().getBoolean("smartspace_dreamliner_enabled", false)) {
                C117382e eVar = oVar.f325960e;
                C50794cr a = C50794cr.m85938a(iVar.f256820a.f132315l);
                if (a == null) {
                    a = C50794cr.UNDEFINED;
                }
                if (eVar.mo103287a(a, 6)) {
                    oVar.f325957b.sendBroadcast(C117434o.m195175c(iVar, "com.google.android.apps.dreamliner"));
                }
            }
            if (oVar.f325963h.mo98629a() && oVar.f325959d.mo65445a() == 2) {
                C117382e eVar2 = oVar.f325960e;
                C50794cr a2 = C50794cr.m85938a(iVar.f256820a.f132315l);
                if (a2 == null) {
                    a2 = C50794cr.UNDEFINED;
                }
                if (eVar2.mo103287a(a2, 7)) {
                    Context context = oVar.f325957b;
                    context.sendBroadcast(C117434o.m195175c(iVar, context.getPackageName()));
                }
            }
            if ((!oVar.f325957b.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE") || !oVar.f325961f.mo79746e(C90014bt.f247453hT)) && !oVar.f325962g.mo77175m()) {
                C50794cr a3 = C50794cr.m85938a(iVar.f256820a.f132315l);
                if (a3 == null) {
                    a3 = C50794cr.UNDEFINED;
                }
                if (a3.equals(C50794cr.LOCATION_OOBE)) {
                    iVar = new C92113i(oVar.f325962g.mo77169f(), (Bitmap) null, true);
                }
                C117382e eVar3 = oVar.f325960e;
                C50794cr a4 = C50794cr.m85938a(iVar.f256820a.f132315l);
                if (a4 == null) {
                    a4 = C50794cr.UNDEFINED;
                }
                if (eVar3.mo103287a(a4, 2)) {
                    C59052c cVar = (C59052c) ((C59052c) C117434o.f325956a.mo56224b()).mo56372aa(32996);
                    C50794cr a5 = C50794cr.m85938a(iVar.f256820a.f132315l);
                    if (a5 == null) {
                        a5 = C50794cr.UNDEFINED;
                    }
                    cVar.mo56389s("sending card type %s", C92111g.m151146a(a5));
                    oVar.f325957b.sendBroadcast(C117434o.m195175c(iVar, "com.google.android.apps.nexuslauncher"));
                }
                int i = iVar.f256820a.f132315l;
                C50794cr a6 = C50794cr.m85938a(i);
                if (a6 == null) {
                    a6 = C50794cr.UNDEFINED;
                }
                if (a6 != C50794cr.TIPS) {
                    C117382e eVar4 = oVar.f325960e;
                    C50794cr a7 = C50794cr.m85938a(i);
                    if (a7 == null) {
                        a7 = C50794cr.UNDEFINED;
                    }
                    if (eVar4.mo103287a(a7, 8)) {
                        oVar.f325957b.sendBroadcast(C117434o.m195175c(iVar, "com.android.systemui"));
                    }
                }
                cxVar = C118826c.f331423b;
            } else {
                cxVar = C118826c.f331423b;
            }
        }
        arrayList.add(cxVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
