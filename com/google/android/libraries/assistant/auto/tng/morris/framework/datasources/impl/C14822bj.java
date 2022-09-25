package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bj */
/* compiled from: PG */
public final /* synthetic */ class C14822bj implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C14828bp f44642a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f44643b;

    public /* synthetic */ C14822bj(C14828bp bpVar, ComponentName componentName) {
        this.f44642a = bpVar;
        this.f44643b = componentName;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C14828bp bpVar = this.f44642a;
        ComponentName componentName = this.f44643b;
        C14824bl blVar = new C14824bl(bpVar, componentName, cVar);
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.media.browse.SEARCH_SUPPORTED", true);
        bundle.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
        if (bpVar.f44659e.mo79745c(C90069du.f249735m).contains(componentName.getPackageName())) {
            C59104x b = C14828bp.f44655a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.MediaBrwsrClnt");
            ((C59052c) ((C59052c) b).mo56372aa(45575)).mo56386p("#connectMediaBrowse() Set driving mode");
            bundle.putBoolean("android.media.browse.ASSISTANT_DRIVING_MODE", true);
        }
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(bpVar.f44656b, componentName, blVar, bundle);
        blVar.f44650f = mediaBrowserCompat;
        blVar.mo21759f();
        mediaBrowserCompat.mo800d();
        return "mediabrowse.connect";
    }
}
