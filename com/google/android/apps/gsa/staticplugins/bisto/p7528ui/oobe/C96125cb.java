package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142338bq;
import com.google.android.p10712d.C142340bs;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cb */
/* compiled from: PG */
public final /* synthetic */ class C96125cb implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96131ch f269107a;

    public /* synthetic */ C96125cb(C96131ch chVar) {
        this.f269107a = chVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C58833ax axVar;
        int i;
        int i2;
        C96131ch chVar = this.f269107a;
        C142324bc bcVar = (C142324bc) obj;
        C58976aa aaVar = C58975e.f156826a;
        C96325jm jmVar = chVar.f269122f;
        Activity activity = chVar.getActivity();
        if (bcVar.isInitialized()) {
            jmVar.f269538a = new C96097ba(activity, bcVar);
        }
        C96097ba baVar = chVar.f269122f.f269538a;
        Context context = chVar.getContext();
        if (context != null) {
            String str = chVar.f269119c.f269039a;
            C142340bs bsVar = baVar.f269047b.f386119e;
            if (bsVar == null) {
                bsVar = C142340bs.f386174C;
            }
            if ((bsVar.f386178a & 16) != 0) {
                C142340bs bsVar2 = baVar.f269047b.f386119e;
                if (bsVar2 == null) {
                    bsVar2 = C142340bs.f386174C;
                }
                axVar = C58833ax.m90834k(bsVar2.f386183f);
            } else {
                axVar = C58836b.f156633a;
            }
            if (axVar.mo56113h()) {
                String str2 = (String) axVar.mo56107c();
                if (!C58837ba.m90859h(str2)) {
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        String str3 = packageInfo.versionName;
                        String str4 = packageInfo.versionName;
                        String[] split = str2.split("\\.");
                        String[] split2 = str4.split("\\.");
                        int i3 = 0;
                        while (true) {
                            if (i3 >= split.length || i3 >= split2.length) {
                                break;
                            }
                            try {
                                i = Integer.parseInt(split[i3]);
                            } catch (NumberFormatException unused) {
                                i = 0;
                            }
                            try {
                                i2 = Integer.parseInt(split2[i3]);
                            } catch (NumberFormatException unused2) {
                                i2 = 0;
                            }
                            if (i == i2) {
                                i3++;
                            } else if (((long) i) > ((long) i2)) {
                                C60103kw kwVar = ((C95299e) chVar.f269603D.mo27525b()).f266647b;
                                kwVar.copyOnWrite();
                                C60106kz kzVar = (C60106kz) kwVar.instance;
                                C60106kz kzVar2 = C60106kz.f162531p;
                                kzVar.f162533a |= 4096;
                                kzVar.f162542j = true;
                                new AlertDialog.Builder(chVar.getActivity()).setTitle(R.string.bisto_update_agsa_dialog_title).setMessage(R.string.bisto_update_agsa_dialog_text).setPositiveButton(R.string.bisto_update_agsa_dialog_action, new C96128ce(chVar, str, context)).setOnDismissListener(new C96129cf(chVar)).setNegativeButton(R.string.cancel, new C96130cg(chVar)).create().show();
                                return;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused3) {
                    }
                }
            }
            C60103kw kwVar2 = ((C95299e) chVar.f269603D.mo27525b()).f266647b;
            kwVar2.copyOnWrite();
            C60106kz kzVar3 = (C60106kz) kwVar2.instance;
            C60106kz kzVar4 = C60106kz.f162531p;
            kzVar3.f162533a |= 4096;
            kzVar3.f162542j = false;
            C142340bs bsVar3 = baVar.f269047b.f386119e;
            if (bsVar3 == null) {
                bsVar3 = C142340bs.f386174C;
            }
            C62971cq<C142338bq> cqVar = bsVar3.f386192o;
            ArrayList<C96095az> arrayList = new ArrayList<>();
            for (C142338bq azVar : cqVar) {
                C96095az azVar2 = new C96095az(azVar);
                if (azVar2.mo89950a()) {
                    arrayList.add(azVar2);
                }
            }
            for (C96095az azVar3 : arrayList) {
                chVar.f269123g.mo90076c(context, C58833ax.m90833j(azVar3.f269041b));
            }
            for (C96095az azVar4 : baVar.mo89959j()) {
                chVar.f269123g.mo90076c(context, C58833ax.m90833j(azVar4.f269041b));
            }
            chVar.f269123g.mo90076c(context, baVar.mo89955f());
            chVar.mo77318iT().mo77312a();
        }
    }
}
