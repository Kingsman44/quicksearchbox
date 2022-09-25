package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131834f;
import com.google.android.apps.search.assistant.verticals.ambient.p9912d.C130591a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.m */
/* compiled from: PG */
public final class C130653m {

    /* renamed from: a */
    public static final C59071e f357800a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.feedback.m");

    /* renamed from: b */
    public final Context f357801b;

    /* renamed from: c */
    public final C130649i f357802c;

    /* renamed from: d */
    public final C46439e f357803d;

    /* renamed from: e */
    public final C38469m f357804e;

    /* renamed from: f */
    public final C131834f f357805f;

    /* renamed from: g */
    public final C21370a f357806g;

    /* renamed from: h */
    public final Optional f357807h;

    /* renamed from: i */
    public final Map f357808i = new HashMap();

    /* renamed from: j */
    public final C46440f f357809j;

    public C130653m(final Context context, final Activity activity, C130649i iVar, C46439e eVar, C38469m mVar, C131834f fVar, C130591a aVar, C21370a aVar2) {
        this.f357801b = context;
        this.f357802c = iVar;
        this.f357803d = eVar;
        this.f357804e = mVar;
        this.f357805f = fVar;
        this.f357807h = aVar.mo109737b();
        this.f357806g = aVar2;
        this.f357809j = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Void voidR = (Void) obj;
                ((C59052c) ((C59052c) ((C59052c) C130653m.f357800a.mo56226d()).mo56382g(th)).mo56372aa(38940)).mo56386p("logUserLocationFeedback failed.");
                Snackbar.m79661q((Context) null, activity.findViewById(16908290), context.getString(R.string.assistant_ambient_save_feedback_failure), -1).mo48343h();
                activity.finish();
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Void voidR = (Void) obj;
                Void voidR2 = (Void) obj2;
                Snackbar.m79661q((Context) null, activity.findViewById(16908290), context.getString(R.string.assistant_ambient_save_feedback_success), -1).mo48343h();
                activity.finish();
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
            }
        };
    }
}
