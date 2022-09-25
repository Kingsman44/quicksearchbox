package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.WarmActionsInCallService;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.incallservice.IncomingCallInCallService;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.l */
/* compiled from: PG */
public final class C79525l extends C79360j implements C79507c, C90991b {

    /* renamed from: a */
    public static final C58974d f218230a = C58974d.m91136j();

    /* renamed from: h */
    private static final C58528ij f218231h = C58528ij.m90013M(C79570b.CALL_CONTACT, C79570b.CALL_NUMBER, C79570b.CALL_CONTACT_V2, C79570b.CALL_NUMBER_V2);

    /* renamed from: i */
    private static final C58528ij f218232i = C58528ij.m90012L(Integer.valueOf(C90126fx.f251453jB.f248757a), Integer.valueOf(C90126fx.f251780pk.f251802a), Integer.valueOf(C90126fx.f251472jU.f248757a));

    /* renamed from: b */
    public final Context f218233b;

    /* renamed from: c */
    public final C91142g f218234c;

    /* renamed from: d */
    public final C81459h f218235d;

    /* renamed from: e */
    public final ServiceConnection f218236e;

    /* renamed from: f */
    final AtomicReference f218237f = new AtomicReference(Optional.empty());

    /* renamed from: g */
    public final C79534u f218238g;

    /* renamed from: j */
    private final C22871g f218239j;

    /* renamed from: k */
    private final C81006b f218240k;

    public C79525l(C79359i iVar, C76092h hVar, Context context, C91142g gVar, C22871g gVar2, C90821bm bmVar, C81465n nVar, C81006b bVar, C79534u uVar) {
        super(iVar, hVar, f218232i);
        this.f218233b = context;
        this.f218234c = gVar;
        this.f218239j = gVar2;
        this.f218240k = bVar;
        this.f218238g = uVar;
        C81459h b = nVar.mo75095b(bmVar.mo85163a(C79524k.class), C79511g.f218213a);
        this.f218235d = b;
        this.f218236e = new C79523j(this);
        Objects.requireNonNull(b);
        uVar.f218249a = Optional.m71637of(new C79512h(b));
    }

    /* renamed from: b */
    public final void mo74111b() {
        ((Boolean) ((Optional) this.f218237f.get()).map(new C79509e()).orElse(false)).booleanValue();
    }

    /* renamed from: e */
    public final void mo74118e(int i) {
        ComponentName componentName = new ComponentName(this.f218233b.getPackageName(), WarmActionsInCallService.class.getName());
        ComponentName componentName2 = new ComponentName(this.f218233b.getPackageName(), IncomingCallInCallService.class.getName());
        if (this.f218234c.mo85405j(C90126fx.f251472jU)) {
            this.f218233b.getPackageManager().setComponentEnabledSetting(componentName2, i, 3);
            this.f218233b.getPackageManager().setComponentEnabledSetting(componentName, 2, 3);
            return;
        }
        this.f218233b.getPackageManager().setComponentEnabledSetting(componentName, i, 3);
        this.f218233b.getPackageManager().setComponentEnabledSetting(componentName2, 2, 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: gB */
    public final boolean mo72819gB() {
        return (this.f218234c.mo85405j(C90126fx.f251453jB) && !Collections.disjoint(f218231h, this.f218240k.mo74778c())) || this.f218234c.mo85405j(C90126fx.f251125cs);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MWW CallSetupHelper");
        fVar.mo85278b("Component enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo72819gB())));
        fVar.mo85278b("InCallService bound").mo85276a(C90752i.m148228b(Boolean.valueOf(((Optional) this.f218237f.get()).isPresent())));
        fVar.mo85278b("TNG InCallService used").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f218234c.mo85405j(C90126fx.f251472jU))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return this.f218239j.mo28201a("[NGA][WA] CallSetupHelperImpl.initialize", new C79508d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return this.f218239j.mo28201a("[NGA][WA] CallSetupHelperImpl.uninitialize", new C79510f(this));
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "CallSetupHelper";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 59;
    }
}
