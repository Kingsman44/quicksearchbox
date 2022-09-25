package com.google.android.apps.gsa.staticplugins.p7703cr;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.cr.a */
/* compiled from: PG */
public final class C98516a implements C86109e {

    /* renamed from: a */
    private final Context f275091a;

    /* renamed from: b */
    private final Uri f275092b = Uri.parse("content://com.google.android.googlequicksearchbox.GsaPublicContentProvider/publicvalue");

    public C98516a(Context context) {
        this.f275091a = context;
    }

    /* renamed from: c */
    private final void m163176c(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f275091a.getContentResolver().notifyChange(this.f275092b.buildUpon().appendPath(str).build(), (ContentObserver) null);
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        C58800sl lA = C98523f.f275097a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (mVar.mo79735a(((C98521d) entry.getValue()).mo91158a())) {
                m163176c((String) entry.getKey());
            }
        }
    }

    /* renamed from: b */
    public final void mo70819b(C86124t tVar) {
        C58800sl lA = C98523f.f275097a.keySet().iterator();
        while (lA.hasNext()) {
            m163176c((String) lA.next());
        }
    }
}
