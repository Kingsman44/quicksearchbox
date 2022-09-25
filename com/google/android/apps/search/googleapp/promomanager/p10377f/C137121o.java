package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.protos.p4880aq.C63732au;
import com.google.protos.p4880aq.C63736ay;
import com.google.protos.p4880aq.C63742bd;
import com.google.protos.p4880aq.C63749f;
import com.google.protos.p4880aq.C63750g;
import com.google.protos.p4880aq.C63752i;
import com.google.protos.p4880aq.C63754k;
import com.google.protos.p4880aq.C63758o;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63932bs;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.o */
/* compiled from: PG */
public final class C137121o {

    /* renamed from: a */
    public static final C58495hd f373132a;

    /* renamed from: b */
    private static final C58495hd f373133b;

    /* renamed from: c */
    private static final C58495hd f373134c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C63736ay.STRING_DEFAULT_ILLUSTRATION_DESCRIPTION, Integer.valueOf(R.string.googleapp_default_illustration_description));
        gzVar.mo55429h(C63736ay.STRING_SEARCH_WIDGET_HEADER, Integer.valueOf(R.string.googleapp_search_widget_promo_header));
        gzVar.mo55429h(C63736ay.STRING_SEARCH_WIDGET_SUBHEADER, Integer.valueOf(R.string.googleapp_search_widget_promo_subheader));
        gzVar.mo55429h(C63736ay.STRING_SEARCH_WIDGET_POSITIVE, Integer.valueOf(R.string.googleapp_search_widget_promo_positive_text));
        gzVar.mo55429h(C63736ay.STRING_SEARCH_WIDGET_NEGATIVE, Integer.valueOf(R.string.googleapp_search_widget_promo_negative_text));
        gzVar.mo55429h(C63736ay.STRING_SEARCH_WIDGET_DESCRIPTION, Integer.valueOf(R.string.googleapp_search_widget_description));
        gzVar.mo55429h(C63736ay.STRING_LENS_FIND_YOUR_STYLE, Integer.valueOf(R.string.googleapp_lens_tooltip_text_find_your_style));
        gzVar.mo55429h(C63736ay.STRING_LENS_SEARCH_WITH_YOUR_CAMERA, Integer.valueOf(R.string.googleapp_lens_tooltip_text_search_with_your_camera));
        gzVar.mo55429h(C63736ay.STRING_LENS_TRANSLATE_OR_COPY, Integer.valueOf(R.string.googleapp_lens_tooltip_text_translate_or_copy));
        gzVar.mo55429h(C63736ay.STRING_LENS_TIRED_OF_TYPING, Integer.valueOf(R.string.googleapp_lens_tooltip_text_tired_of_typing));
        gzVar.mo55429h(C63736ay.STRING_LENS_PLANTS_ANIMALS_PRODUCTS, Integer.valueOf(R.string.googleapp_lens_tooltip_text_plants_animals_products));
        gzVar.mo55429h(C63736ay.STRING_LENS_PROMO_DESCRIPTION, Integer.valueOf(R.string.googleapp_lens_tout_promo_description));
        gzVar.mo55429h(C63736ay.STRING_LENS_PROMO_HEADER_SEARCH_ANYTHING_WITH_YOUR_CAMERA, Integer.valueOf(R.string.googleapp_lens_tout_promo_header_search_anything_with_your_camera));
        gzVar.mo55429h(C63736ay.STRING_LENS_PROMO_HEADER_IDENTIFY_PLANTS_OR_ANIMALS, Integer.valueOf(R.string.googleapp_lens_tout_promo_header_identify_plants_or_animals));
        gzVar.mo55429h(C63736ay.STRING_LENS_PROMO_HEADER_CAPTURE_ANY_TEXT_TO_YOUR_PHONE, Integer.valueOf(R.string.googleapp_lens_tout_promo_header_capture_any_text_to_your_phone));
        gzVar.mo55429h(C63736ay.STRING_LENS_PROMO_HEADER_TRANSLATE_COPY_OR_LISTEN, Integer.valueOf(R.string.googleapp_lens_tout_promo_header_translate_copy_or_listen));
        gzVar.mo55429h(C63736ay.STRING_LENS_PROMO_SUBHEADER, Integer.valueOf(R.string.googleapp_lens_tout_promo_subheader));
        gzVar.mo55429h(C63736ay.STRING_TRY_IT, Integer.valueOf(R.string.googleapp_lens_tout_promo_positive_text));
        gzVar.mo55429h(C63736ay.STRING_WAA_DISABLED_HEADER, Integer.valueOf(R.string.googleapp_waa_disabled_tout_promo_header));
        gzVar.mo55429h(C63736ay.STRING_WAA_DISABLED_SUBHEADER, Integer.valueOf(R.string.googleapp_waa_disabled_tout_promo_subheader));
        gzVar.mo55429h(C63736ay.STRING_WAA_DISABLED_PROMO_DESCRIPTION, Integer.valueOf(R.string.googleapp_waa_disabled_tout_promo_description));
        gzVar.mo55429h(C63736ay.STRING_MANAGE, Integer.valueOf(R.string.googleapp_positive_text_manage));
        gzVar.mo55429h(C63736ay.STRING_GOT_IT, Integer.valueOf(R.string.googleapp_negative_text_got_it));
        gzVar.mo55429h(C63736ay.STRING_CHECK_WEATHER, Integer.valueOf(R.string.googleapp_positive_text_check_weather));
        gzVar.mo55429h(C63736ay.STRING_COVID_VACCINE_GENERAL_HEADER, Integer.valueOf(R.string.googleapp_covid_vaccine_general_header));
        gzVar.mo55429h(C63736ay.STRING_COVID_VACCINE_GENERAL_SUBHEADER, Integer.valueOf(R.string.googleapp_covid_vaccine_general_subheader));
        gzVar.mo55429h(C63736ay.STRING_COVID_VACCINE_REGISTER_HEADER, Integer.valueOf(R.string.googleapp_covid_vaccine_register_header));
        gzVar.mo55429h(C63736ay.STRING_COVID_VACCINE_REGISTER_25_SUBHEADER, Integer.valueOf(R.string.googleapp_covid_vaccine_register_25_subheader));
        gzVar.mo55429h(C63736ay.STRING_COVID_VACCINE_REGISTER_18_SUBHEADER, Integer.valueOf(R.string.googleapp_covid_vaccine_register_18_subheader));
        gzVar.mo55429h(C63736ay.STRING_COVID_VACCINE_REGISTER_16_SUBHEADER, Integer.valueOf(R.string.googleapp_covid_vaccine_register_16_subheader));
        gzVar.mo55429h(C63736ay.STRING_COVID_VACCINE_REGISTER_12_SUBHEADER, Integer.valueOf(R.string.googleapp_covid_vaccine_register_12_subheader));
        gzVar.mo55429h(C63736ay.STRING_NO_THANKS, Integer.valueOf(R.string.googleapp_negative_text_no_thanks));
        gzVar.mo55429h(C63736ay.STRING_NOT_NOW, Integer.valueOf(R.string.googleapp_negative_text_not_now));
        gzVar.mo55429h(C63736ay.STRING_LEARN_MORE, Integer.valueOf(R.string.googleapp_positive_text_learn_more));
        gzVar.mo55429h(C63736ay.STRING_REGISTER, Integer.valueOf(R.string.googleapp_positive_text_register));
        gzVar.mo55429h(C63736ay.STRING_VOICE_SEARCH_WITH_VOICE, Integer.valueOf(R.string.googleapp_voice_search_with_voice));
        gzVar.mo55429h(C63736ay.STRING_VOICE_SEARCH_TIRED_OF_TYPING, Integer.valueOf(R.string.googleapp_voice_search_tired_of_typing));
        gzVar.mo55429h(C63736ay.STRING_VOICE_SEARCH_HUMMING, Integer.valueOf(R.string.googleapp_voice_search_humming));
        gzVar.mo55429h(C63736ay.STRING_VOICE_SEARCH_HUM_QUESTION, Integer.valueOf(R.string.googleapp_voice_search_hum_question));
        gzVar.mo55429h(C63736ay.STRING_VOICE_SEARCH_GET_ANSWER, Integer.valueOf(R.string.googleapp_voice_search_get_answer));
        gzVar.mo55429h(C63736ay.STRING_PEOPLE_CARD_HEADER_HELP_OTHERS, Integer.valueOf(R.string.googleapp_people_card_header_help_others));
        gzVar.mo55429h(C63736ay.STRING_PEOPLE_CARD_HEADER_DISCOVERABLE, Integer.valueOf(R.string.googleapp_people_card_header_discoverable));
        gzVar.mo55429h(C63736ay.STRING_PEOPLE_CARD_HEADER_EASIER_TO_FIND, Integer.valueOf(R.string.googleapp_people_card_header_easier_to_find));
        gzVar.mo55429h(C63736ay.STRING_PEOPLE_CARD_HEADER_LEARN_MORE, Integer.valueOf(R.string.googleapp_people_card_header_learn_more));
        gzVar.mo55429h(C63736ay.STRING_PEOPLE_CARD_SUBHEADER, Integer.valueOf(R.string.googleapp_people_card_subheader));
        gzVar.mo55429h(C63736ay.STRING_LEARN_HOW, Integer.valueOf(R.string.googleapp_people_card_learn_how));
        gzVar.mo55429h(C63736ay.STRING_PEOPLE_CARD_CONTENT_DESCRIPTION, Integer.valueOf(R.string.googleapp_people_card_tout_promo_description));
        gzVar.mo55429h(C63736ay.STRING_AR_CARD_CONTENT_DESCRIPTION, Integer.valueOf(R.string.googleapp_ar_card_content_description));
        gzVar.mo55429h(C63736ay.STRING_AR_CARD_HEADER_BRING_THE_ZOO, Integer.valueOf(R.string.googleapp_ar_card_header_bring_the_zoo));
        gzVar.mo55429h(C63736ay.STRING_AR_CARD_HEADER_TURN_YOUR_HOME, Integer.valueOf(R.string.googleapp_ar_card_header_turn_your_home));
        gzVar.mo55429h(C63736ay.STRING_AR_CARD_SUBHEADER, Integer.valueOf(R.string.googleapp_ar_card_subheader));
        gzVar.mo55429h(C63736ay.STRING_TRY_NOW, Integer.valueOf(R.string.googleapp_positive_text_try_now));
        gzVar.mo55429h(C63736ay.STRING_NEW_SEARCH_USER_HEADER_GET_HELPFUL_TIPS, Integer.valueOf(R.string.googleapp_new_search_user_card_header_get_helpful_tips));
        gzVar.mo55429h(C63736ay.STRING_NEW_SEARCH_USER_HEADER_DISCOVER_MORE, Integer.valueOf(R.string.googleapp_new_search_user_card_header_discover_more));
        gzVar.mo55429h(C63736ay.STRING_NEW_SEARCH_USER_SUBHEADER, Integer.valueOf(R.string.googleapp_new_search_user_card_subheader));
        gzVar.mo55429h(C63736ay.STRING_NEW_SEARCH_USER_CONTENT_DESCRIPTION, Integer.valueOf(R.string.googleapp_new_search_user_card_content_description));
        gzVar.mo55429h(C63736ay.STRING_ADD_WIDGET, Integer.valueOf(R.string.googleapp_positive_text_add_widget));
        gzVar.mo55429h(C63736ay.STRING_WEATHER_HSI_WHATS_THE_WEATHER, Integer.valueOf(R.string.googleapp_weather_hsi_header_whats_the_weather));
        gzVar.mo55429h(C63736ay.STRING_WEATHER_HSI_YOUR_WEATHER_FORECAST, Integer.valueOf(R.string.googleapp_weather_hsi_header_your_weather_forecast));
        gzVar.mo55429h(C63736ay.STRING_WEATHER_HSI_WANT_TO_KNOW, Integer.valueOf(R.string.googleapp_weather_hsi_header_want_to_know));
        gzVar.mo55429h(C63736ay.STRING_WEATHER_HSI_CHECK_THE_WEATHER, Integer.valueOf(R.string.googleapp_weather_hsi_header_check_the_weather));
        gzVar.mo55429h(C63736ay.STRING_WEATHER_HSI_SUBHEADER, Integer.valueOf(R.string.googleapp_weather_hsi_subheader));
        gzVar.mo55429h(C63736ay.STRING_WEATHER_HSI_CONTENT_DESCRIPTION, Integer.valueOf(R.string.googleapp_weather_hsi_content_description));
        gzVar.mo55429h(C63736ay.STRING_BOC_ICON_TAP_TO_MANAGE_WHAT_YOU_SEE, Integer.valueOf(R.string.googleapp_boc_tooltip_tap_to_manage_what_you_see));
        gzVar.mo55429h(C63736ay.STRING_BOC_ICON_MANAGE_WHAT_YOU_SEE, Integer.valueOf(R.string.googleapp_boc_tooltip_manage_what_you_see));
        gzVar.mo55429h(C63736ay.STRING_BOC_ICON_TAP_TO_MANAGE_YOUR_PREFERENCES, Integer.valueOf(R.string.googleapp_boc_tooltip_tap_to_manage_your_preferences));
        gzVar.mo55429h(C63736ay.STRING_BOC_ICON_MANAGE_YOUR_PREFERENCES, Integer.valueOf(R.string.googleapp_boc_tooltip_manage_your_preferences));
        gzVar.mo55429h(C63736ay.STRING_OPEN_THIS_MENU_FOR_NEW_WAYS_TO_CHOOSE_AD_EXPERIENCE_ON_GOOGLE, Integer.valueOf(R.string.googleapp_ads_boc_tooltip_copy_open_this_menu_choose_the_ad_thats_right_for_you));
        gzVar.mo55429h(C63736ay.STRING_SEARCH_BOTTOMBAR_TAP_TO_START_NEW_SEARCH, Integer.valueOf(R.string.googleapp_search_bottombar_tooltip_tap_start_new_search));
        gzVar.mo55429h(C63736ay.STRING_SEARCH_BOTTOMBAR_TAP_TO_ACCESS_SEARCH_RESULT, Integer.valueOf(R.string.googleapp_search_bottombar_tooltip_tap_access_search_result));
        gzVar.mo55429h(C63736ay.STRING_SEARCH_BOTTOMBAR_TAP_TO_SEARCH, Integer.valueOf(R.string.googleapp_search_bottombar_tooltip_tap_search));
        gzVar.mo55429h(C63736ay.STRING_SIGN_IN_TOUT_HEADER, Integer.valueOf(R.string.googleapp_sign_in_tout_header));
        gzVar.mo55429h(C63736ay.STRING_SIGN_IN_TOUT_SUBHEADER, Integer.valueOf(R.string.googleapp_sign_in_tout_subheader));
        gzVar.mo55429h(C63736ay.STRING_SIGN_IN_TOUT_SIGN_IN, Integer.valueOf(R.string.googleapp_sign_in_tout_positive_text));
        gzVar.mo55429h(C63736ay.STRING_SIGN_IN_TOUT_CANCEL, Integer.valueOf(R.string.googleapp_sign_in_tout_negative_text));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_NOTIFICATION_POSITIVE, Integer.valueOf(R.string.googleapp_turn_on_notification_text));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_WEATHER_NOTIFICATION_HEADER, Integer.valueOf(R.string.googleapp_turn_on_weather_header));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_WEATHER_NOTIFICATION_SUBHEADER, Integer.valueOf(R.string.googleapp_turn_on_weather_subheader));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_WEATHER_AND_OTHERS_NOTIFICATION_HEADER, Integer.valueOf(R.string.googleapp_turn_on_weather_and_other_header));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_WEATHER_AND_OTHERS_NOTIFICATION_SUBHEADER, Integer.valueOf(R.string.googleapp_turn_on_weather_and_other_subheader));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_NEWS_NOTIFICATION_HEADER, Integer.valueOf(R.string.googleapp_turn_on_news_header));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_NEWS_NOTIFICATION_SUBHEADER, Integer.valueOf(R.string.googleapp_turn_on_news_subheader));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_NEWS_AND_OTHERS_NOTIFICATION_HEADER, Integer.valueOf(R.string.googleapp_turn_on_news_and_other_header));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_NEWS_AND_OTHERS_NOTIFICATION_SUBHEADER, Integer.valueOf(R.string.googleapp_turn_on_news_and_other_subheader));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_SPORTS_NOTIFICATION_HEADER, Integer.valueOf(R.string.googleapp_turn_on_sports_header));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_SPORTS_NOTIFICATION_SUBHEADER, Integer.valueOf(R.string.googleapp_turn_on_sports_subheader));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_SPORTS_AND_OTHERS_NOTIFICATION_HEADER, Integer.valueOf(R.string.googleapp_turn_on_sports_and_other_header));
        gzVar.mo55429h(C63736ay.STRING_TURN_ON_SPORTS_AND_OTHERS_NOTIFICATION_SUBHEADER, Integer.valueOf(R.string.googleapp_turn_on_sports_and_other_subheader));
        gzVar.mo55429h(C63736ay.STRING_QSB_REINSTALL_ADD_NOW, Integer.valueOf(R.string.googleapp_qsb_reinstall_promo_positive_text));
        gzVar.mo55429h(C63736ay.STRING_QSB_REINSTALL_FASTER_SEARCH_HEADER, Integer.valueOf(R.string.googleapp_qsb_reinstall_promo_header));
        gzVar.mo55429h(C63736ay.STRING_QSB_REINSTALL_SEARCH_RESULT_HEADER, Integer.valueOf(R.string.googleapp_qsb_reinstall_promo_search_result_header));
        gzVar.mo55429h(C63736ay.STRING_QSB_REINSTALL_LENS_SEARCH_HEADER, Integer.valueOf(R.string.googleapp_qsb_reinstall_promo_lens_header));
        gzVar.mo55429h(C63736ay.STRING_QSB_REINSTALL_LENS_SEARCH_SUBHEADER, Integer.valueOf(R.string.googleapp_qsb_reinstall_promo_lens_subheader));
        gzVar.mo55429h(C63736ay.STRING_QSB_REINSTALL_VOICE_SEARCH_HEADER, Integer.valueOf(R.string.googleapp_qsb_reinstall_promo_voice_header));
        gzVar.mo55429h(C63736ay.STRING_QSB_REINSTALL_VOICE_SEARCH_SUBHEADER, Integer.valueOf(R.string.googleapp_qsb_reinstall_promo_voice_subheader));
        gzVar.mo55429h(C63736ay.STRING_FIND_THAT_SONG_BY_HUMMING, Integer.valueOf(R.string.googleapp_find_that_song_by_humming));
        f373133b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C63754k.DRAWABLE_DEFAULT_DIALOG, Uri.parse("https://www.gstatic.com/android-search/promo_manager/googleapp_dialog_default_illustration.png"));
        gzVar2.mo55429h(C63754k.DRAWABLE_DEFAULT_TAKEOVER, Uri.parse("https://www.gstatic.com/android-search/promo_manager/googleapp_takeover_default_illustration.png"));
        gzVar2.mo55429h(C63754k.DRAWABLE_DEFAULT_TOUT, Uri.parse("https://www.gstatic.com/android-search/promo_manager/googleapp_tout_default_illustration.png"));
        gzVar2.mo55429h(C63754k.DRAWABLE_SEARCH_WIDGET, Uri.parse("https://www.gstatic.com/android-search/promo_manager/googleapp_search_widget_promo_tout_illustration.png"));
        f373134c = gzVar2.mo55427f(false);
        C58490gz gzVar3 = new C58490gz(4);
        gzVar3.mo55429h(C63742bd.GRAVITY_UNKNOWN, C63932bs.GRAVITY_UNSPECIFIED);
        gzVar3.mo55429h(C63742bd.ABOVE, C63932bs.ABOVE);
        gzVar3.mo55429h(C63742bd.BELOW, C63932bs.BELOW);
        f373132a = gzVar3.mo55427f(false);
    }

    /* renamed from: a */
    public static String m222834a(Context context, C63750g gVar) {
        C63736ay ayVar;
        if (gVar.f172463a == 2) {
            ayVar = C63736ay.m96292a(((Integer) gVar.f172464b).intValue());
            if (ayVar == null) {
                ayVar = C63736ay.STRING_UNKNOWN;
            }
        } else {
            ayVar = C63736ay.STRING_UNKNOWN;
        }
        C58495hd hdVar = f373133b;
        if (!hdVar.containsKey(ayVar)) {
            return gVar.f172463a == 1 ? (String) gVar.f172464b : BuildConfig.FLAVOR;
        }
        return context.getString(((Integer) hdVar.get(ayVar)).intValue());
    }

    /* renamed from: b */
    public static void m222835b(Button button, C63750g gVar) {
        C63736ay ayVar;
        C63732au auVar = C63732au.TOUT;
        C63958v vVar = C63958v.TYPE_UNSPECIFIED;
        int i = gVar.f172463a;
        int a = C63749f.m96301a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            button.setText(i == 1 ? (String) gVar.f172464b : BuildConfig.FLAVOR);
        } else if (i2 == 1) {
            if (i == 2) {
                ayVar = C63736ay.m96292a(((Integer) gVar.f172464b).intValue());
                if (ayVar == null) {
                    ayVar = C63736ay.STRING_UNKNOWN;
                }
            } else {
                ayVar = C63736ay.STRING_UNKNOWN;
            }
            C58495hd hdVar = f373133b;
            if (hdVar.containsKey(ayVar)) {
                button.setText(((Integer) hdVar.get(ayVar)).intValue());
            }
        }
    }

    /* renamed from: c */
    public static void m222836c(Context context, ImageView imageView, C63754k kVar, String str, C63736ay ayVar, String str2, C47449e eVar) {
        C58495hd hdVar = f373133b;
        if (hdVar.containsKey(ayVar)) {
            str2 = context.getString(((Integer) hdVar.get(ayVar)).intValue());
        }
        if (!str2.isEmpty()) {
            imageView.setContentDescription(str2);
        }
        C58495hd hdVar2 = f373134c;
        if (hdVar2.containsKey(kVar)) {
            eVar.mo51286a().mo11870h((Uri) hdVar2.get(kVar)).mo12454r(imageView);
        } else if (!str.isEmpty()) {
            eVar.mo51286a().mo11870h(Uri.parse(str)).mo12454r(imageView);
        }
    }

    /* renamed from: d */
    public static void m222837d(TextView textView, C63750g gVar) {
        C63736ay ayVar;
        C63732au auVar = C63732au.TOUT;
        C63958v vVar = C63958v.TYPE_UNSPECIFIED;
        int i = gVar.f172463a;
        int a = C63749f.m96301a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            textView.setText(i == 1 ? (String) gVar.f172464b : BuildConfig.FLAVOR);
        } else if (i2 == 1) {
            if (i == 2) {
                ayVar = C63736ay.m96292a(((Integer) gVar.f172464b).intValue());
                if (ayVar == null) {
                    ayVar = C63736ay.STRING_UNKNOWN;
                }
            } else {
                ayVar = C63736ay.STRING_UNKNOWN;
            }
            C58495hd hdVar = f373133b;
            if (hdVar.containsKey(ayVar)) {
                textView.setText(((Integer) hdVar.get(ayVar)).intValue());
            }
        }
    }

    /* renamed from: e */
    public static boolean m222838e(C63758o oVar) {
        int a;
        int i = oVar.f172483a;
        if ((i & 2) != 0 && (a = C63752i.m96302a(oVar.f172485c)) != 0 && a != 1) {
            return true;
        }
        if ((i & 4) != 0 && !oVar.f172486d.isEmpty()) {
            return true;
        }
        if (!oVar.f172484b.isEmpty()) {
            try {
                Intent.parseUri(oVar.f172484b, 1);
                return true;
            } catch (URISyntaxException unused) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m222839f(C63944h hVar, C58528ij ijVar) {
        C63943g a = C63943g.m96323a(hVar.f172935a);
        if (a == null) {
            a = C63943g.TYPE_UNSPECIFIED;
        }
        if (ijVar.contains(a)) {
            return true;
        }
        C63943g a2 = C63943g.m96323a(hVar.f172935a);
        if (a2 == null) {
            a2 = C63943g.TYPE_UNSPECIFIED;
        }
        return a2 == C63943g.OPEN_URL;
    }

    /* renamed from: g */
    public static boolean m222840g(C63750g gVar) {
        C63736ay ayVar;
        if ((gVar.f172463a == 1 ? (String) gVar.f172464b : BuildConfig.FLAVOR).isEmpty()) {
            C58495hd hdVar = f373133b;
            if (gVar.f172463a == 2) {
                ayVar = C63736ay.m96292a(((Integer) gVar.f172464b).intValue());
                if (ayVar == null) {
                    ayVar = C63736ay.STRING_UNKNOWN;
                }
            } else {
                ayVar = C63736ay.STRING_UNKNOWN;
            }
            if (hdVar.containsKey(ayVar)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m222841h(C63961y yVar) {
        return !(yVar.f172988a == 2 ? (String) yVar.f172989b : BuildConfig.FLAVOR).isEmpty();
    }

    /* renamed from: i */
    public static boolean m222842i(String str, C63961y yVar) {
        return !str.isEmpty() && m222841h(yVar);
    }

    /* renamed from: j */
    public static boolean m222843j(C63754k kVar, String str, C63736ay ayVar, String str2) {
        if (!f373134c.containsKey(kVar) && str.isEmpty()) {
            return false;
        }
        if (f373133b.containsKey(ayVar) || !str2.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m222844k(C137007dh dhVar) {
        return m222845l(dhVar, C58733pz.f156496a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r7 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63939c.m96322a(r7.f172920b);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m222845l(com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh r7, com.google.common.p4522b.C58528ij r8) {
        /*
            com.google.protos.aq.au r0 = com.google.protos.p4880aq.C63732au.TOUT
            com.google.protos.aw.a.a.a.v r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v.TYPE_UNSPECIFIED
            int r0 = r7.f372872b
            int r1 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137006dg.m222698a(r0)
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x02f1
            r1 = 2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0177
            if (r2 == r4) goto L_0x0016
            return r3
        L_0x0016:
            if (r0 != r1) goto L_0x001d
            java.lang.Object r7 = r7.f372873c
            com.google.protos.aw.a.a.a.w r7 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w) r7
            goto L_0x001f
        L_0x001d:
            com.google.protos.aw.a.a.a.w r7 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w.f172981b
        L_0x001f:
            int r0 = r7.f172983a
            com.google.protos.aw.a.a.a.v r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v.m96327a(r0)
            if (r0 != 0) goto L_0x0029
            com.google.protos.aw.a.a.a.v r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v.TYPE_UNSPECIFIED
        L_0x0029:
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0135;
                case 2: goto L_0x00e8;
                case 3: goto L_0x0099;
                case 4: goto L_0x005e;
                case 5: goto L_0x005e;
                case 6: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0176
        L_0x0032:
            com.google.protobuf.bt r8 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63940d.f172917d
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r7.mo58887l(r8)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r0 = r8.f169971d
            java.lang.Object r7 = r7.mo58854l(r0)
            if (r7 != 0) goto L_0x0048
            java.lang.Object r7 = r8.f169969b
            goto L_0x004c
        L_0x0048:
            java.lang.Object r7 = r8.mo58889c(r7)
        L_0x004c:
            com.google.protos.aw.a.a.a.d r7 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63940d) r7
            int r8 = r7.f172919a
            r8 = r8 & r4
            if (r8 == 0) goto L_0x0176
            int r7 = r7.f172920b
            int r7 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63939c.m96322a(r7)
            if (r7 == 0) goto L_0x0176
            if (r7 == r4) goto L_0x0176
            return r4
        L_0x005e:
            com.google.protobuf.bt r8 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63933bt.f172893e
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r7.mo58887l(r8)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r0 = r8.f169971d
            java.lang.Object r7 = r7.mo58854l(r0)
            if (r7 != 0) goto L_0x0074
            java.lang.Object r7 = r8.f169969b
            goto L_0x0078
        L_0x0074:
            java.lang.Object r7 = r8.mo58889c(r7)
        L_0x0078:
            com.google.protos.aw.a.a.a.bt r7 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63933bt) r7
            int r8 = r7.f172895a
            if (r8 == 0) goto L_0x0176
            int r8 = r7.f172897c
            com.google.protos.aw.a.a.a.bs r8 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63932bs.m96320a(r8)
            if (r8 != 0) goto L_0x0088
            com.google.protos.aw.a.a.a.bs r8 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63932bs.GRAVITY_UNSPECIFIED
        L_0x0088:
            com.google.protos.aw.a.a.a.bs r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63932bs.GRAVITY_UNSPECIFIED
            if (r8 == r0) goto L_0x0176
            com.google.protos.aw.a.a.a.y r7 = r7.f172896b
            if (r7 != 0) goto L_0x0092
            com.google.protos.aw.a.a.a.y r7 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x0092:
            boolean r7 = m222841h(r7)
            if (r7 == 0) goto L_0x0176
            return r4
        L_0x0099:
            com.google.protobuf.bt r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq.f172793i
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r7 = r7.mo58854l(r1)
            if (r7 != 0) goto L_0x00af
            java.lang.Object r7 = r0.f169969b
            goto L_0x00b3
        L_0x00af:
            java.lang.Object r7 = r0.mo58889c(r7)
        L_0x00b3:
            com.google.protos.aw.a.a.a.aq r7 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq) r7
            com.google.protos.aw.a.a.a.y r0 = r7.f172795a
            if (r0 != 0) goto L_0x00bb
            com.google.protos.aw.a.a.a.y r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x00bb:
            boolean r0 = m222841h(r0)
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = r7.f172797c
            com.google.protos.aw.a.a.a.y r1 = r7.f172798d
            if (r1 != 0) goto L_0x00c9
            com.google.protos.aw.a.a.a.y r1 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x00c9:
            boolean r0 = m222842i(r0, r1)
            if (r0 == 0) goto L_0x0176
            com.google.protos.aw.a.a.a.y r0 = r7.f172799e
            if (r0 != 0) goto L_0x00d5
            com.google.protos.aw.a.a.a.y r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x00d5:
            boolean r0 = m222841h(r0)
            if (r0 == 0) goto L_0x0176
            com.google.protos.aw.a.a.a.h r7 = r7.f172801g
            if (r7 != 0) goto L_0x00e1
            com.google.protos.aw.a.a.a.h r7 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h.f172933b
        L_0x00e1:
            boolean r7 = m222839f(r7, r8)
            if (r7 == 0) goto L_0x0176
            return r4
        L_0x00e8:
            com.google.protobuf.bt r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq.f172793i
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r7 = r7.mo58854l(r1)
            if (r7 != 0) goto L_0x00fe
            java.lang.Object r7 = r0.f169969b
            goto L_0x0102
        L_0x00fe:
            java.lang.Object r7 = r0.mo58889c(r7)
        L_0x0102:
            com.google.protos.aw.a.a.a.aq r7 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq) r7
            com.google.protos.aw.a.a.a.y r0 = r7.f172795a
            if (r0 != 0) goto L_0x010a
            com.google.protos.aw.a.a.a.y r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x010a:
            boolean r0 = m222841h(r0)
            if (r0 == 0) goto L_0x0176
            com.google.protos.aw.a.a.a.y r0 = r7.f172799e
            if (r0 != 0) goto L_0x0116
            com.google.protos.aw.a.a.a.y r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x0116:
            boolean r0 = m222841h(r0)
            if (r0 == 0) goto L_0x0176
            com.google.protos.aw.a.a.a.y r0 = r7.f172800f
            if (r0 != 0) goto L_0x0122
            com.google.protos.aw.a.a.a.y r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x0122:
            boolean r0 = m222841h(r0)
            if (r0 == 0) goto L_0x0176
            com.google.protos.aw.a.a.a.h r7 = r7.f172801g
            if (r7 != 0) goto L_0x012e
            com.google.protos.aw.a.a.a.h r7 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h.f172933b
        L_0x012e:
            boolean r7 = m222839f(r7, r8)
            if (r7 == 0) goto L_0x0176
            return r4
        L_0x0135:
            com.google.protobuf.bt r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq.f172793i
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r7 = r7.mo58854l(r1)
            if (r7 != 0) goto L_0x014b
            java.lang.Object r7 = r0.f169969b
            goto L_0x014f
        L_0x014b:
            java.lang.Object r7 = r0.mo58889c(r7)
        L_0x014f:
            com.google.protos.aw.a.a.a.aq r7 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq) r7
            com.google.protos.aw.a.a.a.y r0 = r7.f172795a
            if (r0 != 0) goto L_0x0157
            com.google.protos.aw.a.a.a.y r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x0157:
            boolean r0 = m222841h(r0)
            if (r0 == 0) goto L_0x0176
            com.google.protos.aw.a.a.a.y r0 = r7.f172799e
            if (r0 != 0) goto L_0x0163
            com.google.protos.aw.a.a.a.y r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y.f172986c
        L_0x0163:
            boolean r0 = m222841h(r0)
            if (r0 == 0) goto L_0x0176
            com.google.protos.aw.a.a.a.h r7 = r7.f172801g
            if (r7 != 0) goto L_0x016f
            com.google.protos.aw.a.a.a.h r7 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h.f172933b
        L_0x016f:
            boolean r7 = m222839f(r7, r8)
            if (r7 == 0) goto L_0x0176
            return r4
        L_0x0176:
            return r3
        L_0x0177:
            if (r0 != r4) goto L_0x017e
            java.lang.Object r7 = r7.f372873c
            com.google.protos.aq.av r7 = (com.google.protos.p4880aq.C63733av) r7
            goto L_0x0180
        L_0x017e:
            com.google.protos.aq.av r7 = com.google.protos.p4880aq.C63733av.f172308c
        L_0x0180:
            int r8 = r7.f172310a
            com.google.protos.aq.au r8 = com.google.protos.p4880aq.C63732au.m96291a(r8)
            int r8 = r8.ordinal()
            if (r8 == 0) goto L_0x02c0
            if (r8 == r4) goto L_0x0284
            r0 = 4
            r2 = 3
            if (r8 == r1) goto L_0x0207
            if (r8 == r2) goto L_0x01d4
            r1 = 5
            if (r8 == r0) goto L_0x01b7
            if (r8 == r1) goto L_0x019a
            return r3
        L_0x019a:
            int r8 = r7.f172310a
            r0 = 6
            if (r8 != r0) goto L_0x01a4
            java.lang.Object r7 = r7.f172311b
            com.google.protos.aq.bg r7 = (com.google.protos.p4880aq.C63745bg) r7
            goto L_0x01a6
        L_0x01a4:
            com.google.protos.aq.bg r7 = com.google.protos.p4880aq.C63745bg.f172450e
        L_0x01a6:
            int r8 = r7.f172452a
            if (r8 != r1) goto L_0x02f0
            com.google.protos.aq.g r7 = r7.f172454c
            if (r7 != 0) goto L_0x01b0
            com.google.protos.aq.g r7 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x01b0:
            boolean r7 = m222840g(r7)
            if (r7 == 0) goto L_0x02f0
            return r4
        L_0x01b7:
            int r8 = r7.f172310a
            if (r8 != r1) goto L_0x01c0
            java.lang.Object r7 = r7.f172311b
            com.google.protos.aq.d r7 = (com.google.protos.p4880aq.C63747d) r7
            goto L_0x01c2
        L_0x01c0:
            com.google.protos.aq.d r7 = com.google.protos.p4880aq.C63747d.f172457c
        L_0x01c2:
            int r8 = r7.f172459a
            r8 = r8 & r4
            if (r8 == 0) goto L_0x02f0
            int r7 = r7.f172460b
            int r7 = com.google.protos.p4880aq.C63746c.m96300a(r7)
            if (r7 != 0) goto L_0x01d1
            goto L_0x02f0
        L_0x01d1:
            if (r7 == r4) goto L_0x02f0
            return r4
        L_0x01d4:
            int r8 = r7.f172310a
            if (r8 != r0) goto L_0x01dd
            java.lang.Object r7 = r7.f172311b
            com.google.protos.aq.bg r7 = (com.google.protos.p4880aq.C63745bg) r7
            goto L_0x01df
        L_0x01dd:
            com.google.protos.aq.bg r7 = com.google.protos.p4880aq.C63745bg.f172450e
        L_0x01df:
            int r8 = r7.f172452a
            if (r8 != r4) goto L_0x01f4
            java.lang.Object r8 = r7.f172453b
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            com.google.protos.aq.bf r8 = com.google.protos.p4880aq.C63744bf.m96298a(r8)
            if (r8 != 0) goto L_0x01f6
            com.google.protos.aq.bf r8 = com.google.protos.p4880aq.C63744bf.TARGET_UNKNOWN
            goto L_0x01f6
        L_0x01f4:
            com.google.protos.aq.bf r8 = com.google.protos.p4880aq.C63744bf.TARGET_UNKNOWN
        L_0x01f6:
            com.google.protos.aq.bf r0 = com.google.protos.p4880aq.C63744bf.TARGET_UNKNOWN
            if (r8 == r0) goto L_0x02f0
            com.google.protos.aq.g r7 = r7.f172454c
            if (r7 != 0) goto L_0x0200
            com.google.protos.aq.g r7 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x0200:
            boolean r7 = m222840g(r7)
            if (r7 == 0) goto L_0x02f0
            return r4
        L_0x0207:
            int r8 = r7.f172310a
            if (r8 != r2) goto L_0x0210
            java.lang.Object r7 = r7.f172311b
            com.google.protos.aq.q r7 = (com.google.protos.p4880aq.C63760q) r7
            goto L_0x0212
        L_0x0210:
            com.google.protos.aq.q r7 = com.google.protos.p4880aq.C63760q.f172487j
        L_0x0212:
            com.google.protos.aq.g r8 = r7.f172493e
            if (r8 != 0) goto L_0x0218
            com.google.protos.aq.g r8 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x0218:
            boolean r8 = m222840g(r8)
            if (r8 == 0) goto L_0x02f0
            int r8 = r7.f172489a
            if (r8 != r2) goto L_0x0233
            java.lang.Object r8 = r7.f172490b
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            com.google.protos.aq.k r8 = com.google.protos.p4880aq.C63754k.m96303a(r8)
            if (r8 != 0) goto L_0x0235
            com.google.protos.aq.k r8 = com.google.protos.p4880aq.C63754k.DRAWABLE_UNKNOWN
            goto L_0x0235
        L_0x0233:
            com.google.protos.aq.k r8 = com.google.protos.p4880aq.C63754k.DRAWABLE_UNKNOWN
        L_0x0235:
            int r1 = r7.f172489a
            r2 = 8
            java.lang.String r5 = ""
            if (r1 != r2) goto L_0x0242
            java.lang.Object r1 = r7.f172490b
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0243
        L_0x0242:
            r1 = r5
        L_0x0243:
            int r2 = r7.f172491c
            if (r2 != r0) goto L_0x0258
            java.lang.Object r0 = r7.f172492d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.protos.aq.ay r0 = com.google.protos.p4880aq.C63736ay.m96292a(r0)
            if (r0 != 0) goto L_0x025a
            com.google.protos.aq.ay r0 = com.google.protos.p4880aq.C63736ay.STRING_UNKNOWN
            goto L_0x025a
        L_0x0258:
            com.google.protos.aq.ay r0 = com.google.protos.p4880aq.C63736ay.STRING_UNKNOWN
        L_0x025a:
            int r2 = r7.f172491c
            r6 = 9
            if (r2 != r6) goto L_0x0265
            java.lang.Object r2 = r7.f172492d
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
        L_0x0265:
            boolean r8 = m222843j(r8, r1, r0, r5)
            if (r8 == 0) goto L_0x02f0
            com.google.protos.aq.g r8 = r7.f172495g
            if (r8 != 0) goto L_0x0271
            com.google.protos.aq.g r8 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x0271:
            boolean r8 = m222840g(r8)
            if (r8 == 0) goto L_0x02f0
            com.google.protos.aq.o r7 = r7.f172497i
            if (r7 != 0) goto L_0x027d
            com.google.protos.aq.o r7 = com.google.protos.p4880aq.C63758o.f172481e
        L_0x027d:
            boolean r7 = m222838e(r7)
            if (r7 == 0) goto L_0x02f0
            return r4
        L_0x0284:
            int r8 = r7.f172310a
            if (r8 != r1) goto L_0x028d
            java.lang.Object r7 = r7.f172311b
            com.google.protos.aq.q r7 = (com.google.protos.p4880aq.C63760q) r7
            goto L_0x028f
        L_0x028d:
            com.google.protos.aq.q r7 = com.google.protos.p4880aq.C63760q.f172487j
        L_0x028f:
            com.google.protos.aq.g r8 = r7.f172493e
            if (r8 != 0) goto L_0x0295
            com.google.protos.aq.g r8 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x0295:
            boolean r8 = m222840g(r8)
            if (r8 == 0) goto L_0x02f0
            com.google.protos.aq.g r8 = r7.f172495g
            if (r8 != 0) goto L_0x02a1
            com.google.protos.aq.g r8 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x02a1:
            boolean r8 = m222840g(r8)
            if (r8 == 0) goto L_0x02f0
            com.google.protos.aq.g r8 = r7.f172496h
            if (r8 != 0) goto L_0x02ad
            com.google.protos.aq.g r8 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x02ad:
            boolean r8 = m222840g(r8)
            if (r8 == 0) goto L_0x02f0
            com.google.protos.aq.o r7 = r7.f172497i
            if (r7 != 0) goto L_0x02b9
            com.google.protos.aq.o r7 = com.google.protos.p4880aq.C63758o.f172481e
        L_0x02b9:
            boolean r7 = m222838e(r7)
            if (r7 == 0) goto L_0x02f0
            return r4
        L_0x02c0:
            int r8 = r7.f172310a
            if (r8 != r4) goto L_0x02c9
            java.lang.Object r7 = r7.f172311b
            com.google.protos.aq.q r7 = (com.google.protos.p4880aq.C63760q) r7
            goto L_0x02cb
        L_0x02c9:
            com.google.protos.aq.q r7 = com.google.protos.p4880aq.C63760q.f172487j
        L_0x02cb:
            com.google.protos.aq.g r8 = r7.f172493e
            if (r8 != 0) goto L_0x02d1
            com.google.protos.aq.g r8 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x02d1:
            boolean r8 = m222840g(r8)
            if (r8 == 0) goto L_0x02f0
            com.google.protos.aq.g r8 = r7.f172495g
            if (r8 != 0) goto L_0x02dd
            com.google.protos.aq.g r8 = com.google.protos.p4880aq.C63750g.f172461c
        L_0x02dd:
            boolean r8 = m222840g(r8)
            if (r8 == 0) goto L_0x02f0
            com.google.protos.aq.o r7 = r7.f172497i
            if (r7 != 0) goto L_0x02e9
            com.google.protos.aq.o r7 = com.google.protos.p4880aq.C63758o.f172481e
        L_0x02e9:
            boolean r7 = m222838e(r7)
            if (r7 == 0) goto L_0x02f0
            return r4
        L_0x02f0:
            return r3
        L_0x02f1:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10377f.C137121o.m222845l(com.google.android.apps.search.googleapp.promomanager.b.dh, com.google.common.b.ij):boolean");
    }
}
