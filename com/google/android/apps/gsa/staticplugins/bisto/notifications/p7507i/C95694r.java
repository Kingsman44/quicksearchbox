package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95174a;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.r */
/* compiled from: PG */
public final class C95694r {

    /* renamed from: a */
    public final Context f267908a;

    /* renamed from: b */
    public final C95706l f267909b;

    /* renamed from: c */
    public final C95293ae f267910c;

    /* renamed from: d */
    public final C21370a f267911d;

    /* renamed from: e */
    public final C95307m f267912e;

    /* renamed from: f */
    public final Map f267913f = new HashMap();

    /* renamed from: g */
    private final C95188c f267914g;

    /* renamed from: h */
    private final C95186al f267915h;

    public C95694r(Context context, C95706l lVar, C95293ae aeVar, C95186al alVar, C95188c cVar, C21370a aVar, C95307m mVar) {
        this.f267908a = context;
        this.f267909b = lVar;
        this.f267910c = aeVar;
        this.f267914g = cVar;
        this.f267915h = alVar;
        this.f267911d = aVar;
        this.f267912e = mVar;
    }

    /* renamed from: a */
    public static Uri m158465a(Collection collection) {
        Iterator it = collection.iterator();
        Uri uri = null;
        while (it.hasNext()) {
            C90421b bVar = (C90421b) it.next();
            if (uri == null) {
                uri = bVar.f252585f;
            } else {
                Uri uri2 = bVar.f252585f;
                if (uri2 != null && !uri.equals(uri2)) {
                    return null;
                }
            }
        }
        return uri;
    }

    /* renamed from: c */
    public static boolean m158466c(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return charSequence.toString().contentEquals(charSequence2);
    }

    /* renamed from: b */
    public final void mo89644b(int i, Collection collection) {
        if (i == 0) {
            Uri a = m158465a(collection);
            if (a == null) {
                C58976aa aaVar = C58975e.f156826a;
                this.f267914g.mo89096a(4);
                return;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            this.f267915h.mo89090a(a, (C95174a) null);
        } else if (i == 1 || i == 2) {
            C58976aa aaVar3 = C58975e.f156826a;
            this.f267914g.mo89096a(5);
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            this.f267914g.mo89096a(3);
        }
    }
}
