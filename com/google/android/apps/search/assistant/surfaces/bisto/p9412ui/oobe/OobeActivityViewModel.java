package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.lifecycle.C2358bf;
import com.google.android.apps.gsa.binaries.satin.app.ayy;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124825a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124979z;
import com.google.android.p10712d.C142324bc;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivityViewModel */
/* compiled from: PG */
public final class OobeActivityViewModel extends C2358bf {

    /* renamed from: a */
    public static final C59071e f344274a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivityViewModel");

    /* renamed from: b */
    public final AtomicReference f344275b = new AtomicReference();

    /* renamed from: c */
    public C142324bc f344276c = C142324bc.f386113s;

    /* renamed from: d */
    public C124979z f344277d = C124979z.f344847e;

    /* renamed from: e */
    public C124825a f344278e;

    /* renamed from: f */
    public boolean f344279f = false;

    /* renamed from: g */
    public final ayy f344280g;

    /* renamed from: h */
    private final C46128f f344281h;

    public OobeActivityViewModel(ayy ayy, C46128f fVar) {
        this.f344280g = ayy;
        this.f344281h = fVar;
    }

    /* renamed from: a */
    public final C124825a mo106637a() {
        C124825a aVar = this.f344278e;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("OobeLogger does not exist");
    }

    /* renamed from: b */
    public final C60870cx mo106638b(AccountId accountId) {
        if (this.f344275b.get() != null) {
            return C60856cj.m92900i((String) this.f344275b.get());
        }
        C60870cx b = this.f344281h.mo50215b(accountId);
        C124840bk bkVar = new C124840bk(this);
        return C60922j.m93044g(b, C47810es.m84963c(bkVar), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        if (this.f344278e != null) {
            ((C59052c) ((C59052c) f344274a.mo56224b()).mo56372aa(36347)).mo56386p("End OOBE session");
            this.f344278e.mo106661a(false);
            return;
        }
        ((C59052c) ((C59052c) f344274a.mo56226d()).mo56372aa(36346)).mo56386p("Missing OOBE session");
    }
}
