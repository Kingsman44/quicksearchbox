package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c;
import com.google.android.libraries.p11002ag.C147575e;
import com.google.android.libraries.p11002ag.C147576f;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.C34872a;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35608aa;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.q */
/* compiled from: PG */
public final class C14176q implements C14187c {

    /* renamed from: b */
    private static final C59071e f42939b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.d.a.q");

    /* renamed from: a */
    public BundledMessageNotification f42940a;

    /* renamed from: c */
    private final C34837a f42941c;

    /* renamed from: d */
    private final Executor f42942d;

    /* renamed from: e */
    private final long f42943e;

    public C14176q(C34837a aVar, Executor executor, long j, BundledMessageNotification bundledMessageNotification) {
        this.f42941c = aVar;
        this.f42942d = executor;
        this.f42943e = j;
        this.f42940a = bundledMessageNotification;
    }

    /* renamed from: a */
    public final int mo21513a() {
        return this.f42940a.mo39538a().size();
    }

    /* renamed from: b */
    public final long mo21514b() {
        return this.f42943e;
    }

    /* renamed from: c */
    public final long mo21515c() {
        Optional g = mo21519g();
        if (g.isEmpty() || !((MessageNotification) g.get()).mo39549g().isPresent()) {
            return -1;
        }
        return ((Long) ((MessageNotification) g.get()).mo39549g().get()).longValue();
    }

    /* renamed from: d */
    public final Optional mo21516d(Context context) {
        Optional g = mo21519g();
        if (g.isEmpty() || !((MessageNotification) g.get()).mo39559p().isPresent()) {
            return Optional.empty();
        }
        return Optional.ofNullable(C15375c.m31985c(C15375c.m31984b(((BitmapDrawable) ((Icon) ((MessageNotification) g.get()).mo39559p().get()).loadDrawable(context)).getBitmap())));
    }

    /* renamed from: e */
    public final String mo21517e() {
        Optional g = mo21519g();
        if (g.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        if (((MessageNotification) g.get()).mo39554k().isPresent()) {
            return ((CharSequence) ((MessageNotification) g.get()).mo39554k().get()).toString();
        }
        return ((MessageNotification) g.get()).mo39562s().toString();
    }

    /* renamed from: f */
    public final String mo21518f() {
        if (mo21519g().isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        String u = ((MessageNotification) mo21519g().get()).mo39565u();
        if (u != null) {
            return u;
        }
        C59104x c = f42939b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MessageNotifImpl");
        ((C59052c) ((C59052c) c).mo56372aa(45847)).mo56386p("Missing notification key for the bundledMessageNotification.");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: g */
    public final Optional mo21519g() {
        if (this.f42940a.mo39538a().isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((MessageNotification) C58557jl.m90131l(this.f42940a.mo39538a()));
    }

    /* renamed from: h */
    public final String mo21520h() {
        if (mo21519g().isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return ((MessageNotification) mo21519g().get()).mo39566v();
    }

    /* renamed from: i */
    public final void mo21521i(long j) {
        C34872a aVar = new C34872a();
        aVar.mo39588b((C58485gu) Collection.EL.stream(this.f42940a.mo39538a()).filter(new C14174o(j)).collect(C58370cn.f155946a));
        this.f42940a = aVar.mo39587a();
    }

    /* renamed from: j */
    public final void mo21522j(C14187c cVar) {
        if (cVar instanceof C14176q) {
            this.f42940a = ((C14176q) cVar).f42940a;
        }
    }

    /* renamed from: k */
    public final boolean mo21523k() {
        try {
            C147576f.m240621c().mo124320f(mo21517e(), Locale.getDefault().getCountry());
            return true;
        } catch (C147575e unused) {
            return false;
        }
    }

    /* renamed from: l */
    public final boolean mo21524l() {
        return this.f42940a.mo39538a().isEmpty();
    }

    /* renamed from: m */
    public final boolean mo21525m() {
        Optional g = mo21519g();
        if (g.isEmpty()) {
            return false;
        }
        return ((MessageNotification) g.get()).mo39554k().isPresent();
    }

    /* renamed from: n */
    public final void mo21526n(C35608aa aaVar) {
        aaVar.mo21083c(C58485gu.m89846n(this.f42940a));
    }

    /* renamed from: o */
    public final C60870cx mo21527o(boolean z) {
        C60870cx a = this.f42941c.mo20103a(this.f42940a, 0, z);
        C14175p pVar = C14175p.f42938a;
        return C60922j.m93044g(a, C47810es.m84963c(pVar), this.f42942d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BundledMessageNotification:[\nMessage Id: ");
        sb.append(this.f42943e);
        C58485gu a = this.f42940a.mo39538a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            MessageNotification messageNotification = (MessageNotification) a.get(i);
            sb.append(", messageNotification: [App Name: ");
            sb.append(messageNotification.mo39563t());
            sb.append(", Package Name: ");
            sb.append(messageNotification.mo39566v());
            sb.append(", Sender Name: ");
            sb.append(messageNotification.mo39562s());
            sb.append(", Content Creation Time: ");
            sb.append(messageNotification.mo39549g());
            sb.append(", Post Time: ");
            sb.append(messageNotification.mo39561r());
            sb.append(", Group Name: ");
            sb.append(messageNotification.mo39554k());
            sb.append(", Message: ");
            sb.append(messageNotification.mo39557n());
            sb.append(", System Notification Key: ");
            sb.append(messageNotification.mo39565u());
            sb.append(", Category: ");
            sb.append(messageNotification.mo39546e());
            sb.append("],\n");
        }
        sb.append("]");
        return sb.toString();
    }
}
