package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.l */
/* compiled from: PG */
public final class C117003l implements C41630d {

    /* renamed from: a */
    private final C86130z f324810a;

    public C117003l(C86130z zVar) {
        this.f324810a = zVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 4000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        Uri parse;
        ListIterator listIterator = list.listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            C41633g gVar = (C41633g) listIterator.next();
            if (gVar.mo44217m() == 97) {
                C41693s sVar = gVar.mo44218n().f109009c;
                if (sVar == null) {
                    sVar = C41693s.f109053h;
                }
                String str = sVar.f109057c;
                if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && !TextUtils.isEmpty(parse.getAuthority()) && parse.getAuthority().toLowerCase(Locale.US).startsWith("www.google.") && this.f324810a.mo79768h(parse.getPath())) {
                    listIterator.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
