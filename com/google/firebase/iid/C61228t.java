package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.content.C1877c;
import androidx.p060c.C0977g;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.t */
/* compiled from: PG */
final class C61228t {

    /* renamed from: a */
    final SharedPreferences f165620a;

    /* renamed from: b */
    final Context f165621b;

    /* renamed from: c */
    private final Map f165622c = new C0977g();

    public C61228t(Context context) {
        this.f165621b = context;
        this.f165620a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(C1877c.m5127c(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo57798d()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    mo57796b();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
                }
            }
        }
    }

    /* renamed from: f */
    private static final String m93624f(String str, String str2, String str3) {
        return str + "|T|" + str2 + "|" + str3;
    }

    /* renamed from: a */
    public final synchronized C61227s mo57795a(String str, String str2, String str3) {
        return C61227s.m93622a(this.f165620a.getString(m93624f(str, str2, str3), (String) null));
    }

    /* renamed from: b */
    public final synchronized void mo57796b() {
        this.f165622c.clear();
        this.f165620a.edit().clear().commit();
    }

    /* renamed from: c */
    public final synchronized void mo57797c(String str, String str2, String str3, String str4, String str5) {
        String b = C61227s.m93623b(str4, str5, System.currentTimeMillis());
        if (b != null) {
            SharedPreferences.Editor edit = this.f165620a.edit();
            edit.putString(m93624f(str, str2, str3), b);
            edit.commit();
        }
    }

    /* renamed from: d */
    public final synchronized boolean mo57798d() {
        return this.f165620a.getAll().isEmpty();
    }

    /* renamed from: e */
    public final synchronized void mo57799e(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f165620a.contains(str.concat("|S|cre"))) {
            SharedPreferences.Editor edit = this.f165620a.edit();
            edit.putString(str.concat("|S|cre"), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            String string = this.f165620a.getString(str.concat("|S|cre"), (String) null);
            if (string != null) {
                try {
                    currentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
            currentTimeMillis = 0;
        }
        this.f165622c.put(str, Long.valueOf(currentTimeMillis));
    }
}
