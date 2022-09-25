package com.google.android.apps.gsa.staticplugins.opa.util;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AccountsException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.p6930h.C87558a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.common.p4526f.C59052c;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.c */
/* compiled from: PG */
final class C113811c implements AccountManagerCallback {

    /* renamed from: a */
    final /* synthetic */ C87558a f315212a;

    /* renamed from: b */
    final /* synthetic */ C113872d f315213b;

    public C113811c(C113872d dVar, C87558a aVar) {
        this.f315213b = dVar;
        this.f315212a = aVar;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            String string = bundle != null ? bundle.getString("authAccount") : null;
            if (!TextUtils.isEmpty(string)) {
                this.f315213b.f315293c.mo79680n();
                this.f315213b.f315293c.mo79686t(string);
                C90476a aVar = C90754k.f253829b;
                C90476a aVar2 = C90754k.f253829b;
                ((C59052c) ((C59052c) C113872d.f315291a.mo56224b()).mo56372aa(28380)).mo56389s("Adding new account succeeded: %s", C90753j.m148239a(string));
                this.f315212a.mo81679a();
            }
        } catch (OperationCanceledException e) {
            ((C59052c) ((C59052c) ((C59052c) C113872d.f315291a.mo56224b()).mo56382g(e)).mo56372aa(28381)).mo56386p("Adding new account canceled");
        } catch (AccountsException e2) {
            ((C59052c) ((C59052c) ((C59052c) C113872d.f315291a.mo56226d()).mo56382g(e2)).mo56372aa(28382)).mo56386p("Account not found");
        } catch (IOException e3) {
            ((C59052c) ((C59052c) ((C59052c) C113872d.f315291a.mo56226d()).mo56382g(e3)).mo56372aa(28383)).mo56386p("Unable to add account");
        }
    }
}
