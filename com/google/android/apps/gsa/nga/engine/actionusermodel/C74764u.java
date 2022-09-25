package com.google.android.apps.gsa.nga.engine.actionusermodel;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import com.google.android.apps.gsa.nga.shared.android.C80957m;

/* renamed from: com.google.android.apps.gsa.nga.engine.actionusermodel.u */
/* compiled from: PG */
public final /* synthetic */ class C74764u implements C80957m {

    /* renamed from: a */
    public final /* synthetic */ al f208878a;

    /* renamed from: b */
    public final /* synthetic */ Context f208879b;

    public /* synthetic */ C74764u(al alVar, Context context) {
        this.f208878a = alVar;
        this.f208879b = context;
    }

    /* renamed from: a */
    public final void mo71168a(Intent intent) {
        al alVar = this.f208878a;
        Context context = this.f208879b;
        synchronized (alVar.h) {
            alVar.i = Telephony.Sms.getDefaultSmsPackage(context);
        }
    }
}
