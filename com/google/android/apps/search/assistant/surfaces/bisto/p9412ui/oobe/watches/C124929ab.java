package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import android.content.DialogInterface;
import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124825a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124827c;
import com.google.apps.tiktok.dataservice.local.C46854h;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ab */
/* compiled from: PG */
public final /* synthetic */ class C124929ab implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C124931ad f344700a;

    public /* synthetic */ C124929ab(C124931ad adVar) {
        this.f344700a = adVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C124931ad adVar = this.f344700a;
        adVar.f344708f = adVar.f344707e.mo57444a();
        C124825a a = ((OobeActivityViewModel) new C2368bp(adVar.f344704b.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a();
        a.mo106662b("GacsConnectFragment");
        C60103kw kwVar = ((C124827c) a).f344386b;
        int i2 = ((C60106kz) kwVar.instance).f162546n;
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        kzVar.f162533a |= 65536;
        kzVar.f162546n = i2 + 1;
        C46854h hVar = adVar.f344709g;
        hVar.getClass();
        hVar.mo50866a(adVar);
    }
}
