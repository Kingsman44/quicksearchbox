package com.google.android.apps.gsa.search.core.google;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90007bm;
import com.google.android.apps.gsa.shared.p7066m.C90091ep;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.C91143w;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60917ed;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58130a;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58135f;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.search.core.google.p */
/* compiled from: PG */
public final class C86074p {

    /* renamed from: a */
    private final Context f232663a;

    /* renamed from: b */
    private final C86124t f232664b;

    /* renamed from: c */
    private final C86338r f232665c;

    /* renamed from: d */
    private final C68214a f232666d;

    public C86074p(Context context, C86124t tVar, C86338r rVar, C68214a aVar) {
        this.f232663a = context;
        this.f232664b = tVar;
        this.f232665c = rVar;
        this.f232666d = aVar;
    }

    /* renamed from: d */
    public static byte[] m138407d(byte[] bArr) {
        C58130a aVar = (C58130a) C58131b.f155403h.createBuilder();
        C63088z A = C63088z.m96139A(C90734ar.m148201d(bArr));
        aVar.copyOnWrite();
        C58131b bVar = (C58131b) aVar.instance;
        bVar.f155405a |= 1;
        bVar.f155406b = A;
        return ((C58131b) aVar.build()).toByteArray();
    }

    /* renamed from: a */
    public final C58131b mo79713a(boolean z, Collection collection) {
        C58130a aVar = (C58130a) C58131b.f155403h.createBuilder();
        long j = this.f232664b.f232786f.f232745c;
        aVar.copyOnWrite();
        C58131b bVar = (C58131b) aVar.instance;
        bVar.f155405a |= 2;
        bVar.f155408d = j;
        if (!this.f232664b.mo79746e(C90007bm.f246883b)) {
            aVar.mo54672a(this.f232664b.mo79759y());
        }
        if (this.f232664b.mo79746e(C90091ep.f250539b)) {
            aVar.copyOnWrite();
            C58131b bVar2 = (C58131b) aVar.instance;
            bVar2.mo54676b();
            C62947c.addAll((Iterable) collection, (List) bVar2.f155410f);
        }
        aVar.mo54673b(this.f232664b.mo79737h());
        if (z) {
            C58135f a = C91143w.m148923a(this.f232663a);
            aVar.copyOnWrite();
            C58131b bVar3 = (C58131b) aVar.instance;
            a.getClass();
            bVar3.f155411g = a;
            bVar3.f155405a |= 16;
        }
        if (this.f232664b.mo79746e(C90007bm.f246883b)) {
            String string = this.f232665c.getString("ph_server_token", (String) null);
            if (string != null) {
                aVar.mo54674c(string);
            }
        } else {
            String w = this.f232664b.mo79757w();
            if (w != null) {
                aVar.mo54674c(w);
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        aVar.build();
        return (C58131b) aVar.build();
    }

    /* renamed from: b */
    public final Collection mo79714b() {
        if (!this.f232664b.mo79746e(C90091ep.f250540c)) {
            return ((C84474e) this.f232666d.mo27525b()).mo78124m();
        }
        try {
            return (Collection) C60917ed.m93035b(((C84474e) this.f232666d.mo27525b()).mo78116e(), this.f232664b.mo79743a(C90091ep.f250542e) + 100, TimeUnit.MILLISECONDS);
        } catch (ExecutionException | TimeoutException e) {
            throw new AssertionError(e);
        } catch (CancellationException unused) {
            return new HashSet();
        }
    }

    /* renamed from: c */
    public final void mo79715c(C85981c cVar, boolean z, boolean z2, Collection collection) {
        byte[] byteArray = mo79713a(z2, collection).toByteArray();
        if (z) {
            byteArray = m138407d(byteArray);
        }
        cVar.mo79637c(cVar.f232498f, "X-Client-Data", byteArray);
    }
}
