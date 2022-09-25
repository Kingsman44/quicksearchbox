package com.google.android.apps.search.webglide.webcontent;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.webglide.p10699b.C142176g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.shared.p3441a.C44078b;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63077o;

/* compiled from: PG */
public final class ExternalUrlLauncher implements C43773b {

    /* renamed from: a */
    public static final C59071e f385880a = C59071e.m91332i("com.google.android.apps.search.webglide.webcontent.ExternalUrlLauncher");

    /* renamed from: b */
    public final Fragment f385881b;

    /* renamed from: c */
    public final PackageManager f385882c;

    /* renamed from: d */
    public final C44080d f385883d;

    /* renamed from: e */
    public final AccountId f385884e;

    /* renamed from: f */
    public final C39141kp f385885f;

    /* renamed from: g */
    public final C142176g f385886g;

    /* renamed from: h */
    private final RequestBlockMixin f385887h;

    /* renamed from: i */
    private final C43262m f385888i;

    /* renamed from: j */
    private final boolean f385889j;

    public ExternalUrlLauncher(Fragment fragment, RequestBlockMixin requestBlockMixin, PackageManager packageManager, C44078b bVar, C43262m mVar, AccountId accountId, boolean z, C39141kp kpVar, C142176g gVar) {
        this.f385881b = fragment;
        this.f385887h = requestBlockMixin;
        this.f385882c = packageManager;
        this.f385883d = bVar.mo47044a(C44082a.f114755a, "WebGlide GAB Browser Launched State", C63077o.m96099a(false));
        this.f385888i = mVar;
        this.f385884e = accountId;
        this.f385889j = z;
        this.f385885f = kpVar;
        this.f385886g = gVar;
    }

    /* renamed from: g */
    public final void mo117078g(Intent intent) {
        try {
            this.f385881b.requireContext().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f385880a.mo56226d()).mo56382g(e)).mo56372aa(42044)).mo56386p("Failed to start activity with generic intent.");
            ((C19567d) this.f385885f.f103012dk.mo6453a()).mo24822a(1, new Object[0]);
            View findViewById = this.f385881b.getActivity() != null ? this.f385881b.requireActivity().findViewById(16908290) : null;
            if (findViewById != null) {
                Snackbar.m79660p(findViewById, R.string.webglide_unable_to_open_link, -1).mo48343h();
            }
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f385889j) {
            this.f385887h.mo46748c(R.id.webglide_external_links, C142242a.f385890a, new C142243b(this));
        }
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        if (((C63077o) this.f385883d.mo47045a()).f170230a) {
            this.f385883d.mo47046b(C63077o.m96099a(false));
            this.f385888i.mo46336e();
        }
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
