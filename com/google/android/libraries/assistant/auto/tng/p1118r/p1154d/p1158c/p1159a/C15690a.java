package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1158c.p1159a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1158c.C15689a;
import com.google.apps.tiktok.p3674l.p3676b.C47372c;
import com.google.apps.tiktok.p3674l.p3676b.C47379j;
import com.google.apps.tiktok.p3674l.p3676b.C47380k;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.c.a.a */
/* compiled from: PG */
public final class C15690a implements C47372c {

    /* renamed from: a */
    private final Context f46825a;

    public C15690a(Context context) {
        this.f46825a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C47380k mo20458a(Throwable th) {
        C15689a aVar = (C15689a) th;
        if (aVar == null || aVar.getMessage() == null || !aVar.getMessage().equals("Could not locate a Language Pack.")) {
            C47379j jVar = new C47379j();
            jVar.f123102a.f123107d = R.string.default_error;
            jVar.f123102a.f123104a = this.f46825a.getString(R.string.default_error);
            return jVar.mo51244a();
        }
        C47379j jVar2 = new C47379j();
        jVar2.f123102a.f123107d = R.string.no_offline_language_pack;
        jVar2.f123102a.f123104a = this.f46825a.getString(R.string.no_offline_language_pack);
        return jVar2.mo51244a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20459b(Throwable th) {
        C15689a aVar = (C15689a) th;
        return true;
    }
}
