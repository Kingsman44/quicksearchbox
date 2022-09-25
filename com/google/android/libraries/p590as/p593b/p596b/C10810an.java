package com.google.android.libraries.p590as.p593b.p596b;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p590as.p609c.p610a.C10966b;
import com.google.android.libraries.p590as.p609c.p610a.C10967c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.as.b.b.an */
/* compiled from: PG */
final class C10810an implements C60845bz {

    /* renamed from: a */
    private final Context f35843a;

    /* renamed from: b */
    private final String f35844b;

    /* renamed from: c */
    private final int f35845c;

    public C10810an(Context context, String str, int i) {
        this.f35843a = context;
        this.f35844b = str;
        this.f35845c = i;
    }

    /* renamed from: c */
    private final void m25839c(int i) {
        Intent intent = new Intent("com.google.recognition.action.LANGUAGE_DOWNLOAD_COMPLETE");
        C10966b bVar = (C10966b) C10967c.f36090c.createBuilder();
        bVar.copyOnWrite();
        C10967c cVar = (C10967c) bVar.instance;
        cVar.f36093b = i - 1;
        cVar.f36092a |= 1;
        this.f35843a.sendBroadcast(intent.putExtra("com.google.recognition.extra.LANGUAGE_DOWNLOAD_RESULT", ((C10967c) bVar.build()).toByteArray()).putExtra("android.speech.extra.LANGUAGE", this.f35844b));
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C10812ap.f35848a.mo56225c()).mo56382g(th)).mo56372aa(53960)).mo56352E("LanguagePack [%s %d] download threw error.", this.f35844b, this.f35845c);
        m25839c(3);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C10882h hVar = (C10882h) obj;
        ((C58970a) ((C58970a) C10812ap.f35848a.mo56224b()).mo56372aa(53961)).mo56352E("LanguagePack [%s %d] completely downloaded.", this.f35844b, this.f35845c);
        m25839c(2);
    }
}
