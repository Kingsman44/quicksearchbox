package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.p1043a;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1041a.C13905a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13920d;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13921e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a.C13923a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13977b;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13978c;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13979d;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13980e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13984i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51445hz;
import com.google.assistant.p3897e.p3917i.p3918a.C51447ia;
import com.google.assistant.p3897e.p3917i.p3918a.C51452if;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.b.a.k */
/* compiled from: PG */
public final class C13917k implements C13921e {

    /* renamed from: a */
    public static final C59071e f42381a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.a.b.a.k");

    /* renamed from: b */
    public final ScheduledExecutorService f42382b;

    /* renamed from: c */
    public final C68214a f42383c;

    /* renamed from: d */
    public final C21370a f42384d;

    /* renamed from: e */
    public final C69464a f42385e;

    /* renamed from: f */
    public final C69464a f42386f;

    /* renamed from: g */
    public final C69464a f42387g;

    /* renamed from: h */
    public long f42388h = 0;

    /* renamed from: i */
    private final C13980e f42389i;

    public C13917k(C69464a aVar, ScheduledExecutorService scheduledExecutorService, C68214a aVar2, C13980e eVar, C21370a aVar3, C69464a aVar4, C69464a aVar5) {
        this.f42386f = aVar;
        this.f42382b = scheduledExecutorService;
        this.f42383c = aVar2;
        this.f42389i = eVar;
        this.f42384d = aVar3;
        this.f42385e = aVar4;
        this.f42387g = aVar5;
    }

    /* renamed from: a */
    public final C60870cx mo21349a(String str, C13920d dVar, C0320v vVar) {
        return mo21350b(str, dVar, vVar, Optional.empty());
    }

    /* renamed from: b */
    public final C60870cx mo21350b(String str, C13920d dVar, C0320v vVar, Optional optional) {
        this.f42388h = this.f42384d.mo26870b();
        C60870cx a = C2169h.m6027a(new C13907a(this, str, vVar, optional, dVar));
        C60856cj.m92911t(a, C47810es.m84974n(C47810es.m84974n(new C13914h(this, vVar))), this.f42382b);
        return C60846c.m92879h(C47633f.m84733g(a).mo51517j(true != optional.isPresent() ? 1000 : 5000, TimeUnit.MILLISECONDS, this.f42382b), TimeoutException.class, C47810es.m84966f(new C13908b(this, vVar, optional, str)), this.f42382b);
    }

    /* renamed from: c */
    public final C52070ec mo21351c(C0320v vVar, Optional optional, PlaybackStateCompat playbackStateCompat, String str) {
        C52179id idVar = (C52179id) C13983h.f42574a.getOrDefault(Integer.valueOf(playbackStateCompat.f999f), C52179id.UNKNOWN_MEDIA_ERROR);
        ((C13923a) this.f42387g.mo17428b()).mo21355b(str, idVar);
        return C13976a.m30268c(Optional.m71637of(C13976a.m30270e(idVar, (Long) null)), optional, Optional.empty(), Optional.m71637of(C13983h.m30275b(vVar.mo1039g(), playbackStateCompat.f1000g)), this.f42385e);
    }

    /* renamed from: d */
    public final C60870cx mo21352d(C0320v vVar, Optional optional, String str) {
        C60870cx cxVar;
        C51098gh ghVar;
        C13980e eVar = this.f42389i;
        PlaybackStateCompat f = vVar.mo1038f();
        if (f == null) {
            ((C59052c) ((C59052c) C13980e.f42561a.mo56226d()).mo56372aa(45249)).mo56386p("Failed to populate protobuf data from media controller, null playback state.");
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            MediaMetadataCompat d = vVar.mo1036d();
            if (d == null) {
                ((C59052c) ((C59052c) C13980e.f42561a.mo56226d()).mo56372aa(45248)).mo56386p("Failed to populate protobuf data from media controller, null media metadata.");
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                C51445hz hzVar = (C51445hz) C51447ia.f133979i.createBuilder();
                hzVar.copyOnWrite();
                C51447ia iaVar = (C51447ia) hzVar.instance;
                iaVar.f133985e = ((C51452if) C13905a.f42345a.getOrDefault(Integer.valueOf(f.f994a), C51452if.UNKNOWN_STATE)).f134016m;
                iaVar.f133981a |= 16;
                List d2 = C13983h.m30277d(f.f998e);
                if (!d2.isEmpty()) {
                    hzVar.mo53620a(d2);
                }
                String g = vVar.mo1039g();
                PackageManager packageManager = eVar.f42563c.getPackageManager();
                if (TextUtils.isEmpty(g)) {
                    C59104x d3 = C13984i.f42576a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "PrvdParamFillerUtils");
                    ((C59052c) ((C59052c) d3).mo56372aa(45266)).mo56386p("Failed to populate provider, null or empty package name.");
                    ghVar = null;
                } else {
                    C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                    esVar.copyOnWrite();
                    C51058ev evVar = (C51058ev) esVar.instance;
                    g.getClass();
                    evVar.f132943a |= 1;
                    evVar.f132944b = g;
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(g);
                    if (launchIntentForPackage != null) {
                        String uri = launchIntentForPackage.toUri(0);
                        esVar.copyOnWrite();
                        C51058ev evVar2 = (C51058ev) esVar.instance;
                        uri.getClass();
                        evVar2.f132943a |= 32;
                        evVar2.f132949g = uri;
                    }
                    try {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(g, 0);
                        if (applicationInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                String obj = applicationLabel.toString();
                                esVar.copyOnWrite();
                                C51058ev evVar3 = (C51058ev) esVar.instance;
                                obj.getClass();
                                evVar3.f132943a |= 16;
                                evVar3.f132948f = obj;
                            }
                            PackageInfo packageInfo = packageManager.getPackageInfo(g, 0);
                            if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled) {
                                long longVersionCode = packageInfo.getLongVersionCode();
                                esVar.copyOnWrite();
                                C51058ev evVar4 = (C51058ev) esVar.instance;
                                evVar4.f132943a |= 4;
                                evVar4.f132946d = longVersionCode;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        C59104x d4 = C13984i.f42576a.mo56226d();
                        d4.mo56378ag(C58975e.f156826a, "PrvdParamFillerUtils");
                        ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e)).mo56372aa(45265)).mo56389s("Failed to get app name; couldn't find package name: %s", g);
                    }
                    C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                    ggVar.copyOnWrite();
                    C51098gh ghVar2 = (C51098gh) ggVar.instance;
                    C51058ev evVar5 = (C51058ev) esVar.build();
                    evVar5.getClass();
                    ghVar2.f133013c = evVar5;
                    ghVar2.f133012b = 1;
                    ghVar = (C51098gh) ggVar.build();
                }
                if (ghVar != null) {
                    hzVar.copyOnWrite();
                    C51447ia iaVar2 = (C51447ia) hzVar.instance;
                    iaVar2.f133982b = ghVar;
                    iaVar2.f133981a |= 1;
                }
                cxVar = C60922j.m93044g(eVar.f42564d.mo50246c((AccountId) eVar.f42562b.mo17428b()), C47810es.m84963c(new C13977b(hzVar, d, f)), eVar.f42565e);
            }
        }
        C60870cx g2 = C60922j.m93044g(eVar.f42566f.f96232a.mo46042d(), C47810es.m84963c(C13979d.f42560a), eVar.f42565e);
        C60870cx a = C47638k.m84751b(cxVar, g2).mo51520a(new C13978c(cxVar, g2), eVar.f42565e);
        ((C13923a) this.f42387g.mo17428b()).mo21354a(str);
        return C60922j.m93044g(a, C47810es.m84963c(new C13912f(this, optional)), this.f42382b);
    }
}
