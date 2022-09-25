package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143949t;
import com.google.android.gms.common.internal.C143953x;

/* renamed from: com.google.android.gms.common.api.internal.q */
/* compiled from: PG */
final class C143828q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C143829r f389891a;

    /* renamed from: b */
    private final C143826o f389892b;

    public C143828q(C143829r rVar, C143826o oVar) {
        this.f389891a = rVar;
        this.f389892b = oVar;
    }

    public final void run() {
        if (this.f389891a.f389893a) {
            ConnectionResult connectionResult = this.f389892b.f389888b;
            if (connectionResult.mo119067a()) {
                C143829r rVar = this.f389891a;
                C143777by byVar = rVar.f389645f;
                Activity l = rVar.mo119121l();
                PendingIntent pendingIntent = connectionResult.f389575d;
                C143919bh.m233958a(pendingIntent);
                byVar.startActivityForResult(GoogleApiActivity.m233460a(l, pendingIntent, this.f389892b.f389887a, false), 1);
                return;
            }
            C143829r rVar2 = this.f389891a;
            if (rVar2.f389896d.mo119363k(rVar2.mo119121l(), connectionResult.f389574c, (String) null) != null) {
                C143829r rVar3 = this.f389891a;
                C143875g gVar = rVar3.f389896d;
                Activity l2 = rVar3.mo119121l();
                C143829r rVar4 = this.f389891a;
                C143777by byVar2 = rVar4.f389645f;
                int i = connectionResult.f389574c;
                Dialog b = gVar.mo119354b(l2, i, new C143953x(gVar.mo119363k(l2, i, "d"), byVar2), rVar4);
                if (b != null) {
                    gVar.mo119357e(l2, b, "GooglePlayServicesErrorDialog", rVar4);
                }
            } else if (connectionResult.f389574c == 18) {
                C143829r rVar5 = this.f389891a;
                C143875g gVar2 = rVar5.f389896d;
                Activity l3 = rVar5.mo119121l();
                C143829r rVar6 = this.f389891a;
                ProgressBar progressBar = new ProgressBar(l3, (AttributeSet) null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(l3);
                builder.setView(progressBar);
                builder.setMessage(C143949t.m234114d(l3, 18));
                builder.setPositiveButton(BuildConfig.FLAVOR, (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                gVar2.mo119357e(l3, create, "GooglePlayServicesUpdatingDialog", rVar6);
                C143829r rVar7 = this.f389891a;
                rVar7.f389896d.mo119356d(rVar7.mo119121l().getApplicationContext(), new C143827p(this, create));
            } else {
                this.f389891a.mo119278a(connectionResult, this.f389892b.f389887a);
            }
        }
    }
}
