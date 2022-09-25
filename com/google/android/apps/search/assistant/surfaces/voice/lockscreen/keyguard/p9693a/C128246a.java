package com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9693a;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.C128245a;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.C128257b;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.authenticationactivity.AuthenticationActivity;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9694b.C128258a;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9695c.C128259a;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9695c.C128261c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129571aa;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a.a */
/* compiled from: PG */
public final class C128246a implements C128245a {

    /* renamed from: a */
    private static final C59071e f352756a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a.a");

    /* renamed from: b */
    private final Context f352757b;

    /* renamed from: c */
    private final C128257b f352758c;

    /* renamed from: d */
    private final C129571aa f352759d;

    /* renamed from: e */
    private final C128261c f352760e;

    public C128246a(Context context, C128261c cVar, C128257b bVar, C129571aa aaVar) {
        this.f352757b = context;
        this.f352760e = cVar;
        this.f352758c = bVar;
        this.f352759d = aaVar;
    }

    /* renamed from: a */
    public final C60870cx mo108383a(Intent intent) {
        if (this.f352758c.mo108384a(intent)) {
            return C60856cj.m92900i(C128258a.SUCCEEDED);
        }
        KeyguardManager keyguardManager = (KeyguardManager) this.f352757b.getSystemService("keyguard");
        if (keyguardManager == null) {
            ((C59052c) ((C59052c) f352756a.mo56226d()).mo56372aa(37827)).mo56386p("#unlockKeyguardForResult: KeyguardManager is null");
            return C60856cj.m92900i(C128258a.ERROR);
        } else if (!keyguardManager.isKeyguardLocked()) {
            ((C59052c) ((C59052c) f352756a.mo56226d()).mo56372aa(37825)).mo56386p("#handover: Keyguard has already been unlocked.");
            return C60856cj.m92900i(C128258a.SUCCEEDED);
        } else {
            int andIncrement = this.f352760e.f352796a.getAndIncrement();
            C60870cx a = C2169h.m6027a(new C128259a(this.f352760e, andIncrement));
            Intent intent2 = new Intent();
            intent2.setClass(this.f352757b, AuthenticationActivity.class).addFlags(268435456).putExtra("keyguard_request_code", andIncrement);
            this.f352759d.mo109110a();
            C47810es.m84979s(this.f352757b, intent2);
            return a;
        }
    }
}
