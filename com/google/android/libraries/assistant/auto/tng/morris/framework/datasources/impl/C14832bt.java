package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.media.session.MediaController;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bt */
/* compiled from: PG */
public final /* synthetic */ class C14832bt implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C14842cc f44666a;

    /* renamed from: b */
    public final /* synthetic */ MediaController f44667b;

    public /* synthetic */ C14832bt(C14842cc ccVar, MediaController mediaController) {
        this.f44666a = ccVar;
        this.f44667b = mediaController;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C14842cc ccVar = this.f44666a;
        MediaController mediaController = this.f44667b;
        C14828bp bpVar = ccVar.f44684c;
        Optional empty = Optional.empty();
        C58485gu c = bpVar.f44659e.mo79745c(C90051dc.f248878bg);
        Bundle extras = mediaController.getExtras();
        String str = BuildConfig.FLAVOR;
        if (extras != null && !TextUtils.isEmpty(extras.getString("android.media.session.BROWSE_SERVICE", str))) {
            str = extras.getString("android.media.session.BROWSE_SERVICE", str);
        } else if (bpVar.f44659e.mo79746e(C90051dc.f248822ad)) {
            str = bpVar.f44658d.mo22272h(mediaController.getPackageName());
        }
        if (!TextUtils.isEmpty(str)) {
            empty = Optional.m71637of(new ComponentName(mediaController.getPackageName(), str));
        }
        if (!empty.isPresent() || (!c.isEmpty() && !c.contains(mediaController.getPackageName()))) {
            C59104x d = C14828bp.f44655a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MediaBrwsrClnt");
            ((C59052c) ((C59052c) d).mo56372aa(45574)).mo56389s("Component name could not be found for %s", mediaController.getPackageName());
            return C60856cj.m92900i(new C14784a(Optional.empty(), bpVar.mo21760a(mediaController)));
        }
        return C47633f.m84733g(bpVar.mo21761b((ComponentName) empty.get())).mo51517j(3000, TimeUnit.MILLISECONDS, bpVar.f44657c).mo51513e(Throwable.class, new C14823bk(bpVar, mediaController), C60826bg.f164896a);
    }
}
