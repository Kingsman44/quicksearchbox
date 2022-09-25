package com.google.android.apps.gsa.shared.p6990an;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.p3202c.C41643a;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.C41675ao;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41689o;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C59590apa;
import com.google.common.p4552o.aou;
import com.google.common.p4552o.apb;
import com.google.p395al.p417d.p418a.C8541au;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54242f;
import com.google.p4017at.p4060h.p4073d.p4074a.C54246j;
import com.google.p4017at.p4060h.p4073d.p4074a.C54250n;
import com.google.protobuf.C62971cq;
import com.google.protos.p4948ba.p4949a.C64369b;
import com.google.protos.p4948ba.p4949a.C64371d;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.an.z */
/* compiled from: PG */
public final class C89235z extends C41675ao {

    /* renamed from: a */
    public static final /* synthetic */ int f241968a = 0;

    /* renamed from: b */
    private static final Pattern f241969b = Pattern.compile("([^/]*)/.*");

    /* renamed from: A */
    public static boolean m145121A(Suggestion suggestion) {
        return !TextUtils.isEmpty(m73091K(suggestion)) && !TextUtils.isEmpty(m145145q(suggestion));
    }

    /* renamed from: B */
    public static boolean m145122B(Suggestion suggestion) {
        return suggestion.f108925z.contains(219);
    }

    /* renamed from: C */
    public static boolean m145123C(Suggestion suggestion) {
        if (C41670aj.m73088u(suggestion)) {
            return true;
        }
        if (suggestion.mo44265s()) {
            C54216ae aeVar = suggestion.f108906A.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            if ((aeVar.f142290a & 16) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m145124D(String str, String str2) {
        return ("internal.3p:MobileApplication".equals(str) && "com.google.android.gms".equals(str2)) || "apps".equals(str) || "applications_uri".equals(str);
    }

    /* renamed from: E */
    public static boolean m145125E(Suggestion suggestion) {
        if (suggestion.mo44265s()) {
            C54216ae aeVar = suggestion.f108906A.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            if (!aeVar.f142288B.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m145126F(C54228aq aqVar, long j) {
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        C62971cq<C8541au> cqVar = aeVar.f142310u;
        if (cqVar.isEmpty()) {
            return true;
        }
        for (C8541au auVar : cqVar) {
            if (j <= auVar.f29634b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m145127G(C54228aq aqVar, C21370a aVar) {
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return !C89212c.m145117a(aeVar.f142310u, aVar.mo26870b());
    }

    /* renamed from: H */
    public static boolean m145128H(C54228aq aqVar, int i, List list, C21370a aVar, List list2) {
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        C62971cq<C8541au> cqVar = aeVar.f142310u;
        if (cqVar.isEmpty()) {
            return false;
        }
        for (C8541au auVar : cqVar) {
            long j = auVar.f29633a;
            long j2 = auVar.f29634b;
            long b = aVar.mo26870b();
            if (j > b) {
                C59590apa apa = (C59590apa) apb.f159548e.createBuilder();
                apa.copyOnWrite();
                apb apb = (apb) apa.instance;
                apb.f159550a = 1 | apb.f159550a;
                apb.f159551b = i;
                apa.mo57030a(list);
                apa.copyOnWrite();
                apb apb2 = (apb) apa.instance;
                apb2.f159550a |= 2;
                apb2.f159553d = b - j;
                list2.add((apb) apa.build());
            } else if (b <= j2) {
                return false;
            } else {
                C59590apa apa2 = (C59590apa) apb.f159548e.createBuilder();
                apa2.copyOnWrite();
                apb apb3 = (apb) apa2.instance;
                apb3.f159550a = 1 | apb3.f159550a;
                apb3.f159551b = i;
                apa2.mo57030a(list);
                apa2.copyOnWrite();
                apb apb4 = (apb) apa2.instance;
                apb4.f159550a |= 2;
                apb4.f159553d = b - j2;
                list2.add((apb) apa2.build());
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int m145129a(Query query) {
        CharSequence charSequence = query.f252768g;
        int c = query.mo84367c();
        if (TextUtils.isEmpty(charSequence) || c == -1) {
            return c;
        }
        String substring = charSequence.toString().substring(0, c);
        String[] split = substring.split("[^\\s]+");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            c -= Math.max(split[i].length() - 1, 0);
        }
        return substring.matches("^\\s.*") ? c - 1 : c;
    }

    /* renamed from: b */
    public static ComponentName m145130b(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"applications".equals(uri.getAuthority())) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 3 || !"applications".equals(pathSegments.get(0))) {
            return null;
        }
        String str = pathSegments.get(1);
        String str2 = pathSegments.get(2);
        if (str == null || str2 == null) {
            return null;
        }
        return new ComponentName(str, str2);
    }

    /* renamed from: c */
    public static Intent m145131c(Suggestion suggestion, Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(C41670aj.m73076i(suggestion));
    }

    /* renamed from: d */
    public static CharSequence m145132d(Suggestion suggestion) {
        if (C41670aj.m73087t(suggestion)) {
            return C41670aj.m73078k(suggestion);
        }
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
                return aeVar2.f142294e;
            }
        }
        return suggestion.f108908i;
    }

    /* renamed from: e */
    public static Long m145133e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(str, 16));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static String m145134f(Suggestion suggestion, Context context) {
        String i = C41670aj.m73076i(suggestion);
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(i, 0);
            if (applicationInfo != null) {
                return String.valueOf(packageManager.getApplicationLabel(applicationInfo));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static String m145135g(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return null;
        }
        C54228aq aqVar = suggestion.f108906A;
        C54242f fVar = aqVar.f142343o;
        if (fVar == null) {
            fVar = C54242f.f142415f;
        }
        if ((fVar.f142417a & 1) == 0) {
            return null;
        }
        C54242f fVar2 = aqVar.f142343o;
        if (fVar2 == null) {
            fVar2 = C54242f.f142415f;
        }
        return fVar2.f142418b;
    }

    /* renamed from: h */
    public static String m145136h(String str, String str2) {
        ComponentName b = !TextUtils.isEmpty(str) ? m145130b(Uri.parse(str)) : null;
        if (b == null) {
            return str2;
        }
        return b.getPackageName();
    }

    /* renamed from: i */
    public static String m145137i(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return null;
        }
        C54228aq aqVar = suggestion.f108906A;
        C54242f fVar = aqVar.f142343o;
        if (fVar == null) {
            fVar = C54242f.f142415f;
        }
        if ((fVar.f142417a & 4) == 0) {
            return null;
        }
        C54242f fVar2 = aqVar.f142343o;
        if (fVar2 == null) {
            fVar2 = C54242f.f142415f;
        }
        return fVar2.f142420d;
    }

    /* renamed from: j */
    public static String m145138j(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return null;
        }
        C54228aq aqVar = suggestion.f108906A;
        C54246j jVar = aqVar.f142342n;
        if (jVar == null) {
            jVar = C54246j.f142427c;
        }
        if ((jVar.f142429a & 1) == 0) {
            return null;
        }
        C54246j jVar2 = aqVar.f142342n;
        if (jVar2 == null) {
            jVar2 = C54246j.f142427c;
        }
        return jVar2.f142430b;
    }

    /* renamed from: k */
    public static String m145139k(Suggestion suggestion) {
        C41689o oVar = suggestion.f108907B.f109010d;
        if (oVar == null) {
            oVar = C41689o.f109041e;
        }
        if ((oVar.f109043a & 2) != 0) {
            return C41670aj.m73071d(suggestion);
        }
        return null;
    }

    /* renamed from: l */
    public static String m145140l(Suggestion suggestion) {
        C41689o oVar = suggestion.f108907B.f109010d;
        if (oVar == null) {
            oVar = C41689o.f109041e;
        }
        if ((oVar.f109043a & 1) == 0) {
            return null;
        }
        C41689o oVar2 = suggestion.f108907B.f109010d;
        if (oVar2 == null) {
            oVar2 = C41689o.f109041e;
        }
        return oVar2.f109044b;
    }

    /* renamed from: m */
    public static String m145141m(String str, C41679e eVar) {
        C41693s sVar = eVar.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        String str2 = sVar.f109056b;
        C41693s sVar2 = eVar.f109009c;
        if (sVar2 == null) {
            sVar2 = C41693s.f109053h;
        }
        String O = m73095O(sVar2.f109057c);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("#");
        if ("android.intent.action.MAIN".equals(str2)) {
            C41693s sVar3 = eVar.f109009c;
            if (sVar3 == null) {
                sVar3 = C41693s.f109053h;
            }
            sb.append(m145136h(O, sVar3.f109059e));
        } else {
            sb.append(O);
        }
        if (!"android.intent.action.VIEW".equals(str2)) {
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m145142n(java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L_0x0054
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x000e
            goto L_0x0054
        L_0x000e:
            int r0 = r5.hashCode()
            r2 = -1837328862(0xffffffff927c9622, float:-7.970223E-28)
            r3 = 1
            if (r0 == r2) goto L_0x0028
            r2 = 3000946(0x2dca72, float:4.205221E-39)
            if (r0 == r2) goto L_0x001e
            goto L_0x0032
        L_0x001e:
            java.lang.String r0 = "apps"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0032
            r5 = 0
            goto L_0x0033
        L_0x0028:
            java.lang.String r0 = "internal.3p:MobileApplication"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0032
            r5 = 1
            goto L_0x0033
        L_0x0032:
            r5 = -1
        L_0x0033:
            if (r5 == 0) goto L_0x0043
            if (r5 == r3) goto L_0x0038
            return r1
        L_0x0038:
            r5 = 3
            android.content.Intent r4 = android.content.Intent.parseUri(r4, r5)     // Catch:{ URISyntaxException -> 0x0042 }
            java.lang.String r4 = r4.getPackage()     // Catch:{ URISyntaxException -> 0x0042 }
            return r4
        L_0x0042:
            return r1
        L_0x0043:
            java.util.regex.Pattern r5 = f241969b
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.matches()
            if (r5 == 0) goto L_0x0054
            java.lang.String r4 = r4.group(r3)
            return r4
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p6990an.C89235z.m145142n(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: o */
    public static String m145143o(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        if ((sVar.f109055a & 16) == 0) {
            return null;
        }
        C41693s sVar2 = suggestion.f108907B.f109009c;
        if (sVar2 == null) {
            sVar2 = C41693s.f109053h;
        }
        return sVar2.f109060f;
    }

    /* renamed from: p */
    public static String m145144p(Suggestion suggestion) {
        if (m73092L(suggestion) != null) {
            return m73092L(suggestion);
        }
        try {
            return Intent.parseUri(m73094N(suggestion), 0).getDataString();
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static String m145145q(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        if ((sVar.f109055a & 8) != 0) {
            return C41670aj.m73076i(suggestion);
        }
        return null;
    }

    /* renamed from: r */
    public static String m145146r(Suggestion suggestion) {
        return suggestion.f108911l.getString("text2Url");
    }

    /* renamed from: s */
    public static String m145147s(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return null;
        }
        C54228aq aqVar = suggestion.f108906A;
        aqVar.getClass();
        C54250n nVar = aqVar.f142337i;
        if (nVar == null) {
            nVar = C54250n.f142445d;
        }
        if ((nVar.f142447a & 1) == 0) {
            return null;
        }
        C54250n nVar2 = aqVar.f142337i;
        if (nVar2 == null) {
            nVar2 = C54250n.f142445d;
        }
        return nVar2.f142448b;
    }

    /* renamed from: t */
    public static String m145148t(String str) {
        return C41643a.f108856c.matcher(str).replaceAll(BuildConfig.FLAVOR);
    }

    /* renamed from: u */
    public static String m145149u(int i) {
        C64369b a = C64369b.m96390a(i);
        if (a != null) {
            return a.name();
        }
        return String.format(Locale.US, "UNRECOGNIZED_SUBTYPE(%s)", new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: v */
    public static String m145150v(int i) {
        int a = C64371d.m96393a(i);
        if (a == 0) {
            return String.format(Locale.US, "UNRECOGNIZED_TYPE(%s)", new Object[]{Integer.valueOf(i)});
        }
        switch (a) {
            case 1:
                return "QUERY";
            case 2:
                return "URL";
            case 3:
                return "REFINEMENT";
            case 4:
                return "BOOKMARK";
            case 6:
                return "NAVIGATION";
            case 7:
                return "CALCULATOR";
            case 9:
                return "DEPRECATED_ADS";
            case 10:
                return "DEPRECATED_NEWS";
            case 11:
                return "DEPRECATED_WEATHER";
            case 12:
                return "DEPRECATED_FINANCE";
            case 13:
                return "DEPRECATED_FLIGHT";
            case 14:
                return "DEPRECATED_PACKAGE";
            case 15:
                return "DEPRECATED_AREACODE";
            case 16:
                return "DEPRECATED_LOCALTIME";
            case 17:
                return "DEPRECATED_DEFINITIONS";
            case 18:
                return "DEPRECATED_ANSWERS";
            case 19:
                return "DEPRECATED_SHOWTIMES";
            case 20:
                return "CALCULATOR_OB";
            case 21:
                return "DEPRECATED_CURRENCY";
            case 22:
                return "DEPRECATED_Z_ACTION";
            case 23:
                return "DEPRECATED_STRONG_Z_ACTION";
            case 24:
                return "LOCAL_LISTING";
            case 25:
                return "RED_PIN";
            case 26:
                return "SEARCH_HISTORY";
            case 27:
                return "MATS_CAT";
            case 28:
                return "GCAT";
            case 29:
                return "FREEMUSIC";
            case 30:
                return "DEPRECATED_TRANSLATIONARY";
            case 31:
                return "LIVE_SPELLING_DID_YOU_MEAN";
            case 32:
                return "YOUTUBE_ONEBOX";
            case 33:
                return "CONTACT";
            case 34:
                return "TAIL";
            case 35:
                return "DEPRECATED_CSE_PROMOTION";
            case 36:
                return "PERSONALIZED_QUERY";
            case 37:
                return "SKYJAM_STORE";
            case 38:
                return "DEPRECATED_PRODUCT_REFINEMENTS";
            case 39:
                return "MAPS";
            case 40:
                return "DEPRECATED_QUERYNATION";
            case 41:
                return "SPEECH_RECOGNITION";
            case 42:
                return "DEVICE_HISTORY";
            case 43:
                return "UNIVERSAL";
            case 44:
                return "ECHOED";
            case 45:
                return "PROFILE";
            case 46:
                return "PLUS_PAGE";
            case 47:
                return "ENTITY";
            case 48:
                return "LOCAL_MALL_QUERY";
            case 49:
                return "LOCAL_MALL_MERCHANT";
            case 50:
                return "LOCAL_MALL_CATEGORY";
            case 51:
                return "WORD_BY_WORD";
            case 52:
                return "YOUTUBE_CHANNELS";
            case 53:
                return "ENTITY_NAME";
            case 54:
                return "DEPRECATED_HASHTAG";
            case 55:
                return "ENTITY_GRAPH";
            case 56:
                return "FLIGHTS_DESTINATION";
            case 57:
                return "DEPRECATED_SQUARE";
            case 58:
                return "DEPRECATED_OMNIBOX_ECHO_SEARCH";
            case 59:
                return "DEPRECATED_OMNIBOX_ECHO_URL";
            case 60:
                return "DEPRECATED_OMNIBOX_HISTORY_SEARCH";
            case 61:
                return "DEPRECATED_OMNIBOX_HISTORY_URL";
            case 62:
                return "DEPRECATED_OMNIBOX_HISTORY_TITLE";
            case 63:
                return "DEPRECATED_OMNIBOX_HISTORY_BODY";
            case 64:
                return "DEPRECATED_OMNIBOX_HISTORY_KEYWORD";
            case 65:
                return "DEPRECATED_OMNIBOX_OTHER";
            case 66:
                return "DEPRECATED_OMNIBOX_BOOKMARK_TITLE";
            case 67:
                return "HOTELS_DESTINATION";
            case 68:
                return "DEPRECATED_SITE_SEARCH";
            case 69:
                return "MOONSHINE";
            case 70:
                return "NATIVE_CHROME";
            case 71:
                return "DEPRECATED_SEARCH_AS_YOU_TYPE";
            case 72:
                return "ANSWER";
            case 73:
                return "DEPRECATED_SHOPPING_JACKPOT";
            case 74:
                return "DEPRECATED_SHOPPING_AMBIGUOUS";
            case 75:
                return "NEARBY_PLACE";
            case 76:
                return "AWX_LOCAL_CATEGORY";
            case 77:
                return "AWX_ONLINE_PRODUCT_SERVICE";
            case 78:
                return "DEVICE_OFFLINE";
            case 79:
                return "DEVICE_UNDO_REWRITE";
            case 80:
                return "HELP_ACTION";
            case 81:
                return "VOICE_DISCOVERABILITY";
            case 82:
                return "FINANCE";
            case 83:
                return "SEARCH_ON_SITE";
            case 84:
                return "PERSONALIZED_NAVIGATION";
            case 85:
                return "ON_DEVICE_APP";
            case 86:
                return "ON_DEVICE_CONTACT";
            case 87:
                return "ON_DEVICE_URL";
            case 88:
                return "DEPRECATED_ON_DEVICE_OTHER";
            case 89:
                return "SITE_RESTRICTED_SEARCH";
            case 90:
                return "ON_DEVICE_APP_RESULT";
            case 91:
                return "DEPRECATED_OLEO_IMMERSIVE";
            case 92:
                return "PERSONAL_PHOTO_PERSON";
            case 93:
                return "PERSONAL_PHOTO_PLACE";
            case 94:
                return "PERSONAL_PHOTO_THING";
            case 95:
                return "PERSONAL_PHOTO_ALBUM";
            case 96:
                return "PERSONAL_PHOTO_OTHER";
            case 97:
                return "PERSONAL_PHOTO_CAMERA";
            case 98:
                return "ON_DEVICE_URL_CHROME";
            case 99:
                return "DEPRECATED_ON_DEVICE_NOW_PROMO";
            case 100:
                return "SEARCH_ON_DEVICE_PROMO";
            case 101:
                return "CLOUD_GESTURE_DECODING_DYM";
            case 102:
                return "ELECTIONS";
            case 103:
                return "YT_INSIGHTS_ARTIST";
            case 104:
                return "YT_INSIGHTS_CITY";
            case 105:
                return "YT_INSIGHTS_SUBCOUNTRY";
            case 106:
                return "YT_INSIGHTS_COUNTRY";
            case 108:
                return "DEPRECATED_GPLUS_COLLEXION";
            case 109:
                return "GARAGE_JOB";
            case 110:
                return "GARAGE_COMPANY";
            case 111:
                return "PERSONAL_APP";
            case 112:
                return "PERSONAL_APP_RESULT";
            case 113:
                return "VOICE_PROMO";
            case 114:
                return "WAHLBERG_PROMO";
            case 115:
                return "APP_RESULT";
            case 116:
                return "MAPS_PROMPT";
            case 117:
                return "DEPRECATED_BROWSABLE_CATEGORY";
            case 118:
                return "CATEGORICAL_PROMO";
            case 119:
                return "PLAYSTORE_APPS";
            case 120:
                return "PLAYSTORE_ENTERTAINMENT";
            case 121:
                return "DEPRECATED_BROWSABLE_CATEGORY_STRIP";
            case 122:
                return "DEPRECATED_ON_DEVICE_IPA_RESULT";
            case 123:
                return "LOCAL_MALL_PRODUCT";
            case 124:
                return "DOODLE_PROMO";
            case 125:
                return "DEPRECATED_ON_DEVICE_IPA_MESSAGE_RESULT";
            case 126:
                return "IPA_STANDARD_RESULT";
            case 127:
                return "DEPRECATED_IPA_CONTACT_RESULT";
            case 128:
                return "IPA_APPLY_FILTER";
            case 129:
                return "DEPRECATED_IPA_CLEAR_FILTER";
            case 130:
                return "GAM_QUERY";
            case 131:
                return "GAM_APP";
            case 132:
                return "DEPRECATED_IPA_SHOW_MORE_FOOTER";
            case 133:
                return "PLAYSTORE_NAVIGATIONAL";
            case 134:
                return "PLAYSTORE_QUERY";
            case 135:
                return "PLAYSTORE_DORA";
            case 136:
                return "PLAYSTORE_CROSS_SEARCHBOX";
            case 137:
                return "INSTANT_APP";
            case 138:
                return "IMAGE";
            case 139:
                return "VIEW_ALL_HISTORY";
            case 140:
                return "ACCESS_NOW_PROMO";
            case 141:
                return "CLIPBOARD";
            case 142:
                return "NEARBY_CATEGORY";
            case 143:
                return "LOCAL_PLACE";
            case 144:
                return "PERSONAL_PHOTO_MEDIA_TYPE";
            case 145:
                return "PERSONAL_PHOTO_DATE";
            case 146:
                return "RECENTS";
            case 147:
                return "DEPRECATED_IPA_APPLY_CATEGORY_FILTER";
            case 148:
                return "DEPRECATED_IPA_CLEAR_CATEGORY_FILTER";
            case 149:
                return "COUNTERFACTUAL_DUMMY";
            case 150:
                return "EXPLORE";
            case 151:
                return "YT_ARTIST_CHART";
            case 152:
                return "YT_ARTIST_RESOURCES";
            case 153:
                return "PERSONAL_IMMERSIVE";
            case 154:
                return "LOCAL_PHOTOS_PLACES";
            case 155:
                return "DEPRECATED_MULTILINGUAL_PROMO";
            case 156:
                return "UNPLUGGED_CHIP";
            case 157:
                return "SLICE";
            case 158:
                return "TALL_TOP_SLOT_SINGLE_PROMO";
            case 159:
                return "PLAY_INSTALL_ANSWER";
            case 160:
                return "DEPRECATED_NEW_USER_PREDEFINED";
            case 161:
                return "TOPIC_PREDEFINED";
            case 162:
                return "IPA_CHIP";
            case 163:
                return "IPA_NO_RESULT_PROMO";
            case 164:
                return "ACTION";
            case 165:
                return "FOLLOW_WORLD_CUP_PROMO";
            case 166:
                return "AWX_MERLOT_CATEGORY";
            case 167:
                return "PERSONAL_PHOTO_APP_PAGE";
            case 168:
                return "FOLLOW_LURE";
            case 169:
                return "DEPRECATED_OPA_ACTION";
            case 170:
                return "OPA_CORRECTION";
            case 171:
                return "INSPIRE";
            case 172:
                return "CHROME_QUERY_TILES";
            case 173:
                return "CHANNEL";
            case 174:
                return "ON_DEVICE_APP_SHORTCUT";
            case 175:
                return "SHOPPING_PRODUCT";
            case 176:
                return "DEPRECATED_ON_DEVICE_ANDROID_SHORTCUT";
            case 177:
                return "GEMINI_LIGHT";
            case 178:
                return "MAX_VALUE";
            case 179:
                return "SHOPPING_PAGES";
            case 180:
                return "IN_CONTEXT_CONTROL";
            case 181:
                return "TABS";
            case 182:
                return "SCREENSHOTS";
            case 183:
                return "RICH_NEWS";
            case 184:
                return "LENS_PROMO";
            case 185:
                return "ONE_SEARCH_ON_DEVICE";
            case 186:
                return "CATEGORICAL_QUERY";
            default:
                return "null";
        }
    }

    /* renamed from: w */
    public static String m145151w(int i) {
        char c;
        if (i == 3) {
            c = 3;
        } else if (i == 4) {
            c = 4;
        } else if (i == 5) {
            c = 5;
        } else if (i == 7) {
            c = 7;
        } else if (i == 8) {
            c = 8;
        } else if (i == 9) {
            c = 9;
        } else if (i == 40) {
            c = '(';
        } else if (i == 41) {
            c = ')';
        } else if (i == 100) {
            c = 'd';
        } else if (i != 101) {
            switch (i) {
                case -1:
                    c = 65535;
                    break;
                case 80:
                    c = 'P';
                    break;
                case 1000:
                    c = 1000;
                    break;
                case 40000:
                    c = 40000;
                    break;
                case 40001:
                    c = 40001;
                    break;
                case 40002:
                    c = 40002;
                    break;
                case 40003:
                    c = 40003;
                    break;
                case 40004:
                    c = 40004;
                    break;
                case 40005:
                    c = 40005;
                    break;
                case 40006:
                    c = 40006;
                    break;
                case 44900:
                    c = 44900;
                    break;
                case 44950:
                    c = 44950;
                    break;
                case 45000:
                    c = 45000;
                    break;
                case 60000:
                    c = 60000;
                    break;
                case 60002:
                    c = 60002;
                    break;
                case 70000:
                    c = 4464;
                    break;
                case 80010:
                    c = 14474;
                    break;
                case 80020:
                    c = 14484;
                    break;
                case 85001:
                    c = 19465;
                    break;
                case 90000:
                    c = 24464;
                    break;
                case 90001:
                    c = 24465;
                    break;
                case 90002:
                    c = 24466;
                    break;
                case 90003:
                    c = 24467;
                    break;
                case 90004:
                    c = 24468;
                    break;
                case 90005:
                    c = 24469;
                    break;
                case 90006:
                    c = 24470;
                    break;
                case 90007:
                    c = 24471;
                    break;
                case 90008:
                    c = 24472;
                    break;
                case 90009:
                    c = 24473;
                    break;
                case 99999:
                    c = 34463;
                    break;
                default:
                    switch (i) {
                        case 40009:
                            c = 40009;
                            break;
                        case 40010:
                            c = 40010;
                            break;
                        case 40011:
                            c = 40011;
                            break;
                        default:
                            switch (i) {
                                case 40013:
                                    c = 40013;
                                    break;
                                case 40014:
                                    c = 40014;
                                    break;
                                case 40015:
                                    c = 40015;
                                    break;
                                case 40016:
                                    c = 40016;
                                    break;
                                case 40017:
                                    c = 40017;
                                    break;
                                case 40018:
                                    c = 40018;
                                    break;
                                default:
                                    switch (i) {
                                        case 40020:
                                            c = 40020;
                                            break;
                                        case 40021:
                                            c = 40021;
                                            break;
                                        case 40022:
                                            c = 40022;
                                            break;
                                        case 40023:
                                            c = 40023;
                                            break;
                                        case 40024:
                                            c = 40024;
                                            break;
                                        case 40025:
                                            c = 40025;
                                            break;
                                        case 40026:
                                            c = 40026;
                                            break;
                                        default:
                                            switch (i) {
                                                case 45050:
                                                    c = 45050;
                                                    break;
                                                case 45051:
                                                    c = 45051;
                                                    break;
                                                case 45052:
                                                    c = 45052;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 49999:
                                                            c = 49999;
                                                            break;
                                                        case 50000:
                                                            c = 50000;
                                                            break;
                                                        default:
                                                            c = 0;
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            c = 'e';
        }
        if (c == 0) {
            return String.format(Locale.US, "UNRECOGNIZED_GROUP(%s)", new Object[]{Integer.valueOf(i)});
        } else if (c == 3) {
            return "TOP_QUERY_BUILDER";
        } else {
            if (c == 4) {
                return "TALL_TOP_SLOT_SINGLE_PROMO";
            }
            if (c == 5) {
                return "PRIMARY";
            }
            if (c == 7) {
                return "QUERY_BUILDER";
            }
            if (c == 8) {
                return "TRENDING";
            }
            if (c == 9) {
                return "PIPS";
            }
            if (c == '(') {
                return "APP_STRIP";
            }
            if (c == ')') {
                return "APP_SHORTCUT";
            }
            if (c == 'd') {
                return "DISCOVERABILITY";
            }
            if (c == 'e') {
                return "RICH_ANSWERS";
            }
            switch (c) {
                case 65535:
                    return "INVALID";
                case 'P':
                    return "SECONDARY";
                case 1000:
                    return "SERVIVES_IMMERSIVE_NAVIGATIONAL_SUGGESTION_GROUP";
                case 40000:
                    return "PERSONALIZED_HISTORY_GROUP";
                case 40001:
                    return "ONBOARDING_GROUP";
                case 40002:
                    return "TRENDS_GROUP";
                case 40003:
                    return "THUMBNAIL_GROUP";
                case 40004:
                    return "PLACES_GROUP";
                case 40005:
                    return "YT_EXTRA_PSUGGEST_GROUP";
                case 40006:
                    return "VASCO_GROUP";
                case 44900:
                    return "CHANNELS_PERSONALIZED_GROUP";
                case 44950:
                    return "CHANNELS_PUBLIC_GROUP";
                case 45000:
                    return "CHANNELS_QUERY_GROUP";
                case 60000:
                    return "NOW_PROMO_GROUP";
                case 60002:
                    return "FOLLOW_LURE_GROUP";
                case 4464:
                    return "ICON_GRID_GROUP";
                case 14474:
                    return "GEMINI_APP_STRIP";
                case 14484:
                    return "GEMINI_LIGHT";
                case 19465:
                    return "IGA_PROACTIVE_ZPS_GROUP";
                case 24464:
                    return "POLARIS_GROUP1";
                case 24465:
                    return "POLARIS_GROUP2";
                case 24466:
                    return "POLARIS_GROUP3";
                case 24467:
                    return "POLARIS_GROUP4";
                case 24468:
                    return "POLARIS_GROUP5";
                case 24469:
                    return "POLARIS_GROUP6";
                case 24470:
                    return "POLARIS_GROUP7";
                case 24471:
                    return "POLARIS_GROUP8";
                case 24472:
                    return "POLARIS_GROUP9";
                case 24473:
                    return "POLARIS_GROUP10";
                case 34463:
                    return "POLARIS_GROUP10000";
                default:
                    switch (c) {
                        case 40009:
                            return "PROACTIVE_ZPS_GROUP";
                        case 40010:
                            return "TOPIC_FEED_GROUP";
                        case 40011:
                            return "REFINMENTS_GROUP";
                        default:
                            switch (c) {
                                case 40013:
                                    return "ON_CONTENT_FOCUS_GROUP";
                                case 40014:
                                    return "YT_RECOMMENDED_SEARCHES_GROUP";
                                case 40015:
                                    return "ENTITY_CHIP_SUGGESTION_GROUP";
                                case 40016:
                                    return "SHOPPING_RECENT_VIEWED_PRODUCT_GROUP";
                                case 40017:
                                    return "ENTITY_DISAMBIGUATION_SUGGESTION_GROUP";
                                case 40018:
                                    return "OPA_ACTION_SUGGESTION_GROUP";
                                default:
                                    switch (c) {
                                        case 40020:
                                            return "SHOPPING_PAGES_GROUP";
                                        case 40021:
                                            return "IN_CONTEXT_CONTROL_GROUP";
                                        case 40022:
                                            return "PEOPLE_ALSO_ASK_GROUP";
                                        case 40023:
                                            return "CHROME_SRP_ON_FOCUS_GROUP";
                                        case 40024:
                                            return "ENTITY_PREVIEW_GROUP";
                                        case 40025:
                                            return "SIGN_IN_IN_CONTEXT_CONTROL_GROUP";
                                        case 40026:
                                            return "DEVICE_HISTORY_GROUP";
                                        default:
                                            switch (c) {
                                                case 45050:
                                                    return "CHANNELS_PERSONALIZED_V2_GROUP";
                                                case 45051:
                                                    return "REPEATED_HISTORY_1_GROUP";
                                                case 45052:
                                                    return "REPEATED_HISTORY_2_GROUP";
                                                default:
                                                    switch (c) {
                                                        case 49999:
                                                            return "IGA_PROACTIVE_ZPS_ABOVE_PSUGGEST_GROUP";
                                                        case 50000:
                                                            return "IMAGE_GROUP";
                                                        default:
                                                            return "null";
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
    }

    /* renamed from: x */
    public static String m145152x(int i) {
        int a = aou.m92448a(i);
        if (a == 0) {
            return String.format(Locale.US, "UNRECOGNIZED_SOURCE(%s)", new Object[]{Integer.valueOf(i)});
        }
        switch (a) {
            case 1:
                return "NONE";
            case 2:
                return "COMPLETE_SERVER";
            case 3:
                return "CONTENT_PROVIDERS";
            case 4:
                return "ICING";
            case 5:
                return "SSB_CONTEXT";
            case 6:
                return "NOW_PROMO";
            case 7:
                return "DEVICE_UNDO_REWRITE";
            case 8:
                return "DISCOVERABILITY";
            case 9:
                return "NEXT_APP_PREDICTION";
            case 10:
                return "WAHLBERG_PROMO";
            case 11:
                return "IPA";
            case 12:
                return "IPA_SUGGEST";
            case 13:
                return "BUFFERING";
            case 14:
                return "BRAIN";
            case 15:
                return "WEB_SERVICE_WORKER";
            case 16:
                return "CLIPBOARD";
            case 17:
                return "RECENTS";
            case 18:
                return "EXPLORE";
            case 19:
                return "YOUTUBE_REFINEMENT";
            case 20:
                return "PIXEL_LAUNCHER";
            case 21:
                return "IGSA_OFFLINE_PERSONALIZED_SUGGESTION_CACHE";
            case 22:
                return "IGSA_SUGGEST_2G";
            case 23:
                return "SUGGEST_2G_LITE";
            case 24:
                return "ON_DEVICE_HISTORY";
            case 25:
                return "FOLLOW_WORLD_CUP_PROMO";
            case 26:
                return "GELLER";
            case 27:
                return "MOSAIC_ON_DEVICE_SUGGEST";
            case 28:
                return "APP_ACTIONS";
            case 29:
                return "ASSISTANT_SUGGEST";
            case 30:
                return "ONE_SEARCH_ON_DEVICE";
            default:
                return "TABS";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r1.f142297h.size() != 0) goto L_0x0028;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map m145153y(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r4) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = r4.mo44265s()
            r2 = 0
            if (r1 == 0) goto L_0x001d
            com.google.at.h.d.a.aq r1 = r4.f108906A
            com.google.at.h.d.a.ae r1 = r1.f142334f
            if (r1 != 0) goto L_0x0014
            com.google.at.h.d.a.ae r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0014:
            com.google.protobuf.dn r1 = r1.f142297h
            int r1 = r1.size()
            if (r1 == 0) goto L_0x001d
            goto L_0x0028
        L_0x001d:
            com.google.common.b.hd r1 = r4.f108923x
            if (r1 == 0) goto L_0x0064
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0028
            goto L_0x0064
        L_0x0028:
            boolean r1 = r4.mo44265s()
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = r4.f108919t
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x004f
            com.google.at.h.d.a.aq r1 = r4.f108906A
            if (r1 == 0) goto L_0x004f
            int r3 = r1.f142330a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x004f
            com.google.at.h.d.a.ae r1 = r1.f142334f
            if (r1 != 0) goto L_0x0046
            com.google.at.h.d.a.ae r1 = com.google.p4017at.p4060h.p4073d.p4074a.C54216ae.f142285C
        L_0x0046:
            com.google.protobuf.dn r1 = r1.f142297h
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.putAll(r1)
        L_0x004f:
            com.google.common.b.hd r4 = r4.f108923x
            if (r4 == 0) goto L_0x005c
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x005c
            r0.putAll(r4)
        L_0x005c:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0063
            return r2
        L_0x0063:
            return r0
        L_0x0064:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p6990an.C89235z.m145153y(com.google.android.libraries.searchbox.shared.suggestion.Suggestion):java.util.Map");
    }

    /* renamed from: z */
    public static boolean m145154z(C41679e eVar) {
        C41693s sVar = eVar.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        if ((sVar.f109055a & 1) == 0) {
            return false;
        }
        C41693s sVar2 = eVar.f109009c;
        if (sVar2 == null) {
            sVar2 = C41693s.f109053h;
        }
        return (sVar2.f109055a & 8) != 0;
    }
}
