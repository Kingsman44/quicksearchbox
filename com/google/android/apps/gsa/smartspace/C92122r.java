package com.google.android.apps.gsa.smartspace;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.apps.search.assistant.verticals.reminders.p10074a.C132540c;
import com.google.android.apps.search.weather.p10685d.C142073b;
import com.google.android.gms.common.C143701ac;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import java.net.URISyntaxException;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.smartspace.r */
/* compiled from: PG */
public final class C92122r {

    /* renamed from: a */
    public static final C58528ij f256844a = C58528ij.m90015O("com.google.android.apps.gsa.broadcastreceiver.ACTION_SMARTSPACE_PREFERENCE_CHANGED", "com.google.android.apps.gsa.broadcastreceiver.ACTION_SMARTSPACE_RESULT", "com.google.android.apps.gsa.broadcastreceiverACTION_SMARTSPACE_WEATHER_UNIT_CHANGED", "com.google.android.apps.oemsmartspace.DISABLE_UPDATE", "com.google.android.apps.oemsmartspace.ENABLE_UPDATE", "com.google.android.apps.dreamliner.DISABLE_UPDATE", "com.google.android.apps.dreamliner.ENABLE_UPDATE", "com.google.android.apps.gsa.smartspace.CLICK_EVENT", "com.google.android.apps.gsa.smartspace.DISMISS_EVENT", "com.google.android.apps.gsa.smartspace.ENABLE_UPDATE", "com.google.android.apps.gsa.smartspace.EXPIRE_EVENT", "com.google.android.apps.gsa.smartspace.SETTINGS", "com.google.android.systemui.smartspace.CLICK_EVENT", "com.google.android.systemui.smartspace.EXPIRE_EVENT", "com.google.android.apps.gsa.weatherwidget.WEATHER_CLICK", "com.google.android.apps.gsa.weatherwidget.ENABLE_UPDATE");

    /* renamed from: e */
    private static final C59071e f256845e = C59071e.m91332i("com.google.android.apps.gsa.smartspace.r");

    /* renamed from: b */
    public final C86124t f256846b;

    /* renamed from: c */
    public final Context f256847c;

    /* renamed from: d */
    public final C92119o f256848d;

    /* renamed from: f */
    private final C84474e f256849f;

    /* renamed from: g */
    private final SharedPreferences f256850g;

    public C92122r(C86124t tVar, C84474e eVar, SharedPreferences sharedPreferences, Context context, C92120p pVar) {
        this.f256846b = tVar;
        this.f256849f = eVar;
        this.f256850g = sharedPreferences;
        this.f256847c = context;
        this.f256848d = pVar.mo86767a(new C92121q(tVar));
    }

    /* renamed from: a */
    public static Intent m151184a(String str) {
        String languageTag = Locale.getDefault().toLanguageTag();
        Uri parse = Uri.parse(str);
        if (!TextUtils.isEmpty(languageTag)) {
            parse = parse.buildUpon().appendQueryParameter("hl", languageTag).build();
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("full_screen", true);
        intent.putExtra("hide_status_bar", true);
        intent.putExtra("screen_orientation", true);
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.REMINDER_HUB_INTENT_EXTRA", true);
        return intent;
    }

    /* renamed from: c */
    public static Intent m151185c(String str, C50794cr crVar, C50731p pVar, boolean z) {
        Intent intent = new Intent();
        if (str != null) {
            intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT", str);
        }
        m151195q(intent, (String) null, crVar, pVar, z);
        return intent;
    }

    /* renamed from: d */
    public static Intent m151186d(Intent intent, String str, String str2, C50794cr crVar, C50731p pVar, boolean z) {
        Intent intent2 = new Intent();
        if (intent != null) {
            intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT", intent.toUri(1));
        } else if (str != null) {
            intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY", str);
        }
        m151195q(intent2, str2, crVar, pVar, z);
        return intent2;
    }

    /* renamed from: e */
    public static void m151187e(Context context) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.broadcastreceiver.ACTION_SMARTSPACE_PREFERENCE_CHANGED");
        C74445c.m120396c(context, intent);
    }

    /* renamed from: f */
    public static void m151188f(Context context, Integer num, boolean z) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.broadcastreceiver.ACTION_SMARTSPACE_PREFERENCE_CHANGED");
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.PREFERENCE_KEY_CHANGED_EXTRA", num);
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.PREFERENCE_CHANGED_VALUE_EXTRA", z);
        C74445c.m120396c(context, intent);
    }

    /* renamed from: i */
    public static boolean m151189i(Context context) {
        return context.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE");
    }

    /* renamed from: j */
    public static boolean m151190j(Context context) {
        C90476a aVar = C91018d.f254254a;
        C143701ac a = C143701ac.m233450a(context);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.apps.nexuslauncher", 4096);
            if (packageInfo.permissions == null) {
                return false;
            }
            PermissionInfo[] permissionInfoArr = packageInfo.permissions;
            int length = permissionInfoArr.length;
            int i = 0;
            while (i < length) {
                if (!"com.google.android.apps.nexuslauncher.permission.QSB".equals(permissionInfoArr[i].name)) {
                    i++;
                } else if ((packageInfo.applicationInfo.flags & 129) == 0 || !a.mo119084c(packageInfo.packageName)) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m151191m(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        ComponentName componentName = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity");
        if (C142073b.m230647a(intent).booleanValue() || componentName.equals(component) || (e.a(component.getClassName()).booleanValue() && component.getPackageName().equals("com.google.android.googlequicksearchbox") && "com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH".equals(intent.getAction()))) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static Intent m151192n(String str, C50794cr crVar, C50731p pVar) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_ASSISTANT_QUERY", str);
        m151195q(intent, (String) null, crVar, pVar, true);
        return intent;
    }

    /* renamed from: o */
    public static void m151193o(Intent intent, C50731p pVar) {
        if (pVar == C50731p.BROADCAST) {
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver"));
        } else if (pVar == C50731p.START_ACTIVITY) {
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.smartspace.SmartspaceTrampolineActivity"));
        }
    }

    /* renamed from: p */
    public static Intent m151194p(String str, C50794cr crVar, C50731p pVar, int i) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT", str);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_LONG_PRESS_MENU_ITEM_TYPE", i - 1);
        m151195q(intent, (String) null, crVar, pVar, true);
        return intent;
    }

    /* renamed from: q */
    private static void m151195q(Intent intent, String str, C50794cr crVar, C50731p pVar, boolean z) {
        if (str != null) {
            intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_ID", str);
        }
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", crVar.f132222T);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE", pVar.f132020d);
        if (pVar == C50731p.BROADCAST) {
            intent.setAction("com.google.android.apps.gsa.smartspace.CLICK_EVENT").setPackage("com.google.android.googlequicksearchbox").addFlags(268435456);
        } else if (pVar == C50731p.START_ACTIVITY) {
            if (z) {
                intent.putExtra("com.google.android.apps.gsa.smartspace.MAY_NEED_USER_UNLOCK", true);
            }
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ExportedSmartspaceTrampolineActivity")).addFlags(402653184);
        }
    }

    /* renamed from: b */
    public final Intent mo86768b() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        C142073b.m230648b(intent);
        intent.putExtra("source", "and.gsa.weather.widget");
        return intent;
    }

    /* renamed from: g */
    public final void mo86769g() {
        Intent putExtra = new Intent().setAction("android.intent.action.MAIN").setClassName(this.f256847c, "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity").setFlags(1409810432).putExtra(":android:no_headers", false).putExtra(":android:show_fragment", "com.google.android.apps.gsa.smartspace.settingsui.SmartspaceSettingsFragment").putExtra(":android:show_fragment_title", R.string.smartspace_settings_title);
        C90476a aVar = C91018d.f254254a;
        this.f256847c.startActivity(putExtra);
    }

    /* renamed from: h */
    public final void mo86770h(Context context, Intent intent) {
        Intent intent2;
        C58833ax axVar;
        C50794cr crVar = C50794cr.UNDEFINED;
        if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE") && (crVar = C50794cr.m85938a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", 0))) == null) {
            crVar = C50794cr.UNDEFINED;
        }
        if (!C92111g.m151147e(crVar)) {
            ((C59052c) ((C59052c) f256845e.mo56225c()).mo56372aa(11967)).mo56386p("Invalid card type in click intent.");
        } else if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY")) {
            Intent d = C89429a.m145446d(context, Query.f252741b.mo84268aE(intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY"), false).mo84493u());
            d.addFlags(268959744);
            context.startActivity(d, (Bundle) null);
        } else if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT")) {
            String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT");
            if (stringExtra != null) {
                try {
                    if (crVar == C50794cr.ASSISTANT) {
                        Intent intent3 = (Intent) C90772bp.m148302j(C59326i.f157517e.mo56836k(stringExtra), Intent.CREATOR);
                        if (intent3 == null) {
                            axVar = C58836b.f156633a;
                        } else {
                            axVar = C58833ax.m90834k(intent3);
                        }
                        if (axVar.mo56113h()) {
                            intent2 = new Intent(context, ProxyActivity.class).putExtra("intent-sender", PendingIntent.getService(context, 0, (Intent) axVar.mo56107c(), 201326592).getIntentSender());
                        } else {
                            ((C59052c) ((C59052c) f256845e.mo56225c()).mo56372aa(11962)).mo56386p("Failed deserializing the base64 encoded tap intent.");
                            intent2 = null;
                        }
                    } else {
                        intent2 = Intent.parseUri(stringExtra, 1);
                    }
                    if (crVar == C50794cr.REMINDER && intent2 != null && intent2.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.REMINDER_HUB_INTENT_EXTRA")) {
                        if (this.f256849f.mo78074S()) {
                            intent2 = C132540c.m215469b();
                        } else {
                            intent2 = C87574a.f236603a.mo83277a(intent2);
                        }
                    }
                    if (intent2 != null) {
                        if (crVar.ordinal() == 1) {
                            if (!m151191m(intent2)) {
                                return;
                            }
                        }
                        intent2.addFlags(268435456);
                        context.startActivity(intent2, (Bundle) null);
                    }
                } catch (URISyntaxException e) {
                    ((C59052c) ((C59052c) ((C59052c) f256845e.mo56225c()).mo56382g(e)).mo56372aa(11965)).mo56389s("Failed to create intent from URI: %s", stringExtra);
                } catch (ActivityNotFoundException e2) {
                    ((C59052c) ((C59052c) ((C59052c) f256845e.mo56225c()).mo56382g(e2)).mo56372aa(11966)).mo56389s("No Activity found to handle Smartspace click intent: %s", stringExtra);
                }
            } else {
                ((C59052c) ((C59052c) f256845e.mo56225c()).mo56372aa(11964)).mo56386p("Smartspace extra intent doesn't exist.");
            }
        } else {
            ((C59052c) ((C59052c) f256845e.mo56226d()).mo56372aa(11963)).mo56386p("Incomplete intent extra.");
            int i = C90755l.f253831a;
        }
    }

    /* renamed from: k */
    public final boolean mo86771k() {
        if (!this.f256848d.mo86755k() || !this.f256850g.getBoolean("smartspace_alarm_enabled", true) || !this.f256846b.mo79746e(C90014bt.f247694lw)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo86772l() {
        return this.f256848d.mo86755k() && this.f256846b.mo79746e(C90017bw.f247969be) && this.f256846b.mo79746e(C90017bw.f247923al);
    }
}
