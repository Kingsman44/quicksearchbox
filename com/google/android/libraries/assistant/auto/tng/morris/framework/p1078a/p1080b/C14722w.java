package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14217ba;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14242bz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14264cu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14265cv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14268cy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14299eb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14300ec;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14301ed;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14302ee;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14313ep;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14393ho;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.android.libraries.assistant.auto.tng.p1098n.p1099a.C15460a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p001a.p007b.p011b.p012a.C0025a;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.w */
/* compiled from: PG */
public final class C14722w implements C14653a {

    /* renamed from: a */
    public static final C59071e f44491a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.w");

    /* renamed from: b */
    public final Context f44492b;

    /* renamed from: c */
    public final PackageManager f44493c;

    /* renamed from: d */
    public final C86124t f44494d;

    /* renamed from: e */
    public final C14693bf f44495e;

    /* renamed from: f */
    public final C15460a f44496f;

    /* renamed from: g */
    public ShortcutManager f44497g;

    /* renamed from: h */
    public Optional f44498h = Optional.empty();

    /* renamed from: i */
    public long f44499i = 0;

    /* renamed from: j */
    public long f44500j = 0;

    /* renamed from: k */
    public long f44501k = 0;

    /* renamed from: l */
    public boolean f44502l = false;

    /* renamed from: m */
    private final C21370a f44503m;

    public C14722w(Context context, C86124t tVar, C21370a aVar, C14693bf bfVar, C15460a aVar2) {
        this.f44492b = context;
        this.f44493c = context.getPackageManager();
        this.f44494d = tVar;
        this.f44503m = aVar;
        this.f44495e = bfVar;
        this.f44496f = aVar2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f44498h = Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final List mo21706f(C14749d dVar) {
        C14299eb ebVar;
        ArrayList arrayList = new ArrayList();
        for (String str : C58869cf.m90936b(new C58903m(',')).mo56155i(this.f44494d.mo79758x(C90051dc.f248905cg))) {
            try {
                ApplicationInfo applicationInfo = this.f44493c.getApplicationInfo(str, 0);
                C14264cu cuVar = (C14264cu) C14265cv.f43149f.createBuilder();
                cuVar.copyOnWrite();
                C14265cv cvVar = (C14265cv) cuVar.instance;
                str.getClass();
                cvVar.f43151a |= 1;
                cvVar.f43152b = str;
                String obj = this.f44493c.getApplicationLabel(applicationInfo).toString();
                cuVar.copyOnWrite();
                obj.getClass();
                ((C14265cv) cuVar.instance).f43153c = obj;
                cuVar.copyOnWrite();
                ((C14265cv) cuVar.instance).f43154d = C14268cy.m30586a(4);
                arrayList.add((C14265cv) cuVar.build());
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        C14300ec ecVar = (C14300ec) C14302ee.f43267d.createBuilder();
        ecVar.copyOnWrite();
        ((C14302ee) ecVar.instance).f43269a = C14301ed.m30598a(5);
        Optional a = dVar.mo21714a(C14984b.m31509g((C14302ee) ecVar.build()));
        if (a.isPresent()) {
            C14221be beVar = (C14221be) a.get();
            if (beVar.f43043a == 9) {
                ebVar = (C14299eb) beVar.f43044b;
            } else {
                ebVar = C14299eb.f43261d;
            }
            C62971cq<C14216b> cqVar = ebVar.f43264b;
            C58976aa aaVar = C58975e.f156826a;
            cqVar.size();
            for (C14216b bVar : cqVar) {
                C14264cu cuVar2 = (C14264cu) C14265cv.f43149f.createBuilder();
                String str2 = bVar.f43011c;
                cuVar2.copyOnWrite();
                C14265cv cvVar2 = (C14265cv) cuVar2.instance;
                str2.getClass();
                cvVar2.f43151a |= 1;
                cvVar2.f43152b = str2;
                String str3 = bVar.f43012d;
                cuVar2.copyOnWrite();
                str3.getClass();
                ((C14265cv) cuVar2.instance).f43155e = str3;
                String str4 = bVar.f43013e;
                cuVar2.copyOnWrite();
                str4.getClass();
                ((C14265cv) cuVar2.instance).f43153c = str4;
                cuVar2.copyOnWrite();
                ((C14265cv) cuVar2.instance).f43154d = C14268cy.m30586a(3);
                arrayList.add((C14265cv) cuVar2.build());
            }
        }
        if (this.f44494d.mo79746e(C90051dc.f248825ag)) {
            C14217ba baVar = (C14217ba) C14219bc.f43036c.createBuilder();
            C14313ep epVar = C14313ep.f43299a;
            baVar.copyOnWrite();
            C14219bc bcVar = (C14219bc) baVar.instance;
            epVar.getClass();
            bcVar.f43039b = epVar;
            bcVar.f43038a = 19;
            dVar.mo21716c((C14219bc) baVar.build());
        }
        C14264cu cuVar3 = (C14264cu) C14265cv.f43149f.createBuilder();
        String string = this.f44492b.getResources().getString(R.string.settings_text);
        cuVar3.copyOnWrite();
        string.getClass();
        ((C14265cv) cuVar3.instance).f43153c = string;
        cuVar3.copyOnWrite();
        ((C14265cv) cuVar3.instance).f43154d = C14268cy.m30586a(5);
        arrayList.add((C14265cv) cuVar3.build());
        if (this.f44494d.mo79746e(C90051dc.f248835aq)) {
            C14264cu cuVar4 = (C14264cu) C14265cv.f43149f.createBuilder();
            String string2 = this.f44492b.getResources().getString(R.string.pay_for_gas_text);
            cuVar4.copyOnWrite();
            string2.getClass();
            ((C14265cv) cuVar4.instance).f43153c = string2;
            cuVar4.copyOnWrite();
            ((C14265cv) cuVar4.instance).f43154d = C14268cy.m30586a(7);
            arrayList.add((C14265cv) cuVar4.build());
        }
        return arrayList;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final boolean mo21623h(C14492lf lfVar, C14324f fVar, C14938e eVar, C14749d dVar) {
        C14393ho hoVar;
        int i;
        if (lfVar.f43800c == 7) {
            hoVar = (C14393ho) lfVar.f43801d;
        } else {
            hoVar = C14393ho.f43534d;
        }
        int i2 = hoVar.f43537b;
        if (i2 == 0) {
            i = 2;
        } else if (i2 != 2) {
            switch (i2) {
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 4;
        }
        if (i == 0) {
            i = 1;
        }
        int i3 = i - 2;
        if (i3 == -1 || i3 == 0) {
            return false;
        }
        if (i3 != 2) {
            switch (i3) {
                case 4:
                    if (!C14160ab.m30482c(this.f44492b)) {
                        this.f44498h = Optional.m71637of(C14496lj.NOTIFICATION_PERMISSIONS_TASK);
                        break;
                    } else {
                        eVar.mo21860b(11);
                        return false;
                    }
                case 5:
                    this.f44498h = Optional.empty();
                    return true;
                case 6:
                    this.f44498h = Optional.empty();
                    C36619a.m65147c(this.f44492b);
                    Intent b = C36619a.m65146b(this.f44492b);
                    if (b == null) {
                        C59104x d = f44491a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "Morris.ExpLaunchCtrl");
                        ((C59052c) ((C59052c) d).mo56372aa(45355)).mo56386p("Gsa Notification Util provided null intent.");
                        b = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
                        b.setFlags(268435456);
                    }
                    this.f44492b.startActivity(b);
                    break;
                case 7:
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setClassName(this.f44492b, "com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity");
                    intent.putExtra("INTENT_TRIGGERING_SOURCE_KEY", C51474ja.LAUNCHER_SHORTCUT.f134124v);
                    ShortcutInfo build = new ShortcutInfo.Builder(this.f44492b, "launch-driving-screen").setShortLabel(this.f44492b.getString(R.string.morris_driving_screen_short_name)).setLongLabel(this.f44492b.getString(R.string.morris_driving_screen_product_name)).setIcon(Icon.createWithResource(this.f44492b, R.drawable.driving_screen_app_icon)).setIntent(intent).build();
                    ShortcutManager shortcutManager = this.f44497g;
                    shortcutManager.getClass();
                    Intent createShortcutResultIntent = shortcutManager.createShortcutResultIntent(build);
                    createShortcutResultIntent.setAction("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_CREATE_DRIVING_SCREEN_SHORTCUT");
                    PendingIntent broadcast = PendingIntent.getBroadcast(this.f44492b, 0, createShortcutResultIntent, 1140850688);
                    ShortcutManager shortcutManager2 = this.f44497g;
                    shortcutManager2.getClass();
                    shortcutManager2.requestPinShortcut(build, broadcast.getIntentSender());
                    return false;
                case 8:
                    this.f44502l = true;
                    return true;
                case 9:
                    return true;
                default:
                    return false;
            }
            return true;
        }
        String str = hoVar.f43538c;
        if (str.equals(fVar.f43334c)) {
            eVar.mo21860b(7);
            return false;
        } else if (C13009a.f40419b.contains(str)) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("google.maps:?act=51"));
            intent2.setPackage(str);
            C46459k.m82829b(this.f44496f.mo20101f(intent2), "Failed to start activity for Gmm destination search page", new Object[0]);
            return false;
        } else {
            Context context = this.f44492b;
            Intent launchIntentForPackage = this.f44493c.getLaunchIntentForPackage(str);
            launchIntentForPackage.getClass();
            C47810es.m84979s(context, launchIntentForPackage);
            return false;
        }
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
        C0027c a = C0027c.m9a(fVar.f43332a);
        if (a == null) {
            a = C0027c.UNRECOGNIZED;
        }
        if (a != C0027c.MICRO) {
            dbVar.mo21541a(C14242bz.EXPERIENCE_LAUNCHER_ICON);
        }
        if (this.f44498h.isPresent()) {
            if (aVar.mo21707a()) {
                this.f44498h = Optional.empty();
            } else {
                dbVar.mo21542b((C14496lj) this.f44498h.get());
            }
        }
        int c = C0025a.m8c(fVar.f43333b);
        if (c == 0) {
            c = 1;
        }
        int i = c - 2;
        if (i == 5) {
            this.f44499i = this.f44503m.mo26870b();
        } else if (i == 6) {
            this.f44500j = this.f44503m.mo26870b();
        } else if (i == 7) {
            this.f44501k = this.f44503m.mo26870b();
        }
    }

    /* renamed from: j */
    public final void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
        if (this.f44498h.isPresent() && ((C14496lj) this.f44498h.get()).equals(ljVar)) {
            this.f44498h = Optional.empty();
        }
    }
}
