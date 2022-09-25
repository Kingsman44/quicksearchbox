package com.google.android.apps.search.googleapp.accounts.p10126ui.features.help;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134279k;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.search.p10410f.C137446v;
import com.google.android.apps.search.googleapp.search.p10410f.C137447w;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.web.contrib.debug.C43473e;
import com.google.android.libraries.web.contrib.debug.C43474f;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47486w;
import com.google.apps.tiktok.monitoring.feedback.C47488y;
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.help.k */
/* compiled from: PG */
public final class C133314k {

    /* renamed from: a */
    public static final C59071e f363275a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.features.help.k");

    /* renamed from: b */
    public final C136247a f363276b;

    /* renamed from: c */
    public final C133311h f363277c;

    /* renamed from: d */
    public final C28310af f363278d;

    /* renamed from: e */
    public final C28306ab f363279e;

    /* renamed from: f */
    public final C46439e f363280f;

    /* renamed from: g */
    public final C46440f f363281g = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C133314k.f363275a.mo56226d()).mo56382g(th)).mo56372aa(40030)).mo56386p("Error loading screenshot");
            C133314k.this.mo111074a((Bitmap) null);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C133314k.this.mo111074a((Bitmap) obj2);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: h */
    private final C134279k f363282h;

    /* renamed from: i */
    private final HelpAndFeedbackStarter f363283i;

    /* renamed from: j */
    private final C137447w f363284j;

    /* renamed from: k */
    private final C43473e f363285k;

    public C133314k(C136247a aVar, C134279k kVar, C46439e eVar, IncognitoLifecycleObserver incognitoLifecycleObserver, C133311h hVar, HelpAndFeedbackStarter helpAndFeedbackStarter, C137447w wVar, C43473e eVar2, C28310af afVar, C28306ab abVar) {
        this.f363276b = aVar;
        this.f363282h = kVar;
        this.f363280f = eVar;
        this.f363277c = hVar;
        this.f363283i = helpAndFeedbackStarter;
        this.f363284j = wVar;
        this.f363285k = eVar2;
        this.f363278d = afVar;
        this.f363279e = abVar;
        incognitoLifecycleObserver.mo112948g();
    }

    /* renamed from: a */
    public final void mo111074a(Bitmap bitmap) {
        HelpAndFeedbackStarter helpAndFeedbackStarter = this.f363283i;
        C47486w d = C47488y.m84500d();
        d.mo51321b(Uri.parse("https://support.google.com/websearch/topic/4409793"));
        C47488y a = d.mo51320a();
        C47474k g = C47475l.m84477g();
        C47465c cVar = (C47465c) g;
        cVar.f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
        g.mo51308b().mo55429h("google_app_discover", this.f363282h.mo111673b(false));
        C137447w wVar = this.f363284j;
        g.mo51308b().mo55429h("google_app_search", C71663i.m104688a(C71803m.m105042c(wVar.f373843c, (C69585o) null, (C71424ay) null, new C137446v(wVar, (C69577g) null), 3)));
        g.mo51333f("google_app_browser", this.f363285k.mo46556a(C43474f.GOOGLE_APP_BROWSER));
        if (bitmap != null) {
            g.mo51310d(true);
            cVar.f123251c = C58833ax.m90834k(bitmap);
        }
        helpAndFeedbackStarter.mo51298a(a, g.mo51332e());
    }
}
