package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8074c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8073b.C103417f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.c.q */
/* compiled from: PG */
final class C103434q extends C103429l {

    /* renamed from: a */
    private final C103417f f288291a;

    /* renamed from: c */
    private final Context f288292c;

    public C103434q(C22945j jVar, C103417f fVar, Context context) {
        super(jVar, context);
        this.f288291a = fVar;
        this.f288292c = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo93783e() {
        return false;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f288292c).inflate(R.layout.nga_half_shelf_text, (ViewGroup) null, false);
        mo28295iC(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.nga_half_shelf_text);
        C23251a aVar = ((C103432o) this.f288291a).f288288a;
        Objects.requireNonNull(textView);
        aVar.mo28726b(new C103433p(textView));
    }
}
