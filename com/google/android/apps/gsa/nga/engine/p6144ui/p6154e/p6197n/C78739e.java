package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6197n;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.core.p094f.C1888a;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.C78728n;
import com.google.android.apps.gsa.nga.shared.android.C80955k;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.n.e */
/* compiled from: PG */
public final class C78739e extends BroadcastReceiver implements C78728n {

    /* renamed from: a */
    public final C59071e f216770a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.n.e");

    /* renamed from: b */
    public final C68214a f216771b;

    /* renamed from: c */
    public final C22871g f216772c;

    /* renamed from: d */
    private final Context f216773d;

    /* renamed from: e */
    private final C91142g f216774e;

    /* renamed from: f */
    private boolean f216775f = false;

    public C78739e(C68214a aVar, C22871g gVar, Context context, C91142g gVar2) {
        this.f216771b = aVar;
        this.f216772c = gVar;
        this.f216773d = context;
        this.f216774e = gVar2;
    }

    /* renamed from: a */
    public final PendingIntent mo73593a(String str) {
        return PendingIntent.getBroadcast(this.f216773d, 0, C80955k.m128811a(this, C78737c.f216769a).setAction("com.google.android.apps.googlequicksearchbox.nga.action.SYS_UI_EVENT").setData(Uri.fromParts(BuildConfig.FLAVOR, "//com.google.android.apps.googlequicksearchbox.nga", str)).setFlags(268435456).putExtra("type", str), true != C1888a.m5149c() ? 134217728 : 167772160);
    }

    /* renamed from: h */
    public final void mo73112h() {
        ((C59052c) ((C59052c) this.f216770a.mo56224b()).mo56372aa(5285)).mo56389s("onDisabled. Registered: %s", Boolean.valueOf(this.f216775f));
        if (this.f216775f) {
            this.f216773d.unregisterReceiver(this);
            this.f216775f = false;
        }
    }

    /* renamed from: i */
    public final void mo73113i() {
        ((C59052c) ((C59052c) this.f216770a.mo56224b()).mo56372aa(5286)).mo56389s("onEnabled. Registered: %s", Boolean.valueOf(this.f216775f));
        if (!this.f216775f) {
            IntentFilter intentFilter = new IntentFilter("com.google.android.apps.googlequicksearchbox.nga.action.SYS_UI_EVENT");
            intentFilter.addDataScheme(BuildConfig.FLAVOR);
            this.f216773d.registerReceiver(this, intentFilter);
            this.f216775f = true;
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo73114j() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo73115k() {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f216774e.mo85405j(C90126fx.f251121co)) {
            C80955k.m128813c(intent).ifPresent(C78729a.f216735a);
        }
    }
}
