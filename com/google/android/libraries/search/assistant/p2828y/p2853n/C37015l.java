package com.google.android.libraries.search.assistant.p2828y.p2853n;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36955c;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36962j;
import com.google.android.libraries.search.assistant.p2828y.p2852m.C37001a;
import com.google.android.libraries.search.assistant.p2828y.p2852m.C37002b;
import com.google.android.libraries.search.assistant.p2828y.p2852m.C37003c;
import com.google.android.libraries.search.assistant.p2828y.p2857p.C37058a;
import com.google.android.libraries.search.assistant.p2828y.p2859r.C37074b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51445hz;
import com.google.assistant.p3897e.p3917i.p3918a.C51447ia;
import com.google.assistant.p3897e.p3917i.p3918a.C51452if;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.n.l */
/* compiled from: PG */
public final class C37015l {

    /* renamed from: a */
    public static final C59071e f96387a = C59071e.m91332i("com.google.android.libraries.search.assistant.y.n.l");

    /* renamed from: b */
    public final PackageManager f96388b;

    /* renamed from: c */
    public final C37074b f96389c;

    /* renamed from: d */
    private final C69464a f96390d;

    /* renamed from: e */
    private final Context f96391e;

    /* renamed from: f */
    private final C46175b f96392f;

    /* renamed from: g */
    private final Executor f96393g;

    /* renamed from: h */
    private final C37021r f96394h;

    /* renamed from: i */
    private final C36955c f96395i;

    public C37015l(C69464a aVar, Context context, C46175b bVar, Executor executor, PackageManager packageManager, C37074b bVar2, C36962j jVar, C37022s sVar, C36955c cVar) {
        C37022s sVar2 = sVar;
        this.f96390d = aVar;
        this.f96391e = context;
        this.f96392f = bVar;
        this.f96393g = executor;
        this.f96388b = packageManager;
        this.f96389c = bVar2;
        jVar.getClass();
        C69464a aVar2 = sVar2.f96428a;
        C46175b bVar3 = (C46175b) sVar2.f96429b.mo17428b();
        bVar3.getClass();
        PackageManager packageManager2 = (PackageManager) sVar2.f96430c.mo17428b();
        packageManager2.getClass();
        C71422aw awVar = (C71422aw) sVar2.f96431d.mo17428b();
        awVar.getClass();
        C69585o oVar = (C69585o) sVar2.f96432e.mo17428b();
        oVar.getClass();
        this.f96394h = new C37021r(jVar, aVar2, bVar3, packageManager2, awVar, oVar);
        this.f96395i = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo40535a(Optional optional, C37005b bVar) {
        C60870cx cxVar;
        Optional optional2;
        if (optional.isPresent()) {
            C0320v vVar = (C0320v) optional.get();
            PlaybackStateCompat f = vVar.mo1038f();
            if (f == null) {
                ((C59052c) ((C59052c) f96387a.mo56226d()).mo56372aa(52484)).mo56386p("Failed to populate protobuf data from media controller, null playback state.");
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                MediaMetadataCompat d = vVar.mo1036d();
                if (d == null) {
                    ((C59052c) ((C59052c) f96387a.mo56226d()).mo56372aa(52483)).mo56386p("Failed to populate protobuf data from media controller, null media metadata.");
                    cxVar = C60856cj.m92900i(Optional.empty());
                } else {
                    C51445hz hzVar = (C51445hz) C51447ia.f133979i.createBuilder();
                    hzVar.copyOnWrite();
                    C51447ia iaVar = (C51447ia) hzVar.instance;
                    iaVar.f133985e = ((C51452if) C37006c.f96374a.getOrDefault(Integer.valueOf(f.f994a), C51452if.UNKNOWN_STATE)).f134016m;
                    iaVar.f133981a |= 16;
                    hzVar.mo53620a((C58485gu) Collection.EL.stream(C37001a.f96369b.entrySet()).filter(new C37002b(f.f998e)).map(C37003c.f96371a).collect(C58370cn.f155946a));
                    String g = vVar.mo1039g();
                    PackageManager packageManager = this.f96391e.getPackageManager();
                    if (TextUtils.isEmpty(g)) {
                        C59104x d2 = C37058a.f96546a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "PrvdParamFiller");
                        ((C59052c) ((C59052c) d2).mo56372aa(52501)).mo56386p("Failed to populate provider, null or empty package name.");
                        optional2 = Optional.empty();
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
                            C59104x d3 = C37058a.f96546a.mo56226d();
                            d3.mo56378ag(C58975e.f156826a, "PrvdParamFiller");
                            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e)).mo56372aa(52500)).mo56389s("Failed to get app name; couldn't find package name: %s", g);
                        }
                        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                        ggVar.copyOnWrite();
                        C51098gh ghVar = (C51098gh) ggVar.instance;
                        C51058ev evVar5 = (C51058ev) esVar.build();
                        evVar5.getClass();
                        ghVar.f133013c = evVar5;
                        ghVar.f133012b = 1;
                        optional2 = Optional.m71637of((C51098gh) ggVar.build());
                    }
                    if (optional2.isPresent()) {
                        C51098gh ghVar2 = (C51098gh) optional2.get();
                        hzVar.copyOnWrite();
                        C51447ia iaVar2 = (C51447ia) hzVar.instance;
                        ghVar2.getClass();
                        iaVar2.f133982b = ghVar2;
                        iaVar2.f133981a |= 1;
                    }
                    cxVar = C60922j.m93044g(this.f96392f.mo50246c((AccountId) this.f96390d.mo17428b()), C47810es.m84963c(new C37008e(hzVar, d, f)), this.f96393g);
                }
            }
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        C60870cx g2 = C60922j.m93044g(this.f96395i.f96232a.mo46042d(), C47810es.m84963c(C37007d.f96375a), this.f96393g);
        C37021r rVar = this.f96394h;
        String str = bVar.f96373b;
        List list = bVar.f96372a;
        C69664n.m101061g(str, "foregroundMediaApp");
        C69664n.m101061g(list, "mediaAudioAppPackageAllowList");
        C60870cx g3 = C60922j.m93044g(C71663i.m104688a(C71803m.m105042c(rVar.f96424c, (C69585o) null, (C71424ay) null, new C37020q(rVar, cxVar, str, list, (C69577g) null), 3)), C47810es.m84963c(new C37014k(this)), this.f96393g);
        return C47638k.m84751b(cxVar, g2, g3).mo51520a(new C37013j(cxVar, g2, g3), this.f96393g);
    }
}
