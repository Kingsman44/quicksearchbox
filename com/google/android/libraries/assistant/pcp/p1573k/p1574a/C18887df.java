package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.pcp.p1573k.C18914ac;
import com.google.android.libraries.assistant.pcp.p1573k.C18932l;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.df */
/* compiled from: PG */
public final class C18887df implements C18914ac {

    /* renamed from: a */
    public static final C59071e f53161a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.k.a.df");

    /* renamed from: b */
    public final Context f53162b;

    /* renamed from: c */
    public final C46428ao f53163c;

    /* renamed from: d */
    public final C18871cq f53164d;

    /* renamed from: e */
    private final C18932l f53165e;

    /* renamed from: f */
    private final C60888db f53166f;

    /* renamed from: g */
    private final C69464a f53167g;

    public C18887df(Context context, C18932l lVar, C18871cq cqVar, C46428ao aoVar, C60888db dbVar, C69464a aVar) {
        this.f53162b = context;
        this.f53165e = lVar;
        this.f53164d = cqVar;
        this.f53163c = aoVar;
        this.f53166f = dbVar;
        this.f53167g = aVar;
    }

    /* renamed from: j */
    public static Optional m36317j(Optional optional) {
        if (optional.isPresent()) {
            return optional.flatMap(C18874ct.f53135a);
        }
        C59104x d = f53161a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) d).mo56372aa(47501)).mo56386p("#onSuccess() MediaControllerCompat is EMPTY.");
        return Optional.empty();
    }

    /* renamed from: l */
    private final C60870cx m36318l(ComponentName componentName, Bundle bundle) {
        return C47633f.m84733g(C2169h.m6027a(new C18875cu(this, componentName, bundle))).mo51517j(5000, TimeUnit.MILLISECONDS, this.f53166f);
    }

    /* renamed from: m */
    private final C60870cx m36319m(String str, Bundle bundle) {
        Optional a = this.f53165e.mo24190a(str);
        if (a.isPresent()) {
            return m36318l((ComponentName) a.get(), bundle);
        }
        C59104x c = f53161a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) c).mo56372aa(47500)).mo56386p("#playOnDeviceMedia() component name is empty, on-device media cannot start.");
        return C60856cj.m92899h(new RuntimeException("#playOnDeviceMedia() component name is empty, on-device media cannot start."));
    }

    /* renamed from: n */
    private final Optional m36320n(C52560wg wgVar) {
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
            return this.f53165e.mo24190a(str);
        }
        C59104x c = f53161a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) c).mo56372aa(47502)).mo56386p("#playOnDeviceMedia() package name is empty, on-device media cannot be prepared.");
        return Optional.empty();
    }

    /* renamed from: o */
    private static Optional m36321o(C52560wg wgVar) {
        if (!wgVar.f137952h.isEmpty()) {
            return Optional.m71637of(wgVar.f137952h);
        }
        if (!wgVar.f137948d.isEmpty()) {
            return Optional.m71637of(Uri.parse(wgVar.f137948d));
        }
        return Optional.empty();
    }

    /* renamed from: p */
    private final void m36322p(ComponentName componentName, Object obj, boolean z, Bundle bundle, Optional optional) {
        C59104x b = f53161a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(47508)).mo56354G("#playMediaIdByComponentName() {%s} {%s} to play.", componentName, obj);
        C47633f g = C47633f.m84733g(m36318l(componentName, bundle));
        C18886de deVar = new C18886de(this, obj, z, optional);
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(deVar), C60826bg.f164896a);
    }

    /* renamed from: q */
    private final void m36323q(ComponentName componentName, Object obj, Optional optional, Optional optional2) {
        if ((obj instanceof String) || (obj instanceof Uri)) {
            m36322p(componentName, obj, false, (Bundle) optional.orElse(new Bundle()), optional2);
            return;
        }
        C59104x c = f53161a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) c).mo56372aa(47512)).mo56386p("#playOnDeviceMedia() media ID is not valid.");
    }

    /* renamed from: a */
    public final void mo24206a(String str, Optional optional) {
        C59104x b = f53161a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(47506)).mo56389s("#openMediaApp() {%s}.", str);
        C60870cx m = m36319m(str, (Bundle) optional.orElse(new Bundle()));
        C18883db dbVar = new C18883db(this);
        C60856cj.m92911t(m, C47810es.m84974n(dbVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo24207b(String str, Optional optional) {
        C59104x b = f53161a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(47507)).mo56389s("#playNextItem() {%s}.", str);
        C60870cx m = m36319m(str, (Bundle) optional.orElse(new Bundle()));
        C18880cz czVar = new C18880cz(2);
        C60856cj.m92911t(m, C47810es.m84974n(czVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo24208c(String str, Optional optional) {
        C59104x b = f53161a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(47509)).mo56389s("#playNextItem() {%s}.", str);
        C60870cx m = m36319m(str, (Bundle) optional.orElse(new Bundle()));
        C18880cz czVar = new C18880cz(32);
        C60856cj.m92911t(m, C47810es.m84974n(czVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo24209d(ComponentName componentName, Optional optional) {
        m36322p(componentName, BuildConfig.FLAVOR, false, (Bundle) optional.orElse(new Bundle()), Optional.empty());
    }

    /* renamed from: e */
    public final void mo24210e(ComponentName componentName, Object obj, Optional optional) {
        m36323q(componentName, obj, optional, Optional.empty());
    }

    /* renamed from: f */
    public final void mo24211f(C52560wg wgVar, Optional optional, Optional optional2) {
        Optional n = m36320n(wgVar);
        if (!n.isPresent()) {
            C59104x c = f53161a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
            ((C59052c) ((C59052c) c).mo56372aa(47511)).mo56386p("#playOnDeviceMedia() component name is empty, on-device media cannot start.");
            return;
        }
        Optional o = m36321o(wgVar);
        if (!o.isPresent()) {
            C59104x d = f53161a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
            ((C59052c) ((C59052c) d).mo56372aa(47510)).mo56386p("#playOnDeviceMedia() mediaItem has neither media id nor uri");
        }
        m36322p((ComponentName) n.get(), o.orElse(BuildConfig.FLAVOR), false, (Bundle) optional.orElse(new Bundle()), optional2);
    }

    /* renamed from: g */
    public final void mo24212g(String str, Object obj, Optional optional, Optional optional2) {
        Optional a = this.f53165e.mo24190a(str);
        if (!a.isPresent()) {
            C59104x c = f53161a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
            ((C59052c) ((C59052c) c).mo56372aa(47513)).mo56386p("#playOnDeviceMedia() component name is empty, on-device media cannot start.");
            return;
        }
        m36323q((ComponentName) a.get(), obj, optional, optional2);
    }

    /* renamed from: h */
    public final void mo24213h(C52560wg wgVar, Optional optional) {
        Optional n = m36320n(wgVar);
        if (!n.isPresent()) {
            C59104x c = f53161a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
            ((C59052c) ((C59052c) c).mo56372aa(47515)).mo56386p("#playOnDeviceMediaInForeground() component name is empty, on-device media cannot start.");
            return;
        }
        Optional o = m36321o(wgVar);
        if (!o.isPresent()) {
            C59104x d = f53161a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
            ((C59052c) ((C59052c) d).mo56372aa(47514)).mo56386p("#playOnDeviceMediaInForeground() mediaItem has neither media id nor uri");
        }
        m36322p((ComponentName) n.get(), o.orElse(BuildConfig.FLAVOR), true, (Bundle) optional.orElse(new Bundle()), Optional.empty());
    }

    /* renamed from: i */
    public final void mo24214i(String str, Optional optional) {
        C59104x b = f53161a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(47516)).mo56389s("#playPreviousItem() {%s}.", str);
        C60870cx m = m36319m(str, (Bundle) optional.orElse(new Bundle()));
        C18880cz czVar = new C18880cz(16);
        C60856cj.m92911t(m, C47810es.m84974n(czVar), C60826bg.f164896a);
    }

    /* renamed from: k */
    public final void mo24215k(MediaBrowserCompat mediaBrowserCompat) {
        this.f53163c.postDelayed(new C18873cs(mediaBrowserCompat), C62950b.m95473d((C62910ar) this.f53167g.mo17428b()).toMillis());
    }
}
