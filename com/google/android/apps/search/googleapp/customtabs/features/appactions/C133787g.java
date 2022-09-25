package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import android.app.Activity;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.g */
/* compiled from: PG */
public final class C133787g {

    /* renamed from: a */
    public static final C59071e f364415a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.appactions.g");

    /* renamed from: b */
    public final Activity f364416b;

    /* renamed from: c */
    public final C133786f f364417c;

    /* renamed from: d */
    public final C46439e f364418d;

    /* renamed from: e */
    public final C133806y f364419e;

    /* renamed from: f */
    public final C136247a f364420f;

    /* renamed from: g */
    public final C46440f f364421g = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C133787g.f364415a.mo56226d()).mo56382g(th)).mo56372aa(40130)).mo56386p("Error occurred while executing suggestion.");
            Activity activity = C133787g.this.f364416b;
            C58893dc.m90996a(activity);
            activity.finish();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            if (!((Boolean) obj2).booleanValue()) {
                ((C59052c) ((C59052c) C133787g.f364415a.mo56226d()).mo56372aa(40131)).mo56386p("Error occurred while executing suggestion.");
            }
            Activity activity = C133787g.this.f364416b;
            C58893dc.m90996a(activity);
            activity.finish();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    public C133787g(Activity activity, C133786f fVar, C46439e eVar, C133806y yVar, C136247a aVar, IncognitoLifecycleObserver incognitoLifecycleObserver) {
        this.f364416b = activity;
        this.f364417c = fVar;
        this.f364418d = eVar;
        this.f364419e = yVar;
        this.f364420f = aVar;
        incognitoLifecycleObserver.mo112948g();
    }
}
