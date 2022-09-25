package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7129r.C90471m;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.smartspace.p7257a.C92026h;
import com.google.android.apps.gsa.smartspace.p7257a.C92029k;
import com.google.android.apps.gsa.smartspace.p7257a.C92030l;
import com.google.android.apps.gsa.smartspace.p7259c.C92096l;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110581an;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110582ao;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110600be;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110602bg;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130679b;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130683e;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130684f;
import com.google.android.apps.search.assistant.verticals.ambient.p9917g.C130685g;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9955b.C131180a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9955b.C131181b;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9955b.C131182c;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131194a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131195b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50712ax;
import com.google.assistant.p3886c.C50737bb;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50787ck;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4546c.C59394b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.net.URISyntaxException;
import java.util.logging.Level;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70876o;

/* compiled from: PG */
public class SmartspaceTrampolineActivity extends C110503a implements C90471m {

    /* renamed from: a */
    public static final C59071e f308071a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.SmartspaceTrampolineActivity");

    /* renamed from: b */
    public C90465g f308072b;

    /* renamed from: c */
    public bm f308073c;

    /* renamed from: d */
    public C92125t f308074d;

    /* renamed from: e */
    public C110602bg f308075e;

    /* renamed from: f */
    public C110582ao f308076f;

    /* renamed from: g */
    public C83793i f308077g;

    /* renamed from: h */
    public C86124t f308078h;

    /* renamed from: i */
    public C86127w f308079i;

    /* renamed from: j */
    public C131182c f308080j;

    /* renamed from: k */
    public C22871g f308081k;

    /* renamed from: l */
    public C92030l f308082l;

    /* renamed from: f */
    private final void m184089f(Intent intent) {
        int b = C50787ck.m85933b(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_LONG_PRESS_MENU_ITEM_TYPE", 0));
        Intent g = m184090g(intent, b);
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 1) {
            if (intent.getBooleanExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.EXTRA_IS_AA_TNG_CARD", false)) {
                C50794cr a = C50794cr.m85938a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", -1));
                C22871g gVar = this.f308081k;
                C131182c cVar = this.f308080j;
                Optional ofNullable = Optional.ofNullable(a);
                C130679b bVar = cVar.f358777a;
                C131194a aVar = (C131194a) C131195b.f358800f.createBuilder();
                C63042fg b2 = C62950b.m95471b(cVar.f358778b);
                aVar.copyOnWrite();
                C131195b bVar2 = (C131195b) aVar.instance;
                b2.getClass();
                bVar2.f358804c = b2;
                bVar2.f358802a = 2 | bVar2.f358802a;
                Objects.requireNonNull(aVar);
                ofNullable.ifPresent(new C131180a(aVar));
                C130684f fVar = (C130684f) C130685g.f357848c.createBuilder();
                fVar.copyOnWrite();
                C130685g gVar2 = (C130685g) fVar.instance;
                C131195b bVar3 = (C131195b) aVar.build();
                bVar3.getClass();
                gVar2.f357851b = bVar3;
                gVar2.f357850a |= 1;
                gVar.mo28211k(C60922j.m93044g(C70876o.m103760a(bVar.f189039a.mo39510a(C130683e.m213077a(), bVar.f189040b), (C130685g) fVar.build()), C47810es.m84963c(C131181b.f358776a), cVar.f358779c), "dismissCardCallback", new C110514ae());
            } else if (g == null) {
                C59104x d = f308071a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
                ((C59052c) ((C59052c) d).mo56372aa(26505)).mo56389s("No valid smartspace extra intent. Type: %s", C50787ck.m85932a(b));
            } else {
                sendBroadcast(g);
            }
            finish();
        } else if (i == 2) {
            if (g == null) {
                C59104x d2 = f308071a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
                ((C59052c) ((C59052c) d2).mo56372aa(26504)).mo56389s("No valid smartspace extra intent. Type: %s", C50787ck.m85932a(b));
            } else {
                startActivityForResult(g, 0);
            }
            finish();
        } else if (i != 3) {
            try {
                C59104x d3 = f308071a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
                ((C59052c) ((C59052c) d3).mo56372aa(26501)).mo56389s("Not a valid chip type: %s", C50787ck.m85932a(b));
                finish();
            } catch (ActivityNotFoundException e) {
                C59104x c = f308071a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26502)).mo56389s("No Activity found to handle Smartspace click intent: %s", g);
                finish();
            } catch (RuntimeException e2) {
                C59104x c2 = f308071a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(26503)).mo56386p("Unexpected runtime exception when handling long press menu intent.");
                finish();
            }
        } else if (this.f308078h.mo79746e(C90017bw.f247860B)) {
            if (g == null) {
                C59104x d4 = f308071a.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
                ((C59052c) ((C59052c) d4).mo56372aa(26506)).mo56389s("No valid smartspace extra intent. Type: %s", C50787ck.m85932a(b));
            } else {
                startActivity(g);
            }
            finish();
        } else {
            C90461c cVar2 = new C90461c();
            cVar2.f252699k = false;
            cVar2.f252693e = "com.google.android.googlequicksearchbox.AA_FEEDBACK_CATEGORY";
            cVar2.f252700l = true;
            cVar2.f252690b = "assistant_settings_help_pixel";
            cVar2.mo84198b("genie-eng:app_pkg_name", "com.google.android.googlequicksearchbox.assistant");
            cVar2.f252692d = C87562e.m142218a(getApplicationContext(), "assistant_settings_help_pixel");
            this.f308072b.mo84210a(this).mo84209b(cVar2, 1);
        }
    }

    /* renamed from: g */
    private static Intent m184090g(Intent intent, int i) {
        if (!intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT")) {
            return null;
        }
        String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT");
        if (stringExtra == null) {
            C59104x d = f308071a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(26500);
            String a = C50787ck.m85932a(i);
            if (i != 0) {
                cVar.mo56389s("The intent string is null, item type: %s", a);
                return null;
            }
            throw null;
        }
        try {
            return Intent.parseUri(stringExtra, 1);
        } catch (URISyntaxException e) {
            C59104x c = f308071a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26499)).mo56389s("Failed to create intent from URI: %s", stringExtra);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo84220a() {
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo98741b() {
        C50737bb bbVar;
        Object obj;
        C50737bb bbVar2;
        C50737bb bbVar3;
        Intent intent = getIntent();
        C50701am a = C50701am.m85887a(intent.getIntExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_TYPE_EXTRA", 0));
        if (!(a == null || a == C50701am.UNKNOWN)) {
            this.f308074d.mo86702g(a, C83793i.m133413a(intent), this.f308073c.u() && this.f308073c.w());
        }
        C50731p a2 = intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE") ? C50731p.m85907a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE", 0)) : null;
        if (intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_TYPE_EXTRA")) {
            C83793i iVar = this.f308077g;
            if (iVar.f228385e.mo79746e(C90017bw.f247861C)) {
                if (intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_EXTRA_QUERY")) {
                    String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_EXTRA_QUERY");
                    if (stringExtra == null) {
                        C59104x d = C83793i.f228381a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
                        ((C59052c) ((C59052c) d).mo56372aa(6817)).mo56386p("Query for Smartspacechip is null");
                    } else {
                        iVar.f228386f.mo77188a(stringExtra);
                    }
                } else if (intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_EXTRA")) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_EXTRA");
                    if (byteArrayExtra == null) {
                        C59104x d2 = C83793i.f228381a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
                        ((C59052c) ((C59052c) d2).mo56372aa(6816)).mo56386p("Smartspacechip extra is null");
                    } else {
                        try {
                            C50738bc bcVar = (C50738bc) C62942bv.parseFrom((C62942bv) C50738bc.f132032l, byteArrayExtra, C62921ba.m95368a());
                            if (bcVar.f132035b == 7) {
                                bbVar = (C50737bb) bcVar.f132036c;
                            } else {
                                bbVar = C50737bb.f132027d;
                            }
                            if ((bbVar.f132029a & 1) != 0) {
                                int i = bcVar.f132035b;
                                if (i == 7) {
                                    bbVar2 = (C50737bb) bcVar.f132036c;
                                } else {
                                    bbVar2 = C50737bb.f132027d;
                                }
                                if ((bbVar2.f132029a & 2) != 0) {
                                    if (i == 7) {
                                        bbVar3 = (C50737bb) bcVar.f132036c;
                                    } else {
                                        bbVar3 = C50737bb.f132027d;
                                    }
                                    iVar.mo77146b(bbVar3);
                                }
                            }
                            if (bcVar.f132035b == 8) {
                                C50712ax axVar = (C50712ax) bcVar.f132036c;
                                C62940bt r2 = C62942bv.checkIsLite(C92096l.f256788d);
                                axVar.mo58887l(r2);
                                if (axVar.f169962ag.mo58857o(r2.f169971d)) {
                                    C62940bt r22 = C62942bv.checkIsLite(C92096l.f256788d);
                                    axVar.mo58887l(r22);
                                    Object l = axVar.f169962ag.mo58854l(r22.f169971d);
                                    if (l == null) {
                                        obj = r22.f169969b;
                                    } else {
                                        obj = r22.mo58889c(l);
                                    }
                                    C53287ih ihVar = ((C92096l) obj).f256791b;
                                    if (ihVar == null) {
                                        ihVar = C53287ih.f139693l;
                                    }
                                    iVar.f228384d.mo81698j(iVar.f228383c, ihVar);
                                }
                            }
                        } catch (C62974ct e) {
                            C59104x c = C83793i.f228381a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "OpaSSIntentUtils");
                            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(6815)).mo56386p("Invalid SmartspaceGenericUpdate proto bytes");
                        }
                    }
                }
            }
            finish();
        } else if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_LONG_PRESS_MENU_ITEM_TYPE")) {
            C59104x b = f308071a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
            ((C59052c) ((C59052c) b).mo56372aa(26508)).mo56387q("handle long press menu item: %d", intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_LONG_PRESS_MENU_ITEM_TYPE", -1));
            m184089f(intent);
        } else if (a2 == C50731p.START_ACTIVITY) {
            KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
            if (!this.f308078h.mo79746e(C90017bw.f248040q) || !intent.getBooleanExtra("com.google.android.apps.gsa.smartspace.MAY_NEED_USER_UNLOCK", false) || !keyguardManager.isKeyguardLocked()) {
                mo98743e(intent);
            } else {
                keyguardManager.requestDismissKeyguard(this, new C110515af(this, intent));
            }
        } else {
            C59104x d3 = f308071a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "SmartspaceTramAct");
            ((C59052c) ((C59052c) d3).mo56372aa(26507)).mo56386p("Received Illegal intent!");
            finish();
        }
    }

    /* renamed from: e */
    public final void mo98743e(Intent intent) {
        C50794cr a;
        if (!intent.getBooleanExtra("com.google.android.apps.search.assistant.verticals.ambient.shared.constants.SMARTSPACE_EXTRA_BLUECHIP_INTENT", false) && !intent.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", false) && intent.getStringExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA") != null) {
            C50794cr crVar = C50794cr.UNDEFINED;
            if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE") && (crVar = C50794cr.m85938a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", 0))) == null) {
                crVar = C50794cr.UNDEFINED;
            }
            this.f308074d.mo86700e(crVar, C83793i.m133413a(intent), this.f308073c.u() && this.f308073c.w(), false, intent.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_DATA_FROM_THIRD_PARTY_APP", false));
        }
        if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE") && (a = C50794cr.m85938a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", 0))) != null && a == C50794cr.MEDIA) {
            C92030l lVar = this.f308082l;
            C59394b.m92296b(lVar.f256564a.mo46039a(new C92026h(lVar, C92029k.RECOMMENDATIONS), C60826bg.f164896a), Level.WARNING, "resetMediaCardTotalPush failed.");
        }
        C110602bg bgVar = this.f308075e;
        ((C58970a) ((C58970a) bgVar.f308278c.mo56224b()).mo56372aa(26618)).mo56386p("CrossProfileServiceManagerMediator#startTargetActivity");
        if (!bgVar.f308277b.mo77183v()) {
            bgVar.f308276a.mo98794f(intent);
        } else if (intent.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", false)) {
            String h = bgVar.f308277b.mo77170h();
            C83794j jVar = bgVar.f308277b;
            String str = Build.MANUFACTURER;
            ((C58970a) ((C58970a) bgVar.f308278c.mo56224b()).mo56372aa(26619)).mo56386p("Starts activity in work profile.");
            bgVar.f308279d.mo109952y(h, str, "CROSS_PROFILE_CALL");
            C60856cj.m92911t(bgVar.f308280e.mo98827c().mo98814e(intent), new C110600be(bgVar, h, str), C60826bg.f164896a);
        } else {
            bgVar.f308280e.mo98828d().mo98814e(intent);
        }
        if (!intent.getBooleanExtra("com.google.android.apps.search.assistant.verticals.ambient.shared.constants.SMARTSPACE_EXTRA_BLUECHIP_INTENT", false) && intent.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", false)) {
            C50794cr crVar2 = C50794cr.UNDEFINED;
            if (intent.hasExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE") && (crVar2 = C50794cr.m85938a(intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", 0))) == null) {
                crVar2 = C50794cr.UNDEFINED;
            }
            C60870cx b = this.f308076f.f308254b.mo98824a().mo98788b(crVar2, C83793i.m133413a(intent), this.f308073c.u() && this.f308073c.w(), intent.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_DATA_FROM_THIRD_PARTY_APP", false));
            C60856cj.m92911t(b, new C110581an(), C60826bg.f164896a);
            C59394b.m92296b(b, Level.WARNING, "logInteractionInWorkProfile failed.");
        }
        if (!intent.hasExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_CHIP_TYPE_EXTRA")) {
            Intent intent2 = new Intent();
            String stringExtra = intent.getStringExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_ID");
            if (stringExtra != null) {
                intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_ID", stringExtra);
            }
            intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", -1));
            intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE", intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE", -1));
            intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_DATA_FROM_THIRD_PARTY_APP", intent.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_DATA_FROM_THIRD_PARTY_APP", false));
            intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", intent.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", false));
            intent2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_SUBCARD_INDEX", intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_SUBCARD_INDEX", -1));
            intent2.putExtra("com.google.android.apps.search.assistant.verticals.ambient.shared.constants.SMARTSPACE_EXTRA_BLUECHIP_INTENT", intent.getBooleanExtra("com.google.android.apps.search.assistant.verticals.ambient.shared.constants.SMARTSPACE_EXTRA_BLUECHIP_INTENT", false));
            intent2.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver")).setAction("com.google.android.apps.gsa.smartspace.CLICK_EVENT").setPackage("com.google.android.googlequicksearchbox").addFlags(268435456);
            sendBroadcast(intent2);
        }
        C86338r a2 = this.f308079i.f232790a.mo79722a();
        boolean e = this.f308078h.mo79746e(C90017bw.f247899aN);
        boolean hasSystemFeature = getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE");
        if (e && hasSystemFeature && !a2.getBoolean("smartspace_oobe_dismissed", true) && intent.getIntExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", -1) != 12) {
            Intent intent3 = new Intent();
            intent3.setClassName(this, "com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.SmartspaceOOBEActivity");
            startActivity(intent3);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aB);
        super.onCreate(bundle);
        C90779c.m148334a(this, 1);
        mo98741b();
    }
}
