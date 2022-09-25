package com.google.android.apps.gsa.assistant.settings.p526e.p528b;

import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.b.j */
/* compiled from: PG */
public final /* synthetic */ class C9747j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C9749l f33651a;

    /* renamed from: b */
    public final /* synthetic */ String f33652b;

    /* renamed from: c */
    public final /* synthetic */ Intent f33653c;

    public /* synthetic */ C9747j(C9749l lVar, String str, Intent intent) {
        this.f33651a = lVar;
        this.f33652b = str;
        this.f33653c = intent;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C9749l lVar = this.f33651a;
        String str = this.f33652b;
        Intent intent = this.f33653c;
        lVar.f33656a.mo83611a(str, (Bitmap) obj, intent);
        lVar.f33657b.mo18014a(String.format("%s.onStartActivityViaIntentUri('%s')", new Object[]{"homescreenShortcutInterface", str}));
    }
}
