package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.C28745bw;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29680t;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58570jy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.b.ax */
/* compiled from: PG */
public final /* synthetic */ class C29543ax implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29545az f80072a;

    /* renamed from: b */
    public final /* synthetic */ String f80073b;

    /* renamed from: c */
    public final /* synthetic */ C28745bw f80074c;

    public /* synthetic */ C29543ax(C29545az azVar, String str, C28745bw bwVar) {
        this.f80072a = azVar;
        this.f80073b = str;
        this.f80074c = bwVar;
    }

    public final C60870cx apply(Object obj) {
        C29545az azVar = this.f80072a;
        String str = this.f80073b;
        C28745bw bwVar = this.f80074c;
        return ((C29409fd) azVar.f80078a.mo6453a()).mo34723l(new C29680t(C58833ax.m90834k(bwVar), C58833ax.m90834k((Account) C58570jy.m90154f(((List) obj).iterator(), new C29542aw(str)))));
    }
}
