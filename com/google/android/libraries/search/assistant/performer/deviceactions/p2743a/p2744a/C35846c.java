package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.database.Cursor;
import android.telephony.TelephonyManager;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C35846c implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C35862s f93936a;

    public /* synthetic */ C35846c(C35862s sVar) {
        this.f93936a = sVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        boolean z;
        C35862s sVar = this.f93936a;
        Cursor cursor = (Cursor) obj;
        if (cursor == null || !cursor.moveToFirst()) {
            ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51901)).mo56386p("Unable to query setting when querying setting intent.");
            return BuildConfig.FLAVOR;
        }
        boolean z2 = true;
        if (C35862s.f93954b.contains(sVar.f93955c)) {
            z = "0".equals(cursor.getString(1));
        } else {
            z = "5".equals(cursor.getString(1));
        }
        if ("button_roaming_key".equals(sVar.f93955c)) {
            TelephonyManager telephonyManager = (TelephonyManager) sVar.f93958f.getSystemService("phone");
            if (!z || telephonyManager == null || telephonyManager.getSimState() != 5) {
                z2 = false;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            return cursor.getString(2);
        }
        ((C59052c) ((C59052c) C35862s.f93953a.mo56226d()).mo56372aa(51903)).mo56386p("Setting not available when querying setting intent.");
        return BuildConfig.FLAVOR;
    }
}
