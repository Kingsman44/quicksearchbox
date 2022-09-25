package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.content.Context;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.p9330a.C123706d;
import com.google.android.libraries.assistant.pcp.p1573k.C18799a;
import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.android.libraries.assistant.pcp.p1573k.C18922b;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.at */
/* compiled from: PG */
public final class C18820at {

    /* renamed from: a */
    public static final C59071e f52972a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.k.a.at");

    /* renamed from: b */
    public final ComponentName f52973b;

    /* renamed from: c */
    public final Context f52974c;

    /* renamed from: d */
    public final C18830bc f52975d;

    /* renamed from: e */
    public final C46428ao f52976e;

    /* renamed from: f */
    public final C60888db f52977f;

    /* renamed from: g */
    public Optional f52978g = Optional.empty();

    /* renamed from: h */
    public C18872cr f52979h = new C18854c(1, Optional.m71637of("Start of fetch done future, UNKNOWN prepopulated"));

    /* renamed from: i */
    public Optional f52980i = Optional.empty();

    /* renamed from: j */
    public Optional f52981j = Optional.empty();

    /* renamed from: k */
    Optional f52982k = Optional.empty();

    /* renamed from: l */
    Optional f52983l = Optional.empty();

    /* renamed from: m */
    public final C69464a f52984m;

    /* renamed from: n */
    public final C69464a f52985n;

    /* renamed from: o */
    public final C69464a f52986o;

    /* renamed from: p */
    public final C69464a f52987p;

    /* renamed from: q */
    public final C69464a f52988q;

    /* renamed from: r */
    public final C69464a f52989r;

    /* renamed from: s */
    public final C69464a f52990s;

    /* renamed from: t */
    private final C18922b f52991t;

    /* renamed from: u */
    private final C60887da f52992u;

    /* renamed from: v */
    private final C69464a f52993v;

    /* renamed from: w */
    private final C69464a f52994w;

    /* renamed from: x */
    private final C69464a f52995x;

    /* renamed from: y */
    private final C69464a f52996y;

    public C18820at(ComponentName componentName, Context context, C18922b bVar, C18830bc bcVar, C46428ao aoVar, C60887da daVar, C60888db dbVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C69464a aVar10, C69464a aVar11) {
        this.f52973b = componentName;
        this.f52974c = context;
        this.f52991t = bVar;
        this.f52975d = bcVar;
        this.f52976e = aoVar;
        this.f52992u = daVar;
        this.f52977f = dbVar;
        this.f52984m = aVar;
        this.f52985n = aVar2;
        this.f52986o = aVar3;
        this.f52987p = aVar4;
        this.f52988q = aVar5;
        this.f52989r = aVar6;
        this.f52993v = aVar7;
        this.f52994w = aVar8;
        this.f52995x = aVar9;
        this.f52996y = aVar10;
        this.f52990s = aVar11;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo24165a(C53306j jVar, List list) {
        C60870cx a;
        C18803ac acVar;
        if ("com.spotify.music".equals(this.f52973b.getPackageName()) && list.isEmpty()) {
            list = C58485gu.m89847o("com.google.android.googlequicksearchbox---spotify:space_item:partner-recommendations:partner-recently-played-v2", "ANY_FOLDER");
        }
        ((C59052c) ((C59052c) f52972a.mo56224b()).mo56372aa(47409)).mo56354G("#getMediaItemListByComponentName() %s with preferred folders %s", this.f52973b, list);
        a = C2169h.m6027a(new C18808ah(this, jVar, list));
        acVar = new C18803ac(this, this.f52973b, list);
        return C47633f.m84733g(C60856cj.m92908q(C60922j.m93044g(a, C47810es.m84963c(acVar), this.f52992u), C62950b.m95473d((C62910ar) this.f52993v.mo17428b()).toSeconds(), TimeUnit.SECONDS, this.f52977f)).mo51513e(Throwable.class, new C18809ai(this, list), this.f52992u).mo51515h(C18810aj.f52955a, this.f52992u);
    }

    /* renamed from: b */
    public final void mo24166b(C53306j jVar, int i, List list) {
        String packageName = this.f52973b.getPackageName();
        C59071e eVar = f52972a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47412)).mo56389s("Media app {%s} to connect.", packageName);
        if (C58837ba.m90859h(packageName)) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47415)).mo56386p("#connectAndFetch() null or empty package name.");
        }
        C58485gu j = C58485gu.m89842j(((C65603f) this.f52994w.mo17428b()).f178307a);
        jVar.name();
        if (!j.contains(jVar.name())) {
            list = C58485gu.m89845m();
        }
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(this.f52974c, this.f52973b, new C18819as(this, i, list), this.f52991t.mo24224a(jVar, packageName));
        this.f52978g = Optional.m71637of(mediaBrowserCompat);
        if (!mediaBrowserCompat.mo805i()) {
            mo24168d(mediaBrowserCompat);
        } else {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47414)).mo56389s("#connectAndFetch() MediaBrowserCompat is already connected. %s", this.f52973b);
        }
    }

    /* renamed from: c */
    public final void mo24167c(boolean z) {
        this.f52983l.ifPresent(new C18805ae(this));
        this.f52983l = Optional.empty();
        if (this.f52978g.isPresent()) {
            MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) this.f52978g.get();
            this.f52982k.ifPresent(C18910y.f53197a);
            if (z || !mo24169e(this.f52973b.getPackageName())) {
                try {
                    mediaBrowserCompat.mo801e();
                    ((C59052c) ((C59052c) f52972a.mo56224b()).mo56372aa(47419)).mo56389s("#markFutureDoneAndDisconnect() %s disconnected.", this.f52973b);
                } catch (IllegalArgumentException e) {
                    ((C59052c) ((C59052c) ((C59052c) f52972a.mo56226d()).mo56382g(e)).mo56372aa(47420)).mo56386p("Error when disconnecting from MediaBrowserCompat.");
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo24168d(MediaBrowserCompat mediaBrowserCompat) {
        try {
            mediaBrowserCompat.mo800d();
            ((C59052c) ((C59052c) f52972a.mo56224b()).mo56372aa(47423)).mo56389s("#tryConnect() Connecting %s", this.f52973b);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f52972a.mo56225c()).mo56382g(e)).mo56372aa(47424)).mo56389s("#tryConnect() Failed to connect %s", this.f52973b);
        }
    }

    /* renamed from: e */
    public final boolean mo24169e(String str) {
        return ((C65603f) this.f52995x.mo17428b()).f178307a.contains(str);
    }

    /* renamed from: f */
    public final int mo24170f() {
        C18872cr crVar = this.f52979h;
        if (crVar == null || crVar.mo24194b() == 0) {
            return 1;
        }
        return crVar.mo24194b();
    }

    /* renamed from: g */
    public final C18913ab mo24171g(ComponentName componentName, List list, int i, String str) {
        C58495hd hdVar;
        C58495hd hdVar2 = C58729pv.f156485a;
        Optional empty = Optional.empty();
        if (this.f52981j.isPresent()) {
            C18831bd bdVar = (C18831bd) this.f52981j.get();
            C58495hd b = bdVar.mo24177b();
            hdVar = bdVar.mo24178c();
            C58495hd hdVar3 = b;
            empty = bdVar.mo24180e();
            hdVar2 = hdVar3;
        } else {
            hdVar = hdVar2;
        }
        C58833ax j = C58833ax.m90833j(this.f52980i.flatMap(new C18911z(this, componentName)).orElse(null));
        ArrayDeque arrayDeque = new ArrayDeque();
        if (this.f52981j.isPresent()) {
            C18831bd bdVar2 = (C18831bd) this.f52981j.get();
            if (!((C65603f) this.f52996y.mo17428b()).f178307a.contains(componentName.getPackageName()) || list.isEmpty() || bdVar2.mo24177b().isEmpty() || bdVar2.mo24178c().isEmpty()) {
                arrayDeque.addAll(bdVar2.mo24179d().values());
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    C58800sl lA = bdVar2.mo24179d().entrySet().iterator();
                    while (lA.hasNext()) {
                        Map.Entry entry = (Map.Entry) lA.next();
                        if (!"ANY_FOLDER".equals(str2) || arrayDeque.contains(entry.getValue())) {
                            C58495hd c = bdVar2.mo24178c();
                            c.getClass();
                            String str3 = (String) c.getOrDefault(entry.getKey(), BuildConfig.FLAVOR);
                            C58495hd b2 = bdVar2.mo24177b();
                            b2.getClass();
                            String str4 = (String) b2.getOrDefault(str3, BuildConfig.FLAVOR);
                            if ((str2.equals(str3) || str2.equals(str4)) && !arrayDeque.contains(entry.getValue())) {
                                arrayDeque.add((MediaBrowserCompat.MediaItem) entry.getValue());
                            }
                        } else {
                            arrayDeque.add((MediaBrowserCompat.MediaItem) entry.getValue());
                        }
                    }
                }
            }
        }
        return new C18799a(componentName, j, arrayDeque, C58495hd.m89898l(hdVar2), C58495hd.m89898l(hdVar), C58833ax.m90833j(empty.orElse(null)), i, C58833ax.m90833j(Optional.m71637of(str).orElse(null)));
    }

    /* renamed from: h */
    public final void mo24172h(ComponentName componentName, int i, String str) {
        int intValue = ((Integer) this.f52981j.map(C18811ak.f52956a).orElse(0)).intValue();
        C59052c cVar = (C59052c) ((C59052c) f52972a.mo56224b()).mo56372aa(47418);
        Integer valueOf = Integer.valueOf(intValue);
        String a = C123706d.m203074a(i);
        if (i != 0) {
            cVar.mo56360M("Event log: app package name/class name %s - # of media items in result: {%d} - status code/error message %s/%s", componentName, valueOf, a, str);
            return;
        }
        throw null;
    }

    /* renamed from: i */
    public final void mo24173i(int i, String str) {
        mo24172h(this.f52973b, i, str);
        this.f52979h = new C18854c(i, Optional.m71637of(str));
    }
}
