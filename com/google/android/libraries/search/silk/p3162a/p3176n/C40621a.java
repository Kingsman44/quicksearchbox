package com.google.android.libraries.search.silk.p3162a.p3176n;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C1793aj;
import androidx.core.app.C1794ak;
import androidx.core.app.C1800aq;
import com.google.android.libraries.silk.p3205a.p3229r.C41732a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4313r.C56803a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4313r.C56805c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4313r.C56813k;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;

/* renamed from: com.google.android.libraries.search.silk.a.n.a */
/* compiled from: PG */
public final class C40621a implements C41732a {

    /* renamed from: a */
    private static final C59071e f106603a = C59071e.m91332i("com.google.android.libraries.search.silk.a.n.a");

    /* renamed from: b */
    private static final C56848d f106604b;

    /* renamed from: c */
    private final Context f106605c;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "notification_settings_not_found";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        dVar2.f151671a |= 2;
        dVar2.f151673c = "Notification activity not found";
        f106604b = (C56848d) cVar.build();
    }

    public C40621a(Context context) {
        this.f106605c = context;
    }

    /* renamed from: a */
    public final C60870cx mo42560a() {
        C56803a aVar = (C56803a) C56805c.f151584c.createBuilder();
        if (C1793aj.m4937b(new C1800aq(this.f106605c).f5622a)) {
            aVar.copyOnWrite();
            C56805c cVar = (C56805c) aVar.instance;
            cVar.f151587b = 2;
            cVar.f151586a = 1 | cVar.f151586a;
        } else {
            aVar.copyOnWrite();
            C56805c cVar2 = (C56805c) aVar.instance;
            cVar2.f151587b = 1;
            cVar2.f151586a = 1 | cVar2.f151586a;
        }
        return C60856cj.m92900i((C56805c) aVar.build());
    }

    /* renamed from: b */
    public final C60870cx mo42561b(C56813k kVar) {
        Intent intent;
        try {
            Context context = this.f106605c;
            String num = Integer.toString(kVar.f151600a);
            Context context2 = this.f106605c;
            if (C1793aj.m4937b(new C1800aq(context2).f5622a)) {
                if (C1794ak.m4938a(new C1800aq(context2).f5622a, num) != null) {
                    intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").setFlags(268435456).putExtra("app_package", context2.getPackageName()).putExtra("app_uid", context2.getApplicationInfo().uid).putExtra("android.provider.extra.APP_PACKAGE", context2.getPackageName()).putExtra("android.provider.extra.CHANNEL_ID", num);
                    context.startActivity(intent);
                    return C60866ct.f164955a;
                }
            }
            intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context2.getPackageName());
            intent.putExtra("app_uid", context2.getApplicationInfo().uid);
            intent.putExtra("android.provider.extra.APP_PACKAGE", context2.getPackageName());
            intent.setFlags(268435456);
            context.startActivity(intent);
            return C60866ct.f164955a;
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f106603a.mo56225c()).mo56382g(e)).mo56372aa(53380)).mo56386p("Opening uri failed");
            return C60856cj.m92899h(new C41742a(f106604b));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo42562c() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method SilkNotificationV2Api.handleNotificationClientAction not implemented!"));
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo42563d() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method SilkNotificationV2Api.handleNotificationOptInPromoClientAction not implemented!"));
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo42564e() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method SilkNotificationV2Api.renderNotificationMenu not implemented!"));
    }
}
