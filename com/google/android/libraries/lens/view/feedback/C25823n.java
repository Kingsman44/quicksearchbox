package com.google.android.libraries.lens.view.feedback;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60887da;
import com.google.p4017at.p4056g.p4057a.p4058a.C54066r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.feedback.n */
/* compiled from: PG */
public final class C25823n {

    /* renamed from: a */
    public static final C58974d f70163a = C58974d.m91135i("FeedbackPreviewFragment");

    /* renamed from: b */
    public final C25815f f70164b;

    /* renamed from: c */
    public final boolean f70165c;

    /* renamed from: d */
    public final Activity f70166d;

    /* renamed from: e */
    public final C25830t f70167e;

    /* renamed from: f */
    public final C46439e f70168f;

    /* renamed from: g */
    public final C60887da f70169g;

    /* renamed from: h */
    public final C60887da f70170h;

    /* renamed from: i */
    public boolean f70171i;

    /* renamed from: j */
    public String f70172j;

    /* renamed from: k */
    public C25829s f70173k;

    /* renamed from: l */
    public final C46440f f70174l = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C58970a) ((C58970a) ((C58970a) C25823n.f70163a.mo56226d()).mo56382g(th)).mo56372aa(49346)).mo56386p("Failed to take screenshot for feedback.");
            C25823n nVar = C25823n.this;
            if (nVar.f70165c) {
                C25829s sVar = nVar.f70173k;
                sVar.getClass();
                nVar.mo30978b(sVar);
                return;
            }
            C25830t tVar = nVar.f70167e;
            tVar.getClass();
            String str = nVar.f70172j;
            str.getClass();
            C25829s sVar2 = nVar.f70173k;
            sVar2.getClass();
            tVar.mo30979a(str, sVar2);
            C25815f fVar = C25823n.this.f70164b;
            fVar.getClass();
            fVar.dismiss();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Bundle bundle = (Bundle) obj2;
            C25829s sVar = C25823n.this.f70173k;
            sVar.getClass();
            C25828r a = sVar.mo30960a();
            Parcelable parcelable = bundle.getParcelable("client_image");
            if (parcelable != null) {
                a.mo30958b((C54066r) ((ProtoParsers.ParcelableProto) parcelable).mo58938a(C54066r.f141866d, C62921ba.m95368a()));
            } else {
                ((C58970a) ((C58970a) C25823n.f70163a.mo56224b()).mo56372aa(49347)).mo56386p("ClientImage proto is null!");
            }
            a.mo30959c((Bitmap) bundle.getParcelable("screenshot"));
            C25829s a2 = a.mo30957a();
            C25823n nVar = C25823n.this;
            if (nVar.f70165c) {
                nVar.mo30978b(a2);
                return;
            }
            C25830t tVar = nVar.f70167e;
            tVar.getClass();
            String str = nVar.f70172j;
            str.getClass();
            a2.getClass();
            tVar.mo30979a(str, a2);
            C25815f fVar = C25823n.this.f70164b;
            fVar.getClass();
            fVar.dismiss();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: m */
    private final C47770dh f70175m;

    public C25823n(C25815f fVar, C25817h hVar, Activity activity, C25830t tVar, C46439e eVar, C47770dh dhVar, C60887da daVar, C60887da daVar2) {
        this.f70164b = fVar;
        this.f70165c = hVar.f70155a;
        this.f70166d = activity;
        this.f70167e = tVar;
        this.f70168f = eVar;
        this.f70175m = dhVar;
        this.f70169g = daVar;
        this.f70170h = daVar2;
    }

    /* renamed from: a */
    public static C25815f m47649a(AccountId accountId, boolean z) {
        C25816g gVar = (C25816g) C25817h.f70153b.createBuilder();
        gVar.copyOnWrite();
        ((C25817h) gVar.instance).f70155a = z;
        C25815f fVar = new C25815f();
        C68324h.m98669f(fVar);
        C47247a.m84047b(fVar, accountId);
        C47243l.m84039a(fVar, (C25817h) gVar.build());
        return fVar;
    }

    /* renamed from: b */
    public final void mo30978b(C25829s sVar) {
        Bitmap a = ((C25827q) sVar.mo30962c().mo56107c()).mo30948a();
        ImageView imageView = (ImageView) this.f70164b.requireDialog().findViewById(R.id.lens_feedback_preview_raw_image);
        imageView.getClass();
        imageView.setImageBitmap(a);
        C58833ax j = sVar.mo30971j();
        if (j.mo56113h()) {
            ImageView imageView2 = (ImageView) this.f70164b.requireDialog().findViewById(R.id.lens_feedback_preview_screenshot_image);
            imageView2.getClass();
            imageView2.setImageBitmap((Bitmap) j.mo56107c());
        }
        this.f70164b.requireDialog().findViewById(R.id.lens_feedback_preview_continue_button).setOnClickListener(new C47591co(this.f70175m, "Click continue", new C25820k(this, sVar)));
    }
}
