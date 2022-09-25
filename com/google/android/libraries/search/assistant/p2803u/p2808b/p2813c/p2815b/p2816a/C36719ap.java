package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.content.Context;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36680d;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b.C36683c;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.C36690a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ap */
/* compiled from: PG */
public final class C36719ap {

    /* renamed from: a */
    public static final C59071e f95666a = C59071e.m91332i("com.google.android.libraries.search.assistant.u.b.c.b.a.ap");

    /* renamed from: b */
    public final Context f95667b;

    /* renamed from: c */
    public final C47770dh f95668c;

    /* renamed from: d */
    public final C36713aj f95669d;

    /* renamed from: e */
    public final C46439e f95670e;

    /* renamed from: f */
    public final C47449e f95671f;

    /* renamed from: g */
    public final C28306ab f95672g;

    /* renamed from: h */
    public final C28310af f95673h;

    /* renamed from: i */
    public final C28443m f95674i;

    /* renamed from: j */
    public final C36715al f95675j;

    /* renamed from: k */
    public final C37215b f95676k;

    /* renamed from: l */
    public final C36721b f95677l = new C36721b();

    /* renamed from: m */
    public final C36722c f95678m = new C36722c();

    /* renamed from: n */
    public final C36720a f95679n = new C36720a();

    /* renamed from: o */
    private final C36690a f95680o;

    /* renamed from: p */
    private final C36680d f95681p;

    /* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ap$a */
    /* compiled from: PG */
    final class C36720a implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C36719ap.f95666a.mo56226d()).mo56382g(th)).mo56372aa(51580)).mo56386p("Failed to record consent status for UDC screen");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ap$b */
    /* compiled from: PG */
    final class C36721b implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C36719ap.f95666a.mo56226d()).mo56382g(th)).mo56372aa(51582)).mo56386p("Failed to update assistant server settings for UDC consent");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ap$c */
    /* compiled from: PG */
    final class C36722c implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C36719ap.f95666a.mo56226d()).mo56382g(th)).mo56372aa(51584)).mo56386p("Failed to update screen interaction count in protodatastore");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C36719ap(C36715al alVar, C36713aj ajVar, C47770dh dhVar, C46439e eVar, C28306ab abVar, C28310af afVar, C28443m mVar, C37215b bVar, C47449e eVar2, C36690a aVar, C36680d dVar) {
        this.f95667b = alVar.getContext();
        this.f95669d = ajVar;
        this.f95668c = dhVar;
        this.f95675j = alVar;
        this.f95670e = eVar;
        this.f95671f = eVar2;
        this.f95676k = bVar;
        this.f95672g = abVar;
        this.f95673h = afVar;
        this.f95674i = mVar;
        this.f95680o = aVar;
        this.f95681p = dVar;
    }

    /* renamed from: a */
    public final void mo40354a(boolean z) {
        if (z) {
            C46439e eVar = this.f95670e;
            C36690a aVar = this.f95680o;
            C36724ar arVar = this.f95669d.f95654f;
            if (arVar == null) {
                arVar = C36724ar.f95682d;
            }
            C46438d b = C46438d.m82810b(aVar.mo40334c(arVar));
            eVar.mo50428h(b.f121541a, (Object) null, this.f95677l);
        }
        C60870cx b2 = this.f95680o.mo40333b(z);
        C46439e eVar2 = this.f95670e;
        C46438d b3 = C46438d.m82810b(b2);
        eVar2.mo50428h(b3.f121541a, (Object) null, this.f95679n);
        C60870cx b4 = this.f95681p.mo40316b("udc_consent_screen_interaction_count_key");
        C46439e eVar3 = this.f95670e;
        C46438d b5 = C46438d.m82810b(b4);
        eVar3.mo50428h(b5.f121541a, (Object) null, this.f95678m);
        C47393f.m84236g(C36683c.m65275c(3), this.f95675j);
    }
}
