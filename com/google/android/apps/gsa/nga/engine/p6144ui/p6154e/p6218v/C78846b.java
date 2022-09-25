package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6218v;

import com.evernote.android.state.BuildConfig;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.v.b */
/* compiled from: PG */
public abstract class C78846b {

    /* renamed from: b */
    public static final C78846b f216998b = m126666c(BuildConfig.FLAVOR);

    /* renamed from: c */
    public static C78846b m126666c(String str) {
        String trim = str.trim();
        if (!trim.isEmpty() && Character.isLowerCase(trim.charAt(0))) {
            trim = String.valueOf(trim.substring(0, 1).toUpperCase(Locale.US)).concat(String.valueOf(trim.substring(1)));
        }
        return new C78840a(trim, 2);
    }

    /* renamed from: a */
    public abstract String mo73642a();

    /* renamed from: b */
    public abstract int mo73643b();

    /* renamed from: d */
    public final boolean mo73650d() {
        if (mo73642a().isEmpty()) {
            return false;
        }
        int b = mo73643b();
        if (b == 0) {
            throw null;
        } else if (b == 1) {
            return true;
        } else {
            return false;
        }
    }
}
