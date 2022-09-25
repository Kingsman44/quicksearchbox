package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.contrib.googlesignin.internal.weblayer.C43607a;
import com.google.android.libraries.web.contrib.googlesignin.internal.weblayer.C43608b;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import org.chromium.weblayer.C72568ad;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.v */
/* compiled from: PG */
public final class C44294v extends C72568ad {

    /* renamed from: a */
    public final /* synthetic */ C43608b f115190a;

    public C44294v(C43608b bVar) {
        this.f115190a = bVar;
    }

    /* renamed from: a */
    public final String mo47201a() {
        C43607a aVar = this.f115190a.f113825a;
        C60870cx c = aVar.f113824c.mo50246c(aVar.f113823b);
        boolean isDone = c.isDone();
        String str = BuildConfig.FLAVOR;
        if (isDone) {
            try {
                C46108a aVar2 = (C46108a) C60856cj.m92909r(c);
                if (aVar2.mo50210b().f121165j.equals("google")) {
                    str = aVar2.mo50210b().f121157b;
                }
            } catch (ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) C43607a.f113822a.mo56226d()).mo56382g(e)).mo56372aa(54091)).mo56386p("Failed to read user ID");
            }
        }
        C69664n.m101060f(str, "callback.getGaiaId()");
        return str;
    }
}
