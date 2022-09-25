package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.libraries.micore.learning.base.C29718j;
import com.google.android.libraries.micore.learning.training.util.StatusOr;
import com.google.fcp.client.C61090c;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.g */
/* compiled from: PG */
public final /* synthetic */ class C29735g implements C61090c {

    /* renamed from: a */
    public final /* synthetic */ C29737i f80508a;

    /* renamed from: b */
    public final /* synthetic */ String f80509b;

    /* renamed from: c */
    public final /* synthetic */ String f80510c;

    public /* synthetic */ C29735g(C29737i iVar, String str, String str2) {
        this.f80508a = iVar;
        this.f80509b = str;
        this.f80510c = str2;
    }

    public final Object call() {
        C29737i iVar = this.f80508a;
        try {
            File a = iVar.f80512a.mo34850a(this.f80509b, this.f80510c);
            iVar.f80513b.add(a);
            return new StatusOr(a.getAbsolutePath(), (C29718j) null);
        } catch (IOException e) {
            return new StatusOr((Object) null, new C29718j(5, e.getMessage()));
        }
    }
}
