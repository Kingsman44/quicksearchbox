package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.fg */
/* compiled from: PG */
public final /* synthetic */ class C145362fg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145379fx f392957a;

    /* renamed from: b */
    public final /* synthetic */ String f392958b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f392959c;

    public /* synthetic */ C145362fg(C145379fx fxVar, String str, Bundle bundle) {
        this.f392957a = fxVar;
        this.f392958b = str;
        this.f392959c = bundle;
    }

    public final void run() {
        C145379fx fxVar = this.f392957a;
        String str = this.f392958b;
        Bundle bundle = this.f392959c;
        C145228ah ahVar = fxVar.f393008a.f393355c;
        C145488jy.m236409I(ahVar);
        ahVar.mo120904g();
        ahVar.mo121194J();
        C145233am amVar = new C145233am(ahVar.f393011w, BuildConfig.FLAVOR, str, "dep", 0, 0, bundle);
        C145491ka kaVar = ahVar.f393327l.f393359g;
        C145488jy.m236409I(kaVar);
        byte[] byteArray = kaVar.mo121236j(amVar).toByteArray();
        ahVar.f393011w.mo120965ar().f392803k.mo120896c("Saving default event parameters, appId, data size", ahVar.f393011w.f392942l.mo120890c(str), Integer.valueOf(byteArray.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", byteArray);
        try {
            if (ahVar.mo120806d().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                ahVar.f393011w.mo120965ar().f392795c.mo120895b("Failed to insert default event parameters (got -1). appId", C145325dx.m236116a(str));
            }
        } catch (SQLiteException e) {
            ahVar.f393011w.mo120965ar().f392795c.mo120896c("Error storing default event parameters. appId", C145325dx.m236116a(str), e);
        }
    }
}
