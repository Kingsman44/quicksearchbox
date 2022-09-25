package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.p5855h.p5859o.C74539a;
import com.google.android.apps.gsa.search.core.google.C85869b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98595a;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.share.C133852b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1880l.C22873a;
import com.google.android.libraries.gsa.p1880l.C22875c;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.common.p4552o.C60494rz;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.p */
/* compiled from: PG */
public final class C98685p {

    /* renamed from: a */
    public final Context f275663a;

    /* renamed from: b */
    public final C68214a f275664b;

    /* renamed from: c */
    public final C84474e f275665c;

    /* renamed from: d */
    public final C84515a f275666d;

    /* renamed from: e */
    public final PendingIntent f275667e;

    /* renamed from: f */
    public final C86054o f275668f;

    /* renamed from: g */
    public final C98595a f275669g;

    /* renamed from: h */
    public final C85869b f275670h;

    /* renamed from: i */
    private final int f275671i;

    public C98685p(Context context, C68214a aVar, C84474e eVar, int i, C84515a aVar2, C86054o oVar, C85869b bVar, C98595a aVar3) {
        this.f275663a = context;
        this.f275664b = aVar;
        this.f275665c = eVar;
        this.f275667e = m163473f(new Intent(), i, 0, context);
        this.f275671i = i;
        this.f275666d = aVar2;
        this.f275668f = oVar;
        this.f275669g = aVar3;
        this.f275670h = bVar;
    }

    /* renamed from: b */
    public static Bundle m163472b(PendingIntent pendingIntent, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
        return bundle;
    }

    /* renamed from: f */
    private static PendingIntent m163473f(Intent intent, int i, int i2, Context context) {
        return PendingIntent.getActivity(context, i + i + i2, intent, true != C1888a.m5149c() ? 134217728 : 167772160);
    }

    /* renamed from: g */
    private final Bundle m163474g(PendingIntent pendingIntent, int i, int i2, int i3, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        if (true == z) {
            i = 0;
        }
        bundle.putInt("android.support.customtabs.customaction.ID", i);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", BitmapFactory.decodeResource(this.f275663a.getResources(), i2));
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", this.f275663a.getResources().getString(i3));
        if (!z) {
            bundle.putBoolean("android.support.customtabs.customaction.SHOW_ON_TOOLBAR", true);
        }
        return bundle;
    }

    /* renamed from: a */
    public final PendingIntent mo91258a(Intent intent) {
        return m163473f(intent, this.f275671i, 0, this.f275663a);
    }

    /* renamed from: c */
    public final Bundle mo91259c(String str, String str2) {
        Intent intent = new Intent(str);
        intent.setClassName(this.f275663a, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
        intent.addFlags(268435456);
        return m163472b(PendingIntent.getBroadcast(this.f275663a, 0, intent, true != C1888a.m5149c() ? 134217728 : 167772160), str2);
    }

    /* renamed from: d */
    public final Bundle mo91260d(Intent intent, boolean z) {
        Uri data = intent.getData();
        C22873a aVar = (C22873a) C22876d.f62944x.createBuilder();
        aVar.copyOnWrite();
        C22876d dVar = (C22876d) aVar.instance;
        dVar.f62946a |= 1;
        dVar.f62947b = true;
        aVar.copyOnWrite();
        C22876d dVar2 = (C22876d) aVar.instance;
        dVar2.f62946a |= 1024;
        dVar2.f62955j = false;
        aVar.copyOnWrite();
        C22876d dVar3 = (C22876d) aVar.instance;
        dVar3.f62946a |= 256;
        dVar3.f62953h = 0;
        String uri = data.toString();
        aVar.copyOnWrite();
        C22876d dVar4 = (C22876d) aVar.instance;
        uri.getClass();
        dVar4.f62946a |= 2;
        dVar4.f62948c = uri;
        C22875c cVar = C22875c.PAGE;
        aVar.copyOnWrite();
        C22876d dVar5 = (C22876d) aVar.instance;
        dVar5.f62951f = cVar.f62943e;
        dVar5.f62946a |= 16;
        aVar.copyOnWrite();
        C22876d dVar6 = (C22876d) aVar.instance;
        dVar6.f62954i = 1;
        dVar6.f62946a |= 512;
        return m163474g(m163473f(C74539a.m120513a((C22876d) aVar.build()).addFlags(268435456), this.f275671i, 1, this.f275663a), 100, (intent.getIntExtra("com.google.android.apps.gsa.customtabs.SOURCE", 0) == C60494rz.COLLECTIONS.f163762v || intent.getBooleanExtra("com.google.android.apps.gsa.customtabs.IS_SAVED", false)) ? R.drawable.quantum_gm_ic_bookmark_gm_grey_48 : R.drawable.quantum_gm_ic_bookmark_border_gm_grey_48, R.string.save_action, z);
    }

    /* renamed from: e */
    public final Bundle mo91261e(boolean z) {
        return m163474g(mo91258a(C133852b.m217126a()), 101, R.drawable.quantum_gm_ic_share_gm_grey_48, R.string.custom_tabs_menu_item_share, z);
    }
}
