package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8725b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.b.b */
/* compiled from: PG */
public final class C116871b implements C41630d {

    /* renamed from: a */
    private final int f324353a;

    public C116871b(Context context) {
        this.f324353a = context.getResources().getInteger(R.integer.min_web_suggestions);
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 1500;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        int i;
        Iterator it = list.iterator();
        do {
            i = 0;
            if (!it.hasNext()) {
                return false;
            }
        } while (((C41633g) it.next()).mo44217m() != 114);
        HashSet hashSet = new HashSet();
        ListIterator listIterator = list.listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            C41633g gVar = (C41633g) listIterator.next();
            if (gVar.mo44217m() == 114) {
                C41693s sVar = gVar.mo44218n().f109009c;
                if (sVar == null) {
                    sVar = C41693s.f109053h;
                }
                String str = sVar.f109059e;
                if (TextUtils.isEmpty(str)) {
                    listIterator.remove();
                    z = true;
                } else {
                    hashSet.add(str);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            while (true) {
                if (i < list.size()) {
                    if (((C41633g) list.get(i)).mo44217m() == 114) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= this.f324353a) {
                return z;
            }
            ListIterator listIterator2 = list.listIterator();
            while (listIterator2.hasNext()) {
                C41633g gVar2 = (C41633g) listIterator2.next();
                int m = gVar2.mo44217m();
                if (m == 89) {
                    C41693s sVar2 = gVar2.mo44218n().f109009c;
                    if (sVar2 == null) {
                        sVar2 = C41693s.f109053h;
                    }
                    if (hashSet.contains(sVar2.f109059e)) {
                        listIterator2.remove();
                    }
                } else if (m == 97) {
                    listIterator2.remove();
                }
                z = true;
            }
        }
        return z;
    }
}
