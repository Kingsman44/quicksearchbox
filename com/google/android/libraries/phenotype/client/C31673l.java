package com.google.android.libraries.phenotype.client;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.p10905k.C146606e;

/* renamed from: com.google.android.libraries.phenotype.client.l */
/* compiled from: PG */
final class C31673l implements C31670i {

    /* renamed from: a */
    public static C31673l f85182a;

    /* renamed from: b */
    public final Context f85183b;

    /* renamed from: c */
    private final ContentObserver f85184c;

    public C31673l() {
        this.f85183b = null;
        this.f85184c = null;
    }

    public C31673l(Context context) {
        this.f85183b = context;
        C31672k kVar = new C31672k();
        this.f85184c = kVar;
        context.getContentResolver().registerContentObserver(C146606e.f395966a, true, kVar);
    }

    /* renamed from: c */
    static synchronized void m59015c() {
        Context context;
        synchronized (C31673l.class) {
            C31673l lVar = f85182a;
            if (!(lVar == null || (context = lVar.f85183b) == null || lVar.f85184c == null)) {
                context.getContentResolver().unregisterContentObserver(f85182a.f85184c);
            }
            f85182a = null;
        }
    }

    /* renamed from: a */
    public final String mo37306b(String str) {
        Context context = this.f85183b;
        if (context != null && !C20674d.m38855d(context)) {
            try {
                return (String) C31668g.m59011a(new C31671j(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }
}
