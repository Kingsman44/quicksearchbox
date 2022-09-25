package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88800ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.CoreSuggestionView;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.C41685k;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.p4567m.C60254a;
import com.google.common.p4552o.p4567m.C60255b;
import com.google.common.p4552o.p4567m.C60257d;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protos.p4948ba.C64378h;
import com.google.protos.p4948ba.C64380j;
import com.google.protos.p4948ba.C64383m;
import com.google.protos.p4948ba.C64384n;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.aj */
/* compiled from: PG */
public final class C88727aj implements C89200e {

    /* renamed from: a */
    public static final Integer f239990a = 106230;

    /* renamed from: e */
    private static final C59071e f239991e = C59071e.m91332i("com.google.android.apps.gsa.searchbox.ui.suggestions.a.aj");

    /* renamed from: f */
    private static final Integer f239992f = Integer.valueOf(R.string.regular_query_learn_more_url);

    /* renamed from: g */
    private static final Integer f239993g = Integer.valueOf(R.string.trends_learn_more_url);

    /* renamed from: h */
    private static final List f239994h = Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.star_rating_1), Integer.valueOf(R.drawable.star_rating_1_5), Integer.valueOf(R.drawable.star_rating_2), Integer.valueOf(R.drawable.star_rating_2_5), Integer.valueOf(R.drawable.star_rating_3), Integer.valueOf(R.drawable.star_rating_3_5), Integer.valueOf(R.drawable.star_rating_4), Integer.valueOf(R.drawable.star_rating_4_5), Integer.valueOf(R.drawable.star_rating_5)});

    /* renamed from: i */
    private static final C58495hd f239995i;

    /* renamed from: j */
    private static final int f239996j = Color.rgb(241, 243, 244);

    /* renamed from: b */
    public final Context f239997b;

    /* renamed from: c */
    public C88701b f239998c;

    /* renamed from: d */
    AlertDialog f239999d;

    /* renamed from: k */
    private TextView f240000k;

    static {
        C64383m mVar = C64383m.PQ_BASED;
        Integer valueOf = Integer.valueOf(R.string.vasco_suggestion_message);
        C64383m mVar2 = C64383m.INTEREST_BASED;
        Integer valueOf2 = Integer.valueOf(R.string.interest_based_suggestion_message);
        C64383m mVar3 = C64383m.ENGAGE_RETENTIVE;
        Integer valueOf3 = Integer.valueOf(R.string.onboarding_message);
        C64383m mVar4 = C64383m.SIGNED_OUT_PQ_BASED;
        Integer valueOf4 = Integer.valueOf(R.string.signed_out_pq_based_suggestion_message);
        C64383m mVar5 = C64383m.TRENDS;
        Integer valueOf5 = Integer.valueOf(R.string.trends_suggestion_message);
        f239995i = C58495hd.m89905s(mVar, valueOf, mVar2, valueOf2, mVar3, valueOf3, mVar4, valueOf4, mVar5, valueOf5, C64383m.PERSONALIZED_TRENDS, valueOf5);
    }

    public C88727aj(Context context) {
        this.f239997b = new ContextThemeWrapper(context, 2132150729);
    }

    /* renamed from: E */
    public static void m143677E(Suggestion suggestion, Map map) {
        suggestion.f108923x = C58495hd.m89898l(map);
    }

    /* renamed from: F */
    public static boolean m143678F(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return false;
        }
        C54216ae aeVar = suggestion.f108906A.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return aeVar.f142307r;
    }

    /* renamed from: G */
    public static boolean m143679G(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return false;
        }
        C54216ae aeVar = suggestion.f108906A.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return (aeVar.f142290a & 2) != 0;
    }

    /* renamed from: H */
    public static boolean m143680H(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return false;
        }
        C54216ae aeVar = suggestion.f108906A.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return (aeVar.f142290a & 67108864) != 0;
    }

    /* renamed from: I */
    public static boolean m143681I(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return false;
        }
        C54216ae aeVar = suggestion.f108906A.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return (aeVar.f142290a & 33554432) != 0;
    }

    /* renamed from: J */
    public static boolean m143682J(Suggestion suggestion) {
        C41685k kVar = suggestion.f108907B.f109020n;
        if (kVar == null) {
            kVar = C41685k.f109031e;
        }
        return kVar.f109036d;
    }

    /* renamed from: K */
    public static boolean m143683K(Suggestion suggestion) {
        return m143687O(suggestion) || m143682J(suggestion) || m143686N(suggestion);
    }

    /* renamed from: L */
    public static boolean m143684L(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return false;
        }
        C54228aq aqVar = suggestion.f108906A;
        if ((aqVar.f142330a & 4) == 0) {
            return false;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return aeVar.f142303n;
    }

    /* renamed from: M */
    public static boolean m143685M(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("data:")) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m143686N(Suggestion suggestion) {
        C41685k kVar = suggestion.f108907B.f109020n;
        if (kVar == null) {
            kVar = C41685k.f109031e;
        }
        return kVar.f109035c;
    }

    /* renamed from: O */
    public static boolean m143687O(Suggestion suggestion) {
        C41685k kVar = suggestion.f108907B.f109020n;
        if (kVar == null) {
            kVar = C41685k.f109031e;
        }
        return kVar.f109034b;
    }

    /* renamed from: P */
    public static String[] m143688P(Suggestion suggestion) {
        String str;
        boolean s = suggestion.mo44265s();
        String str2 = BuildConfig.FLAVOR;
        if (s) {
            C54228aq aqVar = suggestion.f108906A;
            if ((aqVar.f142330a & 4) != 0) {
                C54216ae aeVar = aqVar.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                int i = aeVar.f142290a;
                String str3 = (8388608 & i) != 0 ? aeVar.f142308s : str2;
                if ((i & 1024) != 0) {
                    str2 = aeVar.f142301l;
                }
                str = str2;
                str2 = str3;
                return new String[]{str2, str};
            }
        }
        str = str2;
        return new String[]{str2, str};
    }

    /* renamed from: Q */
    public static String[] m143689Q(Suggestion suggestion) {
        String str;
        boolean s = suggestion.mo44265s();
        String str2 = BuildConfig.FLAVOR;
        if (s) {
            C54228aq aqVar = suggestion.f108906A;
            if ((aqVar.f142330a & 4) != 0) {
                C54216ae aeVar = aqVar.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                int i = aeVar.f142290a;
                String str3 = (i & 512) != 0 ? aeVar.f142300k : str2;
                if ((i & 1024) != 0) {
                    str2 = aeVar.f142301l;
                }
                str = str2;
                str2 = str3;
                return new String[]{str2, str};
            }
        }
        str = str2;
        return new String[]{str2, str};
    }

    /* renamed from: R */
    public static int m143690R(Suggestion suggestion) {
        if (m143680H(suggestion) && suggestion.mo44265s()) {
            C54216ae aeVar = suggestion.f108906A.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            int a = C64380j.m96396a(aeVar.f142312w);
            if (a == 0) {
                a = 1;
            }
            int X = m143694X(a);
            if (X != -1) {
                return X;
            }
        }
        return -1;
    }

    /* renamed from: S */
    public static int m143691S(Suggestion suggestion) {
        if (m143681I(suggestion) && suggestion.mo44265s()) {
            C54216ae aeVar = suggestion.f108906A.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            int a = C64380j.m96396a(aeVar.f142311v);
            if (a == 0) {
                a = 1;
            }
            int X = m143694X(a);
            if (X != -1) {
                return X;
            }
        }
        return -1;
    }

    /* renamed from: V */
    public static void m143692V(Context context, Activity activity) {
        try {
            new AlertDialog.Builder(activity).setPositiveButton(context.getResources().getString(R.string.opa_suggestion_info_dialog_ok), (DialogInterface.OnClickListener) null).setTitle(context.getResources().getString(R.string.opa_suggestion_info_dialog_title)).setNegativeButton(R.string.common_learn_more, new C88722ae(context)).setMessage(context.getResources().getString(R.string.opa_suggestion_info_dialog_message)).show();
        } catch (WindowManager.BadTokenException e) {
            C59104x c = f239991e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10018)).mo56386p("error creating dialog.");
        }
    }

    /* renamed from: W */
    public static void m143693W(Context context, Activity activity, String str, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(activity).setPositiveButton(context.getResources().getString(R.string.opa_suggestion_send_feedback), onClickListener).setNegativeButton(context.getResources().getString(R.string.opa_suggestion_cancel), (DialogInterface.OnClickListener) null).setTitle(context.getResources().getString(R.string.opa_suggestion_debug_dialog_title));
        title.setMessage(Html.fromHtml(str));
        try {
            title.show();
        } catch (WindowManager.BadTokenException e) {
            C59104x c = f239991e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10019)).mo56386p("error creating dialog.");
        }
    }

    /* renamed from: X */
    public static int m143694X(int i) {
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                    return R.drawable.quantum_ic_place_white_24;
                case 1:
                    return R.drawable.quantum_ic_movie_white_24;
                case 2:
                    return R.drawable.quantum_ic_local_activity_white_24;
                case 3:
                    return R.drawable.ic_baseball;
                case 4:
                    return R.drawable.ic_basketball;
                case 5:
                    return R.drawable.ic_cricket;
                case 6:
                    return R.drawable.ic_football;
                case 7:
                    return R.drawable.quantum_ic_public_white_24;
                case 8:
                    return R.drawable.ic_hockey;
                case 9:
                    return R.drawable.quantum_ic_news_white_24;
                case 10:
                    return R.drawable.quantum_ic_restaurant_menu_white_24;
                case 11:
                    return R.drawable.ic_rugby;
                case 12:
                    return R.drawable.ic_soccer;
                case 13:
                    return R.drawable.ic_search_movies_normal;
                case 14:
                    return R.drawable.quantum_ic_local_gas_station_white_24;
                case 15:
                    return R.drawable.quantum_ic_local_atm_white_24;
                case 16:
                    return R.drawable.quantum_ic_local_cafe_white_24;
                case 17:
                    return R.drawable.quantum_ic_local_pharmacy_white_24;
                case 18:
                    return R.drawable.quantum_ic_local_grocery_store_white_24;
                case 19:
                    return R.drawable.ic_local_hotel;
                case 20:
                    return R.drawable.quantum_ic_local_bar_white_24;
                case 21:
                    return R.drawable.quantum_ic_store_white_24;
                case 22:
                    return R.drawable.quantum_ic_local_post_office_white_24;
                case 23:
                    return R.drawable.quantum_ic_local_parking_white_24;
                case 24:
                    return R.drawable.quantum_ic_explore_nearby_white_24;
                case 25:
                    return R.drawable.quantum_ic_whatshot_white_24;
                case 26:
                    return R.drawable.quantum_ic_arrow_back_white_24;
                case 27:
                    return R.drawable.quantum_ic_access_time_white_24;
                case 28:
                    return R.drawable.quantum_ic_translate_white_24;
                case 29:
                    return R.drawable.quantum_ic_directions_transit_white_24;
                case 30:
                    return R.drawable.quantum_ic_alarm_white_24;
                case 31:
                    return R.drawable.ic_plus;
                case 32:
                    return R.drawable.ic_search_upleftarrow_pressed;
                case 33:
                    return R.drawable.ic_trending_up;
                case 34:
                    return R.drawable.ic_medal;
                case 35:
                    return R.drawable.quantum_ic_image_white_24;
                case 36:
                    return R.drawable.quantum_ic_drive_video_white_24;
                case 37:
                    return R.drawable.quantum_ic_shopping_basket_white_24;
                case 38:
                    return R.drawable.quantum_ic_book_white_24;
                case 39:
                    return R.drawable.quantum_ic_home_white_24;
                case 40:
                    return R.drawable.quantum_ic_work_white_24;
                case 41:
                    return R.drawable.quantum_ic_history_white_24;
                case 47:
                    return R.drawable.quantum_ic_file_download_white_24;
                case 48:
                    return R.drawable.quantum_ic_flight_white_24;
                case 49:
                    return R.drawable.ic_worldcup;
                case 50:
                    return R.drawable.quantum_ic_call_googblue_24;
                case 51:
                    return R.drawable.quantum_ic_keyboard_arrow_down_grey600_24;
                case 52:
                    return R.drawable.ic_recipe;
                case 54:
                    return R.drawable.ic_search_downleftarrow_pressed;
                case 55:
                    return R.drawable.ic_cricket_worldcup_2019;
                case 57:
                    return R.drawable.ic_cricket_team_india;
                case 58:
                    return R.drawable.ic_mlb;
                case 59:
                    return R.drawable.quantum_ic_menu_book_white_18;
                case 60:
                    return R.drawable.ic_cricket_fallback;
                case 61:
                    return R.drawable.ic_local_categorical_marker_right;
                case 62:
                    return R.drawable.ic_local_categorical_marker_left;
                case 63:
                    return R.drawable.ic_local_categorical_circle;
                case 66:
                    return R.drawable.ic_hospital;
                case 67:
                    return R.drawable.ic_restaurant;
                case 68:
                    return R.drawable.ic_restaurant_chef_hat;
                case 69:
                    return R.drawable.ic_restaurant_chef_hat_spatula;
                case 70:
                    return R.drawable.ic_hotel_emoji;
                case 71:
                    return R.drawable.product_logo_assistant_color_24;
                case 72:
                    return R.drawable.product_logo_assistant_color_18;
                default:
                    return -1;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: Y */
    public static int m143695Y(Suggestion suggestion) {
        int a;
        if (suggestion.mo44265s()) {
            C54228aq aqVar = suggestion.f108906A;
            if ((aqVar.f142330a & 4) != 0) {
                C54216ae aeVar = aqVar.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                int i = aeVar.f142314y;
                int a2 = C64378h.m96395a(i);
                if (a2 == 0 || a2 == 1 || (a = C64378h.m96395a(i)) == 0) {
                    return 1;
                }
                return a;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public static int m143696a(Suggestion suggestion, int i) {
        String str;
        if (suggestion.mo44265s()) {
            C54228aq aqVar = suggestion.f108906A;
            C54216ae aeVar = aqVar.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            if ((aeVar.f142290a & 4) != 0) {
                C54216ae aeVar2 = aqVar.f142334f;
                if (aeVar2 == null) {
                    aeVar2 = C54216ae.f142285C;
                }
                str = aeVar2.f142293d;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return Color.parseColor(str);
            }
        }
        return i;
    }

    /* renamed from: aa */
    private final View m143697aa(String str) {
        TextView textView = this.f240000k;
        if (textView == null) {
            TextView textView2 = (TextView) LayoutInflater.from(this.f239997b).inflate(R.layout.learn_more_view, (ViewGroup) null);
            this.f240000k = textView2;
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            ViewGroup viewGroup = (ViewGroup) textView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f240000k);
            }
        }
        this.f240000k.setText(Html.fromHtml(this.f239997b.getResources().getString(R.string.learn_more_link, new Object[]{str})));
        return this.f240000k;
    }

    /* renamed from: b */
    public static int m143698b(Suggestion suggestion, int i, int i2) {
        if ((m143686N(suggestion) || m143682J(suggestion)) && i2 == 4) {
            return 0;
        }
        return m143696a(suggestion, i);
    }

    /* renamed from: c */
    public static int m143699c(Suggestion suggestion, int i) {
        if (m143679G(suggestion) && suggestion.mo44265s()) {
            C54216ae aeVar = suggestion.f108906A.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            int a = C64380j.m96396a(aeVar.f142292c);
            if (a == 0) {
                a = 1;
            }
            int X = m143694X(a);
            if (X != -1) {
                return X;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m143700e(Suggestion suggestion, int i, int i2) {
        boolean z = suggestion.f108925z.contains(39) || suggestion.f108910k == 35;
        if (m143687O(suggestion)) {
            if (i2 == 1) {
                return !z ? R.drawable.quantum_ic_search_white_24 : R.drawable.quantum_ic_access_time_white_24;
            }
            if (i2 == 2) {
                return !z ? R.drawable.grouping_loupe_top : R.drawable.grouping_clock_top;
            }
            if (i2 == 3) {
                return !z ? R.drawable.grouping_loupe_top : R.drawable.grouping_clock_top;
            }
            if (i2 == 4) {
                return !z ? R.drawable.grouping_loupe_top : R.drawable.grouping_clock_top;
            }
            if (i2 != 5) {
                return m143699c(suggestion, i);
            }
            return !z ? R.drawable.grouping_loupe_top : R.drawable.grouping_clock_top;
        } else if (m143686N(suggestion)) {
            if (i2 == 1) {
                return !z ? R.drawable.quantum_ic_search_white_24 : R.drawable.quantum_ic_access_time_white_24;
            }
            if (i2 == 2) {
                return !z ? R.drawable.grouping_2_loupe_middle : R.drawable.grouping_2_clock_middle;
            }
            if (i2 == 3) {
                return R.drawable.grouping_3_middle;
            }
            if (i2 == 4) {
                return !z ? R.drawable.grouping_4_loupe_middle : R.drawable.grouping_4_clock_middle;
            }
            if (i2 != 5) {
                return m143699c(suggestion, i);
            }
            return !z ? R.drawable.grouping_5_loupe_middle : R.drawable.grouping_5_clock_middle;
        } else if (!m143682J(suggestion)) {
            return m143699c(suggestion, i);
        } else {
            if (i2 == 1) {
                return !z ? R.drawable.quantum_ic_search_white_24 : R.drawable.quantum_ic_access_time_white_24;
            }
            if (i2 == 2) {
                return !z ? R.drawable.grouping_2_loupe_bottom : R.drawable.grouping_2_clock_bottom;
            }
            if (i2 == 3) {
                return R.drawable.grouping_3_bottom;
            }
            if (i2 == 4) {
                return !z ? R.drawable.grouping_4_loupe_bottom : R.drawable.grouping_4_clock_bottom;
            }
            if (i2 != 5) {
                return m143699c(suggestion, i);
            }
            return !z ? R.drawable.grouping_5_loupe_bottom : R.drawable.grouping_5_clock_bottom;
        }
    }

    /* renamed from: f */
    public static int m143701f(String str) {
        double d;
        int round;
        if (!TextUtils.isEmpty(str)) {
            try {
                d = Double.parseDouble(str);
            } catch (NumberFormatException e) {
                C59104x c = f239991e.mo56225c();
                c.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10011)).mo56386p("Invalid score rating provided.");
                d = C59203do.f157270a;
            }
            if (d >= 1.0d && d <= 5.0d && ((int) Math.round(d + d)) - 2 >= 0) {
                List list = f239994h;
                if (round < list.size()) {
                    return ((Integer) list.get(round)).intValue();
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static int m143702g(String str) {
        String[] split = str.replace("rgb(", BuildConfig.FLAVOR).replace(")", BuildConfig.FLAVOR).split(",");
        if (split.length != 3) {
            return 0;
        }
        return Color.rgb(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
    }

    /* renamed from: h */
    static Drawable m143703h(PackageManager packageManager, String str) {
        if (packageManager == null || str == null) {
            return null;
        }
        try {
            return packageManager.getApplicationIcon(str);
        } catch (PackageManager.NameNotFoundException unused) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
    }

    /* renamed from: m */
    public static Spanned m143704m(Spanned spanned, Suggestion suggestion, C88710k kVar) {
        if (C41670aj.m73087t(suggestion)) {
            return SpannedString.valueOf(C41670aj.m73078k(suggestion));
        }
        String str = null;
        if (suggestion.mo44265s()) {
            C54228aq aqVar = suggestion.f108906A;
            C54216ae aeVar = aqVar.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            if ((aeVar.f142290a & 8) != 0) {
                C54216ae aeVar2 = aqVar.f142334f;
                if (aeVar2 == null) {
                    aeVar2 = C54216ae.f142285C;
                }
                str = aeVar2.f142294e;
            }
        }
        return !TextUtils.isEmpty(str) ? kVar.mo44239f(str, false, false) : spanned;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[RETURN] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Spanned m143705n(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r2, com.google.android.apps.gsa.searchbox.p6960ui.C88710k r3) {
        /*
            boolean r0 = com.google.android.libraries.searchbox.shared.suggestion.C41670aj.m73088u(r2)
            if (r0 == 0) goto L_0x000f
            java.lang.String r2 = com.google.android.libraries.searchbox.shared.suggestion.C41670aj.m73079l(r2)
            android.text.SpannedString r2 = android.text.SpannedString.valueOf(r2)
            return r2
        L_0x000f:
            boolean r0 = r2.mo44265s()
            r1 = 0
            if (r0 == 0) goto L_0x002d
            com.google.at.h.d.a.aq r2 = r2.f108906A
            com.google.at.h.d.a.ae r0 = r2.f142334f
            if (r0 != 0) goto L_0x001e
            com.google.at.h.d.a.ae r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x001e:
            int r0 = r0.f142290a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x002d
            com.google.at.h.d.a.ae r2 = r2.f142334f
            if (r2 != 0) goto L_0x002a
            com.google.at.h.d.a.ae r2 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x002a:
            java.lang.String r2 = r2.f142295f
            goto L_0x002e
        L_0x002d:
            r2 = r1
        L_0x002e:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x003a
            r0 = 0
            android.text.Spanned r2 = r3.mo44239f(r2, r0, r0)
            return r2
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj.m143705n(com.google.android.libraries.searchbox.shared.suggestion.Suggestion, com.google.android.apps.gsa.searchbox.ui.k):android.text.Spanned");
    }

    /* renamed from: o */
    public static C54228aq m143706o(Suggestion suggestion) {
        if (suggestion.mo44265s()) {
            return suggestion.f108906A;
        }
        C59104x c = f239991e.mo56225c();
        c.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
        ((C59052c) ((C59052c) c).mo56372aa(10013)).mo56389s("SuggestResult is null. Error suggestion is: %s", suggestion);
        return null;
    }

    /* renamed from: p */
    public static String m143707p(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return BuildConfig.FLAVOR;
        }
        C54228aq aqVar = suggestion.f108906A;
        if ((aqVar.f142330a & 4) == 0) {
            return BuildConfig.FLAVOR;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return (aeVar.f142290a & 2048) != 0 ? aeVar.f142302m : BuildConfig.FLAVOR;
    }

    /* renamed from: q */
    public static void m143708q(Suggestion suggestion, Map map) {
        map.putAll(suggestion.f108923x);
        suggestion.f108923x = C58495hd.m89898l(map);
    }

    /* renamed from: x */
    public static void m143710x(Suggestion suggestion, List list, List list2, int i) {
        C58480gp gpVar = new C58480gp(4);
        if (!(list2 == null || list2.size() == list.size())) {
            C59104x d = f239991e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
            ((C59052c) ((C59052c) d).mo56372aa(10014)).mo56386p("Size of actions package id list doesn't match with actions type list");
            int i2 = C90755l.f253831a;
            list2 = null;
        }
        int i3 = 0;
        while (i3 < list.size()) {
            C60254a aVar = (C60254a) C60255b.f163024g.createBuilder();
            int a = C60257d.m92557a(((Integer) list.get(i3)).intValue());
            aVar.copyOnWrite();
            C60255b bVar = (C60255b) aVar.instance;
            int i4 = a - 1;
            if (a != 0) {
                bVar.f163027b = i4;
                bVar.f163026a |= 1;
                if (list2 != null && !TextUtils.isEmpty((CharSequence) list2.get(i3))) {
                    String str = (String) list2.get(i3);
                    aVar.copyOnWrite();
                    C60255b bVar2 = (C60255b) aVar.instance;
                    str.getClass();
                    bVar2.f163026a |= 2;
                    bVar2.f163028c = str;
                }
                gpVar.mo55395g((C60255b) aVar.build());
                i3++;
            } else {
                throw null;
            }
        }
        suggestion.f108921v = gpVar.mo55394f();
        suggestion.f108922w = i;
    }

    /* renamed from: A */
    public final void mo82452A(String str, Suggestion suggestion, boolean z) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.f239997b).setMessage(str).setPositiveButton(R.string.common_yes, (DialogInterface.OnClickListener) null);
        if (z) {
            positiveButton.setNegativeButton(R.string.report_this, new C88726ai(this, suggestion));
        }
        AlertDialog create = positiveButton.create();
        this.f239999d = create;
        try {
            create.show();
        } catch (WindowManager.BadTokenException e) {
            C59104x c = f239991e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10017)).mo56386p("error creating dialog.");
        }
        if (z) {
            create.getButton(-2).setTextColor(this.f239997b.getResources().getColor(R.color.suggestions_feedback_report_button_color));
        }
    }

    /* renamed from: B */
    public final void mo82453B(CharSequence charSequence, CharSequence charSequence2, Suggestion suggestion, C88728ak akVar) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.f239997b).setPositiveButton(R.string.common_delete, new C88725ah(akVar, suggestion));
        positiveButton.setTitle(charSequence);
        positiveButton.setMessage(charSequence2);
        positiveButton.setNegativeButton(R.string.common_no, (DialogInterface.OnClickListener) null);
        positiveButton.setView(m143697aa(this.f239997b.getResources().getString(R.string.remove_psuggest_learn_more_url, new Object[]{Locale.getDefault().getLanguage()})));
        AlertDialog create = positiveButton.create();
        this.f239999d = create;
        try {
            create.show();
        } catch (WindowManager.BadTokenException e) {
            C59104x c = f239991e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10020)).mo56386p("error creating dialog.");
        }
        create.getButton(-1).setTextColor(this.f239997b.getResources().getColor(R.color.agsa_color_error));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo82454C(Suggestion suggestion, C88728ak akVar) {
        mo82453B(this.f239997b.getResources().getString(R.string.remove_psuggest_title), Html.fromHtml(this.f239997b.getResources().getString(R.string.remove_psuggest_message, new Object[]{Html.escapeHtml(suggestion.mo44269v())})), suggestion, akVar);
    }

    /* renamed from: D */
    public final void mo82455D(String str, Intent intent) {
        AlertDialog create = new AlertDialog.Builder(this.f239997b).setMessage(Html.fromHtml(this.f239997b.getResources().getString(R.string.video_suggestion_message, new Object[]{str}))).setPositiveButton(this.f239997b.getResources().getString(R.string.video_suggestion_dialog_goto_button, new Object[]{str}), new C88724ag(this, intent)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        this.f239999d = create;
        try {
            create.show();
        } catch (WindowManager.BadTokenException e) {
            C59104x c = f239991e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10021)).mo56386p("error creating dialog.");
        }
        create.getButton(-1).setTextColor(this.f239997b.getResources().getColor(R.color.agsa_color_error));
    }

    /* renamed from: T */
    public final void mo82456T(Suggestion suggestion, C88803an anVar, int i, int i2) {
        if (m143681I(suggestion) && i != -1) {
            Drawable drawable = this.f239997b.getResources().getDrawable(i);
            drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            anVar.mo82548k(drawable);
        }
    }

    /* renamed from: U */
    public final void mo82457U(DialogInterface.OnClickListener onClickListener) {
        AlertDialog create = new AlertDialog.Builder(this.f239997b).setTitle(this.f239997b.getResources().getString(R.string.access_google_now_title)).setMessage(this.f239997b.getResources().getString(R.string.access_google_now_message)).setPositiveButton(this.f239997b.getResources().getString(R.string.common_see_updates), onClickListener).create();
        this.f239999d = create;
        try {
            create.show();
        } catch (WindowManager.BadTokenException e) {
            C59104x c = f239991e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10015)).mo56386p("error creating dialog.");
        }
    }

    /* renamed from: Z */
    public final void mo82458Z(CharSequence charSequence, C88803an anVar, int i, int i2) {
        int X = m143694X(i);
        if (X == -1) {
            X = R.drawable.ic_search_upleftarrow_pressed;
        }
        anVar.mo82349c(1).mo82562e(X, i2, this.f239997b.getResources().getString(R.string.accessibility_query_refinement, new Object[]{charSequence}));
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f239998c = ((C88715p) obj).f239935g;
    }

    /* renamed from: i */
    public final LayerDrawable mo82459i(int i, int i2, boolean z, int i3) {
        return mo82460j((BitmapDrawable) this.f239997b.getResources().getDrawable(i), i2, z, i3);
    }

    /* renamed from: j */
    public final LayerDrawable mo82460j(BitmapDrawable bitmapDrawable, int i, boolean z, int i2) {
        return mo82461k(bitmapDrawable, i, z, (int) ((((float) i2) * this.f239997b.getResources().getDisplayMetrics().density) + 0.5f));
    }

    /* renamed from: k */
    public final LayerDrawable mo82461k(BitmapDrawable bitmapDrawable, int i, boolean z, int i2) {
        bitmapDrawable.setGravity(17);
        ShapeDrawable l = mo82462l(z);
        l.getPaint().setColor(i);
        l.setIntrinsicHeight(i2);
        l.setIntrinsicWidth(i2);
        return new LayerDrawable(new Drawable[]{l, bitmapDrawable});
    }

    /* renamed from: l */
    public final ShapeDrawable mo82462l(boolean z) {
        if (z) {
            return new ShapeDrawable(new OvalShape());
        }
        float dimensionPixelSize = (float) this.f239997b.getResources().getDimensionPixelSize(R.dimen.image_icon_corner_radius);
        return new ShapeDrawable(new RoundRectShape(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize}, (RectF) null, (float[]) null));
    }

    /* renamed from: s */
    public final void mo82463s() {
        AlertDialog alertDialog = this.f239999d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f239999d.dismiss();
        }
    }

    /* renamed from: t */
    public final void mo82464t(C88803an anVar) {
        anVar.mo82349c(1).mo82559b();
    }

    /* renamed from: u */
    public final void mo82465u(Suggestion suggestion, C88803an anVar, int i) {
        String str;
        if (m143680H(suggestion) && i != -1) {
            Drawable drawable = this.f239997b.getResources().getDrawable(i);
            int i2 = C88728ak.f240003i;
            String str2 = null;
            if (suggestion.mo44265s()) {
                C54228aq aqVar = suggestion.f108906A;
                C54216ae aeVar = aqVar.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                if ((aeVar.f142290a & 536870912) != 0) {
                    C54216ae aeVar2 = aqVar.f142334f;
                    if (aeVar2 == null) {
                        aeVar2 = C54216ae.f142285C;
                    }
                    str = aeVar2.f142315z;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    i2 = Color.parseColor(str);
                }
            }
            drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int i3 = f239996j;
            if (suggestion.mo44265s()) {
                C54228aq aqVar2 = suggestion.f108906A;
                C54216ae aeVar3 = aqVar2.f142334f;
                if (aeVar3 == null) {
                    aeVar3 = C54216ae.f142285C;
                }
                if ((aeVar3.f142290a & 1073741824) != 0) {
                    C54216ae aeVar4 = aqVar2.f142334f;
                    if (aeVar4 == null) {
                        aeVar4 = C54216ae.f142285C;
                    }
                    str2 = aeVar4.f142287A;
                }
                if (!TextUtils.isEmpty(str2)) {
                    i3 = Color.parseColor(str2);
                }
            }
            LayerDrawable j = mo82460j(bitmapDrawable, i3, false, 46);
            C88800ak c = anVar.mo82349c(8);
            if (c != null) {
                c.mo82563f(j, 0);
            }
        }
    }

    /* renamed from: v */
    public final void mo82466v(Suggestion suggestion, C88803an anVar, C88710k kVar) {
        Spanned n = m143705n(suggestion, kVar);
        if (n != null) {
            anVar.mo82588w(n);
        }
        mo82456T(suggestion, anVar, m143691S(suggestion), C88728ak.f240003i);
    }

    /* renamed from: w */
    public final void mo82467w(Suggestion suggestion, int i, Map map) {
        Integer num;
        C54216ae aeVar = suggestion.f108906A.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        C64384n nVar = aeVar.f142313x;
        if (nVar == null) {
            nVar = C64384n.f174622b;
        }
        C64383m a = C64383m.m96397a(nVar.f174624a);
        if (a == null) {
            a = C64383m.CATEGORY_UNSPECIFIED;
        }
        int intValue = ((Integer) C58833ax.m90833j((Integer) f239995i.get(a)).mo56109e(Integer.valueOf(i))).intValue();
        if (suggestion.f108925z.contains(143)) {
            num = f239993g;
        } else {
            num = f239992f;
        }
        int intValue2 = num.intValue();
        C58833ax j = C58833ax.m90833j((Integer) map.get(Integer.valueOf(a.f174621t)));
        if (j.mo56113h()) {
            mo82468y(intValue, intValue2, suggestion, true, (Integer) j.mo56107c());
            return;
        }
        mo82469z(intValue, suggestion, true);
    }

    /* renamed from: y */
    public final void mo82468y(int i, int i2, Suggestion suggestion, boolean z, Integer num) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.f239997b).setPositiveButton(R.string.common_yes, (DialogInterface.OnClickListener) null);
        positiveButton.setMessage(this.f239997b.getResources().getString(i));
        positiveButton.setNegativeButton(z ? R.string.report_this : R.string.common_learn_more, new C88723af(this, z, suggestion, i2));
        if (z) {
            positiveButton.setView(m143697aa(this.f239997b.getResources().getString(i2, new Object[]{num, Locale.getDefault().getLanguage()})));
        }
        AlertDialog create = positiveButton.create();
        this.f239999d = create;
        try {
            create.show();
        } catch (WindowManager.BadTokenException e) {
            C59104x c = f239991e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.u.RendererUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10016)).mo56386p("error creating dialog.");
        }
        if (z) {
            create.getButton(-2).setTextColor(this.f239997b.getResources().getColor(R.color.suggestions_feedback_report_button_color));
        }
    }

    /* renamed from: z */
    public final void mo82469z(int i, Suggestion suggestion, boolean z) {
        mo82452A(this.f239997b.getResources().getString(i), suggestion, z);
    }

    /* renamed from: r */
    public static void m143709r(CoreSuggestionView coreSuggestionView, Suggestion suggestion, int i) {
        if (i == 1) {
            if (!m143687O(suggestion)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) coreSuggestionView.f240325a[0].getLayoutParams();
                marginLayoutParams.leftMargin = coreSuggestionView.getResources().getDimensionPixelSize(R.dimen.right_indent_suggestion_margin);
                coreSuggestionView.f240325a[0].setLayoutParams(marginLayoutParams);
            }
        } else if (i >= 2) {
            coreSuggestionView.mo82545h();
        }
    }
}
