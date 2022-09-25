package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.libraries.phenotype.client.C31658an;

/* renamed from: com.google.android.gms.phenotype.af */
/* compiled from: PG */
public final class C145722af extends C145721ae {

    /* renamed from: c */
    private final SharedPreferences f394050c;

    public C145722af(C145748z zVar, String str, SharedPreferences sharedPreferences) {
        super(zVar, str);
        this.f394050c = sharedPreferences;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo121882a() {
        return this.f394050c.getString("__phenotype_snapshot_token", (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo121885d(Configurations configurations) {
        SharedPreferences.Editor edit = this.f394050c.edit();
        if (!configurations.f393985f) {
            edit.clear();
        }
        boolean z = false;
        for (Configuration configuration : configurations.f393983d) {
            if (configuration != null) {
                for (String remove : configuration.f393978c) {
                    edit.remove(remove);
                }
                for (Flag flag : configuration.f393977b) {
                    int i = flag.f394009g;
                    if (i == 1) {
                        edit.putLong(flag.f394003a, flag.mo121837b());
                    } else if (i == 2) {
                        edit.putBoolean(flag.f394003a, flag.mo121841e());
                    } else if (i == 3) {
                        edit.putFloat(flag.f394003a, (float) flag.mo121836a());
                    } else if (i == 4) {
                        edit.putString(flag.f394003a, flag.mo121838c());
                    } else if (i == 5) {
                        edit.putString(flag.f394003a, Base64.encodeToString(flag.mo121843f(), 3));
                    }
                }
            }
        }
        edit.putString("__phenotype_server_token", configurations.f393982c);
        edit.putLong("__phenotype_configuration_version", configurations.f393986g);
        edit.putString("__phenotype_snapshot_token", configurations.f393980a);
        if (!edit.commit()) {
            Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        } else {
            z = true;
        }
        C31658an.m58998c();
        return z;
    }
}
