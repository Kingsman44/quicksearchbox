package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9213c;

import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.os.UserHandle;
import android.text.TextUtils;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121252p;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121253q;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9213c.p9214a.C121393a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.c.e */
/* compiled from: PG */
public final class C121397e implements C121393a {

    /* renamed from: a */
    private static final C59071e f337037a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.b.j.c.e");

    /* renamed from: b */
    private final LauncherApps f337038b;

    public C121397e(LauncherApps launcherApps) {
        this.f337038b = launcherApps;
    }

    /* renamed from: a */
    public final Map mo105121a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            String str = shortcutInfo.getPackage();
            CharSequence shortLabel = shortcutInfo.getShortLabel();
            CharSequence longLabel = shortcutInfo.getLongLabel();
            if (!TextUtils.isEmpty(shortLabel) || !TextUtils.isEmpty(longLabel)) {
                C121252p pVar = (C121252p) C121253q.f336807i.createBuilder();
                pVar.copyOnWrite();
                C121253q qVar = (C121253q) pVar.instance;
                str.getClass();
                qVar.f336809a |= 1;
                qVar.f336810b = str;
                String id = shortcutInfo.getId();
                pVar.copyOnWrite();
                C121253q qVar2 = (C121253q) pVar.instance;
                id.getClass();
                qVar2.f336809a |= 8;
                qVar2.f336813e = id;
                int rank = shortcutInfo.getRank();
                pVar.copyOnWrite();
                C121253q qVar3 = (C121253q) pVar.instance;
                qVar3.f336809a |= 16;
                qVar3.f336814f = rank;
                boolean isDynamic = shortcutInfo.isDynamic();
                pVar.copyOnWrite();
                C121253q qVar4 = (C121253q) pVar.instance;
                qVar4.f336809a |= 32;
                qVar4.f336815g = isDynamic;
                boolean isEnabled = shortcutInfo.isEnabled();
                pVar.copyOnWrite();
                C121253q qVar5 = (C121253q) pVar.instance;
                qVar5.f336809a |= 64;
                qVar5.f336816h = isEnabled;
                if (!TextUtils.isEmpty(shortLabel)) {
                    String obj = shortLabel.toString();
                    pVar.copyOnWrite();
                    C121253q qVar6 = (C121253q) pVar.instance;
                    obj.getClass();
                    qVar6.f336809a |= 2;
                    qVar6.f336811c = obj;
                }
                if (!TextUtils.isEmpty(longLabel)) {
                    String obj2 = longLabel.toString();
                    pVar.copyOnWrite();
                    C121253q qVar7 = (C121253q) pVar.instance;
                    obj2.getClass();
                    qVar7.f336809a |= 4;
                    qVar7.f336812d = obj2;
                }
                C58976aa aaVar = C58975e.f156826a;
                shortcutInfo.getShortLabel();
                List list2 = (List) Map.EL.getOrDefault(hashMap, str, new ArrayList());
                hashMap.put(str, list2);
                list2.add((C121253q) pVar.build());
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final List mo105122b(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f337038b.hasShortcutHostPermission()) {
            return new ArrayList();
        }
        List<UserHandle> profiles = this.f337038b.getProfiles();
        if (profiles.isEmpty()) {
            return new ArrayList();
        }
        try {
            LauncherApps launcherApps = this.f337038b;
            int i2 = 1;
            if (i - 1 == 1) {
                i2 = 10;
            }
            List<ShortcutInfo> shortcuts = launcherApps.getShortcuts(new LauncherApps.ShortcutQuery().setQueryFlags(i2), profiles.get(0));
            if (shortcuts == null) {
                return new ArrayList();
            }
            shortcuts.size();
            return shortcuts;
        } catch (IllegalStateException e) {
            C59104x d = f337037a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LSMImpl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(35812)).mo56386p("#queryAllShortcuts - getShortcuts failed.");
            return new ArrayList();
        }
    }
}
