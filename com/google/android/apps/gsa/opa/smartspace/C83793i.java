package com.google.android.apps.gsa.opa.smartspace;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.search.weather.p10685d.C142073b;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.assistant.p3886c.C50736ba;
import com.google.assistant.p3886c.C50737bb;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.common.p4552o.akp;
import com.google.common.p4552o.akq;
import com.google.common.p4552o.akv;
import com.google.common.p4552o.akx;
import com.google.common.p4552o.aky;
import dagger.C68214a;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.i */
/* compiled from: PG */
public final class C83793i {

    /* renamed from: a */
    public static final C59071e f228381a = C59071e.m91332i("com.google.android.apps.gsa.opa.smartspace.i");

    /* renamed from: b */
    public static final C58528ij f228382b = C58528ij.m90015O("com.google.android.apps.gsa.broadcastreceiver.CALENDAR_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_REFRESH", "com.google.android.apps.gsa.staticplugins.opa.smartspace.WEATHER_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.REMINDER_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ASSISTANT_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_COMMUTE_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ALARM_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.FLIGHT_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.BIRTHDAY_DATA_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.OOBE_INTRO_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_UPDATE_CURRENT_CARD", "com.google.android.apps.gsa.staticplugins.opa.smartspace.FETCH_HOLIDAYS_DEBUG", "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_CARD_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_NOTIFICATION_UPDATE", "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_TIME_FENCES", "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_MONITORING", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_GENERATE_ON_DEVICE_MODEL", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_REMOVE_ON_DEVICE_MODEL", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_TEST_UPDATE");

    /* renamed from: c */
    public final Context f228383c;

    /* renamed from: d */
    public final C87571n f228384d;

    /* renamed from: e */
    public final C86124t f228385e;

    /* renamed from: f */
    public final C83795k f228386f;

    /* renamed from: g */
    private final C68214a f228387g;

    public C83793i(Context context, C87571n nVar, C86124t tVar, C83795k kVar, C68214a aVar) {
        this.f228383c = context;
        this.f228384d = nVar;
        this.f228385e = tVar;
        this.f228386f = kVar;
        this.f228387g = aVar;
    }

    /* renamed from: a */
    public static aky m133413a(Intent intent) {
        akq akq = (akq) aky.f158997e.createBuilder();
        if (intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SURFACE_TYPE_EXTRA")) {
            akv a = akv.m92425a(intent.getIntExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SURFACE_TYPE_EXTRA", 0));
            akq.copyOnWrite();
            aky aky = (aky) akq.instance;
            aky.f159002d = a.f158995g;
            aky.f158999a |= 1;
            if (a.equals(akv.SYSTEM_UI) && intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SYSTEM_UI_SCREEN_EXTRA")) {
                int a2 = akx.m92427a(intent.getIntExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SYSTEM_UI_SCREEN_EXTRA", 0));
                akq.copyOnWrite();
                aky aky2 = (aky) akq.instance;
                int i = a2 - 1;
                if (a2 != 0) {
                    aky2.f159001c = Integer.valueOf(i);
                    aky2.f159000b = 2;
                } else {
                    throw null;
                }
            }
            if (a.equals(akv.AMBIENT) && intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.AMBIENT_SCREEN_EXTRA")) {
                akp a3 = akp.m92422a(intent.getIntExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.AMBIENT_SCREEN_EXTRA", 0));
                akq.copyOnWrite();
                aky aky3 = (aky) akq.instance;
                aky3.f159001c = Integer.valueOf(a3.f158982d);
                aky3.f159000b = 3;
            }
        }
        return (aky) akq.build();
    }

    /* renamed from: m */
    public static boolean m133414m(Intent intent) {
        if (intent.getData() == null) {
            return false;
        }
        Uri data = intent.getData();
        data.getClass();
        if (!C89429a.m145458p(data) || !"com.google.android.googlequicksearchbox".equals(intent.getPackage())) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private final void m133415n(Intent intent, Intent intent2, C50794cr crVar) {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA");
        if (stringExtra != null) {
            C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
            hwVar.copyOnWrite();
            C53287ih ihVar = (C53287ih) hwVar.instance;
            ihVar.f139695a |= 8;
            ihVar.f139701g = stringExtra;
            hwVar.copyOnWrite();
            C53287ih ihVar2 = (C53287ih) hwVar.instance;
            ihVar2.f139698d = 3;
            ihVar2.f139695a |= 1;
            hwVar.copyOnWrite();
            C53287ih ihVar3 = (C53287ih) hwVar.instance;
            ihVar3.f139702h = 3;
            ihVar3.f139695a |= 64;
            if (crVar == C50794cr.FLIGHT) {
                i = 10;
            } else {
                i = crVar == C50794cr.WEATHER ? 9 : crVar == C50794cr.BIRTHDAY ? 33 : 1;
            }
            hwVar.copyOnWrite();
            C53287ih ihVar4 = (C53287ih) hwVar.instance;
            ihVar4.f139703i = i - 1;
            ihVar4.f139695a |= 128;
            if (intent2 != null) {
                String uri = intent2.toUri(1);
                hwVar.copyOnWrite();
                C53287ih ihVar5 = (C53287ih) hwVar.instance;
                uri.getClass();
                ihVar5.f139696b = 3;
                ihVar5.f139697c = uri;
            }
            this.f228384d.mo81698j(this.f228383c, (C53287ih) hwVar.build());
        }
    }

    /* renamed from: o */
    private final boolean m133416o(Intent intent, C50794cr crVar) {
        if (!intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA")) {
            return false;
        }
        if (((!crVar.equals(C50794cr.WEATHER) || !this.f228385e.mo79746e(C90014bt.f247312el)) && ((!crVar.equals(C50794cr.FLIGHT) || !this.f228385e.mo79746e(C90014bt.f247311ek)) && !crVar.equals(C50794cr.BIRTHDAY))) || intent.getStringExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA") == null) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return true;
    }

    /* renamed from: b */
    public final void mo77146b(C50737bb bbVar) {
        int a = C50736ba.m85913a(bbVar.f132031c);
        if (a == 0) {
            a = 1;
        }
        try {
            Intent parseUri = Intent.parseUri(bbVar.f132030b, 1);
            if (a == 3) {
                parseUri.addFlags(402653184);
                this.f228383c.startActivity(parseUri, (Bundle) null);
            } else if (a == 2) {
                this.f228383c.sendBroadcast(parseUri);
            }
        } catch (URISyntaxException e) {
            C59104x c = f228381a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(6818)).mo56389s("Failed to create intent from URI: %s", bbVar.f132030b);
        }
    }

    /* renamed from: c */
    public final void mo77147c(aky aky, C50794cr crVar) {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        akv a = akv.m92425a(aky.f159002d);
        if (a == null) {
            a = akv.UNKNOWN_SURFACE;
        }
        if (a.equals(akv.SYSTEM_UI)) {
            intent.setAction("com.google.android.systemui.smartspace.CLICK_EVENT");
        } else {
            intent.setAction("com.google.android.apps.gsa.smartspace.CLICK_EVENT");
        }
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE", C50731p.START_ACTIVITY);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", crVar.f132222T);
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SURFACE_TYPE_EXTRA", a.f158995g);
        if (aky.f159000b == 2) {
            int a2 = akx.m92427a(((Integer) aky.f159001c).intValue());
            if (a2 == 0) {
                a2 = 1;
            }
            intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SYSTEM_UI_SCREEN_EXTRA", a2 - 1);
        }
        if (aky.f159000b == 3) {
            akp a3 = akp.m92422a(((Integer) aky.f159001c).intValue());
            if (a3 == null) {
                a3 = akp.UNKNOWN_AMBIENT_SCREEN;
            }
            intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.AMBIENT_SCREEN_EXTRA", a3.f158982d);
        }
        C74445c.m120396c(this.f228383c, intent);
    }

    /* renamed from: d */
    public final void mo77148d() {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_REFRESH");
        C74445c.m120396c(this.f228383c, intent);
    }

    /* renamed from: e */
    public final void mo77149e() {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_UPDATE");
        C74445c.m120396c(this.f228383c, intent);
    }

    /* renamed from: f */
    public final void mo77150f() {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.REMINDER_DATA_UPDATE");
        C74445c.m120396c(this.f228383c, intent);
    }

    /* renamed from: g */
    public final void mo77151g() {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.ALARM_DATA_UPDATE");
        C74445c.m120396c(this.f228383c, intent);
    }

    /* renamed from: h */
    public final void mo77152h(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.FLIGHT_DATA_UPDATE");
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.PUSH_MESSAGE", bArr);
        C74445c.m120396c(this.f228383c, intent);
    }

    /* renamed from: i */
    public final void mo77153i(boolean z, boolean z2) {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.OOBE_INTRO_UPDATE");
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_OOBE_DISCARD_EXTRA", z);
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_OOBE_LOCATION_ONLY", z2);
        C74445c.m120396c(this.f228383c, intent);
    }

    /* renamed from: j */
    public final void mo77154j() {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_UPDATE_CURRENT_CARD");
        C74445c.m120396c(this.f228383c, intent);
    }

    /* renamed from: k */
    public final void mo77155k(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.WEATHER_DATA_UPDATE");
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_SEND_DEVICE_LOCATION_EXTRA", z);
        C74445c.m120396c(this.f228383c, intent);
    }

    /* renamed from: l */
    public final void mo77156l(Context context, Intent intent) {
        Intent intent2;
        C58833ax axVar;
        C59071e eVar = f228381a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
        ((C59052c) ((C59052c) b).mo56372aa(6831)).mo56386p("#startTargetActivity");
        C50794cr crVar = C50794cr.UNDEFINED;
        if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE") && (crVar = C50794cr.m85938a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", 0))) == null) {
            crVar = C50794cr.UNDEFINED;
        }
        if (!C92111g.m151147e(crVar)) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
            ((C59052c) ((C59052c) c).mo56372aa(6837)).mo56386p("Invalid card type in click intent.");
        } else if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_ASSISTANT_QUERY")) {
            String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_ASSISTANT_QUERY");
            if (stringExtra == null) {
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
                ((C59052c) ((C59052c) d).mo56372aa(6836)).mo56386p("Assistant query for Smartspace card is null");
                return;
            }
            this.f228386f.mo77188a(stringExtra);
        } else if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY")) {
            Intent d2 = C89429a.m145446d(context, Query.f252741b.mo84268aE(intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_QUERY"), false).mo84493u());
            d2.addFlags(268959744);
            d2.putExtra("source", "and.opa.ambient.smartspace.bluechip");
            if (m133416o(intent, crVar)) {
                m133415n(intent, d2, crVar);
            } else {
                context.startActivity(d2, (Bundle) null);
            }
        } else if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT")) {
            String stringExtra2 = intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT");
            if (stringExtra2 != null) {
                try {
                    if (crVar == C50794cr.ASSISTANT) {
                        Intent intent3 = (Intent) C90772bp.m148302j(C59326i.f157517e.mo56836k(stringExtra2), Intent.CREATOR);
                        if (intent3 == null) {
                            axVar = C58836b.f156633a;
                        } else {
                            axVar = C58833ax.m90834k(intent3);
                        }
                        if (axVar.mo56113h()) {
                            intent2 = new Intent(context, ProxyActivity.class).putExtra("intent-sender", PendingIntent.getService(context, 0, (Intent) axVar.mo56107c(), 201326592).getIntentSender());
                        } else {
                            C59104x c2 = eVar.mo56225c();
                            c2.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
                            ((C59052c) ((C59052c) c2).mo56372aa(6811)).mo56386p("Failed deserializing the base64 encoded tap intent.");
                            intent2 = null;
                        }
                    } else {
                        intent2 = Intent.parseUri(stringExtra2, 1);
                    }
                    if (crVar == C50794cr.REMINDER && intent2 != null && intent2.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.REMINDER_HUB_INTENT_EXTRA")) {
                        intent2 = C87574a.f236603a.mo83277a(intent2);
                    }
                    if (intent2 != null) {
                        if (crVar.ordinal() == 1) {
                            ComponentName component = intent2.getComponent();
                            if (component != null) {
                                ComponentName componentName = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity");
                                if (!C142073b.m230647a(intent2).booleanValue() && !componentName.equals(component) && (!e.a(component.getClassName()).booleanValue() || !component.getPackageName().equals("com.google.android.googlequicksearchbox") || !"com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH".equals(intent2.getAction()))) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        intent2.addFlags(268435456);
                        if (!m133416o(intent, crVar)) {
                            if ("com.google.android.gm.intent.VIEW_PLID".equals(intent2.getAction())) {
                                String F = ((C86054o) this.f228387g.mo27525b()).mo79659F();
                                if (!TextUtils.isEmpty(F)) {
                                    C144354b.m234631a(this.f228383c, intent2, AccountData.m234630a(F));
                                }
                            }
                            context.startActivity(intent2, (Bundle) null);
                            return;
                        }
                        m133415n(intent, intent2, crVar);
                    }
                } catch (URISyntaxException e) {
                    C59104x c3 = f228381a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
                    ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(6834)).mo56389s("Failed to create intent from URI: %s", stringExtra2);
                } catch (ActivityNotFoundException e2) {
                    C59104x c4 = f228381a.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
                    ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e2)).mo56372aa(6835)).mo56389s("No Activity found to handle Smartspace click intent: %s", stringExtra2);
                }
            } else {
                C59104x c5 = eVar.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
                ((C59052c) ((C59052c) c5).mo56372aa(6833)).mo56386p("Smartspace extra intent doesn't exist.");
            }
        } else if (m133416o(intent, crVar)) {
            m133415n(intent, (Intent) null, crVar);
        } else {
            C59104x d3 = eVar.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
            ((C59052c) ((C59052c) d3).mo56372aa(6832)).mo56386p("Incomplete intent extra.");
            int i = C90755l.f253831a;
        }
    }
}
