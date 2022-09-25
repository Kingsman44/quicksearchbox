package com.google.android.libraries.lens.view.gallery.p2111d;

import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.ViewGroup;
import com.google.android.libraries.lens.view.gallery.data.C26403v;
import com.google.android.libraries.lens.view.gallery.data.C26404w;
import com.google.android.libraries.lens.view.gallery.data.C26405x;
import com.google.android.libraries.lens.view.gallery.p2110c.C26336d;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.g */
/* compiled from: PG */
public final class C26361g extends C0640fb {

    /* renamed from: a */
    public C26405x f71661a;

    /* renamed from: b */
    public C58485gu f71662b;

    /* renamed from: c */
    private final C26403v f71663c;

    /* renamed from: d */
    private final boolean f71664d;

    /* renamed from: e */
    private final C21370a f71665e;

    /* renamed from: f */
    private final C47449e f71666f;

    /* renamed from: g */
    private final C28443m f71667g;

    /* renamed from: h */
    private final C26336d f71668h;

    /* renamed from: i */
    private final C47770dh f71669i;

    /* renamed from: j */
    private final C26354ap f71670j;

    public C26361g(C26403v vVar, C26405x xVar, C58485gu guVar, int i, C21370a aVar, Fragment fragment, C47449e eVar, C28443m mVar, C26336d dVar, C47770dh dhVar, C28306ab abVar) {
        this.f71663c = vVar;
        this.f71661a = xVar;
        this.f71662b = guVar;
        this.f71665e = aVar;
        this.f71666f = eVar;
        this.f71667g = mVar;
        this.f71668h = dVar;
        this.f71669i = dhVar;
        this.f71664d = C26403v.f71834a.equals(vVar);
        this.f71670j = new C26354ap(fragment.getLayoutInflater(), abVar, i);
    }

    public final int getItemCount() {
        C26405x xVar = C26405x.LOADING;
        int ordinal = this.f71661a.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            throw new AssertionError();
        } else if (ordinal == 2) {
            return this.f71662b.size();
        } else {
            throw new AssertionError();
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        ((C26378x) ghVar).mo31573b((C26404w) this.f71662b.get(i), this.f71663c.mo31603c(), this.f71664d, i, this.f71662b.size(), this.f71668h, this.f71665e, this.f71667g, this.f71669i);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C26378x(viewGroup, this.f71670j, this.f71666f, (C26353ao) null);
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        ((C26378x) ghVar).mo31534a();
    }
}
