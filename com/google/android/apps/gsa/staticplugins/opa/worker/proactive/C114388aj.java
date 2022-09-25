package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.C1787ad;
import androidx.core.app.C1802as;
import androidx.core.app.C1803at;
import androidx.core.app.C1839z;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9608e.C127525a;
import com.google.android.apps.search.assistant.verticals.reminders.p10074a.C132540c;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1646ay.C19601c;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.libraries.search.assistant.proactive.C36205aa;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.android.libraries.search.assistant.proactive.p2772d.C36255a;
import com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36318b;
import com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36319c;
import com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36320d;
import com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36321e;
import com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36322f;
import com.google.apps.tiktok.media.C47449e;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47877k;
import com.google.p3717aq.p3718a.p3719a.C47883q;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.aj */
/* compiled from: PG */
public final class C114388aj {

    /* renamed from: a */
    public static final C59071e f317173a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.aj");

    /* renamed from: g */
    private static final C58528ij f317174g = new C58759qy("https://assistant.google.com/reminders/mainview");

    /* renamed from: h */
    private static final C58528ij f317175h = C58528ij.m90014N("android.intent.action.SEND", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_CLICKED", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_LAUNCH_DRIVING_SETTINGS", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOT_DRIVING", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_DISMISS");

    /* renamed from: b */
    public final Context f317176b;

    /* renamed from: c */
    public final C22871g f317177c;

    /* renamed from: d */
    public final C47449e f317178d;

    /* renamed from: e */
    public final C36255a f317179e;

    /* renamed from: f */
    public final C36205aa f317180f;

    /* renamed from: i */
    private final PackageManager f317181i;

    /* renamed from: j */
    private final C68214a f317182j;

    /* renamed from: k */
    private final C68214a f317183k;

    /* renamed from: l */
    private final C127525a f317184l;

    public C114388aj(Context context, C22871g gVar, C47449e eVar, PackageManager packageManager, C68214a aVar, C68214a aVar2, C127525a aVar3, C36255a aVar4, C36205aa aaVar) {
        this.f317176b = context;
        this.f317177c = gVar;
        this.f317178d = eVar;
        this.f317181i = packageManager;
        this.f317182j = aVar;
        this.f317183k = aVar2;
        this.f317184l = aVar3;
        this.f317180f = aaVar;
        this.f317179e = aVar4;
    }

    /* renamed from: c */
    public static C1787ad m189692c(C47883q qVar) {
        C1802as asVar = new C1802as();
        asVar.f5624a = qVar.f123960a;
        C1787ad adVar = new C1787ad(qVar.f123961b, qVar.f123962c, new C1803at(asVar));
        if (!qVar.f123963d.isEmpty()) {
            String str = qVar.f123963d;
            Uri parse = Uri.parse(qVar.f123964e);
            adVar.f5571d = str;
            adVar.f5572e = parse;
        }
        return adVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = com.google.assistant.p3897e.p3921j.aau.m86270a(r1.f134706m);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m189693d(com.google.p3717aq.p3718a.p3719a.C47868b r0, com.google.assistant.p3897e.p3921j.abc r1) {
        /*
            boolean r0 = r0.f123942e
            if (r0 == 0) goto L_0x0012
            int r0 = r1.f134706m
            int r0 = com.google.assistant.p3897e.p3921j.aau.m86270a(r0)
            if (r0 != 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            r1 = 2
            if (r0 != r1) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114388aj.m189693d(com.google.aq.a.a.b, com.google.assistant.e.j.abc):boolean");
    }

    /* renamed from: e */
    public static int m189694e(int i) {
        int i2 = i - 2;
        if (i2 == 0) {
            return R.drawable.logo_assistant_notifications_48;
        }
        if (i2 == 2) {
            return R.drawable.morris_notification_icon_48;
        }
        ((C59052c) ((C59052c) f317173a.mo56226d()).mo56372aa(28978)).mo56386p("Couldn't resolve notification large icon");
        return R.drawable.logo_assistant_notifications_48;
    }

    /* renamed from: a */
    public final Intent mo101308a(C47868b bVar) {
        C51805du duVar;
        C58833ax axVar;
        Intent b;
        String F = ((C86054o) this.f317183k.mo27525b()).mo79659F();
        for (String str : bVar.f123940c) {
            C58833ax a = C36321e.m64808a(str, F);
            if (!a.mo56113h()) {
                a = C36322f.m64809a(str);
                if (a.mo56113h()) {
                    return (Intent) a.mo56107c();
                }
            }
            if (!a.mo56113h()) {
                a = C36318b.m64803b(str);
                if (a.mo56113h()) {
                    return (Intent) a.mo56107c();
                }
            }
            if (!axVar.mo56113h()) {
                if (C58837ba.m90859h(str) || !str.startsWith("assistant-notification://try-saying")) {
                    axVar = C58836b.f156633a;
                } else {
                    String queryParameter = Uri.parse(str).getQueryParameter("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.TrySayingUtil.EXTRA_QUERY");
                    if (queryParameter == null) {
                        axVar = C58836b.f156633a;
                    } else {
                        axVar = C58833ax.m90834k(new Intent().putExtra("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.TrySayingUtil.EXTRA_QUERY", queryParameter));
                    }
                }
                if (axVar.mo56113h()) {
                    return (Intent) axVar.mo56107c();
                }
            }
            if (!axVar.mo56113h() && (b = C36619a.m65146b(this.f317176b)) != null && str.equals(b.toUri(0))) {
                return b;
            }
            if (!axVar.mo56113h()) {
                axVar = C36319c.m64806a(str);
                if (axVar.mo56113h()) {
                    return (Intent) axVar.mo56107c();
                }
            }
            if (!axVar.mo56113h() && this.f317180f.f94588f) {
                axVar = C36320d.m64807a(str);
                if (axVar.mo56113h()) {
                    return (Intent) axVar.mo56107c();
                }
            }
            if (!axVar.mo56113h()) {
                try {
                    if (((C58759qy) f317174g).f156534a.equals(str)) {
                        String languageTag = ((ae) this.f317182j.mo27525b()).d(C58837ba.m90858g(((C86054o) this.f317183k.mo27525b()).mo79659F())).toLanguageTag();
                        if (languageTag == null) {
                            languageTag = Locale.getDefault().toLanguageTag();
                        }
                        if (this.f317180f.f94584b) {
                            return C132540c.m215470c(languageTag);
                        }
                        Uri parse = Uri.parse(str);
                        if (!TextUtils.isEmpty(languageTag)) {
                            parse = parse.buildUpon().appendQueryParameter("hl", languageTag).build();
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", parse);
                        intent.putExtra("full_screen", true);
                        intent.putExtra("hide_status_bar", true);
                        intent.putExtra("screen_orientation", true);
                        intent.putExtra("inappwebpage-dark-mode-allowed", true);
                        return C19601c.m37394a("inappwebpage", intent, new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.dynamichosts.NoOrientationConfigVelvetDynamicHostActivity"), true);
                    }
                    axVar = C58833ax.m90834k(Intent.parseUri(str, 0));
                } catch (URISyntaxException unused) {
                }
            }
            if (!axVar.mo56113h()) {
                ((C59052c) ((C59052c) f317173a.mo56226d()).mo56372aa(28980)).mo56389s("Unable to parse candidate URI: %s", str);
            } else if ("com.google.android.gm.intent.VIEW_PLID".equals(((Intent) axVar.mo56107c()).getAction())) {
                if (!TextUtils.isEmpty(F)) {
                    C144354b.m234631a(this.f317176b, (Intent) axVar.mo56107c(), AccountData.m234630a(F));
                }
                return (Intent) axVar.mo56107c();
            } else {
                Intent intent2 = (Intent) axVar.mo56107c();
                if (intent2 != null) {
                    if (intent2.getComponent() != null) {
                        ComponentName component = intent2.getComponent();
                        component.getClass();
                        if (component.getClassName().equals("com.google.android.apps.gsa.staticplugins.opa.ZeroStateActivity")) {
                            return (Intent) axVar.mo56107c();
                        }
                    }
                    Uri data = intent2.getData();
                    if (!(data == null || data.toString() == null || !data.toString().startsWith("googleassistant://zerostate?data="))) {
                        return (Intent) axVar.mo56107c();
                    }
                }
                if (f317175h.contains(((Intent) axVar.mo56107c()).getAction())) {
                    return (Intent) axVar.mo56107c();
                }
                List<ResolveInfo> queryIntentActivities = this.f317181i.queryIntentActivities((Intent) axVar.mo56107c(), 65536);
                if (!queryIntentActivities.isEmpty()) {
                    String str2 = queryIntentActivities.get(0).activityInfo.packageName;
                    Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (this.f317176b.getPackageName().equals(it.next().activityInfo.packageName)) {
                                str2 = this.f317176b.getPackageName();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    ((Intent) axVar.mo56107c()).setPackage(str2);
                    return (Intent) axVar.mo56107c();
                } else if (((Intent) axVar.mo56107c()).getBooleanExtra("NGA_PIE", false)) {
                    return (Intent) axVar.mo56107c();
                }
            }
        }
        if (bVar.f123938a != 2) {
            return null;
        }
        Bundle d = this.f317184l.mo98052d();
        if (bVar.f123938a == 2) {
            duVar = (C51805du) bVar.f123939b;
        } else {
            duVar = C51805du.f135924e;
        }
        d.putByteArray("client_input", duVar.toByteArray());
        d.putInt("requested_mic_state", 1);
        d.putBoolean("opa_client_input_start_new_session", true);
        d.putInt("triggered_by", 24);
        return this.f317184l.mo81687a(this.f317176b, d, 268468224);
    }

    /* renamed from: b */
    public final C1839z mo101309b(aas aas, C36334o oVar) {
        Object obj;
        int i;
        int i2;
        Context context = this.f317176b;
        C1839z zVar = new C1839z(context, (String) null);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        String num = Integer.toString(27);
        if (notificationManager.getNotificationChannel(num) == null) {
            String string = context.getResources().getString(R.string.miscellaneous_notification_channel);
            String string2 = context.getResources().getString(R.string.miscellaneous_notification_channel);
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string2);
            if (notificationChannel == null) {
                i2 = 2;
            } else {
                int importance = notificationChannel.getImportance();
                notificationManager.deleteNotificationChannel(string2);
                i2 = importance;
            }
            notificationManager.createNotificationChannel(new NotificationChannel(num, string, i2));
        }
        zVar.f5675F = num;
        zVar.mo5015d(16, true);
        zVar.mo5015d(8, true);
        zVar.f5670A = C1878d.m5128a(this.f317176b, R.color.google_blue);
        C62940bt r0 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r0);
        Object l = aas.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C47887u uVar = ((abc) obj).f134698e;
        if (uVar == null) {
            uVar = C47887u.f123976l;
        }
        int b = C47877k.m85094b(uVar.f123987j);
        if (b == 0) {
            b = 1;
        }
        switch (b - 2) {
            case 1:
                i = R.drawable.ic_google_home_googblue_24dp;
                break;
            case 2:
                i = R.drawable.ic_settings_googblue_24dp;
                break;
            case 3:
                i = R.drawable.quantum_ic_rss_feed_googblue_24;
                break;
            case 4:
                i = R.drawable.quantum_ic_cloud_googblue_24;
                break;
            case 5:
                i = R.drawable.quantum_ic_tag_faces_googblue_24;
                break;
            case 6:
                i = R.drawable.quantum_ic_format_quote_googblue_24;
                break;
            case 7:
                i = R.drawable.quantum_ic_play_arrow_googblue_24;
                break;
            case 8:
                i = R.drawable.quantum_ic_news_googblue_24;
                break;
            case 9:
                i = R.drawable.quantum_ic_trending_up_googblue_24;
                break;
            case 10:
                i = R.drawable.quantum_ic_theaters_googblue_24;
                break;
            case 11:
                i = R.drawable.quantum_ic_flight_takeoff_googblue_24;
                break;
            case 12:
                i = R.drawable.quantum_ic_favorite_border_googblue_24;
                break;
            case 13:
                i = R.drawable.ic_reminder;
                break;
            case 14:
                i = R.drawable.ic_music_note_blue;
                break;
            case 15:
                i = R.drawable.quantum_ic_cake_googblue_24;
                break;
            case 16:
                i = R.drawable.ic_restaurant_googblue_24;
                break;
            case 17:
                i = R.drawable.quantum_gm_ic_time_to_leave_googblue_24;
                break;
            case 18:
                i = R.drawable.quantum_gm_ic_directions_transit_googblue_24;
                break;
            case 19:
                i = R.drawable.quantum_gm_ic_local_offer_googblue_24;
                break;
            case 20:
                i = R.drawable.quantum_gm_ic_shopping_cart_gm_blue_24;
                break;
            default:
                i = R.drawable.ic_assistant_light;
                break;
        }
        zVar.f5679J.icon = i;
        int i3 = aas.f134663a & 512;
        zVar.f5699s = i3 != 0 ? aas.f134671i : "opa_proactive";
        zVar.f5700t = !(i3 != 0);
        zVar.f5675F = oVar.f94887a;
        zVar.f5690j = oVar.f94889c;
        if (!this.f317176b.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            zVar.f5694n = C1839z.m5037c(this.f317176b.getString(R.string.opa_proactive_notification_subtext));
        }
        return zVar;
    }
}
