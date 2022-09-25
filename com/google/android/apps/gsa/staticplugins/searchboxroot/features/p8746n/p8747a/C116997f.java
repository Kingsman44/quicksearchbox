package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41662ab;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.android.libraries.searchbox.shared.suggestion.C41695u;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4575r.C60761r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.f */
/* compiled from: PG */
public final class C116997f implements C41630d {
    /* renamed from: c */
    public static int m194433c(C41633g gVar, C41633g gVar2) {
        C41695u uVar = gVar.mo44218n().f109011e;
        if (uVar == null) {
            uVar = C41695u.f109062e;
        }
        long j = uVar.f109066c;
        C41695u uVar2 = gVar2.mo44218n().f109011e;
        if (uVar2 == null) {
            uVar2 = C41695u.f109062e;
        }
        return C60761r.m92755a(j, uVar2.f109066c);
    }

    /* renamed from: d */
    private static boolean m194434d(C41633g gVar) {
        if (gVar.mo44222r() == null || gVar.mo44222r().isEmpty()) {
            return false;
        }
        if (gVar.mo44222r().contains(216) || gVar.mo44222r().contains(238)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return SimpleSnackbar.LENGTH_LONG;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        boolean z;
        ArrayList<C41633g> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        C41633g gVar = null;
        String str = null;
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C41633g gVar2 = (C41633g) it.next();
                if (gVar2.mo44217m() == 85) {
                    if (str == null) {
                        CharSequence d = C89235z.m145132d((Suggestion) gVar2);
                        if (!TextUtils.isEmpty(d)) {
                            str = d.toString();
                        }
                        z = true;
                    }
                } else if (m194434d(gVar2)) {
                    arrayList.add(gVar2);
                }
            }
        }
        if (!z || str == null) {
            list.removeAll(arrayList);
            arrayList.clear();
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C41633g gVar3 = (C41633g) it2.next();
                CharSequence d2 = C89235z.m145132d((Suggestion) gVar3);
                if (!TextUtils.isEmpty(d2) && !str.contentEquals(d2)) {
                    list.remove(gVar3);
                    it2.remove();
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C41633g gVar4 : arrayList) {
            C41693s sVar = gVar4.mo44218n().f109009c;
            if (sVar == null) {
                sVar = C41693s.f109053h;
            }
            String str2 = sVar.f109059e;
            if (!hashMap.containsKey(str2)) {
                hashMap.put(str2, gVar4);
            } else if (m194433c((C41633g) hashMap.get(str2), gVar4) > 0) {
                list.remove(gVar4);
            } else {
                list.remove(hashMap.get(str2));
                hashMap.put(str2, gVar4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        int i = -1;
        while (it3.hasNext()) {
            C41633g gVar5 = (C41633g) it3.next();
            if (m194434d(gVar5)) {
                arrayList2.add(gVar5);
            } else if (gVar5.mo44217m() == 85) {
                i = gVar5.mo44215k();
                gVar = gVar5;
            }
        }
        if (arrayList2.isEmpty() || gVar == null) {
            return false;
        }
        Collections.sort(arrayList2, Collections.reverseOrder(C116996e.f324796a));
        int size = arrayList2.size();
        boolean z2 = false;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C41633g gVar6 = (C41633g) arrayList2.get(i3);
            int i4 = (i - i2) - 1;
            if (gVar6.mo44215k() != i4) {
                gVar6.mo44204d(i4);
                z2 = true;
            }
            C41663ac acVar = gVar.mo44218n().f109008b;
            if (acVar == null) {
                acVar = C41663ac.f108934g;
            }
            if (acVar.f108937b == 3) {
                C41678d dVar = (C41678d) gVar6.mo44218n().toBuilder();
                C41663ac acVar2 = ((C41679e) dVar.instance).f109008b;
                if (acVar2 == null) {
                    acVar2 = C41663ac.f108934g;
                }
                C41662ab abVar = (C41662ab) acVar2.toBuilder();
                C41663ac acVar3 = gVar.mo44218n().f109008b;
                if (acVar3 == null) {
                    acVar3 = C41663ac.f108934g;
                }
                String str3 = acVar3.f108937b == 3 ? (String) acVar3.f108938c : BuildConfig.FLAVOR;
                abVar.copyOnWrite();
                C41663ac acVar4 = (C41663ac) abVar.instance;
                str3.getClass();
                acVar4.f108937b = 3;
                acVar4.f108938c = str3;
                C41663ac acVar5 = (C41663ac) abVar.build();
                dVar.copyOnWrite();
                C41679e eVar = (C41679e) dVar.instance;
                acVar5.getClass();
                eVar.f109008b = acVar5;
                eVar.f109007a |= 2;
                gVar6.mo44207g((C41679e) dVar.build());
            }
            i2++;
        }
        return z2;
    }
}
