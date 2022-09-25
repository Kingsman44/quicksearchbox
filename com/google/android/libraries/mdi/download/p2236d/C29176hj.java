package com.google.android.libraries.mdi.download.p2236d;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.storage.p3304a.p3314h.C42810d;
import com.google.common.base.C58817ah;
import com.google.p4433bz.p4437b.C57909n;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.hj */
/* compiled from: PG */
public final /* synthetic */ class C29176hj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79122a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f79123b;

    /* renamed from: c */
    public final /* synthetic */ C29328dl f79124c;

    /* renamed from: d */
    public final /* synthetic */ boolean f79125d;

    public /* synthetic */ C29176hj(C29211ir irVar, C29334dr drVar, C29328dl dlVar, boolean z) {
        this.f79122a = irVar;
        this.f79123b = drVar;
        this.f79124c = dlVar;
        this.f79125d = z;
    }

    public final Object apply(Object obj) {
        C29211ir irVar = this.f79122a;
        C29334dr drVar = this.f79123b;
        C29328dl dlVar = this.f79124c;
        boolean z = this.f79125d;
        Uri uri = (Uri) obj;
        if (uri != null && C29099m.m54014j(drVar)) {
            try {
                uri = irVar.f79194d.mo34578a(uri, dlVar, drVar, z);
            } catch (IOException e) {
                C29045l.m53938j(e, "%s getDataFileUri %s %s unable to get isolated file uri!", "MDDManager", dlVar.f79473b, drVar.f79501c);
                uri = null;
            }
        }
        if (uri == null || (dlVar.f79472a & 256) == 0) {
            return uri;
        }
        C57909n nVar = dlVar.f79481j;
        if (nVar == null) {
            nVar = C57909n.f154891b;
        }
        return (!irVar.f79206p.mo34440t() || nVar.f154893a.size() == 0) ? uri : uri.buildUpon().encodedFragment(C42810d.m75633a(nVar)).build();
    }
}
