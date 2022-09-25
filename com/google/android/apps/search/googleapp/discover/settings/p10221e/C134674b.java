package com.google.android.apps.search.googleapp.discover.settings.p10221e;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.discover.settings.p10221e.p10222a.C134672a;
import com.google.android.apps.search.googleapp.discover.settings.p10221e.p10222a.C134673b;
import com.google.android.apps.search.googleapp.p10536x.C139867c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46704av;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8590q;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.e.b */
/* compiled from: PG */
public final class C134674b implements C139867c {

    /* renamed from: a */
    public final Context f366735a;

    /* renamed from: b */
    private final Executor f366736b;

    /* renamed from: c */
    private final C134673b f366737c;

    public C134674b(Context context, Executor executor, C134673b bVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executor, "executor");
        this.f366735a = context;
        this.f366736b = executor;
        this.f366737c = bVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 150605;
    }

    /* renamed from: b */
    public final C46689ag mo111872b() {
        C134673b bVar = this.f366737c;
        return new C46704av(new C46719bc(bVar.f366732a, new C134672a(bVar), "DISCOVER_VIDEO_AUTOPLAY_DATA_SOURCE"), new C134671a(this), this.f366736b);
    }

    /* renamed from: c */
    public final C58485gu mo111873c() {
        C58485gu p = C58485gu.m89848p(this.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_never), this.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_wifi), this.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_always));
        C69664n.m101060f(p, "of(\n      context.resour…eo_previews_always)\n    )");
        return p;
    }

    /* renamed from: d */
    public final C60870cx mo111874d(String str) {
        C8590q qVar;
        C69664n.m101061g(str, "value");
        if (C69664n.m101066l(str, this.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_never))) {
            qVar = C8590q.AUTOPLAY_DISABLED;
        } else if (C69664n.m101066l(str, this.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_wifi))) {
            qVar = C8590q.AUTOPLAY_ON_WIFI_ONLY;
        } else if (C69664n.m101066l(str, this.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_always))) {
            qVar = C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA;
        } else {
            qVar = C8590q.AUTOPLAY_DISABLED;
        }
        C134673b bVar = this.f366737c;
        C69664n.m101061g(qVar, "preference");
        bVar.f366734c.f331391a.edit().putInt("search_video_preview_autoplay", qVar.f29729e).apply();
        C47633f g = C47633f.m84733g(C60866ct.f164955a);
        C69664n.m101060f(g, "from(\n        discoverVi…rence(preference)\n      )");
        bVar.f366733b.mo50787a(g, "DISCOVER_VIDEO_AUTOPLAY_DATA_SOURCE");
        return g;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_setting_title);
        C69664n.m101060f(string, "context.resources.getStr…o_previews_setting_title)");
        return string;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
