package com.google.android.apps.gsa.search.shared.p6930h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.assistant.p3897e.p3912f.C51209d;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.search.shared.h.i */
/* compiled from: PG */
public final class C87566i {
    private C87566i() {
    }

    /* renamed from: A */
    public static Bundle m142226A(String str) {
        C87565h hVar = new C87565h();
        hVar.f236560f = 2;
        hVar.f236556b = e.al;
        hVar.f236558d = 4;
        hVar.f236523a = str;
        hVar.f236514R = 33;
        hVar.f236499C = true;
        return hVar.mo81685a();
    }

    /* renamed from: B */
    public static Bundle m142227B(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getExtras();
    }

    /* renamed from: C */
    public static Bundle m142228C(Bundle bundle) {
        if (bundle != null) {
            return bundle.getBundle("session_context");
        }
        return null;
    }

    /* renamed from: D */
    public static Bundle m142229D(Bundle bundle) {
        if (bundle != null) {
            return bundle.getBundle("share_intent_data");
        }
        return null;
    }

    /* renamed from: E */
    public static Query m142230E(Bundle bundle) {
        if (bundle != null) {
            return (Query) bundle.getParcelable("nga_cloud_handover_query");
        }
        return null;
    }

    /* renamed from: F */
    public static Query m142231F(Bundle bundle) {
        if (bundle != null) {
            return (Query) bundle.getParcelable("opa-query");
        }
        return null;
    }

    /* renamed from: G */
    public static QueryTriggerType m142232G(Bundle bundle) {
        if (bundle != null) {
            return (QueryTriggerType) bundle.getSerializable("opa-query-trigger-type");
        }
        return null;
    }

    /* renamed from: H */
    public static C51209d m142233H(Bundle bundle) {
        if (bundle == null) {
            return C51209d.UNKNOWN_SOURCE;
        }
        C51209d a = C51209d.m86086a(bundle.getInt("request_source_type"));
        return a != null ? a : C51209d.UNKNOWN_SOURCE;
    }

    /* renamed from: I */
    public static String m142234I(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("app_integration_client_package_name");
        }
        return null;
    }

    /* renamed from: J */
    public static String m142235J(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("device_model_id");
        }
        return null;
    }

    /* renamed from: K */
    public static String m142236K(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("education_query");
        }
        return null;
    }

    /* renamed from: L */
    public static String m142237L(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("feedback_category");
        }
        return null;
    }

    /* renamed from: M */
    public static String m142238M(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("session_context")) == null) {
            return null;
        }
        return bundle2.getString("android.intent.extra.ASSIST_PACKAGE");
    }

    /* renamed from: N */
    public static String m142239N(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("parent_event_id");
        }
        return null;
    }

    /* renamed from: O */
    public static String m142240O(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("opa-query-string");
        }
        return null;
    }

    /* renamed from: P */
    public static String m142241P(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("source");
        }
        return null;
    }

    /* renamed from: Q */
    public static String m142242Q(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("system_message");
        }
        return null;
    }

    /* renamed from: R */
    public static String m142243R(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("opa_trusted_google_app_promo_suggestion_id");
        }
        return null;
    }

    /* renamed from: S */
    public static String m142244S(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("user_transcription");
        }
        return null;
    }

    /* renamed from: T */
    public static String m142245T(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("opa-query-ved");
        }
        return null;
    }

    /* renamed from: U */
    public static String m142246U(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("opa_zero_state_deep_link_data");
        }
        return null;
    }

    /* renamed from: V */
    public static ArrayList m142247V(Bundle bundle) {
        if (bundle != null) {
            return bundle.getStringArrayList("hinted_phrases");
        }
        return null;
    }

    /* renamed from: W */
    public static boolean m142248W(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("force_check_udc");
    }

    /* renamed from: X */
    public static boolean m142249X(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("force_run_onboarding");
    }

    /* renamed from: Y */
    public static boolean m142250Y(Bundle bundle) {
        return bundle != null && bundle.getBoolean("suppress_tts_for_text_queries", false);
    }

    /* renamed from: Z */
    public static boolean m142251Z(Bundle bundle) {
        return (bundle == null || bundle.getInt("intent_launch_flags", -1) == -1) ? false : true;
    }

    /* renamed from: a */
    public static int m142252a(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt("audio_session_id");
    }

    /* renamed from: aA */
    public static boolean m142253aA(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_client_input_start_new_session", false);
    }

    /* renamed from: aB */
    public static boolean m142254aB(Bundle bundle) {
        return bundle != null && bundle.getBoolean("force_open_keyboard");
    }

    /* renamed from: aC */
    public static boolean m142255aC(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_force_zero_state_refresh_on_startup");
    }

    /* renamed from: aD */
    public static boolean m142256aD(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_hide_greeting_bubble", false);
    }

    /* renamed from: aE */
    public static boolean m142257aE(Bundle bundle) {
        return bundle != null && bundle.getBoolean("load_last_results", false);
    }

    /* renamed from: aF */
    public static boolean m142258aF(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_show_docked_ui", false);
    }

    /* renamed from: aG */
    public static boolean m142259aG(Bundle bundle) {
        return bundle != null && bundle.getBoolean("show_language_now_supported");
    }

    /* renamed from: aH */
    public static boolean m142260aH(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_show_on_lockscreen", false);
    }

    /* renamed from: aI */
    public static boolean m142261aI(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_start_dreamliner_overlay", false);
    }

    /* renamed from: aJ */
    public static boolean m142262aJ(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_start_immersive_canvas", false);
    }

    /* renamed from: aK */
    public static boolean m142263aK(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_ambient_mode", false);
    }

    /* renamed from: aL */
    public static boolean m142264aL(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_start_full_screen", false);
    }

    /* renamed from: aM */
    public static boolean m142265aM(Bundle bundle) {
        return bundle != null && bundle.getBoolean("start_intent_launcher");
    }

    /* renamed from: aN */
    public static boolean m142266aN(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_start_mini_plate_mode", false);
    }

    /* renamed from: aO */
    public static boolean m142267aO(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_start_proactive_overlay", false);
    }

    /* renamed from: aP */
    public static boolean m142268aP(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_start_quantum_keyboard_overlay", false);
    }

    /* renamed from: aQ */
    public static boolean m142269aQ(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_start_warmer_welcome", false);
    }

    /* renamed from: aR */
    public static boolean m142270aR(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa_start_zero_state", false);
    }

    /* renamed from: aS */
    public static boolean m142271aS(Bundle bundle) {
        return bundle != null && bundle.getBoolean("opa-trust-user-if-on-trusted-device", false);
    }

    /* renamed from: aT */
    public static byte[] m142272aT(Bundle bundle) {
        if (bundle != null) {
            return bundle.getByteArray("opa-aog-discovery-info");
        }
        return null;
    }

    /* renamed from: aU */
    public static byte[] m142273aU(Bundle bundle) {
        if (bundle != null) {
            return bundle.getByteArray("app_integration_client_voice_plate_params");
        }
        return null;
    }

    /* renamed from: aV */
    public static byte[] m142274aV(Bundle bundle) {
        if (bundle != null) {
            return bundle.getByteArray("client_input");
        }
        return null;
    }

    /* renamed from: aW */
    public static byte[] m142275aW(Bundle bundle) {
        if (bundle != null) {
            return bundle.getByteArray("opa-query-conversation-delta");
        }
        return null;
    }

    /* renamed from: aX */
    public static byte[] m142276aX(Bundle bundle) {
        if (bundle != null) {
            return bundle.getByteArray("ui_stats_attachment");
        }
        return null;
    }

    /* renamed from: aa */
    public static boolean m142277aa(Bundle bundle) {
        return bundle != null && bundle.getBoolean("has_prompted_hotword", false);
    }

    /* renamed from: ab */
    public static boolean m142278ab(Bundle bundle) {
        return bundle != null && bundle.getBoolean("from_app_actions");
    }

    /* renamed from: ac */
    public static boolean m142279ac(Bundle bundle) {
        return bundle != null && bundle.getBoolean("from_assist_layer", false);
    }

    /* renamed from: ad */
    public static boolean m142280ad(Bundle bundle) {
        return bundle != null && bundle.getBoolean("from_blp");
    }

    /* renamed from: ae */
    public static boolean m142281ae(Bundle bundle) {
        return bundle != null && bundle.getBoolean("from_error_activity", false);
    }

    /* renamed from: af */
    public static boolean m142282af(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.bu || C87564g.m142223a(bundle) == e.bq;
    }

    /* renamed from: ag */
    public static boolean m142283ag(Bundle bundle) {
        return bundle != null && bundle.getBoolean("from_nga");
    }

    /* renamed from: ah */
    public static boolean m142284ah(Bundle bundle) {
        return bundle != null && bundle.getBoolean("from_voice_interaction_session", false);
    }

    /* renamed from: ai */
    public static boolean m142285ai(e eVar) {
        e eVar2 = e.a;
        int ordinal = eVar.ordinal();
        return ordinal == 76 || ordinal == 98 || ordinal == 110 || ordinal == 124;
    }

    /* renamed from: aj */
    public static boolean m142286aj(Bundle bundle) {
        int h = m142309h(bundle);
        return h == 6 || h == 7;
    }

    /* renamed from: ak */
    public static boolean m142287ak(Bundle bundle) {
        return m142309h(bundle) == 1;
    }

    /* renamed from: al */
    public static boolean m142288al(Bundle bundle) {
        return m142309h(bundle) == 2;
    }

    /* renamed from: am */
    public static boolean m142289am(Bundle bundle) {
        return bundle != null && bundle.getBoolean("mic_opened_from_assist_layer");
    }

    /* renamed from: an */
    public static boolean m142290an(Bundle bundle) {
        return bundle != null && bundle.getBoolean("tactile_plate");
    }

    /* renamed from: ao */
    public static boolean m142291ao(Bundle bundle) {
        return m142304c(bundle) == 2;
    }

    /* renamed from: ap */
    public static boolean m142292ap(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.al;
    }

    /* renamed from: aq */
    public static boolean m142293aq(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.aw;
    }

    /* renamed from: ar */
    public static boolean m142294ar(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.bo || C87564g.m142223a(bundle) == e.ay || C87564g.m142223a(bundle) == e.am;
    }

    /* renamed from: as */
    public static boolean m142295as(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.aG;
    }

    /* renamed from: at */
    public static boolean m142296at(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.aI;
    }

    /* renamed from: au */
    public static boolean m142297au(Bundle bundle) {
        int i = C87564g.m142223a(bundle).ca;
        return i == 5 || i == 72 || i == 8;
    }

    /* renamed from: av */
    public static boolean m142298av(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.bm || C87564g.m142223a(bundle) == e.bo || C87564g.m142223a(bundle) == e.bs || C87564g.m142223a(bundle) == e.bq || C87564g.m142223a(bundle) == e.bt || C87564g.m142223a(bundle) == e.aM || C87564g.m142223a(bundle) == e.aQ || C87564g.m142223a(bundle) == e.aS || C87564g.m142223a(bundle) == e.av || C87564g.m142223a(bundle) == e.bn;
    }

    /* renamed from: aw */
    public static boolean m142299aw(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.bi;
    }

    /* renamed from: ax */
    public static boolean m142300ax(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.bB;
    }

    /* renamed from: ay */
    public static boolean m142301ay(Bundle bundle) {
        return bundle != null && bundle.getBoolean("from_trusted_google_app_promo", false);
    }

    /* renamed from: az */
    public static boolean m142302az(Bundle bundle) {
        return C87564g.m142223a(bundle) == e.bJ;
    }

    /* renamed from: b */
    public static int m142303b(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("opa_amb_display_chip_id", -1);
        }
        return -1;
    }

    /* renamed from: c */
    public static int m142304c(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt("assistant_launch_mode");
    }

    /* renamed from: d */
    public static int m142305d(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("audio_frequency", 0);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m142306e(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt("audio_uri_source", 0);
    }

    /* renamed from: f */
    public static int m142307f(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("desired_mini_plate_height_px");
        }
        return 0;
    }

    /* renamed from: g */
    public static int m142308g(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("intent_launch_flags", -1);
        }
        return -1;
    }

    /* renamed from: h */
    public static int m142309h(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt("launched_on");
    }

    /* renamed from: i */
    public static int m142310i(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("num_audio_channels");
        }
        return 1;
    }

    /* renamed from: j */
    public static int m142311j(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt("opa_extra_screen_transition_style");
    }

    /* renamed from: k */
    public static int m142312k(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt("value_prop_id");
    }

    /* renamed from: l */
    public static int m142313l(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt("hide_opa_until_response_ready", 0);
    }

    /* renamed from: m */
    public static long m142314m(Bundle bundle) {
        if (bundle != null) {
            return bundle.getLong("assist_session_id");
        }
        return 0;
    }

    /* renamed from: n */
    public static long m142315n(Bundle bundle) {
        if (bundle != null) {
            return bundle.getLong("initial_assist_session_id");
        }
        return 0;
    }

    /* renamed from: o */
    public static long m142316o(Bundle bundle) {
        if (bundle != null) {
            return bundle.getLong("latency_id");
        }
        return 0;
    }

    /* renamed from: p */
    public static long m142317p(Bundle bundle) {
        if (bundle != null) {
            return bundle.getLong("query_commit_id", 0);
        }
        return 0;
    }

    /* renamed from: q */
    public static long m142318q(Bundle bundle) {
        if (bundle != null) {
            return bundle.getLong("query_request_id");
        }
        return 0;
    }

    /* renamed from: r */
    public static long m142319r(Bundle bundle) {
        if (bundle != null) {
            return bundle.getLong("HandoverId", 0);
        }
        return 0;
    }

    @Deprecated
    /* renamed from: s */
    public static Intent m142320s(Context context, Bundle bundle, int i) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.OpaActivity");
        if (m142295as(bundle)) {
            intent.setFlags(327680 | i);
        } else {
            intent.setFlags(i);
        }
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: t */
    public static Intent m142321t(Context context, C87565h hVar) {
        hVar.f236512P = 268468224;
        Bundle a = hVar.mo81685a();
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivity");
        intent.addFlags(268468224);
        intent.putExtras(a);
        return intent;
    }

    /* renamed from: u */
    public static Intent m142322u(Context context, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.promo.UpgradePromoTooltipActivity");
        intent.setFlags(268468224);
        intent.putExtra("from_tooltip_promo", z);
        return intent;
    }

    /* renamed from: v */
    public static Intent m142323v(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("alternate_onboarding_intent");
            if (parcelable instanceof Intent) {
                return (Intent) parcelable;
            }
        }
        return null;
    }

    /* renamed from: w */
    public static Intent m142324w(Bundle bundle) {
        if (bundle != null) {
            return (Intent) bundle.getParcelable("forwarded_intent");
        }
        return null;
    }

    /* renamed from: x */
    public static Intent m142325x(String str) {
        try {
            if (!str.startsWith("android-app:")) {
                return Intent.parseUri(str, 1);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            return intent;
        } catch (URISyntaxException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(str));
            return intent2;
        }
    }

    /* renamed from: y */
    public static Intent m142326y(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (Intent) bundle.getParcelable("com.google.voicesearch.VI_INTENT");
    }

    /* renamed from: z */
    public static Uri m142327z(Bundle bundle) {
        if (bundle != null) {
            return (Uri) bundle.getParcelable("audio_content_uri");
        }
        return null;
    }
}
