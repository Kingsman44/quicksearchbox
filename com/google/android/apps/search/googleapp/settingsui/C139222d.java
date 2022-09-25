package com.google.android.apps.search.googleapp.settingsui;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139878n;
import com.google.android.apps.search.googleapp.settingsui.selectedpreference.SelectablePreferenceFactory;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47712c;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47713d;
import java.util.Map;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69682a;
import p5462h.p5478h.C69684c;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.d */
/* compiled from: PG */
public final class C139222d implements C139878n {

    /* renamed from: a */
    static final /* synthetic */ C69713k[] f378652a;

    /* renamed from: b */
    public final C46439e f378653b;

    /* renamed from: c */
    public final C46801dp f378654c;

    /* renamed from: d */
    public final C28443m f378655d;

    /* renamed from: e */
    public final C139858a f378656e;

    /* renamed from: f */
    public final C69684c f378657f = new C69682a();

    /* renamed from: g */
    public final C46792di f378658g = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, "throwable");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C139222d.this.f378662k.mo8339F(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: h */
    public final C46792di f378659h = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, "throwable");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C139222d.this.f378662k.mo8348O(((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: i */
    public final C46792di f378660i = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, "throwable");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            String str = (String) obj;
            C69664n.m101061g(str, "value");
            C139222d.this.f378662k.mo8329n(str);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: j */
    public final C46440f f378661j = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C139222d.this.f378662k.mo8339F(true);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C139222d.this.f378662k.mo8339F(true);
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
            C139222d.this.f378662k.mo8339F(false);
        }
    };

    /* renamed from: k */
    public final Preference f378662k;

    /* renamed from: l */
    private final Context f378663l;

    /* renamed from: m */
    private final String f378664m;

    /* renamed from: n */
    private final C47713d f378665n;

    /* renamed from: o */
    private final SelectablePreferenceFactory f378666o;

    /* renamed from: p */
    private final C139873i f378667p;

    static {
        C69669s sVar = new C69669s(C139222d.class, "preferenceVe", "getPreferenceVe()Lcom/google/android/libraries/logging/ve/ClientVisualElement;");
        int i = C69649af.f186028a;
        f378652a = new C69713k[]{sVar};
    }

    public C139222d(Context context, String str, C46439e eVar, C46801dp dpVar, C47713d dVar, C28443m mVar, Map map, SelectablePreferenceFactory selectablePreferenceFactory) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(map, "settingUiElements");
        this.f378663l = context;
        this.f378664m = str;
        this.f378653b = eVar;
        this.f378654c = dpVar;
        this.f378665n = dVar;
        this.f378655d = mVar;
        this.f378666o = selectablePreferenceFactory;
        C139873i a = C139873i.m227462a(str);
        this.f378667p = a;
        Object obj = map.get(a);
        C69664n.m101059e(obj, "null cannot be cast to non-null type com.google.android.apps.search.googleapp.settings.ActionSettingUiElement");
        C139858a aVar = (C139858a) obj;
        this.f378656e = aVar;
        Preference a2 = selectablePreferenceFactory.mo114855a(context, a);
        if (aVar instanceof C139869e) {
            a2.mo8339F(false);
        }
        if (aVar instanceof C139871g) {
            a2.mo8348O(false);
        }
        a2.f12751w = false;
        if (aVar.mo111854b() != -1) {
            a2.mo8340G(aVar.mo111854b());
        }
        a2.mo8343J(str);
        a2.mo8347N(aVar.mo111460j());
        a2.mo8329n(aVar.mo111457g());
        a2.mo8342I(false);
        a2.f12743o = new C47712c(dVar, "Action setting clicked", new C139204c(this));
        this.f378662k = a2;
    }

    /* renamed from: a */
    public final Preference mo112667a() {
        return this.f378662k;
    }

    /* renamed from: b */
    public final void mo112668b(C28439i iVar) {
        C69664n.m101061g(iVar, "ve");
        this.f378657f.mo42045b(f378652a[0], iVar);
    }
}
