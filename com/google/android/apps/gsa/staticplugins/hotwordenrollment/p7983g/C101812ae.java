package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.p7271d.C92228e;
import com.google.android.apps.gsa.speech.p7271d.C92229f;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ae */
/* compiled from: PG */
public final class C101812ae extends C92229f {

    /* renamed from: c */
    public static final C59071e f283975c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ae");

    /* renamed from: d */
    public final Account f283976d;

    /* renamed from: e */
    public final C101860a f283977e;

    /* renamed from: f */
    public final l f283978f;

    /* renamed from: g */
    private final cb f283979g;

    /* renamed from: h */
    private final C89859i f283980h;

    public C101812ae(Account account, C90931ca caVar, C90021c cVar, C101860a aVar, cb cbVar, C89859i iVar, l lVar) {
        super(C92228e.VOICE_SETTINGS, caVar, cVar);
        this.f283976d = account;
        this.f283977e = aVar;
        this.f283979g = cbVar;
        this.f283980h = iVar;
        this.f283978f = lVar;
    }

    /* renamed from: a */
    public final void mo86900a() {
        if (this.f283976d == null) {
            ((C59052c) ((C59052c) f283975c.mo56226d()).mo56372aa(20674)).mo56386p("Account is null. Skipping unicornInfo fetch");
            mo86905e(false);
        }
        C60856cj.m92911t(this.f283979g.c(this.f283976d, new int[]{0, 1, 2}), new C101810ac(this), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86901b() {
    }

    /* renamed from: e */
    public final void mo86905e(boolean z) {
        C89849ae aeVar;
        ((C59052c) ((C59052c) f283975c.mo56224b()).mo56372aa(20675)).mo56389s("UnicornInfo #internalFinish, success=%b", Boolean.valueOf(z));
        C89859i iVar = this.f283980h;
        if (z) {
            aeVar = C89849ae.VOICE_MATCH_UNICORN_INFO_CHECK_SUCCESS;
        } else {
            aeVar = C89849ae.VOICE_MATCH_UNICORN_INFO_CHECK_FAILURE;
        }
        iVar.mo83702b(aeVar);
        super.mo86905e(z);
    }
}
