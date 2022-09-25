package com.google.android.apps.gsa.staticplugins.p7666ci.p7669c;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0320v;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8839t.p8840a.C118340b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6883x.C87280a;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.assistant.pcp.p1573k.C18932l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.c.h */
/* compiled from: PG */
public final class C97821h implements C118340b {

    /* renamed from: a */
    public static final C59071e f273172a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ci.c.h");

    /* renamed from: b */
    public final Context f273173b;

    /* renamed from: c */
    private final C18932l f273174c;

    /* renamed from: d */
    private final C68214a f273175d;

    /* renamed from: e */
    private final C68214a f273176e;

    /* renamed from: f */
    private final Handler f273177f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private final C22871g f273178g;

    /* renamed from: h */
    private final C22871g f273179h;

    /* renamed from: i */
    private final long f273180i;

    public C97821h(Context context, C68214a aVar, C68214a aVar2, C18932l lVar, C22871g gVar, C86124t tVar, C22871g gVar2) {
        this.f273173b = context;
        this.f273175d = aVar;
        this.f273174c = lVar;
        this.f273176e = aVar2;
        this.f273178g = gVar;
        this.f273179h = gVar2;
        this.f273180i = tVar.mo79743a(C90069du.f249724b) * 1000;
    }

    /* renamed from: i */
    public static void m162115i(C0320v vVar, C68214a aVar, Context context, C68214a aVar2) {
        String g = vVar.mo1039g();
        C87280a aVar3 = (C87280a) aVar.mo27525b();
        boolean equals = "com.google.android.apps.books".equals(g);
        PendingIntent c = vVar.mo1035c();
        if (c == null) {
            C59104x d = f273172a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
            ((C59052c) ((C59052c) d).mo56372aa(30337)).mo56389s("#switchToMediaApp(): getSessionActivity() for %s returned null. Using package manager fallback.", g);
            m162122p(g, equals, aVar, context, aVar2);
        } else if (equals) {
            try {
                Intent intent = new Intent();
                ((C87280a) aVar.mo27525b()).mo80926a(intent);
                c.send(context, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                C59104x c2 = f273172a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(30338)).mo56386p("Failed to send session activity. Fallback to intent with app package name.");
                m162122p(g, equals, aVar, context, aVar2);
            }
        } else {
            c.send();
        }
    }

    /* renamed from: j */
    public static boolean m162116j(C0320v vVar) {
        if (vVar == null) {
            C59104x d = f273172a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
            ((C59052c) ((C59052c) d).mo56372aa(30344)).mo56386p("#onSuccess() MediaControllerCompat is NULL.");
            return false;
        }
        String g = C58837ba.m90858g(vVar.mo1039g());
        C59071e eVar = f273172a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(30341)).mo56389s("#onSuccess() MediaControllerCompat settable future success, packageName %s", g);
        if (vVar.mo1037e() == null) {
            C59104x d2 = eVar.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
            ((C59052c) ((C59052c) d2).mo56372aa(30343)).mo56389s("#onSuccess() TransportControls is null for %s, can not play.", g);
            return false;
        }
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) b2).mo56372aa(30342)).mo56389s("#onSuccess() Ready to play item for media session: %s.", g);
        return true;
    }

    /* renamed from: k */
    private final C60870cx m162117k(ComponentName componentName, Bundle bundle) {
        SettableFuture settableFuture = new SettableFuture();
        this.f273177f.post(new C97815b(this, componentName, settableFuture, bundle));
        return C90877ak.m148471e(settableFuture, 5000, TimeUnit.MILLISECONDS, this.f273179h);
    }

    /* renamed from: l */
    private final C60870cx m162118l(String str, Bundle bundle) {
        Optional a = this.f273174c.mo24190a(str);
        if (a.isPresent()) {
            return m162117k((ComponentName) a.get(), bundle);
        }
        C59104x c = f273172a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) c).mo56372aa(30325)).mo56386p("#playOnDeviceMedia() component name is empty, on-device media cannot start.");
        return C60856cj.m92899h(new RuntimeException("#playOnDeviceMedia() component name is empty, on-device media cannot start."));
    }

    /* renamed from: m */
    private final Optional m162119m(C52560wg wgVar) {
        C51058ev evVar;
        C51098gh ghVar = wgVar.f137949e;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str = evVar.f132944b;
        if (!C58837ba.m90859h(str)) {
            return this.f273174c.mo24190a(str);
        }
        C59104x c = f273172a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) c).mo56372aa(30326)).mo56386p("#playOnDeviceMedia() package name is empty, on-device media cannot be prepared.");
        return Optional.empty();
    }

    /* renamed from: n */
    private static Optional m162120n(C52560wg wgVar) {
        if (!wgVar.f137952h.isEmpty()) {
            return Optional.m71637of(wgVar.f137952h);
        }
        if (!wgVar.f137948d.isEmpty()) {
            return Optional.m71637of(Uri.parse(wgVar.f137948d));
        }
        return Optional.empty();
    }

    /* renamed from: o */
    private final void m162121o(ComponentName componentName, Object obj, boolean z, Bundle bundle) {
        C59104x b = f273172a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(30329)).mo56354G("#playMediaIdByComponentName() {%s} {%s} to play.", componentName, obj);
        C60856cj.m92911t(m162117k(componentName, bundle), new C97820g(obj, z, this.f273175d, this.f273173b, this.f273176e), C60826bg.f164896a);
    }

    /* renamed from: p */
    private static void m162122p(String str, boolean z, C68214a aVar, Context context, C68214a aVar2) {
        Intent launchIntentForPackage = ((PackageManager) aVar2.mo27525b()).getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            if (z) {
                ((C87280a) aVar.mo27525b()).mo80926a(launchIntentForPackage);
            }
            launchIntentForPackage.addFlags(536870912);
            C58976aa aaVar = C58975e.f156826a;
            context.startActivity(launchIntentForPackage);
            return;
        }
        C59104x c = f273172a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) c).mo56372aa(30339)).mo56389s("Fallback failed to get launch-intent from package %s", str);
    }

    /* renamed from: a */
    public final void mo90824a(String str, Optional optional) {
        C59104x b = f273172a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(30327)).mo56389s("#openMediaApp() {%s}.", str);
        C60856cj.m92911t(m162118l(str, (Bundle) optional.orElse(new Bundle())), new C97819f(this.f273175d, this.f273173b, this.f273176e), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo90825b(String str, Optional optional) {
        C59104x b = f273172a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(30328)).mo56389s("#playNextItem() {%s}.", str);
        C60856cj.m92911t(m162118l(str, (Bundle) optional.orElse(new Bundle())), new C97818e(2), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo90826c(String str, Optional optional) {
        C59104x b = f273172a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(30330)).mo56389s("#playNextItem() {%s}.", str);
        C60856cj.m92911t(m162118l(str, (Bundle) optional.orElse(new Bundle())), new C97818e(32), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo90827d(C52560wg wgVar, Optional optional) {
        Optional m = m162119m(wgVar);
        if (!m.isPresent()) {
            C59104x c = f273172a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
            ((C59052c) ((C59052c) c).mo56372aa(30332)).mo56386p("#playOnDeviceMedia() component name is empty, on-device media cannot start.");
            return;
        }
        Optional n = m162120n(wgVar);
        if (!n.isPresent()) {
            C59104x d = f273172a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
            ((C59052c) ((C59052c) d).mo56372aa(30331)).mo56386p("#playOnDeviceMedia() mediaItem has neither media id nor uri");
        }
        m162121o((ComponentName) m.get(), n.orElse(BuildConfig.FLAVOR), false, (Bundle) optional.orElse(new Bundle()));
    }

    /* renamed from: e */
    public final void mo90828e(C52560wg wgVar, Optional optional) {
        Optional m = m162119m(wgVar);
        if (!m.isPresent()) {
            C59104x c = f273172a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
            ((C59052c) ((C59052c) c).mo56372aa(30334)).mo56386p("#playOnDeviceMediaInForeground() component name is absent, on-device media cannot start.");
            return;
        }
        Optional n = m162120n(wgVar);
        if (!n.isPresent()) {
            C59104x d = f273172a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
            ((C59052c) ((C59052c) d).mo56372aa(30333)).mo56386p("#playOnDeviceMediaInForeground() mediaItem has neither media id nor uri");
        }
        m162121o((ComponentName) m.get(), n.orElse(BuildConfig.FLAVOR), true, (Bundle) optional.orElse(new Bundle()));
    }

    /* renamed from: f */
    public final void mo90829f(String str, String str2, Optional optional) {
        Optional a = this.f273174c.mo24190a(str);
        if (!a.isPresent()) {
            C59104x c = f273172a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
            ((C59052c) ((C59052c) c).mo56372aa(30335)).mo56386p("#playOnDeviceMediaInForeground() component name is absent, on-device media cannot start.");
            return;
        }
        m162121o((ComponentName) a.get(), str2, true, (Bundle) optional.orElse(new Bundle()));
    }

    /* renamed from: g */
    public final void mo90830g(String str, Optional optional) {
        C59104x b = f273172a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(30336)).mo56389s("#playPreviousItem() {%s}.", str);
        C60856cj.m92911t(m162118l(str, (Bundle) optional.orElse(new Bundle())), new C97818e(16), C60826bg.f164896a);
    }

    /* renamed from: h */
    public final void mo90831h(MediaBrowserCompat mediaBrowserCompat) {
        this.f273178g.mo28203c("Disconnecting MediaBrowserCompat", this.f273180i, new C97814a(mediaBrowserCompat));
    }
}
