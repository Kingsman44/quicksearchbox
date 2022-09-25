package com.google.android.libraries.p11033ap.p11034a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.UserManager;
import android.provider.Settings;
import android.util.Log;
import com.google.p3728as.p3737c.C48033a;
import com.google.p3728as.p3737c.C48038b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.ap.a.a */
/* compiled from: PG */
public final class C147814a {

    /* renamed from: a */
    private static final Uri f398792a = Uri.parse("content://com.google.intelligence.sense.ambientmusic.state_provider/now_playing_state");

    /* renamed from: b */
    private final UserManager f398793b;

    /* renamed from: c */
    private final Context f398794c;

    public C147814a(Context context) {
        this.f398794c = context;
        this.f398793b = (UserManager) context.getSystemService("user");
    }

    /* renamed from: a */
    public final C48038b mo124477a() {
        boolean z = false;
        try {
            PackageInfo packageInfo = this.f398794c.getPackageManager().getPackageInfo("com.google.intelligence.sense", 0);
            if ((((long) packageInfo.versionCode) < 100000 || ((long) packageInfo.versionCode) >= 2147483647L) && Settings.Secure.getInt(this.f398794c.getContentResolver(), "now_playing_in_device_personalization_services", 0) != 1) {
                Cursor query = this.f398794c.getContentResolver().query(f398792a, (String[]) null, (String) null, (String[]) null, (String) null);
                if (query != null && query.moveToFirst()) {
                    byte[] blob = query.getBlob(0);
                    query.close();
                    try {
                        return (C48038b) C62942bv.parseFrom((C62942bv) C48038b.f124349e, blob);
                    } catch (C62974ct e) {
                        Log.getStackTraceString(e);
                    }
                }
                return C48038b.f124349e;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        int i = Settings.Secure.getInt(this.f398794c.getContentResolver(), "now_playing_enabled", -1);
        if (i == -1) {
            return C48038b.f124349e;
        }
        boolean z2 = i == 1;
        boolean isSystemUser = this.f398793b.isSystemUser();
        C48033a aVar = (C48033a) C48038b.f124349e.createBuilder();
        boolean z3 = z2 && isSystemUser;
        aVar.copyOnWrite();
        C48038b bVar = (C48038b) aVar.instance;
        bVar.f124351a |= 2;
        bVar.f124353c = z3;
        boolean z4 = z2 && isSystemUser;
        aVar.copyOnWrite();
        C48038b bVar2 = (C48038b) aVar.instance;
        bVar2.f124351a |= 4;
        bVar2.f124354d = z4;
        if (z2 && (isSystemUser || this.f398793b.isDemoUser())) {
            z = true;
        }
        aVar.copyOnWrite();
        C48038b bVar3 = (C48038b) aVar.instance;
        bVar3.f124351a = 1 | bVar3.f124351a;
        bVar3.f124352b = z;
        return (C48038b) aVar.build();
    }
}
