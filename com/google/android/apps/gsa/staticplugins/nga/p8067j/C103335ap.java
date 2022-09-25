package com.google.android.apps.gsa.staticplugins.nga.p8067j;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.apps.gsa.assistant.shared.MorrisRunningStatus;
import com.google.android.apps.gsa.nga.api.C74737q;
import com.google.android.apps.gsa.nga.api.C74742z;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.api.ao;
import com.google.android.apps.gsa.nga.api.bq;
import com.google.android.apps.gsa.nga.api.w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104042fg;
import com.google.android.libraries.assistant.p1484g.p1502d.C18155ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4552o.ahi;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.j.ap */
/* compiled from: PG */
public final class C103335ap implements bq, C103349bc, C104042fg, C74742z {

    /* renamed from: a */
    public final C103347ba f288119a;

    /* renamed from: b */
    public NgaState f288120b = null;

    /* renamed from: c */
    public ahi f288121c = null;

    /* renamed from: d */
    private final C22871g f288122d;

    public C103335ap(C22871g gVar, C103347ba baVar) {
        this.f288122d = gVar;
        this.f288119a = baVar;
    }

    /* renamed from: a */
    public final void mo93748a(w wVar) {
        this.f288119a.mo93770d(new C103369s(wVar));
    }

    public final IBinder asBinder() {
        return null;
    }

    /* renamed from: b */
    public final void mo93750b(int i, Duration duration) {
        this.f288119a.mo93771e(new C103327ah(i, duration));
    }

    /* renamed from: c */
    public final void mo93751c(ProtoLiteParcelable protoLiteParcelable) {
        this.f288119a.mo93770d(new C103346b(protoLiteParcelable));
    }

    /* renamed from: d */
    public final void mo93752d(C87739bu buVar) {
        C87739bu buVar2 = C87739bu.UNKNOWN;
        int ordinal = buVar.ordinal();
        mo93753l(ordinal != 68 ? ordinal != 102 ? ordinal != 124 ? buVar.name() : "and.opa.pixel_launcher.qsb" : "and.opa.shellapp" : "android-lockscreen");
    }

    /* renamed from: e */
    public final void mo71119e() {
        this.f288119a.mo93772f(C103322ac.f288101a);
    }

    /* renamed from: f */
    public final void mo71120f() {
        this.f288119a.mo93772f(C103373w.f288191a);
    }

    /* renamed from: g */
    public final void mo71121g(int i) {
        this.f288119a.mo93772f(new C103375y(i));
    }

    /* renamed from: h */
    public final void mo71122h(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, C18155ag agVar) {
        this.f288119a.mo93772f(new C103376z(bundle, assistStructure, assistContent, i, agVar));
    }

    /* renamed from: i */
    public final void mo71123i(Bitmap bitmap) {
        this.f288119a.mo93772f(new C103359i(bitmap));
    }

    /* renamed from: j */
    public final void mo71124j(C74737q qVar) {
        this.f288119a.mo93772f(new C103324ae(qVar));
    }

    /* renamed from: k */
    public final void mo71125k(Bundle bundle, int i) {
        this.f288119a.mo93772f(new C103370t(bundle, i));
    }

    /* renamed from: l */
    public final void mo93753l(String str) {
        this.f288119a.mo93771e(new C103334ao(str));
    }

    /* renamed from: m */
    public final void mo93754m() {
        mo71119e();
    }

    /* renamed from: n */
    public final void mo93755n() {
        this.f288119a.mo93768b(C103374x.f288192a);
    }

    /* renamed from: o */
    public final void mo93756o(MorrisRunningStatus morrisRunningStatus) {
        this.f288119a.mo93770d(new C103329aj(morrisRunningStatus));
    }

    /* renamed from: p */
    public final void mo93757p(String str) {
        this.f288119a.mo93771e(new C103331al(str));
    }

    /* renamed from: q */
    public final void mo93758q(String str, Bundle bundle, boolean z, ao aoVar) {
        this.f288119a.mo93770d(new C103323ad(str, bundle, z, aoVar));
    }

    /* renamed from: r */
    public final void mo93759r(int i) {
        this.f288119a.mo93770d(new C103364n(i));
    }

    /* renamed from: s */
    public final void mo93760s() {
        this.f288119a.mo93771e(C103361k.f288172a);
    }

    /* renamed from: t */
    public final void mo93761t() {
        ahi ahi;
        NgaState ngaState = this.f288120b;
        if (ngaState != null && (ahi = this.f288121c) != null) {
            mo93764w(ngaState, ahi, true);
        }
    }

    /* renamed from: u */
    public final void mo93762u(ProtoLiteParcelable protoLiteParcelable) {
        this.f288119a.mo93770d(new C103355e(protoLiteParcelable));
    }

    /* renamed from: v */
    public final void mo93763v(C83673y yVar, Bundle bundle) {
        this.f288119a.mo93770d(new C103354d(yVar.toByteArray(), bundle));
    }

    /* renamed from: w */
    public final void mo93764w(NgaState ngaState, ahi ahi, boolean z) {
        this.f288122d.mo28212l("[NGA] NgaInteractorConnection::setState", new C103362l(this, ngaState, z, ahi));
    }
}
