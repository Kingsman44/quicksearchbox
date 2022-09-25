package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6558as.C84730a;
import com.google.android.apps.gsa.search.core.p6519al.p6676cv.C85225a;
import com.google.android.apps.gsa.search.core.p6519al.p6731f.C85465a;
import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88147qx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88148qy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88149qz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88151ra;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88152rb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88153rc;
import com.google.android.apps.gsa.shared.p7020bd.C89408a;
import com.google.android.apps.gsa.shared.p7020bd.C89409b;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4193c.p4195b.p4196a.C55914b;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62974ct;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import p5451f.p5452a.p5453a.p5454a.C69379aa;
import p5451f.p5452a.p5453a.p5454a.C69381ac;
import p5451f.p5452a.p5453a.p5454a.C69384af;
import p5451f.p5452a.p5453a.p5454a.C69386ah;
import p5451f.p5452a.p5453a.p5454a.C69388aj;
import p5451f.p5452a.p5453a.p5454a.C69390al;
import p5451f.p5452a.p5453a.p5454a.C69391am;
import p5451f.p5452a.p5453a.p5454a.C69395aq;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69431bz;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.o */
/* compiled from: PG */
public final class C87332o {

    /* renamed from: a */
    public static final C59071e f235876a = C59071e.m91332i("com.google.android.apps.gsa.search.core.y.e.e.o");

    /* renamed from: b */
    static final C88153rc f235877b;

    /* renamed from: c */
    final Map f235878c;

    /* renamed from: d */
    public final C89409b f235879d;

    /* renamed from: e */
    public final C85536a f235880e;

    /* renamed from: f */
    public final Context f235881f;

    /* renamed from: g */
    public final C86124t f235882g;

    /* renamed from: h */
    public final C22871g f235883h;

    /* renamed from: i */
    public C58833ax f235884i;

    /* renamed from: j */
    public C58833ax f235885j;

    /* renamed from: k */
    public boolean f235886k;

    /* renamed from: l */
    private final C85225a f235887l;

    /* renamed from: m */
    private final C84730a f235888m;

    /* renamed from: n */
    private final C85465a f235889n;

    /* renamed from: o */
    private final C92486a f235890o;

    /* renamed from: p */
    private final C89994f f235891p;

    /* renamed from: q */
    private final bm f235892q;

    /* renamed from: r */
    private final C91097g f235893r;

    /* renamed from: s */
    private final C86054o f235894s;

    static {
        C88152rb rbVar = (C88152rb) C88153rc.f238294j.createBuilder();
        rbVar.copyOnWrite();
        C88153rc rcVar = (C88153rc) rbVar.instance;
        rcVar.f238302f = 2;
        rcVar.f238297a |= 16;
        rbVar.copyOnWrite();
        C88153rc rcVar2 = (C88153rc) rbVar.instance;
        rcVar2.f238297a |= 64;
        rcVar2.f238304h = true;
        rbVar.copyOnWrite();
        C88153rc rcVar3 = (C88153rc) rbVar.instance;
        rcVar3.f238297a |= 1;
        rcVar3.f238298b = "https://searchwebstories.withgoogle.com/discover-ways-to-search/";
        rbVar.copyOnWrite();
        C88153rc rcVar4 = (C88153rc) rbVar.instance;
        rcVar4.f238297a |= 2;
        rcVar4.f238299c = "https://searchwebstories-withgoogle-com.cdn.ampproject.org/c/s/searchwebstories.withgoogle.com/discover-ways-to-search/";
        C88147qx qxVar = (C88147qx) C88148qy.f238276d.createBuilder();
        C88149qz qzVar = (C88149qz) C88151ra.f238286g.createBuilder();
        qzVar.copyOnWrite();
        C88151ra raVar = (C88151ra) qzVar.instance;
        raVar.f238288a = 1 | raVar.f238288a;
        raVar.f238289b = "https://searchwebstories.withgoogle.com/discover-ways-to-search/";
        qzVar.copyOnWrite();
        C88151ra raVar2 = (C88151ra) qzVar.instance;
        raVar2.f238288a = 2 | raVar2.f238288a;
        raVar2.f238290c = "https://searchwebstories-withgoogle-com.cdn.ampproject.org/c/s/searchwebstories.withgoogle.com/discover-ways-to-search/";
        qxVar.mo81988a(qzVar);
        rbVar.copyOnWrite();
        C88153rc rcVar5 = (C88153rc) rbVar.instance;
        C88148qy qyVar = (C88148qy) qxVar.build();
        qyVar.getClass();
        rcVar5.f238305i = qyVar;
        rcVar5.f238297a |= 128;
        f235877b = (C88153rc) rbVar.build();
    }

    public C87332o(Context context, C91097g gVar, C86054o oVar, C86124t tVar, C89409b bVar, C85536a aVar, C85225a aVar2, C84730a aVar3, C85465a aVar4, C92486a aVar5, C89994f fVar, bm bmVar, C22871g gVar2) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C69390al.SEARCH_WIDGET_PROMOTION, C87343z.BOTTOM_DIALOG);
        gzVar.mo55429h(C69390al.DARK_MODE_PROMOTION, C87343z.BOTTOM_DIALOG);
        gzVar.mo55429h(C69390al.DISCOVER_ENTRYPOINT_PROMOTION, C87343z.BOTTOM_DIALOG);
        gzVar.mo55429h(C69390al.VAAV2_VOICE_SEARCH_PROMOTION, C87343z.SNACKBAR);
        gzVar.mo55429h(C69390al.VOICE_MATCH_PROMOTION, C87343z.BOTTOM_DIALOG);
        gzVar.mo55429h(C69390al.MANDALORIAN_AR_PROMOTION, C87343z.BOTTOM_DIALOG);
        gzVar.mo55429h(C69390al.APVS_SHORTCUT_PROMOTION, C87343z.BOTTOM_DIALOG);
        gzVar.mo55429h(C69390al.HOMECSREEN_DEEPLINK_DEFAULT_PROMOTION, C87343z.BOTTOM_DIALOG);
        this.f235878c = gzVar.mo55427f(false);
        C58836b bVar2 = C58836b.f156633a;
        this.f235884i = bVar2;
        this.f235885j = bVar2;
        this.f235881f = context;
        this.f235893r = gVar;
        this.f235882g = tVar;
        this.f235879d = bVar;
        this.f235880e = aVar;
        this.f235887l = aVar2;
        this.f235888m = aVar3;
        this.f235889n = aVar4;
        this.f235890o = aVar5;
        this.f235891p = fVar;
        this.f235892q = bmVar;
        this.f235894s = oVar;
        this.f235883h = gVar2;
    }

    /* renamed from: a */
    public static C58833ax m141281a(C69379aa aaVar) {
        C87343z zVar = C87343z.UNKNOWN_TYPE;
        C69390al alVar = C69390al.UNKNOWN;
        C69386ah ahVar = C69386ah.EMPTY;
        C69388aj ajVar = C69388aj.NONE;
        C69379aa aaVar2 = C69379aa.UNSPECIFIED;
        C69384af afVar = C69384af.UNDEFINED;
        C69381ac acVar = C69381ac.UNRESOLVED;
        int ordinal = aaVar.ordinal();
        if (ordinal == 1) {
            return C58833ax.m90834k(C87320c.PERSISTENT);
        }
        if (ordinal == 2) {
            return C58833ax.m90834k(C87320c.NORMAL);
        }
        if (ordinal == 3) {
            return C58833ax.m90834k(C87320c.PREEMPTIVE);
        }
        C59104x c = f235876a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BSDTipParser");
        ((C59052c) ((C59052c) c).mo56372aa(8254)).mo56386p("Can't recognize the BottomSheetCategory enum of the bottomDialogTip tip.");
        return C58836b.f156633a;
    }

    /* renamed from: g */
    private final String m141282g() {
        if (this.f235891p.mo83834w()) {
            return this.f235890o.mo87231e(Locale.getDefault().toString());
        }
        return this.f235890o.mo87230d();
    }

    /* renamed from: b */
    public final C58833ax mo80974b(C69386ah ahVar) {
        C87343z zVar = C87343z.UNKNOWN_TYPE;
        C69390al alVar = C69390al.UNKNOWN;
        C69386ah ahVar2 = C69386ah.EMPTY;
        C69388aj ajVar = C69388aj.NONE;
        C69379aa aaVar = C69379aa.UNSPECIFIED;
        C69384af afVar = C69384af.UNDEFINED;
        C69381ac acVar = C69381ac.UNRESOLVED;
        switch (ahVar.ordinal()) {
            case 1:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_add_google_to_home_screen));
            case 2:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_add_google_to_your_home_screen));
            case 3:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_add_google_to_your_home_screen_to_search_faster));
            case 4:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_add_search_to_home_screen));
            case 5:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_add_search_to_your_home_screen));
            case 6:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_add_the_google_widget_to_your_home_screen_to_search_faster));
            case 7:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_search_faster_from_your_home_screen));
            case 8:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_search_faster_with_the_widget));
            case 9:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_search_from_the_home_screen));
            case 10:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_search_from_your_home_screen));
            case 11:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_search_without_opening_the_app));
            case 12:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_try_searching_from_the_home_screen));
            case 13:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.dt_promocard_text_dark_theme_battery_mode));
            case 14:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.dt_promocard_text_dark_theme_system_setting));
            case 15:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.entrypoint_promocard_text_add_the_google_app_to_your_home_screen));
            case 16:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.entrypoint_promocard_text_add_this_app_to_your_home_screen));
            case 17:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_add_the_google_widget_to_your_home_screen));
            case 18:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_search_faster_with_the_google_widget));
            case 19:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_add_the_google_search_bar_to_your_home_screen));
            case 20:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.vaav2_promo_help_improve_voice_search));
            case 21:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.vaav2_promo_make_choice_about_audio_recordings));
            case 22:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.qsb_promocard_text_get_the_google_search_bar_to_search_faster));
            case 23:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.vm_promocard_text_set_up_hey_google_for_assistant, new Object[]{m141282g()}));
            case 24:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.vm_promocard_text_set_up_hey_google_for_voice_search, new Object[]{m141282g()}));
            case 25:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.apvs_shortcut_promocard_access_voice_search_from_homescreen));
            case 26:
                return C58833ax.m90834k(this.f235881f.getResources().getString(R.string.deeplink_default_promocard_search_with));
            default:
                C59104x c = f235876a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BSDTipParser");
                ((C59052c) ((C59052c) c).mo56372aa(8255)).mo56386p("Can't recognize the DialogMessageType enum of the bottomDialogTip tip.");
                return C58836b.f156633a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo80975c(p5451f.p5452a.p5453a.p5454a.C69391am r8) {
        /*
            r7 = this;
            f.a.a.a.t r0 = r8.f185655p
            if (r0 != 0) goto L_0x0006
            f.a.a.a.t r0 = p5451f.p5452a.p5453a.p5454a.C69455t.f185861c
        L_0x0006:
            int r0 = r0.f185863a
            java.lang.String r1 = ""
            r2 = 1
            if (r0 != r2) goto L_0x0021
            f.a.a.a.t r8 = r8.f185655p
            if (r8 != 0) goto L_0x0013
            f.a.a.a.t r8 = p5451f.p5452a.p5453a.p5454a.C69455t.f185861c
        L_0x0013:
            int r0 = r8.f185863a
            if (r0 != r2) goto L_0x001c
            java.lang.Object r8 = r8.f185864b
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
        L_0x001c:
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r1)
            return r8
        L_0x0021:
            f.a.a.a.t r0 = r8.f185655p
            if (r0 != 0) goto L_0x0028
            f.a.a.a.t r3 = p5451f.p5452a.p5453a.p5454a.C69455t.f185861c
            goto L_0x0029
        L_0x0028:
            r3 = r0
        L_0x0029:
            int r3 = r3.f185863a
            java.lang.String r4 = "BSDTipParser"
            r5 = 2
            if (r3 != r5) goto L_0x008c
            android.content.Context r3 = r7.f235881f     // Catch:{ FileNotFoundException -> 0x005d }
            if (r0 != 0) goto L_0x0036
            f.a.a.a.t r0 = p5451f.p5452a.p5453a.p5454a.C69455t.f185861c     // Catch:{ FileNotFoundException -> 0x005d }
        L_0x0036:
            int r6 = r0.f185863a     // Catch:{ FileNotFoundException -> 0x005d }
            if (r6 != r5) goto L_0x003f
            java.lang.Object r0 = r0.f185864b     // Catch:{ FileNotFoundException -> 0x005d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ FileNotFoundException -> 0x005d }
            goto L_0x0040
        L_0x003f:
            r0 = r1
        L_0x0040:
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ FileNotFoundException -> 0x005d }
            android.util.Pair r0 = com.google.android.apps.gsa.shared.util.C90772bp.m148303k(r3, r0)     // Catch:{ FileNotFoundException -> 0x005d }
            java.lang.Object r3 = r0.first     // Catch:{ FileNotFoundException -> 0x005d }
            android.content.res.Resources r3 = (android.content.res.Resources) r3     // Catch:{ FileNotFoundException -> 0x005d }
            java.lang.Object r0 = r0.second     // Catch:{ FileNotFoundException -> 0x005d }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ FileNotFoundException -> 0x005d }
            int r0 = r0.intValue()     // Catch:{ FileNotFoundException -> 0x005d }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ FileNotFoundException -> 0x005d }
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ FileNotFoundException -> 0x005d }
            return r8
        L_0x005d:
            r0 = move-exception
            com.google.common.f.e r3 = f235876a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r6, r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.x r0 = r3.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r3 = 8264(0x2048, float:1.158E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            f.a.a.a.t r3 = r8.f185655p
            if (r3 != 0) goto L_0x007f
            f.a.a.a.t r3 = p5451f.p5452a.p5453a.p5454a.C69455t.f185861c
        L_0x007f:
            int r6 = r3.f185863a
            if (r6 != r5) goto L_0x0087
            java.lang.Object r1 = r3.f185864b
            java.lang.String r1 = (java.lang.String) r1
        L_0x0087:
            java.lang.String r3 = "Could not find text id uri: %s"
            r0.mo56389s(r3, r1)
        L_0x008c:
            com.google.android.apps.gsa.search.core.y.e.e.z r0 = com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87343z.UNKNOWN_TYPE
            f.a.a.a.al r0 = p5451f.p5452a.p5453a.p5454a.C69390al.UNKNOWN
            f.a.a.a.ah r0 = p5451f.p5452a.p5453a.p5454a.C69386ah.EMPTY
            f.a.a.a.aj r0 = p5451f.p5452a.p5453a.p5454a.C69388aj.NONE
            f.a.a.a.aa r0 = p5451f.p5452a.p5453a.p5454a.C69379aa.UNSPECIFIED
            f.a.a.a.af r0 = p5451f.p5452a.p5453a.p5454a.C69384af.UNDEFINED
            f.a.a.a.ac r0 = p5451f.p5452a.p5453a.p5454a.C69381ac.UNRESOLVED
            int r8 = r8.f185643c
            f.a.a.a.af r8 = p5451f.p5452a.p5453a.p5454a.C69384af.m100739a(r8)
            if (r8 != 0) goto L_0x00a4
            f.a.a.a.af r8 = p5451f.p5452a.p5453a.p5454a.C69384af.UNDEFINED
        L_0x00a4:
            int r8 = r8.ordinal()
            switch(r8) {
                case 1: goto L_0x0126;
                case 2: goto L_0x0114;
                case 3: goto L_0x0126;
                case 4: goto L_0x0126;
                case 5: goto L_0x0102;
                case 6: goto L_0x00e4;
                case 7: goto L_0x0126;
                case 8: goto L_0x00ab;
                case 9: goto L_0x00d2;
                case 10: goto L_0x00c0;
                case 11: goto L_0x00c0;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            com.google.common.f.e r8 = f235876a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r0, r4)
            java.lang.String r0 = "Can't recognize the CardType enum of the bottomDialogTip tip."
            r1 = 8263(0x2047, float:1.1579E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            return r8
        L_0x00c0:
            android.content.Context r8 = r7.f235881f
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2132086100(0x7f150d54, float:1.9812417E38)
            java.lang.String r8 = r8.getString(r0)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            return r8
        L_0x00d2:
            android.content.Context r8 = r7.f235881f
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2132083286(0x7f150256, float:1.980671E38)
            java.lang.String r8 = r8.getString(r0)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            return r8
        L_0x00e4:
            android.content.Context r8 = r7.f235881f
            android.content.res.Resources r8 = r8.getResources()
            com.google.android.apps.gsa.shared.m.b.f r0 = r7.f235891p
            boolean r0 = r0.mo83823l()
            if (r2 == r0) goto L_0x00f6
            r0 = 2132093534(0x7f152a5e, float:1.9827495E38)
            goto L_0x00f9
        L_0x00f6:
            r0 = 2132093535(0x7f152a5f, float:1.9827497E38)
        L_0x00f9:
            java.lang.String r8 = r8.getString(r0)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            return r8
        L_0x0102:
            android.content.Context r8 = r7.f235881f
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2132093460(0x7f152a14, float:1.9827345E38)
            java.lang.String r8 = r8.getString(r0)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            return r8
        L_0x0114:
            android.content.Context r8 = r7.f235881f
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2132086410(0x7f150e8a, float:1.9813046E38)
            java.lang.String r8 = r8.getString(r0)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            return r8
        L_0x0126:
            android.content.Context r8 = r7.f235881f
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2132091759(0x7f15236f, float:1.9823895E38)
            java.lang.String r8 = r8.getString(r0)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87332o.mo80975c(f.a.a.a.am):com.google.common.base.ax");
    }

    /* renamed from: d */
    public final C60870cx mo80976d(C69381ac acVar, C69390al alVar) {
        C69431bz bzVar;
        C58833ax axVar;
        C69391am amVar;
        C58833ax axVar2;
        try {
            C87343z zVar = C87343z.UNKNOWN_TYPE;
            C69390al alVar2 = C69390al.UNKNOWN;
            C69386ah ahVar = C69386ah.EMPTY;
            C69388aj ajVar = C69388aj.NONE;
            C69379aa aaVar = C69379aa.UNSPECIFIED;
            C69384af afVar = C69384af.UNDEFINED;
            C69381ac acVar2 = C69381ac.UNRESOLVED;
            int ordinal = acVar.ordinal();
            if (ordinal == 1) {
                bzVar = C69431bz.SEARCH_TAB;
            } else if (ordinal == 2) {
                bzVar = C69431bz.INTERESTS_TAB;
            } else if (ordinal == 3) {
                bzVar = C69431bz.RECENTS_TAB;
            } else if (ordinal != 4) {
                C59104x c = f235876a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BSDTipParser");
                ((C59052c) ((C59052c) c).mo56372aa(8265)).mo56386p("invalid bottom sheet surface");
                return C60856cj.m92900i(false);
            } else {
                bzVar = C69431bz.COLLECTIONS_TAB;
            }
            C58833ax b = this.f235879d.mo83326b(C69395aq.BOTTOM_DIALOG_TIP, bzVar);
            if (!b.mo56113h()) {
                C58976aa aaVar2 = C58975e.f156826a;
                return C60856cj.m92900i(false);
            }
            int intValue = ((Integer) b.mo56107c()).intValue();
            try {
                axVar = C58833ax.m90834k(this.f235879d.mo83327c(intValue));
            } catch (C89408a | C62974ct e) {
                C59104x c2 = f235876a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BSDTipParser");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(8257)).mo56386p("Error retrieving next bottom dialog tip");
                axVar = C58836b.f156633a;
            }
            if (!axVar.mo56113h()) {
                C59104x c3 = f235876a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "BSDTipParser");
                ((C59052c) ((C59052c) c3).mo56372aa(8269)).mo56387q("Could not retrieve bottom tip for id: %d", intValue);
                return C60856cj.m92900i(false);
            }
            C69396ar arVar = (C69396ar) axVar.mo56107c();
            if (arVar.f185680a == 5) {
                amVar = (C69391am) arVar.f185681b;
            } else {
                amVar = C69391am.f185639r;
            }
            C69390al a = C69390al.m100745a(amVar.f185642b);
            if (a == null) {
                a = C69390al.UNKNOWN;
            }
            if (a == C69390al.UNKNOWN) {
                C59104x c4 = f235876a.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "BSDTipParser");
                ((C59052c) ((C59052c) c4).mo56372aa(8253)).mo56386p("Can't recognize the TipType of the bottomDialogTip tip.");
                axVar2 = C58836b.f156633a;
            } else {
                axVar2 = C58833ax.m90834k(amVar);
            }
            if (!axVar2.mo56113h()) {
                C59104x c5 = f235876a.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "BSDTipParser");
                ((C59052c) ((C59052c) c5).mo56372aa(8268)).mo56387q("Could not retrieve bottom tip for id: %d", intValue);
                return C60856cj.m92900i(false);
            }
            C69391am amVar2 = (C69391am) axVar2.mo56107c();
            if (!new C62963cj(amVar2.f185649i, C69391am.f185638j).contains(acVar)) {
                C59104x c6 = f235876a.mo56225c();
                c6.mo56378ag(C58975e.f156826a, "BSDTipParser");
                ((C59052c) ((C59052c) c6).mo56372aa(8267)).mo56387q("Bottom tip is not of given surface type: %d", acVar.f185561f);
                return C60856cj.m92900i(false);
            }
            if (alVar != null) {
                C69390al a2 = C69390al.m100745a(amVar2.f185642b);
                if (a2 == null) {
                    a2 = C69390al.UNKNOWN;
                }
                if (alVar != a2) {
                    return C60856cj.m92900i(false);
                }
            }
            if (!this.f235885j.mo56113h() || !this.f235884i.mo56113h()) {
                return C60856cj.m92900i(false);
            }
            return this.f235883h.mo28209i(this.f235880e.mo79049a(intValue), "maybeRequestToShowBottomSheet", new C87329l(this, amVar2, intValue, axVar));
        } catch (C89408a | C62974ct e2) {
            C59104x c7 = f235876a.mo56225c();
            c7.mo56378ag(C58975e.f156826a, "BSDTipParser");
            ((C59052c) ((C59052c) ((C59052c) c7).mo56382g(e2)).mo56372aa(8266)).mo56386p("Error retrieving next bottom dialog tip id");
            return C60856cj.m92900i(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo80977e(C69391am amVar, int i, C87323f fVar) {
        C58976aa aaVar = C58975e.f156826a;
        if ((amVar.f185641a & 512) != 0) {
            try {
                this.f235893r.mo65089a(Intent.parseUri(amVar.f185652m, 1));
            } catch (URISyntaxException e) {
                C59104x c = f235876a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BSDTipParser");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(8275)).mo56386p("Failed to parse Intent.");
            }
            this.f235880e.mo79059k(i, 3);
            ((C87334q) this.f235884i.mo56107c()).mo80981d(fVar, 3);
            return;
        }
        int[] iArr = C87330m.f235873f;
        C69390al a = C69390al.m100745a(amVar.f185642b);
        if (a == null) {
            a = C69390al.UNKNOWN;
        }
        int i2 = iArr[a.ordinal()];
        this.f235880e.mo79059k(i, 3);
        ((C87334q) this.f235884i.mo56107c()).mo80981d(fVar, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo80978f(C69391am amVar, int i, C87321d dVar) {
        Intent intent;
        C58976aa aaVar = C58975e.f156826a;
        if ((amVar.f185641a & 256) != 0) {
            try {
                this.f235893r.mo65089a(Intent.parseUri(amVar.f185651l, 1));
            } catch (URISyntaxException e) {
                C59104x c = f235876a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BSDTipParser");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(8277)).mo56386p("Failed to parse Intent.");
            }
            this.f235880e.mo79051c(i);
            ((C87334q) this.f235884i.mo56107c()).mo80981d(dVar, 3);
            return;
        }
        C87343z zVar = C87343z.UNKNOWN_TYPE;
        C69390al alVar = C69390al.UNKNOWN;
        C69386ah ahVar = C69386ah.EMPTY;
        C69388aj ajVar = C69388aj.NONE;
        C69379aa aaVar2 = C69379aa.UNSPECIFIED;
        C69384af afVar = C69384af.UNDEFINED;
        C69381ac acVar = C69381ac.UNRESOLVED;
        C69390al a = C69390al.m100745a(amVar.f185642b);
        if (a == null) {
            a = C69390al.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            this.f235887l.mo78805c();
        } else if (ordinal == 3) {
            this.f235888m.mo78446a(this.f235882g.mo79758x(C89972ak.f246541P), this.f235882g.mo79758x(C89972ak.f246540O));
        } else if (ordinal == 4) {
            this.f235893r.mo65089a(new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.hotwordenrollment.VAAConsentActivity").putExtra("entry_point", C55914b.SRP_VOICE_SEARCH_PROMO).putExtra("account", C58837ba.m90858g(this.f235894s.mo79659F())));
        } else if (ordinal == 5) {
            if (this.f235891p.mo83823l()) {
                C74554t i2 = C74555u.m120572i();
                i2.mo70869c(C9439b.VOICE_MATCH_ENROLLMENT_FROM_SRP_PROMO);
                intent = i2.mo70882h();
            } else {
                this.f235890o.mo87238l(true);
                this.f235891p.mo83903aw(1, EventForDump.m147675d(5));
                if (this.f235892q.u()) {
                    String str = true != this.f235882g.mo79746e(C90059dk.f249113bW) ? "phone_voice_match" : "speaker_id_enrollment";
                    C18509a c2 = C18522b.m35986c();
                    c2.mo24023e("mariko_srp_promo");
                    ((C18523c) c2).f52492a = str;
                    intent = c2.mo24020b().mo24031a();
                } else {
                    intent = new Intent("android.intent.action.MAIN").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity").putExtra(":android:no_headers", false).putExtra(":android:show_fragment", "com.google.android.apps.gsa.speech.settingsui.hotword.HotwordSettingsFragment").putExtra("smart_lock", true).putExtra("enrollment_entry_id", 68);
                }
            }
            this.f235893r.mo65090b(intent, new C91095e());
        } else if (ordinal == 7) {
            this.f235888m.mo78447b();
        } else if (ordinal == 8) {
            this.f235889n.mo78989a(f235877b);
        }
        this.f235880e.mo79051c(i);
        ((C87334q) this.f235884i.mo56107c()).mo80981d(dVar, 3);
    }
}
