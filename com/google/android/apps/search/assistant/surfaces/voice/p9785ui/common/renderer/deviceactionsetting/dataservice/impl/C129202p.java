package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.net.Uri;
import androidx.slice.C4110i;
import androidx.slice.Slice;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.p */
/* compiled from: PG */
public final /* synthetic */ class C129202p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C129205s f354904a;

    /* renamed from: b */
    public final /* synthetic */ Uri f354905b;

    public /* synthetic */ C129202p(C129205s sVar, Uri uri) {
        this.f354904a = sVar;
        this.f354905b = uri;
    }

    public final void accept(Object obj) {
        C129205s sVar = this.f354904a;
        Uri uri = this.f354905b;
        Slice slice = (Slice) obj;
        if (slice != null) {
            C4110i iVar = new C4110i(sVar.f354911c, slice);
            if (iVar.mo8620i()) {
                C59104x d = C129205s.f354910b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
                ((C59052c) ((C59052c) d).mo56372aa(38197)).mo56386p("Received error slice.");
            } else if (iVar.mo8612a() != 2) {
                C59104x d2 = C129205s.f354910b.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
                ((C59052c) ((C59052c) d2).mo56372aa(38196)).mo56386p("Slice not yet fully loaded.");
            } else {
                C59104x b = C129205s.f354910b.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
                ((C59052c) ((C59052c) b).mo56372aa(38191)).mo56389s("onSliceUpdated, slice: %s", slice);
                try {
                    sVar.mo108903d(uri, slice);
                    return;
                } catch (Throwable th) {
                    C59104x d3 = C129205s.f354910b.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
                    ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(th)).mo56372aa(38192)).mo56386p("failed to update the cache.");
                    return;
                }
            }
        }
        C59104x b2 = C129205s.f354910b.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SettingSliceDataService");
        ((C59052c) ((C59052c) b2).mo56372aa(38190)).mo56386p("skip update, invalid new slice.");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
