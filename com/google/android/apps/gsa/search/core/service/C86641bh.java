package com.google.android.apps.gsa.search.core.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.handsfree.C74560c;
import com.google.android.apps.gsa.p5855h.p5861s.C74543ad;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.state.C87106ha;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.keepalive.C91051c;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91385o;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.service.bh */
/* compiled from: PG */
public final class C86641bh implements C87106ha {

    /* renamed from: a */
    private static final C59071e f234067a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.bh");

    /* renamed from: b */
    private final C91051c f234068b;

    /* renamed from: c */
    private final Context f234069c;

    /* renamed from: d */
    private final C91385o f234070d;

    /* renamed from: e */
    private final C68214a f234071e;

    /* renamed from: f */
    private final bo f234072f;

    /* renamed from: g */
    private final SharedPreferences f234073g;

    /* renamed from: h */
    private final C92486a f234074h;

    /* renamed from: i */
    private final bm f234075i;

    public C86641bh(C91051c cVar, Context context, C68214a aVar, SharedPreferences sharedPreferences, bo boVar, C92486a aVar2, bm bmVar, C91385o oVar) {
        this.f234068b = cVar;
        this.f234069c = context;
        this.f234070d = oVar;
        this.f234071e = aVar;
        this.f234073g = sharedPreferences;
        this.f234072f = boVar;
        this.f234074h = aVar2;
        this.f234075i = bmVar;
    }

    /* renamed from: b */
    private final PendingIntent m139565b(Intent intent) {
        return PendingIntent.getActivity(this.f234069c, 0, intent, 335544320);
    }

    /* renamed from: a */
    public final void mo80260a(int i) {
        Intent intent;
        int i2 = i;
        C58976aa aaVar = C58975e.f156826a;
        if ((i2 & 1) != 0) {
            this.f234068b.mo85320a(C89885b.S3REQUEST_BUILD_PINHOLE_PARAMS_FAILED_VALUE, C74560c.m120599a(this.f234069c));
        } else {
            this.f234068b.mo85321b(true);
        }
        Notification notification = null;
        if ((i2 & 2) != 0) {
            C9439b a = C9439b.m23955a(this.f234073g.getInt("hands_free_hotword_retraining_notification_source", 4));
            C89994f fVar = (C89994f) this.f234071e.mo27525b();
            String ab = fVar.mo83882ab();
            if (fVar.mo83847J(ab) && ((fVar.mo83824m(ab) || fVar.mo83817f()) && a != C9439b.HOTWORD_RETRAINING_NOTIFICATION_HOTWORD_UPGRADE && this.f234073g.getInt("hands_free_hotword_retraining_notification_state", 1) == 2)) {
                C59104x b = f234067a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ServiceForegroundHelper");
                ((C59052c) ((C59052c) b).mo56372aa(8448)).mo56389s("Auto dismissed notification %s", "hands_free_hotword_retraining_notification_state");
                this.f234073g.edit().putInt("hands_free_hotword_retraining_notification_state", 3).apply();
            }
            this.f234070d.mo85705h();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 347;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164109aP = a.f32835aq;
            ufVar2.f164251f |= 16;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            if (a.ordinal() != 4) {
                C74554t i3 = C74555u.m120572i();
                i3.mo70869c(a);
                intent = i3.mo70882h();
            } else {
                C74554t i4 = C74555u.m120572i();
                i4.mo70869c(C9439b.HOTWORD_RETRAINING_NOTIFICATION);
                C74543ad d = C74544ae.m120523d();
                d.mo70851c(af.c);
                i4.mo70872f(d.mo70849a());
                intent = i4.mo70882h();
            }
            PendingIntent b2 = m139565b(intent);
            Intent putExtra = new Intent().setClassName(this.f234069c, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 2);
            String[] strArr = new String[2];
            String d2 = this.f234074h.mo87230d();
            int ordinal = a.ordinal();
            if (ordinal == 4) {
                strArr[0] = this.f234069c.getString(R.string.search_service_hotword_retraining_notification_title, new Object[]{d2});
                strArr[1] = this.f234069c.getString(R.string.search_service_hotword_retraining_notification_content);
            } else if (ordinal != 32) {
                switch (ordinal) {
                    case 9:
                        strArr[0] = this.f234069c.getString(R.string.search_service_account_change_hotword_retraining_notification_title);
                        strArr[1] = this.f234069c.getString(R.string.search_service_account_change_hotword_retraining_notification_content, new Object[]{d2});
                        break;
                    case 10:
                        strArr[0] = this.f234069c.getString(R.string.search_service_audio_history_disabled_hotword_retraining_notification_title);
                        strArr[1] = this.f234069c.getString(R.string.search_service_audio_history_disabled_hotword_retraining_notification_content, new Object[]{d2});
                        break;
                    case 11:
                        strArr[0] = this.f234069c.getString(R.string.search_service_language_change_hotword_retraining_notification_title);
                        strArr[1] = this.f234069c.getString(R.string.search_service_language_change_hotword_retraining_notification_content, new Object[]{d2});
                        break;
                    default:
                        strArr[0] = this.f234069c.getString(R.string.search_service_misc_change_hotword_retraining_notification_title, new Object[]{d2});
                        strArr[1] = this.f234069c.getString(R.string.search_service_misc_change_hotword_retraining_notification_content);
                        break;
                }
            } else {
                strArr[0] = this.f234069c.getString(R.string.search_service_hotword_upgrade_retraining_notification_title, new Object[]{this.f234074h.mo87231e(((C89994f) this.f234071e.mo27525b()).mo83863Z())});
                strArr[1] = this.f234069c.getString(R.string.search_service_hotword_upgrade_retraining_notification_content);
            }
            PendingIntent service = PendingIntent.getService(this.f234069c, 0, putExtra, 335544320);
            C1839z a2 = C89095d.m144923a(this.f234069c, (String) null);
            a2.f5685e = C1839z.m5037c(strArr[0]);
            a2.f5686f = C1839z.m5037c(strArr[1]);
            a2.f5679J.icon = R.drawable.ic_mic_light;
            a2.f5687g = b2;
            a2.f5679J.deleteIntent = service;
            a2.mo5015d(16, true);
            notification = a2.mo5013a();
        } else if ((i2 & 16) != 0) {
            String d3 = this.f234074h.mo87230d();
            PendingIntent service2 = PendingIntent.getService(this.f234069c, 0, new Intent().setClassName(this.f234069c, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 16), 335544320);
            String string = this.f234069c.getString(R.string.trusted_voice_paused_notification_title);
            String string2 = this.f234069c.getString(R.string.trusted_voice_paused_notification_content, new Object[]{d3});
            if (this.f234075i.s()) {
                string = this.f234069c.getString(R.string.trusted_voice_paused_notification_with_overlay_title);
                string2 = this.f234069c.getString(R.string.trusted_voice_paused_notification_with_overlay_content);
            }
            C1839z a3 = C89095d.m144923a(this.f234069c, (String) null);
            a3.f5685e = C1839z.m5037c(string);
            a3.f5686f = C1839z.m5037c(string2);
            a3.f5679J.icon = R.drawable.ic_mic_light;
            a3.f5679J.deleteIntent = service2;
            a3.f5690j = 2;
            a3.mo5015d(16, true);
            a3.f5671B = 1;
            notification = a3.mo5013a();
        } else if ((i2 & 32) != 0) {
            notification = this.f234072f.t();
        } else if ((i2 & 128) != 0) {
            C89949q.m146523g(1362);
            Intent intent2 = new Intent(this.f234069c, ProxyActivity.class);
            C18509a c = C18522b.m35986c();
            ((C18523c) c).f52492a = "language";
            c.mo24023e("opa");
            PendingIntent b3 = m139565b(intent2.putExtra("android.intent.extra.INTENT", c.mo24020b().mo24031a()));
            PendingIntent service3 = PendingIntent.getService(this.f234069c, 0, new Intent().setClassName(this.f234069c, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.NOTIFICATION_DISMISSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 128), 335544320);
            String string3 = this.f234069c.getString(R.string.search_service_assistant_language_reconfiguring_notification_title);
            String string4 = this.f234069c.getString(R.string.search_service_assistant_language_reconfiguring_notification_content);
            C1839z a4 = C89095d.m144923a(this.f234069c, (String) null);
            a4.f5685e = C1839z.m5037c(string3);
            a4.f5686f = C1839z.m5037c(string4);
            a4.f5679J.icon = R.drawable.ic_assistant_light;
            a4.f5687g = b3;
            a4.f5679J.deleteIntent = service3;
            a4.mo5015d(16, true);
            notification = a4.mo5013a();
        }
        if (notification != null) {
            this.f234070d.mo85703f(C59002s.f156871a, C89885b.S3REQUEST_BUILD_RECOGNIZER_VOCABULARY_CONTEXT_FAILED_VALUE, notification);
        } else {
            this.f234070d.mo85704g();
        }
    }
}
