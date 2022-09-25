package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.libraries.lens.sdk.intent.C24942d;
import com.google.android.libraries.lens.sdk.intent.C24943e;
import com.google.android.libraries.lens.sdk.intent.C24945g;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62471cu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.b.b */
/* compiled from: PG */
public final class C129423b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Context f355369a;

    /* renamed from: b */
    final /* synthetic */ C126879a f355370b;

    public C129423b(Context context, C126879a aVar) {
        this.f355369a = context;
        this.f355370b = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C129425d.f355372a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(38549));
        cVar.mo56386p("Failed to retrieve bitmap");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C69664n.m101061g(bitmap, "bitmap");
        C24943e eVar = new C24943e();
        eVar.f68071a.putByteArray("lens_init_params", C62471cu.f168676c.toByteArray());
        eVar.mo30178n(SystemClock.elapsedRealtimeNanos());
        eVar.f68071a.putLong("start_streaming_time_nanos", 0);
        eVar.mo30179o();
        eVar.mo30173i(C62433bj.UNKNOWN.f168594ao);
        eVar.f68071a.putInt("theme", 0);
        eVar.f68071a.putLong("handover_session_id", 0);
        eVar.mo30174j(false);
        eVar.mo30171g(this.f355369a.getPackageName());
        eVar.mo30173i(C62433bj.ASSISTANT_TACTILE_SCREENSHOT.f168594ao);
        eVar.mo30176l(new LensImage(bitmap));
        C126879a aVar = this.f355370b;
        eVar.mo30175k(new C24942d(this.f355369a));
        Intent a = C24945g.m46174a(eVar);
        a.addFlags(268435456);
        a.addFlags(32768);
        aVar.mo20101f(a);
    }
}
