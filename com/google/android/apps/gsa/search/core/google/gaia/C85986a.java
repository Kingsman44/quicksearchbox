package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.libraries.gcoreclient.p1757e.C21489a;
import com.google.android.libraries.gcoreclient.p1757e.C21496e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.a */
/* compiled from: PG */
public final class C85986a implements C86049j {

    /* renamed from: a */
    private final AccountManager f232503a;

    public C85986a(AccountManager accountManager) {
        this.f232503a = accountManager;
    }

    /* renamed from: a */
    public final void mo79642a(String str) {
        this.f232503a.invalidateAuthToken("com.google", str);
    }

    /* renamed from: b */
    public final void mo79643b() {
    }

    /* renamed from: c */
    public final String mo79644c(Account account, String str, C91032p pVar) {
        try {
            pVar.mo85308a("AccountManagerGoogleAuthAdapter: get token");
            String blockingGetAuthToken = this.f232503a.blockingGetAuthToken(account, str, true);
            pVar.mo85310c();
            if (blockingGetAuthToken != null) {
                return blockingGetAuthToken;
            }
            throw new C21489a("AccountManager returned a null token");
        } catch (OperationCanceledException e) {
            throw new IOException(e);
        } catch (AuthenticatorException e2) {
            if (e2.getMessage() != null) {
                throw new C21496e(e2.getMessage(), e2);
            }
            throw new C21496e(BuildConfig.FLAVOR, e2);
        } catch (NullPointerException | SecurityException e3) {
            throw new C21489a(e3);
        } catch (Throwable th) {
            pVar.mo85310c();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r9v10, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo79645d(android.accounts.Account r9, java.lang.String r10, com.google.android.apps.gsa.shared.util.debug.C91032p r11) {
        /*
            r8 = this;
            java.lang.String r0 = "AccountManagerGoogleAuthAdapter: get token"
            r11.mo85308a(r0)     // Catch:{ OperationCanceledException -> 0x0059, AuthenticatorException -> 0x0050, NullPointerException -> 0x0049, SecurityException -> 0x0047 }
            android.accounts.AccountManager r1 = r8.f232503a     // Catch:{ OperationCanceledException -> 0x0059, AuthenticatorException -> 0x0050, NullPointerException -> 0x0049, SecurityException -> 0x0047 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r10
            android.accounts.AccountManagerFuture r9 = r1.getAuthToken(r2, r3, r4, r5, r6, r7)     // Catch:{ OperationCanceledException -> 0x0059, AuthenticatorException -> 0x0050, NullPointerException -> 0x0049, SecurityException -> 0x0047 }
            java.lang.Object r9 = r9.getResult()     // Catch:{ OperationCanceledException -> 0x0059, AuthenticatorException -> 0x0050, NullPointerException -> 0x0049, SecurityException -> 0x0047 }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ OperationCanceledException -> 0x0059, AuthenticatorException -> 0x0050, NullPointerException -> 0x0049, SecurityException -> 0x0047 }
            r10 = 0
            if (r9 == 0) goto L_0x0021
            java.lang.String r0 = "authtoken"
            java.lang.String r0 = r9.getString(r0)     // Catch:{ OperationCanceledException -> 0x0059, AuthenticatorException -> 0x0050, NullPointerException -> 0x0049, SecurityException -> 0x0047 }
            goto L_0x0022
        L_0x0021:
            r0 = r10
        L_0x0022:
            r11.mo85310c()
            if (r0 != 0) goto L_0x0044
            if (r9 == 0) goto L_0x0032
            java.lang.String r10 = "intent"
            android.os.Parcelable r9 = r9.getParcelable(r10)
            r10 = r9
            android.content.Intent r10 = (android.content.Intent) r10
        L_0x0032:
            if (r10 == 0) goto L_0x003c
            com.google.android.libraries.gcoreclient.e.d r9 = new com.google.android.libraries.gcoreclient.e.d
            java.lang.String r11 = "AccountManager returned a recovery intent"
            r9.<init>(r11, r10)
            throw r9
        L_0x003c:
            com.google.android.libraries.gcoreclient.e.a r9 = new com.google.android.libraries.gcoreclient.e.a
            java.lang.String r10 = "AccountManager returned a null token"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x0044:
            return r0
        L_0x0045:
            r9 = move-exception
            goto L_0x0060
        L_0x0047:
            r9 = move-exception
            goto L_0x004a
        L_0x0049:
            r9 = move-exception
        L_0x004a:
            com.google.android.libraries.gcoreclient.e.a r10 = new com.google.android.libraries.gcoreclient.e.a     // Catch:{ all -> 0x0045 }
            r10.<init>((java.lang.Throwable) r9)     // Catch:{ all -> 0x0045 }
            throw r10     // Catch:{ all -> 0x0045 }
        L_0x0050:
            r9 = move-exception
            com.google.android.libraries.gcoreclient.e.a r10 = new com.google.android.libraries.gcoreclient.e.a     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "Authenticator exception"
            r10.<init>(r0, r9)     // Catch:{ all -> 0x0045 }
            throw r10     // Catch:{ all -> 0x0045 }
        L_0x0059:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            r10.<init>(r9)     // Catch:{ all -> 0x0045 }
            throw r10     // Catch:{ all -> 0x0045 }
        L_0x0060:
            r11.mo85310c()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.gaia.C85986a.mo79645d(android.accounts.Account, java.lang.String, com.google.android.apps.gsa.shared.util.debug.p):java.lang.String");
    }
}
