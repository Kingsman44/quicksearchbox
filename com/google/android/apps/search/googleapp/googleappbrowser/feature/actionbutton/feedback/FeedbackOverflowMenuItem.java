package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.feedback;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.googleappbrowser.p10261b.C135507d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136011a;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.p3348b.C43251d;
import com.google.android.libraries.web.contrib.debug.C43474f;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.android.libraries.web.coordinator.internal.fragment.C43756o;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class FeedbackOverflowMenuItem implements C43541a {

    /* renamed from: a */
    public static final C59071e f369597a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.feedback.FeedbackOverflowMenuItem");

    /* renamed from: b */
    public final C46440f f369598b = new C135688a();

    /* renamed from: c */
    private final C136011a f369599c;

    /* renamed from: d */
    private final C47477n f369600d;

    /* renamed from: e */
    private final Context f369601e;

    /* renamed from: f */
    private final Fragment f369602f;

    /* renamed from: g */
    private final C46439e f369603g;

    /* renamed from: h */
    private final C135692d f369604h;

    /* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.feedback.FeedbackOverflowMenuItem$a */
    /* compiled from: PG */
    final class C135688a implements C46440f {
        public C135688a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) FeedbackOverflowMenuItem.f369597a.mo56226d()).mo56382g(th)).mo56372aa(40590)).mo56386p("Error acquiring screenshot");
            FeedbackOverflowMenuItem.this.mo112471f((Bitmap) null);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            FeedbackOverflowMenuItem.this.mo112471f((Bitmap) obj2);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public FeedbackOverflowMenuItem(C136011a aVar, C47477n nVar, Fragment fragment, Context context, final C46439e eVar, C135692d dVar) {
        this.f369599c = aVar;
        this.f369600d = nVar;
        this.f369601e = context;
        this.f369602f = fragment;
        this.f369603g = eVar;
        this.f369604h = dVar;
        fragment.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final void mo3520gV(C2391v vVar) {
                eVar.mo50429i(FeedbackOverflowMenuItem.this.f369598b);
            }

            /* renamed from: gW */
            public final /* synthetic */ void mo3521gW(C2391v vVar) {
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }

    /* renamed from: a */
    public final int mo46594a() {
        return R.id.googleapp_browser_actionbutton_feedback;
    }

    /* renamed from: b */
    public final int mo46595b() {
        return 90171;
    }

    /* renamed from: c */
    public final CharSequence mo46596c() {
        return this.f369601e.getResources().getString(R.string.gab_actionbutton_feedback);
    }

    /* renamed from: d */
    public final void mo46597d() {
        C46439e eVar = this.f369603g;
        C135692d dVar = this.f369604h;
        View view = C43756o.m77265a(((C43251d) dVar.f369615b).f113024a).f114092a.getView();
        C60870cx b = view != null ? dVar.f369614a.mo46653b(view.getRootView()) : null;
        if (b == null) {
            b = C60856cj.m92899h(new IllegalStateException("No View attached to root Fragment"));
        }
        eVar.mo50428h(new C46438d(b).f121541a, (Object) null, this.f369598b);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo46598e() {
        return true;
    }

    /* renamed from: f */
    public final void mo112471f(Bitmap bitmap) {
        C47477n nVar = this.f369600d;
        C136011a aVar = this.f369599c;
        C47474k g = C47475l.m84477g();
        C47465c cVar = (C47465c) g;
        cVar.f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
        g.mo51310d(true);
        cVar.f123252d = true != C133933a.m217248a(aVar.f370419a) ? 2 : 3;
        C46663a aVar2 = new C46663a();
        aVar2.mo50686d(C46667e.KEY_VALUE);
        aVar2.f121916a = C63088z.m96143E(true != aVar.f370420b ? "Yes" : "Dogfood");
        aVar2.mo50684b(false);
        g.mo51333f("From Google App Browser", aVar2.mo50683a());
        g.mo51333f("google_app_browser", aVar.f370421c.mo46556a(C43474f.GOOGLE_APP_BROWSER));
        if (bitmap != null) {
            cVar.f123251c = C58833ax.m90834k(bitmap);
        }
        C47475l e = g.mo51332e();
        C69664n.m101060f(e, "feedbackOptionsBuilder.build()");
        nVar.mo51336a(e);
        C47393f.m84236g(new C135507d(), this.f369602f);
    }
}
