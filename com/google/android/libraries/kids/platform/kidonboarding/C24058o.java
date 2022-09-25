package com.google.android.libraries.kids.platform.kidonboarding;

import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.view.View;
import android.webkit.WebView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.common.p4526f.C59071e;
import com.google.p4109av.p4114c.p4115a.p4116a.C54612e;
import com.google.p4109av.p4114c.p4115a.p4116a.C54613f;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.o */
/* compiled from: PG */
public final class C24058o {

    /* renamed from: a */
    public static final C59071e f65726a = C59071e.m91331h();

    /* renamed from: b */
    public final C54618k f65727b;

    /* renamed from: c */
    public final C24052i f65728c;

    /* renamed from: d */
    public final C47429i f65729d;

    /* renamed from: e */
    public final C24061r f65730e;

    /* renamed from: f */
    private final C69613f f65731f = new C69747m(new C24057n(this));

    public C24058o(C54618k kVar, C62921ba baVar, C24052i iVar, C47429i iVar2, C24061r rVar) {
        C69664n.m101061g(baVar, "extensionRegistryLite");
        this.f65727b = kVar;
        this.f65728c = iVar;
        this.f65729d = iVar2;
        this.f65730e = rVar;
    }

    /* renamed from: a */
    public final WebView mo29443a(View view) {
        View r = C2043bi.m5589r(view, R.id.web_view);
        C69664n.m101060f(r, "requireViewById(view, R.id.web_view)");
        return (WebView) r;
    }

    /* renamed from: b */
    public final KidOnboardingViewModel mo29444b() {
        return (KidOnboardingViewModel) this.f65731f.mo5768a();
    }

    /* renamed from: c */
    public final void mo29445c(C54613f fVar) {
        C0167am requireActivity = this.f65728c.requireActivity();
        C54612e a = C54612e.m87500a(fVar.f143385b);
        if (a == null) {
            a = C54612e.UNKNOWN;
        }
        int i = C24054k.f65724a[a.ordinal()] == 1 ? -1 : 0;
        Intent intent = new Intent();
        ProtoParsers.m95531n(intent, "com.google.android.libraries.kids.platform.kidonboarding.extra.kidOnboardingOutcomeProto", fVar);
        requireActivity.setResult(i, intent);
        requireActivity.finish();
    }
}
