package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124825a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124827c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.android.p10712d.C142324bc;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.y */
/* compiled from: PG */
public final class C124981y {

    /* renamed from: a */
    public static final C59071e f344854a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.y");

    /* renamed from: b */
    public final DeviceCustomizeInfoFragment f344855b;

    /* renamed from: c */
    public final C46439e f344856c;

    /* renamed from: d */
    public final C46855i f344857d;

    /* renamed from: e */
    public final C124848bs f344858e;

    /* renamed from: f */
    public final C124922s f344859f;

    /* renamed from: g */
    public final C124983z f344860g = new C124983z(this);

    /* renamed from: h */
    public final C124982a f344861h = new C124982a();

    /* renamed from: i */
    private final C46485f f344862i;

    /* renamed from: j */
    private final C47770dh f344863j;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.y$a */
    /* compiled from: PG */
    final class C124982a implements C46852f, C46440f {
        public C124982a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x c = C124981y.f344854a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceCustomizeFrag");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36318)).mo56384n();
            C124981y.this.mo106760b();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C124981y.this.mo106759a((C142324bc) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C142324bc.f386113s, C62921ba.m95368a()));
        }

        /* renamed from: h */
        public final void mo20960h(Throwable th) {
            C59104x c = C124981y.f344854a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceCustomizeFrag");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36319)).mo56384n();
            C124981y.this.mo106760b();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }

        /* renamed from: j */
        public final /* synthetic */ void mo20961j(Object obj) {
            C124981y.this.mo106759a((C142324bc) obj);
        }
    }

    public C124981y(DeviceCustomizeInfoFragment deviceCustomizeInfoFragment, C124848bs bsVar, C46485f fVar, C46439e eVar, C46855i iVar, C124922s sVar, C47770dh dhVar) {
        this.f344858e = bsVar;
        this.f344855b = deviceCustomizeInfoFragment;
        this.f344862i = fVar;
        this.f344856c = eVar;
        this.f344857d = iVar;
        this.f344859f = sVar;
        this.f344863j = dhVar;
    }

    /* renamed from: a */
    public final void mo106759a(C142324bc bcVar) {
        C59104x b = f344854a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DeviceCustomizeFrag");
        ((C59052c) ((C59052c) b).mo56372aa(36320)).mo56386p("Received DCI");
        OobeActivityViewModel oobeActivityViewModel = (OobeActivityViewModel) new C2368bp(this.f344855b.requireActivity()).mo5770a(OobeActivityViewModel.class);
        oobeActivityViewModel.f344276c = bcVar;
        oobeActivityViewModel.mo106637a().mo106662b("DeviceCustomizeInfo-Downloaded");
        this.f344862i.mo50482c(this.f344855b).mo50509e(R.id.assistant_bisto_oobe_next, this.f344858e);
    }

    /* renamed from: b */
    public final void mo106760b() {
        C124825a a = ((OobeActivityViewModel) new C2368bp(this.f344855b.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a();
        a.mo106662b("DeviceCustomizeInfo-Failed");
        C60103kw kwVar = ((C124827c) a).f344386b;
        int i = ((C60106kz) kwVar.instance).f162543k;
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        kzVar.f162533a |= 8192;
        kzVar.f162543k = i + 1;
        C44581b b = C124849bt.m204631b(this.f344855b.requireContext());
        b.mo47604w(R.string.assistant_bisto_error_device_info_download_failure_title);
        b.mo47597p(R.string.assistant_bisto_error_device_info_download_failure);
        b.mo47601t(R.string.assistant_bisto_try_again_button, new C47752cq(this.f344863j, "retry", new C124926w(this)));
        b.mo47598q(R.string.assistant_bisto_generic_cancel_button, new C47752cq(this.f344863j, "cancel", new C124980x(this)));
        b.create().show();
    }
}
