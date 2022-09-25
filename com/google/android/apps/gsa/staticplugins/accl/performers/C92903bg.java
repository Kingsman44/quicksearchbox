package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88450bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88451bv;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88452bw;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51956fi;
import com.google.assistant.p3897e.p3921j.p3926e.C51958fk;
import com.google.assistant.p3897e.p3921j.p3926e.C51959fl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bg */
/* compiled from: PG */
public final class C92903bg extends C22538o {

    /* renamed from: a */
    public static final /* synthetic */ int f259176a = 0;

    /* renamed from: b */
    private static final C59071e f259177b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.bg");

    /* renamed from: c */
    private final C1800aq f259178c;

    /* renamed from: d */
    private final Context f259179d;

    /* renamed from: e */
    private final C86695q f259180e;

    /* renamed from: f */
    private final C68214a f259181f;

    public C92903bg(Context context, C1800aq aqVar, C86695q qVar, C68214a aVar) {
        this.f259179d = context;
        this.f259178c = aqVar;
        this.f259180e = qVar;
        this.f259181f = aVar;
    }

    /* renamed from: b */
    private static final C88431bb m152954b(C88451bv bvVar) {
        C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
        baVar.mo58885m(C88452bw.f239126a, bvVar);
        return (C88431bb) baVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C51959fl flVar;
        if (dyVar.f135936b.equals("ui.SHOW_NOTIFICATION")) {
            aas aas = null;
            try {
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                flVar = (C51959fl) m41992m(dwVar, "show_notification_args", C51959fl.f136335f.getParserForType());
            } catch (C22371a unused) {
                flVar = null;
            }
            if (flVar != null) {
                C51958fk a = C51958fk.m86453a(flVar.f136338b);
                if (a == null) {
                    a = C51958fk.UNKNOWN_TYPE;
                }
                if (a == C51958fk.WUWA) {
                    int a2 = C51956fi.m86452a(flVar.f136339c);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    String str = flVar.f136340d;
                    String str2 = flVar.f136341e;
                    if (a2 == 3) {
                        int i = flVar.f136337a;
                        if (!((i & 8) == 0 || (i & 4) == 0)) {
                            C88450bu buVar = (C88450bu) C88451bv.f239122c.createBuilder();
                            buVar.copyOnWrite();
                            C88451bv bvVar = (C88451bv) buVar.instance;
                            bvVar.f239124a = 2;
                            bvVar.f239125b = true;
                            PendingIntent a3 = C88483e.m142827a(this.f259179d, "wuwa", m152954b((C88451bv) buVar.build()), 268435456);
                            C1839z a4 = C89095d.m144923a(this.f259179d, (String) null);
                            a4.f5679J.icon = R.drawable.ic_assistant_light;
                            a4.f5670A = this.f259179d.getResources().getColor(R.color.google_blue);
                            a4.f5671B = 1;
                            a4.mo5015d(16, true);
                            a4.f5685e = C1839z.m5037c(str2);
                            a4.f5686f = C1839z.m5037c(str);
                            a4.f5690j = 1;
                            a4.mo5015d(2, true);
                            a4.mo5016e(R.drawable.ic_media_stop_light, this.f259179d.getResources().getString(R.string.opa_wuwa_notification_action_stop), a3);
                            NotificationChannel notificationChannel = new NotificationChannel("com.google.android.apps.gsa.staticplugins.accl.performers.ShowNotificationPerformer#WUWA", this.f259179d.getResources().getString(R.string.opa_wuwa_notification_title), 4);
                            notificationChannel.setDescription(this.f259179d.getResources().getString(R.string.opa_wuwa_notification_description));
                            notificationChannel.setSound((Uri) null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                            ((NotificationManager) this.f259179d.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
                            a4.f5675F = "com.google.android.apps.gsa.staticplugins.accl.performers.ShowNotificationPerformer#WUWA";
                            this.f259178c.mo5003b((String) null, C89885b.OKHTTP_UNEXPECTED_END_VALUE, a4.mo5013a());
                            C88450bu buVar2 = (C88450bu) C88451bv.f239122c.createBuilder();
                            buVar2.copyOnWrite();
                            C88451bv bvVar2 = (C88451bv) buVar2.instance;
                            bvVar2.f239124a = 4;
                            bvVar2.f239125b = true;
                            this.f259180e.mo80275j("wuwa", m152954b((C88451bv) buVar2.build()));
                        }
                    } else if (a2 == 2) {
                        C88450bu buVar3 = (C88450bu) C88451bv.f239122c.createBuilder();
                        buVar3.copyOnWrite();
                        C88451bv bvVar3 = (C88451bv) buVar3.instance;
                        bvVar3.f239124a = 3;
                        bvVar3.f239125b = true;
                        this.f259180e.mo80275j("wuwa", m152954b((C88451bv) buVar3.build()));
                    }
                } else {
                    ((C59052c) ((C59052c) f259177b.mo56226d()).mo56372aa(13123)).mo56389s("Unsupported notification type: %s", a);
                    int i2 = C90755l.f253831a;
                }
                return f62144n;
            }
            try {
                C51807dw dwVar2 = dyVar.f135938d;
                if (dwVar2 == null) {
                    dwVar2 = C51807dw.f135930b;
                }
                aas = (aas) m41992m(dwVar2, "notification_args", aas.f134661u.getParserForType());
            } catch (C22371a unused2) {
            }
            if (aas != null) {
                return C60922j.m93044g(((C85005h) this.f259181f.mo27525b()).mo78626j(aas.toByteArray()), C92902bf.f259175a, C60826bg.f164896a);
            }
        }
        throw new C22428d(dyVar);
    }
}
