package com.google.android.libraries.onegoogle.actions;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.actions.d */
/* compiled from: PG */
public final class C30803d extends C30806g {

    /* renamed from: a */
    public Drawable f83113a;

    /* renamed from: b */
    public View.OnClickListener f83114b;

    /* renamed from: c */
    private int f83115c;

    /* renamed from: d */
    private String f83116d;

    /* renamed from: e */
    private int f83117e;

    /* renamed from: f */
    private final C58833ax f83118f = C58836b.f156633a;

    /* renamed from: g */
    private byte f83119g;

    /* renamed from: a */
    public final int mo36488a() {
        if ((this.f83119g & 1) != 0) {
            return this.f83115c;
        }
        throw new IllegalStateException("Property \"id\" has not been set");
    }

    /* renamed from: b */
    public final int mo36489b() {
        if ((this.f83119g & 2) != 0) {
            return this.f83117e;
        }
        throw new IllegalStateException("Property \"veId\" has not been set");
    }

    /* renamed from: c */
    public final C30807h mo36490c() {
        Drawable drawable;
        String str;
        View.OnClickListener onClickListener;
        if (this.f83119g == 3 && (drawable = this.f83113a) != null && (str = this.f83116d) != null && (onClickListener = this.f83114b) != null) {
            return new C30804e(this.f83115c, drawable, str, this.f83117e, onClickListener, this.f83118f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f83119g & 1) == 0) {
            sb.append(" id");
        }
        if (this.f83113a == null) {
            sb.append(" icon");
        }
        if (this.f83116d == null) {
            sb.append(" label");
        }
        if ((this.f83119g & 2) == 0) {
            sb.append(" veId");
        }
        if (this.f83114b == null) {
            sb.append(" onClickListener");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final void mo36491d(int i) {
        this.f83115c = i;
        this.f83119g = (byte) (this.f83119g | 1);
    }

    /* renamed from: e */
    public final void mo36492e(String str) {
        if (str != null) {
            this.f83116d = str;
            return;
        }
        throw new NullPointerException("Null label");
    }

    /* renamed from: f */
    public final void mo36493f(int i) {
        this.f83117e = i;
        this.f83119g = (byte) (this.f83119g | 2);
    }
}
