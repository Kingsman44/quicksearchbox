package com.google.android.libraries.social.populous;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.social.populous.core.AutoValue_ClientVersion;
import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.core.C42294bt;
import com.google.android.libraries.social.populous.core.C42328d;
import com.google.android.libraries.social.populous.core.C42351l;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientId;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.core.Experiments;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3286a.C42146a;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58729pv;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69296d;

/* renamed from: com.google.android.libraries.social.populous.x */
/* compiled from: PG */
public final class C42710x implements C42707u {

    /* renamed from: a */
    public ExecutorService f111935a;

    /* renamed from: b */
    public boolean f111936b;

    /* renamed from: c */
    public C42211b f111937c;

    /* renamed from: d */
    private C42352m f111938d;

    /* renamed from: e */
    private Context f111939e;

    /* renamed from: f */
    private ClientConfigInternal f111940f;

    /* renamed from: g */
    private ClientVersion f111941g;

    /* renamed from: h */
    private final List f111942h = new ArrayList();

    /* renamed from: i */
    private Locale f111943i;

    /* renamed from: j */
    private C58889cz f111944j;

    /* renamed from: k */
    private final C42708v f111945k;

    /* renamed from: l */
    private final C58827ar f111946l;

    public C42710x(Context context, C42708v vVar) {
        context.getClass();
        this.f111939e = context.getApplicationContext();
        this.f111945k = vVar;
        this.f111946l = new C58827ar(";");
        C31654aj.m58985d(this.f111939e);
    }

    /* renamed from: d */
    public static C42598s m75437d(C42707u uVar) {
        String str;
        String str2;
        C42710x xVar = (C42710x) uVar;
        Context context = xVar.f111939e;
        if (xVar.f111941g == null) {
            ClientConfigInternal clientConfigInternal = xVar.f111940f;
            clientConfigInternal.getClass();
            switch (clientConfigInternal.f110713O) {
                case 2:
                    str = "CLIENT_UNSPECIFIED";
                    break;
                case 3:
                    str = "GPLUS_APP";
                    break;
                case 4:
                    str = "HANGOUTS";
                    break;
                case 5:
                    str = "DOMAIN_ADDRESSBOOK";
                    break;
                case 6:
                    str = "G_PLUS_PEOPLE_AND_PLUS_PAGE_SEARCH";
                    break;
                case 7:
                    str = "DEPRECATED_G_PLUS_COLLEXION_SEARCH";
                    break;
                case 8:
                    str = "G_PLUS_MIXED_SUGGEST";
                    break;
                case 9:
                    str = "DEPRECATED_FORMS";
                    break;
                case 10:
                    str = "MAP_SAVE_TO_CONTACTS";
                    break;
                case 11:
                    str = "DEPRECATED_HANGOUTS_CONTACTS";
                    break;
                case 12:
                    str = "DOMAIN_SEARCH";
                    break;
                case 13:
                    str = "DRIVE_WEB_ADVANCED";
                    break;
                case 14:
                    str = "DOMAIN_WITH_PERSONAL";
                    break;
                case 15:
                    str = "GMAIL_ANDROID";
                    break;
                case 16:
                    str = "HANGOUTS_PHONE_CONTACTS";
                    break;
                case 17:
                    str = "DYNAMITE";
                    break;
                case 18:
                    str = "CAST_RECEIVER";
                    break;
                case 19:
                    str = "DEPRECATED_HANGOUTS_PAGES";
                    break;
                case 20:
                    str = "DEPRECATED_G_PLUS_APP";
                    break;
                case 21:
                    str = "DEPRECATED_G_PLUS_APP_DOMAIN";
                    break;
                case 22:
                    str = "DEPRECATED_G_PLUS_SHAREBOX";
                    break;
                case 23:
                    str = "DEPRECATED_G_PLUS_SHAREBOX_DOMAIN";
                    break;
                case 24:
                    str = "DEPRECATED_G_PLUS_APP_PHOTOS";
                    break;
                case 25:
                    str = "DEPRECATED_IRONMAN";
                    break;
                case 26:
                    str = "ONHUB";
                    break;
                case 27:
                    str = "DEPRECATED_CONTACTS_PLUS";
                    break;
                case 28:
                    str = "DEPRECATED_CONTACTS_PLUS_SEARCH";
                    break;
                case 29:
                    str = "KEEP";
                    break;
                case 30:
                    str = "DEPRECATED_SPACES";
                    break;
                case 31:
                    str = "DEPRECATED_YOUTUBE_CHAT";
                    break;
                case 32:
                    str = "KIDS";
                    break;
                case 33:
                    str = "HANGOUTS_WITH_DATA";
                    break;
                case 34:
                    str = "DEPRECATED_CREST";
                    break;
                case 35:
                    str = "DEPRECATED_HANGOUTS_NO_RANK";
                    break;
                case 36:
                    str = "DRIVE_SHARE";
                    break;
                case 37:
                    str = "GPLUS_MENTION";
                    break;
                case 38:
                    str = "KINTARO";
                    break;
                case 39:
                    str = "CONTACTS_PLUS_AUTOCOMPLETE";
                    break;
                case 40:
                    str = "VOICE";
                    break;
                case 41:
                    str = "EXPO";
                    break;
                case 42:
                    str = "APPS_INTELLIGENCE_CHAT_BOT";
                    break;
                case 43:
                    str = "SYMPHONY";
                    break;
                case 44:
                    str = "QUICKSTART";
                    break;
                case 45:
                    str = "ADELPHI";
                    break;
                case 46:
                    str = "PHOTOS";
                    break;
                case 47:
                    str = "ARIANE";
                    break;
                case 48:
                    str = "CLASSROOM";
                    break;
                case 49:
                    str = "AUTOMAZERS";
                    break;
                case 50:
                    str = "BLACKBOX";
                    break;
                case 51:
                    str = "GPLUS_EXTERNAL";
                    break;
                case 52:
                    str = "LEGAL_COMMON_KNOWLEDGE";
                    break;
                case 53:
                    str = "SUPPORT_PLUS";
                    break;
                case 54:
                    str = "PROJECT_FI";
                    break;
                case 55:
                    str = "CONTACT_PLUS_PREFIX_SEARCH_ALL_FIELDS";
                    break;
                case 56:
                    str = "CURA";
                    break;
                case 57:
                    str = "XANADU";
                    break;
                case 58:
                    str = "DEPRECATED_UNICORN";
                    break;
                case 59:
                    str = "RMC";
                    break;
                case 60:
                    str = "PROVA";
                    break;
                case 61:
                    str = "HIRING";
                    break;
                case 62:
                    str = "EVENTS";
                    break;
                case 63:
                    str = "DOTS";
                    break;
                case 64:
                    str = "TSTB";
                    break;
                case 65:
                    str = "PIVT";
                    break;
                case 66:
                    str = "CASES";
                    break;
                case 67:
                    str = "DOMAIN_PERSON_ONLY";
                    break;
                case 68:
                    str = "DOMAIN_PERSON_ONLY_USERID";
                    break;
                case 69:
                    str = "MINIMAL_DOMAIN";
                    break;
                case 70:
                    str = "MINIMAL_DOMAIN_ONLY";
                    break;
                case 71:
                    str = "WALLET";
                    break;
                case 72:
                    str = "MOBILE_SYNC";
                    break;
                case 73:
                    str = "DEPRECATED_CONTACTS_PLUS_LEGACY";
                    break;
                case 74:
                    str = "DEPRECATED_CONTACTS_PLUS_SEARCH_LEGACY";
                    break;
                case 75:
                    str = "DEPRECATED_CONTACTS_PLUS_AUTOCOMPLETE_LEGACY";
                    break;
                case 76:
                    str = "DEPRECATED_YENTA_INBOX";
                    break;
                case 77:
                    str = "EMERGENCY_ASSIST";
                    break;
                case 78:
                    str = "CONTACT_PLUS_PREFIX_SEARCH_ALL_FIELDS_WITH_DOMAIN";
                    break;
                case 79:
                    str = "DOMAIN_PERSON_ONLY_ALL";
                    break;
                case 80:
                    str = "POPULOUS_INBOX";
                    break;
                case 81:
                    str = "TOPAZ";
                    break;
                case 82:
                    str = "FAMILIES";
                    break;
                case 83:
                    str = "BONFIRE";
                    break;
                case 84:
                    str = "DYNAMITE_GROUPS";
                    break;
                case 85:
                    str = "BAXTER";
                    break;
                case 86:
                    str = "PEOPLE_PLAYGROUND";
                    break;
                case 87:
                    str = "SENDKIT";
                    break;
                case 88:
                    str = "SENDKIT_WITH_CIRCLE_MEMBERS";
                    break;
                case 89:
                    str = "EMAIL_CENTRIC";
                    break;
                case 90:
                    str = "PHOTOS_EASY_SHARING";
                    break;
                case 91:
                    str = "MINIMAL_DOMAIN_GROUP";
                    break;
                case 92:
                    str = "GMAIL_SMIME";
                    break;
                case 93:
                    str = "DEPRECATED_DYNAMITE_ROOM";
                    break;
                case 94:
                    str = "DEPRECATED_DYNAMITE_DM";
                    break;
                case 95:
                    str = "DEPRECATED_MAPS_JOURNEY_SHARING_AFFINITY";
                    break;
                case 96:
                    str = "GMAIL_LOOKUP_BY_EMAIL";
                    break;
                case 97:
                    str = "ARIANE_BY_EMAIL";
                    break;
                case 98:
                    str = "MINIMAL_DOMAIN_GLOBAL";
                    break;
                case 99:
                    str = "G_PLUS_PEOPLE_GROUP";
                    break;
                case 100:
                    str = "CONTENT_SHARING_DEFAULT";
                    break;
                case 101:
                    str = "DEPRECATED_CONTACTS_AND_DEVICE_CONTACTS";
                    break;
                case 102:
                    str = "G_PLUS_PEOPLE_AND_PLUS_PAGE_SEARCH_FOR_NUMBAT";
                    break;
                case 103:
                    str = "GMAIL_LOOKUP_BY_EMAIL_SMIME";
                    break;
                case 104:
                    str = "GPLUS_MENTION_FOR_NUMBAT";
                    break;
                case 105:
                    str = "DEPRECATED_CONTACTS_AND_DEVICE_CONTACTS_WITH_IANTS";
                    break;
                case 106:
                    str = "CLOUDCAST";
                    break;
                case 107:
                    str = "ACTIONS_ON_GOOGLE_MATCH_ADDRESS";
                    break;
                case 108:
                    str = "ACTIONS_ON_GOOGLE_MATCH_EMAIL";
                    break;
                case 109:
                    str = "ACTIONS_ON_GOOGLE_MATCH_NAME";
                    break;
                case 110:
                    str = "ACTIONS_ON_GOOGLE_MATCH_PHONE";
                    break;
                case 111:
                    str = "EMAIL_CENTRIC_WITH_BLOCKS";
                    break;
                case 112:
                    str = "MINIMAL_PERSON_ONLY";
                    break;
                case 113:
                    str = "GMAIL_WEB_DOMAIN";
                    break;
                case 114:
                    str = "HANGOUTS_WITH_DATA_AND_PHONE_CONTACTS";
                    break;
                case 115:
                    str = "DYNAMITE_OUT_OF_DOMAIN";
                    break;
                case 116:
                    str = "DYNAMITE_OUT_OF_DOMAIN_GROUPS";
                    break;
                case 117:
                    str = "DRIVE_APPROVALS";
                    break;
                case 118:
                    str = "PAISA";
                    break;
                case 119:
                    str = "DOMAIN_SHARED_CONTACTS_ONLY";
                    break;
                case 120:
                    str = "OTHER_CONTACTS";
                    break;
                case 121:
                    str = "DOMAIN_WITH_PERSONAL_WITH_EMAIL";
                    break;
                case 122:
                    str = "PERSONAL_DOMAIN_CONTACT_GROUPS";
                    break;
                case 123:
                    str = "PHOTOS_IN_APP_ONLY";
                    break;
                case 124:
                    str = "GMAIL_COMPOSE_ANDROID_POPULOUS";
                    break;
                case 125:
                    str = "GMAIL_COMPOSE_ANDROID_HOMOGRAPH";
                    break;
                case 126:
                    str = "PEOPLE_COMPANION_MY_CONTACTS";
                    break;
                case 127:
                    str = "PEOPLE_COMPANION_OTHER_CONTACTS";
                    break;
                case 128:
                    str = "KEEP_WITH_GROUPS";
                    break;
                case 129:
                    str = "APPS_ASSISTED_RW";
                    break;
                case 130:
                    str = "ASSISTANT_YOUR_PEOPLE";
                    break;
                case 131:
                    str = "HUB_CALL";
                    break;
                case 132:
                    str = "CALENDAR_PEEK";
                    break;
                case 133:
                    str = "VR_POLY_PRO";
                    break;
                case 134:
                    str = "TRAVEL";
                    break;
                case 135:
                    str = "INTEGRATION_PLATFORM";
                    break;
                case 136:
                    str = "ASSISTANT_TOOLCHAIN";
                    break;
                case 137:
                    str = "BUGANIZER";
                    break;
                case 138:
                    str = "GANTRY";
                    break;
                case 139:
                    str = "DPANEL_REPORTS";
                    break;
                case 140:
                    str = "MAPS_SHARING";
                    break;
                case 141:
                    str = "NEWS_SHARING";
                    break;
                case 142:
                    str = "CONTACTS_PLUS_TRASHED_CONTACTS";
                    break;
                case 143:
                    str = "INCIDENT_MANAGEMENT";
                    break;
                case 144:
                    str = "PAISA_BLOCKING";
                    break;
                case 145:
                    str = "PODCASTS_MANAGER";
                    break;
                case 146:
                    str = "SPUR";
                    break;
                case 147:
                    str = "ONE_REVIEWER_TOOL";
                    break;
                case 148:
                    str = "ICM_PROGRESSO";
                    break;
                case 149:
                    str = "DOMAIN_SEARCH_ANDROID";
                    break;
                case 150:
                    str = "DATA_BRIDGE_CONSOLE";
                    break;
                case 151:
                    str = "A11Y_TRACKER";
                    break;
                case 152:
                    str = "ATLAS";
                    break;
                case 153:
                    str = "CONSTELLATION";
                    break;
                case 154:
                    str = "CORONADO";
                    break;
                case 155:
                    str = "PUMICE";
                    break;
                case 156:
                    str = "GMAIL_COMPOSE_WEB_POPULOUS";
                    break;
                case 157:
                    str = "BACKLIGHT";
                    break;
                case 158:
                    str = "GLOSSARY_MANAGER";
                    break;
                case 159:
                    str = "ONEDEV_WORKFLOW";
                    break;
                case 160:
                    str = "AVALANCHE";
                    break;
                case 161:
                    str = "DYNAMITE_ROOM";
                    break;
                case 162:
                    str = "DESKBOOKING";
                    break;
                case 163:
                    str = "PAISA_EXTENDED";
                    break;
                case 164:
                    str = "DRIVE_PROFILE_ONLY";
                    break;
                case 165:
                    str = "OFFSEC";
                    break;
                case 166:
                    str = "GOOGLE_HOME_FAMILY";
                    break;
                case 167:
                    str = "ONEMARKET_CALENDAR";
                    break;
                case 168:
                    str = "GPAY_MERCHANT_CONSOLE";
                    break;
                case 169:
                    str = "WORDFLOW";
                    break;
                case 170:
                    str = "YOUTUBE_CREATOR_STUDIO";
                    break;
                case 171:
                    str = "BRICKS";
                    break;
                case 172:
                    str = "LISTNR";
                    break;
                case 173:
                    str = "BUG_OBSERVER";
                    break;
                case 174:
                    str = "ALPHASCHEDULE";
                    break;
                case 175:
                    str = "BURROW";
                    break;
                case 176:
                    str = "PLX_DASHBOARDS";
                    break;
                case 177:
                    str = "TEAMSPACES";
                    break;
                case 178:
                    str = "ASSISTANT_OPA";
                    break;
                case 179:
                    str = "POLYGLOT";
                    break;
                case 180:
                    str = "TRANSLATION_MEMORY_MANAGER";
                    break;
                case 181:
                    str = "THREADIT";
                    break;
                case 182:
                    str = "RESOURCE_SYMPHONY";
                    break;
                case 183:
                    str = "OTHER_CONTACTS_3P";
                    break;
                case 184:
                    str = "CONNECT_SALES";
                    break;
                case 185:
                    str = "HOUSEHOLD_CONTACTS_PICKER";
                    break;
                case 186:
                    str = "AUTOCOMPLETE_3P";
                    break;
                case 187:
                    str = "L10N_INFRA_SHARED";
                    break;
                case 188:
                    str = "OKRS";
                    break;
                case 189:
                    str = "GET_APPROVAL";
                    break;
                case 190:
                    str = "WORK_TRACKER";
                    break;
                case 191:
                    str = "DRIVE_ROOM";
                    break;
                case 192:
                    str = "COLAB_INTERNAL";
                    break;
                case 193:
                    str = "COLAB_EXTERNAL";
                    break;
                case 194:
                    str = "TOMO_TECH";
                    break;
                case 195:
                    str = "DRIVE_ROOM_POPULOUS_MOBILE";
                    break;
                case 196:
                    str = "TALENT_GROW";
                    break;
                case 197:
                    str = "GMS_PEOPLE";
                    break;
                case 198:
                    str = "ROCKET_LABS";
                    break;
                case 199:
                    str = "DYNAMITE_ROOM_AND_INDIVIDUAL_ONLY";
                    break;
                case 200:
                    str = "VOICE_WITH_CONTACT_GROUPS";
                    break;
                case 201:
                    str = "TEZ_PHONE_SEARCH";
                    break;
                case 202:
                    str = "MY_GOOGLE_FAMILIES";
                    break;
                case 203:
                    str = "DATA_STUDIO";
                    break;
                case 204:
                    str = "SHORTCUT_SERVER";
                    break;
                case 205:
                    str = "GOOGLE_GROUPS";
                    break;
                case 206:
                    str = "LEGAL_CONTRACTS";
                    break;
                case 207:
                    str = "MOMA_GROUPS";
                    break;
                case 208:
                    str = "PLX";
                    break;
                case 209:
                    str = "DATA_CATALOG";
                    break;
                case 210:
                    str = "BRIEF_API";
                    break;
                case 211:
                    str = "PERF_EVAL";
                    break;
                case 212:
                    str = "DYNAMITE_ROOM_UNIFIED";
                    break;
                case 213:
                    str = "HARDWARE_MFG_DATA_VENUS";
                    break;
                case 214:
                    str = "BETTERBUG";
                    break;
                case 215:
                    str = "DCMS";
                    break;
                case 216:
                    str = "PLAY_BOOKS_PUBENG";
                    break;
                case 217:
                    str = "YAQS";
                    break;
                case 218:
                    str = "VCC_CORE";
                    break;
                case 219:
                    str = "GROW_LXP";
                    break;
                case 220:
                    str = "SNIPPETS";
                    break;
                case 221:
                    str = "TRAVEL_TRIPS";
                    break;
                case 222:
                    str = "TAX_ISSUES_TRACKER";
                    break;
                case 223:
                    str = "PROSPER";
                    break;
                case 224:
                    str = "COURSE_KIT";
                    break;
                case 225:
                    str = "MOMENTS_ADD_BIRTHDAY";
                    break;
                case 226:
                    str = "FLOURISH";
                    break;
                case 227:
                    str = "CAMPAIGN_MANAGEMENT_TOOL";
                    break;
                case 228:
                    str = "RECORDER";
                    break;
                case 229:
                    str = "SHOPPING_LIST";
                    break;
                case 230:
                    str = "CLASSROOM_SEARCH";
                    break;
                case 231:
                    str = "HIRING_TOOL";
                    break;
                case 232:
                    str = "DATACENTER_SOFTWARE";
                    break;
                case 233:
                    str = "PHOTOS_INVITE";
                    break;
                case 234:
                    str = "MARKETING_WORKFLOWS";
                    break;
                case 235:
                    str = "UNIPORT_FE";
                    break;
                case 236:
                    str = "INTROSPECT";
                    break;
                case 237:
                    str = "YOUTUBE_PARENT_TOOLS";
                    break;
                case 238:
                    str = "ARROWAY";
                    break;
                case 239:
                    str = "KEYBLADE";
                    break;
                case 240:
                    str = "RELIABILITY_INSIGHTS_PST";
                    break;
                case 241:
                    str = "LIVEPLAYER";
                    break;
                case 242:
                    str = "CUSTOMER_CARE_PORTAL";
                    break;
                case 243:
                    str = "DIGITAL_CAR_KEY";
                    break;
                case 244:
                    str = "PLAY_BOOKS_DISTRIBUTION";
                    break;
                case 245:
                    str = "THE_FORGE_EPS";
                    break;
                case 246:
                    str = "MEET";
                    break;
                case 247:
                    str = "TEST_FUSION";
                    break;
                case 248:
                    str = "COMPLIANCE_RISKASSESSMENT";
                    break;
                case 249:
                    str = "PRODUCTION2020_UIE";
                    break;
                case 250:
                    str = "SPEAKEASY";
                    break;
                case 251:
                    str = "LOCKTITE";
                    break;
                case 252:
                    str = "DOCS_TASKS";
                    break;
                default:
                    str = "UNRECOGNIZED";
                    break;
            }
            boolean equals = str.equals("CLIENT_UNSPECIFIED");
            String str3 = str;
            if (equals) {
                str3 = xVar.f111939e.getPackageName();
            }
            try {
                str2 = ((C42710x) uVar).f111939e.getPackageManager().getPackageInfo(((C42710x) uVar).f111939e.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "0";
            }
            C42328d dVar = new C42328d();
            dVar.f111008b = "0";
            if (str3 != null) {
                dVar.f111007a = str3;
                dVar.f111008b = str2;
                dVar.f111009c = xVar.f111939e.getPackageName();
                dVar.f111010d = 1;
                if (dVar.f111007a == null || dVar.f111008b == null) {
                    StringBuilder sb = new StringBuilder();
                    if (dVar.f111007a == null) {
                        sb.append(" clientName");
                    }
                    if (dVar.f111008b == null) {
                        sb.append(" clientVersion");
                    }
                    if (dVar.f111010d == 0) {
                        sb.append(" platform");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                xVar.f111941g = new AutoValue_ClientVersion(dVar.f111007a, dVar.f111008b, dVar.f111009c, dVar.f111010d);
            } else {
                throw new NullPointerException("Null clientName");
            }
        }
        ClientVersion clientVersion = xVar.f111941g;
        C42211b bVar = xVar.f111937c;
        bVar.getClass();
        C42352m mVar = xVar.f111938d;
        mVar.getClass();
        xVar.m75438e();
        Locale locale = xVar.f111943i;
        if (xVar.f111935a == null) {
            xVar.f111935a = xVar.f111945k.mo45809c();
        }
        ExecutorService executorService = xVar.f111935a;
        Experiments experiments = new Experiments(new C42294bt());
        ClientConfigInternal clientConfigInternal2 = xVar.f111940f;
        clientConfigInternal2.getClass();
        if (xVar.f111944j == null) {
            xVar.f111944j = C58274c.f155808a;
        }
        return new C42181t(context, clientVersion, bVar, mVar, locale, executorService, (ScheduledExecutorService) null, experiments, clientConfigInternal2, xVar.f111944j, (C42591z) null, false, xVar.f111942h, (C42146a) null, C58729pv.f156485a);
    }

    /* renamed from: e */
    private final void m75438e() {
        if (this.f111943i == null) {
            this.f111943i = Locale.getDefault();
            TelephonyManager telephonyManager = (TelephonyManager) this.f111939e.getSystemService("phone");
            if (telephonyManager != null && !C58837ba.m90859h(telephonyManager.getSimCountryIso())) {
                this.f111943i = new Locale(this.f111943i.getLanguage(), telephonyManager.getSimCountryIso());
            }
        }
    }

    /* renamed from: a */
    public final C42598s mo45805a() {
        String str;
        C58838bb.m90884s(this.f111937c != null, "Missing required property: dependencyLocator");
        C58838bb.m90884s(this.f111940f != null, "Missing required property: clientConfig");
        C58838bb.m90884s(this.f111938d != null, "Missing required property: account");
        if (!this.f111936b) {
            return m75437d(this);
        }
        if (C69296d.m100510c()) {
            C58827ar arVar = this.f111946l;
            ClientConfigInternal clientConfigInternal = this.f111940f;
            clientConfigInternal.getClass();
            ClientId clientId = clientConfigInternal.f110720f;
            C42352m mVar = this.f111938d;
            mVar.getClass();
            String str2 = mVar.f111089a;
            m75438e();
            str = arVar.mo56097d(new C58825ap(new Object[]{mVar.f111090b, this.f111943i, false, "EMPTY"}, clientId, str2));
        } else {
            C58827ar arVar2 = this.f111946l;
            ClientConfigInternal clientConfigInternal2 = this.f111940f;
            clientConfigInternal2.getClass();
            ClientId clientId2 = clientConfigInternal2.f110720f;
            C42352m mVar2 = this.f111938d;
            mVar2.getClass();
            String str3 = mVar2.f111089a;
            m75438e();
            str = arVar2.mo56097d(new C58825ap(new Object[]{mVar2.f111090b, this.f111943i, false}, clientId2, str3));
        }
        return (C42598s) this.f111945k.mo45808b(str, new C42709w(this)).mo6453a();
    }

    /* renamed from: b */
    public final void mo45806b(C42266as asVar) {
        C58838bb.m90868c(asVar instanceof ClientConfigInternal);
        this.f111940f = (ClientConfigInternal) asVar;
    }

    /* renamed from: c */
    public final void mo45807c(String str, String str2) {
        this.f111938d = new C42352m(str, str2, C42351l.FAILED_NOT_LOGGED_IN, (String) null);
    }
}
