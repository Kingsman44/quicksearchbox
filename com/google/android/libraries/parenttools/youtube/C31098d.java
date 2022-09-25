package com.google.android.libraries.parenttools.youtube;

import android.accounts.Account;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.google.android.gms.auth.C142915o;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.tasks.C146021aq;

/* renamed from: com.google.android.libraries.parenttools.youtube.d */
/* compiled from: PG */
public final class C31098d implements Runnable {

    /* renamed from: a */
    public final C31112r f83777a;

    /* renamed from: b */
    public final C142915o f83778b;

    /* renamed from: c */
    private final Activity f83779c;

    /* renamed from: d */
    private final Account f83780d;

    /* renamed from: e */
    private final String f83781e;

    /* renamed from: f */
    private final Runnable f83782f;

    /* renamed from: g */
    private Runnable f83783g;

    public C31098d(Activity activity, Account account, String str, C31112r rVar, Runnable runnable, C142915o oVar) {
        this.f83779c = activity;
        this.f83780d = account;
        this.f83781e = str;
        this.f83777a = rVar;
        this.f83782f = runnable;
        this.f83778b = oVar;
    }

    public final void run() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            CookieManager instance = CookieManager.getInstance();
            String str = null;
            if (instance != null) {
                instance.removeAllCookies((ValueCallback) null);
                instance.flush();
            }
            try {
                String concat = "weblogin:continue=".concat(String.valueOf(Uri.encode(this.f83781e)));
                Log.d("ParentToolsAuthTask", "Getting authToken for authTokenType = " + concat);
                String str2 = ((TokenData) C146021aq.m237852f(this.f83778b.mo117812c(this.f83780d, concat, new Bundle()))).f387646b;
                if (TextUtils.isEmpty(str2)) {
                    Log.w("ParentToolsAuthTask", "Could not retrieve a non-empty authToken");
                } else {
                    Log.d("ParentToolsAuthTask", "Loading auth'ed page from authToken = " + str2);
                }
                this.f83783g = new C31097c(this, str2);
                str = str2;
            } catch (Throwable th) {
                Log.e("ParentToolsAuthTask", "An error happened when getting authToken.", th);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f83779c.runOnUiThread(new C31096b(this, str));
                Runnable runnable = this.f83783g;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            ((C31113s) this.f83782f).f83810a.mo36841d();
            return;
        }
        throw new IllegalStateException("Cannot get auth token on the UI thread");
    }
}
