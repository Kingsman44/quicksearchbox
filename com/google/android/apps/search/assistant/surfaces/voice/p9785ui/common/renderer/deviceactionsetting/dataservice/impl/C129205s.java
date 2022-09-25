package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.slice.C4113l;
import androidx.slice.C4114m;
import androidx.slice.Slice;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.C129185c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.androidx.p3698c.C47617a;
import com.google.apps.tiktok.tracing.contrib.androidx.p3698c.C47618b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.s */
/* compiled from: PG */
public final class C129205s implements C129185c {

    /* renamed from: b */
    public static final C59071e f354910b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.s");

    /* renamed from: c */
    public final Context f354911c;

    /* renamed from: d */
    public final Executor f354912d;

    /* renamed from: e */
    public final C21370a f354913e;

    /* renamed from: f */
    public final ConcurrentMap f354914f = new ConcurrentHashMap();

    /* renamed from: g */
    public final ConcurrentMap f354915g = new ConcurrentHashMap();

    /* renamed from: h */
    private final C4114m f354916h;

    /* renamed from: i */
    private final C46778cv f354917i;

    /* renamed from: j */
    private final C47618b f354918j;

    public C129205s(Context context, C60887da daVar, C4114m mVar, C46778cv cvVar, C21370a aVar, C47618b bVar) {
        this.f354911c = context;
        this.f354912d = new C60904dr(daVar);
        this.f354916h = mVar;
        this.f354917i = cvVar;
        this.f354913e = aVar;
        this.f354918j = bVar;
    }

    /* renamed from: a */
    public final C46689ag mo108898a(Uri uri) {
        return new C129204r(this, uri);
    }

    /* renamed from: b */
    public final void mo108899b(Uri uri) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f354916h == null) {
            C59104x d = f354910b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
            ((C59052c) ((C59052c) d).mo56372aa(38194)).mo56386p("Unable to unregisterCallback: sliceUri or sliceManager is null.");
            return;
        }
        C4113l lVar = (C4113l) this.f354915g.get(uri);
        if (lVar != null) {
            this.f354916h.mo8630e(uri, lVar);
            this.f354915g.remove(uri);
        }
    }

    /* renamed from: c */
    public final Optional mo108902c(Uri uri) {
        C47617a aVar = new C47617a(new C129202p(this, uri), this.f354918j);
        this.f354915g.put(uri, aVar);
        try {
            this.f354916h.mo8628c(uri, aVar);
            return Optional.ofNullable(this.f354916h.mo8626a(uri));
        } catch (Resources.NotFoundException | IllegalArgumentException | NullPointerException | SecurityException e) {
            C59104x d = f354910b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(38188)).mo56386p("Can't access slice URI.");
            mo108899b(uri);
            return Optional.empty();
        }
    }

    /* renamed from: d */
    public final void mo108903d(Uri uri, Slice slice) {
        C59104x b = f354910b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
        ((C59052c) ((C59052c) b).mo56372aa(38195)).mo56354G("#updateCache for sliceUri: %s, and slice: %s", uri, slice);
        this.f354914f.put(uri, slice);
        this.f354917i.mo50787a(C60866ct.f164955a, f354868a);
    }

    /* renamed from: e */
    public final C60870cx mo108904e(Uri uri, int i) {
        if (i > 5) {
            C59104x d = f354910b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
            ((C59052c) ((C59052c) d).mo56372aa(38187)).mo56386p("Failed to load the slice, reached max attempts.");
            return C60856cj.m92900i(Optional.empty());
        }
        C58976aa aaVar = C58975e.f156826a;
        mo108899b(uri);
        C129200n nVar = new C129200n(this, uri);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(nVar), this.f354912d);
        C129201o oVar = new C129201o(this, uri, i);
        return C60922j.m93045h(m, C47810es.m84966f(oVar), this.f354912d);
    }
}
