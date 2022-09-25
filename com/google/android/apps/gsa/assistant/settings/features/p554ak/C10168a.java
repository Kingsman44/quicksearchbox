package com.google.android.apps.gsa.assistant.settings.features.p554ak;

import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.assistant.p1535p.C18509a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ak.a */
/* compiled from: PG */
public final /* synthetic */ class C10168a implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C10171c f34573a;

    public /* synthetic */ C10168a(C10171c cVar) {
        this.f34573a = cVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C10171c cVar = this.f34573a;
        C91097g f = cVar.mo17793f();
        if (f == null) {
            return true;
        }
        C18509a aVar = (C18509a) cVar.f34575i.mo17428b();
        aVar.mo24024f("voice_and_video_calls");
        f.mo65090b(aVar.mo24020b().mo24031a(), new C91095e());
        return true;
    }
}
