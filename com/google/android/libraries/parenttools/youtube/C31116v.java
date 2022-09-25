package com.google.android.libraries.parenttools.youtube;

import android.accounts.Account;
import android.support.p031v4.app.C0167am;
import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.tasks.C146021aq;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.parenttools.youtube.v */
/* compiled from: PG */
public final /* synthetic */ class C31116v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31093aa f83813a;

    /* renamed from: b */
    public final /* synthetic */ String f83814b;

    public /* synthetic */ C31116v(C31093aa aaVar, String str) {
        this.f83813a = aaVar;
        this.f83814b = str;
    }

    public final void run() {
        Account account;
        C31093aa aaVar = this.f83813a;
        String str = this.f83814b;
        try {
            Account[] accountArr = (Account[]) C146021aq.m237852f(aaVar.f83764g.mo117813d());
            int length = accountArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Account account2 = accountArr[i];
                if (TextUtils.equals(account2.name, aaVar.f83758a)) {
                    account = account2;
                    break;
                }
                i++;
            }
        } catch (ExecutionException e) {
            Log.e("ParentToolsFragment", "An exception occurred while retrieving the user account", e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            Log.e("ParentToolsFragment", "An exception occurred while retrieving the user account", e2);
        }
        account = null;
        if (account != null) {
            new C31098d(aaVar.getActivity(), account, str, new C31112r(aaVar), new C31113s(aaVar), aaVar.f83764g).run();
            return;
        }
        C0167am activity = aaVar.getActivity();
        if (activity != null) {
            ((C31117w) activity).mo36835y(2, BuildConfig.FLAVOR);
            activity.runOnUiThread(new C31114t(aaVar));
        }
    }
}
