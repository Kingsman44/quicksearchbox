package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128565a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128830e;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9759d.p9760a.C128848e;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9761e.C128849a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9772j.C128932a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.l */
/* compiled from: PG */
public final class C128914l {

    /* renamed from: a */
    public static final C59071e f354267a = C59071e.m91331h();

    /* renamed from: b */
    public static final Duration f354268b = Duration.ofMillis(100);

    /* renamed from: c */
    public static final Duration f354269c = Duration.ofMillis(300);

    /* renamed from: d */
    public static final Duration f354270d = Duration.ofMillis(150);

    /* renamed from: e */
    public final AccountId f354271e;

    /* renamed from: f */
    public final C128911i f354272f;

    /* renamed from: g */
    public final C46855i f354273g;

    /* renamed from: h */
    public final C128849a f354274h;

    /* renamed from: i */
    public final C128830e f354275i;

    /* renamed from: j */
    public final C129024a f354276j;

    /* renamed from: k */
    public final C46439e f354277k;

    /* renamed from: l */
    public final C128932a f354278l;

    /* renamed from: m */
    public final C147783f f354279m;

    /* renamed from: n */
    public final C128848e f354280n;

    /* renamed from: o */
    private final int f354281o;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.l$a */
    /* compiled from: PG */
    final class C128915a implements C46440f {

        /* renamed from: a */
        public static final C128915a f354282a = new C128915a();

        private C128915a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C128914l.f354267a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(38047));
            cVar.mo56386p("dismissPlate onFailure");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C59071e eVar = C128914l.f354267a;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C128914l(AccountId accountId, C128911i iVar, C46855i iVar2, C128849a aVar, C128848e eVar, C128830e eVar2, C129024a aVar2, C46439e eVar3, C147783f fVar, C128932a aVar3) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(iVar2, "localSubscriptionMixin");
        C69664n.m101061g(aVar, "voicePlateDataService");
        C69664n.m101061g(eVar2, "dataServiceConnection");
        C69664n.m101061g(eVar3, "mixin");
        this.f354271e = accountId;
        this.f354272f = iVar;
        this.f354273g = iVar2;
        this.f354274h = aVar;
        this.f354280n = eVar;
        this.f354275i = eVar2;
        this.f354276j = aVar2;
        this.f354277k = eVar3;
        this.f354279m = fVar;
        this.f354278l = aVar3;
        this.f354281o = iVar.requireContext().getResources().getDimensionPixelOffset(R.dimen.assistant_voice_plate_navbar_threshold);
    }

    /* renamed from: a */
    public final int mo108752a(C128565a aVar) {
        int i = C128567c.m209819b(aVar.f353517a).f5824e;
        if (this.f354281o < i) {
            return i;
        }
        return 0;
    }
}
