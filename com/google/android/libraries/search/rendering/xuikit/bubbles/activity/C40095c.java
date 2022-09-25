package com.google.android.libraries.search.rendering.xuikit.bubbles.activity;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.libraries.search.p2476a.p2477a.C32151a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40101b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40114d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40126e;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40256j;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40108a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40109b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3127c.C40213b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4287b.p4342b.C56941e;
import com.google.p4283bv.p4287b.p4342b.C56942f;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4283bv.p4287b.p4342b.C56945i;
import com.google.p4283bv.p4287b.p4342b.C56947k;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.HashMap;
import p5304e.p5305a.p5306a.p5346al.p5347a.p5348a.C68442a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.activity.c */
/* compiled from: PG */
public final class C40095c implements C45987ay {

    /* renamed from: a */
    private static final C59071e f105318a = C59071e.m91331h();

    /* renamed from: b */
    private final Context f105319b;

    /* renamed from: c */
    private final BubbleTrampolineActivity f105320c;

    /* renamed from: d */
    private final C45989b f105321d;

    /* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.activity.c$a */
    /* compiled from: PG */
    public interface C40096a {
        /* renamed from: gi */
        C40256j mo42174gi();
    }

    public C40095c(Context context, BubbleTrampolineActivity bubbleTrampolineActivity, C45989b bVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(bVar, "accountController");
        this.f105319b = context;
        this.f105320c = bubbleTrampolineActivity;
        this.f105321d = bVar;
        Intent intent = bubbleTrampolineActivity.getIntent();
        C69664n.m101060f(intent, "activity.intent");
        C69664n.m101061g(intent, "<this>");
        if (!intent.hasExtra("INTENT_EXTRA_BUBBLE_PARAMS")) {
            C59052c cVar = (C59052c) f105318a.mo56225c();
            cVar.mo56379ah(new C59094n(53212));
            cVar.mo56386p("No BubbleLaunchParams specified in the BubbleIntent");
            m69619e();
            return;
        }
        C32151a.m59929e(bubbleTrampolineActivity, this, bVar, C58485gu.m89845m());
    }

    /* renamed from: e */
    private final void m69619e() {
        this.f105320c.finish();
        this.f105320c.overridePendingTransition(0, 0);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C40126e eVar;
        Intent intent = this.f105320c.getIntent();
        C69664n.m101060f(intent, "activity.intent");
        AccountId accountId = awVar.f120815a.f120816a;
        C40256j gi = ((C40096a) C47245e.m84045a(this.f105319b, C40096a.class, accountId)).mo42174gi();
        C69664n.m101060f(accountId, "accountId");
        C69664n.m101061g(intent, "<this>");
        if (!intent.hasExtra("INTENT_EXTRA_BUBBLE_PARAMS")) {
            eVar = C40126e.f105385i;
            C69664n.m101060f(eVar, "getDefaultInstance()");
        } else {
            C40114d dVar = (C40114d) C40126e.f105385i.createBuilder();
            C69664n.m101060f(dVar, "newBuilder()");
            C69664n.m101061g(dVar, "builder");
            C62942bv build = dVar.build();
            C69664n.m101060f(build, "_builder.build()");
            MessageLite b = ProtoParsers.m95519b(intent, "INTENT_EXTRA_BUBBLE_PARAMS", (C40126e) build, C62921ba.m95368a());
            C69664n.m101060f(b, "get(\n      this,\n      B…GeneratedRegistry()\n    )");
            eVar = (C40126e) b;
        }
        C56947k kVar = eVar.f105388b;
        if (kVar == null) {
            kVar = C56947k.f151990a;
        }
        C40108a aVar = new C40108a(kVar.toByteString());
        if (!Settings.canDrawOverlays(this.f105319b)) {
            C69664n.m101061g(accountId, "accountId");
            C40213b bVar = new C40213b();
            C68324h.m98669f(bVar);
            C47247a.m84047b(bVar, accountId);
            bVar.showNow(this.f105320c.f727a.f739a.f744e, "CheckPermissionDialog");
        } else {
            C56942f fVar = (C56942f) C56943g.f151982f.createBuilder();
            C69664n.m101060f(fVar, "newBuilder()");
            C56945i a = C69664n.m101061g(fVar, "builder");
            String c = C68442a.f184759a.mo6453a().mo60390c(this.f105319b);
            C69664n.m101060f(c, "sportsBubbleXblendEndpointUrl(context)");
            a.mo54439b(c);
            a.mo54440c(C56941e.PLATFORM_GWS);
            C56947k kVar2 = eVar.f105388b;
            if (kVar2 == null) {
                kVar2 = C56947k.f151990a;
            }
            C63088z byteString = kVar2.toByteString();
            C69664n.m101060f(byteString, "bubbleParams.parameters.toByteString()");
            C69664n.m101061g(byteString, "value");
            C56942f fVar2 = a.f151989a;
            fVar2.copyOnWrite();
            C56943g gVar = (C56943g) fVar2.instance;
            byteString.getClass();
            gVar.f151984a |= 2;
            gVar.f151986c = byteString;
            C56943g a2 = a.mo54438a();
            HashMap hashMap = new HashMap();
            if ((eVar.f105387a & 16) != 0) {
                String str = eVar.f105392f;
                C69664n.m101060f(str, "bubbleParams.countryCode");
                hashMap.put("gl", str);
            }
            if ((eVar.f105387a & 8) != 0) {
                String str2 = eVar.f105391e;
                C69664n.m101060f(str2, "bubbleParams.languageCode");
                hashMap.put("hl", str2);
            }
            if ((eVar.f105387a & 64) != 0) {
                String str3 = eVar.f105394h;
                C69664n.m101060f(str3, "bubbleParams.asyncParamValue");
                hashMap.put("async", str3);
            }
            int i = eVar.f105393g;
            int i2 = eVar.f105389c;
            C40101b bVar2 = eVar.f105390d;
            if (bVar2 == null) {
                bVar2 = C40101b.f105326c;
            }
            if (Settings.canDrawOverlays(gi.f105737b)) {
                C40109b bVar3 = new C40109b();
                bVar3.f105352c = C58729pv.f156485a;
                bVar3.mo42190c(3);
                bVar3.mo42191d(0);
                bVar3.mo42189b(C40101b.f105326c);
                bVar3.f105350a = aVar;
                if (a2 != null) {
                    bVar3.f105351b = a2;
                    C58495hd l = C58495hd.m89898l(hashMap);
                    if (l != null) {
                        bVar3.f105352c = l;
                        bVar3.mo42190c(i);
                        bVar3.mo42191d(i2);
                        bVar3.mo42189b(bVar2);
                        gi.mo42356a(bVar3.mo42188a());
                    } else {
                        throw new NullPointerException("Null queryParameters");
                    }
                } else {
                    throw new NullPointerException("Null bubbleXBlendAddress");
                }
            }
        }
        m69619e();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, "reason");
        C59052c cVar = (C59052c) ((C59052c) f105318a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(53211));
        cVar.mo56386p("Account exception, cannot trampoline into Bubble");
        m69619e();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
