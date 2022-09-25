package org.chromium.weblayer;

import android.webkit.ValueCallback;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.C44176d;
import com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.C44179g;
import com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.C44180h;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import org.chromium.p5643b.p5644a.C72317am;
import org.chromium.p5643b.p5644a.C72332ba;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.p5643b.p5644a.C72343bl;

/* renamed from: org.chromium.weblayer.av */
/* compiled from: PG */
final class C72586av extends C72332ba {

    /* renamed from: a */
    private final C72607bp f193118a;

    public C72586av(C72607bp bpVar) {
        this.f193118a = bpVar;
    }

    /* renamed from: a */
    public final String mo63769a() {
        C72343bl.m106991a();
        C60870cx b = ((C44180h) this.f193118a).f114941c.mo50395b();
        if (!b.isDone()) {
            return BuildConfig.FLAVOR;
        }
        try {
            return C58837ba.m90858g((String) C60856cj.m92909r(b));
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C44180h.f114939a.mo56226d()).mo56382g(e)).mo56372aa(54179)).mo56386p("Failed to read user's email.");
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: b */
    public final String mo63770b() {
        C72343bl.m106991a();
        C60870cx b = ((C44180h) this.f193118a).f114940b.mo50395b();
        if (!b.isDone()) {
            return BuildConfig.FLAVOR;
        }
        try {
            return ((C46108a) C60856cj.m92909r(b)).mo50210b().f121158c;
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C44180h.f114939a.mo56226d()).mo56382g(e)).mo56372aa(54180)).mo56386p("Failed to read user's display name.");
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: c */
    public final void mo63771c(int i, C72317am amVar) {
        C72343bl.m106991a();
        C44180h hVar = (C44180h) this.f193118a;
        C47633f i2 = C47633f.m84733g(hVar.f114940b.mo50395b()).mo51516i(new C44176d(hVar, i), hVar.f114943e);
        C44179g gVar = new C44179g((ValueCallback) C72341bj.m106988a(amVar, ValueCallback.class));
        C60856cj.m92911t(i2.f164926b, C47810es.m84974n(gVar), hVar.f114944f);
    }
}
