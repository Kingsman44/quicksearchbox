package com.google.android.apps.gsa.staticplugins.p7545bo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.UserManager;
import com.google.android.apps.gsa.assistant.shared.ad;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bo.a */
/* compiled from: PG */
public final class C96666a {

    /* renamed from: a */
    private final Context f270454a;

    /* renamed from: b */
    private final C68214a f270455b;

    /* renamed from: c */
    private final C58833ax f270456c;

    /* renamed from: d */
    private final SharedPreferences f270457d;

    /* renamed from: e */
    private final C84515a f270458e;

    /* renamed from: f */
    private final C68214a f270459f;

    public C96666a(Context context, C68214a aVar, C58833ax axVar, SharedPreferences sharedPreferences, C84515a aVar2, C68214a aVar3) {
        this.f270454a = context;
        this.f270455b = aVar;
        this.f270456c = axVar;
        this.f270457d = sharedPreferences;
        this.f270458e = aVar2;
        this.f270459f = aVar3;
    }

    /* renamed from: b */
    private final ShortcutInfo m160184b(String str, String str2, int i, Intent intent) {
        return new ShortcutInfo.Builder(this.f270454a, str).setShortLabel(str2).setIcon(Icon.createWithResource(this.f270454a, i)).setIntent(intent).setActivity(new ComponentName(this.f270454a, "com.google.android.googlequicksearchbox.SearchActivity")).build();
    }

    /* renamed from: c */
    private static void m160185c(List list, Collection collection) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            collection.add(((ShortcutInfo) it.next()).getId());
        }
    }

    /* renamed from: a */
    public final void mo90306a() {
        int i;
        String str;
        Intent intent;
        if (this.f270456c.mo56113h() && ((UserManager) this.f270454a.getSystemService("user")).isUserUnlocked()) {
            ShortcutManager shortcutManager = (ShortcutManager) this.f270456c.mo56107c();
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            ArrayList<String> arrayList = new ArrayList<>();
            m160185c(dynamicShortcuts, arrayList);
            C58976aa aaVar = C58975e.f156826a;
            ArrayList arrayList2 = new ArrayList();
            C84515a aVar = this.f270458e;
            arrayList2.add(m160184b("text_shortcut", this.f270454a.getString(R.string.launcher_shortcut_text_search_short), R.drawable.ic_text_search_shortcut, aVar.mo78220c("and.gsa.launcher.shortcut.text", aVar.mo78224g())));
            if (ad.a((C90021c) this.f270455b.mo27525b(), (C58833ax) this.f270459f.mo27525b(), false)) {
                C87565h hVar = new C87565h();
                hVar.f236523a = "and.gsa.launcher.shortcut.voice";
                hVar.f236560f = 2;
                hVar.f236558d = 1;
                hVar.f236556b = e.bJ;
                hVar.f236497A = ad.b((C90021c) this.f270455b.mo27525b());
                intent = C87566i.m142321t(this.f270454a, hVar);
                intent.setAction("com.google.android.googlequicksearchbox.action.CLASSIC_GSA_VOICE_SEARCH");
                str = this.f270454a.getString(R.string.launcher_shortcut_assistant_short);
                i = R.drawable.ic_assistant_shortcut;
            } else {
                intent = this.f270458e.mo78222e("and.gsa.launcher.shortcut.voice");
                str = this.f270454a.getString(R.string.launcher_shortcut_voice_search_short);
                i = R.drawable.ic_voice_search_shortcut;
            }
            arrayList2.add(m160184b("voice_shortcut", str, i, intent));
            HashSet hashSet = new HashSet();
            m160185c(arrayList2, hashSet);
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : arrayList) {
                if (!hashSet.contains(str2)) {
                    arrayList3.add(str2);
                }
            }
            try {
                shortcutManager.setDynamicShortcuts(arrayList2);
            } catch (IllegalStateException unused) {
            } catch (Exception unused2) {
                C89949q.m146523g(1016);
            }
            shortcutManager.disableShortcuts(arrayList3);
            this.f270457d.edit().putBoolean("launcher_shortcut_enabled", true).apply();
        }
    }
}
