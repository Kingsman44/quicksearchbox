package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.DialogInterface;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114058dx;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114059dy;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114095a;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bz */
/* compiled from: PG */
public final /* synthetic */ class C108255bz implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108259cc f301149a;

    public /* synthetic */ C108255bz(C108259cc ccVar) {
        this.f301149a = ccVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C108259cc ccVar = this.f301149a;
        C114059dy dyVar = ccVar.f301155c;
        String obj = ccVar.f301153a.toString();
        long b = dyVar.f315764a.f315814X.mo26870b();
        dyVar.f315764a.f315841aY.put(obj, Long.valueOf(b));
        ArrayList arrayList = (ArrayList) dyVar.f315764a.f315840aX.get(obj);
        if (arrayList == null) {
            ((C59052c) ((C59052c) C114071eg.f315790j.mo56225c()).mo56372aa(28491)).mo56386p("Cannot find the query history to be deleted. This should never happen.");
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = ((C108232bc) arrayList.get(i2)).f301037s;
            if (str != null) {
                dyVar.f315764a.f315858ap.mo96722a(str);
            }
        }
        dyVar.f315764a.f315840aX.remove(obj);
        C114071eg egVar = dyVar.f315764a;
        egVar.f315842aZ = false;
        C114095a aVar = egVar.f315859aq;
        aVar.mo101141x(aVar.mo95351a());
        dyVar.f315764a.mo101015cE();
        dyVar.f315764a.f315816Z.mo28212l("Delete query history from local history store.", new C114058dx(dyVar, obj, b));
    }
}
