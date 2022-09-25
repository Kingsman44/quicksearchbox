package com.google.apps.tiktok.tracing.contrib.p3702d;

import androidx.media3.common.C2590aq;
import androidx.media3.common.C2593at;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2642bd;
import androidx.media3.common.C2643be;
import androidx.media3.common.C2644bf;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2672p;
import androidx.media3.common.Metadata;
import androidx.media3.common.p135a.C2568d;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.tracing.contrib.d.p */
/* compiled from: PG */
public final class C47655p implements C2644bf {

    /* renamed from: a */
    final /* synthetic */ C2644bf f123602a;

    /* renamed from: b */
    final /* synthetic */ C47656q f123603b;

    public C47655p(C47656q qVar, C2644bf bfVar) {
        this.f123603b = qVar;
        this.f123602a = bfVar;
    }

    /* renamed from: A */
    public final /* synthetic */ void mo6220A(boolean z) {
    }

    /* renamed from: B */
    public final /* synthetic */ void mo6221B(int i, int i2) {
    }

    /* renamed from: C */
    public final void mo6222C(C2651bm bmVar, int i) {
        this.f123603b.mo51538a(new C47641b(this.f123602a, bmVar, i), "onTimelineChanged");
    }

    /* renamed from: D */
    public final void mo6223D(C2657bs bsVar) {
        this.f123603b.mo51538a(new C47643d(this.f123602a, bsVar), "onTracksChanged");
    }

    /* renamed from: E */
    public final /* synthetic */ void mo6224E(C2658bt btVar) {
    }

    /* renamed from: F */
    public final /* synthetic */ void mo6225F(float f) {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6226a(C2664h hVar) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6227b(C2642bd bdVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6228c(C2568d dVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6229d(List list) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo6230e(C2672p pVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo6231f(int i, boolean z) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo6232g(C2646bh bhVar, C2643be beVar) {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo6233h(boolean z) {
    }

    /* renamed from: i */
    public final void mo6234i(boolean z) {
        this.f123603b.mo51538a(new C47650k(this.f123602a, z), "onIsPlayingChanged");
    }

    /* renamed from: j */
    public final void mo6235j(boolean z) {
        this.f123603b.mo51538a(new C47649j(this.f123602a, z), "onLoadingChanged");
    }

    /* renamed from: k */
    public final void mo6236k(C2590aq aqVar, int i) {
        this.f123603b.mo51538a(new C47652m(this.f123602a, aqVar, i), "onMediaItemTransition");
    }

    /* renamed from: l */
    public final /* synthetic */ void mo6237l(C2593at atVar) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo6238m(Metadata metadata) {
    }

    /* renamed from: n */
    public final void mo6239n(boolean z, int i) {
        this.f123603b.mo51538a(new C47642c(this.f123602a, z, i), "onPlayWhenReadyChanged");
    }

    /* renamed from: o */
    public final void mo6240o(C2640bb bbVar) {
        this.f123603b.mo51538a(new C47640a(this.f123602a, bbVar), "onPlaybackParametersChanged");
    }

    /* renamed from: p */
    public final void mo6241p(int i) {
        this.f123603b.mo51538a(new C47645f(this.f123602a, i), "onPlaybackStateChanged");
    }

    /* renamed from: q */
    public final void mo6242q(int i) {
        this.f123603b.mo51538a(new C47648i(this.f123602a, i), "onPlaybackSuppressionReasonChanged");
    }

    /* renamed from: r */
    public final void mo6243r(C2639ba baVar) {
        this.f123603b.mo51538a(new C47644e(this.f123602a, baVar), "onPlayerError");
    }

    /* renamed from: s */
    public final /* synthetic */ void mo6244s(C2639ba baVar) {
    }

    /* renamed from: t */
    public final void mo6245t(boolean z, int i) {
        this.f123603b.mo51538a(new C47653n(this.f123602a, z, i), "onPlayerStateChanged");
    }

    /* renamed from: u */
    public final /* synthetic */ void mo6246u(int i) {
    }

    /* renamed from: v */
    public final void mo6247v(C2645bg bgVar, C2645bg bgVar2, int i) {
        this.f123603b.mo51538a(new C47651l(this.f123602a, bgVar, bgVar2, i), "onPositionDiscontinuity");
    }

    /* renamed from: w */
    public final /* synthetic */ void mo6248w() {
    }

    /* renamed from: x */
    public final void mo6249x(int i) {
        this.f123603b.mo51538a(new C47654o(this.f123602a, i), "onRepeatModeChanged");
    }

    /* renamed from: y */
    public final void mo6250y() {
        C47656q qVar = this.f123603b;
        C2644bf bfVar = this.f123602a;
        Objects.requireNonNull(bfVar);
        qVar.mo51538a(new C47646g(bfVar), "onSeekProcessed");
    }

    /* renamed from: z */
    public final void mo6251z(boolean z) {
        this.f123603b.mo51538a(new C47647h(this.f123602a, z), "onShuffleModeEnabledChanged");
    }
}
