package com.google.android.libraries.surveys.internal.p3323c.p3324a;

import android.content.Context;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.pseudonymous.C145767c;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.surveys.internal.c.a.a */
/* compiled from: PG */
public final class C43036a {

    /* renamed from: a */
    private final Context f112569a;

    public C43036a(Context context) {
        this.f112569a = context;
    }

    /* renamed from: a */
    public final String mo46059a() {
        String str = BuildConfig.FLAVOR;
        try {
            str = "NID=" + ((PseudonymousIdToken) C146021aq.m237853g(C145767c.m237060a(this.f112569a).mo121929a(), 1000, TimeUnit.MILLISECONDS)).f394099a;
            int i = C43066o.f112626a;
            return str;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task was interrupted while fetching Zwieback ID.", e);
            return str;
        } catch (ExecutionException e2) {
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task failed while fetching Zwieback ID.", e2);
            return str;
        } catch (TimeoutException e3) {
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task timed out while fetching Zwieback ID.", e3);
            return str;
        }
    }
}
