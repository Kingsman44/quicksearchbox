package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.net.Uri;
import androidx.slice.Slice;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.q */
/* compiled from: PG */
public final /* synthetic */ class C129203q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C129205s f354906a;

    /* renamed from: b */
    public final /* synthetic */ Uri f354907b;

    public /* synthetic */ C129203q(C129205s sVar, Uri uri) {
        this.f354906a = sVar;
        this.f354907b = uri;
    }

    public final Object apply(Object obj) {
        C129205s sVar = this.f354906a;
        Uri uri = this.f354907b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            sVar.mo108903d(uri, (Slice) optional.get());
            return null;
        }
        C59104x d = C129205s.f354910b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
        ((C59052c) ((C59052c) d).mo56372aa(38189)).mo56389s("Failed to load Slice for %s.", uri);
        return null;
    }
}
