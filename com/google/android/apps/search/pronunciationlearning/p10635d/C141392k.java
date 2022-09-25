package com.google.android.apps.search.pronunciationlearning.p10635d;

import android.os.Bundle;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d.k */
/* compiled from: PG */
public final /* synthetic */ class C141392k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C141399r f383813a;

    /* renamed from: b */
    public final /* synthetic */ String f383814b;

    public /* synthetic */ C141392k(C141399r rVar, String str) {
        this.f383813a = rVar;
        this.f383814b = str;
    }

    public final C60870cx apply(Object obj) {
        C141399r rVar = this.f383813a;
        String str = this.f383814b;
        Void voidR = (Void) obj;
        C60870cx a = C2169h.m6027a(new C141396o(rVar));
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.tts:UseGoogleOnlyVoice", "hol");
        C141382a aVar = rVar.f383823b;
        String str2 = rVar.f383828g;
        str2.getClass();
        aVar.mo116399b(str, bundle, str2);
        return a;
    }
}
