package com.google.android.apps.search.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.weather.p10685d.C142074c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.logging.p3046g.C39196b;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.android.libraries.search.p2476a.p2479c.p2480a.C32169d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.amk;
import com.google.common.p4552o.aml;
import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62940bt;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.weather.f */
/* compiled from: PG */
public final class C142087f extends C142091g implements C45987ay {

    /* renamed from: a */
    public static final C59071e f385488a = C59071e.m91332i("com.google.android.apps.search.weather.f");

    /* renamed from: g */
    private static final C58528ij f385489g = C58528ij.m90012L("log_event", "source", "weather_widget_id_source_key");

    /* renamed from: b */
    public final WeatherActivity f385490b;

    /* renamed from: c */
    public final C45989b f385491c;

    /* renamed from: d */
    public final C28443m f385492d;

    /* renamed from: e */
    public final boolean f385493e;

    /* renamed from: h */
    private final C28310af f385494h;

    /* renamed from: i */
    private final C28306ab f385495i;

    public C142087f(WeatherActivity weatherActivity, C45989b bVar, C28310af afVar, C32158h hVar, C28306ab abVar, C28443m mVar, boolean z) {
        this.f385490b = weatherActivity;
        this.f385494h = afVar;
        this.f385491c = bVar;
        this.f385495i = abVar;
        this.f385492d = mVar;
        this.f385493e = z;
        hVar.mo37971b(weatherActivity, this, bVar);
    }

    /* renamed from: f */
    public static void m230666f(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                if (!f385489g.contains(str)) {
                    intent.removeExtra(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        mo117003e(awVar.f120815a.f120816a);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        if (!(th instanceof C46054v) || !(th.getCause() instanceof C32209j)) {
            ((C59052c) ((C59052c) ((C59052c) f385488a.mo56226d()).mo56382g(th)).mo56372aa(42022)).mo56389s("onAccountError: %s", th.getMessage());
            this.f385490b.finish();
            return;
        }
        this.f385491c.mo50081d(C58485gu.m89846n(C32169d.class));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        String str;
        C28423g a = C45954d.m82060a(axVar.f120816a);
        C28313c a2 = this.f385494h.mo33805a(C28427h.m53115a(120892));
        a2.mo33861i(C28439i.f77216b);
        a2.mo33859g(C28375ak.m53061c(120893));
        a2.mo33859g(a);
        Intent intent = this.f385490b.getIntent();
        if (intent == null) {
            str = null;
        } else {
            str = intent.getStringExtra("source");
        }
        if (str != null) {
            C62940bt btVar = C39196b.f103148a;
            amk amk = (amk) aml.f159155c.createBuilder();
            amk.copyOnWrite();
            aml aml = (aml) amk.instance;
            aml.f159157a |= 1;
            aml.f159158b = str;
            a2.mo33858f(new C28353e(btVar, (aml) amk.build()));
        }
        C28306ab abVar = this.f385495i;
        WeatherActivity weatherActivity = this.f385490b;
        int i = C28485y.f77298f;
        abVar.mo33801b(weatherActivity.mo1322k().mo1177e(16908290), a2);
    }

    /* renamed from: e */
    public final void mo117003e(AccountId accountId) {
        C47558bi a = C47831fm.m85006a("WeatherActivityPeer#attachWeatherFragment");
        try {
            C142119p pVar = (C142119p) C142120q.f385564d.createBuilder();
            Intent intent = this.f385490b.getIntent();
            if (C142074c.m230650b(intent) != null) {
                C67962d b = C142074c.m230650b(intent);
                pVar.copyOnWrite();
                C142120q qVar = (C142120q) pVar.instance;
                b.getClass();
                qVar.f385567b = b;
                qVar.f385566a |= 1;
            }
            int a2 = C142074c.m230649a(intent);
            pVar.copyOnWrite();
            C142120q qVar2 = (C142120q) pVar.instance;
            qVar2.f385566a |= 2;
            qVar2.f385568c = a2;
            C142118o oVar = new C142118o();
            C68324h.m98669f(oVar);
            C47247a.m84047b(oVar, accountId);
            C47243l.m84039a(oVar, (C142120q) pVar.build());
            C0154a aVar = new C0154a(this.f385490b.f727a.f739a.f744e);
            aVar.mo689v(R.id.weather_fragment_container, oVar, (String) null);
            aVar.mo509f();
            a.close();
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
