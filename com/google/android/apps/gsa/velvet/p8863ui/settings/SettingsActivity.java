package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.p6817a.C86283a;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.settingsui.C88992g;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7107x.C90299a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.sidekick.shared.util.C91986e;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118638a;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118641d;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118642e;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118643f;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118644g;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118647j;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137589b;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139140d;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139141e;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity */
/* compiled from: PG */
public class SettingsActivity extends C118680s {

    /* renamed from: a */
    public static final C59071e f330929a = C59071e.m91332i("com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity");

    /* renamed from: b */
    public static final Uri f330930b = Uri.parse("content://com.google.android.launcher.settings/settings");

    /* renamed from: B */
    private final C28292j f330931B = new C28292j(56879);

    /* renamed from: C */
    private final C28292j f330932C = new C28292j(85090);

    /* renamed from: D */
    private PreferenceActivity.Header f330933D;

    /* renamed from: c */
    C118647j f330934c;

    /* renamed from: d */
    public C118678q f330935d;

    /* renamed from: e */
    public Context f330936e;

    /* renamed from: f */
    public C68214a f330937f;

    /* renamed from: g */
    public C68214a f330938g;

    /* renamed from: h */
    public C86054o f330939h;

    /* renamed from: i */
    public C85651bb f330940i;

    /* renamed from: j */
    public C90932cb f330941j;

    /* renamed from: k */
    public C90931ca f330942k;

    /* renamed from: l */
    public C68214a f330943l;

    /* renamed from: m */
    public Map f330944m;

    /* renamed from: n */
    public C90465g f330945n;

    /* renamed from: o */
    public C86124t f330946o;

    /* renamed from: p */
    public C84474e f330947p;

    /* renamed from: q */
    public C28310af f330948q;

    /* renamed from: r */
    public C22871g f330949r;

    /* renamed from: s */
    public C22871g f330950s;

    /* renamed from: t */
    public C118686y f330951t;

    /* renamed from: u */
    public C118636ab f330952u;

    /* renamed from: v */
    public C68214a f330953v;

    /* renamed from: w */
    protected Locale f330954w;

    /* renamed from: x */
    protected List f330955x;

    /* renamed from: com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity$a */
    /* compiled from: PG */
    public interface C118623a {
        /* renamed from: rc */
        void mo103810rc(C118679r rVar);
    }

    /* renamed from: b */
    public static C137589b m196927b(long j) {
        if (j == 2131432235) {
            return C137589b.SAFE_SEARCH;
        }
        if (j == 2131432973) {
            return C137589b.LOCATION_CONSENT;
        }
        if (j == 2131434475) {
            return C137589b.PERSONAL_RESULTS;
        }
        return null;
    }

    /* renamed from: c */
    private final void m196928c(Intent intent, String str, int i) {
        intent.putExtra("filePath", str);
        intent.putExtra("preferenceName", this.f330936e.getString(i));
    }

    /* renamed from: d */
    private static void m196929d(C28292j jVar) {
        C89949q.m146521e(C28285c.m52883j(jVar, 5, (Integer) null), false);
    }

    /* access modifiers changed from: protected */
    public final boolean isValidFragment(String str) {
        return true;
    }

    public final void onBuildHeaders(List list) {
        this.f330955x = list;
        C118651e eVar = new C118651e(this);
        TreeMap treeMap = new TreeMap(this.f330944m);
        C118638a aVar = (C118638a) C118647j.f330999e.createBuilder();
        for (C88992g gVar : treeMap.values()) {
            List<PreferenceActivity.Header> d = gVar.mo17758d(eVar);
            C58495hd a = gVar.mo17755a();
            C118641d dVar = (C118641d) C118642e.f330984d.createBuilder();
            C118643f fVar = (C118643f) C118644g.f330989d.createBuilder();
            for (PreferenceActivity.Header header : d) {
                if (header.fragment != null) {
                    String string = this.f330936e.getString(header.titleRes);
                    dVar.copyOnWrite();
                    C118642e eVar2 = (C118642e) dVar.instance;
                    string.getClass();
                    eVar2.f330986a |= 1;
                    eVar2.f330987b = string;
                    String str = header.fragment;
                    dVar.copyOnWrite();
                    C118642e eVar3 = (C118642e) dVar.instance;
                    str.getClass();
                    eVar3.f330986a |= 2;
                    eVar3.f330988c = str;
                }
            }
            C58800sl lA = a.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                int intValue = ((Integer) entry.getKey()).intValue();
                fVar.copyOnWrite();
                C118644g gVar2 = (C118644g) fVar.instance;
                gVar2.f330991a |= 1;
                gVar2.f330992b = intValue;
                String str2 = (String) entry.getValue();
                fVar.copyOnWrite();
                C118644g gVar3 = (C118644g) fVar.instance;
                str2.getClass();
                gVar3.f330991a |= 2;
                gVar3.f330993c = str2;
            }
            C118642e eVar4 = (C118642e) dVar.build();
            aVar.copyOnWrite();
            C118647j jVar = (C118647j) aVar.instance;
            eVar4.getClass();
            C62971cq cqVar = jVar.f331001a;
            if (!cqVar.mo58948c()) {
                jVar.f331001a = C62942bv.mutableCopy(cqVar);
            }
            jVar.f331001a.add(eVar4);
            C118644g gVar4 = (C118644g) fVar.build();
            aVar.copyOnWrite();
            C118647j jVar2 = (C118647j) aVar.instance;
            gVar4.getClass();
            C62971cq cqVar2 = jVar2.f331002b;
            if (!cqVar2.mo58948c()) {
                jVar2.f331002b = C62942bv.mutableCopy(cqVar2);
            }
            jVar2.f331002b.add(gVar4);
            List c = gVar.mo17757c();
            aVar.copyOnWrite();
            C118647j jVar3 = (C118647j) aVar.instance;
            jVar3.mo103833a();
            C62947c.addAll((Iterable) c, (List) jVar3.f331003c);
            list.addAll(d);
        }
        this.f330934c = (C118647j) aVar.build();
        for (C88992g b : treeMap.values()) {
            C60870cx b2 = b.mo17756b();
            if (b2 != null) {
                this.f330949r.mo28211k(b2, "Update visibility for dynamic preferences", new C118652f(this));
            }
        }
        ((C84413ad) this.f330937f.mo27525b()).mo77971h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreferenceActivity.Header header2 = (PreferenceActivity.Header) it.next();
            if (header2.id != 2131432706 || !getResources().getBoolean(R.bool.allow_rotation)) {
                C137589b b3 = m196927b(header2.id);
                if (b3 != null) {
                    this.f330950s.mo28211k(this.f330951t.mo103868b(b3), "Update preference header intent", new C118657k(this, header2, b3));
                }
                if (header2.fragment != null && this.f330933D == null && list.contains(header2)) {
                    this.f330933D = header2;
                }
                if (header2.fragmentArguments != null && header2.fragmentArguments.containsKey("LAUNCHER_PREF_KEY")) {
                    header2.extras = null;
                    this.f330941j.mo85147l(this.f330942k.mo85138c(new C118653g(this, header2)), new C118654h(this, header2));
                }
            } else {
                it.remove();
            }
        }
        C118678q qVar = this.f330935d;
        if (qVar != null) {
            qVar.clear();
            this.f330935d.addAll(list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x02cb, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x02cc, code lost:
        if (r6 == null) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x02ce, code lost:
        r4 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139141e) com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g.f378433c.createBuilder();
        r7 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139144h) com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i.f378437d.createBuilder();
        r6 = r6.name();
        r7.copyOnWrite();
        r8 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i) r7.instance;
        r6.getClass();
        r8.f378439a |= 1;
        r8.f378440b = r6;
        r7.copyOnWrite();
        r6 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i) r7.instance;
        r6.f378439a |= 2;
        r6.f378441c = r0;
        r4.copyOnWrite();
        r0 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g) r4.instance;
        r6 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i) r7.build();
        r6.getClass();
        r0.f378436b = r6;
        r0.f378435a = 5;
        r0 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g) r4.build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x031d, code lost:
        r0 = com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g.f378433c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0425  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.e.f r0 = com.google.android.apps.gsa.e.f.aW
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r0)
            com.google.android.apps.gsa.velvet.ui.settings.r r0 = new com.google.android.apps.gsa.velvet.ui.settings.r
            r0.<init>(r10)
            com.google.android.apps.gsa.binaries.satin.app.amf r1 = r0.f331070b
            if (r1 != 0) goto L_0x001b
            android.content.Context r1 = r0.f331069a
            java.lang.Class<com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity$a> r2 = com.google.android.apps.gsa.velvet.p8863ui.settings.SettingsActivity.C118623a.class
            java.lang.Object r1 = com.google.apps.tiktok.inject.C47266f.m84076a(r1, r2)
            com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity$a r1 = (com.google.android.apps.gsa.velvet.p8863ui.settings.SettingsActivity.C118623a) r1
            r1.mo103810rc(r0)
        L_0x001b:
            com.google.android.apps.gsa.binaries.satin.app.amf r0 = r0.f331070b
            com.google.android.apps.gsa.binaries.satin.app.amh r1 = new com.google.android.apps.gsa.binaries.satin.app.amh
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r0.f197962a
            r1.<init>(r0)
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202772dQ
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.speech.e.b.j r0 = (com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j) r0
            r10.f331076z = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f203497r
            dagger.a r0 = dagger.p5294a.C68219e.m98518a(r0)
            r10.f331071A = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            g.a.a r0 = r0.bq
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.shared.util.v.g r0 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            g.a.a r0 = r0.g
            java.lang.Object r0 = r0.mo17428b()
            android.content.Context r0 = (android.content.Context) r0
            r10.f330936e = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202689bn
            dagger.a r0 = dagger.p5294a.C68219e.m98518a(r0)
            r10.f330937f = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.ars r0 = r0.b
            g.a.a r0 = r0.f199939aF
            dagger.a r0 = dagger.p5294a.C68219e.m98518a(r0)
            r10.f330938g = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202324I
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r0
            r10.f330939h = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202740cl
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.search.core.bb r0 = (com.google.android.apps.gsa.search.core.C85651bb) r0
            r10.f330940i = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202675bZ
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.search.core.preferences.j r0 = (com.google.android.apps.gsa.search.core.preferences.C86319j) r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f203444q
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.shared.util.c.cb r0 = (com.google.android.apps.gsa.shared.util.p7159c.C90932cb) r0
            r10.f330941j = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f203444q
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.shared.util.c.ca r0 = (com.google.android.apps.gsa.shared.util.p7159c.C90931ca) r0
            r10.f330942k = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202803dv
            dagger.a r0 = dagger.p5294a.C68219e.m98518a(r0)
            r10.f330943l = r0
            r0 = 12
            com.google.common.b.gz r0 = com.google.common.p4522b.C58495hd.m89896j(r0)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.GOOGLE_ASSISTANT
            g.a.a r3 = r1.f197964b
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.NOTIFICATIONS
            g.a.a r3 = r1.f197965c
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.VOICE_HUB
            g.a.a r3 = r1.f197966d
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.GENERAL_HUB
            g.a.a r3 = r1.f197967e
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.LANGUAGE_AND_REGION
            g.a.a r3 = r1.f197968f
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.ABOUT_HUB
            g.a.a r3 = r1.f197969g
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.SEARCH_WIDGET
            g.a.a r3 = r1.f197970h
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.INTERESTS
            g.a.a r3 = r1.f197971i
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.HIDE_EXPLICIT_RESULTS
            g.a.a r3 = r1.f197972j
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.LOCATION
            g.a.a r3 = r1.f197973k
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.PERSONAL_RESULTS
            g.a.a r3 = r1.f197974l
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            com.google.android.apps.gsa.settingsui.f r2 = com.google.android.apps.gsa.settingsui.C88991f.PRIVACY_AND_SECURITY
            g.a.a r3 = r1.f197975m
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.settingsui.g r3 = (com.google.android.apps.gsa.settingsui.C88992g) r3
            r0.mo55429h(r2, r3)
            r2 = 1
            com.google.common.b.hd r0 = r0.mo55427f(r2)
            r10.f330944m = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            g.a.a r0 = r0.r
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.shared.s.a.a r0 = (com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a) r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            g.a.a r0 = r0.t
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.shared.s.b.a r0 = (com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a) r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202977hJ
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.shared.r.g r0 = (com.google.android.apps.gsa.shared.p7129r.C90465g) r0
            r10.f330945n = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202006C
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            r10.f330946o = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202657bH
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.search.core.ag.a.e r0 = (com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e) r0
            r10.f330947p = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202878fQ
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.libraries.logging.ve.af r0 = (com.google.android.libraries.logging.p2185ve.C28310af) r0
            r10.f330948q = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            g.a.a r0 = r0.aW
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.libraries.gsa.k.g r0 = (com.google.android.libraries.gsa.p1876k.C22871g) r0
            r10.f330949r = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            g.a.a r0 = r0.aT
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.libraries.gsa.k.g r0 = (com.google.android.libraries.gsa.p1876k.C22871g) r0
            r10.f330950s = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.ars r0 = r0.b
            g.a.a r0 = r0.f199938aE
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.apps.gsa.velvet.ui.settings.y r0 = (com.google.android.apps.gsa.velvet.p8863ui.settings.C118686y) r0
            r10.f330951t = r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            g.a.a r0 = r0.n
            java.lang.Object r0 = r0.mo17428b()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.android.apps.gsa.binaries.satin.app.aqy r3 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r3 = r3.a
            g.a.a r3 = r3.f202653bD
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r3 = (com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c) r3
            com.google.android.apps.search.googleapp.settingsui.a.j r4 = new com.google.android.apps.search.googleapp.settingsui.a.j
            com.google.android.apps.gsa.binaries.satin.app.aqy r5 = r1.f197963a
            g.a.a r5 = r5.g
            java.lang.Object r5 = r5.mo17428b()
            android.content.Context r5 = (android.content.Context) r5
            com.google.android.apps.gsa.binaries.satin.app.aqy r6 = r1.f197963a
            g.a.a r6 = r6.gG
            java.lang.Object r6 = r6.mo17428b()
            com.google.protobuf.ba r6 = (com.google.protobuf.C62921ba) r6
            r4.<init>(r5, r6)
            com.google.android.apps.gsa.velvet.ui.settings.ab r5 = new com.google.android.apps.gsa.velvet.ui.settings.ab
            r5.<init>(r0, r3, r4)
            r10.f330952u = r5
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r1.f197963a
            com.google.android.apps.gsa.binaries.satin.app.asp r0 = r0.a
            g.a.a r0 = r0.f202972hE
            dagger.a r0 = dagger.p5294a.C68219e.m98518a(r0)
            r10.f330953v = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r1 = "hide_caption"
            r3 = 0
            boolean r0 = r0.getBooleanExtra(r1, r3)
            if (r0 == 0) goto L_0x0229
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148872d(r10)
        L_0x0229:
            r0 = 2132150745(0x7f1609d9, float:1.9943533E38)
            r10.setTheme(r0)
            com.google.android.apps.gsa.search.core.ag.a.e r0 = r10.f330947p
            boolean r0 = r0.mo78096aj()
            java.lang.String r1 = ":android:show_fragment"
            if (r0 != 0) goto L_0x023b
            goto L_0x0338
        L_0x023b:
            android.content.Intent r0 = r10.getIntent()
            java.util.Set r4 = r0.getCategories()
            r5 = 5
            if (r4 == 0) goto L_0x02a4
            java.util.Set r4 = r0.getCategories()
            java.lang.String r6 = "android.intent.category.NOTIFICATION_PREFERENCES"
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L_0x02a4
            com.google.android.apps.search.googleapp.settingsui.a.g r0 = com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g.f378433c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.settingsui.a.e r0 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139141e) r0
            com.google.android.apps.search.googleapp.settingsui.a.i r4 = com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i.f378437d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.googleapp.settingsui.a.h r4 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139144h) r4
            com.google.android.apps.search.googleapp.x.i r6 = com.google.android.apps.search.googleapp.p10536x.C139873i.NOTIFICATIONS_PAGE_LINK
            java.lang.String r6 = r6.name()
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.apps.search.googleapp.settingsui.a.i r7 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i) r7
            r6.getClass()
            int r8 = r7.f378439a
            r8 = r8 | r2
            r7.f378439a = r8
            r7.f378440b = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.apps.search.googleapp.settingsui.a.i r6 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i) r6
            int r7 = r6.f378439a
            r7 = r7 | 2
            r6.f378439a = r7
            r6.f378441c = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.search.googleapp.settingsui.a.g r6 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g) r6
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.apps.search.googleapp.settingsui.a.i r4 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i) r4
            r4.getClass()
            r6.f378436b = r4
            r6.f378435a = r5
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.search.googleapp.settingsui.a.g r0 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g) r0
            goto L_0x031f
        L_0x02a4:
            boolean r4 = r0.hasExtra(r1)
            r6 = 0
            if (r4 == 0) goto L_0x02ae
        L_0x02ab:
            r0 = r6
            goto L_0x031f
        L_0x02ae:
            com.google.android.apps.gsa.shared.util.ad r4 = com.google.android.apps.gsa.shared.util.C90720ad.NONE
            com.google.android.apps.gsa.shared.util.ad r0 = com.google.android.apps.gsa.velvet.p8863ui.settings.C118681t.m197022a(r0)
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x02cb;
                case 1: goto L_0x02ab;
                case 2: goto L_0x02c9;
                case 3: goto L_0x02ab;
                case 4: goto L_0x02c6;
                case 5: goto L_0x02ab;
                case 6: goto L_0x02c3;
                case 7: goto L_0x02bf;
                case 8: goto L_0x02bc;
                default: goto L_0x02bb;
            }
        L_0x02bb:
            goto L_0x02cb
        L_0x02bc:
            com.google.android.apps.search.googleapp.x.i r6 = com.google.android.apps.search.googleapp.p10536x.C139873i.SWITCH_TO_GOOGLE
            goto L_0x02cb
        L_0x02bf:
            com.google.android.apps.search.googleapp.x.i r6 = com.google.android.apps.search.googleapp.p10536x.C139873i.BROWSER_PAGE_LINK
            r0 = 1
            goto L_0x02cc
        L_0x02c3:
            com.google.android.apps.search.googleapp.x.i r6 = com.google.android.apps.search.googleapp.p10536x.C139873i.DISCOVER_VIDEO_AUTOPLAY
            goto L_0x02cb
        L_0x02c6:
            com.google.android.apps.search.googleapp.x.i r6 = com.google.android.apps.search.googleapp.p10536x.C139873i.DISCOVER_ENABLED
            goto L_0x02cb
        L_0x02c9:
            com.google.android.apps.search.googleapp.x.i r6 = com.google.android.apps.search.googleapp.p10536x.C139873i.RECENT_PAGES
        L_0x02cb:
            r0 = 0
        L_0x02cc:
            if (r6 == 0) goto L_0x031d
            com.google.android.apps.search.googleapp.settingsui.a.g r4 = com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g.f378433c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.googleapp.settingsui.a.e r4 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139141e) r4
            com.google.android.apps.search.googleapp.settingsui.a.i r7 = com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i.f378437d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.search.googleapp.settingsui.a.h r7 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139144h) r7
            java.lang.String r6 = r6.name()
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.search.googleapp.settingsui.a.i r8 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i) r8
            r6.getClass()
            int r9 = r8.f378439a
            r9 = r9 | r2
            r8.f378439a = r9
            r8.f378440b = r6
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.android.apps.search.googleapp.settingsui.a.i r6 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i) r6
            int r8 = r6.f378439a
            r8 = r8 | 2
            r6.f378439a = r8
            r6.f378441c = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.apps.search.googleapp.settingsui.a.g r0 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g) r0
            com.google.protobuf.bv r6 = r7.build()
            com.google.android.apps.search.googleapp.settingsui.a.i r6 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i) r6
            r6.getClass()
            r0.f378436b = r6
            r0.f378435a = r5
            com.google.protobuf.bv r0 = r4.build()
            com.google.android.apps.search.googleapp.settingsui.a.g r0 = (com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g) r0
            goto L_0x031f
        L_0x031d:
            com.google.android.apps.search.googleapp.settingsui.a.g r0 = com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g.f378433c
        L_0x031f:
            if (r0 == 0) goto L_0x0338
            com.google.android.libraries.gsa.k.g r1 = r10.f330950s
            com.google.android.apps.gsa.velvet.ui.settings.ab r4 = r10.f330952u
            com.google.common.util.concurrent.cx r0 = r4.mo103830a(r0)
            com.google.android.apps.gsa.velvet.ui.settings.j r4 = new com.google.android.apps.gsa.velvet.ui.settings.j
            r4.<init>(r10)
            java.lang.String r5 = "Trampoline"
            r1.mo28211k(r0, r5, r4)
            r10.finish()
            goto L_0x03d8
        L_0x0338:
            android.content.Intent r0 = r10.getIntent()
            com.google.android.apps.gsa.shared.util.ad r4 = com.google.android.apps.gsa.shared.util.C90720ad.NONE
            com.google.android.apps.gsa.shared.util.ad r4 = com.google.android.apps.gsa.velvet.p8863ui.settings.C118681t.m197022a(r0)
            int r4 = r4.ordinal()
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.preferences.GeneralHubFragment"
            switch(r4) {
                case 0: goto L_0x03d8;
                case 1: goto L_0x03d3;
                case 2: goto L_0x03cc;
                case 3: goto L_0x03c6;
                case 4: goto L_0x03bf;
                case 5: goto L_0x0372;
                case 6: goto L_0x036b;
                case 7: goto L_0x035d;
                case 8: goto L_0x0353;
                default: goto L_0x034b;
            }
        L_0x034b:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = "Unknown enum for SettingsActivity"
            r11.<init>(r0)
            throw r11
        L_0x0353:
            java.lang.String r1 = "com.google.android.apps.gsa.search.core.preferences.SearchWidgetSettingsFragment"
            r4 = 2132091968(0x7f152440, float:1.982432E38)
            r10.m196928c(r0, r1, r4)
            goto L_0x03d8
        L_0x035d:
            java.lang.String r4 = "com.google.android.apps.gsa.search.core.preferences.GoogleAppBrowserFragment"
            r0.putExtra(r1, r4)
            java.lang.String r1 = ":android:show_fragment_title"
            r4 = 2132087136(0x7f151160, float:1.9814519E38)
            r0.putExtra(r1, r4)
            goto L_0x03d8
        L_0x036b:
            r1 = 2132085292(0x7f150a2c, float:1.9810779E38)
            r10.m196928c(r0, r5, r1)
            goto L_0x03d8
        L_0x0372:
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f330946o
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250678bh
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x03b6
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f330946o
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250676bf
            boolean r1 = r1.mo79746e(r4)
            if (r1 != 0) goto L_0x03d8
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f330946o
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250677bg
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x03b6
            dagger.a r1 = r10.f330953v
            java.lang.Object r1 = r1.mo27525b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x03b6
            dagger.a r1 = r10.f330953v
            java.lang.Object r1 = r1.mo27525b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.nga.api.bx r1 = (com.google.android.apps.gsa.nga.api.C74720bx) r1
            com.google.android.apps.gsa.nga.api.NgaState r1 = r1.mo71089f()
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x03d8
        L_0x03b6:
            java.lang.String r1 = "com.google.android.apps.gsa.speech.settingsui.VoiceSettingsFragment"
            r4 = 2132087934(0x7f15147e, float:1.9816137E38)
            r10.m196928c(r0, r1, r4)
            goto L_0x03d8
        L_0x03bf:
            r1 = 2132093112(0x7f1528b8, float:1.982664E38)
            r10.m196928c(r0, r5, r1)
            goto L_0x03d8
        L_0x03c6:
            java.lang.String r4 = "com.google.android.apps.gsa.nowoverlayservice.settingsui.PixelSearchQsbSettingsFragment"
            r0.putExtra(r1, r4)
            goto L_0x03d8
        L_0x03cc:
            r1 = 2132093429(0x7f1529f5, float:1.9827282E38)
            r10.m196928c(r0, r5, r1)
            goto L_0x03d8
        L_0x03d3:
            java.lang.String r4 = "com.google.android.apps.gsa.search.core.preferences.HomeScreenFragment"
            r0.putExtra(r1, r4)
        L_0x03d8:
            super.onCreate(r11)
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r11 < r0) goto L_0x03ed
            android.view.Window r11 = r10.getWindow()
            android.view.WindowManager$LayoutParams r11 = r11.getAttributes()
            r0 = 3
            r11.layoutInDisplayCutoutMode = r0
            goto L_0x03f7
        L_0x03ed:
            android.view.Window r11 = r10.getWindow()
            android.view.WindowManager$LayoutParams r11 = r11.getAttributes()
            r11.layoutInDisplayCutoutMode = r2
        L_0x03f7:
            dagger.a r11 = r10.f331071A
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.core.i.w r11 = (com.google.android.apps.gsa.search.core.p6805i.C86127w) r11
            com.google.android.apps.gsa.search.core.i.aa r11 = r11.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r11 = r11.mo79722a()
            java.lang.String r0 = "always_on_hotword_suppressed"
            boolean r11 = r11.getBoolean(r0, r3)
            if (r11 == 0) goto L_0x0418
            dagger.a r11 = r10.f330943l
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.speech.microdetection.a r11 = (com.google.android.apps.gsa.speech.microdetection.C92486a) r11
            r11.mo87235i()
        L_0x0418:
            com.google.android.apps.gsa.search.core.google.gaia.o r11 = r10.f330939h
            android.accounts.Account r11 = r11.mo79668a()
            if (r11 != 0) goto L_0x0425
            com.google.android.libraries.logging.ve.g r11 = com.google.android.libraries.logging.p2185ve.p2186a.C28297a.m52923c()
            goto L_0x042b
        L_0x0425:
            java.lang.String r11 = r11.name
            com.google.android.libraries.logging.ve.g r11 = com.google.android.libraries.logging.p2185ve.p2186a.C28297a.m52922b(r11)
        L_0x042b:
            com.google.android.libraries.logging.ve.af r0 = r10.f330948q
            com.google.android.libraries.logging.ve.ab r0 = r0.f76997b
            r1 = 119970(0x1d4a2, float:1.68114E-40)
            com.google.android.libraries.logging.ve.h r1 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r1)
            com.google.android.libraries.logging.ve.c r0 = r0.mo33800a(r1)
            r0.mo33859g(r11)
            r11 = 140168(0x22388, float:1.96417E-40)
            com.google.android.libraries.logging.ve.g r11 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53061c(r11)
            r0.mo33859g(r11)
            r0.mo33810c(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.velvet.p8863ui.settings.SettingsActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        mo103811a().mo1176d().inflate(R.menu.hub_settings_icon_menu, menu);
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            item.setShowAsAction(1);
            Drawable mutate = item.getIcon().mutate();
            C1929b.m5225f(mutate, C1878d.m5128a(this, R.color.agsa_color_on_surface_variant));
            item.setIcon(mutate);
        }
        super.onCreateOptionsMenu(menu);
        String str = (this.f330940i.mo79134G() || this.f330940i.mo79132E()) ? "now_settings" : "disabled_settings";
        this.f330945n.mo84210a(this).mo84208a(menu, str, this.f330939h.mo79668a(), C87562e.m142218a(this, str), this.f330940i.mo79134G() || this.f330940i.mo79132E(), true);
        return true;
    }

    public final PreferenceActivity.Header onGetInitialHeader() {
        return this.f330933D;
    }

    public final void onHeaderClick(PreferenceActivity.Header header, int i) {
        if (header.id == 2131435640) {
            m196929d(this.f330932C);
        }
        if (header.fragment != null || header.intent == null) {
            super.onHeaderClick(header, i);
        } else {
            this.f331075y.mo65089a(header.intent);
        }
    }

    public final boolean onIsMultiPane() {
        return getResources().getBoolean(R.bool.preferences_dual_pane);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.hub_settings_search_button_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        m196929d(this.f330931B);
        if (!this.f330947p.mo78096aj()) {
            startActivity(C90334c.m146886a(C90332a.DEFAULT.f252281i, C90299a.f252220a, C23245b.m43556a(this.f330934c)));
            return true;
        }
        C22871g gVar = this.f330950s;
        C118636ab abVar = this.f330952u;
        C139141e eVar = (C139141e) C139143g.f378433c.createBuilder();
        C139140d dVar = C139140d.f378431a;
        eVar.copyOnWrite();
        C139143g gVar2 = (C139143g) eVar.instance;
        dVar.getClass();
        gVar2.f378436b = dVar;
        gVar2.f378435a = 4;
        gVar.mo28211k(abVar.mo103830a((C139143g) eVar.build()), "Open TNG Settings Search", new C118655i(this));
        return true;
    }

    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            C28293k e = C28293k.m52908e(new C28292j(66478), new C28293k[0]);
            ArrayList arrayList = new ArrayList();
            this.f330931B.mo33795i(5);
            arrayList.add(C28293k.m52908e(this.f330931B, new C28293k[0]));
            if (((C86283a) this.f330938g.mo27525b()).mo79994a()) {
                this.f330932C.mo33795i(5);
                arrayList.add(C28293k.m52908e(this.f330932C, new C28293k[0]));
            }
            String str = null;
            C89949q.m146521e(C28285c.m52875b(C28293k.m52908e(((C28257a) e).f76908a, C28293k.m52906c((C28292j) null, arrayList)), 68470), false);
            Locale locale = Locale.getDefault();
            Locale locale2 = this.f330954w;
            if (locale2 == null || !locale2.equals(locale)) {
                this.f330954w = locale;
                invalidateHeaders();
            }
            if (intent.getCategories() != null && intent.getCategories().contains("android.intent.category.NOTIFICATION_PREFERENCES")) {
                startActivity(C91986e.m150962a(this));
                finish();
            }
            int intExtra = intent.getIntExtra(":android:show_fragment_title", 0);
            if (intExtra != 0) {
                try {
                    str = this.f330936e.getString(intExtra);
                } catch (Resources.NotFoundException e2) {
                    ((C59052c) ((C59052c) ((C59052c) f330929a.mo56226d()).mo56382g(e2)).mo56372aa(34081)).mo56386p("Undefined title for SettingsActivity");
                }
            }
            if (str != null) {
                setTitle(str);
            }
            String stringExtra = intent.getStringExtra("filePath");
            String stringExtra2 = intent.getStringExtra("preferenceName");
            if (stringExtra != null && stringExtra2 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("preferenceName", stringExtra2);
                if (this.f330955x != null) {
                    PreferenceActivity.Header header = new PreferenceActivity.Header();
                    header.fragment = stringExtra;
                    header.fragmentArguments = bundle;
                    super.onHeaderClick(header, 0);
                }
            }
        }
    }

    public final void setListAdapter(ListAdapter listAdapter) {
        if (listAdapter == null) {
            super.setListAdapter((ListAdapter) null);
            return;
        }
        int count = listAdapter.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            arrayList.add((PreferenceActivity.Header) listAdapter.getItem(i));
        }
        C118678q qVar = new C118678q(this, arrayList);
        this.f330935d = qVar;
        super.setListAdapter(qVar);
    }
}
