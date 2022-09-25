package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f;

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
import com.google.assistant.p3897e.p3917i.p3918a.C51387fv;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.o */
/* compiled from: PG */
public final class C129252o {

    /* renamed from: a */
    public static final C59071e f355025a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.o");

    /* renamed from: b */
    public final C129244g f355026b;

    /* renamed from: c */
    public final C52003hb f355027c;

    /* renamed from: d */
    public final C51387fv f355028d;

    /* renamed from: e */
    public final Optional f355029e;

    /* renamed from: f */
    public final C46801dp f355030f;

    /* renamed from: g */
    public final C46175b f355031g;

    /* renamed from: h */
    public final AccountId f355032h;

    /* renamed from: i */
    public final C47449e f355033i;

    /* renamed from: j */
    public final C46439e f355034j;

    /* renamed from: k */
    public final C126879a f355035k;

    /* renamed from: l */
    public final C46792di f355036l = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C129252o.f355025a.mo56225c()).mo56382g(th)).mo56372aa(38236)).mo56386p("Unable to load accounts");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C46215j jVar = (C46215j) obj;
            if (jVar.f121161f.equals("i.am.a.monkey.FixedAccount@monkeyseemonkeydo.com")) {
                C129244g gVar = C129252o.this.f355026b;
                gVar.getClass();
                ImageView a = C129252o.m211030a(gVar);
                a.getClass();
                a.setImageBitmap(Bitmap.createBitmap(48, 48, Bitmap.Config.ARGB_8888));
                return;
            }
            C47449e eVar = C129252o.this.f355033i;
            eVar.getClass();
            C46336b bVar = new C46336b(jVar);
            C129244g gVar2 = C129252o.this.f355026b;
            gVar2.getClass();
            ImageView a2 = C129252o.m211030a(gVar2);
            a2.getClass();
            ((C6007z) ((C6007z) eVar.mo51286a().mo11872j(bVar).mo11982o(C5593j.m14518b()).mo11963P(R.drawable.product_logo_avatar_anonymous_color_36)).mo11952E(R.drawable.product_logo_avatar_anonymous_color_36)).mo12454r(a2);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: m */
    public final C46440f f355037m = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C129252o.f355025a.mo56225c()).mo56382g(th)).mo56372aa(38237)).mo56386p("TextContentFragment Profile Icon: start AssistantSettingsIntent Activity failed.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
        }
    };

    public C129252o(C129244g gVar, C129246i iVar, Optional optional, C46801dp dpVar, C46175b bVar, AccountId accountId, C47449e eVar, C46439e eVar2, C126879a aVar) {
        this.f355026b = gVar;
        C52003hb hbVar = iVar.f355018b;
        this.f355027c = hbVar == null ? C52003hb.f136476i : hbVar;
        C51387fv fvVar = iVar.f355019c;
        this.f355028d = fvVar == null ? C51387fv.f133828e : fvVar;
        this.f355029e = optional;
        this.f355030f = dpVar;
        this.f355031g = bVar;
        this.f355032h = accountId;
        this.f355033i = eVar;
        this.f355034j = eVar2;
        this.f355035k = aVar;
    }

    /* renamed from: a */
    public static ImageView m211030a(C129244g gVar) {
        return (ImageView) gVar.requireView().findViewById(R.id.assistant_google_bubble_profile_icon);
    }

    /* renamed from: b */
    public final void mo108932b(boolean z) {
        this.f355026b.requireView().findViewById(R.id.assistant_google_bubble_logo).setVisibility(true != z ? 8 : 0);
    }

    /* renamed from: c */
    public final void mo108933c(boolean z) {
        this.f355026b.requireView().findViewById(R.id.assistant_google_bubble_profile_icon).setVisibility(true != z ? 8 : 0);
    }
}
