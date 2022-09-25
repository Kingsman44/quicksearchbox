package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.ad;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p6995aq.C89270m;
import com.google.android.apps.gsa.shared.p6995aq.C89278u;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bi */
/* compiled from: PG */
public final class C117241bi {

    /* renamed from: b */
    private static final C59071e f325474b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.bi");

    /* renamed from: a */
    public final C86338r f325475a;

    /* renamed from: c */
    private final C86124t f325476c;

    /* renamed from: d */
    private final C68214a f325477d;

    /* renamed from: e */
    private final C89257aa f325478e;

    /* renamed from: f */
    private final AppWidgetManager f325479f;

    public C117241bi(C86124t tVar, C86338r rVar, C68214a aVar, C89257aa aaVar, AppWidgetManager appWidgetManager) {
        this.f325476c = tVar;
        this.f325475a = rVar;
        this.f325477d = aVar;
        this.f325478e = aaVar;
        this.f325479f = appWidgetManager;
    }

    /* renamed from: d */
    static final boolean m194843d(String str, boolean z) {
        if (!C117240bh.f325472a.contains(str)) {
            return false;
        }
        if (!z || C117240bh.f325473b.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final C89283z m194844e(C89283z zVar) {
        boolean z = true;
        boolean a = ad.a(this.f325476c, (C58833ax) this.f325477d.mo27525b(), true);
        C89270m mVar = (C89270m) zVar.toBuilder();
        if (!this.f325476c.mo79746e(C90110fh.f250616aN) || !a) {
            z = false;
        }
        mVar.copyOnWrite();
        C89283z zVar2 = (C89283z) mVar.instance;
        zVar2.f242075a |= 128;
        zVar2.f242079e = z;
        String x = this.f325476c.mo79758x(C89985ax.f246693aa);
        if (!x.isEmpty()) {
            try {
                C89278u uVar = (C89278u) C62942bv.parseFrom((C62942bv) C89278u.f242057g, Base64.decode(x, 0));
                if (uVar != null) {
                    mVar.copyOnWrite();
                    C89283z zVar3 = (C89283z) mVar.instance;
                    zVar3.f242082h = uVar;
                    zVar3.f242075a |= 8192;
                }
            } catch (C62974ct e) {
                C59104x c = f325474b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SWStyleManager");
                ((C59052c) ((C59052c) c).mo56372aa(32754)).mo56389s("Error parsing CustomRightSection: %s", e.getMessage());
            }
        }
        mVar.copyOnWrite();
        C89283z zVar4 = (C89283z) mVar.instance;
        zVar4.f242075a &= -32769;
        zVar4.f242084j = C89283z.f242073n.f242084j;
        String x2 = !this.f325476c.mo79758x(C89985ax.f246692aS).isEmpty() ? this.f325476c.mo79758x(C89985ax.f246692aS) : BuildConfig.FLAVOR;
        if (x2.isEmpty()) {
            mVar.copyOnWrite();
            C89283z zVar5 = (C89283z) mVar.instance;
            zVar5.f242075a &= -65537;
            zVar5.f242085k = C89283z.f242073n.f242085k;
        } else {
            mVar.copyOnWrite();
            C89283z zVar6 = (C89283z) mVar.instance;
            x2.getClass();
            zVar6.f242075a |= 65536;
            zVar6.f242085k = x2;
        }
        return (C89283z) mVar.build();
    }

    /* renamed from: a */
    public final C89283z mo103214a() {
        C89283z zVar = null;
        String string = this.f325475a.getString("search_widget_style_proto", (String) null);
        if (string != null) {
            try {
                zVar = (C89283z) C62942bv.parseFrom((C62942bv) C89283z.f242073n, Base64.decode(string, 8));
            } catch (IllegalArgumentException e) {
                C59104x c = f325474b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SWStyleManager");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(32752)).mo56389s("Invalid Base64: %s", string);
            } catch (C62974ct e2) {
                C59104x c2 = f325474b.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "SWStyleManager");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(32753)).mo56389s("Unable to decode WidgetStyle proto: %s", string);
            }
        }
        if (zVar == null || !zVar.f242081g) {
            return mo103215b();
        }
        return m194844e(zVar);
    }

    /* renamed from: b */
    public final C89283z mo103215b() {
        String str;
        int i;
        int[] t = this.f325478e.mo83227t();
        int length = t.length;
        int i2 = 0;
        while (true) {
            str = "default";
            if (i2 >= length) {
                break;
            }
            String string = this.f325479f.getAppWidgetOptions(t[i2]).getString("requested-widget-style", BuildConfig.FLAVOR);
            String x = this.f325476c.mo79758x(C89985ax.f246694ab);
            if (m194843d(x, false)) {
                string = x;
            } else if (!m194843d(string, true)) {
                string = str;
            }
            if (!str.equals(string)) {
                str = string;
                break;
            }
            i2++;
        }
        int i3 = 2;
        if ("cqsb".equals(str)) {
            i = 3;
        } else {
            i = "br8".equals(str) ? 2 : 1;
        }
        C89270m mVar = (C89270m) C89283z.f242073n.createBuilder();
        if (!this.f325476c.mo79746e(C89985ax.f246695ac)) {
            i3 = "cqsb".equals(str) ? 3 : 1;
        }
        mVar.copyOnWrite();
        C89283z zVar = (C89283z) mVar.instance;
        zVar.f242078d = i3 - 1;
        zVar.f242075a |= 8;
        mVar.copyOnWrite();
        C89283z zVar2 = (C89283z) mVar.instance;
        zVar2.f242075a |= 1;
        zVar2.f242076b = 230;
        mVar.copyOnWrite();
        C89283z zVar3 = (C89283z) mVar.instance;
        zVar3.f242083i = 0;
        zVar3.f242075a |= 16384;
        mVar.copyOnWrite();
        C89283z zVar4 = (C89283z) mVar.instance;
        zVar4.f242075a |= C89885b.HTTP_VALUE;
        zVar4.f242087m = -16717825;
        mVar.copyOnWrite();
        C89283z zVar5 = (C89283z) mVar.instance;
        zVar5.f242077c = i - 1;
        zVar5.f242075a |= 4;
        mVar.copyOnWrite();
        C89283z zVar6 = (C89283z) mVar.instance;
        zVar6.f242075a |= 4096;
        zVar6.f242081g = false;
        mVar.copyOnWrite();
        C89283z zVar7 = (C89283z) mVar.instance;
        zVar7.f242075a |= 512;
        zVar7.f242080f = true;
        return m194844e((C89283z) mVar.build());
    }

    /* renamed from: c */
    public final void mo103216c() {
        C86337q b = this.f325475a.mo80076b();
        b.mo80075j("search_widget_style_proto");
        b.apply();
        C86337q b2 = this.f325475a.mo80076b();
        b2.mo80067b("search_widget_customization_created", false);
        b2.apply();
    }
}
