package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.net.Uri;
import androidx.slice.C4110i;
import androidx.slice.Slice;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.o */
/* compiled from: PG */
public final /* synthetic */ class C129201o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C129205s f354901a;

    /* renamed from: b */
    public final /* synthetic */ Uri f354902b;

    /* renamed from: c */
    public final /* synthetic */ int f354903c;

    public /* synthetic */ C129201o(C129205s sVar, Uri uri, int i) {
        this.f354901a = sVar;
        this.f354902b = uri;
        this.f354903c = i;
    }

    public final C60870cx apply(Object obj) {
        C129205s sVar = this.f354901a;
        Uri uri = this.f354902b;
        int i = this.f354903c;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C4110i iVar = new C4110i(sVar.f354911c, (Slice) optional.get());
            if (iVar.mo8620i()) {
                C59104x d = C129205s.f354910b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
                ((C59052c) ((C59052c) d).mo56372aa(38182)).mo56386p("Failed to load the slice, Error Slice.");
                return C60856cj.m92900i(Optional.empty());
            } else if (iVar.mo8612a() == 2) {
                return C60856cj.m92900i(optional);
            }
        }
        return sVar.mo108904e(uri, i + 1);
    }
}
