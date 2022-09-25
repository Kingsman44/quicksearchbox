package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.p9808a;

import android.app.KeyguardManager;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.p3616e.p3618b.C46336b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.a.c */
/* compiled from: PG */
public final class C129289c {

    /* renamed from: a */
    public static final C59071e f355105a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.a.c");

    /* renamed from: b */
    public final C129288b f355106b;

    /* renamed from: c */
    public final C46175b f355107c;

    /* renamed from: d */
    public final C46801dp f355108d;

    /* renamed from: e */
    public final C47449e f355109e;

    /* renamed from: f */
    public final AccountId f355110f;

    /* renamed from: g */
    public final C126879a f355111g;

    /* renamed from: h */
    public final C46439e f355112h;

    /* renamed from: i */
    public final KeyguardManager f355113i;

    /* renamed from: j */
    public final C46440f f355114j = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x c = C129289c.f355105a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AssistantHeader");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(38251)).mo56386p("AssistantHeader: start AssistantSettingsIntent Activity failed.");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C58976aa aaVar = C58975e.f156826a;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
            C58976aa aaVar = C58975e.f156826a;
        }
    };

    /* renamed from: k */
    public final C46792di f355115k = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59104x c = C129289c.f355105a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AssistantHeader");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(38254)).mo56386p("Unable to load accounts");
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C46215j jVar = (C46215j) obj;
            C58976aa aaVar = C58975e.f156826a;
            KeyguardManager keyguardManager = C129289c.this.f355113i;
            keyguardManager.getClass();
            if (keyguardManager.isDeviceLocked()) {
                C129288b bVar = C129289c.this.f355106b;
                bVar.getClass();
                C129289c.m211095a(bVar).setImageResource(R.drawable.product_logo_avatar_anonymous_color_36);
            } else if (jVar.f121161f.equals("i.am.a.monkey.FixedAccount@monkeyseemonkeydo.com")) {
                C129288b bVar2 = C129289c.this.f355106b;
                bVar2.getClass();
                C129289c.m211095a(bVar2).setImageBitmap(Bitmap.createBitmap(48, 48, Bitmap.Config.RGB_565));
            } else {
                C47449e eVar = C129289c.this.f355109e;
                eVar.getClass();
                C46336b bVar3 = new C46336b(jVar);
                C129288b bVar4 = C129289c.this.f355106b;
                bVar4.getClass();
                ((C6007z) ((C6007z) eVar.mo51286a().mo11872j(bVar3).mo11982o(C5593j.m14518b()).mo11963P(R.drawable.product_logo_avatar_anonymous_color_36)).mo11952E(R.drawable.product_logo_avatar_anonymous_color_36)).mo12454r(C129289c.m211095a(bVar4));
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    public C129289c(C129288b bVar, C46175b bVar2, C46801dp dpVar, C47449e eVar, C126879a aVar, C46439e eVar2, KeyguardManager keyguardManager, AccountId accountId) {
        this.f355106b = bVar;
        this.f355107c = bVar2;
        this.f355108d = dpVar;
        this.f355109e = eVar;
        this.f355110f = accountId;
        this.f355111g = aVar;
        this.f355112h = eVar2;
        this.f355113i = keyguardManager;
    }

    /* renamed from: a */
    public static ImageView m211095a(C129288b bVar) {
        return (ImageView) bVar.requireView().findViewById(R.id.assistant_header_profile_icon);
    }
}
