package com.google.android.apps.gsa.staticplugins.nga.p8067j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.ac;
import com.google.android.apps.gsa.nga.shared.android.C80956l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37361az;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.j.ba */
/* compiled from: PG */
public final class C103347ba {

    /* renamed from: a */
    public static final C59071e f288137a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.j.ba");

    /* renamed from: b */
    public final C22871g f288138b;

    /* renamed from: c */
    public final C68214a f288139c;

    /* renamed from: d */
    public final C68214a f288140d;

    /* renamed from: e */
    public final C68214a f288141e;

    /* renamed from: f */
    public Binder f288142f;

    /* renamed from: g */
    public ac f288143g = null;

    /* renamed from: h */
    public boolean f288144h = false;

    /* renamed from: i */
    final ServiceConnection f288145i = new C103345az(this);

    /* renamed from: j */
    private final Context f288146j;

    /* renamed from: k */
    private final boolean f288147k;

    /* renamed from: l */
    private final C68214a f288148l;

    /* renamed from: m */
    private final Deque f288149m = new ArrayDeque();

    /* renamed from: n */
    private final C58881cr f288150n;

    /* renamed from: o */
    private final C68214a f288151o;

    /* renamed from: p */
    private boolean f288152p = false;

    public C103347ba(Context context, C22871g gVar, boolean z, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f288146j = context;
        this.f288138b = gVar;
        this.f288147k = z;
        this.f288139c = aVar;
        this.f288140d = aVar2;
        this.f288141e = aVar3;
        this.f288148l = aVar4;
        this.f288151o = aVar6;
        this.f288150n = C58886cw.m90973a(new C103342aw(aVar5));
    }

    /* renamed from: a */
    public final void mo93767a(ac acVar) {
        while (!this.f288149m.isEmpty()) {
            try {
                ((C103319a) this.f288149m.pop()).mo93747a(acVar);
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) f288137a.mo56226d()).mo56382g(e)).mo56372aa(21507)).mo56386p("Call to INgaService failed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo93768b(C103319a aVar) {
        this.f288138b.mo28212l("[NGA] sendEligibilityMessage", new C103340au(this, aVar));
    }

    /* renamed from: c */
    public final void mo93769c(C103319a aVar) {
        if (!((Boolean) this.f288150n.mo6453a()).booleanValue()) {
            ((C59052c) ((C59052c) f288137a.mo56226d()).mo56372aa(21509)).mo56386p("Using NgaInteractorConnection outside of :search is not allowed.");
        } else if (this.f288147k) {
            C80956l lVar = (C80956l) this.f288148l.mo27525b();
            this.f288149m.add(aVar);
            ac acVar = this.f288143g;
            if (this.f288144h && acVar != null) {
                mo93767a(acVar);
            } else if (!this.f288152p) {
                this.f288152p = true;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this.f288146j, "com.google.android.apps.gsa.nga.engine.viss.NgaService"));
                intent.setPackage("com.google.android.googlequicksearchbox");
                if (!this.f288146j.bindService(intent, this.f288145i, 1)) {
                    ((C59052c) ((C59052c) f288137a.mo56225c()).mo56372aa(21511)).mo56386p("Unable to bind to NgaService");
                }
                ((C37361az) this.f288151o.mo27525b()).mo40899a();
            }
        }
    }

    /* renamed from: d */
    public final void mo93770d(C103319a aVar) {
        this.f288138b.mo28212l("[NGA] sendMessageIfEligible", new C103339at(this, aVar));
    }

    /* renamed from: e */
    public final void mo93771e(C103319a aVar) {
        this.f288138b.mo28212l("[NGA] sendMessageIfNgaEnabled", new C103341av(this, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo93772f(C103319a aVar) {
        this.f288138b.mo28212l("[NGA] sendVisEventMessage", new C103338as(this, aVar));
    }
}
