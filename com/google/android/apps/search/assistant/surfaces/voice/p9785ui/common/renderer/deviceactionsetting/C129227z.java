package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import androidx.slice.Slice;
import androidx.slice.widget.SliceView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.z */
/* compiled from: PG */
class C129227z implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C129174aa f354972a;

    public C129227z(C129174aa aaVar) {
        this.f354972a = aaVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C59104x b = C129174aa.f354826a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SettingSliceCard");
            ((C59052c) ((C59052c) b).mo56372aa(38157)).mo56389s("onNewData for Slice, %s", optional.get());
            C129225x xVar = this.f354972a.f354827b;
            xVar.getClass();
            ((SliceView) xVar.requireView().findViewById(R.id.assistant_slice_view)).mo8671f((Slice) optional.get());
            return;
        }
        C59104x d = C129174aa.f354826a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SettingSliceCard");
        ((C59052c) ((C59052c) d).mo56372aa(38156)).mo56389s("Slice is empty: %s.", this.f354972a.f354831f);
    }

    /* renamed from: c */
    public final void mo18079c() {
    }
}
