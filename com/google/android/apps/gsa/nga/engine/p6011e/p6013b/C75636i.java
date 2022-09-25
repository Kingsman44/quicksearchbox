package com.google.android.apps.gsa.nga.engine.p6011e.p6013b;

import android.os.Vibrator;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60761r;

/* renamed from: com.google.android.apps.gsa.nga.engine.e.b.i */
/* compiled from: PG */
public final /* synthetic */ class C75636i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C75638k f209960a;

    public /* synthetic */ C75636i(C75638k kVar) {
        this.f209960a = kVar;
    }

    public final void run() {
        C75638k kVar = this.f209960a;
        if (kVar.f209965d.mo71759t()) {
            kVar.mo71769g(R.raw.open_bluetooth, "R.raw.open_bluetooth", 0);
        } else if (kVar.f209963b.mo85405j(C90126fx.f251173dn) && kVar.f209965d.mo71742c() != 2 && !kVar.mo71768f()) {
            Vibrator vibrator = (Vibrator) kVar.f209962a.getSystemService(Vibrator.class);
            if (vibrator.hasVibrator()) {
                C58485gu c = C89988b.m146550c(kVar.f209963b.mo85403h(C90082eg.f249946bI));
                if (c.size() > 1) {
                    vibrator.vibrate(C60761r.m92761g(c), -1);
                }
            }
        } else if (!kVar.f209963b.mo85405j(C90126fx.f251080c) || kVar.mo71768f()) {
            kVar.mo71769g(R.raw.open, "R.raw.open", 0);
        }
    }
}
