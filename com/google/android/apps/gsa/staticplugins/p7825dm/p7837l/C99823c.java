package com.google.android.apps.gsa.staticplugins.p7825dm.p7837l;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import androidx.core.app.C1793aj;
import androidx.core.app.C1794ak;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.search.core.p6500ac.C84397a;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.preferences.notification.C86327b;
import com.google.android.apps.gsa.search.shared.p6929g.C87556d;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4313r.C56803a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4313r.C56805c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4313r.C56813k;
import com.google.protobuf.C62974ct;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.l.c */
/* compiled from: PG */
public final class C99823c {

    /* renamed from: a */
    private final C89688a f279262a;

    /* renamed from: b */
    private final C84411o f279263b;

    /* renamed from: c */
    private final C22871g f279264c;

    /* renamed from: d */
    private final Context f279265d;

    /* renamed from: e */
    private final C91097g f279266e;

    /* renamed from: f */
    private final C86327b f279267f;

    public C99823c(C89688a aVar, Context context, C91097g gVar, C84411o oVar, C22871g gVar2, C86327b bVar) {
        this.f279262a = aVar;
        this.f279265d = context;
        this.f279266e = gVar;
        this.f279263b = oVar;
        this.f279264c = gVar2;
        this.f279267f = bVar;
    }

    @JavascriptInterface
    public void getNotificationOptInStatus(String str, String str2) {
        C84410n a = this.f279263b.mo77963a(str, str2, this.f279262a);
        C56803a aVar = (C56803a) C56805c.f151584c.createBuilder();
        if (!C1793aj.m4937b(this.f279267f.f233414a.f5622a)) {
            aVar.copyOnWrite();
            C56805c cVar = (C56805c) aVar.instance;
            cVar.f151587b = 1;
            cVar.f151586a = 1 | cVar.f151586a;
        } else {
            aVar.copyOnWrite();
            C56805c cVar2 = (C56805c) aVar.instance;
            cVar2.f151587b = 2;
            cVar2.f151586a = 1 | cVar2.f151586a;
        }
        C60870cx i = C60856cj.m92900i((C56805c) aVar.build());
        C22871g gVar = this.f279264c;
        Objects.requireNonNull(a);
        C90873ag agVar = new C90873ag(i, gVar, "SilkNotificationApiImpl getNotificationOptInStatus", new C99821a(a));
        Objects.requireNonNull(a);
        agVar.mo85223a(new C99822b(a));
    }

    @JavascriptInterface
    public void showNotificationOptInPage(String str, String str2, String str3) {
        int i;
        Intent intent;
        C84410n a = this.f279263b.mo77963a(str2, str3, this.f279262a);
        try {
            i = ((C56813k) C87556d.m142212a(str, C56813k.f151598b.getParserForType())).f151600a;
        } catch (C62974ct unused) {
            a.mo77959a(new C84397a());
            i = 0;
        }
        C91097g gVar = this.f279266e;
        Context context = this.f279265d;
        String num = Integer.toString(i);
        C1800aq aqVar = new C1800aq(context);
        if (!C1793aj.m4937b(aqVar.f5622a) || C1794ak.m4938a(aqVar.f5622a, num) == null) {
            intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").putExtra("app_package", context.getPackageName()).putExtra("app_uid", context.getApplicationInfo().uid).putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName()).putExtra("android.provider.extra.CHANNEL_ID", num);
        }
        gVar.mo65089a(intent);
        a.mo77962d("{}");
    }
}
