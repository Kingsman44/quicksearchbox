package com.google.android.libraries.onegoogle.accountmenu.features;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.C2332ag;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30465f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.g */
/* compiled from: PG */
public final class C30606g extends C30630m {

    /* renamed from: a */
    public Drawable f82676a;

    /* renamed from: b */
    public View.OnClickListener f82677b;

    /* renamed from: c */
    public C30465f f82678c;

    /* renamed from: d */
    public C2332ag f82679d;

    /* renamed from: e */
    private int f82680e;

    /* renamed from: f */
    private String f82681f;

    /* renamed from: g */
    private int f82682g;

    /* renamed from: h */
    private final C58833ax f82683h = C58836b.f156633a;

    /* renamed from: i */
    private byte f82684i;

    /* renamed from: a */
    public final C30631n mo36300a() {
        Drawable drawable;
        String str;
        View.OnClickListener onClickListener;
        C2332ag agVar;
        if (this.f82684i == 3 && (drawable = this.f82676a) != null && (str = this.f82681f) != null && (onClickListener = this.f82677b) != null && (agVar = this.f82679d) != null) {
            return new C30616h(this.f82680e, drawable, str, this.f82682g, onClickListener, this.f82678c, agVar, this.f82683h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f82684i & 1) == 0) {
            sb.append(" id");
        }
        if (this.f82676a == null) {
            sb.append(" icon");
        }
        if (this.f82681f == null) {
            sb.append(" label");
        }
        if ((this.f82684i & 2) == 0) {
            sb.append(" veId");
        }
        if (this.f82677b == null) {
            sb.append(" onClickListener");
        }
        if (this.f82679d == null) {
            sb.append(" trailingTextLiveData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo36301b(Drawable drawable) {
        if (drawable != null) {
            this.f82676a = drawable;
            return;
        }
        throw new NullPointerException("Null icon");
    }

    /* renamed from: c */
    public final void mo36302c(int i) {
        this.f82680e = i;
        this.f82684i = (byte) (this.f82684i | 1);
    }

    /* renamed from: d */
    public final void mo36303d(String str) {
        if (str != null) {
            this.f82681f = str;
            return;
        }
        throw new NullPointerException("Null label");
    }

    /* renamed from: e */
    public final void mo36304e(int i) {
        this.f82682g = i;
        this.f82684i = (byte) (this.f82684i | 2);
    }
}
