package com.google.android.apps.search.googleapp.p10381r;

import androidx.preference.SwitchPreference;
import com.google.android.apps.search.googleapp.incognito.p10331h.p10332a.C136342d;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47713d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.r.g */
/* compiled from: PG */
public final class C137148g {

    /* renamed from: a */
    public static final C59071e f373189a = C59071e.m91332i("com.google.android.apps.search.googleapp.r.g");

    /* renamed from: b */
    public final C137144c f373190b;

    /* renamed from: c */
    public final C136342d f373191c;

    /* renamed from: d */
    public final C47713d f373192d;

    /* renamed from: e */
    public final C46801dp f373193e;

    /* renamed from: f */
    public final C46439e f373194f;

    /* renamed from: g */
    public final C137150b f373195g;

    /* renamed from: h */
    public final C139680b f373196h;

    /* renamed from: i */
    public final long f373197i;

    /* renamed from: com.google.android.apps.search.googleapp.r.g$a */
    /* compiled from: PG */
    public abstract class C137149a implements C47388b {
        /* renamed from: a */
        public abstract String mo113564a();
    }

    /* renamed from: com.google.android.apps.search.googleapp.r.g$b */
    /* compiled from: PG */
    final class C137150b implements C46440f {

        /* renamed from: a */
        private final C137144c f373198a;

        public C137150b(C137144c cVar) {
            this.f373198a = cVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C137148g.f373189a.mo56225c()).mo56382g(th)).mo56372aa(40713)).mo56386p("Failed to set biometrics preference.");
            SwitchPreference switchPreference = (SwitchPreference) this.f373198a.mo8411gg("biometrics_preference");
            switchPreference.getClass();
            switchPreference.mo8339F(true);
            switchPreference.mo8391j(!((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj2;
            SwitchPreference switchPreference = (SwitchPreference) this.f373198a.mo8411gg("biometrics_preference");
            switchPreference.getClass();
            switchPreference.mo8339F(true);
            switchPreference.mo8391j(((Boolean) obj).booleanValue());
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            SwitchPreference switchPreference = (SwitchPreference) this.f373198a.mo8411gg("biometrics_preference");
            switchPreference.getClass();
            switchPreference.mo8339F(false);
            switchPreference.mo8391j(((Boolean) obj).booleanValue());
        }
    }

    public C137148g(C137144c cVar, C46801dp dpVar, C47713d dVar, C46439e eVar, C136342d dVar2, C139680b bVar, long j) {
        this.f373190b = cVar;
        this.f373192d = dVar;
        this.f373193e = dpVar;
        this.f373194f = eVar;
        this.f373191c = dVar2;
        this.f373195g = new C137150b(cVar);
        this.f373197i = j;
        this.f373196h = bVar;
    }
}
