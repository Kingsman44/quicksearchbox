package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.C29662ie;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58833ax;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.z */
/* compiled from: PG */
public final class C29314z {

    /* renamed from: a */
    public final Context f79440a;

    /* renamed from: b */
    public final C29118ff f79441b;

    /* renamed from: c */
    public final C29290lp f79442c;

    /* renamed from: d */
    public final C29293ls f79443d;

    /* renamed from: e */
    public final C29037d f79444e;

    /* renamed from: f */
    public final C29662ie f79445f;

    /* renamed from: g */
    public final C42813k f79446g;

    /* renamed from: h */
    public final C58833ax f79447h;

    /* renamed from: i */
    public final C29658ia f79448i;

    /* renamed from: j */
    public final Executor f79449j;

    /* renamed from: k */
    public final C28787cb f79450k;

    public C29314z(Context context, C29118ff ffVar, C29290lp lpVar, C29293ls lsVar, C29037d dVar, C29662ie ieVar, C42813k kVar, C58833ax axVar, C29658ia iaVar, Executor executor, C28787cb cbVar) {
        this.f79440a = context;
        this.f79441b = ffVar;
        this.f79442c = lpVar;
        this.f79443d = lsVar;
        this.f79444e = dVar;
        this.f79445f = ieVar;
        this.f79446g = kVar;
        this.f79447h = axVar;
        this.f79448i = iaVar;
        this.f79449j = executor;
        this.f79450k = cbVar;
    }

    /* renamed from: a */
    public final int mo34651a(Uri uri, List list) {
        int i;
        try {
            if (!this.f79446g.mo45894h(uri)) {
                return 0;
            }
            i = 0;
            for (Uri uri2 : this.f79446g.mo45888b(uri)) {
                try {
                    try {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                                    break;
                                }
                            } else if (this.f79446g.mo45895i(uri2)) {
                                i += mo34651a(uri2, list);
                            } else {
                                C29045l.m53931c("%s: Deleted unaccounted file with uri %s!", "ExpirationHandler", uri2.getPath());
                                this.f79446g.mo45892f(uri2);
                                i++;
                            }
                        }
                    } catch (IOException e) {
                        this.f79444e.mo34543h(1059);
                        C29045l.m53938j(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            return i;
        } catch (IOException e3) {
            e = e3;
            i = 0;
            this.f79444e.mo34543h(1059);
            C29045l.m53938j(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
            return i;
        }
    }
}
