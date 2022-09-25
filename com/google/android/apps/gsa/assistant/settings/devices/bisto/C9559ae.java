package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.preference.C4023s;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90364ac;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58827ar;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ae */
/* compiled from: PG */
public final class C9559ae extends C9504g implements C4023s {

    /* renamed from: j */
    private static final C59071e f33127j = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.bisto.ae");

    /* renamed from: i */
    public final C68214a f33128i;

    /* renamed from: k */
    private final C91142g f33129k;

    /* renamed from: l */
    private final C88483e f33130l;

    /* renamed from: m */
    private final C90364ac f33131m;

    /* renamed from: n */
    private TwoStatePreference f33132n;

    /* renamed from: o */
    private PreferenceGroup f33133o;

    /* renamed from: p */
    private final Set f33134p = new HashSet();

    public C9559ae(C91142g gVar, C68214a aVar, C88483e eVar, C90364ac acVar) {
        this.f33129k = gVar;
        this.f33128i = aVar;
        this.f33130l = eVar;
        this.f33131m = acVar;
    }

    /* renamed from: G */
    private final void m24260G(PackageManager packageManager, ApplicationInfo applicationInfo, boolean z) {
        if (this.f33133o == null) {
            C59104x d = f33127j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoNotifCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(363)).mo56386p("appNotificationsPreferenceGroup is null");
            int i = C90755l.f253831a;
            return;
        }
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(mo17792e().f12738j);
        switchPreferenceCompat.mo8343J(applicationInfo.packageName);
        switchPreferenceCompat.mo8341H(packageManager.getApplicationIcon(applicationInfo));
        switchPreferenceCompat.mo8347N(packageManager.getApplicationLabel(applicationInfo));
        switchPreferenceCompat.mo8391j(z);
        switchPreferenceCompat.f12742n = this;
        this.f33133o.mo8379af(switchPreferenceCompat);
    }

    /* renamed from: F */
    public final void mo17872F(boolean z) {
        PreferenceGroup preferenceGroup = this.f33133o;
        if (preferenceGroup == null) {
            C59104x d = f33127j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoNotifCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(364)).mo56386p("appNotificationsPreferenceGroup is null");
            int i = C90755l.f253831a;
            return;
        }
        preferenceGroup.mo8348O(z);
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = preference.f12748t;
        if (booleanValue) {
            this.f33134p.add(str);
        } else {
            this.f33134p.remove(str);
        }
        String d = C58827ar.m90818c(',').mo56097d(this.f33134p);
        C84533ar a = ((C84534as) this.f33128i.mo27525b()).mo78241a();
        a.mo78239e("bisto_spoken_notifications_apps", d);
        a.mo78236b();
        mo17873b();
        return true;
    }

    /* renamed from: b */
    public final void mo17873b() {
        C89651f.m145940a(this.f33130l, new C88489j(C87739bu.BISTO_STARTUP_PREF_CHANGED).mo82013a());
    }

    /* renamed from: o */
    public final void mo17804o(Bundle bundle) {
        String g = this.f33129k.mo85402g("bisto_spoken_notifications_apps", (String) null);
        if (g == null) {
            g = this.f33131m.mo84074a();
        }
        C58557jl.m90136q(this.f33134p, C58869cf.m90936b(new C58903m(',')).mo56153g(g));
        PreferenceGroup preferenceGroup = (PreferenceGroup) mo17792e().mo8382l("bistoAppNotifications");
        this.f33133o = preferenceGroup;
        preferenceGroup.f12757c = true;
        PackageManager packageManager = this.f32988d.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        HashMap hashMap = new HashMap();
        for (ResolveInfo next : queryIntentActivities) {
            if (!(next.activityInfo == null || next.activityInfo.packageName == null)) {
                hashMap.put(next.activityInfo.packageName, next);
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ResolveInfo resolveInfo : hashMap.values()) {
            if (this.f33134p.contains(resolveInfo.activityInfo.packageName)) {
                arrayList.add(resolveInfo);
            } else {
                arrayList2.add(resolveInfo);
            }
        }
        ResolveInfo.DisplayNameComparator displayNameComparator = new ResolveInfo.DisplayNameComparator(packageManager);
        Collections.sort(arrayList, displayNameComparator);
        Collections.sort(arrayList2, displayNameComparator);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m24260G(packageManager, ((ResolveInfo) arrayList.get(i)).activityInfo.applicationInfo, true);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m24260G(packageManager, ((ResolveInfo) arrayList2.get(i2)).activityInfo.applicationInfo, false);
        }
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) mo17792e().mo8382l("bistoGlobalNotifications");
        this.f33132n = switchPreferenceCompat;
        switchPreferenceCompat.f12742n = new C9558ad(this);
        boolean k = this.f33129k.mo85406k("bisto_spoken_notifications", true);
        this.f33132n.mo8391j(k);
        mo17872F(k);
    }
}
