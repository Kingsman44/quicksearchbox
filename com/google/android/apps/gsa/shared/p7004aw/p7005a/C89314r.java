package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import android.webkit.ValueCallback;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.r */
/* compiled from: PG */
public final /* synthetic */ class C89314r implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C89315s f242135a;

    public /* synthetic */ C89314r(C89315s sVar) {
        this.f242135a = sVar;
    }

    public final void onReceiveValue(Object obj) {
        C89315s sVar = this.f242135a;
        if (!Boolean.parseBoolean((String) obj)) {
            return;
        }
        if (!sVar.f242139c.mo56113h() || sVar.f242138b.mo26871c() - ((Long) sVar.f242139c.mo56107c()).longValue() >= 3000) {
            sVar.f242139c = C58833ax.m90834k(Long.valueOf(sVar.f242138b.mo26871c()));
            sVar.f242137a.evaluateJavascript("window.scrollTo({top: document.getElementsByTagName('googleHighlightingMark')[0].getBoundingClientRect().top + scrollY - window.innerHeight/2, behavior: 'smooth'})", (ValueCallback) null);
        }
    }
}
