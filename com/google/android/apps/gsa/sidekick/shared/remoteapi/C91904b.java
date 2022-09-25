package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import com.google.android.apps.p489g.p494d.C9277u;
import com.google.p375ai.p378b.C7709ha;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.remoteapi.b */
/* compiled from: PG */
public final class C91904b extends C91914l {

    /* renamed from: a */
    public Integer f256304a;

    /* renamed from: b */
    public Integer f256305b;

    /* renamed from: c */
    public Integer f256306c;

    /* renamed from: d */
    public Integer f256307d;

    /* renamed from: e */
    public C7709ha f256308e;

    /* renamed from: f */
    public C7709ha f256309f;

    /* renamed from: g */
    public Integer f256310g;

    /* renamed from: h */
    public C9277u f256311h;

    public C91904b() {
    }

    public C91904b(StreamRenderData streamRenderData) {
        AutoValue_StreamRenderData autoValue_StreamRenderData = (AutoValue_StreamRenderData) streamRenderData;
        this.f256304a = autoValue_StreamRenderData.f256270a;
        this.f256305b = autoValue_StreamRenderData.f256271b;
        this.f256306c = autoValue_StreamRenderData.f256272c;
        this.f256307d = autoValue_StreamRenderData.f256273d;
        this.f256308e = autoValue_StreamRenderData.f256274e;
        this.f256309f = autoValue_StreamRenderData.f256275f;
        this.f256310g = autoValue_StreamRenderData.f256276g;
        this.f256311h = autoValue_StreamRenderData.f256277h;
    }

    /* renamed from: a */
    public final StreamRenderData mo86554a() {
        return new AutoValue_StreamRenderData(this.f256304a, this.f256305b, this.f256306c, this.f256307d, this.f256308e, this.f256309f, this.f256310g, this.f256311h);
    }

    /* renamed from: b */
    public final void mo86555b(Integer num) {
        this.f256304a = num;
    }

    /* renamed from: c */
    public final void mo86556c(Integer num) {
        this.f256307d = num;
    }

    /* renamed from: d */
    public final void mo86557d(C7709ha haVar) {
        this.f256309f = haVar;
    }

    /* renamed from: e */
    public final void mo86558e(Integer num) {
        this.f256306c = num;
    }

    /* renamed from: f */
    public final void mo86559f(C7709ha haVar) {
        this.f256308e = haVar;
    }

    /* renamed from: g */
    public final void mo86560g(C9277u uVar) {
        this.f256311h = uVar;
    }

    /* renamed from: h */
    public final void mo86561h(Integer num) {
        this.f256305b = num;
    }
}
