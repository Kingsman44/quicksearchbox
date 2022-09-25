package com.google.android.apps.search.podcasts.widgets.feedback;

import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.monitoring.feedback.C47467e;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.monitoring.feedback.C47486w;
import com.google.apps.tiktok.monitoring.feedback.C47488y;
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class FeedbackHelper {

    /* renamed from: a */
    public static final C59071e f383465a = C59071e.m91331h();

    /* renamed from: b */
    public static final Uri f383466b = Uri.parse("https://support.google.com/websearch/?p=podcasts");

    /* renamed from: c */
    public final C47477n f383467c;

    /* renamed from: d */
    public final HelpAndFeedbackStarter f383468d;

    /* renamed from: e */
    public final C46439e f383469e;

    /* renamed from: f */
    public final C46440f f383470f = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Bundle bundle = (Bundle) obj;
            C59052c cVar = (C59052c) ((C59052c) FeedbackHelper.f383465a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41658));
            cVar.mo56386p("Unable to start help page");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            HelpAndFeedbackStarter helpAndFeedbackStarter = FeedbackHelper.this.f383468d;
            C47486w d = C47488y.m84500d();
            ((C47467e) d).f123263a = "podcast_help";
            d.mo51321b(FeedbackHelper.f383466b);
            helpAndFeedbackStarter.mo51298a(d.mo51320a(), C141248a.m229278a((String) obj2, (Bundle) obj));
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: g */
    public final C46440f f383471g = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Bundle bundle = (Bundle) obj;
            C59052c cVar = (C59052c) ((C59052c) FeedbackHelper.f383465a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41659));
            cVar.mo56386p("Unable to send feedback");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            FeedbackHelper.this.f383467c.mo51336a(C141248a.m229278a((String) obj2, (Bundle) obj));
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: h */
    private final C140790h f383472h;

    /* renamed from: i */
    private final Executor f383473i;

    /* renamed from: j */
    private final C2376g f383474j;

    public FeedbackHelper(C47477n nVar, HelpAndFeedbackStarter helpAndFeedbackStarter, C140790h hVar, Executor executor, C46439e eVar, Fragment fragment) {
        C69664n.m101061g(helpAndFeedbackStarter, "helpAndFeedbackStarter");
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(fragment, "fragment");
        this.f383467c = nVar;
        this.f383468d = helpAndFeedbackStarter;
        this.f383472h = hVar;
        this.f383473i = executor;
        this.f383469e = eVar;
        FeedbackHelper$lifecycleObserver$1 feedbackHelper$lifecycleObserver$1 = new FeedbackHelper$lifecycleObserver$1(this);
        this.f383474j = feedbackHelper$lifecycleObserver$1;
        C58838bb.m90883r(fragment.getLifecycle().mo5789a() == C2383n.INITIALIZED);
        fragment.getLifecycle().mo5790b(feedbackHelper$lifecycleObserver$1);
    }

    /* renamed from: a */
    public final C60870cx mo116263a() {
        return C47633f.m84733g(this.f383472h.mo115883e()).mo51515h(C141249b.f383478a, this.f383473i);
    }

    /* renamed from: b */
    public final void mo116264b(Map map) {
        Bundle bundle;
        C46439e eVar = this.f383469e;
        C46438d dVar = new C46438d(mo116263a());
        if (map != null) {
            bundle = new Bundle(map.size());
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        } else {
            bundle = null;
        }
        eVar.mo50445g(dVar, new C46436b(bundle), this.f383471g);
    }
}
