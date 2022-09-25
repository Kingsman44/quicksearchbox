package com.google.android.apps.search.googleapp.stampviewer.p10497i.p10498a;

import android.net.Uri;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4541l.C59326i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.firebase.dynamiclinks.C61175a;
import com.google.firebase.dynamiclinks.C61177c;
import com.google.firebase.dynamiclinks.internal.C61186i;
import com.google.p4242bp.p4253e.p4254a.C56198r;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.i.a.d */
/* compiled from: PG */
public final class C139422d implements C139420b {

    /* renamed from: a */
    private final int f379098a;

    /* renamed from: b */
    private final ScheduledExecutorService f379099b;

    /* renamed from: c */
    private final C139419a f379100c;

    public C139422d(long j, C139419a aVar, ScheduledExecutorService scheduledExecutorService) {
        this.f379098a = (int) j;
        this.f379100c = aVar;
        this.f379099b = scheduledExecutorService;
    }

    /* renamed from: a */
    public final C60870cx mo114956a(C56198r rVar) {
        C59326i iVar = C59326i.f157517e;
        byte[] byteArray = rVar.toByteArray();
        Uri build = Uri.parse("https://www.google.com/story").buildUpon().appendQueryParameter("sdp", iVar.mo56837l(byteArray, byteArray.length)).build();
        C61175a a = C61177c.m93546c(this.f379100c.mo114955a()).mo57737a();
        a.mo57736b(build);
        if ("https://stories.app.goo.gl".matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") || "https://stories.app.goo.gl".matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
            a.f165515a.putString("domain", "https://stories.app.goo.gl".replace("https://", BuildConfig.FLAVOR));
        }
        a.f165515a.putString("domainUriPrefix", "https://stories.app.goo.gl");
        Bundle bundle = new Bundle();
        bundle.putString("apn", "com.google.android.googlequicksearchbox");
        bundle.putInt("amv", this.f379098a);
        bundle.putParcelable("afl", build);
        a.f165516b.putAll(bundle);
        C61186i.m93559d(a.f165515a);
        Bundle bundle2 = a.f165515a;
        C61186i.m93559d(bundle2);
        Uri uri = (Uri) bundle2.getParcelable("dynamicLink");
        if (uri == null) {
            Uri.Builder builder = new Uri.Builder();
            String string = bundle2.getString("domainUriPrefix");
            C143919bh.m233958a(string);
            Uri parse = Uri.parse(string);
            builder.scheme(parse.getScheme());
            builder.authority(parse.getAuthority());
            builder.path(parse.getPath());
            Bundle bundle3 = bundle2.getBundle("parameters");
            if (bundle3 != null) {
                for (String str : bundle3.keySet()) {
                    Object obj = bundle3.get(str);
                    if (obj != null) {
                        builder.appendQueryParameter(str, obj.toString());
                    }
                }
            }
            uri = builder.build();
        }
        C61175a a2 = C61177c.m93546c(this.f379100c.mo114955a()).mo57737a();
        a2.f165515a.putParcelable("dynamicLink", uri);
        return C60922j.m93045h(C43205e.m76192b(a2.mo57735a()), C47810es.m84966f(C139421c.f379097a), this.f379099b);
    }
}
