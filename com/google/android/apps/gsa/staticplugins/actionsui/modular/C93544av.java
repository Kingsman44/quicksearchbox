package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.shared.util.p7159c.C90879am;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a.C93514f;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.av */
/* compiled from: PG */
public abstract class C93544av extends C93666w implements C73867g {

    /* renamed from: a */
    boolean f261191a;

    /* renamed from: b */
    private C93514f f261192b;

    /* renamed from: c */
    private final C93543au f261193c;

    public C93544av(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        return caVar.mo85138c(new C90879am("DeviceSettingsArgumentView#ActionCardHistoryProtoTask", 1, 8, new C93541as(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Drawable mo87909b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C93514f mo87910c();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C93514f mo87956g() {
        if (this.f261192b == null) {
            this.f261192b = mo87910c();
        }
        return this.f261192b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo87957h(C93514f fVar) {
        if (!this.f261191a) {
            fVar.mo87932h(this.f261193c, getContext());
            this.f261191a = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo87732f();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo87956g().mo87933j(getContext());
        this.f261191a = false;
    }

    public C93544av(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C93544av(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261193c = new C93543au(this);
    }
}
