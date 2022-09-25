package androidx.p201w;

import android.webkit.WebSettings;
import androidx.p201w.p202a.C4325ab;
import androidx.p201w.p202a.C4326ac;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.p5648a.C72563b;

/* renamed from: androidx.w.h */
/* compiled from: PG */
public final class C4364h {
    @Deprecated
    /* renamed from: a */
    public static void m12514a(WebSettings webSettings, int i) {
        if (C4325ab.f13948a.mo9267d()) {
            ((WebSettingsBoundaryInterface) C72563b.m107251a(WebSettingsBoundaryInterface.class, C4326ac.f13951a.f13957a.convertSettings(webSettings))).setForceDarkBehavior(i);
            return;
        }
        throw C4325ab.m12422a();
    }
}
