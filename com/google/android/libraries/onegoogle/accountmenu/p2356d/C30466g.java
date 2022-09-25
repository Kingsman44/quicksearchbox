package com.google.android.libraries.onegoogle.accountmenu.p2356d;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.d.g */
/* compiled from: PG */
public final class C30466g extends C30462c {

    /* renamed from: a */
    public Drawable f82287a;

    /* renamed from: b */
    public View.OnClickListener f82288b;

    /* renamed from: c */
    public C30465f f82289c;

    /* renamed from: d */
    public LiveData f82290d;

    /* renamed from: e */
    public C58833ax f82291e;

    /* renamed from: f */
    private int f82292f;

    /* renamed from: g */
    private String f82293g;

    /* renamed from: h */
    private int f82294h;

    /* renamed from: i */
    private boolean f82295i;

    /* renamed from: j */
    private C30461b f82296j;

    /* renamed from: k */
    private C58833ax f82297k;

    /* renamed from: l */
    private byte f82298l;

    /* renamed from: m */
    private C30460a f82299m;

    public C30466g() {
        C58836b bVar = C58836b.f156633a;
        this.f82297k = bVar;
        this.f82291e = bVar;
    }

    public C30466g(C30464e eVar) {
        C58836b bVar = C58836b.f156633a;
        this.f82297k = bVar;
        this.f82291e = bVar;
        C30467h hVar = (C30467h) eVar;
        this.f82292f = hVar.f82300a;
        this.f82287a = hVar.f82301b;
        this.f82293g = hVar.f82302c;
        this.f82294h = hVar.f82303d;
        this.f82288b = hVar.f82304e;
        this.f82289c = hVar.f82305f;
        this.f82290d = hVar.f82306g;
        this.f82299m = hVar.f82311l;
        this.f82295i = hVar.f82307h;
        this.f82296j = hVar.f82308i;
        this.f82297k = hVar.f82309j;
        this.f82291e = hVar.f82310k;
        this.f82298l = 7;
    }

    /* renamed from: a */
    public final C30464e mo36048a() {
        Drawable drawable;
        String str;
        View.OnClickListener onClickListener;
        C30461b bVar;
        if (this.f82298l == 7 && (drawable = this.f82287a) != null && (str = this.f82293g) != null && (onClickListener = this.f82288b) != null && (bVar = this.f82296j) != null) {
            return new C30467h(this.f82292f, drawable, str, this.f82294h, onClickListener, this.f82289c, this.f82290d, this.f82299m, this.f82295i, bVar, this.f82297k, this.f82291e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f82298l & 1) == 0) {
            sb.append(" id");
        }
        if (this.f82287a == null) {
            sb.append(" icon");
        }
        if (this.f82293g == null) {
            sb.append(" label");
        }
        if ((this.f82298l & 2) == 0) {
            sb.append(" veId");
        }
        if (this.f82288b == null) {
            sb.append(" onClickListener");
        }
        if ((this.f82298l & 4) == 0) {
            sb.append(" visibleOnIncognito");
        }
        if (this.f82296j == null) {
            sb.append(" actionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo36049b(C30461b bVar) {
        if (bVar != null) {
            this.f82296j = bVar;
            return;
        }
        throw new NullPointerException("Null actionType");
    }

    /* renamed from: c */
    public final void mo36050c(C58833ax axVar) {
        if (axVar != null) {
            this.f82297k = axVar;
            return;
        }
        throw new NullPointerException("Null availabilityChecker");
    }

    /* renamed from: d */
    public final void mo36051d(C30460a aVar) {
        this.f82299m = aVar;
    }

    /* renamed from: e */
    public final void mo36052e(Drawable drawable) {
        if (drawable != null) {
            this.f82287a = drawable;
            return;
        }
        throw new NullPointerException("Null icon");
    }

    /* renamed from: f */
    public final void mo36053f(int i) {
        this.f82292f = i;
        this.f82298l = (byte) (this.f82298l | 1);
    }

    /* renamed from: g */
    public final void mo36054g(String str) {
        if (str != null) {
            this.f82293g = str;
            return;
        }
        throw new NullPointerException("Null label");
    }

    /* renamed from: h */
    public final void mo36055h(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.f82288b = onClickListener;
            return;
        }
        throw new NullPointerException("Null onClickListener");
    }

    /* renamed from: i */
    public final void mo36056i(int i) {
        this.f82294h = i;
        this.f82298l = (byte) (this.f82298l | 2);
    }

    /* renamed from: j */
    public final void mo36057j(C30465f fVar) {
        this.f82289c = fVar;
    }

    /* renamed from: k */
    public final void mo36058k(boolean z) {
        this.f82295i = z;
        this.f82298l = (byte) (this.f82298l | 4);
    }
}
