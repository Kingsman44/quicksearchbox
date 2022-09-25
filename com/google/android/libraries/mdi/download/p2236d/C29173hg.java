package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;

/* renamed from: com.google.android.libraries.mdi.download.d.hg */
/* compiled from: PG */
public final class C29173hg {
    /* renamed from: a */
    public static C29172hf m54127a(Context context, C29658ia iaVar) {
        int i = context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", C29172hf.NEW_FILE_KEY.f79119d);
        try {
            return C29172hf.m54126a(i);
        } catch (IllegalArgumentException e) {
            iaVar.mo34497a(e, "FileKey version metadata corrupted with unknown version: %d", Integer.valueOf(i));
            m54128b(context);
            return C29172hf.USE_CHECKSUM_ONLY;
        }
    }

    /* renamed from: b */
    public static void m54128b(Context context) {
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
    }

    /* renamed from: c */
    static boolean m54129c(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    /* renamed from: d */
    public static boolean m54130d(Context context, C29172hf hfVar) {
        C29045l.m53931c("%s: Setting FileKeyVersion to %s", "Migrations", hfVar.name());
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", hfVar.f79119d).commit();
    }

    /* renamed from: e */
    public static void m54131e(Context context) {
        C29045l.m53931c("%s: Setting migration to new file key to %s", "Migrations", true);
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }
}
